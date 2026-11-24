// default package

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class d97 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d97(a28 a28Var, View view, h19 h19Var, boolean z, boolean z2) {
        this.a = (byte) 9;
        this.c = a28Var;
        this.d = view;
        this.e = h19Var;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        char c;
        vf6 vf6Var;
        boolean z;
        Integer num;
        int i2;
        int i3;
        ArrayList arrayList;
        int i4;
        Integer num2;
        Integer num3;
        byte[] bArr;
        byte[] bArr2;
        int i5;
        int i6;
        File file;
        int i7;
        String[] split;
        byte b = 8;
        byte[] bArr3 = null;
        bArr3 = null;
        byte b2 = 2;
        switch (this.a) {
            case 0:
                na7 na7Var = (na7) this.c;
                boolean z2 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                if (z2) {
                    i = 0;
                    na7Var.getNotificationCenter().k(2, 64);
                } else {
                    i = 0;
                }
                na7Var.r5(i, -updates.chat_id, arrayList2);
                na7Var.getNotificationCenter().k(3, new Object[i]);
                return;
            case 1:
                r97 r97Var = (r97) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z3 = this.b;
                int i8 = r97Var.a;
                ArrayList arrayList3 = r97Var.e;
                if (iArr[0] == r97Var.f) {
                    r97Var.c = false;
                    r97Var.f = -1;
                    if (tLObject instanceof TLRPC.messages_Chats) {
                        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                        na7.q1(i8).V3(messages_chats.chats, false);
                        if (z3) {
                            arrayList3.clear();
                        }
                        arrayList3.addAll(messages_chats.chats);
                        r97Var.g = messages_chats instanceof TLRPC.TL_messages_chatsSlice ? messages_chats.count : messages_chats.chats.size();
                        r97Var.d = arrayList3.size() >= r97Var.g;
                        c = 1;
                    } else {
                        c = 1;
                        r97Var.d = true;
                    }
                    kk7 f = kk7.f(i8);
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(r97Var.b);
                    objArr[c] = r97Var;
                    f.k(kk7.Q3, objArr);
                    return;
                }
                return;
            case 2:
                ((ad7) this.c).k1((List) this.d, (List) this.e, this.b);
                return;
            case 3:
                im7 im7Var = (im7) this.c;
                vf6 vf6Var2 = (vf6) this.d;
                boolean z4 = this.b;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList arrayList5 = im7Var.b;
                vf6 vf6Var3 = im7Var.c;
                vf6 vf6Var4 = im7Var.f;
                int i9 = im7Var.J;
                im7Var.getAccountInstance().d();
                Integer num4 = 0;
                int i10 = 0;
                while (i10 < vf6Var2.m()) {
                    long j = vf6Var2.j(i10);
                    SparseArray sparseArray = (SparseArray) vf6Var3.f(j);
                    if (sparseArray == null) {
                        vf6Var = vf6Var2;
                        z = z4;
                        num = num4;
                        i2 = i10;
                    } else {
                        ArrayList arrayList6 = (ArrayList) vf6Var2.f(j);
                        int i11 = 0;
                        for (int size = arrayList6.size(); i11 < size; size = i4) {
                            vf6 vf6Var5 = vf6Var2;
                            int intValue = ((Integer) arrayList6.get(i11)).intValue();
                            boolean z5 = z4;
                            k27 k27Var = (k27) sparseArray.get(intValue);
                            Integer num5 = num4;
                            if (k27Var == null || k27Var.J || (z5 && !k27Var.I)) {
                                i3 = i10;
                                arrayList = arrayList6;
                                i4 = size;
                            } else {
                                i3 = i10;
                                long B0 = k27.B0(k27Var.k);
                                Integer num6 = (Integer) vf6Var4.f(B0);
                                Integer num7 = num6 == null ? num5 : num6;
                                int intValue2 = num7.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    arrayList = arrayList6;
                                    im7Var.e.l(B0);
                                    Integer num8 = num7;
                                    i4 = size;
                                    num2 = num8;
                                    num3 = num5;
                                } else {
                                    arrayList = arrayList6;
                                    Integer num9 = num7;
                                    i4 = size;
                                    num2 = num9;
                                    num3 = valueOf;
                                }
                                if (!num3.equals(num2)) {
                                    Integer num10 = num2;
                                    if (!im7Var.getMessagesController().l2(B0)) {
                                        boolean r2 = im7Var.getMessagesController().r2(B0);
                                        int i12 = im7Var.J;
                                        if (r2) {
                                            int i13 = i12 - (num10.intValue() > 0 ? 1 : 0);
                                            im7Var.J = i13;
                                            im7Var.J = i13 + (num3.intValue() > 0 ? 1 : 0);
                                        } else {
                                            int intValue3 = i12 - num10.intValue();
                                            im7Var.J = intValue3;
                                            im7Var.J = num3.intValue() + intValue3;
                                        }
                                    }
                                    vf6Var4.k(num3, B0);
                                }
                                if (num3.intValue() == 0) {
                                    vf6Var4.l(B0);
                                    im7Var.r.l(B0);
                                }
                                sparseArray.remove(intValue);
                                arrayList5.remove(k27Var);
                                im7Var.a.remove(k27Var);
                                if (im7.y(k27Var)) {
                                    im7Var.K--;
                                }
                                arrayList4.add(k27Var);
                            }
                            i11++;
                            num4 = num5;
                            i10 = i3;
                            vf6Var2 = vf6Var5;
                            z4 = z5;
                            arrayList6 = arrayList;
                        }
                        vf6Var = vf6Var2;
                        z = z4;
                        num = num4;
                        i2 = i10;
                        if (sparseArray.size() == 0) {
                            vf6Var3.l(j);
                        }
                    }
                    i10 = i2 + 1;
                    num4 = num;
                    vf6Var2 = vf6Var;
                    z4 = z;
                }
                if (!arrayList4.isEmpty()) {
                    gl.c3(new yl7(im7Var, arrayList4, (byte) 1));
                }
                if (i9 != im7Var.J) {
                    if (im7Var.L) {
                        im7Var.Q(im7Var.M > im7Var.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList5.clear();
                        im7Var.Z(im7Var.L);
                    }
                    gl.c3(new cm7(im7Var, vf6Var4.m(), (byte) 1));
                }
                im7Var.L = false;
                if (im7Var.S) {
                    im7Var.S(im7Var.t());
                    return;
                }
                return;
            case 4:
                gu7 gu7Var = (gu7) this.c;
                qx qxVar = (qx) this.d;
                qx qxVar2 = (qx) this.e;
                boolean z6 = this.b;
                byte b3 = 0;
                gu7Var.f.f(new eu7(gu7Var, qxVar, b3));
                gu7Var.f.f(new eu7(gu7Var, qxVar2, b3));
                gu7Var.E = z6;
                return;
            case 5:
                lx7 lx7Var = (lx7) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z7 = this.b;
                vx7 vx7Var = lx7Var.e;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    vx7Var.K = password;
                    TwoStepVerificationActivity.e0(password);
                    vx7Var.D1(z7);
                    return;
                }
                return;
            case 6:
                lx7 lx7Var2 = (lx7) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                String str = (String) this.e;
                boolean z8 = this.b;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) tLObject3;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings.secure_settings;
                vx7 vx7Var2 = lx7Var2.e;
                if (tL_secureSecretSettings != null) {
                    vx7Var2.d1 = tL_secureSecretSettings.secure_secret;
                    vx7Var2.c1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        vx7Var2.f1 = Utilities.s(bArr, gl.g1(str), bArr);
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                            byte[] bArr4 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                            vx7Var2.f1 = Utilities.m(gl.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                            bArr2 = bArr4;
                            gl.c3(new d97((Object) lx7Var2, (Object) passwordsettings, z8, (Object) bArr2, (byte) 7));
                            return;
                        }
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            gl.c3(new oq7(lx7Var2, b));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = vx7Var2.K.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr5 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        vx7Var2.f1 = Utilities.m(gl.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr5;
                    } else {
                        bArr = new byte[0];
                    }
                    vx7Var2.d1 = null;
                    vx7Var2.c1 = 0L;
                }
                bArr2 = bArr;
                gl.c3(new d97((Object) lx7Var2, (Object) passwordsettings, z8, (Object) bArr2, (byte) 7));
                return;
            case 7:
                lx7 lx7Var3 = (lx7) this.c;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) this.d;
                boolean z9 = this.b;
                byte[] bArr6 = (byte[]) this.e;
                vx7 vx7Var3 = lx7Var3.e;
                vx7Var3.e1 = passwordsettings2.email;
                if (z9) {
                    vx7Var3.f1 = vx7Var3.Q0;
                }
                byte[] bArr7 = vx7Var3.d1;
                byte[] bArr8 = vx7Var3.f1;
                if (bArr7 != null && bArr7.length == 32) {
                    byte[] bArr9 = new byte[32];
                    System.arraycopy(bArr8, 0, bArr9, 0, 32);
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 32, bArr10, 0, 16);
                    byte[] bArr11 = new byte[32];
                    System.arraycopy(bArr7, 0, bArr11, 0, 32);
                    Utilities.b(bArr11, bArr9, bArr10, 0, 32, 0, 0);
                    bArr3 = bArr11;
                }
                if (vx7.R0(bArr3, Long.valueOf(vx7Var3.c1)) && bArr6.length != 0 && vx7Var3.c1 != 0) {
                    if (vx7Var3.c != 0) {
                        lx7Var3.a();
                        return;
                    }
                    TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                    i6 = ((d) vx7Var3).currentAccount;
                    ConnectionsManager.getInstance(i6).sendRequest(getallsecurevalues, new jx7(lx7Var3, (byte) 0));
                    return;
                }
                if (z9) {
                    i5 = ((d) vx7Var3).currentAccount;
                    y6c.h(i5).t();
                    vx7Var3.O0 = (byte) 0;
                    vx7Var3.U1();
                    return;
                }
                TL_account.authorizationForm authorizationform = vx7Var3.E;
                if (authorizationform != null) {
                    authorizationform.values.clear();
                    vx7Var3.E.errors.clear();
                }
                byte[] bArr12 = vx7Var3.d1;
                if (bArr12 == null || bArr12.length == 0) {
                    Utilities.e.c(new pc7((Object) lx7Var3, (Object) lx7Var3.b, (Object) lx7Var3.d, (byte) 11));
                    return;
                } else {
                    lx7Var3.b();
                    return;
                }
            case 8:
                p pVar = (p) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                boolean z10 = this.b;
                pVar.getClass();
                if (tL_error2 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject4;
                    pVar.b0 = password2;
                    TwoStepVerificationActivity.e0(password2);
                    pVar.F0(z10);
                    return;
                }
                return;
            case 9:
                a28 a28Var = (a28) this.c;
                View view = (View) this.d;
                h19 h19Var = (h19) this.e;
                boolean z11 = this.b;
                y28 y28Var = a28Var.a;
                ij.X(y28Var.s2, y28Var.r1, 1, new gv1(a28Var, z11, h19Var, view));
                return;
            case 10:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                d dVar = (d) this.d;
                boolean z12 = this.b;
                ve9 ve9Var = (ve9) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                lf9.k(dVar, z12, new kq8(ve9Var, trim, b));
                return;
            case 11:
                ul9 ul9Var = (ul9) this.c;
                nk9 nk9Var = (nk9) this.d;
                boolean z13 = this.b;
                ql9 ql9Var = (ql9) this.e;
                long j2 = ul9Var.q;
                long nanoTime = System.nanoTime();
                try {
                    nk9Var.g();
                    long h = nk9Var.h();
                    ul9Var.m.b("active output finalized: size=" + nk9Var.a.length() + ", durationMs=" + h + ", elapsedMs=" + ul9.f(nanoTime));
                    ul9Var.g();
                    boolean z14 = h > j2;
                    if (z13 && !z14) {
                        ul9Var.k.execute(new gl9(ul9Var, ql9Var, nk9Var.a, h, true));
                        return;
                    }
                    File file2 = nk9Var.a;
                    try {
                        synchronized (nk9Var) {
                            try {
                                i7 = nk9Var.s;
                            } finally {
                                th = th;
                                file = file2;
                                while (true) {
                                    try {
                                        try {
                                        } catch (Throwable th) {
                                            th = th;
                                            cte.c(file);
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    try {
                        ul9Var.u(file, i7, 0L, Math.min(j2, h), z13, z14 ? 1 : 2);
                        cte.c(file);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        cte.c(file);
                        throw th;
                    }
                } catch (Exception e) {
                    ul9Var.i.post(new el9(ul9Var, e, b2));
                    return;
                }
            case 12:
                w3a w3aVar = (w3a) this.c;
                j5 j5Var = (j5) this.d;
                y3a y3aVar = (y3a) this.e;
                boolean z15 = this.b;
                w3aVar.a = z3a.B(j5Var.a).z(y3aVar.c, y3aVar.a, y3aVar.x);
                if (z15 && y3aVar.r) {
                    new File(y3aVar.c).delete();
                }
                w3aVar.c.countDown();
                return;
            case 13:
                n6a n6aVar = (n6a) this.c;
                dz2 dz2Var = (dz2) this.d;
                k44 k44Var = (k44) this.e;
                boolean z16 = this.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                n6aVar.b.e(dz2Var, k44Var.a, z16);
                return;
            case 14:
                xsa xsaVar = (xsa) this.c;
                int[] iArr2 = (int[]) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z17 = this.b;
                ArrayList arrayList7 = xsaVar.l;
                int i14 = xsaVar.a;
                if (iArr2[0] == xsaVar.m) {
                    xsaVar.i = false;
                    xsaVar.m = -1;
                    if (tLObject5 instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject5;
                        na7.q1(i14).b4(tL_payments_savedStarGifts.users, false);
                        na7.q1(i14).V3(tL_payments_savedStarGifts.chats, false);
                        if (z17) {
                            arrayList7.clear();
                        }
                        arrayList7.addAll(tL_payments_savedStarGifts.gifts);
                        xsaVar.k = tL_payments_savedStarGifts.next_offset;
                        xsaVar.n = tL_payments_savedStarGifts.count;
                        xsaVar.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        xsaVar.j = arrayList7.size() > xsaVar.n || xsaVar.k == null;
                    } else {
                        xsaVar.j = true;
                    }
                    kk7.f(i14).k(kk7.H3, Long.valueOf(xsaVar.b), xsaVar);
                    return;
                }
                return;
            case 15:
                j0b j0bVar = (j0b) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                boolean z18 = this.b;
                hd hdVar = (hd) this.e;
                u0b u0bVar = j0bVar.a;
                if (tLObject6 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject6;
                    hq6.d0(y6c.t0).L1(tL_messages_stickerSet, true);
                    if (z18) {
                        hq6.d0(y6c.t0).h2(null, tLObject6, 0, null, false, false);
                    } else {
                        u0bVar.M1 = tL_messages_stickerSet;
                        u0bVar.L0();
                        u0bVar.T0();
                    }
                }
                hdVar.dismiss();
                return;
            case 16:
                f4b f4bVar = (f4b) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z19 = this.b;
                Runnable runnable = (Runnable) this.e;
                f4bVar.getClass();
                try {
                    bitmap.compress(z19 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(f4bVar.Z0));
                } catch (Exception e2) {
                    fa4.g(e2, false);
                    if (z19) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(f4bVar.Z0));
                        } catch (Exception e3) {
                            fa4.g(e3, false);
                        }
                    }
                }
                bitmap.recycle();
                gl.c3(runnable);
                return;
            case 17:
                String[] strArr = (String[]) this.c;
                akb akbVar = (akb) this.d;
                boolean z20 = this.b;
                b1 b1Var = (b1) this.e;
                try {
                    bkb.f0 = bkb.jm.get(bkb.f5, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (akbVar.c != null) {
                                new File(akbVar.c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        akbVar.c = null;
                        bkb.g0 = null;
                    } else {
                        String str2 = strArr[0];
                        bkb.g0 = str2;
                        String absolutePath = sqc.d(str2).getAbsolutePath();
                        try {
                            String str3 = akbVar.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(akbVar.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        akbVar.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(bkb.g0);
                            akbVar.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i15 = 0; i15 < split.length; i15++) {
                                    if ("blur".equals(split[i15])) {
                                        akbVar.h = true;
                                    } else if ("motion".equals(split[i15])) {
                                        akbVar.n = true;
                                    }
                                }
                            }
                            Utilities.z(parse.getQueryParameter("intensity"));
                            akbVar.y = 45;
                            try {
                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    akbVar.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && gl.Q1(queryParameter2.charAt(6))) {
                                        akbVar.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && gl.Q1(queryParameter2.charAt(13))) {
                                        akbVar.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && gl.Q1(queryParameter2.charAt(20))) {
                                        akbVar.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    akbVar.y = Utilities.z(queryParameter3).intValue();
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th5) {
                            fa4.g(th5, true);
                        }
                    }
                    if (!z20 && bkb.M == null) {
                        bkb.K = akbVar;
                        if ((bkb.I == bkb.J) != false) {
                            bkb.T = 2000;
                            bkb.U = SystemClock.elapsedRealtime();
                            gl.d3(new am6(b2), 2100L);
                        }
                    }
                    bkb.I = akbVar;
                    bkb.r1(false, false);
                } catch (Exception e4) {
                    fa4.g(e4, true);
                }
                if (bkb.M == null && !bkb.Q) {
                    na7.q1(akbVar.F).A4(akbVar, akbVar.i(false), z20, false);
                }
                b1Var.run();
                return;
            case 18:
                ((p3c) this.c).w0((TLObject) this.e, (TLRPC.TL_error) this.d, this.b);
                return;
            default:
                ((VoIPService) this.c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.b);
                return;
        }
    }

    public /* synthetic */ d97(na7 na7Var, boolean z, TLRPC.Updates updates, ArrayList arrayList) {
        this.a = (byte) 0;
        this.c = na7Var;
        this.b = z;
        this.d = updates;
        this.e = arrayList;
    }

    public /* synthetic */ d97(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ d97(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
