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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class yj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yj(int i3, int i10, long j10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.e = obj2;
        this.c = j10;
        this.d = i3;
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
        ?? r9;
        SQLiteCursor queryFinalized;
        int i3;
        NativeByteBuffer byteBufferValue;
        yj yjVar = this;
        qr qrVar = (qr) yjVar.b;
        TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) yjVar.e;
        try {
            long e10 = qrVar.getUserConfig().e();
            qrVar.b.beginTransaction();
            long j11 = 0;
            int i10 = 0;
            TLRPC.TL_messageReactions tL_messageReactions2 = null;
            while (true) {
                j10 = yjVar.c;
                if (i10 >= 2) {
                    break;
                }
                int i11 = yjVar.d;
                if (i10 == 0) {
                    SQLiteDatabase sQLiteDatabase2 = qrVar.b;
                    Locale locale = Locale.US;
                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_v2 WHERE mid = " + i11 + " AND uid = " + j10, new Object[0]);
                    r9 = 0;
                } else {
                    SQLiteDatabase sQLiteDatabase3 = qrVar.b;
                    Locale locale2 = Locale.US;
                    r9 = 0;
                    queryFinalized = sQLiteDatabase3.queryFinalized("SELECT data FROM messages_topics WHERE mid = " + i11 + " AND uid = " + j10, new Object[0]);
                }
                SQLiteCursor sQLiteCursor2 = queryFinalized;
                try {
                    if (!sQLiteCursor2.next() || (byteBufferValue = sQLiteCursor2.byteBufferValue(r9)) == 0) {
                        i3 = i10;
                    } else {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r9), r9);
                        if (TLdeserialize != null) {
                            i3 = i10;
                            TLdeserialize.readAttachPath(byteBufferValue, qrVar.getUserConfig().n);
                            byteBufferValue.reuse();
                            if (tL_messageReactions2 == null) {
                                tL_messageReactions2 = TLdeserialize.reactions;
                                j11 = zi.R1(e10, TLdeserialize);
                            }
                            zi.g6(TLdeserialize, tL_messageReactions);
                            SQLitePreparedStatement executeFast = i3 == 0 ? qrVar.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?") : qrVar.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                            zi.r5(TLdeserialize);
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                            TLdeserialize.serializeToStream(nativeByteBuffer);
                            executeFast.requery();
                            executeFast.bindByteBuffer(1, nativeByteBuffer);
                            executeFast.bindInteger(2, i11);
                            executeFast.bindLong(3, j10);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                            if (e10 == j10) {
                                SQLiteDatabase sQLiteDatabase4 = qrVar.b;
                                Locale locale3 = Locale.US;
                                sQLiteDatabase4.executeFast("DELETE FROM tag_message_id WHERE mid = " + TLdeserialize.id).stepThis().dispose();
                                SQLitePreparedStatement executeFast2 = qrVar.b.executeFast("REPLACE INTO tag_message_id VALUES(?, ?, ?, ?)");
                                qrVar.g(executeFast2, TLdeserialize);
                                executeFast2.dispose();
                            }
                        } else {
                            i3 = i10;
                            byteBufferValue.reuse();
                        }
                    }
                    sQLiteCursor2.dispose();
                    i10 = i3 + 1;
                    yjVar = this;
                } catch (Exception e11) {
                    e = e11;
                    sQLiteCursor = sQLiteCursor2;
                    z10 = true;
                    try {
                        qrVar.o(e, z10);
                        SQLiteDatabase sQLiteDatabase5 = qrVar.b;
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
                        sQLiteDatabase = qrVar.b;
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
                    sQLiteDatabase = qrVar.b;
                    if (sQLiteDatabase != null) {
                    }
                    if (sQLiteCursor != null) {
                    }
                    throw th;
                }
            }
            qrVar.b.commitTransaction();
            if (j10 == e10 && tL_messageReactions2 != null && (arrayList = tL_messageReactions2.results) != null && (!arrayList.isEmpty() || tL_messageReactions == null || !tL_messageReactions.results.isEmpty())) {
                g0.h3(new zl(qrVar, tL_messageReactions2, tL_messageReactions, j11, 9));
            }
            SQLiteDatabase sQLiteDatabase6 = qrVar.b;
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
        oz ozVar = (oz) this.b;
        qr qrVar = (qr) this.e;
        long j10 = this.c;
        int i3 = this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase = qrVar.b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j10 + " AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, h10.i(i3).n);
                    byteBufferValue.reuse();
                    if (zi.L3(TLdeserialize)) {
                        TLdeserialize.id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j10;
                        zi ziVar = new zi(i3, TLdeserialize, false, true);
                        arrayList.add(ziVar);
                        arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j10 + "_" + arrayList.size(), ziVar.z1(true), ziVar.x1(true), null, null, null, null, null), arrayList2.size()));
                    }
                }
            }
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        g0.h3(new z1(ozVar, i3, j10, arrayList, arrayList2, 6));
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0234  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long[] jArr;
        long j10;
        a2 a2Var;
        int i3;
        long[] jArr2;
        long j11;
        final long j12;
        long j13;
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
        long j14 = this.c;
        int i13 = 0;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                TLRPC.TL_sendMessageTextDraftAction tL_sendMessageTextDraftAction = (TLRPC.TL_sendMessageTextDraftAction) obj;
                final f2 b10 = f2.b(((hp) obj2).currentAccount);
                gi.w5 w5Var = b10.a;
                long j15 = tL_sendMessageTextDraftAction.random_id;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_sendMessageTextDraftAction.text;
                boolean z10 = tL_sendMessageTextDraftAction.can_stop;
                boolean z11 = tL_sendMessageTextDraftAction.keep_on_stop;
                StringBuilder sb2 = new StringBuilder("[BotForum] onDraftNewDraft ");
                final long j16 = this.c;
                sb2.append(j16);
                sb2.append(" ");
                int i14 = this.d;
                sb2.append(i14);
                sb2.append(" ");
                sb2.append(j15);
                a8.b(sb2.toString());
                long j17 = i14;
                LongSparseArray U = b10.b.U(j16, j17);
                if ((U == null ? null : U.get(j15)) != null) {
                    a8.b("[BotForum] onDraftNewDraft ignore " + j16 + " " + i14 + " " + j15);
                    return;
                }
                LongSparseArray U2 = w5Var.U(j16, j17);
                if (U2 == null || U2.size() <= 0) {
                    jArr = null;
                } else {
                    long[] jArr3 = new long[U2.size()];
                    int size = U2.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        jArr3[i15] = U2.keyAt(i15);
                    }
                    jArr = jArr3;
                }
                LongSparseArray U3 = w5Var.U(j16, j17);
                a2 a2Var3 = (a2) (U3 == null ? null : U3.get(j15));
                if (a2Var3 == null) {
                    a2Var = new a2(j15, b10.getUserConfig().j());
                    j10 = j15;
                    b10.a.Y(j16, j17, j10, a2Var);
                } else {
                    j10 = j15;
                    a2Var = a2Var3;
                }
                a2Var.d = z11;
                a2Var.c = z10;
                if (jArr != null) {
                    int length = jArr.length;
                    int i16 = 0;
                    while (i16 < length) {
                        long j18 = jArr[i16];
                        if (j18 == j10) {
                            i3 = i14;
                        } else {
                            Runnable runnable = ((a2) U2.get(j18)).f;
                            if (runnable != null) {
                                g0.r(runnable);
                            }
                            long j19 = j16;
                            int i17 = i14;
                            b10.e(j19, i17, j18);
                            i3 = i17;
                            j16 = j19;
                        }
                        i16++;
                        i14 = i3;
                    }
                }
                final int i18 = i14;
                Runnable runnable2 = a2Var.f;
                if (runnable2 != null) {
                    g0.r(runnable2);
                }
                final long j20 = j10;
                final int i19 = 1;
                a2Var.f = new Runnable() { // from class: org.telegram.messenger.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i19) {
                            case 0:
                                b10.e(j16, i18, j20);
                                break;
                            default:
                                b10.e(j16, i18, j20);
                                break;
                        }
                    }
                };
                a2Var.g = tL_textWithEntities;
                int i20 = a2Var.b;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.dialog_id = j16;
                tL_message.peer_id = b10.getMessagesController().z1(j16);
                tL_message.from_id = b10.getMessagesController().z1(j16);
                tL_message.local_id = i20;
                tL_message.id = i20;
                tL_message.random_id = j20;
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
                zi ziVar = new zi(b10.currentAccount, tL_message, false, true);
                ziVar.W1 = true;
                ziVar.Q1 = false;
                a2Var.h = ziVar;
                g0.i3(a2Var.f, b10.getAppGlobalConfig().v.g2(TimeUnit.MILLISECONDS));
                b10.getNotificationCenter().k(hs.K5, new c2(j16, j17, a2Var.h));
                return;
            case 1:
                TLRPC.TL_sendMessageRichMessageDraftAction tL_sendMessageRichMessageDraftAction = (TLRPC.TL_sendMessageRichMessageDraftAction) obj;
                final f2 b11 = f2.b(((hp) obj2).currentAccount);
                gi.w5 w5Var2 = b11.a;
                long j21 = tL_sendMessageRichMessageDraftAction.random_id;
                TL_iv.RichMessage richMessage = tL_sendMessageRichMessageDraftAction.rich_message;
                boolean z12 = tL_sendMessageRichMessageDraftAction.can_stop;
                boolean z13 = tL_sendMessageRichMessageDraftAction.keep_on_stop;
                StringBuilder sb3 = new StringBuilder("[BotForum] onDraftNewDraft (rich_message) ");
                long j22 = this.c;
                sb3.append(j22);
                sb3.append(" ");
                int i21 = this.d;
                sb3.append(i21);
                sb3.append(" ");
                sb3.append(j21);
                a8.b(sb3.toString());
                long j23 = i21;
                LongSparseArray U4 = b11.b.U(j22, j23);
                if ((U4 == null ? null : U4.get(j21)) != null) {
                    a8.b("[BotForum] onDraftNewDraft (rich_message) ignore " + j22 + " " + i21 + " " + j21);
                    return;
                }
                LongSparseArray U5 = w5Var2.U(j22, j23);
                if (U5 == null || U5.size() <= 0) {
                    jArr2 = null;
                } else {
                    long[] jArr4 = new long[U5.size()];
                    int size2 = U5.size();
                    for (int i22 = 0; i22 < size2; i22++) {
                        jArr4[i22] = U5.keyAt(i22);
                    }
                    jArr2 = jArr4;
                }
                LongSparseArray U6 = w5Var2.U(j22, j23);
                a2 a2Var4 = (a2) (U6 == null ? null : U6.get(j21));
                if (a2Var4 == null) {
                    a2Var2 = new a2(j21, b11.getUserConfig().j());
                    j11 = j21;
                    j12 = j22;
                    b11.a.Y(j12, j23, j11, a2Var2);
                    j13 = j23;
                } else {
                    j11 = j21;
                    j12 = j22;
                    j13 = j23;
                    a2Var2 = a2Var4;
                }
                a2Var2.d = z13;
                a2Var2.c = z12;
                if (jArr2 != null) {
                    int length2 = jArr2.length;
                    int i23 = 0;
                    while (i23 < length2) {
                        long j24 = jArr2[i23];
                        if (j24 == j11) {
                            i10 = i21;
                        } else {
                            Runnable runnable3 = ((a2) U5.get(j24)).f;
                            if (runnable3 != null) {
                                g0.r(runnable3);
                            }
                            long j25 = j12;
                            int i24 = i21;
                            b11.e(j25, i24, j24);
                            i10 = i24;
                            j12 = j25;
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
                final long j26 = j11;
                final int i26 = 0;
                long j27 = j12;
                a2Var2.f = new Runnable() { // from class: org.telegram.messenger.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i26) {
                            case 0:
                                b11.e(j12, i25, j26);
                                break;
                            default:
                                b11.e(j12, i25, j26);
                                break;
                        }
                    }
                };
                int i27 = a2Var2.b;
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.dialog_id = j27;
                tL_message2.peer_id = b11.getMessagesController().z1(j27);
                tL_message2.from_id = b11.getMessagesController().z1(j27);
                tL_message2.local_id = i27;
                tL_message2.id = i27;
                tL_message2.random_id = j26;
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
                zi ziVar2 = new zi(b11.currentAccount, tL_message2, false, true);
                ziVar2.W1 = true;
                ziVar2.Q1 = false;
                a2Var2.h = ziVar2;
                g0.i3(a2Var2.f, b11.getAppGlobalConfig().v.g2(TimeUnit.MILLISECONDS));
                b11.getNotificationCenter().k(hs.K5, new c2(j12, j13, a2Var2.h));
                return;
            case 2:
                li liVar = (li) obj2;
                TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) obj;
                try {
                    if (tL_attachMenuBots != null) {
                        liVar.getMessagesStorage().b.executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
                        SQLitePreparedStatement executeFast = liVar.getMessagesStorage().b.executeFast("REPLACE INTO attach_menu_bots VALUES(?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_attachMenuBots.getObjectSize());
                        tL_attachMenuBots.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindLong(2, j14);
                        executeFast.bindInteger(3, i12);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = liVar.getMessagesStorage().b.executeFast("UPDATE attach_menu_bots SET date = ?");
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
                li liVar2 = (li) obj2;
                if (((ArrayList) obj) != null && j14 != 0) {
                    liVar2.Y[i12] = j14;
                }
                liVar2.a1(i12, false, false);
                return;
            case 4:
                hp hpVar = (hp) obj2;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                hpVar.M7 = hpVar.getConnectionsManager().getCurrentTime();
                TLRPC.Dialog dialog = hpVar.y2;
                long j28 = this.c;
                if (dialog != null && j28 != dialog.id) {
                    hpVar.j4();
                }
                hpVar.y2 = (TLRPC.Dialog) hpVar.R.f(j28);
                hpVar.T3 = new HashSet(tL_help_promoData.pending_suggestions);
                hpVar.U3 = new HashSet(tL_help_promoData.dismissed_suggestions);
                hpVar.V3 = tL_help_promoData.custom_pending_suggestion;
                hpVar.getNotificationCenter().k(hs.s1, new Object[0]);
                SharedPreferences.Editor edit = hpVar.e7.edit();
                edit.putStringSet("pendingSuggestions", hpVar.T3);
                edit.putStringSet("dismissedSuggestions", hpVar.U3);
                edit.commit();
                if (hpVar.y2 != null) {
                    hpVar.v2 = false;
                    hpVar.T4(null);
                    hpVar.getNotificationCenter().k(3, Boolean.TRUE);
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
                    TLRPC.Dialog dialog2 = hpVar.y2;
                    if (dialog2 != null) {
                        long j29 = dialog2.id;
                        if (j29 < 0) {
                            TLRPC.Chat M0 = hpVar.M0(Long.valueOf(-j29));
                            if (t3.r0(M0) || M0.restricted) {
                                hpVar.f4(hpVar.y2);
                            }
                        } else {
                            hpVar.f4(dialog2);
                        }
                        hpVar.y2 = null;
                        hpVar.T4(null);
                        hpVar.getNotificationCenter().k(3, new Object[0]);
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
                hpVar.w2 = hpVar.getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new h3(this.d, 2, j28, hpVar, tL_help_promoData));
                return;
            case 5:
                ((qr) obj2).getMessagesController().q7.D(j14, (TLRPC.TL_forumTopic) obj, i12);
                return;
            case 6:
                qr qrVar = (qr) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                try {
                    try {
                        qrVar.b.beginTransaction();
                        TLRPC.TL_message e02 = qrVar.e0(i12, j14);
                        e02.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                        e02.voiceTranscriptionRated = message.voiceTranscriptionRated;
                        e02.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                        e02.voiceTranscriptionForce = message.voiceTranscriptionForce;
                        e02.voiceTranscriptionId = message.voiceTranscriptionId;
                        while (i13 < 2) {
                            SQLitePreparedStatement executeFast3 = i13 == 0 ? qrVar.b.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : qrVar.b.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            try {
                                executeFast3.requery();
                                NativeByteBuffer c2 = oi.c(e02);
                                if (c2 != null) {
                                    executeFast3.bindByteBuffer(1, c2);
                                } else {
                                    executeFast3.bindNull(1);
                                }
                                executeFast3.bindInteger(2, i12);
                                executeFast3.bindLong(3, j14);
                                executeFast3.step();
                                executeFast3.dispose();
                                if (c2 != null) {
                                    c2.reuse();
                                }
                                i13++;
                            } catch (Exception e11) {
                                e = e11;
                                sQLitePreparedStatement2 = executeFast3;
                                qrVar.o(e, true);
                                SQLiteDatabase sQLiteDatabase = qrVar.b;
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
                                SQLiteDatabase sQLiteDatabase2 = qrVar.b;
                                if (sQLiteDatabase2 != null) {
                                    sQLiteDatabase2.commitTransaction();
                                }
                                if (sQLitePreparedStatement4 != null) {
                                    sQLitePreparedStatement4.dispose();
                                }
                                throw th;
                            }
                        }
                        qrVar.b.commitTransaction();
                        SQLiteDatabase sQLiteDatabase3 = qrVar.b;
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
                qr qrVar2 = (qr) obj2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj;
                qrVar2.getClass();
                try {
                    SQLiteDatabase sQLiteDatabase4 = qrVar2.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase4.queryFinalized("SELECT data FROM chats WHERE uid = " + j14, new Object[0]);
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
                                sQLitePreparedStatement = qrVar2.b.executeFast("UPDATE chats SET data = ? WHERE uid = ?");
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
                                        qrVar2.o(e, true);
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
                qr qrVar3 = (qr) obj2;
                String str = (String) obj;
                qrVar3.getClass();
                try {
                    try {
                    } finally {
                        if (0 != 0) {
                            sQLitePreparedStatement2.dispose();
                        }
                    }
                } catch (Exception e16) {
                    qrVar3.o(e16, true);
                    if (0 == 0) {
                        return;
                    }
                }
                if (!str.isEmpty()) {
                    sQLitePreparedStatement3 = qrVar3.b.executeFast("REPLACE INTO widget_state VALUES(?, ?, ?)");
                    sQLitePreparedStatement3.bindLong(1, j14);
                    sQLitePreparedStatement3.bindInteger(2, i12);
                    sQLitePreparedStatement3.bindString(3, str);
                    sQLitePreparedStatement3.step();
                    sQLitePreparedStatement3.dispose();
                    return;
                }
                SQLiteDatabase sQLiteDatabase5 = qrVar3.b;
                Locale locale2 = Locale.US;
                sQLiteDatabase5.executeFast("DELETE FROM widget_state WHERE uid = " + j14 + " AND mid = " + i12).stepThis().dispose();
                return;
            case 10:
                yy yyVar = (yy) obj2;
                byte[] bArr = (byte[]) obj;
                StringBuilder sb4 = new StringBuilder();
                long j33 = this.c;
                sb4.append(j33);
                sb4.append("_");
                int i30 = this.d;
                sb4.append(i30);
                sb4.append("_");
                sb4.append(Utilities.f(bArr));
                sb4.append("_0");
                String sb5 = sb4.toString();
                yyVar.r.put(sb5, Boolean.TRUE);
                HashMap hashMap = yyVar.s;
                List list = (List) hashMap.get(j33 + "_" + i30);
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(j33 + "_" + i30, list);
                }
                list.add(sb5);
                if (!m5.E(j33)) {
                    long j34 = -j33;
                    if (yyVar.getMessagesController().M0(Long.valueOf(j34)) == null && (P = yyVar.getMessagesStorage().P(j34)) != null) {
                        yyVar.getMessagesController().Q3(P, true);
                    }
                } else if (yyVar.getMessagesController().a2(Long.valueOf(j33)) == null && (k02 = yyVar.getMessagesStorage().k0(j33)) != null) {
                    yyVar.getMessagesController().X3(k02, true, false);
                }
                TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
                tL_messages_getBotCallbackAnswer.peer = yyVar.getMessagesController().j1(j33);
                tL_messages_getBotCallbackAnswer.msg_id = i30;
                tL_messages_getBotCallbackAnswer.game = false;
                if (bArr != null) {
                    tL_messages_getBotCallbackAnswer.flags |= 1;
                    tL_messages_getBotCallbackAnswer.data = bArr;
                }
                yyVar.getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, new uh(yyVar, sb5, list, 9), 2);
                yyVar.getMessagesController().j3(j33, i30, i30, 0, false, 0L, 0, true, 0);
                return;
            case 11:
                b();
                return;
            default:
                x00 x00Var = (x00) obj2;
                zi ziVar3 = (zi) obj;
                x00Var.getClass();
                ziVar3.k.originalLanguage = "und";
                x00Var.getMessagesStorage().X1(j14, ziVar3.k);
                x00Var.w.remove(Integer.valueOf(i12));
                return;
        }
    }

    public /* synthetic */ yj(c1 c1Var, long j10, int i3, Object obj, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = j10;
        this.d = i3;
        this.e = obj;
    }

    public /* synthetic */ yj(c1 c1Var, long j10, TLObject tLObject, int i3, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = j10;
        this.e = tLObject;
        this.d = i3;
    }

    public /* synthetic */ yj(qr qrVar, int i3, long j10, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = qrVar;
        this.d = i3;
        this.c = j10;
        this.e = tLObject;
    }
}
