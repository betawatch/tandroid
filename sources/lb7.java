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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lb7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ lb7(q58 q58Var, View view, w49 w49Var, boolean z, boolean z2) {
        this.a = (byte) 9;
        this.c = q58Var;
        this.d = view;
        this.e = w49Var;
        this.b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int i;
        char c;
        zh6 zh6Var;
        boolean z;
        Integer num;
        int i2;
        int i3;
        ArrayList arrayList;
        int i4;
        Integer num2;
        Integer num3;
        int i5;
        int i6;
        byte[] bArr;
        byte[] bArr2;
        File file;
        int i7;
        String[] split;
        byte b = 23;
        byte[] bArr3 = null;
        bArr3 = null;
        byte b2 = 2;
        switch (this.a) {
            case 0:
                uc7 uc7Var = (uc7) this.c;
                boolean z2 = this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                if (z2) {
                    i = 0;
                    uc7Var.getNotificationCenter().k(2, 64);
                } else {
                    i = 0;
                }
                uc7Var.z5(i, -updates.chat_id, arrayList2);
                uc7Var.getNotificationCenter().k(3, new Object[i]);
                return;
            case 1:
                yb7 yb7Var = (yb7) this.c;
                int[] iArr = (int[]) this.d;
                TLObject tLObject = (TLObject) this.e;
                boolean z3 = this.b;
                int i8 = yb7Var.a;
                ArrayList arrayList3 = yb7Var.e;
                if (iArr[0] == yb7Var.f) {
                    yb7Var.c = false;
                    yb7Var.f = -1;
                    if (tLObject instanceof TLRPC.messages_Chats) {
                        TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                        uc7.s1(i8).c4(messages_chats.chats, false);
                        if (z3) {
                            arrayList3.clear();
                        }
                        arrayList3.addAll(messages_chats.chats);
                        yb7Var.g = messages_chats instanceof TLRPC.TL_messages_chatsSlice ? messages_chats.count : messages_chats.chats.size();
                        yb7Var.d = arrayList3.size() >= yb7Var.g;
                        c = 1;
                    } else {
                        c = 1;
                        yb7Var.d = true;
                    }
                    jn7 f = jn7.f(i8);
                    Object[] objArr = new Object[2];
                    objArr[0] = Long.valueOf(yb7Var.b);
                    objArr[c] = yb7Var;
                    f.k(jn7.R3, objArr);
                    return;
                }
                return;
            case 2:
                ((jf7) this.c).k1((List) this.d, (List) this.e, this.b);
                return;
            case 3:
                ip7 ip7Var = (ip7) this.c;
                zh6 zh6Var2 = (zh6) this.d;
                boolean z4 = this.b;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList arrayList5 = ip7Var.b;
                zh6 zh6Var3 = ip7Var.c;
                zh6 zh6Var4 = ip7Var.f;
                int i9 = ip7Var.J;
                ip7Var.getAccountInstance().d();
                Integer num4 = 0;
                int i10 = 0;
                while (i10 < zh6Var2.m()) {
                    long j = zh6Var2.j(i10);
                    SparseArray sparseArray = (SparseArray) zh6Var3.f(j);
                    if (sparseArray == null) {
                        zh6Var = zh6Var2;
                        z = z4;
                        num = num4;
                        i2 = i10;
                    } else {
                        ArrayList arrayList6 = (ArrayList) zh6Var2.f(j);
                        int i11 = 0;
                        for (int size = arrayList6.size(); i11 < size; size = i4) {
                            zh6 zh6Var5 = zh6Var2;
                            int intValue = ((Integer) arrayList6.get(i11)).intValue();
                            boolean z5 = z4;
                            r47 r47Var = (r47) sparseArray.get(intValue);
                            Integer num5 = num4;
                            if (r47Var == null || r47Var.J || (z5 && !r47Var.I)) {
                                i3 = i10;
                                arrayList = arrayList6;
                                i4 = size;
                            } else {
                                i3 = i10;
                                long B0 = r47.B0(r47Var.k);
                                Integer num6 = (Integer) zh6Var4.f(B0);
                                Integer num7 = num6 == null ? num5 : num6;
                                int intValue2 = num7.intValue() - 1;
                                Integer valueOf = Integer.valueOf(intValue2);
                                if (intValue2 <= 0) {
                                    arrayList = arrayList6;
                                    ip7Var.e.l(B0);
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
                                    if (!ip7Var.getMessagesController().n2(B0)) {
                                        boolean v2 = ip7Var.getMessagesController().v2(B0);
                                        int i12 = ip7Var.J;
                                        if (v2) {
                                            int i13 = i12 - (num10.intValue() > 0 ? 1 : 0);
                                            ip7Var.J = i13;
                                            ip7Var.J = i13 + (num3.intValue() > 0 ? 1 : 0);
                                        } else {
                                            int intValue3 = i12 - num10.intValue();
                                            ip7Var.J = intValue3;
                                            ip7Var.J = num3.intValue() + intValue3;
                                        }
                                    }
                                    zh6Var4.k(B0, num3);
                                }
                                if (num3.intValue() == 0) {
                                    zh6Var4.l(B0);
                                    ip7Var.r.l(B0);
                                }
                                sparseArray.remove(intValue);
                                arrayList5.remove(r47Var);
                                ip7Var.a.remove(r47Var);
                                if (ip7.y(r47Var)) {
                                    ip7Var.K--;
                                }
                                arrayList4.add(r47Var);
                            }
                            i11++;
                            num4 = num5;
                            i10 = i3;
                            zh6Var2 = zh6Var5;
                            z4 = z5;
                            arrayList6 = arrayList;
                        }
                        zh6Var = zh6Var2;
                        z = z4;
                        num = num4;
                        i2 = i10;
                        if (sparseArray.size() == 0) {
                            zh6Var3.l(j);
                        }
                    }
                    i10 = i2 + 1;
                    num4 = num;
                    zh6Var2 = zh6Var;
                    z4 = z;
                }
                if (!arrayList4.isEmpty()) {
                    hl.c3(new xo7(ip7Var, arrayList4, (byte) 1));
                }
                if (i9 != ip7Var.J) {
                    if (ip7Var.L) {
                        ip7Var.Q(ip7Var.M > ip7Var.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList5.clear();
                        ip7Var.Z(ip7Var.L);
                    }
                    hl.c3(new bp7(ip7Var, zh6Var4.m(), (byte) 1));
                }
                ip7Var.L = false;
                if (ip7Var.S) {
                    ip7Var.S(ip7Var.t());
                    return;
                }
                return;
            case 4:
                nx7 nx7Var = (nx7) this.c;
                rx rxVar = (rx) this.d;
                rx rxVar2 = (rx) this.e;
                boolean z6 = this.b;
                byte b3 = 0;
                nx7Var.f.f(new lx7(nx7Var, rxVar, b3));
                nx7Var.f.f(new lx7(nx7Var, rxVar2, b3));
                nx7Var.E = z6;
                return;
            case 5:
                r08 r08Var = (r08) this.c;
                TL_account.passwordSettings passwordsettings = (TL_account.passwordSettings) this.d;
                boolean z7 = this.b;
                byte[] bArr4 = (byte[]) this.e;
                b18 b18Var = r08Var.e;
                b18Var.e1 = passwordsettings.email;
                if (z7) {
                    b18Var.f1 = b18Var.Q0;
                }
                byte[] bArr5 = b18Var.d1;
                byte[] bArr6 = b18Var.f1;
                if (bArr5 != null && bArr5.length == 32) {
                    byte[] bArr7 = new byte[32];
                    System.arraycopy(bArr6, 0, bArr7, 0, 32);
                    byte[] bArr8 = new byte[16];
                    System.arraycopy(bArr6, 32, bArr8, 0, 16);
                    byte[] bArr9 = new byte[32];
                    System.arraycopy(bArr5, 0, bArr9, 0, 32);
                    Utilities.b(bArr9, bArr7, bArr8, 0, 32, 0, 0);
                    bArr3 = bArr9;
                }
                if (b18.S0(bArr3, Long.valueOf(b18Var.c1)) && bArr4.length != 0 && b18Var.c1 != 0) {
                    if (b18Var.c != 0) {
                        r08Var.a();
                        return;
                    }
                    TL_account.getAllSecureValues getallsecurevalues = new TL_account.getAllSecureValues();
                    i6 = ((e) b18Var).currentAccount;
                    ConnectionsManager.getInstance(i6).sendRequest(getallsecurevalues, new o08(r08Var, (byte) 1));
                    return;
                }
                if (z7) {
                    i5 = ((e) b18Var).currentAccount;
                    yac.h(i5).t();
                    b18Var.O0 = (byte) 0;
                    b18Var.V1();
                    return;
                }
                TL_account.authorizationForm authorizationform = b18Var.E;
                if (authorizationform != null) {
                    authorizationform.values.clear();
                    b18Var.E.errors.clear();
                }
                byte[] bArr10 = b18Var.d1;
                if (bArr10 == null || bArr10.length == 0) {
                    Utilities.e.c(new fd7((Object) r08Var, (Object) r08Var.b, (Object) r08Var.d, (byte) 19));
                    return;
                } else {
                    r08Var.b();
                    return;
                }
            case 6:
                r08 r08Var2 = (r08) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                boolean z8 = this.b;
                b18 b18Var2 = r08Var2.e;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    b18Var2.K = password;
                    TwoStepVerificationActivity.e0(password);
                    b18Var2.E1(z8);
                    return;
                }
                return;
            case 7:
                r08 r08Var3 = (r08) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                String str = (String) this.e;
                boolean z9 = this.b;
                TL_account.passwordSettings passwordsettings2 = (TL_account.passwordSettings) tLObject3;
                TLRPC.TL_secureSecretSettings tL_secureSecretSettings = passwordsettings2.secure_settings;
                b18 b18Var3 = r08Var3.e;
                if (tL_secureSecretSettings != null) {
                    b18Var3.d1 = tL_secureSecretSettings.secure_secret;
                    b18Var3.c1 = tL_secureSecretSettings.secure_secret_id;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = tL_secureSecretSettings.secure_algo;
                    if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoSHA512) {
                        bArr = ((TLRPC.TL_securePasswordKdfAlgoSHA512) securePasswordKdfAlgo).salt;
                        b18Var3.f1 = Utilities.s(bArr, hl.g1(str), bArr);
                    } else {
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                            TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                            byte[] bArr11 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt;
                            b18Var3.f1 = Utilities.m(hl.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                            bArr2 = bArr11;
                            hl.c3(new lb7((Object) r08Var3, (Object) passwordsettings2, z9, (Object) bArr2, (byte) 5));
                            return;
                        }
                        if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoUnknown) {
                            hl.c3(new fe7(r08Var3, b));
                            return;
                        }
                        bArr = new byte[0];
                    }
                } else {
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo2 = b18Var3.K.new_secure_algo;
                    if (securePasswordKdfAlgo2 instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                        TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo2;
                        byte[] bArr12 = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt;
                        b18Var3.f1 = Utilities.m(hl.g1(str), tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter1000002.salt);
                        bArr = bArr12;
                    } else {
                        bArr = new byte[0];
                    }
                    b18Var3.d1 = null;
                    b18Var3.c1 = 0L;
                }
                bArr2 = bArr;
                hl.c3(new lb7((Object) r08Var3, (Object) passwordsettings2, z9, (Object) bArr2, (byte) 5));
                return;
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
                    pVar.G0(z10);
                    return;
                }
                return;
            case 9:
                q58 q58Var = (q58) this.c;
                View view = (View) this.d;
                w49 w49Var = (w49) this.e;
                boolean z11 = this.b;
                o68 o68Var = q58Var.a;
                jj.X(o68Var.m2, o68Var.l1, 1, new wv1(q58Var, z11, w49Var, view));
                return;
            case 10:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) this.c;
                e eVar = (e) this.d;
                boolean z12 = this.b;
                mi9 mi9Var = (mi9) this.e;
                String trim = editTextBoldCursor.getText().toString().trim();
                if (TextUtils.isEmpty(trim)) {
                    return;
                }
                cj9.k(eVar, z12, new m88(mi9Var, trim, b));
                return;
            case 11:
                jp9 jp9Var = (jp9) this.c;
                bo9 bo9Var = (bo9) this.d;
                boolean z13 = this.b;
                fp9 fp9Var = (fp9) this.e;
                long j2 = jp9Var.q;
                long nanoTime = System.nanoTime();
                try {
                    bo9Var.g();
                    long h = bo9Var.h();
                    jp9Var.m.b("active output finalized: size=" + bo9Var.a.length() + ", durationMs=" + h + ", elapsedMs=" + jp9.f(nanoTime));
                    jp9Var.g();
                    boolean z14 = h > j2;
                    if (z13 && !z14) {
                        jp9Var.k.execute(new yo9(jp9Var, fp9Var, bo9Var.a, h, true));
                        return;
                    }
                    File file2 = bo9Var.a;
                    try {
                        synchronized (bo9Var) {
                            try {
                                i7 = bo9Var.s;
                            } finally {
                                th = th;
                                file = file2;
                                while (true) {
                                    try {
                                        try {
                                        } catch (Throwable th) {
                                            th = th;
                                            uxe.c(file);
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
                        jp9Var.u(file, i7, 0L, Math.min(j2, h), z13, z14 ? 1 : 2);
                        uxe.c(file);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        uxe.c(file);
                        throw th;
                    }
                } catch (Exception e) {
                    jp9Var.i.post(new wo9(jp9Var, e, b2));
                    return;
                }
            case 12:
                o7a o7aVar = (o7a) this.c;
                k5 k5Var = (k5) this.d;
                q7a q7aVar = (q7a) this.e;
                boolean z15 = this.b;
                o7aVar.a = r7a.B(k5Var.a).z(q7aVar.c, q7aVar.a, q7aVar.x);
                if (z15 && q7aVar.r) {
                    new File(q7aVar.c).delete();
                }
                o7aVar.c.countDown();
                return;
            case 13:
                faa faaVar = (faa) this.c;
                yz2 yz2Var = (yz2) this.d;
                g54 g54Var = (g54) this.e;
                boolean z16 = this.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                faaVar.b.e(yz2Var, g54Var.a, z16);
                return;
            case 14:
                axa axaVar = (axa) this.c;
                int[] iArr2 = (int[]) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                boolean z17 = this.b;
                ArrayList arrayList7 = axaVar.l;
                int i14 = axaVar.a;
                if (iArr2[0] == axaVar.m) {
                    axaVar.i = false;
                    axaVar.m = -1;
                    if (tLObject5 instanceof TL_stars.TL_payments_savedStarGifts) {
                        TL_stars.TL_payments_savedStarGifts tL_payments_savedStarGifts = (TL_stars.TL_payments_savedStarGifts) tLObject5;
                        uc7.s1(i14).j4(tL_payments_savedStarGifts.users, false);
                        uc7.s1(i14).c4(tL_payments_savedStarGifts.chats, false);
                        if (z17) {
                            arrayList7.clear();
                        }
                        arrayList7.addAll(tL_payments_savedStarGifts.gifts);
                        axaVar.k = tL_payments_savedStarGifts.next_offset;
                        axaVar.n = tL_payments_savedStarGifts.count;
                        axaVar.h = (tL_payments_savedStarGifts.flags & 2) != 0 ? Boolean.valueOf(tL_payments_savedStarGifts.chat_notifications_enabled) : null;
                        axaVar.j = arrayList7.size() > axaVar.n || axaVar.k == null;
                    } else {
                        axaVar.j = true;
                    }
                    jn7.f(i14).k(jn7.I3, Long.valueOf(axaVar.b), axaVar);
                    return;
                }
                return;
            case 15:
                h4b h4bVar = (h4b) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                boolean z18 = this.b;
                id idVar = (id) this.e;
                s4b s4bVar = h4bVar.a;
                if (tLObject6 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject6;
                    ls6.d0(yac.t0).L1(tL_messages_stickerSet, true);
                    if (z18) {
                        ls6.d0(yac.t0).h2(null, tLObject6, 0, null, false, false);
                    } else {
                        s4bVar.M1 = tL_messages_stickerSet;
                        s4bVar.M0();
                        s4bVar.U0();
                    }
                }
                idVar.dismiss();
                return;
            case 16:
                c8b c8bVar = (c8b) this.c;
                Bitmap bitmap = (Bitmap) this.d;
                boolean z19 = this.b;
                Runnable runnable = (Runnable) this.e;
                c8bVar.getClass();
                try {
                    bitmap.compress(z19 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG, 90, new FileOutputStream(c8bVar.Z0));
                } catch (Exception e2) {
                    cc4.g(e2, false);
                    if (z19) {
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(c8bVar.Z0));
                        } catch (Exception e3) {
                            cc4.g(e3, false);
                        }
                    }
                }
                bitmap.recycle();
                hl.c3(runnable);
                return;
            case 17:
                String[] strArr = (String[]) this.c;
                znb znbVar = (znb) this.d;
                boolean z20 = this.b;
                c1 c1Var = (c1) this.e;
                try {
                    aob.f0 = aob.km.get(aob.g5, -1);
                    if (TextUtils.isEmpty(strArr[0])) {
                        try {
                            if (znbVar.c != null) {
                                new File(znbVar.c).delete();
                            }
                        } catch (Exception unused) {
                        }
                        znbVar.c = null;
                        aob.g0 = null;
                    } else {
                        String str2 = strArr[0];
                        aob.g0 = str2;
                        String absolutePath = gvc.d(str2).getAbsolutePath();
                        try {
                            String str3 = znbVar.c;
                            if (str3 != null && !str3.equals(absolutePath)) {
                                new File(znbVar.c).delete();
                            }
                        } catch (Exception unused2) {
                        }
                        znbVar.c = absolutePath;
                        try {
                            Uri parse = Uri.parse(aob.g0);
                            znbVar.e = parse.getQueryParameter("slug");
                            String queryParameter = parse.getQueryParameter("mode");
                            if (queryParameter != null && (split = queryParameter.toLowerCase().split(" ")) != null && split.length > 0) {
                                for (int i15 = 0; i15 < split.length; i15++) {
                                    if ("blur".equals(split[i15])) {
                                        znbVar.h = true;
                                    } else if ("motion".equals(split[i15])) {
                                        znbVar.n = true;
                                    }
                                }
                            }
                            Utilities.z(parse.getQueryParameter("intensity"));
                            znbVar.y = 45;
                            try {
                                String queryParameter2 = parse.getQueryParameter("bg_color");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    znbVar.r = Integer.parseInt(queryParameter2.substring(0, 6), 16) | (-16777216);
                                    if (queryParameter2.length() >= 13 && hl.Q1(queryParameter2.charAt(6))) {
                                        znbVar.s = Integer.parseInt(queryParameter2.substring(7, 13), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() >= 20 && hl.Q1(queryParameter2.charAt(13))) {
                                        znbVar.w = Integer.parseInt(queryParameter2.substring(14, 20), 16) | (-16777216);
                                    }
                                    if (queryParameter2.length() == 27 && hl.Q1(queryParameter2.charAt(20))) {
                                        znbVar.x = Integer.parseInt(queryParameter2.substring(21), 16) | (-16777216);
                                    }
                                }
                            } catch (Exception unused3) {
                            }
                            try {
                                String queryParameter3 = parse.getQueryParameter("rotation");
                                if (!TextUtils.isEmpty(queryParameter3)) {
                                    znbVar.y = Utilities.z(queryParameter3).intValue();
                                }
                            } catch (Exception unused4) {
                            }
                        } catch (Throwable th5) {
                            cc4.g(th5, true);
                        }
                    }
                    if (!z20 && aob.M == null) {
                        aob.K = znbVar;
                        if ((aob.I == aob.J) != false) {
                            aob.T = 2000;
                            aob.U = SystemClock.elapsedRealtime();
                            hl.d3(new pg6((byte) 4), 2100L);
                        }
                    }
                    aob.I = znbVar;
                    aob.r1(false, false);
                } catch (Exception e4) {
                    cc4.g(e4, true);
                }
                if (aob.M == null && !aob.Q) {
                    uc7.s1(znbVar.F).I4(znbVar, znbVar.i(false), z20, false);
                }
                c1Var.run();
                return;
            case 18:
                ((o7c) this.c).x0((TLObject) this.e, (TLRPC.TL_error) this.d, this.b);
                return;
            default:
                ((VoIPService) this.c).lambda$acknowledgeCall$12((TLObject) this.d, (TLRPC.TL_error) this.e, this.b);
                return;
        }
    }

    public /* synthetic */ lb7(uc7 uc7Var, boolean z, TLRPC.Updates updates, ArrayList arrayList) {
        this.a = (byte) 0;
        this.c = uc7Var;
        this.b = z;
        this.d = updates;
        this.e = arrayList;
    }

    public /* synthetic */ lb7(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
    }

    public /* synthetic */ lb7(Object obj, Object obj2, boolean z, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
    }
}
