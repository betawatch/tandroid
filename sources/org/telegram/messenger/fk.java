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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class fk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ fk(int i7, int i10, long j3, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.e = obj2;
        this.c = j3;
        this.d = i7;
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
        long j3;
        ArrayList<TLRPC.ReactionCount> arrayList;
        ?? r92;
        SQLiteCursor queryFinalized;
        int i7;
        NativeByteBuffer byteBufferValue;
        fk fkVar = this;
        ur urVar = (ur) fkVar.b;
        TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) fkVar.e;
        try {
            long e10 = urVar.getUserConfig().e();
            urVar.b.beginTransaction();
            long j10 = 0;
            int i10 = 0;
            TLRPC.TL_messageReactions tL_messageReactions2 = null;
            while (true) {
                j3 = fkVar.c;
                if (i10 >= 2) {
                    break;
                }
                int i11 = fkVar.d;
                if (i10 == 0) {
                    SQLiteDatabase sQLiteDatabase2 = urVar.b;
                    Locale locale = Locale.US;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_v2 WHERE mid = " + i11 + " AND uid = " + j3, new Object[0]);
                    r92 = 0;
                } else {
                    SQLiteDatabase sQLiteDatabase3 = urVar.b;
                    Locale locale2 = Locale.US;
                    r92 = 0;
                    queryFinalized = sQLiteDatabase3.queryFinalized("SELECT data FROM messages_topics WHERE mid = " + i11 + " AND uid = " + j3, new Object[0]);
                }
                SQLiteCursor sQLiteCursor2 = queryFinalized;
                try {
                    if (!sQLiteCursor2.next() || (byteBufferValue = sQLiteCursor2.byteBufferValue(r92)) == 0) {
                        i7 = i10;
                    } else {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r92), r92);
                        if (TLdeserialize != null) {
                            i7 = i10;
                            TLdeserialize.readAttachPath(byteBufferValue, urVar.getUserConfig().n);
                            byteBufferValue.reuse();
                            if (tL_messageReactions2 == null) {
                                tL_messageReactions2 = TLdeserialize.reactions;
                                j10 = gj.Q1(e10, TLdeserialize);
                            }
                            gj.f6(TLdeserialize, tL_messageReactions);
                            SQLitePreparedStatement executeFast = i7 == 0 ? urVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?") : urVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                            gj.q5(TLdeserialize);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                            TLdeserialize.serializeToStream(nativeByteBuffer);
                            executeFast.requery();
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindInteger(2, i11);
                            executeFast.bindLong(3, j3);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                            if (e10 == j3) {
                                SQLiteDatabase sQLiteDatabase4 = urVar.b;
                                Locale locale3 = Locale.US;
                                sQLiteDatabase4.executeFast("DELETE FROM tag_message_id WHERE mid = " + TLdeserialize.id).stepThis().dispose();
                                SQLitePreparedStatement executeFast2 = urVar.b.executeFast("REPLACE INTO tag_message_id VALUES(?, ?, ?, ?)");
                                urVar.g(executeFast2, TLdeserialize);
                                executeFast2.dispose();
                            }
                        } else {
                            i7 = i10;
                            byteBufferValue.reuse();
                        }
                    }
                    sQLiteCursor2.dispose();
                    i10 = i7 + 1;
                    fkVar = this;
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = sQLiteCursor2;
                    z10 = true;
                    try {
                        urVar.o(e, z10);
                        SQLiteDatabase sQLiteDatabase5 = urVar.b;
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
                        sQLiteDatabase = urVar.b;
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
                    sQLiteDatabase = urVar.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            }
            urVar.b.commitTransaction();
            if (j3 == e10 && tL_messageReactions2 != null && (arrayList = tL_messageReactions2.results) != null && (!arrayList.isEmpty() || tL_messageReactions == null || !tL_messageReactions.results.isEmpty())) {
                g0.g3(new gm(urVar, tL_messageReactions2, tL_messageReactions, j10, 9));
            }
            SQLiteDatabase sQLiteDatabase6 = urVar.b;
            if (sQLiteDatabase6 != null) {
                sQLiteDatabase6.commitTransaction();
            }
        } catch (Exception e12) {
            e = e12;
            z10 = true;
            sQLiteCursor = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = null;
        }
    }

    private final void b() {
        rz rzVar = (rz) this.b;
        ur urVar = (ur) this.e;
        long j3 = this.c;
        int i7 = this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase = urVar.b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j3 + " AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, k10.i(i7).n);
                    byteBufferValue.reuse();
                    if (gj.K3(TLdeserialize)) {
                        TLdeserialize.id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j3;
                        gj gjVar = new gj(i7, TLdeserialize, false, true);
                        arrayList.add(gjVar);
                        arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j3 + "_" + arrayList.size(), gjVar.y1(true), gjVar.w1(true), null, null, null, null, null), arrayList2.size()));
                    }
                }
            }
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.g3(new z1(rzVar, i7, j3, arrayList, arrayList2, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0234  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long[] jArr;
        long j3;
        a2 a2Var;
        int i7;
        long[] jArr2;
        long j10;
        final long j11;
        long j12;
        a2 a2Var2;
        int i10;
        SQLitePreparedStatement sQLitePreparedStatement;
        TLRPC.Chat chat;
        NativeByteBuffer byteBufferValue;
        TLRPC.Chat P;
        TLRPC.User k02;
        int i11 = this.a;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r7 = null;
        r7 = null;
        r7 = null;
        SQLiteCursor sQLiteCursor = null;
        SQLitePreparedStatement sQLitePreparedStatement4 = null;
        int i12 = this.d;
        long j13 = this.c;
        int i13 = 0;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                TLRPC.TL_sendMessageTextDraftAction tL_sendMessageTextDraftAction = (TLRPC.TL_sendMessageTextDraftAction) obj;
                final f2 b10 = f2.b(((np) obj2).currentAccount);
                hi.t5 t5Var = b10.a;
                long j14 = tL_sendMessageTextDraftAction.random_id;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_sendMessageTextDraftAction.text;
                boolean z10 = tL_sendMessageTextDraftAction.can_stop;
                boolean z11 = tL_sendMessageTextDraftAction.keep_on_stop;
                StringBuilder sb2 = new StringBuilder("[BotForum] onDraftNewDraft ");
                final long j15 = this.c;
                sb2.append(j15);
                sb2.append(" ");
                int i14 = this.d;
                sb2.append(i14);
                sb2.append(" ");
                sb2.append(j14);
                a8.b(sb2.toString());
                long j16 = i14;
                LongSparseArray p10 = b10.b.p(j15, j16);
                if ((p10 == null ? null : p10.get(j14)) != null) {
                    a8.b("[BotForum] onDraftNewDraft ignore " + j15 + " " + i14 + " " + j14);
                    return;
                }
                LongSparseArray p11 = t5Var.p(j15, j16);
                if (p11 == null || p11.size() <= 0) {
                    jArr = null;
                } else {
                    long[] jArr3 = new long[p11.size()];
                    int size = p11.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        jArr3[i15] = p11.keyAt(i15);
                    }
                    jArr = jArr3;
                }
                LongSparseArray p12 = t5Var.p(j15, j16);
                a2 a2Var3 = (a2) (p12 == null ? null : p12.get(j14));
                if (a2Var3 == null) {
                    a2Var = new a2(j14, b10.getUserConfig().j());
                    j3 = j14;
                    b10.a.w(j15, j16, j3, a2Var);
                } else {
                    j3 = j14;
                    a2Var = a2Var3;
                }
                a2Var.d = z11;
                a2Var.c = z10;
                if (jArr != null) {
                    int length = jArr.length;
                    int i16 = 0;
                    while (i16 < length) {
                        long j17 = jArr[i16];
                        if (j17 == j3) {
                            i7 = i14;
                        } else {
                            Runnable runnable = ((a2) p11.get(j17)).f;
                            if (runnable != null) {
                                g0.r(runnable);
                            }
                            long j18 = j15;
                            int i17 = i14;
                            b10.e(j18, i17, j17);
                            i7 = i17;
                            j15 = j18;
                        }
                        i16++;
                        i14 = i7;
                    }
                }
                final int i18 = i14;
                Runnable runnable2 = a2Var.f;
                if (runnable2 != null) {
                    g0.r(runnable2);
                }
                final long j19 = j3;
                final int i19 = 1;
                a2Var.f = new Runnable() { // from class: org.telegram.messenger.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                b10.e(j15, i18, j19);
                                break;
                            default:
                                b10.e(j15, i18, j19);
                                break;
                        }
                    }
                };
                a2Var.g = tL_textWithEntities;
                int i20 = a2Var.b;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.dialog_id = j15;
                tL_message.peer_id = b10.getMessagesController().B1(j15);
                tL_message.from_id = b10.getMessagesController().B1(j15);
                tL_message.local_id = i20;
                tL_message.id = i20;
                tL_message.random_id = j19;
                tL_message.message = tL_textWithEntities.text;
                tL_message.entities = tL_textWithEntities.entities;
                tL_message.flags |= 128;
                tL_message.date = b10.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                tL_message.flags |= 16;
                tL_messageReplyHeader.forum_topic = true;
                tL_messageReplyHeader.reply_to_top_id = i18;
                tL_messageReplyHeader.flags |= 2;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.flags |= 512;
                gj gjVar = new gj(b10.currentAccount, tL_message, false, true);
                gjVar.Y1 = true;
                gjVar.S1 = false;
                a2Var.h = gjVar;
                g0.h3(a2Var.f, b10.getAppGlobalConfig().A.n2(TimeUnit.MILLISECONDS));
                b10.getNotificationCenter().k(ls.N5, new c2(j15, j16, a2Var.h));
                return;
            case 1:
                TLRPC.TL_sendMessageRichMessageDraftAction tL_sendMessageRichMessageDraftAction = (TLRPC.TL_sendMessageRichMessageDraftAction) obj;
                final f2 b11 = f2.b(((np) obj2).currentAccount);
                hi.t5 t5Var2 = b11.a;
                long j20 = tL_sendMessageRichMessageDraftAction.random_id;
                TL_iv.RichMessage richMessage = tL_sendMessageRichMessageDraftAction.rich_message;
                boolean z12 = tL_sendMessageRichMessageDraftAction.can_stop;
                boolean z13 = tL_sendMessageRichMessageDraftAction.keep_on_stop;
                StringBuilder sb3 = new StringBuilder("[BotForum] onDraftNewDraft (rich_message) ");
                long j21 = this.c;
                sb3.append(j21);
                sb3.append(" ");
                int i21 = this.d;
                sb3.append(i21);
                sb3.append(" ");
                sb3.append(j20);
                a8.b(sb3.toString());
                long j22 = i21;
                LongSparseArray p13 = b11.b.p(j21, j22);
                if ((p13 == null ? null : p13.get(j20)) != null) {
                    a8.b("[BotForum] onDraftNewDraft (rich_message) ignore " + j21 + " " + i21 + " " + j20);
                    return;
                }
                LongSparseArray p14 = t5Var2.p(j21, j22);
                if (p14 == null || p14.size() <= 0) {
                    jArr2 = null;
                } else {
                    long[] jArr4 = new long[p14.size()];
                    int size2 = p14.size();
                    for (int i22 = 0; i22 < size2; i22++) {
                        jArr4[i22] = p14.keyAt(i22);
                    }
                    jArr2 = jArr4;
                }
                LongSparseArray p15 = t5Var2.p(j21, j22);
                a2 a2Var4 = (a2) (p15 == null ? null : p15.get(j20));
                if (a2Var4 == null) {
                    a2Var2 = new a2(j20, b11.getUserConfig().j());
                    j10 = j20;
                    j11 = j21;
                    b11.a.w(j11, j22, j10, a2Var2);
                    j12 = j22;
                } else {
                    j10 = j20;
                    j11 = j21;
                    j12 = j22;
                    a2Var2 = a2Var4;
                }
                a2Var2.d = z13;
                a2Var2.c = z12;
                if (jArr2 != null) {
                    int length2 = jArr2.length;
                    int i23 = 0;
                    while (i23 < length2) {
                        long j23 = jArr2[i23];
                        if (j23 == j10) {
                            i10 = i21;
                        } else {
                            Runnable runnable3 = ((a2) p14.get(j23)).f;
                            if (runnable3 != null) {
                                g0.r(runnable3);
                            }
                            long j24 = j11;
                            int i24 = i21;
                            b11.e(j24, i24, j23);
                            i10 = i24;
                            j11 = j24;
                        }
                        i23++;
                        i21 = i10;
                    }
                }
                final int i25 = i21;
                Runnable runnable4 = a2Var2.f;
                if (runnable4 != null) {
                    g0.r(runnable4);
                }
                final long j25 = j10;
                final int i26 = 0;
                long j26 = j11;
                a2Var2.f = new Runnable() { // from class: org.telegram.messenger.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i26) {
                            case 0:
                                b11.e(j11, i25, j25);
                                break;
                            default:
                                b11.e(j11, i25, j25);
                                break;
                        }
                    }
                };
                int i27 = a2Var2.b;
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.dialog_id = j26;
                tL_message2.peer_id = b11.getMessagesController().B1(j26);
                tL_message2.from_id = b11.getMessagesController().B1(j26);
                tL_message2.local_id = i27;
                tL_message2.id = i27;
                tL_message2.random_id = j25;
                tL_message2.message = "";
                tL_message2.flags |= TLObject.FLAG_13;
                tL_message2.rich_message = richMessage;
                tL_message2.date = b11.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
                tL_message2.reply_to = tL_messageReplyHeader2;
                tL_message2.flags |= 16;
                tL_messageReplyHeader2.forum_topic = true;
                tL_messageReplyHeader2.reply_to_top_id = i25;
                tL_messageReplyHeader2.flags |= 2;
                tL_message2.media = new TLRPC.TL_messageMediaEmpty();
                tL_message2.flags |= 512;
                gj gjVar2 = new gj(b11.currentAccount, tL_message2, false, true);
                gjVar2.Y1 = true;
                gjVar2.S1 = false;
                a2Var2.h = gjVar2;
                g0.h3(a2Var2.f, b11.getAppGlobalConfig().A.n2(TimeUnit.MILLISECONDS));
                b11.getNotificationCenter().k(ls.N5, new c2(j11, j12, a2Var2.h));
                return;
            case 2:
                si siVar = (si) obj2;
                TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) obj;
                try {
                    if (tL_attachMenuBots != null) {
                        siVar.getMessagesStorage().b.executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
                        SQLitePreparedStatement executeFast = siVar.getMessagesStorage().b.executeFast("REPLACE INTO attach_menu_bots VALUES(?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_attachMenuBots.getObjectSize());
                        tL_attachMenuBots.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindLong(2, j13);
                        executeFast.bindInteger(3, i12);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = siVar.getMessagesStorage().b.executeFast("UPDATE attach_menu_bots SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindLong(1, i12);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 3:
                si siVar2 = (si) obj2;
                if (((ArrayList) obj) != null && j13 != 0) {
                    siVar2.Y[i12] = j13;
                }
                siVar2.d1(i12, false, false);
                return;
            case 4:
                np npVar = (np) obj2;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                npVar.S7 = npVar.getConnectionsManager().getCurrentTime();
                TLRPC.Dialog dialog = npVar.A2;
                long j27 = this.c;
                if (dialog != null && j27 != dialog.id) {
                    npVar.r4();
                }
                npVar.A2 = (TLRPC.Dialog) npVar.R.f(j27);
                npVar.V3 = new HashSet(tL_help_promoData.pending_suggestions);
                npVar.W3 = new HashSet(tL_help_promoData.dismissed_suggestions);
                npVar.X3 = tL_help_promoData.custom_pending_suggestion;
                npVar.getNotificationCenter().k(ls.s1, new Object[0]);
                SharedPreferences.Editor edit = npVar.h7.edit();
                edit.putStringSet("pendingSuggestions", npVar.V3);
                edit.putStringSet("dismissedSuggestions", npVar.W3);
                edit.commit();
                if (npVar.A2 != null) {
                    npVar.x2 = false;
                    npVar.f5(null);
                    npVar.getNotificationCenter().k(3, Boolean.TRUE);
                    return;
                }
                a0.h hVar = new a0.h();
                a0.h hVar2 = new a0.h();
                for (int i28 = 0; i28 < tL_help_promoData.users.size(); i28++) {
                    TLRPC.User user = tL_help_promoData.users.get(i28);
                    hVar.k(user, user.id);
                }
                for (int i29 = 0; i29 < tL_help_promoData.chats.size(); i29++) {
                    TLRPC.Chat chat2 = tL_help_promoData.chats.get(i29);
                    hVar2.k(chat2, chat2.id);
                }
                TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                TLRPC.Peer peer = tL_help_promoData.peer;
                if (peer == null) {
                    TLRPC.Dialog dialog2 = npVar.A2;
                    if (dialog2 != null) {
                        long j28 = dialog2.id;
                        if (j28 < 0) {
                            TLRPC.Chat O0 = npVar.O0(Long.valueOf(-j28));
                            if (v3.r0(O0) || O0.restricted) {
                                npVar.n4(npVar.A2);
                            }
                        } else {
                            npVar.n4(dialog2);
                        }
                        npVar.A2 = null;
                        npVar.f5(null);
                        npVar.getNotificationCenter().k(3, new Object[0]);
                        return;
                    }
                    return;
                }
                if (peer.user_id != 0) {
                    TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                    tL_inputDialogPeer.peer = tL_inputPeerUser;
                    long j29 = tL_help_promoData.peer.user_id;
                    tL_inputPeerUser.user_id = j29;
                    TLRPC.User user2 = (TLRPC.User) hVar.f(j29);
                    if (user2 != null) {
                        tL_inputDialogPeer.peer.access_hash = user2.access_hash;
                    }
                } else if (peer.chat_id != 0) {
                    TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputDialogPeer.peer = tL_inputPeerChat;
                    long j30 = tL_help_promoData.peer.chat_id;
                    tL_inputPeerChat.chat_id = j30;
                    TLRPC.Chat chat3 = (TLRPC.Chat) hVar2.f(j30);
                    if (chat3 != null) {
                        tL_inputDialogPeer.peer.access_hash = chat3.access_hash;
                    }
                } else {
                    TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                    tL_inputDialogPeer.peer = tL_inputPeerChannel;
                    long j31 = tL_help_promoData.peer.channel_id;
                    tL_inputPeerChannel.channel_id = j31;
                    TLRPC.Chat chat4 = (TLRPC.Chat) hVar2.f(j31);
                    if (chat4 != null) {
                        tL_inputDialogPeer.peer.access_hash = chat4.access_hash;
                    }
                }
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                npVar.y2 = npVar.getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new j3(this.d, 2, j27, npVar, tL_help_promoData));
                return;
            case 5:
                ((ur) obj2).getMessagesController().t7.D(j13, (TLRPC.TL_forumTopic) obj, i12);
                return;
            case 6:
                ur urVar = (ur) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                try {
                    try {
                        urVar.b.beginTransaction();
                        TLRPC.TL_message e02 = urVar.e0(i12, j13);
                        e02.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                        e02.voiceTranscriptionRated = message.voiceTranscriptionRated;
                        e02.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                        e02.voiceTranscriptionForce = message.voiceTranscriptionForce;
                        e02.voiceTranscriptionId = message.voiceTranscriptionId;
                        while (i13 < 2) {
                            SQLitePreparedStatement executeFast3 = i13 == 0 ? urVar.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : urVar.b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            try {
                                executeFast3.requery();
                                NativeByteBuffer c10 = vi.c(e02);
                                if (c10 != null) {
                                    executeFast3.bindByteBuffer(1, c10);
                                } else {
                                    executeFast3.bindNull(1);
                                }
                                executeFast3.bindInteger(2, i12);
                                executeFast3.bindLong(3, j13);
                                executeFast3.step();
                                executeFast3.dispose();
                                if (c10 != null) {
                                    c10.reuse();
                                }
                                i13++;
                            } catch (Exception e11) {
                                e = e11;
                                sQLitePreparedStatement2 = executeFast3;
                                urVar.o(e, true);
                                SQLiteDatabase sQLiteDatabase = urVar.b;
                                if (sQLiteDatabase != null) {
                                    sQLiteDatabase.commitTransaction();
                                }
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                sQLitePreparedStatement4 = executeFast3;
                                SQLiteDatabase sQLiteDatabase2 = urVar.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLitePreparedStatement4 != null) {
                                    sQLitePreparedStatement4.dispose();
                                }
                                throw th;
                            }
                        }
                        urVar.b.commitTransaction();
                        SQLiteDatabase sQLiteDatabase3 = urVar.b;
                        if (sQLiteDatabase3 != null) {
                            sQLiteDatabase3.commitTransaction();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            case 7:
                ur urVar2 = (ur) obj2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj;
                urVar2.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase4 = urVar2.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase4.queryFinalized("SELECT data FROM chats WHERE uid = " + j13, new Object[0]);
                    try {
                        if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                            chat = null;
                        } else {
                            chat = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                        }
                        queryFinalized.dispose();
                        if (chat != null) {
                            if (chat.default_banned_rights == null || i12 >= chat.version) {
                                chat.default_banned_rights = tL_chatBannedRights;
                                chat.flags |= 262144;
                                chat.version = i12;
                                sQLitePreparedStatement = urVar2.b.executeFast("UPDATE chats SET data = ? WHERE uid = ?");
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
                                        urVar2.o(e, true);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        if (sQLitePreparedStatement != null) {
                                            sQLitePreparedStatement.dispose();
                                            return;
                                        }
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
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
                    } catch (Throwable th5) {
                        th = th5;
                        sQLiteCursor = queryFinalized;
                        sQLitePreparedStatement = null;
                        if (sQLiteCursor != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        throw th;
                    }
                } catch (Exception e15) {
                    e = e15;
                    sQLitePreparedStatement = null;
                } catch (Throwable th6) {
                    th = th6;
                    sQLitePreparedStatement = null;
                }
                break;
            case 8:
                a();
                return;
            case 9:
                ur urVar3 = (ur) obj2;
                String str = (String) obj;
                urVar3.getClass();
                try {
                    try {
                    } finally {
                        if (0 != 0) {
                            sQLitePreparedStatement2.dispose();
                        }
                    }
                } catch (Exception e16) {
                    urVar3.o(e16, true);
                    if (0 == 0) {
                        return;
                    }
                }
                if (!str.isEmpty()) {
                    sQLitePreparedStatement3 = urVar3.b.executeFast("REPLACE INTO widget_state VALUES(?, ?, ?)");
                    sQLitePreparedStatement3.bindLong(1, j13);
                    sQLitePreparedStatement3.bindInteger(2, i12);
                    sQLitePreparedStatement3.bindString(3, str);
                    sQLitePreparedStatement3.step();
                    sQLitePreparedStatement3.dispose();
                    return;
                }
                SQLiteDatabase sQLiteDatabase5 = urVar3.b;
                Locale locale2 = Locale.US;
                sQLiteDatabase5.executeFast("DELETE FROM widget_state WHERE uid = " + j13 + " AND mid = " + i12).stepThis().dispose();
                return;
            case 10:
                az azVar = (az) obj2;
                byte[] bArr = (byte[]) obj;
                StringBuilder sb4 = new StringBuilder();
                long j32 = this.c;
                sb4.append(j32);
                sb4.append("_");
                int i30 = this.d;
                sb4.append(i30);
                sb4.append("_");
                sb4.append(Utilities.f(bArr));
                sb4.append("_0");
                String sb5 = sb4.toString();
                azVar.r.put(sb5, Boolean.TRUE);
                HashMap hashMap = azVar.s;
                List list = (List) hashMap.get(j32 + "_" + i30);
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(j32 + "_" + i30, list);
                }
                list.add(sb5);
                if (!n5.E(j32)) {
                    long j33 = -j32;
                    if (azVar.getMessagesController().O0(Long.valueOf(j33)) == null && (P = azVar.getMessagesStorage().P(j33)) != null) {
                        azVar.getMessagesController().X3(P, true);
                    }
                } else if (azVar.getMessagesController().c2(Long.valueOf(j32)) == null && (k02 = azVar.getMessagesStorage().k0(j32)) != null) {
                    azVar.getMessagesController().e4(k02, true, false);
                }
                TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
                tL_messages_getBotCallbackAnswer.peer = azVar.getMessagesController().l1(j32);
                tL_messages_getBotCallbackAnswer.msg_id = i30;
                tL_messages_getBotCallbackAnswer.game = false;
                if (bArr != null) {
                    tL_messages_getBotCallbackAnswer.flags |= 1;
                    tL_messages_getBotCallbackAnswer.data = bArr;
                }
                azVar.getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, new di(azVar, sb5, list, 9), 2);
                azVar.getMessagesController().q3(j32, i30, i30, 0, false, 0L, 0, true, 0);
                return;
            case 11:
                b();
                return;
            default:
                a10 a10Var = (a10) obj2;
                gj gjVar3 = (gj) obj;
                a10Var.getClass();
                gjVar3.k.originalLanguage = "und";
                a10Var.getMessagesStorage().X1(j13, gjVar3.k);
                a10Var.w.remove(Integer.valueOf(i12));
                return;
        }
    }

    public /* synthetic */ fk(c1 c1Var, long j3, int i7, Object obj, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = j3;
        this.d = i7;
        this.e = obj;
    }

    public /* synthetic */ fk(c1 c1Var, long j3, TLObject tLObject, int i7, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = j3;
        this.e = tLObject;
        this.d = i7;
    }

    public /* synthetic */ fk(ur urVar, int i7, long j3, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = urVar;
        this.d = i7;
        this.c = j3;
        this.e = tLObject;
    }
}
