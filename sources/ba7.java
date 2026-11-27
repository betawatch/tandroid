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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ba7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ba7(k35 k35Var, c35 c35Var, pcc pccVar, long j) {
        this.a = (byte) 10;
        this.b = k35Var;
        this.e = c35Var;
        this.d = pccVar;
        this.c = j;
    }

    private final void a() {
        uc7 uc7Var = (uc7) this.b;
        TLObject tLObject = (TLObject) this.d;
        t16 t16Var = (t16) this.e;
        long j = this.c;
        if (tLObject != null) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            uc7Var.j4(groupcall.users, false);
            uc7Var.c4(groupcall.chats, false);
            vc2 vc2Var = new vc2();
            vc2Var.v(uc7Var.getAccountInstance(), j, groupcall);
            uc7Var.d1.k(groupcall.call.id, vc2Var);
            uc7Var.e1.k(j, vc2Var);
            uc7Var.getNotificationCenter().k(jn7.w2, Long.valueOf(j), Long.valueOf(groupcall.call.id), Boolean.FALSE);
            if (t16Var != null) {
                t16Var.run();
            }
        }
        uc7Var.m1.remove(Long.valueOf(j));
    }

    private final void b() {
        uc7 uc7Var = (uc7) this.b;
        String str = (String) this.d;
        Runnable runnable = (Runnable) this.e;
        TLRPC.Chat M0 = uc7Var.M0(Long.valueOf(this.c));
        if (M0.usernames != null) {
            for (int i = 0; i < M0.usernames.size(); i++) {
                TLRPC.TL_username tL_username = M0.usernames.get(i);
                if (tL_username != null && tL_username.editable) {
                    tL_username.username = str;
                    break;
                }
            }
        }
        ArrayList<TLRPC.TL_username> arrayList = M0.usernames;
        if (arrayList == null || arrayList.size() >= 1) {
            if (M0.usernames == null) {
                M0.usernames = new ArrayList<>();
            }
            TLRPC.TL_username tL_username2 = new TLRPC.TL_username();
            tL_username2.username = str;
            tL_username2.active = true;
            tL_username2.editable = true;
            M0.usernames.add(0, tL_username2);
        } else {
            M0.username = str;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(M0);
        uc7Var.getMessagesStorage().j1(null, arrayList2, true, true);
        uc7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
        runnable.run();
    }

    private final void c() {
        uc7 uc7Var = (uc7) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        SparseArray sparseArray = uc7Var.V;
        zh6 zh6Var = uc7Var.H1;
        long j = this.c;
        ArrayList arrayList3 = (ArrayList) zh6Var.f(j);
        if (arrayList3 != null) {
            arrayList3.removeAll(arrayList);
            if (arrayList3.isEmpty()) {
                zh6Var.l(j);
            }
        }
        ArrayList arrayList4 = (ArrayList) uc7Var.S.f(j);
        if (arrayList4 != null) {
            for (int i = 0; i < arrayList4.size(); i++) {
                r47 r47Var = (r47) arrayList4.get(i);
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList2.size()) {
                        r47 r47Var2 = (r47) arrayList2.get(i2);
                        if (r47Var.e1() == r47Var2.e1()) {
                            arrayList4.set(i, r47Var2);
                            if (r47Var2.k.peer_id.channel_id == 0) {
                                r47 r47Var3 = (r47) sparseArray.get(r47Var2.e1());
                                sparseArray.remove(r47Var2.e1());
                                if (r47Var3 != null) {
                                    sparseArray.put(r47Var3.e1(), r47Var3);
                                }
                            }
                            uc7Var.getNotificationCenter().k(jn7.r, new Object[0]);
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        uc7Var.getNotificationCenter().k(jn7.m0, Long.valueOf(j), arrayList2);
    }

    private final void d() {
        jf7 jf7Var = (jf7) this.b;
        jf7Var.getMessagesController().J((TLRPC.TL_dialog) this.d, (TLRPC.InputPeer) this.e, this.c);
    }

    private final void e() {
        long j;
        jf7 jf7Var = (jf7) this.b;
        TLRPC.TL_messageReactions tL_messageReactions = (TLRPC.TL_messageReactions) this.d;
        TLRPC.TL_messageReactions tL_messageReactions2 = (TLRPC.TL_messageReactions) this.e;
        zh6 zh6Var = new zh6();
        zh6 zh6Var2 = new zh6();
        if (tL_messageReactions.results != null && tL_messageReactions.reactions_as_tags) {
            for (int i = 0; i < tL_messageReactions.results.size(); i++) {
                w49 d = w49.d(tL_messageReactions.results.get(i).reaction);
                zh6Var.k(d.h, d);
            }
        }
        if (tL_messageReactions2 != null && tL_messageReactions2.results != null && tL_messageReactions2.reactions_as_tags) {
            for (int i2 = 0; i2 < tL_messageReactions2.results.size(); i2++) {
                w49 d2 = w49.d(tL_messageReactions2.results.get(i2).reaction);
                zh6Var2.k(d2.h, d2);
            }
        }
        int i3 = 0;
        boolean z = false;
        while (true) {
            int m = zh6Var.m();
            j = this.c;
            if (i3 >= m) {
                break;
            }
            long j2 = zh6Var.j(i3);
            w49 w49Var = (w49) zh6Var.n(i3);
            if (!zh6Var2.d(j2)) {
                z = jf7Var.getMessagesController().G5(j, w49Var, false) || z;
            }
            i3++;
        }
        for (int i4 = 0; i4 < zh6Var2.m(); i4++) {
            long j3 = zh6Var2.j(i4);
            w49 w49Var2 = (w49) zh6Var2.n(i4);
            if (!zh6Var.d(j3)) {
                z = jf7Var.getMessagesController().G5(j, w49Var2, true) || z;
            }
        }
        if (z) {
            if (j != 0) {
                jf7Var.getMessagesController().E5(0L);
            }
            jf7Var.getMessagesController().E5(j);
        }
    }

    private final void f() {
        jf7 jf7Var = (jf7) this.b;
        TLRPC.User[] userArr = (TLRPC.User[]) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        userArr[0] = jf7Var.g0(this.c);
        countDownLatch.countDown();
    }

    private final void g() {
        jf7 jf7Var = (jf7) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        jf7Var.getFileLoader().g(arrayList);
        jf7Var.getMessagesController().t3(arrayList2, this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r5 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h() {
        jf7 jf7Var = (jf7) this.b;
        long j = this.c;
        Boolean[] boolArr = (Boolean[]) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = jf7Var.b.queryFinalized("SELECT date FROM dialogs WHERE did = " + j, new Object[0]);
                boolArr[0] = Boolean.valueOf(sQLiteCursor.next());
            } catch (Exception e) {
                jf7Var.n(e, true);
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
        jf7 jf7Var = (jf7) this.b;
        long j = this.c;
        Integer[] numArr = (Integer[]) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        jf7Var.getClass();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = jf7Var.b.queryFinalized("SELECT pts FROM dialogs WHERE did = " + (-j), new Object[0]);
                if (sQLiteCursor.next()) {
                    numArr[0] = Integer.valueOf(sQLiteCursor.intValue(0));
                }
            } catch (Exception e) {
                jf7Var.n(e, true);
            }
            sQLiteCursor.dispose();
            try {
                countDownLatch.countDown();
            } catch (Exception e2) {
                jf7Var.n(e2, true);
            }
        } catch (Throwable th) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th;
        }
    }

    private final void j() {
        jf7 jf7Var = (jf7) this.b;
        TLRPC.Chat[] chatArr = (TLRPC.Chat[]) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        chatArr[0] = jf7Var.N(this.c);
        countDownLatch.countDown();
    }

    private final void k() {
        jf7 jf7Var = (jf7) this.b;
        long j = this.c;
        ArrayList arrayList = (ArrayList) this.d;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        try {
            try {
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                jf7Var.T(String.valueOf(j), arrayList3, arrayList2);
                if (!arrayList3.isEmpty() && !arrayList2.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    jf7Var.k0(arrayList2, arrayList4, false);
                    if (!arrayList4.isEmpty()) {
                        arrayList.add((TLObject) arrayList3.get(0));
                        arrayList.add((TLObject) arrayList4.get(0));
                    }
                }
            } catch (Exception e) {
                jf7Var.n(e, true);
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
        zh6 zh6Var;
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
        jf7 jf7Var = (jf7) this.b;
        long j = this.c;
        TLRPC.Poll poll = (TLRPC.Poll) this.d;
        TLRPC.PollResults pollResults = (TLRPC.PollResults) this.e;
        boolean z = true;
        SQLiteCursor sQLiteCursor3 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = jf7Var.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT uid, mid FROM polls_v2 WHERE id = " + j, new Object[0]);
                zh6 zh6Var2 = null;
                while (queryFinalized2.next()) {
                    try {
                        try {
                            try {
                                long longValue = queryFinalized2.longValue(0);
                                if (zh6Var2 == null) {
                                    zh6Var2 = new zh6();
                                }
                                ArrayList arrayList2 = (ArrayList) zh6Var2.f(longValue);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList();
                                    zh6Var2.k(longValue, arrayList2);
                                }
                                arrayList2.add(Integer.valueOf(queryFinalized2.intValue(1)));
                            } catch (Exception e) {
                                e = e;
                                sQLiteCursor3 = queryFinalized2;
                                jf7Var.n(e, z);
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
                if (zh6Var2 != null) {
                    jf7Var.b.beginTransaction();
                    SQLitePreparedStatement executeFast = jf7Var.b.executeFast("UPDATE messages_v2 SET data = ? WHERE mid = ? AND uid = ?");
                    SQLitePreparedStatement executeFast2 = jf7Var.b.executeFast("UPDATE messages_topics SET data = ? WHERE mid = ? AND uid = ?");
                    int m = zh6Var2.m();
                    for (int i8 = 0; i8 < m; i8++) {
                        long j2 = zh6Var2.j(i8);
                        ArrayList arrayList3 = (ArrayList) zh6Var2.n(i8);
                        int size = arrayList3.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Integer num = (Integer) arrayList3.get(i9);
                            SQLitePreparedStatement sQLitePreparedStatement5 = executeFast;
                            int i10 = size;
                            int i11 = 0;
                            boolean z2 = false;
                            while (i11 < 2) {
                                SQLiteDatabase sQLiteDatabase2 = jf7Var.b;
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
                                            jf7Var.n(e, z);
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
                                        TLdeserialize.readAttachPath(byteBufferValue, jf7Var.getUserConfig().n);
                                        byteBufferValue.reuse();
                                        TLRPC.MessageMedia messageMedia = TLdeserialize.media;
                                        if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                            if (poll != null) {
                                                tL_messageMediaPoll.poll = poll;
                                            }
                                            if (pollResults != null) {
                                                r47.c6(tL_messageMediaPoll, pollResults);
                                            }
                                            r47.p5(TLdeserialize);
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
                                SQLiteDatabase sQLiteDatabase3 = jf7Var.b;
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
                    SQLitePreparedStatement executeFast3 = jf7Var.b.executeFast("UPDATE media_v4 SET data = ? WHERE mid = ? AND uid = ?");
                    SQLitePreparedStatement executeFast4 = jf7Var.b.executeFast("UPDATE media_topics SET data = ? WHERE mid = ? AND uid = ? AND topic_id = ?");
                    int m2 = zh6Var2.m();
                    SQLiteCursor sQLiteCursor5 = sQLiteCursor3;
                    int i15 = 0;
                    while (i15 < m2) {
                        try {
                            long j3 = zh6Var2.j(i15);
                            ArrayList arrayList4 = (ArrayList) zh6Var2.n(i15);
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
                                            SQLiteDatabase sQLiteDatabase4 = jf7Var.b;
                                            if (z3) {
                                                Locale locale5 = Locale.US;
                                                sQLitePreparedStatement = executeFast4;
                                                StringBuilder sb2 = new StringBuilder();
                                                zh6Var = zh6Var2;
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
                                                zh6Var = zh6Var2;
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
                                                        TLdeserialize2.readAttachPath(byteBufferValue2, jf7Var.getUserConfig().n);
                                                        byteBufferValue2.reuse();
                                                        TLRPC.MessageMedia messageMedia2 = TLdeserialize2.media;
                                                        if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                                            TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia2;
                                                            if (poll != null) {
                                                                tL_messageMediaPoll2.poll = poll;
                                                            }
                                                            if (pollResults != null) {
                                                                r47.c6(tL_messageMediaPoll2, pollResults);
                                                            }
                                                            r47.p5(TLdeserialize2);
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
                                                        zh6Var2 = zh6Var;
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
                                                zh6Var2 = zh6Var;
                                                m2 = i;
                                                arrayList4 = arrayList;
                                                i15 = i3;
                                                size2 = i5;
                                            } catch (Exception e5) {
                                                e = e5;
                                                sQLiteCursor7 = queryFinalized2;
                                                sQLiteCursor3 = sQLiteCursor7;
                                                z = true;
                                                jf7Var.n(e, z);
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
                                    zh6Var2 = zh6Var2;
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
                            zh6Var2 = zh6Var2;
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
                    jf7Var.b.commitTransaction();
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
        no6 no6Var = (no6) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        long j = this.c;
        r4c r4cVar = new r4c(photoViewer, str, no6Var, j);
        if (photoViewer.E2) {
            Bitmap createBitmap = Bitmap.createBitmap(photoViewer.D2.getWidth(), photoViewer.D2.getHeight(), Bitmap.Config.ARGB_8888);
            hl.z0(photoViewer.D2, createBitmap, new h68(r4cVar, createBitmap, (byte) 4));
            return;
        }
        TextureView textureView = photoViewer.C2;
        Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.C2.getHeight());
        if (bitmap == null) {
            r4cVar.a(r7a.r(no6Var.I, j, null, true));
        } else {
            r4cVar.a(bitmap);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:208:0x0405, code lost:
    
        org.telegram.ui.Wallet.c.m("getSecretPhrase: couldn't decrypt " + r0 + " part");
        r5.a(null, "WALLET_PART_" + r0 + "_CANT_DECRYPT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0438, code lost:
    
        if (r9 == null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x043a, code lost:
    
        r0 = r9.share;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x043c, code lost:
    
        if (r0 == null) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x043e, code lost:
    
        r11 = 0;
        java.util.Arrays.fill(r0, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0444, code lost:
    
        java.util.Arrays.fill(r7, r11);
        r8.cleanup();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x044a, code lost:
    
        if (r6 == null) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0443, code lost:
    
        r11 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0163  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ye9 ye9Var;
        lr9 lr9Var;
        c35 c35Var;
        byte b;
        TL_wallet.mnemonic_decryptedKeyPart mnemonic_decryptedkeypart;
        byte b2;
        byte[] bArr;
        byte b3;
        char c;
        SQLiteCursor sQLiteCursor;
        boolean z;
        SQLiteCursor sQLiteCursor2;
        SQLiteDatabase sQLiteDatabase;
        long j;
        NativeByteBuffer byteBufferValue;
        byte b4 = 8;
        boolean z2 = false;
        switch (this.a) {
            case 0:
                uc7 uc7Var = (uc7) this.b;
                pcc pccVar = (pcc) this.d;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.e;
                long j2 = this.c;
                if (pccVar != null) {
                    pccVar.a(tL_messages_invitedUsers);
                    return;
                } else {
                    jj.f(uc7Var.currentAccount, uc7Var.M0(Long.valueOf(j2)), tL_messages_invitedUsers);
                    return;
                }
            case 1:
                uc7 uc7Var2 = (uc7) this.b;
                TLRPC.TL_help_promoData tL_help_promoData = (TLRPC.TL_help_promoData) this.d;
                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) this.e;
                long j3 = this.c;
                zh6 zh6Var = uc7Var2.S;
                ConcurrentHashMap concurrentHashMap = uc7Var2.Q;
                ConcurrentHashMap concurrentHashMap2 = uc7Var2.P;
                uc7Var2.j4(tL_help_promoData.users, false);
                uc7Var2.c4(tL_help_promoData.chats, false);
                uc7Var2.j4(tL_messages_peerDialogs.users, false);
                uc7Var2.c4(tL_messages_peerDialogs.chats, false);
                TLRPC.Dialog dialog = uc7Var2.q2;
                if (dialog != null) {
                    long j4 = dialog.id;
                    if (j4 < 0) {
                        TLRPC.Chat M0 = uc7Var2.M0(Long.valueOf(-j4));
                        if (xc2.r0(M0) || M0.restricted) {
                            uc7Var2.q4(uc7Var2.q2);
                        }
                    } else {
                        uc7Var2.q4(dialog);
                    }
                }
                TLRPC.Dialog dialog2 = tL_messages_peerDialogs.dialogs.get(0);
                uc7Var2.q2 = dialog2;
                dialog2.id = j3;
                dialog2.folder_id = 0;
                if (wf3.x(dialog2)) {
                    LongSparseIntArray longSparseIntArray = uc7Var2.P0;
                    TLRPC.Dialog dialog3 = uc7Var2.q2;
                    longSparseIntArray.put(-dialog3.id, dialog3.pts);
                }
                Integer num = (Integer) concurrentHashMap2.get(Long.valueOf(uc7Var2.q2.id));
                if (num == null) {
                    num = r12;
                }
                concurrentHashMap2.put(Long.valueOf(uc7Var2.q2.id), Integer.valueOf(Math.max(num.intValue(), uc7Var2.q2.read_inbox_max_id)));
                Integer num2 = (Integer) concurrentHashMap.get(Long.valueOf(uc7Var2.q2.id));
                concurrentHashMap.put(Long.valueOf(uc7Var2.q2.id), Integer.valueOf(Math.max((num2 != null ? num2 : 0).intValue(), uc7Var2.q2.read_outbox_max_id)));
                uc7Var2.R.k(j3, uc7Var2.q2);
                if (!tL_messages_peerDialogs.messages.isEmpty()) {
                    zh6 zh6Var2 = new zh6();
                    zh6 zh6Var3 = new zh6();
                    for (int i = 0; i < tL_messages_peerDialogs.users.size(); i++) {
                        TLRPC.User user = tL_messages_peerDialogs.users.get(i);
                        zh6Var2.k(user.id, user);
                    }
                    for (int i2 = 0; i2 < tL_messages_peerDialogs.chats.size(); i2++) {
                        TLRPC.Chat chat = tL_messages_peerDialogs.chats.get(i2);
                        zh6Var3.k(chat.id, chat);
                    }
                    r47 r47Var = new r47(uc7Var2.currentAccount, tL_messages_peerDialogs.messages.get(0), zh6Var2, zh6Var3, false, true);
                    ArrayList arrayList = (ArrayList) zh6Var.f(j3);
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    if (arrayList.size() > 0 && arrayList.get(0) != null && ((r47) arrayList.get(0)).z2() && ((r47) arrayList.get(0)).d1() != r47Var.d1()) {
                        arrayList.clear();
                    }
                    arrayList.add(r47Var);
                    zh6Var.k(j3, arrayList);
                    TLRPC.Dialog dialog4 = uc7Var2.q2;
                    if (dialog4.last_message_date == 0) {
                        dialog4.last_message_date = r47Var.k.date;
                    }
                    uc7Var2.i4.c(j3);
                }
                uc7Var2.h5(null);
                uc7Var2.getNotificationCenter().k(3, Boolean.TRUE);
                return;
            case 2:
                i30 i30Var = (i30) this.b;
                g30 g30Var = (g30) this.d;
                long j5 = this.c;
                byte[] bArr2 = (byte[]) this.e;
                if (i30Var.G == 7) {
                    long length = g30Var.b.length();
                    i30Var.a(g30Var, length);
                    synchronized (i30Var.l) {
                        if (g30Var.d && !g30Var.e) {
                            g30Var.e = true;
                            i30Var.k.execute(new w20(i30Var, g30Var, length, j5, (byte) 2));
                            i30Var.C = new n20(g30Var.b, j5, bArr2);
                            i30Var.s(8);
                            qx6 qx6Var = i30Var.f;
                            n20 n20Var = i30Var.C;
                            MediaController mediaController = ((sn6) qx6Var.b).a;
                            String[] strArr = MediaController.W1;
                            mediaController.p(n20Var);
                            i30Var.c();
                            i30Var.t();
                            i30Var.l("completed");
                        }
                    }
                    return;
                }
                return;
            case 3:
                i01 i01Var = (i01) this.b;
                ArrayList arrayList2 = (ArrayList) this.d;
                dz0 dz0Var = (dz0) this.e;
                long j6 = this.c;
                if (arrayList2 != null && (ye9Var = i01Var.f) != null && (lr9Var = ((rr9) ye9Var.b).d) != null) {
                    lr9Var.onStreamChannels(arrayList2);
                }
                dz0Var.a(j6);
                return;
            case 4:
                ((CameraController) this.b).lambda$finishRecordingVideo$15((File) this.d, (Bitmap) this.e, this.c);
                return;
            case 5:
                n12 n12Var = (n12) this.b;
                long j7 = this.c;
                zu1 zu1Var = (zu1) this.d;
                vnb vnbVar = (vnb) this.e;
                Context context = n12Var.getContext();
                int i3 = n12Var.G3;
                b77 b77Var = zu1Var.y5;
                if (b77Var == null) {
                    b77Var = b77.a();
                }
                new a77(context, i3, j7, b77Var, zu1Var, vnbVar, 0, new rx1((Object) n12Var, (Object) zu1Var, (byte) 2)).show();
                return;
            case 6:
                gc2 gc2Var = (gc2) this.b;
                r47 r47Var2 = (r47) this.d;
                long j8 = this.c;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                boolean g3 = r47Var2.g3();
                zu1 zu1Var2 = gc2Var.a;
                o6b.a(zu1Var2.getCurrentAccount(), j8, r47Var2, storyItem);
                ArrayList arrayList3 = new ArrayList();
                r47Var2.M1 = true;
                arrayList3.add(r47Var2);
                zu1Var2.getMessagesStorage().a.c(new ea2(gc2Var, arrayList3, b4));
                if (!g3 && r47Var2.g3() && r47Var2.D == 24) {
                    zu1Var2.bd(arrayList3, true);
                    return;
                } else {
                    zu1Var2.bd(arrayList3, false);
                    return;
                }
            case 7:
                uj3 uj3Var = (uj3) this.b;
                ac7 ac7Var = (ac7) this.d;
                TLRPC.Dialog dialog5 = (TLRPC.Dialog) this.e;
                long j9 = this.c;
                int i4 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (ac7Var != null) {
                    LongSparseIntArray longSparseIntArray2 = ac7Var.j;
                    if (uj3Var.H3(dialog5)) {
                        int size = longSparseIntArray2.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            i4 = Math.min(i4, longSparseIntArray2.valueAt(i5));
                        }
                        i4 -= uj3Var.Q2;
                    }
                }
                int i6 = i4;
                TLRPC.EncryptedChat a1 = wf3.B(j9) ? uj3Var.getMessagesController().a1(Integer.valueOf((int) (4294967295L & j9))) : null;
                UndoView w3 = uj3Var.w3();
                if (w3 != null) {
                    if (uj3Var.H3(dialog5)) {
                        uj3Var.L4(j9, false, ac7Var, i6, true);
                        w3.k(0L, 79, 1, 1600, null, null);
                    } else {
                        uj3Var.L4(j9, true, ac7Var, i6, true);
                        w3.k(0L, 78, 1, 1600, null, null);
                        if (ac7Var != null) {
                            ArrayList arrayList4 = ac7Var.h;
                            if (a1 != null) {
                                if (!arrayList4.contains(Long.valueOf(a1.user_id))) {
                                    ac7Var.h.add(Long.valueOf(a1.user_id));
                                }
                            } else if (!arrayList4.contains(Long.valueOf(j9))) {
                                ac7Var.h.add(Long.valueOf(j9));
                            }
                        }
                    }
                    if (ac7Var != null) {
                        nf4.z0(ac7Var, ac7Var.g, ac7Var.b, ac7Var.c, ac7Var.n, ac7Var.m, ac7Var.h, ac7Var.i, ac7Var.j, false, false, true, true, false, uj3Var, null);
                    }
                    uj3Var.getMessagesController().x4(uj3Var.Y2, 0L, null);
                    uj3Var.p5(true);
                    if (uj3Var.f0 != null) {
                        int i7 = 0;
                        while (true) {
                            tj3[] tj3VarArr = uj3Var.f0;
                            if (i7 < tj3VarArr.length) {
                                tj3VarArr[i7].d.I = false;
                                i7++;
                            }
                        }
                    }
                    int i8 = uc7.r5;
                    uj3Var.G5(196608, true);
                    return;
                }
                return;
            case 8:
                c cVar = (c) this.b;
                TL_wallet.encryptedSecretPhrasePart[] encryptedsecretphrasepartArr = (TL_wallet.encryptedSecretPhrasePart[]) this.d;
                long j10 = this.c;
                p pVar = (p) this.e;
                int i9 = 0;
                byte[] bArr3 = null;
                while (true) {
                    try {
                        if (i9 < encryptedsecretphrasepartArr.length) {
                            byte[] copyOfRange = Arrays.copyOfRange(encryptedsecretphrasepartArr[i9].data, 0, 32);
                            byte[] bArr4 = encryptedsecretphrasepartArr[i9].data;
                            byte[] copyOfRange2 = Arrays.copyOfRange(bArr4, 32, bArr4.length);
                            long key_from_public_key = ConferenceCall.key_from_public_key(copyOfRange);
                            byte[] decrypt_message_for_one = ConferenceCall.decrypt_message_for_one(ConferenceCall.key_from_ecdh(j10, key_from_public_key), copyOfRange2);
                            ConferenceCall.key_destroy(key_from_public_key);
                            SerializedData serializedData = new SerializedData(decrypt_message_for_one);
                            try {
                                mnemonic_decryptedkeypart = TL_wallet.mnemonic_decryptedKeyPart.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                                if (mnemonic_decryptedkeypart == null) {
                                    break;
                                } else {
                                    try {
                                        byte[] bArr5 = mnemonic_decryptedkeypart.share;
                                        if (bArr5 == null) {
                                            break;
                                        } else {
                                            if (bArr3 == null) {
                                                bArr3 = (byte[]) bArr5.clone();
                                            } else if (bArr5.length != bArr3.length) {
                                                c.m("getSecretPhrase: part " + i9 + " has length " + mnemonic_decryptedkeypart.share.length + " while other had " + bArr3.length);
                                                pVar.a(null, "WALLET_PART_SHARE_UNEQUAL_LENGHTS");
                                                byte[] bArr6 = mnemonic_decryptedkeypart.share;
                                                if (bArr6 != null) {
                                                    b = 0;
                                                    Arrays.fill(bArr6, (byte) 0);
                                                } else {
                                                    b = 0;
                                                }
                                                Arrays.fill(decrypt_message_for_one, b);
                                                serializedData.cleanup();
                                            } else {
                                                for (int i10 = 0; i10 < bArr3.length; i10++) {
                                                    bArr3[i10] = (byte) (bArr3[i10] ^ mnemonic_decryptedkeypart.share[i10]);
                                                }
                                            }
                                            byte[] bArr7 = mnemonic_decryptedkeypart.share;
                                            if (bArr7 != null) {
                                                b3 = 0;
                                                Arrays.fill(bArr7, (byte) 0);
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
                        } else if (bArr3 == null) {
                            c.m("getSecretPhrase: no parts???");
                            pVar.a(null, "WALLET_NO_PARTS");
                            if (bArr3 == null) {
                                return;
                            } else {
                                b = 0;
                            }
                        } else {
                            c35Var = new c35(bArr3);
                            try {
                                Arrays.fill(bArr3, (byte) 0);
                                byte[] secretPhraseToPublicKey = WalletEngine2.secretPhraseToPublicKey(c35Var);
                                TL_wallet.WalletState walletState = cVar.e;
                                byte[] bArr8 = walletState instanceof TL_wallet.TL_walletState ? ((TL_wallet.TL_walletState) walletState).public_key : null;
                                if (secretPhraseToPublicKey != null && bArr8 != null && Arrays.equals(secretPhraseToPublicKey, bArr8)) {
                                    Arrays.fill(bArr3, (byte) 0);
                                    c.P("getSecretPhrase, received the phrase!");
                                    pVar.a(c35Var, null);
                                    return;
                                }
                                c.m("getSecretPhrase: mnemonic public key doesn't match one from server: server=" + Utilities.f(bArr8) + " derived=" + Utilities.f(secretPhraseToPublicKey));
                                c35Var.close();
                                pVar.a(null, "WALLET_WORDS_DONT_MATCH");
                                b = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                if (c35Var != null) {
                                    try {
                                        c35Var.close();
                                    } finally {
                                        if (bArr3 != null) {
                                            Arrays.fill(bArr3, (byte) 0);
                                        }
                                    }
                                }
                                pVar.a(null, th.getMessage() == null ? "NULL_ERROR" : th.getMessage());
                                c.n("getSecretPhrase: encryption error", th);
                                if (bArr3 != null) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        c35Var = null;
                    }
                }
                Arrays.fill(bArr3, b);
                return;
            case 9:
                k35 k35Var = (k35) this.b;
                pcc pccVar2 = (pcc) this.d;
                long j11 = this.c;
                String str = (String) this.e;
                if (pccVar2 != null) {
                    if (j11 != k35Var.l()) {
                        str = "STORAGE_CANCELED";
                    }
                    pccVar2.a(str);
                    return;
                }
                return;
            case 10:
                k35 k35Var2 = (k35) this.b;
                c35 c35Var2 = (c35) this.e;
                try {
                    new p4c((Object) k35Var2, this.d, this.c, (byte) 4).a(c35Var2);
                    if (c35Var2 != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (c35Var2 != null) {
                        c35Var2.close();
                    }
                }
            case 11:
                j95 j95Var = (j95) this.b;
                long j12 = this.c;
                id[] idVarArr = (id[]) this.d;
                TLRPC.User user2 = (TLRPC.User) this.e;
                vc2 vc2Var = j95Var.T2;
                if (vc2Var == null || j95Var.l2) {
                    return;
                }
                vc2Var.a(j12);
                j95Var.E0(true);
                sd5 sd5Var = j95Var.y3;
                if (sd5Var != null) {
                    sd5Var.dismiss();
                }
                try {
                    idVarArr[0].dismiss();
                } catch (Throwable unused) {
                }
                idVarArr[0] = null;
                j95Var.d1().k(0L, 34, user2, j95Var.S2, null, null);
                return;
            case 12:
                TLObject tLObject = (TLObject) this.d;
                uc7 uc7Var3 = (uc7) this.b;
                long j13 = this.c;
                ls5 ls5Var = (ls5) this.e;
                String str2 = LaunchActivity.C1;
                if (!(tLObject instanceof TL_stories.TL_stories_peerStories)) {
                    ls5Var.run();
                    return;
                }
                TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                uc7Var3.j4(tL_stories_peerStories.users, false);
                uc7Var3.O1().c0(j13, tL_stories_peerStories.stories);
                ls5Var.run();
                return;
            case 13:
                u16 u16Var = (u16) this.b;
                LaunchActivity launchActivity = u16Var.h;
                String str3 = (String) this.d;
                long j14 = this.c;
                e eVar = (e) this.e;
                if (str3 != null) {
                    k5 a = k5.a(launchActivity.P);
                    int i11 = a.a;
                    long j15 = -j14;
                    if (uc7.s1(i11).g1(j15, false, null) != null) {
                        TLRPC.Chat M02 = uc7.s1(i11).M0(Long.valueOf(j15));
                        uc7.s1(i11).j1(j14);
                        xkc.l(M02, null, false, Boolean.valueOf(!r1.b.rtmp_stream), launchActivity, eVar, a);
                        return;
                    }
                    TLRPC.ChatFull N0 = uc7.s1(i11).N0(j15);
                    if (N0 != null) {
                        if (N0.call != null) {
                            uc7.s1(i11).g1(j15, true, new t16(u16Var, a, j14, eVar, (byte) 0));
                            return;
                        } else {
                            if (eVar.getParentActivity() != null) {
                                bs2.v(null, 2131748906, d31.b0(eVar), R.raw.linkbroken, 36);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 14:
                ls6 ls6Var = (ls6) this.b;
                psb psbVar = (psb) this.d;
                long j16 = this.c;
                ArrayList arrayList5 = (ArrayList) this.e;
                qsb.a(psbVar);
                ls6Var.getNotificationCenter().k(56, Long.valueOf(j16), arrayList5, null);
                return;
            case 15:
                a();
                return;
            case 16:
                uc7 uc7Var4 = (uc7) this.b;
                long j17 = this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                TLRPC.TL_channels_channelParticipant tL_channels_channelParticipant = (TLRPC.TL_channels_channelParticipant) this.e;
                uc7Var4.R0.e(j17);
                if (arrayList6 != null) {
                    c = 0;
                    uc7Var4.z5(0, -j17, arrayList6);
                    uc7Var4.getNotificationCenter().k(3, new Object[0]);
                } else {
                    c = 0;
                }
                jn7 notificationCenter = uc7Var4.getNotificationCenter();
                Long valueOf = Long.valueOf(j17);
                Long valueOf2 = Long.valueOf(tL_channels_channelParticipant.participant.inviter_id);
                Object[] objArr = new Object[2];
                objArr[c] = valueOf;
                objArr[1] = valueOf2;
                notificationCenter.k(jn7.t1, objArr);
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
                b19 b19Var = (b19) this.b;
                jf7 jf7Var = (jf7) this.d;
                long j18 = this.c;
                Runnable runnable = (Runnable) this.e;
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                try {
                    SQLiteDatabase sQLiteDatabase2 = jf7Var.b;
                    SQLiteCursor queryFinalized = sQLiteDatabase2.queryFinalized("SELECT topic_id, name, order_value, count FROM business_replies ORDER BY order_value ASC", new Object[0]);
                    while (queryFinalized.next()) {
                        try {
                            try {
                                try {
                                    a19 a19Var = new a19();
                                    a19Var.a = queryFinalized.intValue(0);
                                    a19Var.b = queryFinalized.stringValue(1);
                                    a19Var.c = queryFinalized.intValue(2);
                                    a19Var.f = queryFinalized.intValue(3);
                                    arrayList7.add(a19Var);
                                } catch (Exception e) {
                                    e = e;
                                    sQLiteCursor = queryFinalized;
                                    z = true;
                                    try {
                                        cc4.g(e, z);
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        hl.c3(new cp7((Object) b19Var, (Object) arrayList8, (Object) arrayList9, (Object) arrayList7, (Object) runnable, (byte) 17));
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
                            }
                        } catch (Exception e2) {
                            e = e2;
                            sQLiteCursor = queryFinalized;
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    int i12 = 0;
                    while (i12 < arrayList7.size()) {
                        try {
                            a19 a19Var2 = (a19) arrayList7.get(i12);
                            boolean z3 = z2;
                            sQLiteCursor2 = queryFinalized;
                            int i13 = i12;
                            try {
                                Object[] objArr2 = new Object[1];
                                objArr2[z3 ? 1 : 0] = Integer.valueOf(a19Var2.a);
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
                                    jf7.d(TLdeserialize, arrayList10, arrayList11, null);
                                    j = j18;
                                    r47 r47Var3 = new r47(b19Var.a, TLdeserialize, false, true);
                                    a19Var2.e = r47Var3;
                                    a19Var2.d = TLdeserialize.id;
                                    r47Var3.r0(false);
                                    a19Var2.e.l(a19Var2.a, a19Var2.b);
                                }
                                queryFinalized.dispose();
                                i12 = i13 + 1;
                                sQLiteDatabase2 = sQLiteDatabase;
                                j18 = j;
                                z2 = false;
                            } catch (Exception e3) {
                                e = e3;
                                sQLiteCursor = sQLiteCursor2;
                                z = true;
                                cc4.g(e, z);
                                if (sQLiteCursor != null) {
                                }
                                hl.c3(new cp7((Object) b19Var, (Object) arrayList8, (Object) arrayList9, (Object) arrayList7, (Object) runnable, (byte) 17));
                                return;
                            } catch (Throwable th7) {
                                th = th7;
                                sQLiteCursor = sQLiteCursor2;
                                if (sQLiteCursor != null) {
                                }
                                throw th;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            sQLiteCursor2 = queryFinalized;
                        } catch (Throwable th8) {
                            th = th8;
                            sQLiteCursor2 = queryFinalized;
                        }
                    }
                    sQLiteCursor2 = queryFinalized;
                    if (!arrayList11.isEmpty()) {
                        jf7Var.P(TextUtils.join(",", arrayList11), arrayList9);
                    }
                    if (!arrayList10.isEmpty()) {
                        jf7Var.k0(arrayList10, arrayList8, false);
                    }
                    sQLiteCursor2.dispose();
                } catch (Exception e5) {
                    e = e5;
                    z = true;
                    sQLiteCursor = null;
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor = null;
                }
                hl.c3(new cp7((Object) b19Var, (Object) arrayList8, (Object) arrayList9, (Object) arrayList7, (Object) runnable, (byte) 17));
                return;
        }
    }

    public /* synthetic */ ba7(Object obj, long j, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
        this.e = obj3;
    }

    public /* synthetic */ ba7(Object obj, Object obj2, long j, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
        this.e = obj3;
    }

    public /* synthetic */ ba7(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.e = obj3;
        this.c = j;
    }

    public /* synthetic */ ba7(TLObject tLObject, uc7 uc7Var, long j, ls5 ls5Var) {
        this.a = (byte) 12;
        this.d = tLObject;
        this.b = uc7Var;
        this.c = j;
        this.e = ls5Var;
    }
}
