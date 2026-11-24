// default package

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.widget.TextView;
import java.io.File;
import java.io.FileOutputStream;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class aa7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ aa7(a6a a6aVar, TLRPC.TL_messages_editMessage tL_messages_editMessage, k47 k47Var, d dVar, boolean z) {
        this.a = (byte) 20;
        this.c = a6aVar;
        this.d = tL_messages_editMessage;
        this.f = k47Var;
        this.e = dVar;
        this.b = z;
    }

    private final void a() {
        TLRPC.FileLocation fileLocation;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        wj3 wj3Var = (wj3) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.f;
        nk3 nk3Var = wj3Var.a;
        int i8 = 0;
        if (tL_error == null) {
            TLRPC.User W1 = nk3Var.getMessagesController().W1(Long.valueOf(nk3Var.getUserConfig().e()));
            if (W1 == null) {
                W1 = nk3Var.getUserConfig().f();
                if (W1 == null) {
                    return;
                } else {
                    nk3Var.getMessagesController().c4(W1, false, false);
                }
            } else {
                nk3Var.getUserConfig().v(W1);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize w = bc4.w(arrayList, nm7.f2, false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(arrayList, 800, false, null, false);
            TLRPC.VideoSize x = tL_photos_photo.photo.video_sizes.isEmpty() ? null : bc4.x(1000, tL_photos_photo.photo.video_sizes);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            W1.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (w != null) {
                tL_userProfilePhoto.photo_small = w.location;
            }
            if (w2 != null) {
                tL_userProfilePhoto.photo_big = w2.location;
            }
            if (w != null && nk3Var.i4 != null) {
                i5 = ((d) nk3Var).currentAccount;
                bc4.G(i5);
                File J = bc4.J(w, null, true, true);
                i6 = ((d) nk3Var).currentAccount;
                bc4.G(i6);
                bc4.J(nk3Var.i4, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(nk3Var.i4.volume_id);
                sb.append("_");
                String k = hg9.k(sb, nk3Var.i4.local_id, "@50_50");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                String k2 = hg9.k(sb2, w.location.local_id, "@50_50");
                fn5 z = fn5.z();
                i7 = ((d) nk3Var).currentAccount;
                z.O(k, k2, gn5.m(i7, 1, W1));
            }
            if (x != null && str != null) {
                i4 = ((d) nk3Var).currentAccount;
                bc4.G(i4);
                new File(str).renameTo(bc4.J(x, "mp4", true, true));
            } else if (w2 != null && nk3Var.j4 != null) {
                i2 = ((d) nk3Var).currentAccount;
                bc4.G(i2);
                File J2 = bc4.J(w2, null, true, true);
                i3 = ((d) nk3Var).currentAccount;
                bc4.G(i3);
                bc4.J(nk3Var.j4, null, true, true).renameTo(J2);
            }
            nk3Var.getMessagesController().T0(W1.id);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(W1);
            i8 = 0;
            nk3Var.getMessagesStorage().j1(arrayList2, null, false, true);
            TLRPC.UserFull X1 = nk3Var.getMessagesController().X1(nk3Var.getUserConfig().e());
            if (X1 != null) {
                X1.profile_photo = tL_photos_photo.photo;
                nk3Var.getMessagesStorage().g2(X1, false);
            }
            fileLocation = null;
        } else {
            fileLocation = null;
        }
        nk3Var.i4 = fileLocation;
        nk3Var.j4 = fileLocation;
        nm7 notificationCenter = nk3Var.getNotificationCenter();
        Object[] objArr = new Object[1];
        objArr[i8] = Integer.valueOf(oc7.s5);
        notificationCenter.k(2, objArr);
        nk3Var.getNotificationCenter().k(nm7.j0, new Object[i8]);
        nk3Var.getUserConfig().u(true);
        i = ((d) nk3Var).currentAccount;
        oc7.r1(i).p4(0L, "USERPIC_SETUP");
        nk3Var.q5();
        u31 u31Var = nk3Var.k4;
        if (u31Var != null) {
            l31 l31Var = (l31) u31Var.e;
            l31Var.d.c(jb6.M0(this.b ? 2131742456 : 2131742458, null), true, true);
            l31Var.setProgress(1.0f);
            o21 button = l31Var.getButton();
            button.setScaleX(0.6f);
            button.setScaleY(0.6f);
            button.setAlpha(0.0f);
            button.setVisibility(0);
            wi8.t(button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f), d53.h, 360L);
            u31 u31Var2 = nk3Var.k4;
            u31Var2.j = 5000;
            u31Var2.i(false);
            nk3Var.k4.i(true);
        }
    }

    private final void b() {
        m24 m24Var = (m24) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        TLObject tLObject = (TLObject) this.f;
        m24Var.a.remove(str2);
        e34 e34Var = m24Var.b;
        j24 j24Var = e34Var.k0;
        HashMap hashMap = e34Var.m0;
        boolean z = j24Var.w;
        boolean z2 = this.b;
        if (z && j24Var.x.equals(str)) {
            e34Var.k0.E(str, "", false, true, z2, str2, tLObject);
            return;
        }
        if (z2 && (!(tLObject instanceof TLRPC.messages_BotResults) || ((TLRPC.messages_BotResults) tLObject).results.isEmpty())) {
            m24Var.a(str, false);
        } else {
            if (!(tLObject instanceof TLRPC.messages_BotResults) || hashMap.containsKey(str2)) {
                return;
            }
            hashMap.put(str2, (TLRPC.messages_BotResults) tLObject);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0149 A[Catch: all -> 0x0232, Exception -> 0x0234, TRY_LEAVE, TryCatch #12 {Exception -> 0x0234, all -> 0x0232, blocks: (B:60:0x00df, B:62:0x00e5, B:64:0x00f6, B:71:0x0144, B:73:0x0149, B:114:0x01f7, B:86:0x0219, B:125:0x0227, B:127:0x022e), top: B:59:0x00df }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        boolean z;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        SQLitePreparedStatement executeFast;
        boolean z2;
        TLRPC.MessageReplies messageReplies;
        int i;
        int i2;
        aa7 aa7Var = this;
        cf7 cf7Var = (cf7) aa7Var.c;
        vh6 vh6Var = (vh6) aa7Var.d;
        vh6 vh6Var2 = (vh6) aa7Var.e;
        vh6 vh6Var3 = (vh6) aa7Var.f;
        boolean z3 = true;
        try {
            cf7Var.b.beginTransaction();
            try {
                int i3 = 2;
                if (!cf7.p0(vh6Var)) {
                    try {
                        SQLitePreparedStatement executeFast2 = cf7Var.b.executeFast("UPDATE messages_v2 SET media = max((SELECT media FROM messages_v2 WHERE mid = ? AND uid = ?), ?) WHERE mid = ? AND uid = ?");
                        int i4 = 0;
                        while (i4 < vh6Var.m()) {
                            try {
                                long j = vh6Var.j(i4);
                                SparseIntArray sparseIntArray = (SparseIntArray) vh6Var.n(i4);
                                int size = sparseIntArray.size();
                                int i5 = 0;
                                while (i5 < size) {
                                    int valueAt = sparseIntArray.valueAt(i5);
                                    int keyAt = sparseIntArray.keyAt(i5);
                                    executeFast2.requery();
                                    executeFast2.bindInteger(1, keyAt);
                                    executeFast2.bindLong(i3, j);
                                    executeFast2.bindInteger(3, valueAt);
                                    executeFast2.bindInteger(4, keyAt);
                                    executeFast2.bindLong(5, j);
                                    executeFast2.step();
                                    i5++;
                                    i3 = 2;
                                }
                                i4++;
                                i3 = 2;
                            } catch (Exception e) {
                                e = e;
                                z = true;
                                sQLitePreparedStatement = executeFast2;
                                try {
                                    cf7Var.n(e, z3);
                                    if (z) {
                                    }
                                    if (sQLitePreparedStatement != null) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z3 = z;
                                    if (z3 && (sQLiteDatabase = cf7Var.b) != null) {
                                        sQLiteDatabase.commitTransaction();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLitePreparedStatement = executeFast2;
                                if (z3) {
                                }
                                if (sQLitePreparedStatement != null) {
                                }
                                throw th;
                            }
                        }
                        executeFast2.dispose();
                    } catch (Exception e2) {
                        e = e2;
                        z = true;
                        sQLitePreparedStatement = null;
                        cf7Var.n(e, z3);
                        if (z && (sQLiteDatabase2 = cf7Var.b) != null) {
                            sQLiteDatabase2.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        th = th3;
                        sQLitePreparedStatement = null;
                        if (z3) {
                            sQLiteDatabase.commitTransaction();
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        throw th;
                    }
                }
                if (!cf7.p0(vh6Var2)) {
                    executeFast = cf7Var.b.executeFast("UPDATE messages_v2 SET forwards = max((SELECT forwards FROM messages_v2 WHERE mid = ? AND uid = ?), ?) WHERE mid = ? AND uid = ?");
                    for (int i6 = 0; i6 < vh6Var2.m(); i6++) {
                        try {
                            long j2 = vh6Var2.j(i6);
                            SparseIntArray sparseIntArray2 = (SparseIntArray) vh6Var2.n(i6);
                            int size2 = sparseIntArray2.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                int valueAt2 = sparseIntArray2.valueAt(i7);
                                int keyAt2 = sparseIntArray2.keyAt(i7);
                                executeFast.requery();
                                executeFast.bindInteger(1, keyAt2);
                                executeFast.bindLong(2, j2);
                                executeFast.bindInteger(3, valueAt2);
                                executeFast.bindInteger(4, keyAt2);
                                executeFast.bindLong(5, j2);
                                executeFast.step();
                            }
                        } catch (Exception e3) {
                            e = e3;
                            sQLitePreparedStatement = executeFast;
                            z = z3;
                            cf7Var.n(e, z3);
                            if (z) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLitePreparedStatement = executeFast;
                            if (z3) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                            throw th;
                        }
                    }
                    executeFast.dispose();
                }
                if (!cf7.p0(vh6Var3)) {
                    executeFast = cf7Var.b.executeFast("UPDATE messages_v2 SET replies_data = ? WHERE mid = ? AND uid = ?");
                    int i8 = 0;
                    while (i8 < vh6Var3.m()) {
                        try {
                            long j3 = vh6Var3.j(i8);
                            SparseArray sparseArray = (SparseArray) vh6Var3.n(i8);
                            int size3 = sparseArray.size();
                            int i9 = 0;
                            while (i9 < size3) {
                                int keyAt3 = sparseArray.keyAt(i9);
                                SQLiteDatabase sQLiteDatabase3 = cf7Var.b;
                                Locale locale = Locale.US;
                                SQLiteCursor queryFinalized = sQLiteDatabase3.queryFinalized("SELECT replies_data FROM messages_v2 WHERE mid = " + keyAt3 + " AND uid = " + j3, new Object[0]);
                                boolean next = queryFinalized.next();
                                if (next) {
                                    NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(0);
                                    if (byteBufferValue != null) {
                                        z2 = z3;
                                        try {
                                            messageReplies = TLRPC.MessageReplies.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                            byteBufferValue.reuse();
                                            queryFinalized.dispose();
                                            if (!next) {
                                                TLRPC.MessageReplies messageReplies2 = (TLRPC.MessageReplies) sparseArray.get(sparseArray.keyAt(i9));
                                                boolean z4 = aa7Var.b;
                                                if (z4 || messageReplies == null || (i2 = messageReplies.replies_pts) == 0 || messageReplies2.replies_pts > i2 || messageReplies2.read_max_id > messageReplies.read_max_id || messageReplies2.max_id > messageReplies.max_id) {
                                                    if (z4) {
                                                        if (messageReplies == null) {
                                                            messageReplies = new TLRPC.TL_messageReplies();
                                                            messageReplies.flags |= 2;
                                                        }
                                                        messageReplies.replies += messageReplies2.replies;
                                                        int size4 = messageReplies2.recent_repliers.size();
                                                        for (int i10 = 0; i10 < size4; i10++) {
                                                            long B1 = k47.B1(messageReplies2.recent_repliers.get(i10));
                                                            int size5 = messageReplies.recent_repliers.size();
                                                            int i11 = 0;
                                                            while (i11 < size5) {
                                                                int i12 = size5;
                                                                if (B1 == k47.B1(messageReplies.recent_repliers.get(i11))) {
                                                                    messageReplies.recent_repliers.remove(i11);
                                                                    i11--;
                                                                    size5 = i12 - 1;
                                                                } else {
                                                                    size5 = i12;
                                                                }
                                                                i11++;
                                                            }
                                                        }
                                                        messageReplies.recent_repliers.addAll(0, messageReplies2.recent_repliers);
                                                        while (messageReplies.recent_repliers.size() > 3) {
                                                            messageReplies.recent_repliers.remove(0);
                                                        }
                                                        messageReplies2 = messageReplies;
                                                    }
                                                    if (messageReplies != null && (i = messageReplies.read_max_id) > messageReplies2.read_max_id) {
                                                        messageReplies2.read_max_id = i;
                                                    }
                                                    executeFast.requery();
                                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(messageReplies2.getObjectSize());
                                                    messageReplies2.serializeToStream(nativeByteBuffer);
                                                    executeFast.bindByteBuffer(z2 ? 1 : 0, nativeByteBuffer);
                                                    executeFast.bindInteger(2, keyAt3);
                                                    executeFast.bindLong(3, j3);
                                                    executeFast.step();
                                                    nativeByteBuffer.reuse();
                                                }
                                            }
                                            i9++;
                                            aa7Var = this;
                                            z3 = true;
                                        } catch (Exception e4) {
                                            e = e4;
                                            sQLitePreparedStatement = executeFast;
                                            z3 = z2;
                                            z = z3;
                                            cf7Var.n(e, z3);
                                            if (z) {
                                                sQLiteDatabase2.commitTransaction();
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            sQLitePreparedStatement = executeFast;
                                            z3 = z2;
                                            if (z3) {
                                            }
                                            if (sQLitePreparedStatement != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                }
                                z2 = z3;
                                messageReplies = null;
                                queryFinalized.dispose();
                                if (!next) {
                                }
                                i9++;
                                aa7Var = this;
                                z3 = true;
                            }
                            i8++;
                            aa7Var = this;
                            z3 = true;
                        } catch (Exception e5) {
                            e = e5;
                            sQLitePreparedStatement = executeFast;
                            z3 = true;
                            z = true;
                            cf7Var.n(e, z3);
                            if (z) {
                            }
                            if (sQLitePreparedStatement != null) {
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            sQLitePreparedStatement = executeFast;
                            z3 = true;
                        }
                    }
                    executeFast.dispose();
                }
                cf7Var.b.commitTransaction();
            } catch (Exception e6) {
                e = e6;
                z3 = true;
                sQLitePreparedStatement = null;
            } catch (Throwable th7) {
                th = th7;
                z3 = true;
            }
        } catch (Exception e7) {
            e = e7;
            z = false;
            z3 = true;
        } catch (Throwable th8) {
            th = th8;
            z3 = false;
        }
    }

    private final void d() {
        ((p) this.c).y0(this.b, (String) this.d, (String) this.e, (TL_account.updatePasswordSettings) this.f);
    }

    private final void e() {
        ((p) this.c).x0((TLRPC.TL_error) this.d, this.b, (TLObject) this.e, (String) this.f);
    }

    private final void f() {
        ph9.f((d) this.e, (Context) this.c, (ylb) this.d, (zg9) this.f, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161  */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, un9] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v1, types: [qn9] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [byte] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void g() {
        boolean z;
        long j;
        boolean z2;
        File file;
        byte b;
        ?? r1 = (un9) this.c;
        ?? r2 = this.b;
        om9 om9Var = (om9) this.d;
        ?? r4 = (qn9) this.e;
        File file2 = (File) this.f;
        r1.getClass();
        long nanoTime = System.nanoTime();
        File file3 = null;
        try {
            try {
                r1.g();
                long j2 = r1.I;
                if (r2 != 0) {
                    try {
                        try {
                            synchronized (om9Var) {
                                try {
                                    om9Var.w = true;
                                } catch (Throwable th) {
                                    th = th;
                                    r4 = 1;
                                    r2 = 0;
                                }
                                try {
                                    try {
                                        om9Var.g();
                                        om9Var.w = false;
                                        try {
                                        } catch (Exception e) {
                                            e = e;
                                            r2 = 0;
                                            r4 = 1;
                                            file3 = r2;
                                            r1.i.post(new en9(r1, e, r4));
                                            if (file2 != null) {
                                            }
                                            if (file3 == null) {
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        om9Var.w = false;
                                        throw th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        throw th;
                                    } catch (Exception e2) {
                                        e = e2;
                                        file3 = r2;
                                        r1.i.post(new en9(r1, e, r4));
                                        if (file2 != null) {
                                        }
                                        if (file3 == null) {
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        file3 = r2;
                                        if (file2 != null) {
                                        }
                                        if (file3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                            }
                            try {
                                r1.g();
                                r1.k(r4, 1);
                                File file4 = om9Var.a;
                                try {
                                    try {
                                        r1.c(true);
                                        try {
                                            om9 om9Var2 = r1.U;
                                            try {
                                                j = r1.K;
                                                z = true;
                                            } catch (Exception e3) {
                                                e = e3;
                                                z = true;
                                            }
                                            try {
                                                long j3 = r1.L;
                                                int i = om9Var.i();
                                                short s = r1.n.a;
                                                z2 = r2;
                                                int i2 = r1.o;
                                                if (i <= 0) {
                                                    i = r1.p.a;
                                                }
                                                cn9 cn9Var = new cn9(s, i2, i);
                                                file = null;
                                                dn9 a = fve.a(file2, om9Var2, j, j3, true, cn9Var);
                                                j2 = a.b;
                                                r1.m.b("resume trim remux completed: requested=" + r1.K + ".." + r1.L + ", actualStartMs=" + a.a + ", mode=" + a.c + ", retainedDurationMs=" + j2 + ", outputSize=" + r1.U.a.length() + ", elapsedMs=" + un9.f(nanoTime));
                                                file3 = file4;
                                                r4 = 1;
                                                b = 0;
                                            } catch (Exception e4) {
                                                e = e4;
                                                file3 = file4;
                                                r4 = z;
                                                r1.i.post(new en9(r1, e, r4));
                                                if (file2 != null) {
                                                    fve.c(file2);
                                                }
                                                if (file3 == null) {
                                                    fve.c(file3);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                            z = true;
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        z = true;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    file3 = file4;
                                    if (file2 != null) {
                                        fve.c(file2);
                                    }
                                    if (file3 != null) {
                                        fve.c(file3);
                                    }
                                    throw th;
                                }
                            } catch (Exception e7) {
                                e = e7;
                                z = true;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            r4 = 1;
                            r2 = 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        r2 = 0;
                    }
                } else {
                    z2 = r2;
                    r4 = 1;
                    file = null;
                    b = 0;
                }
                try {
                    r1.g();
                    r1.V = file;
                    if (!z2) {
                        r1.m.b("resume prepared without remux: retainedDurationMs=" + j2 + ", elapsedMs=" + un9.f(nanoTime));
                    }
                    r1.i.post(new fn9(r1, j2, b));
                    if (file2 != null) {
                        fve.c(file2);
                    }
                    if (file3 != null) {
                        fve.c(file3);
                    }
                } catch (Exception e9) {
                    e = e9;
                    r1.i.post(new en9(r1, e, r4));
                    if (file2 != null) {
                    }
                    if (file3 == null) {
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e10) {
            e = e10;
            r4 = 1;
        }
    }

    private final void h() {
        a6a a6aVar = (a6a) this.c;
        TLRPC.Message message = (TLRPC.Message) this.d;
        TLObject tLObject = (TLObject) this.e;
        m5a m5aVar = (m5a) this.f;
        a6aVar.h0(message.id, this.b);
        if (tLObject instanceof TLRPC.TL_messages_addPollAnswer) {
            TLRPC.PollAnswer pollAnswer = ((TLRPC.TL_messages_addPollAnswer) tLObject).answer;
            TLRPC.InputMedia inputMedia = pollAnswer.input_media;
            if (inputMedia instanceof TLRPC.TL_inputMediaPhoto) {
                pollAnswer.input_media = m5aVar.t;
            } else if (inputMedia instanceof TLRPC.TL_inputMediaDocument) {
                pollAnswer.input_media = m5aVar.t;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_sendMedia) {
            TLRPC.TL_messages_sendMedia tL_messages_sendMedia = (TLRPC.TL_messages_sendMedia) tLObject;
            TLRPC.InputMedia inputMedia2 = tL_messages_sendMedia.media;
            if (inputMedia2 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_sendMedia.media = m5aVar.t;
            } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_sendMedia.media = m5aVar.t;
            }
        } else if (tLObject instanceof TL_ephemeral.TL_sendMessage) {
            TLObject tLObject2 = m5aVar.c;
            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                TLRPC.TL_messages_sendMedia tL_messages_sendMedia2 = (TLRPC.TL_messages_sendMedia) tLObject2;
                TLRPC.InputMedia inputMedia3 = tL_messages_sendMedia2.media;
                if (inputMedia3 instanceof TLRPC.TL_inputMediaPhoto) {
                    tL_messages_sendMedia2.media = m5aVar.t;
                } else if (inputMedia3 instanceof TLRPC.TL_inputMediaDocument) {
                    tL_messages_sendMedia2.media = m5aVar.t;
                }
            }
            TL_ephemeral.TL_sendMessage tL_sendMessage = (TL_ephemeral.TL_sendMessage) tLObject;
            TLRPC.InputMedia inputMedia4 = tL_sendMessage.media;
            if (inputMedia4 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_sendMessage.media = m5aVar.t;
            } else if (inputMedia4 instanceof TLRPC.TL_inputMediaDocument) {
                tL_sendMessage.media = m5aVar.t;
            }
        } else if (tLObject instanceof TLRPC.TL_messages_editMessage) {
            TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) tLObject;
            TLRPC.InputMedia inputMedia5 = tL_messages_editMessage.media;
            if (inputMedia5 instanceof TLRPC.TL_inputMediaPhoto) {
                tL_messages_editMessage.media = m5aVar.t;
            } else if (inputMedia5 instanceof TLRPC.TL_inputMediaDocument) {
                tL_messages_editMessage.media = m5aVar.t;
            }
        }
        m5aVar.p = true;
        a6aVar.L(m5aVar, -1);
    }

    private final void i() {
        TLRPC.Message message;
        a6a a6aVar = (a6a) this.c;
        TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) this.d;
        k47 k47Var = (k47) this.f;
        int sendRequest = a6aVar.getConnectionsManager().sendRequest(tL_messages_editMessage, new bh2(a6aVar, this.b, k47Var, tL_messages_editMessage, (d) this.e, (byte) 4));
        if (k47Var == null || (message = k47Var.k) == null) {
            return;
        }
        message.reqId = sendRequest;
    }

    private final void j() {
        double d;
        double d2;
        d dVar = (d) this.e;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        yv1 yv1Var = (yv1) this.f;
        File w = g6b.w(dVar.getCurrentAccount(), "webp");
        int o = gda.o();
        float f = o != 0 ? o != 2 ? 2560 : 3840 : 1280;
        double d3 = (f * 512.0f) / 512.0f;
        if (((float) Math.floor(d3)) > f) {
            f = (float) Math.floor(d3);
        }
        float f2 = f;
        Bitmap createBitmap = Bitmap.createBitmap(512, 512, Bitmap.Config.ARGB_8888);
        try {
            createBitmap.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(w));
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        createBitmap.recycle();
        ArrayList arrayList = new ArrayList();
        jo6 jo6Var = new jo6(0, w.getAbsolutePath(), 0, false, 0, 0);
        arrayList.add(jo6Var);
        pcc pccVar = new pcc();
        pccVar.a = (byte) 0;
        pccVar.C = tL_messages_stickerSet;
        bc4.G(z8c.t0);
        pccVar.j = bc4.J(document, null, true, true).getAbsolutePath();
        pccVar.c = 0.0f;
        pccVar.d = 0.0f;
        pccVar.f = 1.0f;
        pccVar.g = 1.0f;
        int floor = (int) Math.floor(f2 * 0.5d);
        pccVar.q = floor;
        pccVar.r = floor;
        pccVar.v = 2.0f;
        pccVar.B = document;
        if (k47.K2(document, true) || k47.N4(document)) {
            pccVar.b = (byte) (pccVar.b | (k47.K2(document, true) ? (byte) 1 : (byte) 4));
        }
        ArrayList arrayList2 = new ArrayList();
        jo6Var.p = arrayList2;
        arrayList2.add(pccVar);
        jo6Var.t = 3000L;
        if (k47.K2(document, true)) {
            bc4.G(z8c.t0);
            File J = bc4.J(document, null, true, true);
            if (J != null) {
                try {
                    RLottieNative a = RLottieNative.a(J.getAbsolutePath(), null, null, null, 0, null);
                    if (a != null) {
                        int[] iArr = a.a;
                        int i = iArr[0];
                        int i2 = iArr[1];
                        a.d();
                        d = 1000.0d;
                        d2 = i / i2;
                    } else {
                        d = 1000.0d;
                        d2 = 0.0d;
                    }
                    jo6Var.t = (long) (d2 * d);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        } else if (k47.N4(document)) {
            jo6Var.t = (long) (k47.H0(document) * 1000.0d);
        }
        PhotoViewer.r0().T1(dVar.getParentActivity(), null, dVar.getResourceProvider());
        PhotoViewer.r0().o1(arrayList, 0, 11, false, new o2b(), yv1Var);
        PhotoViewer r0 = PhotoViewer.r0();
        boolean z = this.b;
        r0.U(document, z ? document : null, true, null);
        hx2 e2 = hx2.e();
        if (!z) {
            tL_messages_stickerSet = null;
        }
        e2.T = tL_messages_stickerSet;
    }

    private final void k() {
        v9b v9bVar = (v9b) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        File file = (File) this.e;
        g6b g6bVar = (g6b) this.f;
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, this.b ? 95 : 99, new FileOutputStream(file));
        } catch (Exception e) {
            fc4.g(e, true);
        }
        gm.c3(new j2b(v9bVar, g6bVar, file, (byte) 9));
    }

    private final void l() {
        ((p5c) this.c).A0((TLObject) this.d, this.b, (String) this.e, (TL_account.passwordInputSettings) this.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03a5 A[Catch: Exception -> 0x03a9, all -> 0x0655, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x03a9, blocks: (B:158:0x036a, B:167:0x037b, B:171:0x03a5, B:346:0x0396), top: B:147:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x067c  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05d4 A[Catch: all -> 0x0655, Exception -> 0x0659, TRY_ENTER, TryCatch #11 {all -> 0x0655, blocks: (B:158:0x036a, B:167:0x037b, B:168:0x039a, B:171:0x03a5, B:172:0x03b0, B:177:0x03d9, B:183:0x053f, B:184:0x03f5, B:230:0x0537, B:232:0x053c, B:286:0x0419, B:289:0x0557, B:296:0x0569, B:303:0x057d, B:305:0x0581, B:318:0x0588, B:322:0x05d4, B:323:0x05d7, B:325:0x05e1, B:326:0x05ec, B:328:0x05f2, B:331:0x0605, B:333:0x060b, B:335:0x061d, B:337:0x063c, B:346:0x0396, B:358:0x0651, B:359:0x0654), top: B:148:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05e1 A[Catch: all -> 0x0655, Exception -> 0x0659, TryCatch #11 {all -> 0x0655, blocks: (B:158:0x036a, B:167:0x037b, B:168:0x039a, B:171:0x03a5, B:172:0x03b0, B:177:0x03d9, B:183:0x053f, B:184:0x03f5, B:230:0x0537, B:232:0x053c, B:286:0x0419, B:289:0x0557, B:296:0x0569, B:303:0x057d, B:305:0x0581, B:318:0x0588, B:322:0x05d4, B:323:0x05d7, B:325:0x05e1, B:326:0x05ec, B:328:0x05f2, B:331:0x0605, B:333:0x060b, B:335:0x061d, B:337:0x063c, B:346:0x0396, B:358:0x0651, B:359:0x0654), top: B:148:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x063c A[Catch: all -> 0x0655, Exception -> 0x0659, TRY_LEAVE, TryCatch #11 {all -> 0x0655, blocks: (B:158:0x036a, B:167:0x037b, B:168:0x039a, B:171:0x03a5, B:172:0x03b0, B:177:0x03d9, B:183:0x053f, B:184:0x03f5, B:230:0x0537, B:232:0x053c, B:286:0x0419, B:289:0x0557, B:296:0x0569, B:303:0x057d, B:305:0x0581, B:318:0x0588, B:322:0x05d4, B:323:0x05d7, B:325:0x05e1, B:326:0x05ec, B:328:0x05f2, B:331:0x0605, B:333:0x060b, B:335:0x061d, B:337:0x063c, B:346:0x0396, B:358:0x0651, B:359:0x0654), top: B:148:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0396 A[Catch: Exception -> 0x03a9, all -> 0x0655, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x03a9, blocks: (B:158:0x036a, B:167:0x037b, B:171:0x03a5, B:346:0x0396), top: B:147:0x0337 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0651 A[Catch: all -> 0x0655, Exception -> 0x0659, TRY_ENTER, TryCatch #11 {all -> 0x0655, blocks: (B:158:0x036a, B:167:0x037b, B:168:0x039a, B:171:0x03a5, B:172:0x03b0, B:177:0x03d9, B:183:0x053f, B:184:0x03f5, B:230:0x0537, B:232:0x053c, B:286:0x0419, B:289:0x0557, B:296:0x0569, B:303:0x057d, B:305:0x0581, B:318:0x0588, B:322:0x05d4, B:323:0x05d7, B:325:0x05e1, B:326:0x05ec, B:328:0x05f2, B:331:0x0605, B:333:0x060b, B:335:0x061d, B:337:0x063c, B:346:0x0396, B:358:0x0651, B:359:0x0654), top: B:148:0x0337 }] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        Throwable th;
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2;
        long j;
        int i;
        SQLiteCursor sQLiteCursor;
        NativeByteBuffer nativeByteBuffer;
        int i2;
        boolean z2;
        ArrayList arrayList;
        SQLiteDatabase sQLiteDatabase3;
        int i3;
        int i4;
        boolean z3;
        SQLitePreparedStatement executeFast;
        long j2;
        int i5;
        int i6;
        NativeByteBuffer nativeByteBuffer2;
        int i7;
        NativeByteBuffer nativeByteBuffer3;
        int i8;
        SQLiteDatabase sQLiteDatabase4;
        int i9;
        boolean isEmpty;
        int i10;
        int i11;
        SQLiteCursor sQLiteCursor2 = 0;
        byte b = 3;
        Object obj = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                ik.c0(((oc7) this.c).currentAccount, (TLRPC.TL_error) this.d, (d) this.e, (TLRPC.TL_channels_editBanned) this.f, Boolean.valueOf(this.b));
                return;
            case 1:
                cf7 cf7Var = (cf7) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                boolean z4 = this.b;
                ArrayList arrayList2 = (ArrayList) this.e;
                ArrayList arrayList3 = (ArrayList) this.f;
                try {
                } catch (Exception e) {
                    e = e;
                    z = true;
                    sQLitePreparedStatement = null;
                }
                try {
                    try {
                        try {
                            try {
                                try {
                                    sQLiteDatabase4 = cf7Var.b;
                                    Locale locale = Locale.US;
                                    i9 = message.id;
                                    j = 0;
                                } catch (Exception e2) {
                                    e = e2;
                                    j = 0;
                                }
                                try {
                                    sQLiteCursor = sQLiteDatabase4.queryFinalized("SELECT uid, read_state, custom_params FROM messages_v2 WHERE mid = " + i9 + " AND uid = " + k47.B0(message) + " LIMIT 1", new Object[0]);
                                    try {
                                    } catch (Exception e3) {
                                        e = e3;
                                        i = 0;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    i = 0;
                                    sQLiteCursor = null;
                                    cf7Var.n(e, true);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    nativeByteBuffer = null;
                                    cf7Var.b.beginTransaction();
                                    if (message.dialog_id == j) {
                                    }
                                    cf7.I(message);
                                    k47.p5(message);
                                    NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(message.getObjectSize());
                                    message.serializeToStream(nativeByteBuffer4);
                                    long e5 = cf7Var.getUserConfig().e();
                                    i2 = 0;
                                    long j3 = j;
                                    ArrayList arrayList4 = null;
                                    for (int i13 = 2; i2 < i13; i13 = 2) {
                                    }
                                    z2 = z4;
                                    if (hs6.t(message)) {
                                    }
                                    if (nativeByteBuffer != null) {
                                    }
                                    nativeByteBuffer4.reuse();
                                    cf7Var.b.commitTransaction();
                                    if (z2) {
                                    }
                                    if (arrayList != null) {
                                    }
                                    sQLiteDatabase3 = cf7Var.b;
                                    if (sQLiteDatabase3 == null) {
                                    }
                                    sQLiteDatabase3.commitTransaction();
                                    return;
                                }
                                if (!sQLiteCursor.next()) {
                                    sQLiteCursor.dispose();
                                    sQLiteCursor.dispose();
                                    sQLiteDatabase3 = cf7Var.b;
                                    if (sQLiteDatabase3 == null) {
                                        return;
                                    }
                                    sQLiteDatabase3.commitTransaction();
                                    return;
                                }
                                i = sQLiteCursor.intValue(1);
                                try {
                                    nativeByteBuffer = sQLiteCursor.byteBufferValue(2);
                                    sQLiteCursor.dispose();
                                } catch (Exception e6) {
                                    e = e6;
                                    cf7Var.n(e, true);
                                    if (sQLiteCursor != null) {
                                    }
                                    nativeByteBuffer = null;
                                    cf7Var.b.beginTransaction();
                                    if (message.dialog_id == j) {
                                    }
                                    cf7.I(message);
                                    k47.p5(message);
                                    NativeByteBuffer nativeByteBuffer42 = new NativeByteBuffer(message.getObjectSize());
                                    message.serializeToStream(nativeByteBuffer42);
                                    long e52 = cf7Var.getUserConfig().e();
                                    i2 = 0;
                                    long j32 = j;
                                    ArrayList arrayList42 = null;
                                    while (i2 < i13) {
                                    }
                                    z2 = z4;
                                    if (hs6.t(message)) {
                                    }
                                    if (nativeByteBuffer != null) {
                                    }
                                    nativeByteBuffer42.reuse();
                                    cf7Var.b.commitTransaction();
                                    if (z2) {
                                    }
                                    if (arrayList != null) {
                                    }
                                    sQLiteDatabase3 = cf7Var.b;
                                    if (sQLiteDatabase3 == null) {
                                    }
                                    sQLiteDatabase3.commitTransaction();
                                    return;
                                }
                                cf7Var.b.beginTransaction();
                                if (message.dialog_id == j) {
                                    k47.B0(message);
                                }
                                cf7.I(message);
                                k47.p5(message);
                                NativeByteBuffer nativeByteBuffer422 = new NativeByteBuffer(message.getObjectSize());
                                message.serializeToStream(nativeByteBuffer422);
                                long e522 = cf7Var.getUserConfig().e();
                                i2 = 0;
                                long j322 = j;
                                ArrayList arrayList422 = null;
                                while (i2 < i13) {
                                    int i14 = i2 == r6 ? r6 : i12;
                                    int i15 = i2;
                                    long Z1 = k47.Z1(cf7Var.currentAccount, message, cf7Var.X(message.dialog_id));
                                    long j4 = message.dialog_id;
                                    if (i14 == 0) {
                                        z3 = z4;
                                        executeFast = cf7Var.b.executeFast("REPLACE INTO messages_v2 VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?, ?)");
                                    } else if (Z1 == j322) {
                                        z3 = z4;
                                        j2 = e522;
                                        i2 = i15 + 1;
                                        z4 = z3;
                                        e522 = j2;
                                        r6 = 1;
                                        i12 = 0;
                                    } else {
                                        z3 = z4;
                                        executeFast = cf7Var.b.executeFast("REPLACE INTO messages_topics VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ?, ?)");
                                        if (j4 == e522) {
                                            try {
                                                if (k47.Q1(e522, message) != j322) {
                                                    if (arrayList422 == null) {
                                                        arrayList422 = new ArrayList();
                                                    }
                                                    arrayList422.add(message);
                                                }
                                            } catch (Exception e7) {
                                                e = e7;
                                                sQLitePreparedStatement = executeFast;
                                                z = true;
                                                sQLitePreparedStatement2 = null;
                                                try {
                                                    cf7Var.n(e, z);
                                                    sQLiteDatabase2 = cf7Var.b;
                                                    if (sQLiteDatabase2 != null) {
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                    }
                                                    if (sQLitePreparedStatement2 != null) {
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    sQLiteDatabase = cf7Var.b;
                                                    if (sQLiteDatabase != null) {
                                                        sQLiteDatabase.commitTransaction();
                                                    }
                                                    if (sQLitePreparedStatement != null) {
                                                        sQLitePreparedStatement.dispose();
                                                    }
                                                    if (sQLitePreparedStatement2 != null) {
                                                        sQLitePreparedStatement2.dispose();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                sQLitePreparedStatement = executeFast;
                                                sQLitePreparedStatement2 = null;
                                                sQLiteDatabase = cf7Var.b;
                                                if (sQLiteDatabase != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    executeFast.requery();
                                    j2 = e522;
                                    executeFast.bindInteger(1, message.id);
                                    executeFast.bindLong(2, j4);
                                    if (i14 != 0) {
                                        executeFast.bindLong(3, Z1);
                                        i5 = 4;
                                    } else {
                                        i5 = 3;
                                    }
                                    executeFast.bindInteger(i5, i);
                                    executeFast.bindInteger(i5 + 1, message.send_state);
                                    executeFast.bindInteger(i5 + 2, message.date);
                                    int i16 = i5 + 4;
                                    executeFast.bindByteBuffer(i5 + 3, nativeByteBuffer422);
                                    int i17 = i5 + 5;
                                    executeFast.bindInteger(i16, (message.out || message.from_scheduled) ? 1 : 0);
                                    int i18 = i5 + 6;
                                    executeFast.bindInteger(i17, message.ttl);
                                    int i19 = i5 + 7;
                                    if ((message.flags & 1024) != 0) {
                                        executeFast.bindInteger(i18, message.views);
                                    } else {
                                        executeFast.bindInteger(i18, cf7.b0(message));
                                    }
                                    if (message.replyStory != null) {
                                        nativeByteBuffer2 = new NativeByteBuffer(message.replyStory.getObjectSize());
                                        message.replyStory.serializeToStream(nativeByteBuffer2);
                                        i6 = i19 + 1;
                                        executeFast.bindByteBuffer(i19, nativeByteBuffer2);
                                    } else {
                                        i6 = i19 + 1;
                                        executeFast.bindNull(i19);
                                        nativeByteBuffer2 = null;
                                    }
                                    int i20 = message.stickerVerified;
                                    executeFast.bindInteger(i6, i20 == 0 ? 1 : i20 == 2 ? 2 : 0);
                                    executeFast.bindInteger(i6 + 1, message.mentioned ? 1 : 0);
                                    int i21 = i6 + 3;
                                    executeFast.bindInteger(i6 + 2, message.forwards);
                                    if (message.replies != null) {
                                        nativeByteBuffer3 = new NativeByteBuffer(message.replies.getObjectSize());
                                        message.replies.serializeToStream(nativeByteBuffer3);
                                        i7 = i6 + 4;
                                        executeFast.bindByteBuffer(i21, nativeByteBuffer3);
                                    } else {
                                        i7 = i6 + 4;
                                        executeFast.bindNull(i21);
                                        nativeByteBuffer3 = null;
                                    }
                                    TLRPC.MessageReplyHeader messageReplyHeader = message.reply_to;
                                    int i22 = i7 + 1;
                                    if (messageReplyHeader != null) {
                                        int i23 = messageReplyHeader.reply_to_top_id;
                                        if (i23 == 0) {
                                            i23 = messageReplyHeader.reply_to_msg_id;
                                        }
                                        executeFast.bindInteger(i7, i23);
                                    } else {
                                        executeFast.bindInteger(i7, 0);
                                    }
                                    int i24 = i22 + 1;
                                    TLRPC.Peer peer = message.peer_id;
                                    executeFast.bindLong(i22, peer != null ? peer.channel_id : j322);
                                    int i25 = i22 + 2;
                                    if (nativeByteBuffer != null) {
                                        executeFast.bindByteBuffer(i24, nativeByteBuffer);
                                    } else {
                                        executeFast.bindNull(i24);
                                    }
                                    if (i14 == 0) {
                                        if ((message.flags & 131072) != 0) {
                                            i8 = i25 + 1;
                                            executeFast.bindLong(i25, message.grouped_id);
                                        } else {
                                            i8 = i25 + 1;
                                            executeFast.bindNull(i25);
                                        }
                                        i25 = i8;
                                    }
                                    TLRPC.MessageReplyHeader messageReplyHeader2 = message.reply_to;
                                    if (messageReplyHeader2 != null) {
                                        executeFast.bindInteger(i25, messageReplyHeader2.story_id);
                                    } else {
                                        executeFast.bindInteger(i25, 0);
                                    }
                                    executeFast.step();
                                    executeFast.dispose();
                                    if (nativeByteBuffer3 != null) {
                                        nativeByteBuffer3.reuse();
                                    }
                                    if (nativeByteBuffer2 != null) {
                                        nativeByteBuffer2.reuse();
                                    }
                                    i2 = i15 + 1;
                                    z4 = z3;
                                    e522 = j2;
                                    r6 = 1;
                                    i12 = 0;
                                }
                                z2 = z4;
                                if (hs6.t(message)) {
                                    int i26 = 0;
                                    int i27 = 2;
                                    while (i26 < i27) {
                                        boolean z5 = i26 == 1;
                                        long Z12 = k47.Z1(cf7Var.currentAccount, message, cf7Var.X(message.dialog_id));
                                        if (z5 && Z12 == j322) {
                                            i3 = 2;
                                        } else {
                                            SQLiteDatabase sQLiteDatabase5 = cf7Var.b;
                                            SQLitePreparedStatement executeFast2 = i26 == 0 ? sQLiteDatabase5.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)") : sQLiteDatabase5.executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)");
                                            try {
                                                executeFast2.requery();
                                                executeFast2.bindInteger(1, message.id);
                                                i3 = 2;
                                                executeFast2.bindLong(2, message.dialog_id);
                                                if (i26 != 0) {
                                                    executeFast2.bindLong(3, Z12);
                                                    i4 = 4;
                                                } else {
                                                    i4 = 3;
                                                }
                                                executeFast2.bindInteger(i4, message.date);
                                                executeFast2.bindInteger(i4 + 1, hs6.h0(message));
                                                executeFast2.bindByteBuffer(i4 + 2, nativeByteBuffer422);
                                                executeFast2.step();
                                                executeFast2.dispose();
                                            } catch (Exception e8) {
                                                e = e8;
                                                sQLitePreparedStatement2 = executeFast2;
                                                sQLitePreparedStatement = null;
                                                z = true;
                                                cf7Var.n(e, z);
                                                sQLiteDatabase2 = cf7Var.b;
                                                if (sQLiteDatabase2 != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                sQLitePreparedStatement2 = executeFast2;
                                                sQLitePreparedStatement = null;
                                                sQLiteDatabase = cf7Var.b;
                                                if (sQLiteDatabase != null) {
                                                }
                                                if (sQLitePreparedStatement != null) {
                                                }
                                                if (sQLitePreparedStatement2 != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                        i26++;
                                        i27 = i3;
                                    }
                                }
                                if (nativeByteBuffer != null) {
                                    nativeByteBuffer.reuse();
                                }
                                nativeByteBuffer422.reuse();
                                cf7Var.b.commitTransaction();
                                if (z2) {
                                    HashMap hashMap = new HashMap();
                                    HashMap hashMap2 = new HashMap();
                                    for (int i28 = 0; i28 < arrayList2.size(); i28++) {
                                        TLRPC.User user = (TLRPC.User) arrayList2.get(i28);
                                        hashMap.put(Long.valueOf(user.id), user);
                                    }
                                    for (int i29 = 0; i29 < arrayList3.size(); i29++) {
                                        TLRPC.Chat chat = (TLRPC.Chat) arrayList3.get(i29);
                                        hashMap2.put(Long.valueOf(chat.id), chat);
                                    }
                                    arrayList = arrayList422;
                                    k47 k47Var = new k47(cf7Var.currentAccount, message, (AbstractMap) hashMap, (AbstractMap) hashMap2, true, true);
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(k47Var);
                                    gm.c3(new ud7((Object) cf7Var, (Object) k47Var, (Object) arrayList5, (byte) 1));
                                } else {
                                    arrayList = arrayList422;
                                }
                                if (arrayList != null) {
                                    gm.c3(new p51(cf7Var, arrayList, (byte) 17));
                                }
                                sQLiteDatabase3 = cf7Var.b;
                                if (sQLiteDatabase3 == null) {
                                    return;
                                }
                                sQLiteDatabase3.commitTransaction();
                                return;
                            } catch (Throwable th5) {
                                th = th5;
                                sQLiteCursor2 = 0;
                                if (sQLiteCursor2 != 0) {
                                    sQLiteCursor2.dispose();
                                }
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            if (sQLiteCursor2 != 0) {
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        sQLitePreparedStatement = null;
                        sQLitePreparedStatement2 = null;
                        sQLiteDatabase = cf7Var.b;
                        if (sQLiteDatabase != null) {
                        }
                        if (sQLitePreparedStatement != null) {
                        }
                        if (sQLitePreparedStatement2 != null) {
                        }
                        throw th;
                    }
                } catch (Exception e9) {
                    e = e9;
                    sQLitePreparedStatement = null;
                    z = true;
                    sQLitePreparedStatement2 = null;
                    cf7Var.n(e, z);
                    sQLiteDatabase2 = cf7Var.b;
                    if (sQLiteDatabase2 != null) {
                        sQLiteDatabase2.commitTransaction();
                    }
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                        return;
                    }
                    return;
                }
            case 2:
                ej0 ej0Var = (ej0) this.c;
                String str = (String) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                boolean z6 = this.b;
                Bitmap bitmap2 = (Bitmap) this.f;
                if (TextUtils.equals((String) ej0Var.a, str)) {
                    ej0Var.f = null;
                    Bitmap bitmap3 = (Bitmap) ej0Var.c;
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    ej0Var.c = bitmap;
                    ((Runnable) ej0Var.e).run();
                } else {
                    bitmap.recycle();
                }
                if (z6) {
                    bitmap2.recycle();
                    return;
                }
                return;
            case 3:
                TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) this.c;
                boolean z7 = this.b;
                String str2 = (String) this.d;
                TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) this.f;
                d dVar = (d) this.e;
                if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo) {
                    yn0.d(z7, str2, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway, dVar.getParentActivity(), dVar.getResourceProvider());
                    return;
                } else {
                    if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                        yn0.e(z7, str2, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway, dVar.getParentActivity(), dVar.getResourceProvider());
                        return;
                    }
                    return;
                }
            case 4:
                q51 q51Var = (q51) this.c;
                ArrayList arrayList6 = (ArrayList) this.d;
                ArrayList arrayList7 = (ArrayList) this.e;
                ArrayList arrayList8 = (ArrayList) this.f;
                boolean z8 = this.b;
                ArrayList arrayList9 = q51Var.b;
                arrayList9.clear();
                arrayList9.addAll(arrayList6);
                int i30 = q51Var.a;
                oc7.r1(i30).d4(arrayList7, true);
                oc7.r1(i30).X3(arrayList8, true);
                nm7.f(i30).k(nm7.F1, new Object[0]);
                q51Var.c = false;
                q51Var.e(false, z8);
                return;
            case 5:
                ((CameraController) this.c).lambda$recordVideo$12((CameraController.ICameraView) this.d, (File) this.e, this.b, (Runnable) this.f);
                return;
            case 6:
                ik1 ik1Var = (ik1) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject = (TLObject) this.e;
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) this.f;
                boolean z9 = this.b;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    twoStepVerificationActivity.J = password;
                    TwoStepVerificationActivity.f0(password);
                    ik1Var.G(z9, twoStepVerificationActivity.e0(), twoStepVerificationActivity);
                    return;
                }
                return;
            case 7:
                yv1 yv1Var = (yv1) this.c;
                br1 br1Var = (br1) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                sm1 sm1Var = (sm1) this.f;
                boolean z10 = this.b;
                br1Var.c(false);
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    yv1Var.getMessagesController().d4(tL_contacts_resolvedPeer.users, false);
                    yv1Var.getMessagesController().X3(tL_contacts_resolvedPeer.chats, false);
                    long n = pg3.n(tL_contacts_resolvedPeer.peer);
                    if (n >= 0) {
                        obj = yv1Var.getMessagesController().W1(Long.valueOf(n));
                    } else if (n < 0) {
                        obj = yv1Var.getMessagesController().L0(Long.valueOf(-n));
                    }
                }
                sm1Var.a(obj, Boolean.valueOf(z10));
                return;
            case 8:
                a();
                return;
            case 9:
                boolean[] zArr = (boolean[]) this.c;
                fn3 fn3Var = (fn3) this.d;
                String str3 = (String) this.e;
                int[] iArr = (int[]) this.f;
                boolean z11 = this.b;
                gn3[] gn3VarArr = DictationAsr.a;
                if (zArr[0]) {
                    return;
                }
                fn3Var.a(str3, iArr, z11);
                return;
            case 10:
                qu3 qu3Var = (qu3) this.c;
                boolean z12 = this.b;
                vc vcVar = (vc) this.d;
                String str4 = (String) this.e;
                TextView textView = (TextView) this.f;
                ClipboardManager clipboardManager = (ClipboardManager) qu3Var.getContext().getSystemService("clipboard");
                r6 = (z12 && (TextUtils.isEmpty(vcVar.getText()) || TextUtils.equals(vcVar.getText().toString(), str4)) && clipboardManager != null && clipboardManager.hasPrimaryClip()) ? 1 : 0;
                wi8.t(textView.animate().alpha(r6 != 0 ? 1.0f : 0.0f).scaleX(r6 != 0 ? 1.0f : 0.7f).scaleY(r6 == 0 ? 0.7f : 1.0f), d53.h, 300L);
                return;
            case 11:
                ww3 ww3Var = (ww3) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                boolean z13 = this.b;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = (TLRPC.TL_messages_getInlineBotResults) this.e;
                String str5 = (String) this.f;
                yw3 yw3Var = ww3Var.s;
                ArrayList arrayList10 = yw3Var.n;
                if (ww3Var.r) {
                    if (!(tLObject3 instanceof TLRPC.messages_BotResults)) {
                        px3 px3Var = yw3Var.r;
                        int i31 = px3.C1;
                        ww3Var.d = ConnectionsManager.getInstance(px3Var.a).sendRequest(tL_messages_getInlineBotResults, new vj1(ww3Var, str5, z13, b));
                        return;
                    }
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject3;
                    ww3Var.h = messages_botresults.next_offset;
                    if (z13) {
                        arrayList10.clear();
                    }
                    arrayList10.size();
                    arrayList10.addAll(messages_botresults.results);
                    ww3Var.f();
                    yw3Var.d.c(false);
                    ww3Var.r = false;
                    return;
                }
                return;
            case 12:
                b();
                return;
            case 13:
                e94 e94Var = (e94) this.c;
                TLObject tLObject4 = (TLObject) this.d;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.e;
                boolean z14 = this.b;
                he heVar = (he) this.f;
                if (tLObject4 instanceof TLRPC.Updates) {
                    Utilities.d.c(new pv3(e94Var, tLObject4, (byte) 16));
                    d S = LaunchActivity.S();
                    if (S != null && ((isEmpty = TextUtils.isEmpty(tL_textWithEntities.text)) || !z14)) {
                        c41 b0 = c41.b0(S);
                        if (isEmpty) {
                            i10 = R.raw.ic_delete;
                            i11 = 2131750790;
                        } else {
                            i10 = R.raw.contact_check;
                            i11 = 2131750788;
                        }
                        ts2.u(null, i11, b0, i10, 36);
                    }
                }
                heVar.dismiss();
                return;
            case 14:
                c();
                return;
            case 15:
                d();
                return;
            case 16:
                e();
                return;
            case 17:
                f();
                return;
            case 18:
                g();
                return;
            case 19:
                h();
                return;
            case 20:
                i();
                return;
            case 21:
                j();
                return;
            case 22:
                k();
                return;
            case 23:
                l();
                return;
            default:
                v6c v6cVar = (v6c) this.c;
                boolean[] zArr2 = (boolean[]) this.d;
                ArrayList arrayList11 = (ArrayList) this.e;
                boolean z15 = this.b;
                qac qacVar = (qac) this.f;
                ArrayList arrayList12 = v6cVar.b;
                HashSet hashSet = new HashSet();
                ArrayList arrayList13 = new ArrayList();
                for (int i32 = 0; i32 < zArr2.length; i32++) {
                    if (zArr2[i32]) {
                        u6c u6cVar = (u6c) arrayList11.get(i32);
                        arrayList13.add(u6cVar);
                        hashSet.add(Long.valueOf(u6cVar.b));
                    }
                }
                if (!z15) {
                    int i33 = 0;
                    while (i33 < arrayList12.size()) {
                        if (hashSet.contains(Long.valueOf(((u6c) arrayList12.get(i33)).b))) {
                            arrayList12.remove(i33);
                            i33--;
                        }
                        i33++;
                    }
                    if (!hashSet.isEmpty()) {
                        v6cVar.d();
                        nm7.f(v6cVar.a).k(nm7.f3, new Object[0]);
                        v6cVar.e();
                    }
                }
                qacVar.a(arrayList13);
                return;
        }
    }

    public /* synthetic */ aa7(Object obj, Object obj2, Object obj3, Object obj4, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = z;
    }

    public /* synthetic */ aa7(Object obj, Object obj2, Object obj3, boolean z, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
    }

    public /* synthetic */ aa7(Object obj, Object obj2, boolean z, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ aa7(Object obj, boolean z, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.b = z;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ aa7(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z, String str, long j, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, d dVar) {
        this.a = (byte) 3;
        this.c = payments_giveawayinfo;
        this.b = z;
        this.d = str;
        this.f = tL_messageMediaGiveaway;
        this.e = dVar;
    }

    public /* synthetic */ aa7(d dVar, Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.e = dVar;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
        this.b = z;
    }
}
