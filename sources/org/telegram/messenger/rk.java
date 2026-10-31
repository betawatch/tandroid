package org.telegram.messenger;

import android.content.SharedPreferences;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class rk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rk(int i10, int i11, long j10, Object obj, Object obj2) {
        this.a = i11;
        this.b = obj;
        this.e = obj2;
        this.c = j10;
        this.d = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017f  */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLiteCursor sQLiteCursor;
        boolean z10;
        SQLiteDatabase sQLiteDatabase;
        long j10;
        ArrayList<TLRPC.ReactionCount> arrayList;
        ?? r92;
        SQLiteCursor queryFinalized;
        int i10;
        NativeByteBuffer byteBufferValue;
        rk rkVar = this;
        hs hsVar = (hs) rkVar.b;
        TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) rkVar.e;
        try {
            long e = hsVar.getUserConfig().e();
            hsVar.b.beginTransaction();
            long j11 = 0;
            int i11 = 0;
            TLRPC.TL_messageReactions tL_messageReactions2 = null;
            while (true) {
                j10 = rkVar.c;
                if (i11 >= 2) {
                    break;
                }
                int i12 = rkVar.d;
                if (i11 == 0) {
                    SQLiteDatabase sQLiteDatabase2 = hsVar.b;
                    Locale locale = Locale.US;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_v2 WHERE mid = " + i12 + " AND uid = " + j10, new Object[0]);
                    r92 = 0;
                } else {
                    SQLiteDatabase sQLiteDatabase3 = hsVar.b;
                    Locale locale2 = Locale.US;
                    r92 = 0;
                    queryFinalized = sQLiteDatabase3.queryFinalized("SELECT data FROM messages_topics WHERE mid = " + i12 + " AND uid = " + j10, new Object[0]);
                }
                SQLiteCursor sQLiteCursor2 = queryFinalized;
                try {
                    if (!sQLiteCursor2.next() || (byteBufferValue = sQLiteCursor2.byteBufferValue(r92)) == 0) {
                        i10 = i11;
                    } else {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r92), r92);
                        if (TLdeserialize != null) {
                            i10 = i11;
                            TLdeserialize.readAttachPath(byteBufferValue, hsVar.getUserConfig().n);
                            byteBufferValue.reuse();
                            if (tL_messageReactions2 == null) {
                                tL_messageReactions2 = TLdeserialize.reactions;
                                j11 = jj.R1(e, TLdeserialize);
                            }
                            jj.d6(TLdeserialize, tL_messageReactions);
                            SQLitePreparedStatement executeFast = i10 == 0 ? hsVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?") : hsVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                            jj.q5(TLdeserialize);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                            TLdeserialize.serializeToStream(nativeByteBuffer);
                            executeFast.requery();
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindInteger(2, i12);
                            executeFast.bindLong(3, j10);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                            if (e == j10) {
                                SQLiteDatabase sQLiteDatabase4 = hsVar.b;
                                Locale locale3 = Locale.US;
                                sQLiteDatabase4.executeFast("DELETE FROM tag_message_id WHERE mid = " + TLdeserialize.id).stepThis().dispose();
                                SQLitePreparedStatement executeFast2 = hsVar.b.executeFast("REPLACE INTO tag_message_id VALUES(?, ?, ?, ?)");
                                hsVar.g(executeFast2, TLdeserialize);
                                executeFast2.dispose();
                            }
                        } else {
                            i10 = i11;
                            byteBufferValue.reuse();
                        }
                    }
                    sQLiteCursor2.dispose();
                    i11 = i10 + 1;
                    rkVar = this;
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = sQLiteCursor2;
                    z10 = true;
                    try {
                        hsVar.o(e, z10);
                        SQLiteDatabase sQLiteDatabase5 = hsVar.b;
                        if (sQLiteDatabase5 != null) {
                            sQLiteDatabase5.commitTransaction();
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = hsVar.b;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor = sQLiteCursor2;
                    sQLiteDatabase = hsVar.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            }
            hsVar.b.commitTransaction();
            if (j10 == e && tL_messageReactions2 != null && (arrayList = tL_messageReactions2.results) != null && (!arrayList.isEmpty() || tL_messageReactions == null || !tL_messageReactions.results.isEmpty())) {
                i0.g3(new wm(hsVar, tL_messageReactions2, tL_messageReactions, j11, 10));
            }
            SQLiteDatabase sQLiteDatabase6 = hsVar.b;
            if (sQLiteDatabase6 != null) {
                sQLiteDatabase6.commitTransaction();
            }
        } catch (Exception e10) {
            e = e10;
            z10 = true;
            sQLiteCursor = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = null;
        }
    }

    private final void b() {
        h00 h00Var = (h00) this.b;
        hs hsVar = (hs) this.e;
        long j10 = this.c;
        int i10 = this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase = hsVar.b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j10 + " AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, d20.i(i10).n);
                    byteBufferValue.reuse();
                    if (jj.K3(TLdeserialize)) {
                        TLdeserialize.id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j10;
                        jj jjVar = new jj(i10, TLdeserialize, false, true);
                        arrayList.add(jjVar);
                        arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j10 + "_" + arrayList.size(), jjVar.z1(true), jjVar.x1(true), null, null, null, null, null), arrayList2.size()));
                    }
                }
            }
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e) {
            f8.g(e, true);
        }
        i0.g3(new d2(h00Var, i10, j10, arrayList, arrayList2, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d6  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long[] jArr;
        long j10;
        e2 e2Var;
        int i10;
        long[] jArr2;
        long j11;
        final long j12;
        long j13;
        e2 e2Var2;
        int i11;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteCursor queryFinalized;
        TLRPC.Chat chat;
        NativeByteBuffer byteBufferValue;
        TLRPC.Chat P;
        TLRPC.User k02;
        int i12 = this.a;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        SQLiteCursor sQLiteCursor = null;
        r7 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        int i13 = this.d;
        long j14 = this.c;
        int i14 = 0;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                TLRPC.TL_sendMessageTextDraftAction tL_sendMessageTextDraftAction = (TLRPC.TL_sendMessageTextDraftAction) obj;
                final j2 b10 = j2.b(((vp) obj2).currentAccount);
                l2.f fVar = b10.a;
                long j15 = tL_sendMessageTextDraftAction.random_id;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_sendMessageTextDraftAction.text;
                boolean z10 = tL_sendMessageTextDraftAction.can_stop;
                boolean z11 = tL_sendMessageTextDraftAction.keep_on_stop;
                StringBuilder sb2 = new StringBuilder("[BotForum] onDraftNewDraft ");
                final long j16 = this.c;
                sb2.append(j16);
                sb2.append(" ");
                int i15 = this.d;
                sb2.append(i15);
                sb2.append(" ");
                sb2.append(j15);
                f8.b(sb2.toString());
                long j17 = i15;
                LongSparseArray s10 = b10.b.s(j16, j17);
                if ((s10 == null ? null : s10.get(j15)) != null) {
                    f8.b("[BotForum] onDraftNewDraft ignore " + j16 + " " + i15 + " " + j15);
                    return;
                }
                LongSparseArray s11 = fVar.s(j16, j17);
                if (s11 == null || s11.size() <= 0) {
                    jArr = null;
                } else {
                    long[] jArr3 = new long[s11.size()];
                    int size = s11.size();
                    for (int i16 = 0; i16 < size; i16++) {
                        jArr3[i16] = s11.keyAt(i16);
                    }
                    jArr = jArr3;
                }
                LongSparseArray s12 = fVar.s(j16, j17);
                e2 e2Var3 = (e2) (s12 == null ? null : s12.get(j15));
                if (e2Var3 == null) {
                    e2Var = new e2(j15, b10.getUserConfig().j());
                    j10 = j15;
                    b10.a.O(j16, j17, j10, e2Var);
                } else {
                    j10 = j15;
                    e2Var = e2Var3;
                }
                e2Var.d = z11;
                e2Var.c = z10;
                if (jArr != null) {
                    int length = jArr.length;
                    int i17 = 0;
                    while (i17 < length) {
                        long j18 = jArr[i17];
                        if (j18 == j10) {
                            i10 = i15;
                        } else {
                            Runnable runnable = ((e2) s11.get(j18)).f;
                            if (runnable != null) {
                                i0.r(runnable);
                            }
                            long j19 = j16;
                            int i18 = i15;
                            b10.e(j19, i18, j18);
                            i10 = i18;
                            j16 = j19;
                        }
                        i17++;
                        i15 = i10;
                    }
                }
                final int i19 = i15;
                Runnable runnable2 = e2Var.f;
                if (runnable2 != null) {
                    i0.r(runnable2);
                }
                final long j20 = j10;
                final int i20 = 1;
                e2Var.f = new Runnable() { // from class: org.telegram.messenger.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i20) {
                            case 0:
                                b10.e(j16, i19, j20);
                                break;
                            default:
                                b10.e(j16, i19, j20);
                                break;
                        }
                    }
                };
                e2Var.g = tL_textWithEntities;
                int i21 = e2Var.b;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.dialog_id = j16;
                tL_message.peer_id = b10.getMessagesController().y1(j16);
                tL_message.from_id = b10.getMessagesController().y1(j16);
                tL_message.local_id = i21;
                tL_message.id = i21;
                tL_message.random_id = j20;
                tL_message.message = tL_textWithEntities.text;
                tL_message.entities = tL_textWithEntities.entities;
                tL_message.flags |= 128;
                tL_message.date = b10.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                tL_message.flags |= 16;
                tL_messageReplyHeader.forum_topic = true;
                tL_messageReplyHeader.reply_to_top_id = i19;
                tL_messageReplyHeader.flags |= 2;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.flags |= 512;
                jj jjVar = new jj(b10.currentAccount, tL_message, false, true);
                jjVar.W1 = true;
                jjVar.Q1 = false;
                e2Var.h = jjVar;
                i0.h3(e2Var.f, b10.getAppGlobalConfig().v.a(TimeUnit.MILLISECONDS));
                b10.getNotificationCenter().k(zs.K5, new g2(j16, j17, e2Var.h));
                return;
            case 1:
                TLRPC.TL_sendMessageRichMessageDraftAction tL_sendMessageRichMessageDraftAction = (TLRPC.TL_sendMessageRichMessageDraftAction) obj;
                final j2 b11 = j2.b(((vp) obj2).currentAccount);
                l2.f fVar2 = b11.a;
                long j21 = tL_sendMessageRichMessageDraftAction.random_id;
                TL_iv.RichMessage richMessage = tL_sendMessageRichMessageDraftAction.rich_message;
                boolean z12 = tL_sendMessageRichMessageDraftAction.can_stop;
                boolean z13 = tL_sendMessageRichMessageDraftAction.keep_on_stop;
                StringBuilder sb3 = new StringBuilder("[BotForum] onDraftNewDraft (rich_message) ");
                long j22 = this.c;
                sb3.append(j22);
                sb3.append(" ");
                int i22 = this.d;
                sb3.append(i22);
                sb3.append(" ");
                sb3.append(j21);
                f8.b(sb3.toString());
                long j23 = i22;
                LongSparseArray s13 = b11.b.s(j22, j23);
                if ((s13 == null ? null : s13.get(j21)) != null) {
                    f8.b("[BotForum] onDraftNewDraft (rich_message) ignore " + j22 + " " + i22 + " " + j21);
                    return;
                }
                LongSparseArray s14 = fVar2.s(j22, j23);
                if (s14 == null || s14.size() <= 0) {
                    jArr2 = null;
                } else {
                    long[] jArr4 = new long[s14.size()];
                    int size2 = s14.size();
                    for (int i23 = 0; i23 < size2; i23++) {
                        jArr4[i23] = s14.keyAt(i23);
                    }
                    jArr2 = jArr4;
                }
                LongSparseArray s15 = fVar2.s(j22, j23);
                e2 e2Var4 = (e2) (s15 == null ? null : s15.get(j21));
                if (e2Var4 == null) {
                    e2Var2 = new e2(j21, b11.getUserConfig().j());
                    j11 = j21;
                    j12 = j22;
                    b11.a.O(j12, j23, j11, e2Var2);
                    j13 = j23;
                } else {
                    j11 = j21;
                    j12 = j22;
                    j13 = j23;
                    e2Var2 = e2Var4;
                }
                e2Var2.d = z13;
                e2Var2.c = z12;
                if (jArr2 != null) {
                    int length2 = jArr2.length;
                    int i24 = 0;
                    while (i24 < length2) {
                        long j24 = jArr2[i24];
                        if (j24 == j11) {
                            i11 = i22;
                        } else {
                            Runnable runnable3 = ((e2) s14.get(j24)).f;
                            if (runnable3 != null) {
                                i0.r(runnable3);
                            }
                            long j25 = j12;
                            int i25 = i22;
                            b11.e(j25, i25, j24);
                            i11 = i25;
                            j12 = j25;
                        }
                        i24++;
                        i22 = i11;
                    }
                }
                final int i26 = i22;
                Runnable runnable4 = e2Var2.f;
                if (runnable4 != null) {
                    i0.r(runnable4);
                }
                final long j26 = j11;
                final int i27 = 0;
                long j27 = j12;
                e2Var2.f = new Runnable() { // from class: org.telegram.messenger.b2
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i27) {
                            case 0:
                                b11.e(j12, i26, j26);
                                break;
                            default:
                                b11.e(j12, i26, j26);
                                break;
                        }
                    }
                };
                int i28 = e2Var2.b;
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.dialog_id = j27;
                tL_message2.peer_id = b11.getMessagesController().y1(j27);
                tL_message2.from_id = b11.getMessagesController().y1(j27);
                tL_message2.local_id = i28;
                tL_message2.id = i28;
                tL_message2.random_id = j26;
                tL_message2.message = "";
                tL_message2.flags |= TLObject.FLAG_13;
                tL_message2.rich_message = richMessage;
                tL_message2.date = b11.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
                tL_message2.reply_to = tL_messageReplyHeader2;
                tL_message2.flags |= 16;
                tL_messageReplyHeader2.forum_topic = true;
                tL_messageReplyHeader2.reply_to_top_id = i26;
                tL_messageReplyHeader2.flags |= 2;
                tL_message2.media = new TLRPC.TL_messageMediaEmpty();
                tL_message2.flags |= 512;
                jj jjVar2 = new jj(b11.currentAccount, tL_message2, false, true);
                jjVar2.W1 = true;
                jjVar2.Q1 = false;
                e2Var2.h = jjVar2;
                i0.h3(e2Var2.f, b11.getAppGlobalConfig().v.a(TimeUnit.MILLISECONDS));
                b11.getNotificationCenter().k(zs.K5, new g2(j12, j13, e2Var2.h));
                return;
            case 2:
                ui uiVar = (ui) obj2;
                TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) obj;
                try {
                    if (tL_attachMenuBots != null) {
                        uiVar.getMessagesStorage().b.executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
                        SQLitePreparedStatement executeFast = uiVar.getMessagesStorage().b.executeFast("REPLACE INTO attach_menu_bots VALUES(?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_attachMenuBots.getObjectSize());
                        tL_attachMenuBots.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindLong(2, j14);
                        executeFast.bindInteger(3, i13);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = uiVar.getMessagesStorage().b.executeFast("UPDATE attach_menu_bots SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindLong(1, i13);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 3:
                ui uiVar2 = (ui) obj2;
                if (((ArrayList) obj) != null && j14 != 0) {
                    uiVar2.X[i13] = j14;
                }
                uiVar2.a1(i13, false, false);
                return;
            case 4:
                vp vpVar = (vp) obj2;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                vpVar.N7 = vpVar.getConnectionsManager().getCurrentTime();
                TLRPC.Dialog dialog = vpVar.x2;
                long j28 = this.c;
                if (dialog != null && j28 != dialog.id) {
                    vpVar.g4();
                }
                vpVar.x2 = (TLRPC.Dialog) vpVar.Q.f(j28);
                vpVar.U3 = new HashSet(tL_help_promoData.pending_suggestions);
                vpVar.V3 = new HashSet(tL_help_promoData.dismissed_suggestions);
                vpVar.W3 = tL_help_promoData.custom_pending_suggestion;
                vpVar.getNotificationCenter().k(zs.s1, new Object[0]);
                SharedPreferences.Editor edit = vpVar.f7.edit();
                edit.putStringSet("pendingSuggestions", vpVar.U3);
                edit.putStringSet("dismissedSuggestions", vpVar.V3);
                edit.commit();
                if (vpVar.x2 != null) {
                    vpVar.u2 = false;
                    vpVar.Q4(null);
                    vpVar.getNotificationCenter().k(3, Boolean.TRUE);
                    return;
                }
                a0.h hVar = new a0.h();
                a0.h hVar2 = new a0.h();
                for (int i29 = 0; i29 < tL_help_promoData.users.size(); i29++) {
                    TLRPC.User user = tL_help_promoData.users.get(i29);
                    hVar.k(user, user.id);
                }
                for (int i30 = 0; i30 < tL_help_promoData.chats.size(); i30++) {
                    TLRPC.Chat chat2 = tL_help_promoData.chats.get(i30);
                    hVar2.k(chat2, chat2.id);
                }
                TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                TLRPC.Peer peer = tL_help_promoData.peer;
                if (peer == null) {
                    TLRPC.Dialog dialog2 = vpVar.x2;
                    if (dialog2 != null) {
                        long j29 = dialog2.id;
                        if (j29 < 0) {
                            TLRPC.Chat L0 = vpVar.L0(Long.valueOf(-j29));
                            if (w3.r0(L0) || L0.restricted) {
                                vpVar.c4(vpVar.x2);
                            }
                        } else {
                            vpVar.c4(dialog2);
                        }
                        vpVar.x2 = null;
                        vpVar.Q4(null);
                        vpVar.getNotificationCenter().k(3, new Object[0]);
                        return;
                    }
                    return;
                }
                if (peer.user_id != 0) {
                    TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                    tL_inputDialogPeer.peer = tL_inputPeerUser;
                    long j30 = tL_help_promoData.peer.user_id;
                    tL_inputPeerUser.user_id = j30;
                    TLRPC.User user2 = (TLRPC.User) hVar.f(j30);
                    if (user2 != null) {
                        tL_inputDialogPeer.peer.access_hash = user2.access_hash;
                    }
                } else if (peer.chat_id != 0) {
                    TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputDialogPeer.peer = tL_inputPeerChat;
                    long j31 = tL_help_promoData.peer.chat_id;
                    tL_inputPeerChat.chat_id = j31;
                    TLRPC.Chat chat3 = (TLRPC.Chat) hVar2.f(j31);
                    if (chat3 != null) {
                        tL_inputDialogPeer.peer.access_hash = chat3.access_hash;
                    }
                } else {
                    TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                    tL_inputDialogPeer.peer = tL_inputPeerChannel;
                    long j32 = tL_help_promoData.peer.channel_id;
                    tL_inputPeerChannel.channel_id = j32;
                    TLRPC.Chat chat4 = (TLRPC.Chat) hVar2.f(j32);
                    if (chat4 != null) {
                        tL_inputDialogPeer.peer.access_hash = chat4.access_hash;
                    }
                }
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                vpVar.v2 = vpVar.getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new k3(this.d, 2, j28, vpVar, tL_help_promoData));
                return;
            case 5:
                hs hsVar = (hs) obj2;
                String str = (String) obj;
                hsVar.getClass();
                try {
                    try {
                    } catch (Exception e7) {
                        hsVar.o(e7, true);
                        if (0 == 0) {
                            return;
                        }
                    }
                    if (!str.isEmpty()) {
                        sQLitePreparedStatement2 = hsVar.b.executeFast("REPLACE INTO widget_state VALUES(?, ?, ?)");
                        sQLitePreparedStatement2.bindLong(1, j14);
                        sQLitePreparedStatement2.bindInteger(2, i13);
                        sQLitePreparedStatement2.bindString(3, str);
                        sQLitePreparedStatement2.step();
                        sQLitePreparedStatement2.dispose();
                        return;
                    }
                    SQLiteDatabase sQLiteDatabase = hsVar.b;
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM widget_state WHERE uid = " + j14 + " AND mid = " + i13).stepThis().dispose();
                    return;
                } finally {
                    if (0 != 0) {
                        sQLitePreparedStatement2.dispose();
                    }
                }
            case 6:
                ((hs) obj2).getMessagesController().r7.D(j14, (TLRPC.TL_forumTopic) obj, i13);
                return;
            case 7:
                hs hsVar2 = (hs) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                try {
                    try {
                        hsVar2.b.beginTransaction();
                        TLRPC.TL_message e02 = hsVar2.e0(i13, j14);
                        e02.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                        e02.voiceTranscriptionRated = message.voiceTranscriptionRated;
                        e02.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                        e02.voiceTranscriptionForce = message.voiceTranscriptionForce;
                        e02.voiceTranscriptionId = message.voiceTranscriptionId;
                        while (i14 < 2) {
                            SQLitePreparedStatement executeFast3 = i14 == 0 ? hsVar2.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : hsVar2.b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            try {
                                executeFast3.requery();
                                NativeByteBuffer c10 = xi.c(e02);
                                if (c10 != null) {
                                    executeFast3.bindByteBuffer(1, c10);
                                } else {
                                    executeFast3.bindNull(1);
                                }
                                executeFast3.bindInteger(2, i13);
                                executeFast3.bindLong(3, j14);
                                executeFast3.step();
                                executeFast3.dispose();
                                if (c10 != null) {
                                    c10.reuse();
                                }
                                i14++;
                            } catch (Exception e10) {
                                e = e10;
                                sQLitePreparedStatement3 = executeFast3;
                                hsVar2.o(e, true);
                                SQLiteDatabase sQLiteDatabase2 = hsVar2.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLitePreparedStatement3 != null) {
                                    sQLitePreparedStatement3.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLitePreparedStatement3 = executeFast3;
                                SQLiteDatabase sQLiteDatabase3 = hsVar2.b;
                                if (sQLiteDatabase3 != null) {
                                    sQLiteDatabase3.commitTransaction();
                                }
                                if (sQLitePreparedStatement3 != null) {
                                    sQLitePreparedStatement3.dispose();
                                }
                                throw th;
                            }
                        }
                        hsVar2.b.commitTransaction();
                        SQLiteDatabase sQLiteDatabase4 = hsVar2.b;
                        if (sQLiteDatabase4 != null) {
                            sQLiteDatabase4.commitTransaction();
                            return;
                        }
                        return;
                    } catch (Exception e11) {
                        e = e11;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            case 8:
                hs hsVar3 = (hs) obj2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj;
                hsVar3.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase5 = hsVar3.b;
                    Locale locale2 = Locale.US;
                    queryFinalized = sQLiteDatabase5.queryFinalized("SELECT data FROM chats WHERE uid = " + j14, new Object[0]);
                } catch (Exception e12) {
                    e = e12;
                    sQLitePreparedStatement = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement = null;
                }
                try {
                    if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                        chat = null;
                    } else {
                        chat = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                        byteBufferValue.reuse();
                    }
                    queryFinalized.dispose();
                    if (chat != null) {
                        if (chat.default_banned_rights == null || i13 >= chat.version) {
                            chat.default_banned_rights = tL_chatBannedRights;
                            chat.flags |= 262144;
                            chat.version = i13;
                            sQLitePreparedStatement = hsVar3.b.executeFast("UPDATE chats SET data = ? WHERE uid = ?");
                            try {
                                try {
                                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(chat.getObjectSize());
                                    chat.serializeToStream(nativeByteBuffer2);
                                    sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer2);
                                    sQLitePreparedStatement.bindLong(2, chat.id);
                                    sQLitePreparedStatement.step();
                                    nativeByteBuffer2.reuse();
                                    sQLitePreparedStatement.dispose();
                                    return;
                                } catch (Exception e13) {
                                    e = e13;
                                    hsVar3.o(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                        return;
                                    }
                                    return;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                if (sQLitePreparedStatement != null) {
                                    sQLitePreparedStatement.dispose();
                                }
                                throw th;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception e14) {
                    e = e14;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLiteCursor = queryFinalized;
                    sQLitePreparedStatement = null;
                    if (sQLiteCursor != null) {
                    }
                    if (sQLitePreparedStatement != null) {
                    }
                    throw th;
                }
                break;
            case 9:
                a();
                return;
            case 10:
                qz qzVar = (qz) obj2;
                byte[] bArr = (byte[]) obj;
                StringBuilder sb4 = new StringBuilder();
                long j33 = this.c;
                sb4.append(j33);
                sb4.append("_");
                int i31 = this.d;
                sb4.append(i31);
                sb4.append("_");
                sb4.append(Utilities.f(bArr));
                sb4.append("_0");
                String sb5 = sb4.toString();
                qzVar.r.put(sb5, Boolean.TRUE);
                HashMap hashMap = qzVar.s;
                List list = (List) hashMap.get(j33 + "_" + i31);
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(j33 + "_" + i31, list);
                }
                list.add(sb5);
                if (!o5.E(j33)) {
                    long j34 = -j33;
                    if (qzVar.getMessagesController().L0(Long.valueOf(j34)) == null && (P = qzVar.getMessagesStorage().P(j34)) != null) {
                        qzVar.getMessagesController().N3(P, true);
                    }
                } else if (qzVar.getMessagesController().Z1(Long.valueOf(j33)) == null && (k02 = qzVar.getMessagesStorage().k0(j33)) != null) {
                    qzVar.getMessagesController().U3(k02, true, false);
                }
                TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
                tL_messages_getBotCallbackAnswer.peer = qzVar.getMessagesController().i1(j33);
                tL_messages_getBotCallbackAnswer.msg_id = i31;
                tL_messages_getBotCallbackAnswer.game = false;
                if (bArr != null) {
                    tL_messages_getBotCallbackAnswer.flags |= 1;
                    tL_messages_getBotCallbackAnswer.data = bArr;
                }
                qzVar.getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, new ci(qzVar, sb5, list, 9), 2);
                qzVar.getMessagesController().h3(j33, i31, i31, 0, false, 0L, 0, true, 0);
                return;
            case 11:
                b();
                return;
            default:
                t10 t10Var = (t10) obj2;
                jj jjVar3 = (jj) obj;
                t10Var.getClass();
                jjVar3.k.originalLanguage = "und";
                t10Var.getMessagesStorage().X1(j14, jjVar3.k);
                t10Var.w.remove(Integer.valueOf(i13));
                return;
        }
    }

    public /* synthetic */ rk(f1 f1Var, long j10, int i10, Object obj, int i11) {
        this.a = i11;
        this.b = f1Var;
        this.c = j10;
        this.d = i10;
        this.e = obj;
    }

    public /* synthetic */ rk(f1 f1Var, long j10, TLObject tLObject, int i10, int i11) {
        this.a = i11;
        this.b = f1Var;
        this.c = j10;
        this.e = tLObject;
        this.d = i10;
    }

    public /* synthetic */ rk(hs hsVar, int i10, long j10, TLObject tLObject, int i11) {
        this.a = i11;
        this.b = hsVar;
        this.d = i10;
        this.c = j10;
        this.e = tLObject;
    }
}
