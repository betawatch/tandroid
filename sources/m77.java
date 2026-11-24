// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class m77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ m77(g15 g15Var, y05 y05Var, p8c p8cVar, long j) {
        this.a = (byte) 10;
        this.b = g15Var;
        this.e = y05Var;
        this.d = p8cVar;
        this.c = j;
    }

    private final void a() {
        na7 na7Var = (na7) this.b;
        TLObject tLObject = (TLObject) this.d;
        qz5 qz5Var = (qz5) this.e;
        long j = this.c;
        if (tLObject != null) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            na7Var.a4(groupcall.users, false);
            na7Var.U3(groupcall.chats, false);
            fc2 fc2Var = new fc2();
            fc2Var.v(na7Var.getAccountInstance(), j, groupcall);
            na7Var.d1.k(fc2Var, groupcall.call.id);
            na7Var.e1.k(fc2Var, j);
            na7Var.getNotificationCenter().k(kk7.v2, Long.valueOf(j), Long.valueOf(groupcall.call.id), Boolean.FALSE);
            if (qz5Var != null) {
                qz5Var.run();
            }
        }
        na7Var.m1.remove(Long.valueOf(j));
    }

    private final void b() {
        na7 na7Var = (na7) this.b;
        String str = (String) this.d;
        Runnable runnable = (Runnable) this.e;
        TLRPC.Chat K0 = na7Var.K0(Long.valueOf(this.c));
        if (K0.usernames != null) {
            for (int i = 0; i < K0.usernames.size(); i++) {
                TLRPC.TL_username tL_username = K0.usernames.get(i);
                if (tL_username != null && tL_username.editable) {
                    tL_username.username = str;
                    break;
                }
            }
        }
        ArrayList<TLRPC.TL_username> arrayList = K0.usernames;
        if (arrayList == null || arrayList.size() >= 1) {
            if (K0.usernames == null) {
                K0.usernames = new ArrayList<>();
            }
            TLRPC.TL_username tL_username2 = new TLRPC.TL_username();
            tL_username2.username = str;
            tL_username2.active = true;
            tL_username2.editable = true;
            K0.usernames.add(0, tL_username2);
        } else {
            K0.username = str;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(K0);
        na7Var.getMessagesStorage().j1(null, arrayList2, true, true);
        na7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
        runnable.run();
    }

    private final void c() {
        na7 na7Var = (na7) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        SparseArray sparseArray = na7Var.V;
        vf6 vf6Var = na7Var.H1;
        long j = this.c;
        ArrayList arrayList3 = (ArrayList) vf6Var.f(j);
        if (arrayList3 != null) {
            arrayList3.removeAll(arrayList);
            if (arrayList3.isEmpty()) {
                vf6Var.l(j);
            }
        }
        ArrayList arrayList4 = (ArrayList) na7Var.S.f(j);
        if (arrayList4 != null) {
            for (int i = 0; i < arrayList4.size(); i++) {
                k27 k27Var = (k27) arrayList4.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList2.size()) {
                        k27 k27Var2 = (k27) arrayList2.get(i2);
                        if (k27Var.e1() == k27Var2.e1()) {
                            arrayList4.set(i, k27Var2);
                            if (k27Var2.k.peer_id.channel_id == 0) {
                                k27 k27Var3 = (k27) sparseArray.get(k27Var2.e1());
                                sparseArray.remove(k27Var2.e1());
                                if (k27Var3 != null) {
                                    sparseArray.put(k27Var3.e1(), k27Var3);
                                }
                            }
                            na7Var.getNotificationCenter().k(kk7.r, new Object[0]);
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        na7Var.getNotificationCenter().k(kk7.l0, Long.valueOf(j), arrayList2);
    }

    private final void d() {
        ad7 ad7Var = (ad7) this.b;
        ad7Var.getMessagesController().H((TLRPC.TL_dialog) this.d, (TLRPC.InputPeer) this.e, this.c);
    }

    private final void e() {
        long j;
        ad7 ad7Var = (ad7) this.b;
        TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) this.d;
        TLRPC.TL_messageReactions tL_messageReactions2 = (TLRPC.TL_messageReactions) this.e;
        vf6 vf6Var = new vf6();
        vf6 vf6Var2 = new vf6();
        if (tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
            for (int i = 0; i < tL_messageReactions.results.size(); i++) {
                h19 d = h19.d(tL_messageReactions.results.get(i).reaction);
                vf6Var.k(d, d.h);
            }
        }
        if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
            for (int i2 = 0; i2 < tL_messageReactions2.results.size(); i2++) {
                h19 d2 = h19.d(tL_messageReactions2.results.get(i2).reaction);
                vf6Var2.k(d2, d2.h);
            }
        }
        int i3 = 0;
        boolean z = false;
        while (true) {
            int m = vf6Var.m();
            j = this.c;
            if (i3 >= m) {
                break;
            }
            long j2 = vf6Var.j(i3);
            h19 h19Var = (h19) vf6Var.n(i3);
            if (!vf6Var2.d(j2)) {
                z = ad7Var.getMessagesController().x5(j, h19Var, false) || z;
            }
            i3++;
        }
        for (int i4 = 0; i4 < vf6Var2.m(); i4++) {
            long j3 = vf6Var2.j(i4);
            h19 h19Var2 = (h19) vf6Var2.n(i4);
            if (!vf6Var.d(j3)) {
                z = ad7Var.getMessagesController().x5(j, h19Var2, true) || z;
            }
        }
        if (z) {
            if (j != 0) {
                ad7Var.getMessagesController().v5(0L);
            }
            ad7Var.getMessagesController().v5(j);
        }
    }

    private final void f() {
        ad7 ad7Var = (ad7) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ad7Var.getFileLoader().g(arrayList);
        ad7Var.getMessagesController().m3(arrayList2, this.c);
    }

    private final void g() {
        ad7 ad7Var = (ad7) this.b;
        TLRPC.User[] userArr = (TLRPC.User[]) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        userArr[0] = ad7Var.g0(this.c);
        countDownLatch.countDown();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r5 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h() {
        ad7 ad7Var = (ad7) this.b;
        long j = this.c;
        Boolean[] boolArr = (Boolean[]) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = ad7Var.b.queryFinalized("SELECT date FROM dialogs WHERE did = " + j, new Object[0]);
                boolArr[0] = Boolean.valueOf(sQLiteCursor.next());
            } catch (Exception e) {
                ad7Var.n(e, true);
            }
            sQLiteCursor.dispose();
            countDownLatch.countDown();
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
    
        if (r6 == null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void i() {
        ad7 ad7Var = (ad7) this.b;
        long j = this.c;
        Integer[] numArr = (Integer[]) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        ad7Var.getClass();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = ad7Var.b.queryFinalized("SELECT pts FROM dialogs WHERE did = " + (-j), new Object[0]);
                if (sQLiteCursor.next()) {
                    numArr[0] = Integer.valueOf(sQLiteCursor.intValue(0));
                }
            } catch (Exception e) {
                ad7Var.n(e, true);
            }
            sQLiteCursor.dispose();
            try {
                countDownLatch.countDown();
            } catch (Exception e2) {
                ad7Var.n(e2, true);
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private final void j() {
        ad7 ad7Var = (ad7) this.b;
        TLRPC.Chat[] chatArr = (TLRPC.Chat[]) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        chatArr[0] = ad7Var.N(this.c);
        countDownLatch.countDown();
    }

    private final void k() {
        ad7 ad7Var = (ad7) this.b;
        long j = this.c;
        ArrayList arrayList = (ArrayList) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        try {
            try {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ad7Var.T(String.valueOf(j), arrayList3, arrayList2);
                if (!arrayList3.isEmpty() && !arrayList2.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    ad7Var.k0(arrayList2, arrayList4, false);
                    if (!arrayList4.isEmpty()) {
                        arrayList.add((TLObject) arrayList3.get(0));
                        arrayList.add((TLObject) arrayList4.get(0));
                    }
                }
            } catch (Exception e) {
                ad7Var.n(e, true);
            }
        } finally {
            countDownLatch.countDown();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0377  */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void l() {
        SQLitePreparedStatement sQLitePreparedStatement;
        vf6 vf6Var;
        int i;
        int i2;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        ?? r6;
        SQLiteCursor queryFinalized;
        SQLitePreparedStatement sQLitePreparedStatement3;
        SQLiteCursor sQLiteCursor;
        SQLitePreparedStatement sQLitePreparedStatement4;
        int i7;
        SQLiteCursor sQLiteCursor2;
        ad7 ad7Var = (ad7) this.b;
        long j = this.c;
        TLRPC.Poll poll = (TLRPC.Poll) this.d;
        TLRPC.PollResults pollResults = (TLRPC.PollResults) this.e;
        boolean z = true;
        SQLiteCursor sQLiteCursor3 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT uid, mid FROM polls_v2 WHERE id = " + j, new Object[0]);
                vf6 vf6Var2 = null;
                while (queryFinalized2.next()) {
                    try {
                        try {
                            try {
                                long longValue = queryFinalized2.longValue(0);
                                if (vf6Var2 == null) {
                                    vf6Var2 = new vf6();
                                }
                                ArrayList arrayList2 = (ArrayList) vf6Var2.f(longValue);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    vf6Var2.k(arrayList2, longValue);
                                }
                                arrayList2.add(Integer.valueOf(queryFinalized2.intValue(1)));
                            } catch (Exception e) {
                                e = e;
                                sQLiteCursor3 = queryFinalized2;
                                ad7Var.n(e, z);
                                if (sQLiteCursor3 != null) {
                                    sQLiteCursor3.dispose();
                                    return;
                                }
                                return;
                            }
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor3 = queryFinalized2;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        sQLiteCursor3 = queryFinalized2;
                    }
                }
                queryFinalized2.dispose();
                if (vf6Var2 != null) {
                    ad7Var.b.beginTransaction();
                    SQLitePreparedStatement executeFast = ad7Var.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                    SQLitePreparedStatement executeFast2 = ad7Var.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                    int m = vf6Var2.m();
                    for (int i8 = 0; i8 < m; i8++) {
                        long j2 = vf6Var2.j(i8);
                        ArrayList arrayList3 = (ArrayList) vf6Var2.n(i8);
                        int size = arrayList3.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Integer num = (Integer) arrayList3.get(i9);
                            SQLitePreparedStatement sQLitePreparedStatement5 = executeFast;
                            int i10 = size;
                            int i11 = 0;
                            boolean z2 = false;
                            while (i11 < 2) {
                                SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                                int i12 = i9;
                                if (i11 == 1) {
                                    Locale locale2 = Locale.US;
                                    try {
                                        StringBuilder sb = new StringBuilder();
                                        i6 = i11;
                                        sb.append("SELECT data FROM messages_topics WHERE mid = ");
                                        sb.append(num);
                                        sb.append(" AND uid = ");
                                        sb.append(j2);
                                        sQLiteCursor2 = sQLiteCursor3;
                                        try {
                                            queryFinalized = sQLiteDatabase2.queryFinalized(sb.toString(), new Object[0]);
                                            sQLitePreparedStatement3 = executeFast2;
                                            r6 = 0;
                                        } catch (Exception e3) {
                                            e = e3;
                                            sQLiteCursor3 = sQLiteCursor2;
                                            z = true;
                                            ad7Var.n(e, z);
                                            if (sQLiteCursor3 != null) {
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            sQLiteCursor3 = sQLiteCursor2;
                                            if (sQLiteCursor3 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e4) {
                                        e = e4;
                                        sQLiteCursor2 = sQLiteCursor3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLiteCursor2 = sQLiteCursor3;
                                    }
                                } else {
                                    i6 = i11;
                                    Locale locale3 = Locale.US;
                                    r6 = 0;
                                    queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data FROM messages_v2 WHERE mid = " + num + " AND uid = " + j2, new Object[0]);
                                    sQLitePreparedStatement3 = sQLitePreparedStatement5;
                                }
                                if (queryFinalized.next()) {
                                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r6);
                                    if (byteBufferValue != 0) {
                                        sQLiteCursor = queryFinalized;
                                        TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r6), r6);
                                        sQLitePreparedStatement4 = executeFast2;
                                        i7 = m;
                                        TLdeserialize.readAttachPath(byteBufferValue, ad7Var.getUserConfig().n);
                                        byteBufferValue.reuse();
                                        TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                            if (poll != null) {
                                                tL_messageMediaPoll.poll = poll;
                                            }
                                            if (pollResults != null) {
                                                k27.c6(tL_messageMediaPoll, pollResults);
                                            }
                                            k27.p5(TLdeserialize);
                                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(TLdeserialize.getObjectSize());
                                            TLdeserialize.serializeToStream(nativeByteBuffer);
                                            sQLitePreparedStatement3.requery();
                                            sQLitePreparedStatement3.bindByteBuffer(1, nativeByteBuffer);
                                            sQLitePreparedStatement3.bindInteger(2, num.intValue());
                                            sQLitePreparedStatement3.bindLong(3, j2);
                                            sQLitePreparedStatement3.step();
                                            nativeByteBuffer.reuse();
                                        }
                                    } else {
                                        sQLiteCursor = queryFinalized;
                                        sQLitePreparedStatement4 = executeFast2;
                                        i7 = m;
                                    }
                                    z2 = true;
                                } else {
                                    sQLiteCursor = queryFinalized;
                                    sQLitePreparedStatement4 = executeFast2;
                                    i7 = m;
                                }
                                sQLiteCursor.dispose();
                                i11 = i6 + 1;
                                i9 = i12;
                                sQLiteCursor3 = sQLiteCursor;
                                executeFast2 = sQLitePreparedStatement4;
                                m = i7;
                            }
                            int i13 = i9;
                            SQLiteCursor sQLiteCursor4 = sQLiteCursor3;
                            SQLitePreparedStatement sQLitePreparedStatement6 = executeFast2;
                            int i14 = m;
                            if (!z2) {
                                SQLiteDatabase sQLiteDatabase3 = ad7Var.b;
                                Locale locale4 = Locale.US;
                                sQLiteDatabase3.executeFast("DELETE FROM polls_v2 WHERE mid = " + num + " AND uid = " + j2).stepThis().dispose();
                            }
                            i9 = i13 + 1;
                            executeFast = sQLitePreparedStatement5;
                            size = i10;
                            sQLiteCursor3 = sQLiteCursor4;
                            executeFast2 = sQLitePreparedStatement6;
                            m = i14;
                        }
                    }
                    SQLitePreparedStatement sQLitePreparedStatement7 = executeFast2;
                    executeFast.dispose();
                    sQLitePreparedStatement7.dispose();
                    SQLitePreparedStatement executeFast3 = ad7Var.b.executeFast("UPDATE media_v4 SET data = ? WHERE mid = ? AND uid = ?");
                    SQLitePreparedStatement executeFast4 = ad7Var.b.executeFast("UPDATE media_topics SET data = ? WHERE mid = ? AND uid = ? AND topic_id = ?");
                    int m2 = vf6Var2.m();
                    SQLiteCursor sQLiteCursor5 = sQLiteCursor3;
                    int i15 = 0;
                    while (i15 < m2) {
                        try {
                            long j3 = vf6Var2.j(i15);
                            ArrayList arrayList4 = (ArrayList) vf6Var2.n(i15);
                            int size2 = arrayList4.size();
                            SQLiteCursor sQLiteCursor6 = sQLiteCursor5;
                            int i16 = 0;
                            while (i16 < size2) {
                                try {
                                    Integer num2 = (Integer) arrayList4.get(i16);
                                    SQLitePreparedStatement sQLitePreparedStatement8 = executeFast3;
                                    SQLiteCursor sQLiteCursor7 = sQLiteCursor6;
                                    int i17 = 0;
                                    while (i17 < 1) {
                                        boolean z3 = i17 == 1;
                                        try {
                                            SQLiteDatabase sQLiteDatabase4 = ad7Var.b;
                                            if (z3) {
                                                Locale locale5 = Locale.US;
                                                sQLitePreparedStatement = executeFast4;
                                                StringBuilder sb2 = new StringBuilder();
                                                vf6Var = vf6Var2;
                                                sb2.append("SELECT data, topic_id FROM media_topics WHERE mid = ");
                                                sb2.append(num2);
                                                sb2.append(" AND uid = ");
                                                sb2.append(j3);
                                                i = m2;
                                                queryFinalized2 = sQLiteDatabase4.queryFinalized(sb2.toString(), new Object[0]);
                                                sQLitePreparedStatement2 = sQLitePreparedStatement;
                                                i2 = 0;
                                            } else {
                                                sQLitePreparedStatement = executeFast4;
                                                vf6Var = vf6Var2;
                                                i = m2;
                                                Locale locale6 = Locale.US;
                                                i2 = 0;
                                                queryFinalized2 = sQLiteDatabase4.queryFinalized("SELECT data FROM media_v4 WHERE mid = " + num2 + " AND uid = " + j3, new Object[0]);
                                                sQLitePreparedStatement2 = sQLitePreparedStatement8;
                                            }
                                            try {
                                                if (queryFinalized2.next()) {
                                                    NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(i2);
                                                    i3 = i15;
                                                    long longValue2 = z3 ? queryFinalized2.longValue(1) : 0L;
                                                    if (byteBufferValue2 != null) {
                                                        sQLiteCursor7 = queryFinalized2;
                                                        i4 = i16;
                                                        TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(false), false);
                                                        arrayList = arrayList4;
                                                        i5 = size2;
                                                        TLdeserialize2.readAttachPath(byteBufferValue2, ad7Var.getUserConfig().n);
                                                        byteBufferValue2.reuse();
                                                        TLRPC.MessageMedia messageMedia2 = TLdeserialize2.media;
                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                            TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                            if (poll != null) {
                                                                tL_messageMediaPoll2.poll = poll;
                                                            }
                                                            if (pollResults != null) {
                                                                k27.c6(tL_messageMediaPoll2, pollResults);
                                                            }
                                                            k27.p5(TLdeserialize2);
                                                            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(TLdeserialize2.getObjectSize());
                                                            TLdeserialize2.serializeToStream(nativeByteBuffer2);
                                                            sQLitePreparedStatement2.requery();
                                                            sQLitePreparedStatement2.bindByteBuffer(1, nativeByteBuffer2);
                                                            sQLitePreparedStatement2.bindInteger(2, num2.intValue());
                                                            sQLitePreparedStatement2.bindLong(3, j3);
                                                            if (z3) {
                                                                sQLitePreparedStatement2.bindLong(4, longValue2);
                                                            }
                                                            sQLitePreparedStatement2.step();
                                                            nativeByteBuffer2.reuse();
                                                        }
                                                        sQLiteCursor7.dispose();
                                                        i17++;
                                                        i16 = i4;
                                                        executeFast4 = sQLitePreparedStatement;
                                                        vf6Var2 = vf6Var;
                                                        m2 = i;
                                                        arrayList4 = arrayList;
                                                        i15 = i3;
                                                        size2 = i5;
                                                    } else {
                                                        sQLiteCursor7 = queryFinalized2;
                                                    }
                                                } else {
                                                    sQLiteCursor7 = queryFinalized2;
                                                    i3 = i15;
                                                }
                                                i4 = i16;
                                                arrayList = arrayList4;
                                                i5 = size2;
                                                sQLiteCursor7.dispose();
                                                i17++;
                                                i16 = i4;
                                                executeFast4 = sQLitePreparedStatement;
                                                vf6Var2 = vf6Var;
                                                m2 = i;
                                                arrayList4 = arrayList;
                                                i15 = i3;
                                                size2 = i5;
                                            } catch (Exception e5) {
                                                e = e5;
                                                sQLiteCursor7 = queryFinalized2;
                                                sQLiteCursor3 = sQLiteCursor7;
                                                z = true;
                                                ad7Var.n(e, z);
                                                if (sQLiteCursor3 != null) {
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                sQLiteCursor7 = queryFinalized2;
                                                sQLiteCursor3 = sQLiteCursor7;
                                                if (sQLiteCursor3 != null) {
                                                    sQLiteCursor3.dispose();
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                        } catch (Throwable th5) {
                                            th = th5;
                                        }
                                    }
                                    i16++;
                                    sQLiteCursor6 = sQLiteCursor7;
                                    executeFast3 = sQLitePreparedStatement8;
                                    vf6Var2 = vf6Var2;
                                    arrayList4 = arrayList4;
                                } catch (Exception e7) {
                                    e = e7;
                                    sQLiteCursor3 = sQLiteCursor6;
                                } catch (Throwable th6) {
                                    th = th6;
                                    sQLiteCursor3 = sQLiteCursor6;
                                }
                            }
                            i15++;
                            sQLiteCursor5 = sQLiteCursor6;
                            vf6Var2 = vf6Var2;
                        } catch (Exception e8) {
                            e = e8;
                            sQLiteCursor3 = sQLiteCursor5;
                        } catch (Throwable th7) {
                            th = th7;
                            sQLiteCursor3 = sQLiteCursor5;
                        }
                    }
                    SQLitePreparedStatement sQLitePreparedStatement9 = executeFast4;
                    executeFast3.dispose();
                    sQLitePreparedStatement9.dispose();
                    ad7Var.b.commitTransaction();
                    sQLiteCursor3 = sQLiteCursor5;
                }
                if (sQLiteCursor3 != null) {
                    sQLiteCursor3.dispose();
                }
            } catch (Throwable th8) {
                th = th8;
            }
        } catch (Exception e9) {
            e = e9;
        }
    }

    private final void m() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        String str = (String) this.d;
        jm6 jm6Var = (jm6) this.e;
        Drawable[] drawableArr = PhotoViewer.f9;
        long j = this.c;
        s0c s0cVar = new s0c(photoViewer, str, jm6Var, j);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            gl.z0(photoViewer.D2, createBitmap, new h18(s0cVar, createBitmap, (byte) 7));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            s0cVar.a(z3a.r(jm6Var.I, j, null, true));
        } else {
            s0cVar.a(bitmap);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:(3:9|10|12)|6|7) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0131, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010f, code lost:
    
        r6 = r9;
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        wh9 wh9Var;
        un9 un9Var;
        y05 y05Var;
        byte b;
        byte[] decrypt_message_for_one;
        SerializedData serializedData;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte b2;
        byte[] bArr;
        byte[] bArr2;
        byte b3;
        char c;
        SQLiteCursor sQLiteCursor;
        boolean z;
        SQLiteDatabase sQLiteDatabase;
        long j;
        NativeByteBuffer byteBufferValue;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                na7 na7Var = (na7) this.b;
                p8c p8cVar = (p8c) this.d;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.e;
                long j2 = this.c;
                if (p8cVar != null) {
                    p8cVar.a(tL_messages_invitedUsers);
                    return;
                } else {
                    ij.f(na7Var.currentAccount, na7Var.K0(Long.valueOf(j2)), tL_messages_invitedUsers);
                    return;
                }
            case 1:
                na7 na7Var2 = (na7) this.b;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) this.d;
                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) this.e;
                long j3 = this.c;
                vf6 vf6Var = na7Var2.S;
                ConcurrentHashMap concurrentHashMap = na7Var2.Q;
                ConcurrentHashMap concurrentHashMap2 = na7Var2.P;
                na7Var2.a4(tL_help_promoData.users, false);
                na7Var2.U3(tL_help_promoData.chats, false);
                na7Var2.a4(tL_messages_peerDialogs.users, false);
                na7Var2.U3(tL_messages_peerDialogs.chats, false);
                TLRPC.Dialog dialog = na7Var2.q2;
                if (dialog != null) {
                    long j4 = dialog.id;
                    if (j4 < 0) {
                        TLRPC.Chat K0 = na7Var2.K0(Long.valueOf(-j4));
                        if (hc2.r0(K0) || K0.restricted) {
                            na7Var2.h4(na7Var2.q2);
                        }
                    } else {
                        na7Var2.h4(dialog);
                    }
                }
                TLRPC.Dialog dialog2 = tL_messages_peerDialogs.dialogs.get(0);
                na7Var2.q2 = dialog2;
                dialog2.id = j3;
                dialog2.folder_id = 0;
                if (cf3.x(dialog2)) {
                    LongSparseIntArray longSparseIntArray = na7Var2.P0;
                    TLRPC.Dialog dialog3 = na7Var2.q2;
                    longSparseIntArray.put(-dialog3.id, dialog3.pts);
                }
                Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(na7Var2.q2.id));
                if (num == null) {
                    num = r12;
                }
                concurrentHashMap2.put(Long.valueOf(na7Var2.q2.id), Integer.valueOf(Math.max(num.intValue(), na7Var2.q2.read_inbox_max_id)));
                Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(na7Var2.q2.id));
                concurrentHashMap.put(Long.valueOf(na7Var2.q2.id), Integer.valueOf(Math.max((num2 != null ? num2 : 0).intValue(), na7Var2.q2.read_outbox_max_id)));
                na7Var2.R.k(na7Var2.q2, j3);
                if (!tL_messages_peerDialogs.messages.isEmpty()) {
                    vf6 vf6Var2 = new vf6();
                    vf6 vf6Var3 = new vf6();
                    for (int i = 0; i < tL_messages_peerDialogs.users.size(); i++) {
                        TLRPC.User user = tL_messages_peerDialogs.users.get(i);
                        vf6Var2.k(user, user.id);
                    }
                    for (int i2 = 0; i2 < tL_messages_peerDialogs.chats.size(); i2++) {
                        TLRPC.Chat chat = tL_messages_peerDialogs.chats.get(i2);
                        vf6Var3.k(chat, chat.id);
                    }
                    k27 k27Var = new k27(na7Var2.currentAccount, tL_messages_peerDialogs.messages.get(0), vf6Var2, vf6Var3, false, true);
                    ArrayList arrayList = (ArrayList) vf6Var.f(j3);
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    if (arrayList.size() > 0 && arrayList.get(0) != null && ((k27) arrayList.get(0)).z2() && ((k27) arrayList.get(0)).d1() != k27Var.d1()) {
                        arrayList.clear();
                    }
                    arrayList.add(k27Var);
                    vf6Var.k(arrayList, j3);
                    TLRPC.Dialog dialog4 = na7Var2.q2;
                    if (dialog4.last_message_date == 0) {
                        dialog4.last_message_date = k27Var.k.date;
                    }
                    na7Var2.i4.c(j3);
                }
                na7Var2.Y4(null);
                na7Var2.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 2:
                h30 h30Var = (h30) this.b;
                f30 f30Var = (f30) this.d;
                long j5 = this.c;
                byte[] bArr3 = (byte[]) this.e;
                if (h30Var.G == 7) {
                    long length = f30Var.b.length();
                    h30Var.a(f30Var, length);
                    synchronized (h30Var.l) {
                        if (f30Var.d && !f30Var.e) {
                            f30Var.e = true;
                            h30Var.k.execute(new v20(h30Var, f30Var, length, j5, (byte) 2));
                            h30Var.C = new m20(f30Var.b, j5, bArr3);
                            h30Var.s(8);
                            lv6 lv6Var = h30Var.f;
                            m20 m20Var = h30Var.C;
                            MediaController mediaController = ((ml6) lv6Var.b).a;
                            String[] strArr = MediaController.W1;
                            mediaController.n(m20Var);
                            h30Var.c();
                            h30Var.t();
                            h30Var.l("completed");
                        }
                    }
                    return;
                }
                return;
            case 3:
                zz0 zz0Var = (zz0) this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                vy0 vy0Var = (vy0) this.e;
                long j6 = this.c;
                if (arrayList2 != null && (wh9Var = zz0Var.f) != null && (un9Var = ((ao9) wh9Var.b).d) != null) {
                    un9Var.onStreamChannels(arrayList2);
                }
                vy0Var.a(j6);
                return;
            case 4:
                ((CameraController) this.b).lambda$finishRecordingVideo$15((File) this.d, (Bitmap) this.e, this.c);
                return;
            case 5:
                x02 x02Var = (x02) this.b;
                long j7 = this.c;
                mu1 mu1Var = (mu1) this.d;
                wjb wjbVar = (wjb) this.e;
                Context context = x02Var.getContext();
                int i3 = x02Var.G3;
                u47 u47Var = mu1Var.y5;
                if (u47Var == null) {
                    u47Var = u47.a();
                }
                new t47(context, i3, j7, u47Var, mu1Var, wjbVar, 0, new pz1((Object) x02Var, (Object) mu1Var, (byte) 1)).show();
                return;
            case 6:
                qb2 qb2Var = (qb2) this.b;
                k27 k27Var2 = (k27) this.d;
                long j8 = this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                boolean g3 = k27Var2.g3();
                mu1 mu1Var2 = qb2Var.a;
                s2b.a(mu1Var2.getCurrentAccount(), j8, k27Var2, storyItem);
                ArrayList arrayList3 = new ArrayList();
                k27Var2.M1 = true;
                arrayList3.add(k27Var2);
                mu1Var2.getMessagesStorage().a.c(new n92(qb2Var, arrayList3, (byte) 9));
                if (!g3 && k27Var2.g3() && k27Var2.D == 24) {
                    mu1Var2.Nc(arrayList3, true);
                    return;
                } else {
                    mu1Var2.Nc(arrayList3, false);
                    return;
                }
            case 7:
                cj3 cj3Var = (cj3) this.b;
                t97 t97Var = (t97) this.d;
                TLRPC.Dialog dialog5 = (TLRPC.Dialog) this.e;
                long j9 = this.c;
                int i4 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (t97Var != null) {
                    LongSparseIntArray longSparseIntArray2 = t97Var.j;
                    if (cj3Var.F3(dialog5)) {
                        int size = longSparseIntArray2.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            i4 = Math.min(i4, longSparseIntArray2.valueAt(i5));
                        }
                        i4 -= cj3Var.Q2;
                    }
                }
                int i6 = i4;
                TLRPC.EncryptedChat Y0 = cf3.B(j9) ? cj3Var.getMessagesController().Y0(Integer.valueOf((int) (4294967295L & j9))) : null;
                UndoView u3 = cj3Var.u3();
                if (u3 != null) {
                    if (cj3Var.F3(dialog5)) {
                        cj3Var.H4(j9, false, t97Var, i6, true);
                        u3.k(0L, 79, 1, 1600, null, null);
                    } else {
                        cj3Var.H4(j9, true, t97Var, i6, true);
                        u3.k(0L, 78, 1, 1600, null, null);
                        if (t97Var != null) {
                            ArrayList arrayList4 = t97Var.h;
                            if (Y0 != null) {
                                if (!arrayList4.contains(Long.valueOf(Y0.user_id))) {
                                    t97Var.h.add(Long.valueOf(Y0.user_id));
                                }
                            } else if (!arrayList4.contains(Long.valueOf(j9))) {
                                t97Var.h.add(Long.valueOf(j9));
                            }
                        }
                    }
                    if (t97Var != null) {
                        pd4.y0(t97Var, t97Var.g, t97Var.b, t97Var.c, t97Var.n, t97Var.m, t97Var.h, t97Var.i, t97Var.j, false, false, true, true, false, cj3Var, null);
                    }
                    cj3Var.getMessagesController().o4(cj3Var.Y2, 0L, null);
                    cj3Var.l5(true);
                    if (cj3Var.f0 != null) {
                        int i7 = 0;
                        while (true) {
                            bj3[] bj3VarArr = cj3Var.f0;
                            if (i7 < bj3VarArr.length) {
                                bj3VarArr[i7].d.I = false;
                                i7++;
                            }
                        }
                    }
                    int i8 = na7.q5;
                    cj3Var.C5(196608, true);
                    return;
                }
                return;
            case 8:
                c cVar = (c) this.b;
                TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
                long j10 = this.c;
                p pVar = (p) this.e;
                int i9 = 0;
                byte[] bArr4 = null;
                while (true) {
                    try {
                        if (i9 < encryptedsecretphrasepartArr.length) {
                            byte[] copyOfRange = Arrays.copyOfRange(encryptedsecretphrasepartArr[i9].data, 0, 32);
                            byte[] bArr5 = encryptedsecretphrasepartArr[i9].data;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr5, 32, bArr5.length);
                            long key_from_public_key = ConferenceCall.key_from_public_key(copyOfRange);
                            decrypt_message_for_one = ConferenceCall.decrypt_message_for_one(ConferenceCall.key_from_ecdh(j10, key_from_public_key), copyOfRange2);
                            ConferenceCall.key_destroy(key_from_public_key);
                            serializedData = new SerializedData(decrypt_message_for_one);
                            try {
                                mnemonic_decryptedkeypart = TL_wallet.mnemonic_decryptedKeyPart.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                                if (mnemonic_decryptedkeypart != null) {
                                    try {
                                        byte[] bArr6 = mnemonic_decryptedkeypart.share;
                                        if (bArr6 != null) {
                                            if (bArr4 == null) {
                                                bArr4 = (byte[]) bArr6.clone();
                                            } else if (bArr6.length != bArr4.length) {
                                                c.m("getSecretPhrase: part " + i9 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr4.length);
                                                pVar.a(null, "WALLET_PART_SHARE_UNEQUAL_LENGHTS");
                                                byte[] bArr7 = mnemonic_decryptedkeypart.share;
                                                if (bArr7 != null) {
                                                    b = 0;
                                                    Arrays.fill(bArr7, (byte) 0);
                                                } else {
                                                    b = 0;
                                                }
                                                Arrays.fill(decrypt_message_for_one, b);
                                                serializedData.cleanup();
                                            } else {
                                                for (int i10 = 0; i10 < bArr4.length; i10++) {
                                                    bArr4[i10] = (byte) (bArr4[i10] ^ mnemonic_decryptedkeypart.share[i10]);
                                                }
                                            }
                                            byte[] bArr8 = mnemonic_decryptedkeypart.share;
                                            if (bArr8 != null) {
                                                b3 = 0;
                                                Arrays.fill(bArr8, (byte) 0);
                                            } else {
                                                b3 = 0;
                                            }
                                            Arrays.fill(decrypt_message_for_one, b3);
                                            serializedData.cleanup();
                                            i9++;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (mnemonic_decryptedkeypart == null || (bArr = mnemonic_decryptedkeypart.share) == null) {
                                            b2 = 0;
                                        } else {
                                            b2 = 0;
                                            Arrays.fill(bArr, (byte) 0);
                                        }
                                        Arrays.fill(decrypt_message_for_one, b2);
                                        serializedData.cleanup();
                                        throw th;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                mnemonic_decryptedkeypart = null;
                            }
                        } else if (bArr4 == null) {
                            c.m("getSecretPhrase: no parts???");
                            pVar.a(null, "WALLET_NO_PARTS");
                            if (bArr4 == null) {
                                return;
                            } else {
                                b = 0;
                            }
                        } else {
                            y05Var = new y05(bArr4);
                            try {
                                Arrays.fill(bArr4, (byte) 0);
                                byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(y05Var);
                                TL_wallet.WalletState walletState = cVar.e;
                                byte[] bArr9 = walletState instanceof TL_wallet.TL_walletState ? ((TL_wallet.TL_walletState) walletState).public_key : null;
                                if (secretPhraseToPublicKey != null && bArr9 != null && Arrays.equals(secretPhraseToPublicKey, bArr9)) {
                                    Arrays.fill(bArr4, (byte) 0);
                                    c.O("getSecretPhrase, received the phrase!");
                                    pVar.a(y05Var, null);
                                    return;
                                }
                                c.m("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.f(bArr9) + " derived=" + Utilities.f(secretPhraseToPublicKey));
                                y05Var.close();
                                pVar.a(null, "WALLET_WORDS_DONT_MATCH");
                                b = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                if (y05Var != null) {
                                    try {
                                        y05Var.close();
                                    } finally {
                                        if (bArr4 != null) {
                                            Arrays.fill(bArr4, (byte) 0);
                                        }
                                    }
                                }
                                pVar.a(null, th.getMessage() == null ? "NULL_ERROR" : th.getMessage());
                                c.n("getSecretPhrase: encryption error", th);
                                if (bArr4 != null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        y05Var = null;
                    }
                }
                c.m("getSecretPhrase: couldn't decrypt " + i9 + " part");
                pVar.a(null, "WALLET_PART_" + i9 + "_CANT_DECRYPT");
                if (mnemonic_decryptedkeypart == null || (bArr2 = mnemonic_decryptedkeypart.share) == null) {
                    b = 0;
                } else {
                    b = 0;
                    Arrays.fill(bArr2, (byte) 0);
                }
                Arrays.fill(decrypt_message_for_one, b);
                serializedData.cleanup();
                if (bArr4 != null) {
                    Arrays.fill(bArr4, b);
                    return;
                }
                return;
            case 9:
                g15 g15Var = (g15) this.b;
                p8c p8cVar2 = (p8c) this.d;
                long j11 = this.c;
                String str = (String) this.e;
                if (p8cVar2 != null) {
                    if (j11 != g15Var.l()) {
                        str = "STORAGE_CANCELED";
                    }
                    p8cVar2.a(str);
                    return;
                }
                return;
            case 10:
                g15 g15Var2 = (g15) this.b;
                y05 y05Var2 = (y05) this.e;
                try {
                    new p0c((Object) g15Var2, this.d, this.c, (byte) 4).a(y05Var2);
                    if (y05Var2 != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (y05Var2 != null) {
                        y05Var2.close();
                    }
                }
            case 11:
                h75 h75Var = (h75) this.b;
                long j12 = this.c;
                hd[] hdVarArr = (hd[]) this.d;
                TLRPC.User user2 = (TLRPC.User) this.e;
                fc2 fc2Var = h75Var.T2;
                if (fc2Var == null || h75Var.l2) {
                    return;
                }
                fc2Var.a(j12);
                h75Var.D0(true);
                rb5 rb5Var = h75Var.y3;
                if (rb5Var != null) {
                    rb5Var.dismiss();
                }
                try {
                    hdVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                hdVarArr[0] = null;
                h75Var.c1().k(0L, 34, user2, h75Var.S2, null, null);
                return;
            case 12:
                TLObject tLObject = (TLObject) this.d;
                na7 na7Var3 = (na7) this.b;
                long j13 = this.c;
                sx5 sx5Var = (sx5) this.e;
                String str2 = LaunchActivity.C1;
                if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
                    sx5Var.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                na7Var3.a4(tL_stories_peerStories.users, false);
                na7Var3.M1().c0(j13, tL_stories_peerStories.stories);
                sx5Var.run();
                return;
            case 13:
                rz5 rz5Var = (rz5) this.b;
                LaunchActivity launchActivity = rz5Var.h;
                String str3 = (String) this.d;
                long j14 = this.c;
                d dVar = (d) this.e;
                if (str3 != null) {
                    j5 a = j5.a(launchActivity.P);
                    int i11 = a.a;
                    long j15 = -j14;
                    if (na7.q1(i11).e1(j15, false, null) != null) {
                        TLRPC.Chat K02 = na7.q1(i11).K0(Long.valueOf(j15));
                        na7.q1(i11).h1(j14);
                        rgc.l(K02, null, false, Boolean.valueOf(!r1.b.rtmp_stream), launchActivity, dVar, a);
                        return;
                    }
                    TLRPC.ChatFull L0 = na7.q1(i11).L0(j15);
                    if (L0 != null) {
                        if (L0.call != null) {
                            na7.q1(i11).e1(j15, true, new qz5(rz5Var, a, j14, dVar, (byte) 0));
                            return;
                        } else {
                            if (dVar.getParentActivity() != null) {
                                ir2.v(null, 2131748960, u21.b0(dVar), R.raw.linkbroken, 36);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 14:
                hq6 hq6Var = (hq6) this.b;
                pob pobVar = (pob) this.d;
                long j16 = this.c;
                ArrayList arrayList5 = (ArrayList) this.e;
                qob.a(pobVar);
                hq6Var.getNotificationCenter().k(55, Long.valueOf(j16), arrayList5, null);
                return;
            case 15:
                a();
                return;
            case 16:
                na7 na7Var4 = (na7) this.b;
                long j17 = this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) this.e;
                na7Var4.R0.e(j17);
                if (arrayList6 != null) {
                    c = 0;
                    na7Var4.q5(0, -j17, arrayList6);
                    na7Var4.getNotificationCenter().k(3, new Object[0]);
                } else {
                    c = 0;
                }
                kk7 notificationCenter = na7Var4.getNotificationCenter();
                Long valueOf = Long.valueOf(j17);
                Long valueOf2 = Long.valueOf(tL_channels_channelParticipant.participant.inviter_id);
                Object[] objArr = new Object[2];
                objArr[c] = valueOf;
                objArr[1] = valueOf2;
                notificationCenter.k(kk7.s1, objArr);
                return;
            case 17:
                b();
                return;
            case 18:
                c();
                return;
            case 19:
                d();
                return;
            case 20:
                e();
                return;
            case 21:
                f();
                return;
            case 22:
                g();
                return;
            case 23:
                h();
                return;
            case 24:
                i();
                return;
            case 25:
                j();
                return;
            case 26:
                k();
                return;
            case 27:
                l();
                return;
            case 28:
                m();
                return;
            default:
                ox8 ox8Var = (ox8) this.b;
                ad7 ad7Var = (ad7) this.d;
                long j18 = this.c;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase2 = ad7Var.b;
                    SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            try {
                                nx8 nx8Var = new nx8();
                                nx8Var.a = queryFinalized.intValue(0);
                                nx8Var.b = queryFinalized.stringValue(1);
                                nx8Var.c = queryFinalized.intValue(2);
                                nx8Var.f = queryFinalized.intValue(3);
                                arrayList7.add(nx8Var);
                            } catch (Exception e) {
                                e = e;
                                z = true;
                                sQLiteCursor = queryFinalized;
                                try {
                                    fa4.g(e, z);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    gl.d3(new ex7((Object) ox8Var, (Object) arrayList8, (Object) arrayList9, (Object) arrayList7, (Object) runnable, (byte) 16));
                                    return;
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            sQLiteCursor = queryFinalized;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList7.size()) {
                        nx8 nx8Var2 = (nx8) arrayList7.get(i12);
                        boolean z3 = z2;
                        int i13 = i12;
                        Object[] objArr2 = new Object[1];
                        objArr2[z3 ? 1 : 0] = Integer.valueOf(nx8Var2.a);
                        queryFinalized = sQLiteDatabase2.queryFinalized("SELECT data, send_state, mid, date, topic_id, ttl FROM quick_replies_messages WHERE topic_id = ? ORDER BY mid ASC", objArr2);
                        if (!queryFinalized.next() || (byteBufferValue = queryFinalized.byteBufferValue(z3 ? 1 : 0)) == null) {
                            sQLiteDatabase = sQLiteDatabase2;
                            j = j18;
                        } else {
                            TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z3), z3);
                            sQLiteDatabase = sQLiteDatabase2;
                            TLdeserialize.send_state = queryFinalized.intValue(1);
                            TLdeserialize.readAttachPath(byteBufferValue, j18);
                            byteBufferValue.reuse();
                            TLdeserialize.id = queryFinalized.intValue(2);
                            TLdeserialize.date = queryFinalized.intValue(3);
                            TLdeserialize.flags |= TLObject.FLAG_30;
                            TLdeserialize.quick_reply_shortcut_id = queryFinalized.intValue(4);
                            TLdeserialize.ttl = queryFinalized.intValue(5);
                            ad7.d(TLdeserialize, arrayList10, arrayList11, null);
                            j = j18;
                            k27 k27Var3 = new k27(ox8Var.a, TLdeserialize, false, true);
                            nx8Var2.e = k27Var3;
                            nx8Var2.d = TLdeserialize.id;
                            k27Var3.r0(false);
                            nx8Var2.e.l(nx8Var2.a, nx8Var2.b);
                        }
                        queryFinalized.dispose();
                        i12 = i13 + 1;
                        sQLiteDatabase2 = sQLiteDatabase;
                        j18 = j;
                        z2 = false;
                    }
                    if (!arrayList11.isEmpty()) {
                        ad7Var.P(TextUtils.join(",", arrayList11), arrayList9);
                    }
                    if (!arrayList10.isEmpty()) {
                        ad7Var.k0(arrayList10, arrayList8, false);
                    }
                    queryFinalized.dispose();
                } catch (Exception e2) {
                    e = e2;
                    z = true;
                    sQLiteCursor = null;
                } catch (Throwable th7) {
                    th = th7;
                    sQLiteCursor = null;
                }
                gl.d3(new ex7((Object) ox8Var, (Object) arrayList8, (Object) arrayList9, (Object) arrayList7, (Object) runnable, (byte) 16));
                return;
        }
    }

    public /* synthetic */ m77(Object obj, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ m77(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
        this.e = obj3;
    }

    public /* synthetic */ m77(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j;
    }

    public /* synthetic */ m77(TLObject tLObject, na7 na7Var, long j, sx5 sx5Var) {
        this.a = (byte) 12;
        this.d = tLObject;
        this.b = na7Var;
        this.c = j;
        this.e = sx5Var;
    }
}
