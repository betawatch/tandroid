// default package

import android.content.Context;
import android.graphics.RectF;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.c;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class o57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o57(ad7 ad7Var, int i, long j, TLObject tLObject, byte b) {
        this.a = b;
        this.b = ad7Var;
        this.d = i;
        this.c = j;
        this.e = tLObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLiteCursor sQLiteCursor;
        boolean z;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        long j;
        ArrayList<TLRPC.ReactionCount> arrayList;
        ?? r2;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor sQLiteCursor3;
        NativeByteBuffer byteBufferValue;
        o57 o57Var = this;
        ad7 ad7Var = (ad7) o57Var.b;
        TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) o57Var.e;
        try {
            long e = ad7Var.getUserConfig().e();
            ad7Var.b.beginTransaction();
            long j2 = 0;
            int i = 0;
            TLRPC.TL_messageReactions tL_messageReactions2 = null;
            while (true) {
                sQLiteDatabase2 = ad7Var.b;
                j = o57Var.c;
                if (i >= 2) {
                    break;
                }
                int i2 = o57Var.d;
                if (i == 0) {
                    Locale locale = Locale.US;
                    r2 = 0;
                    sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_v2 WHERE mid = " + i2 + " AND uid = " + j, new Object[0]);
                } else {
                    Locale locale2 = Locale.US;
                    r2 = 0;
                    sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_topics WHERE mid = " + i2 + " AND uid = " + j, new Object[0]);
                }
                try {
                    if (!sQLiteCursor2.next() || (byteBufferValue = sQLiteCursor2.byteBufferValue(r2)) == 0) {
                        sQLiteCursor3 = sQLiteCursor2;
                    } else {
                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r2), r2);
                        if (TLdeserialize != null) {
                            sQLiteCursor3 = sQLiteCursor2;
                            try {
                                TLdeserialize.readAttachPath(byteBufferValue, ad7Var.getUserConfig().n);
                                byteBufferValue.reuse();
                                if (tL_messageReactions2 == null) {
                                    TLRPC.TL_messageReactions tL_messageReactions3 = TLdeserialize.reactions;
                                    j2 = k27.Q1(e, TLdeserialize);
                                    tL_messageReactions2 = tL_messageReactions3;
                                }
                                k27.e6(TLdeserialize, tL_messageReactions);
                                SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                                SQLitePreparedStatement executeFast = i == 0 ? sQLiteDatabase3.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?") : sQLiteDatabase3.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                                k27.p5(TLdeserialize);
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                TLdeserialize.serializeToStream(nativeByteBuffer);
                                executeFast.requery();
                                executeFast.bindByteBuffer(1, nativeByteBuffer);
                                executeFast.bindInteger(2, i2);
                                executeFast.bindLong(3, j);
                                executeFast.step();
                                nativeByteBuffer.reuse();
                                executeFast.dispose();
                                if (e == j) {
                                    ad7Var.b.executeFast("DELETE FROM tag_message_id WHERE mid = " + TLdeserialize.id).stepThis().dispose();
                                    SQLitePreparedStatement executeFast2 = ad7Var.b.executeFast("REPLACE INTO tag_message_id VALUES(?, ?, ?, ?)");
                                    ad7Var.f(executeFast2, TLdeserialize);
                                    executeFast2.dispose();
                                }
                            } catch (Exception e2) {
                                e = e2;
                                sQLiteCursor = sQLiteCursor3;
                                z = true;
                                try {
                                    ad7Var.n(e, z);
                                    SQLiteDatabase sQLiteDatabase4 = ad7Var.b;
                                    if (sQLiteDatabase4 != null) {
                                        sQLiteDatabase4.commitTransaction();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                        return;
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    sQLiteDatabase = ad7Var.b;
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.commitTransaction();
                                    }
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLiteCursor = sQLiteCursor3;
                                sQLiteDatabase = ad7Var.b;
                                if (sQLiteDatabase != null) {
                                }
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        } else {
                            sQLiteCursor3 = sQLiteCursor2;
                            byteBufferValue.reuse();
                        }
                    }
                    sQLiteCursor3.dispose();
                    i++;
                    o57Var = this;
                } catch (Exception e3) {
                    e = e3;
                    sQLiteCursor3 = sQLiteCursor2;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteCursor3 = sQLiteCursor2;
                }
            }
            sQLiteDatabase2.commitTransaction();
            if (j == e && tL_messageReactions2 != null && (arrayList = tL_messageReactions2.results) != null && (!arrayList.isEmpty() || tL_messageReactions == null || !tL_messageReactions.results.isEmpty())) {
                gl.d3(new m77((Object) ad7Var, (Object) tL_messageReactions2, (Object) tL_messageReactions, j2, (byte) 20));
            }
            SQLiteDatabase sQLiteDatabase5 = ad7Var.b;
            if (sQLiteDatabase5 != null) {
                sQLiteDatabase5.commitTransaction();
            }
        } catch (Exception e4) {
            e = e4;
            z = true;
            sQLiteCursor = null;
        } catch (Throwable th4) {
            th = th4;
            sQLiteCursor = null;
        }
    }

    private final void b() {
        TLRPC.Chat O;
        TLRPC.User h0;
        z3a z3aVar = (z3a) this.b;
        byte[] bArr = (byte[]) this.e;
        StringBuilder sb = new StringBuilder();
        long j = this.c;
        sb.append(j);
        sb.append("_");
        int i = this.d;
        sb.append(i);
        sb.append("_");
        sb.append(Utilities.f(bArr));
        sb.append("_0");
        String sb2 = sb.toString();
        z3aVar.r.put(sb2, Boolean.TRUE);
        HashMap hashMap = z3aVar.s;
        List list = (List) hashMap.get(j + "_" + i);
        if (list == null) {
            list = new ArrayList();
            hashMap.put(j + "_" + i, list);
        }
        list.add(sb2);
        if (!cf3.D(j)) {
            long j2 = -j;
            if (z3aVar.getMessagesController().K0(Long.valueOf(j2)) == null && (O = z3aVar.getMessagesStorage().O(j2)) != null) {
                z3aVar.getMessagesController().S3(O, true);
            }
        } else if (z3aVar.getMessagesController().V1(Long.valueOf(j)) == null && (h0 = z3aVar.getMessagesStorage().h0(j)) != null) {
            z3aVar.getMessagesController().Z3(h0, true, false);
        }
        TLRPC.TL_messages_getBotCallbackAnswer tL_messages_getBotCallbackAnswer = new TLRPC.TL_messages_getBotCallbackAnswer();
        tL_messages_getBotCallbackAnswer.peer = z3aVar.getMessagesController().h1(j);
        tL_messages_getBotCallbackAnswer.msg_id = i;
        tL_messages_getBotCallbackAnswer.game = false;
        if (bArr != null) {
            tL_messages_getBotCallbackAnswer.flags |= 1;
            tL_messages_getBotCallbackAnswer.data = bArr;
        }
        z3aVar.getConnectionsManager().sendRequest(tL_messages_getBotCallbackAnswer, new ck8((Object) z3aVar, (Object) sb2, (Object) list, (byte) 8), 2);
        z3aVar.getMessagesController().k3(j, i, i, 0, false, 0L, 0, true, 0);
    }

    private final void c() {
        hgb hgbVar = (hgb) this.b;
        ad7 ad7Var = (ad7) this.e;
        long j = this.c;
        int i = this.d;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabase = ad7Var.b;
            Locale locale = Locale.US;
            SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j + " AND mid > 0 AND type = 4 ORDER BY date DESC, mid DESC", new Object[0]);
            while (queryFinalized.next()) {
                NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                if (byteBufferValue != null) {
                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    TLdeserialize.readAttachPath(byteBufferValue, y6c.h(i).n);
                    byteBufferValue.reuse();
                    if (k27.K3(TLdeserialize)) {
                        TLdeserialize.id = queryFinalized.intValue(1);
                        TLdeserialize.dialog_id = j;
                        k27 k27Var = new k27(i, TLdeserialize, false, true);
                        arrayList.add(k27Var);
                        arrayList2.add(new MediaSessionCompat$QueueItem(null, new MediaDescriptionCompat(j + "_" + arrayList.size(), k27Var.y1(true), k27Var.w1(true), null, null, null, null, null), arrayList2.size()));
                    }
                }
            }
            queryFinalized.dispose();
            Collections.reverse(arrayList);
            Collections.reverse(arrayList2);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        gl.d3(new wy((Object) hgbVar, i, j, (Object) arrayList, (Object) arrayList2, (byte) 14));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r1v94, types: [org.telegram.SQLite.SQLitePreparedStatement] */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        long[] jArr;
        final long j;
        final long j2;
        long j3;
        rp0 rp0Var;
        int i2;
        long[] jArr2;
        long j4;
        long j5;
        long j6;
        rp0 rp0Var2;
        int i3;
        wp0 wp0Var;
        SQLiteCursor queryFinalized;
        TLRPC.Chat chat;
        NativeByteBuffer byteBufferValue;
        boolean isEmpty;
        SQLiteDatabase sQLiteDatabase;
        SQLitePreparedStatement sQLitePreparedStatement = this.a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        byte b = 2;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        SQLitePreparedStatement sQLitePreparedStatement3 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        r9 = null;
        SQLiteCursor sQLiteCursor = null;
        SQLitePreparedStatement sQLitePreparedStatement4 = null;
        long j7 = this.c;
        int i4 = this.d;
        int i5 = 0;
        Object obj = this.e;
        Object obj2 = this.b;
        switch (sQLitePreparedStatement) {
            case 0:
                TLRPC.TL_sendMessageTextDraftAction tL_sendMessageTextDraftAction = (TLRPC.TL_sendMessageTextDraftAction) obj;
                final wp0 b2 = wp0.b(((na7) obj2).currentAccount);
                lj9 lj9Var = b2.a;
                long j8 = tL_sendMessageTextDraftAction.random_id;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_sendMessageTextDraftAction.text;
                boolean z = tL_sendMessageTextDraftAction.can_stop;
                boolean z2 = tL_sendMessageTextDraftAction.keep_on_stop;
                StringBuilder sb = new StringBuilder("[BotForum] onDraftNewDraft ");
                long j9 = this.c;
                sb.append(j9);
                sb.append(" ");
                int i6 = this.d;
                sb.append(i6);
                sb.append(" ");
                sb.append(j8);
                fa4.b(sb.toString());
                long j10 = i6;
                LongSparseArray x = b2.b.x(j9, j10);
                if ((x == null ? null : x.get(j8)) != null) {
                    fa4.b("[BotForum] onDraftNewDraft ignore " + j9 + " " + i6 + " " + j8);
                    return;
                }
                LongSparseArray x2 = lj9Var.x(j9, j10);
                if (x2 == null || x2.size() <= 0) {
                    i = i6;
                    jArr = null;
                } else {
                    long[] jArr3 = new long[x2.size()];
                    int size = x2.size();
                    i = i6;
                    for (int i7 = 0; i7 < size; i7++) {
                        jArr3[i7] = x2.keyAt(i7);
                    }
                    jArr = jArr3;
                }
                LongSparseArray x3 = lj9Var.x(j9, j10);
                rp0 rp0Var3 = (rp0) (x3 == null ? null : x3.get(j8));
                if (rp0Var3 == null) {
                    rp0 rp0Var4 = new rp0(j8, b2.getUserConfig().i());
                    j = j8;
                    lj9Var.F(j9, j10, j, rp0Var4);
                    j3 = j10;
                    j2 = j9;
                    rp0Var = rp0Var4;
                } else {
                    j = j8;
                    j2 = j9;
                    j3 = j10;
                    rp0Var = rp0Var3;
                }
                rp0Var.d = z2;
                rp0Var.c = z;
                if (jArr != null) {
                    int length = jArr.length;
                    int i8 = 0;
                    while (i8 < length) {
                        long j11 = jArr[i8];
                        if (j11 == j) {
                            i2 = i;
                        } else {
                            Runnable runnable = ((rp0) x2.get(j11)).f;
                            if (runnable != null) {
                                gl.r(runnable);
                            }
                            int i9 = i;
                            long j12 = j2;
                            b2.e(j12, i9, j11);
                            j2 = j12;
                            i2 = i9;
                        }
                        i8++;
                        i = i2;
                    }
                }
                final int i10 = i;
                Runnable runnable2 = rp0Var.f;
                if (runnable2 != null) {
                    gl.r(runnable2);
                }
                final byte b3 = 1;
                long j13 = j2;
                rp0Var.f = new Runnable() { // from class: pp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b3) {
                            case 0:
                                b2.e(j2, i10, j);
                                break;
                            default:
                                b2.e(j2, i10, j);
                                break;
                        }
                    }
                };
                rp0Var.g = tL_textWithEntities;
                int i11 = rp0Var.b;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.dialog_id = j13;
                tL_message.peer_id = b2.getMessagesController().w1(j13);
                tL_message.from_id = b2.getMessagesController().w1(j13);
                tL_message.local_id = i11;
                tL_message.id = i11;
                tL_message.random_id = j;
                tL_message.message = tL_textWithEntities.text;
                tL_message.entities = tL_textWithEntities.entities;
                tL_message.flags |= 128;
                tL_message.date = b2.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                tL_message.reply_to = tL_messageReplyHeader;
                tL_message.flags |= 16;
                tL_messageReplyHeader.forum_topic = true;
                tL_messageReplyHeader.reply_to_top_id = i10;
                tL_messageReplyHeader.flags |= 2;
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.flags |= 512;
                k27 k27Var = new k27(b2.currentAccount, tL_message, false, true);
                k27Var.Y1 = true;
                k27Var.S1 = false;
                rp0Var.h = k27Var;
                gl.e3(rp0Var.f, b2.getAppGlobalConfig().z.g(timeUnit));
                b2.getNotificationCenter().k(kk7.M5, new tp0(j13, j3, rp0Var.h));
                return;
            case 1:
                TLRPC.TL_sendMessageRichMessageDraftAction tL_sendMessageRichMessageDraftAction = (TLRPC.TL_sendMessageRichMessageDraftAction) obj;
                wp0 b4 = wp0.b(((na7) obj2).currentAccount);
                lj9 lj9Var2 = b4.a;
                long j14 = tL_sendMessageRichMessageDraftAction.random_id;
                TL_iv.RichMessage richMessage = tL_sendMessageRichMessageDraftAction.rich_message;
                boolean z3 = tL_sendMessageRichMessageDraftAction.can_stop;
                boolean z4 = tL_sendMessageRichMessageDraftAction.keep_on_stop;
                StringBuilder sb2 = new StringBuilder("[BotForum] onDraftNewDraft (rich_message) ");
                long j15 = this.c;
                sb2.append(j15);
                sb2.append(" ");
                int i12 = this.d;
                sb2.append(i12);
                sb2.append(" ");
                sb2.append(j14);
                fa4.b(sb2.toString());
                long j16 = i12;
                LongSparseArray x4 = b4.b.x(j15, j16);
                if ((x4 == null ? null : x4.get(j14)) != null) {
                    fa4.b("[BotForum] onDraftNewDraft (rich_message) ignore " + j15 + " " + i12 + " " + j14);
                    return;
                }
                LongSparseArray x5 = lj9Var2.x(j15, j16);
                if (x5 == null || x5.size() <= 0) {
                    jArr2 = null;
                } else {
                    jArr2 = new long[x5.size()];
                    int size2 = x5.size();
                    for (int i13 = 0; i13 < size2; i13++) {
                        jArr2[i13] = x5.keyAt(i13);
                    }
                }
                LongSparseArray x6 = lj9Var2.x(j15, j16);
                rp0 rp0Var5 = (rp0) (x6 == null ? null : x6.get(j14));
                if (rp0Var5 == null) {
                    rp0 rp0Var6 = new rp0(j14, b4.getUserConfig().i());
                    j4 = j15;
                    lj9Var2.F(j4, j16, j14, rp0Var6);
                    j6 = j16;
                    j5 = j14;
                    rp0Var2 = rp0Var6;
                } else {
                    j4 = j15;
                    j5 = j14;
                    j6 = j16;
                    rp0Var2 = rp0Var5;
                }
                rp0Var2.d = z4;
                rp0Var2.c = z3;
                if (jArr2 != null) {
                    int length2 = jArr2.length;
                    int i14 = 0;
                    while (i14 < length2) {
                        long j17 = jArr2[i14];
                        if (j17 == j5) {
                            i3 = i12;
                            wp0Var = b4;
                        } else {
                            Runnable runnable3 = ((rp0) x5.get(j17)).f;
                            if (runnable3 != null) {
                                gl.r(runnable3);
                            }
                            i3 = i12;
                            wp0Var = b4;
                            wp0Var.e(j4, i3, j17);
                        }
                        i14++;
                        b4 = wp0Var;
                        i12 = i3;
                    }
                }
                final int i15 = i12;
                final wp0 wp0Var2 = b4;
                Runnable runnable4 = rp0Var2.f;
                if (runnable4 != null) {
                    gl.r(runnable4);
                }
                final long j18 = j4;
                final byte b5 = 0;
                final long j19 = j5;
                rp0Var2.f = new Runnable() { // from class: pp0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (b5) {
                            case 0:
                                wp0Var2.e(j18, i15, j19);
                                break;
                            default:
                                wp0Var2.e(j18, i15, j19);
                                break;
                        }
                    }
                };
                int i16 = rp0Var2.b;
                TLRPC.TL_message tL_message2 = new TLRPC.TL_message();
                tL_message2.dialog_id = j18;
                tL_message2.peer_id = wp0Var2.getMessagesController().w1(j18);
                tL_message2.from_id = wp0Var2.getMessagesController().w1(j18);
                tL_message2.local_id = i16;
                tL_message2.id = i16;
                tL_message2.random_id = j5;
                tL_message2.message = "";
                tL_message2.flags |= TLObject.FLAG_13;
                tL_message2.rich_message = richMessage;
                tL_message2.date = wp0Var2.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader2 = new TLRPC.TL_messageReplyHeader();
                tL_message2.reply_to = tL_messageReplyHeader2;
                tL_message2.flags |= 16;
                tL_messageReplyHeader2.forum_topic = true;
                tL_messageReplyHeader2.reply_to_top_id = i15;
                tL_messageReplyHeader2.flags |= 2;
                tL_message2.media = new TLRPC.TL_messageMediaEmpty();
                tL_message2.flags |= 512;
                k27 k27Var2 = new k27(wp0Var2.currentAccount, tL_message2, false, true);
                k27Var2.Y1 = true;
                k27Var2.S1 = false;
                rp0Var2.h = k27Var2;
                gl.e3(rp0Var2.f, wp0Var2.getAppGlobalConfig().z.g(timeUnit));
                wp0Var2.getNotificationCenter().k(kk7.M5, new tp0(j18, j6, rp0Var2.h));
                return;
            case 2:
                o oVar = (o) obj2;
                TLObject tLObject = (TLObject) obj;
                if (oVar.I0 != 0) {
                    oVar.I0 = 0;
                    oVar.Z(false);
                    if (tLObject != null) {
                        TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                        na7.q1(i4).a4(tL_contacts_resolvedPeer.users, false);
                        ad7.Y(i4).j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, false, true);
                        if (tL_contacts_resolvedPeer.users.isEmpty()) {
                            return;
                        }
                        oVar.N(j7, tL_contacts_resolvedPeer.users.get(0));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                vz0 vz0Var = (vz0) obj2;
                byte[] bArr = (byte[]) obj;
                if (vz0Var.u) {
                    return;
                }
                vz0Var.f.put(Long.valueOf(j7), new sz0(i4, bArr));
                if (j7 == vz0Var.m) {
                    vz0Var.m = -1L;
                }
                if (vz0Var.t || vz0Var.u) {
                    return;
                }
                vz0Var.t = true;
                vz0Var.c.postDelayed(new tz0(vz0Var, b), 16L);
                return;
            case 4:
                ((p) obj2).a(Float.valueOf(((int[]) obj)[0] / i4), Boolean.valueOf(System.currentTimeMillis() - j7 > 250));
                return;
            case 5:
                buc bucVar = (buc) obj;
                p15 p15Var = ((o15) obj2).c;
                if (!p15Var.c(bucVar, i4)) {
                    p15Var.d("closing stale connected websocket; attempt=" + i4);
                    bucVar.c();
                    return;
                }
                p15Var.d("websocket connected after " + (SystemClock.elapsedRealtime() - j7) + " ms");
                m15 m15Var = p15Var.o;
                try {
                    JSONArray put = new JSONArray().put(p15Var.b);
                    StringBuilder sb3 = new StringBuilder("wallet-");
                    int i17 = p15Var.g + 1;
                    p15Var.g = i17;
                    sb3.append(i17);
                    p15Var.f = sb3.toString();
                    JSONObject put2 = new JSONObject().put("operation", "subscribe").put("id", p15Var.f).put("types", new JSONArray().put("transactions").put("account_state_change")).put("include_address_book", true).put("addresses", put).put("min_finality", "pending");
                    gl.r(m15Var);
                    gl.e3(m15Var, 30000L);
                    p15Var.g(put2.toString());
                    return;
                } catch (JSONException unused) {
                    p15Var.f("could not encode subscription");
                    return;
                }
            case 6:
                w25 w25Var = (w25) obj2;
                w25Var.getClass();
                TL_wallet.tonConnectGetPending tonconnectgetpending = new TL_wallet.tonConnectGetPending();
                long j20 = this.c;
                tonconnectgetpending.session_id = Long.valueOf(j20);
                w25Var.f.sendRequestTyped(tonconnectgetpending, new hc(r13 ? (byte) 1 : (byte) 0), new g25(w25Var, (u15) obj, j20, this.d, (byte) 0));
                return;
            case 7:
                hq6 hq6Var = (hq6) obj2;
                TLRPC.TL_attachMenuBots tL_attachMenuBots = (TLRPC.TL_attachMenuBots) obj;
                try {
                    if (tL_attachMenuBots != null) {
                        hq6Var.getMessagesStorage().b.executeFast("DELETE FROM attach_menu_bots").stepThis().dispose();
                        SQLitePreparedStatement executeFast = hq6Var.getMessagesStorage().b.executeFast("REPLACE INTO attach_menu_bots VALUES(?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_attachMenuBots.getObjectSize());
                        tL_attachMenuBots.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindLong(2, j7);
                        executeFast.bindInteger(3, i4);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = hq6Var.getMessagesStorage().b.executeFast("UPDATE attach_menu_bots SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindLong(1, i4);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 8:
                hq6 hq6Var2 = (hq6) obj2;
                if (((ArrayList) obj) != null && j7 != 0) {
                    hq6Var2.Y[i4] = j7;
                }
                hq6Var2.b1(i4, false, false);
                return;
            case 9:
                na7 na7Var = (na7) obj2;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) obj;
                na7Var.A4 = na7Var.getConnectionsManager().getCurrentTime();
                TLRPC.Dialog dialog = na7Var.q2;
                long j21 = this.c;
                if (dialog != null && j21 != dialog.id) {
                    na7Var.l4();
                }
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) na7Var.R.f(j21);
                na7Var.q2 = dialog2;
                if (dialog2 != null) {
                    na7Var.n2 = false;
                    na7Var.Y4(null);
                    na7Var.getNotificationCenter().k(3, Boolean.TRUE);
                    return;
                }
                vf6 vf6Var = new vf6();
                vf6 vf6Var2 = new vf6();
                for (int i18 = 0; i18 < tL_help_promoData.users.size(); i18++) {
                    TLRPC.User user = tL_help_promoData.users.get(i18);
                    vf6Var.k(user, user.id);
                }
                for (int i19 = 0; i19 < tL_help_promoData.chats.size(); i19++) {
                    TLRPC.Chat chat2 = tL_help_promoData.chats.get(i19);
                    vf6Var2.k(chat2, chat2.id);
                }
                TLRPC.TL_messages_getPeerDialogs tL_messages_getPeerDialogs = new TLRPC.TL_messages_getPeerDialogs();
                TLRPC.TL_inputDialogPeer tL_inputDialogPeer = new TLRPC.TL_inputDialogPeer();
                TLRPC.Peer peer = tL_help_promoData.peer;
                if (peer == null) {
                    TLRPC.Dialog dialog3 = na7Var.q2;
                    if (dialog3 != null) {
                        long j22 = dialog3.id;
                        if (j22 < 0) {
                            TLRPC.Chat K0 = na7Var.K0(Long.valueOf(-j22));
                            if (hc2.r0(K0) || K0.restricted) {
                                na7Var.h4(na7Var.q2);
                            }
                        } else {
                            na7Var.h4(dialog3);
                        }
                        na7Var.q2 = null;
                        na7Var.Y4(null);
                        na7Var.getNotificationCenter().k(3, new Object[0]);
                        return;
                    }
                    return;
                }
                if (peer.user_id != 0) {
                    TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                    tL_inputDialogPeer.peer = tL_inputPeerUser;
                    long j23 = tL_help_promoData.peer.user_id;
                    tL_inputPeerUser.user_id = j23;
                    TLRPC.User user2 = (TLRPC.User) vf6Var.f(j23);
                    if (user2 != null) {
                        tL_inputDialogPeer.peer.access_hash = user2.access_hash;
                    }
                } else if (peer.chat_id != 0) {
                    TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                    tL_inputDialogPeer.peer = tL_inputPeerChat;
                    long j24 = tL_help_promoData.peer.chat_id;
                    tL_inputPeerChat.chat_id = j24;
                    TLRPC.Chat chat3 = (TLRPC.Chat) vf6Var2.f(j24);
                    if (chat3 != null) {
                        tL_inputDialogPeer.peer.access_hash = chat3.access_hash;
                    }
                } else {
                    TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                    tL_inputDialogPeer.peer = tL_inputPeerChannel;
                    long j25 = tL_help_promoData.peer.channel_id;
                    tL_inputPeerChannel.channel_id = j25;
                    TLRPC.Chat chat4 = (TLRPC.Chat) vf6Var2.f(j25);
                    if (chat4 != null) {
                        tL_inputDialogPeer.peer.access_hash = chat4.access_hash;
                    }
                }
                tL_messages_getPeerDialogs.peers.add(tL_inputDialogPeer);
                na7Var.o2 = na7Var.getConnectionsManager().sendRequest(tL_messages_getPeerDialogs, new tg((Object) na7Var, this.d, (Object) tL_help_promoData, j21, (byte) 5));
                return;
            case 10:
                ((ad7) obj2).getMessagesController().g4.D(j7, (TLRPC.TL_forumTopic) obj, i4);
                return;
            case 11:
                ad7 ad7Var = (ad7) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                try {
                    try {
                        ad7Var.b.beginTransaction();
                        TLRPC.TL_message c0 = ad7Var.c0(i4, j7);
                        c0.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                        c0.voiceTranscriptionRated = message.voiceTranscriptionRated;
                        c0.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                        c0.voiceTranscriptionForce = message.voiceTranscriptionForce;
                        c0.voiceTranscriptionId = message.voiceTranscriptionId;
                        while (true) {
                            SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                            if (i5 >= 2) {
                                sQLiteDatabase2.commitTransaction();
                                SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                                if (sQLiteDatabase3 != null) {
                                    sQLiteDatabase3.commitTransaction();
                                    return;
                                }
                                return;
                            }
                            SQLitePreparedStatement executeFast3 = i5 == 0 ? sQLiteDatabase2.executeFast("UPDATE messages_v2 SET custom_params = ? WHERE mid = ? AND uid = ?") : sQLiteDatabase2.executeFast("UPDATE messages_topics SET custom_params = ? WHERE mid = ? AND uid = ?");
                            try {
                                executeFast3.requery();
                                NativeByteBuffer c = l17.c(c0);
                                if (c != null) {
                                    executeFast3.bindByteBuffer(1, c);
                                } else {
                                    executeFast3.bindNull(1);
                                }
                                executeFast3.bindInteger(2, i4);
                                executeFast3.bindLong(3, j7);
                                executeFast3.step();
                                executeFast3.dispose();
                                if (c != null) {
                                    c.reuse();
                                }
                                i5++;
                            } catch (Exception e2) {
                                e = e2;
                                sQLitePreparedStatement2 = executeFast3;
                                ad7Var.n(e, true);
                                SQLiteDatabase sQLiteDatabase4 = ad7Var.b;
                                if (sQLiteDatabase4 != null) {
                                    sQLiteDatabase4.commitTransaction();
                                }
                                if (sQLitePreparedStatement2 != null) {
                                    sQLitePreparedStatement2.dispose();
                                    return;
                                }
                                return;
                            } catch (Throwable th) {
                                th = th;
                                sQLitePreparedStatement4 = executeFast3;
                                SQLiteDatabase sQLiteDatabase5 = ad7Var.b;
                                if (sQLiteDatabase5 != null) {
                                    sQLiteDatabase5.commitTransaction();
                                }
                                if (sQLitePreparedStatement4 != null) {
                                    sQLitePreparedStatement4.dispose();
                                }
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            case 12:
                ad7 ad7Var2 = (ad7) obj2;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase6 = ad7Var2.b;
                        Locale locale = Locale.US;
                        queryFinalized = sQLiteDatabase6.queryFinalized("SELECT data FROM chats WHERE uid = " + j7, new Object[0]);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(0)) == null) {
                            chat = null;
                        } else {
                            chat = TLRPC.Chat.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            byteBufferValue.reuse();
                        }
                        queryFinalized.dispose();
                    } catch (Exception e4) {
                        e = e4;
                        sQLiteCursor = queryFinalized;
                        sQLitePreparedStatement = 0;
                    } catch (Throwable th4) {
                        th = th4;
                        sQLiteCursor = queryFinalized;
                        sQLitePreparedStatement = 0;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        if (sQLitePreparedStatement != 0) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    sQLitePreparedStatement = 0;
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = 0;
                }
                if (chat != null) {
                    if (chat.default_banned_rights == null || i4 >= chat.version) {
                        chat.default_banned_rights = tL_chatBannedRights;
                        chat.flags |= 262144;
                        chat.version = i4;
                        sQLitePreparedStatement = ad7Var2.b.executeFast("UPDATE chats SET data = ? WHERE uid = ?");
                        try {
                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(chat.getObjectSize());
                            chat.serializeToStream(nativeByteBuffer2);
                            sQLitePreparedStatement.bindByteBuffer(1, nativeByteBuffer2);
                            sQLitePreparedStatement.bindLong(2, chat.id);
                            sQLitePreparedStatement.step();
                            nativeByteBuffer2.reuse();
                            sQLitePreparedStatement.dispose();
                        } catch (Exception e6) {
                            e = e6;
                            ad7Var2.n(e, true);
                            if (sQLiteCursor != null) {
                                sQLiteCursor.dispose();
                            }
                            if (sQLitePreparedStatement != 0) {
                                sQLitePreparedStatement.dispose();
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                a();
                return;
            case 14:
                ad7 ad7Var3 = (ad7) obj2;
                String str = (String) obj;
                try {
                    try {
                        isEmpty = str.isEmpty();
                        sQLiteDatabase = ad7Var3.b;
                    } catch (Throwable th6) {
                        if (0 != 0) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th6;
                    }
                } catch (Exception e7) {
                    ad7Var3.n(e7, true);
                    if (0 == 0) {
                        return;
                    }
                }
                if (isEmpty) {
                    Locale locale2 = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM widget_state WHERE uid = " + j7 + " AND mid = " + i4).stepThis().dispose();
                    return;
                }
                sQLitePreparedStatement3 = sQLiteDatabase.executeFast("REPLACE INTO widget_state VALUES(?, ?, ?)");
                sQLitePreparedStatement3.bindLong(1, j7);
                sQLitePreparedStatement3.bindInteger(2, i4);
                sQLitePreparedStatement3.bindString(3, str);
                sQLitePreparedStatement3.step();
                sQLitePreparedStatement3.dispose();
                return;
            case 15:
                ((boolean[]) obj2)[0] = true;
                vp7.b.add(Long.valueOf(j7));
                vp7.j(j7, 60000L);
                vp7.d.put(vp7.a(i4, j7), Long.valueOf(SystemClock.elapsedRealtime() + 600000));
                vp7.c();
                m21 Q = vp7.h().Q(R.raw.contact_check, 36, k96.a0(null, null, 2131749570, (String) obj));
                Q.t = true;
                Q.j();
                return;
            case 16:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj2).getMessagesController().M1().a(i4, j7, (ArrayList) obj);
                return;
            case 17:
                b();
                return;
            case 18:
                ((u41) obj2).setLoading(false);
                fx0 fx0Var = ((fx0[]) obj)[0];
                if (fx0Var != null) {
                    fx0Var.dismiss();
                }
                gta.v(i4, false).O();
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(mu1.U9(j7));
                    return;
                }
                return;
            case 19:
                c();
                return;
            case 20:
                b1c b1cVar = (b1c) obj2;
                k27 k27Var3 = (k27) obj;
                k27Var3.k.originalLanguage = "und";
                b1cVar.getMessagesStorage().U1(j7, k27Var3.k);
                b1cVar.w.remove(Integer.valueOf(i4));
                return;
            default:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (wjb) obj, (Context) obj2);
                String M0 = k96.M0(2131742829, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = gl.S2(k96.V(null, null, 2131742827, c.C(i4).q(j7, true)));
                b00.t(null, 2131742819, alertDialog$Builder, null);
                return;
        }
    }

    public /* synthetic */ o57(Object obj, long j, int i, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = i;
        this.e = obj2;
    }

    public /* synthetic */ o57(Object obj, long j, Object obj2, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.e = obj2;
        this.d = i;
    }

    public /* synthetic */ o57(Object obj, Object obj2, int i, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.d = i;
        this.c = j;
    }

    public /* synthetic */ o57(Object obj, Object obj2, long j, int i, byte b) {
        this.a = b;
        this.b = obj;
        this.e = obj2;
        this.c = j;
        this.d = i;
    }
}
