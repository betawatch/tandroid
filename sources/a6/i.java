package a6;

import a3.g0;
import a3.k0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.c0;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.Window;
import androidx.biometric.p;
import androidx.lifecycle.a0;
import bi.lb;
import bi.mb;
import bi.q5;
import bi.r5;
import c6.d0;
import c6.e0;
import c7.v;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.d7;
import e6.o;
import g.r;
import g6.n;
import g6.q;
import g6.w;
import i2.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import ji.c2;
import ji.g2;
import ji.h1;
import ji.j0;
import ji.n4;
import ji.p4;
import ji.r3;
import ji.v3;
import ji.z;
import l.x;
import n7.m1;
import n7.n1;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.cj0;
import org.telegram.ui.n01;
import org.telegram.ui.sz0;
import v7.z6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class i implements k0, s, a0, androidx.activity.result.b, lb, OnCompleteListener, la0, d71, n, f6.a, fb.n, x, ao0, d5, j0 {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(com.google.android.gms.common.api.j jVar, Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public static synchronized i G(Context context) {
        i N;
        synchronized (i.class) {
            N = N(context.getApplicationContext());
        }
        return N;
    }

    public static synchronized i N(Context context) {
        synchronized (i.class) {
            i iVar = c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context, 0);
            c = iVar2;
            return iVar2;
        }
    }

    @Override // ji.j0
    public void A(CharSequence charSequence) {
        n4 n4Var = ((p4) this.b).G;
        if (n4Var != null) {
            r3 r3Var = (r3) n4Var;
            r3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            r3Var.a.s4(charSequence.toString());
        }
    }

    public JSONObject B() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(w9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        w9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    w9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public float C(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 1;
        boolean z10 = Math.abs(i13 - i11) > Math.abs(i12 - i10);
        if (z10) {
            i15 = i10;
            i14 = i11;
            i17 = i12;
            i16 = i13;
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        int abs = Math.abs(i16 - i14);
        int abs2 = Math.abs(i17 - i15);
        int i19 = (-abs) / 2;
        int i20 = i14 < i16 ? 1 : -1;
        int i21 = i15 < i17 ? 1 : -1;
        int i22 = i16 + i20;
        int i23 = i14;
        int i24 = i15;
        int i25 = 0;
        while (i23 != i22) {
            boolean z11 = z10;
            int i26 = abs;
            if ((i25 == i18) == ((dc.b) this.b).b(z10 ? i24 : i23, z10 ? i23 : i24)) {
                if (i25 == 2) {
                    return z6.b(i23, i24, i14, i15);
                }
                i25++;
            }
            i19 += abs2;
            if (i19 > 0) {
                if (i24 == i17) {
                    break;
                }
                i24 += i21;
                i19 -= i26;
            }
            i23 += i20;
            abs = i26;
            z10 = z11;
            i18 = 1;
        }
        if (i25 == 2) {
            return z6.b(i22, i17, i14, i15);
        }
        return Float.NaN;
    }

    @Override // ji.j0
    public p9 D() {
        return (p4) this.b;
    }

    public float E(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        dc.b bVar = (dc.b) this.b;
        float C = C(i10, i11, i12, i13);
        int i14 = i10 - (i12 - i10);
        int i15 = 0;
        if (i14 < 0) {
            f7 = i10 / (i10 - i14);
            i14 = 0;
        } else {
            int i16 = bVar.a;
            if (i14 >= i16) {
                float f11 = ((i16 - 1) - i10) / (i14 - i10);
                int i17 = i16 - 1;
                f7 = f11;
                i14 = i17;
            } else {
                f7 = 1.0f;
            }
        }
        float f12 = i11;
        int i18 = (int) (f12 - ((i13 - i11) * f7));
        if (i18 < 0) {
            f10 = f12 / (i11 - i18);
        } else {
            int i19 = bVar.b;
            if (i18 >= i19) {
                f10 = ((i19 - 1) - i11) / (i18 - i11);
                i15 = i19 - 1;
            } else {
                i15 = i18;
                f10 = 1.0f;
            }
        }
        return (C(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + C) - 1.0f;
    }

    @Override // ji.j0
    public ji.a F() {
        return ((p4) this.b).a;
    }

    @Override // a3.k0
    public void H() {
        a3.m mVar = (a3.m) this.b;
        if (mVar.n1 != null) {
            mVar.M0(0, 1);
        }
    }

    @Override // bi.lb
    public boolean H0(long j3, int i10, int i11, int i12, mb mbVar) {
        ImageReceiver imageReceiver;
        r5 r5Var;
        r5 r5Var2;
        mbVar.b = null;
        mbVar.c = null;
        sz0 sz0Var = (sz0) this.b;
        n01 n01Var = sz0Var.h;
        ArrayList arrayList = sz0Var.w;
        if (sz0Var.N < 0.2f) {
            mbVar.b = n01Var.getImageReceiver();
            mbVar.c = null;
            mbVar.a = n01Var;
            mbVar.h = 0.0f;
            mbVar.i = AndroidUtilities.displaySize.y;
            mbVar.g = (View) sz0Var.getParent();
            mbVar.d = sz0Var.y;
            mbVar.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                r5Var = null;
                r5Var2 = null;
                break;
            }
            r5 r5Var3 = (r5) arrayList.get(i13);
            if (r5Var3.e >= 1.0f && r5Var3.a == i11) {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                r5 d = ProfileStoriesView.d(i14 >= 0 ? (r5) arrayList.get(i14) : null, i15 >= 0 ? (r5) arrayList.get(i15) : null, r5Var3);
                imageReceiver = r5Var3.b;
                r5Var2 = d;
                r5Var = r5Var3;
            }
            i13++;
        }
        if (imageReceiver == null) {
            return false;
        }
        mbVar.c = imageReceiver;
        mbVar.b = null;
        mbVar.a = sz0Var;
        mbVar.h = 0.0f;
        mbVar.i = AndroidUtilities.displaySize.y;
        mbVar.g = (View) sz0Var.getParent();
        if (r5Var == null || r5Var2 == null) {
            mbVar.f = null;
            return true;
        }
        mbVar.f = new q5(this, new RectF(r5Var.m), r5Var, new RectF(r5Var2.m), r5Var2);
        return true;
    }

    public synchronized void I() {
        synchronized (this) {
            try {
                b bVar = (b) this.b;
                ReentrantLock reentrantLock = bVar.a;
                reentrantLock.lock();
                try {
                    bVar.b.edit().clear().apply();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        c2 c2Var = (c2) this.b;
        c2Var.s0(i10, i11, z10);
        cj0 cj0Var = c2Var.O0;
        if (cj0Var != null) {
            cj0Var.i();
            c2Var.O0 = null;
        }
    }

    @Override // a3.k0
    public void K() {
        i0 i0Var = ((a3.m) this.b).W;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override // ji.j0
    public boolean L() {
        p4 p4Var = (p4) this.b;
        n4 n4Var = p4Var.G;
        if (n4Var == null) {
            return false;
        }
        ji.a aVar = p4Var.a;
        return ((r3) n4Var).a.R4();
    }

    @Override // ji.j0
    public void M(int i10, int i11) {
        p4 p4Var = (p4) this.b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ji.a aVar = p4Var.a;
            g2 g2Var = ((r3) n4Var).a.J3;
            if (g2Var != null) {
                g2Var.f(i10, i11);
            }
        }
    }

    @Override // ji.j0
    public void P() {
        p4 p4Var = (p4) this.b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ji.a aVar = p4Var.a;
            v3 v3Var = ((r3) n4Var).a;
            g2 g2Var = v3Var.J3;
            if (g2Var != null) {
                g2Var.g();
            }
            v3Var.h3.onContentChanged();
        }
    }

    @Override // ji.j0
    public void a(h1 h1Var) {
        n4 n4Var = ((p4) this.b).G;
        if (n4Var != null) {
            v3 v3Var = ((r3) n4Var).a;
            v3.L1(v3Var, h1Var);
            v3Var.h3.v(h1Var, true);
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 2:
                l8.c cVar = (l8.c) this.b;
                a8.e eVar = new a8.e(1, (TaskCompletionSource) obj2);
                a8.c cVar2 = (a8.c) ((a8.g) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                cVar.writeToParcel(obtain, 0);
                cVar2.G0(obtain, 1);
                return;
            case 7:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                n1 n1Var = (n1) ((m1) obj).u();
                v vVar = (v) this.b;
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken(n1Var.b);
                int i11 = n7.j.a;
                obtain2.writeStrongBinder(bVar);
                obtain2.writeInt(1);
                vVar.writeToParcel(obtain2, 0);
                Parcel obtain3 = Parcel.obtain();
                try {
                    n1Var.a.transact(1, obtain2, obtain3, 0);
                    obtain3.readException();
                    return;
                } finally {
                    obtain2.recycle();
                    obtain3.recycle();
                }
            case 10:
                w wVar = (w) obj;
                g6.f fVar = (g6.f) wVar.u();
                d0 d0Var = ((e0) this.b).k;
                Parcel O0 = fVar.O0();
                com.google.android.gms.internal.cast.v.d(O0, d0Var);
                fVar.T0(O0, 18);
                g6.f fVar2 = (g6.f) wVar.u();
                fVar2.T0(fVar2.O0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                return;
            case 22:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel O02 = iVar.O0();
                com.google.android.gms.internal.cast.v.d(O02, qVar);
                O02.writeStringArray(strArr);
                iVar.T0(O02, 7);
                return;
            default:
                g7.f fVar3 = (g7.f) this.b;
                h7.f fVar4 = new h7.f(0, (TaskCompletionSource) obj2);
                h7.d dVar = (h7.d) ((h7.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain4 = Parcel.obtain();
                obtain4.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = q7.a.a;
                obtain4.writeStrongBinder(fVar4);
                q7.a.b(obtain4, fVar3);
                q7.a.b(obtain4, gVar);
                ((h7.b) dVar).G0(obtain4, 6);
                return;
        }
    }

    @Override // org.telegram.ui.Components.ao0
    public void b(float f7) {
        z zVar = (z) this.b;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override // org.telegram.ui.Components.ao0
    public void c(float f7) {
        MessageObject messageObject = ((z) this.b).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override // ji.j0
    public void c0() {
        p4 p4Var = (p4) this.b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ji.a aVar = p4Var.a;
            v3.N1(((r3) n4Var).a);
        }
    }

    @Override // l.x
    public void d(l.l lVar, boolean z10) {
        r rVar;
        g.s sVar = (g.s) this.b;
        l.l k10 = lVar.k();
        int i10 = 0;
        boolean z11 = k10 != lVar;
        if (z11) {
            lVar = k10;
        }
        r[] rVarArr = sVar.U;
        int length = rVarArr != null ? rVarArr.length : 0;
        while (true) {
            if (i10 < length) {
                rVar = rVarArr[i10];
                if (rVar != null && rVar.h == lVar) {
                    break;
                } else {
                    i10++;
                }
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (!z11) {
                sVar.h(rVar, z10);
            } else {
                sVar.f(rVar.a, rVar, k10);
                sVar.h(rVar, true);
            }
        }
    }

    @Override // androidx.lifecycle.a0
    public void f0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        p pVar = (p) this.b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.l0.d(null);
        }
    }

    @Override // ji.j0
    public void g() {
        p4 p4Var = (p4) this.b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            v3.O1(((r3) n4Var).a, p4Var.a);
        }
    }

    public float h(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float E = E(i10, i11, i12, i13);
        float E2 = E((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(E) ? E2 / 7.0f : Float.isNaN(E2) ? E / 7.0f : (E + E2) / 14.0f;
    }

    @Override // fb.n
    public Object h2() {
        Type type = (Type) this.b;
        if (!(type instanceof ParameterizedType)) {
            throw new db.j("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new db.j("Invalid EnumSet type: " + type.toString());
    }

    public int i(int i10, int[] iArr) {
        int[] iArr2;
        int[] iArr3;
        int i11;
        int i12;
        fc.a aVar = (fc.a) this.b;
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            iArr2 = iArr;
        } else {
            int i13 = 1;
            while (i13 < length && iArr[i13] == 0) {
                i13++;
            }
            if (i13 == length) {
                iArr2 = new int[]{0};
            } else {
                int i14 = length - i13;
                int[] iArr4 = new int[i14];
                System.arraycopy(iArr, i13, iArr4, 0, i14);
                iArr2 = iArr4;
            }
        }
        int[] iArr5 = new int[i10];
        boolean z10 = true;
        for (int i15 = 0; i15 < i10; i15++) {
            int i16 = aVar.a[aVar.g + i15];
            if (i16 == 0) {
                i12 = iArr2[iArr2.length - 1];
            } else {
                if (i16 == 1) {
                    i11 = 0;
                    for (int i17 : iArr2) {
                        fc.a aVar2 = fc.a.h;
                        i11 ^= i17;
                    }
                } else {
                    i11 = iArr2[0];
                    int length2 = iArr2.length;
                    for (int i18 = 1; i18 < length2; i18++) {
                        i11 = aVar.c(i16, i11) ^ iArr2[i18];
                    }
                }
                i12 = i11;
            }
            iArr5[(i10 - 1) - i15] = i12;
            if (i12 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            return 0;
        }
        fc.b bVar = new fc.b(aVar, iArr5);
        fc.b a2 = aVar.a(i10, 1);
        fc.b bVar2 = aVar.c;
        if (a2.d() >= bVar.d()) {
            a2 = bVar;
            bVar = a2;
        }
        fc.b bVar3 = aVar.d;
        fc.b bVar4 = a2;
        fc.b bVar5 = bVar;
        fc.b bVar6 = bVar4;
        fc.b bVar7 = bVar2;
        while (bVar6.d() * 2 >= i10) {
            if (bVar6.e()) {
                throw new fc.c("r_{i-1} was zero");
            }
            int b10 = aVar.b(bVar6.c(bVar6.d()));
            fc.b bVar8 = bVar2;
            while (bVar5.d() >= bVar6.d() && !bVar5.e()) {
                int d = bVar5.d() - bVar6.d();
                int c10 = aVar.c(bVar5.c(bVar5.d()), b10);
                bVar8 = bVar8.a(aVar.a(d, c10));
                bVar5 = bVar5.a(bVar6.h(d, c10));
            }
            fc.b a10 = bVar8.g(bVar3).a(bVar7);
            if (bVar5.d() >= bVar6.d()) {
                throw new IllegalStateException("Division algorithm failed to reduce polynomial? r: " + bVar5 + ", rLast: " + bVar6);
            }
            fc.b bVar9 = bVar5;
            bVar5 = bVar6;
            bVar6 = bVar9;
            bVar7 = bVar3;
            bVar3 = a10;
        }
        int c11 = bVar3.c(0);
        if (c11 == 0) {
            throw new fc.c("sigmaTilde(0) was zero");
        }
        int b11 = aVar.b(c11);
        fc.b[] bVarArr = {bVar3.f(b11), bVar6.f(b11)};
        fc.b bVar10 = bVarArr[0];
        fc.b bVar11 = bVarArr[1];
        int d10 = bVar10.d();
        if (d10 == 1) {
            iArr3 = new int[]{bVar10.c(1)};
        } else {
            int[] iArr6 = new int[d10];
            int i19 = 0;
            for (int i20 = 1; i20 < aVar.e && i19 < d10; i20++) {
                if (bVar10.b(i20) == 0) {
                    iArr6[i19] = aVar.b(i20);
                    i19++;
                }
            }
            if (i19 != d10) {
                throw new fc.c("Error locator degree does not match number of roots");
            }
            iArr3 = iArr6;
        }
        int length3 = iArr3.length;
        int[] iArr7 = new int[length3];
        for (int i21 = 0; i21 < length3; i21++) {
            int b12 = aVar.b(iArr3[i21]);
            int i22 = 1;
            for (int i23 = 0; i23 < length3; i23++) {
                if (i21 != i23) {
                    int c12 = aVar.c(iArr3[i23], b12);
                    i22 = aVar.c(i22, (c12 & 1) == 0 ? c12 | 1 : c12 & (-2));
                }
            }
            int c13 = aVar.c(bVar11.b(b12), aVar.b(i22));
            iArr7[i21] = c13;
            if (aVar.g != 0) {
                iArr7[i21] = aVar.c(c13, b12);
            }
        }
        for (int i24 = 0; i24 < iArr3.length; i24++) {
            int length4 = iArr.length - 1;
            int i25 = iArr3[i24];
            if (i25 == 0) {
                throw new IllegalArgumentException();
            }
            int i26 = length4 - aVar.b[i25];
            if (i26 < 0) {
                throw new fc.c("Bad error location");
            }
            iArr[i26] = iArr[i26] ^ iArr7[i24];
        }
        return iArr3.length;
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        switch (this.a) {
            case 5:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.b;
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollLast();
                if (e0Var != null) {
                    String str = e0Var.a;
                    int i10 = e0Var.b;
                    androidx.fragment.app.r m10 = i0Var.c.m(str);
                    if (m10 != null) {
                        m10.x(i10, aVar.a, aVar.b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.b;
                int i11 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.M;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar2.a;
                if (i12 != -1 || i11 != 0) {
                    u.h("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // org.telegram.ui.Components.la0
    public Paint.FontMetricsInt k() {
        return ((di.m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // f6.a
    public void l(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int A = (int) a4.a.A(f7, 9.0f, 16.0f, 0.5f);
            float f10 = (A - height) / 2.0f;
            RectF rectF = new RectF(0.0f, f10, f7, height + f10);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, A, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((f6.i) this.b).e(bitmap2, 0);
    }

    @Override // g6.n
    public void m(String str, long j3, long j10, long j11) {
        e6.p pVar = (e6.p) this.b;
        try {
            pVar.a(new o(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e7) {
            g6.b bVar = e6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e7);
        }
        Iterator it = pVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    public synchronized void o() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "joinApplication", task);
    }

    @Override // a3.k0
    public void onFirstFrameRendered() {
        a3.m mVar = (a3.m) this.b;
        Surface surface = mVar.n1;
        if (surface != null) {
            pf.b bVar = mVar.Z0;
            Handler handler = (Handler) bVar.b;
            if (handler != null) {
                handler.post(new g0(bVar, surface, SystemClock.elapsedRealtime(), 0));
            }
            mVar.q1 = true;
        }
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onStateChanged(boolean z10, int i10) {
        d7 d7Var = (d7) this.b;
        di.z6 z6Var = d7Var.L;
        AndroidUtilities.cancelRunOnUIThread(z6Var);
        g71 g71Var = d7Var.y;
        if (g71Var == null || !g71Var.y()) {
            return;
        }
        AndroidUtilities.runOnUIThread(z6Var);
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.d71
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((d7) this.b).i();
    }

    @Override // bi.lb
    public void p(long j3, int i10, bi.p4 p4Var) {
        sz0 sz0Var = (sz0) this.b;
        int i11 = ProfileStoriesView.s0;
        sz0Var.f(true, false);
        p4Var.run();
    }

    @Override // l.x
    public boolean q(l.l lVar) {
        Window.Callback callback;
        g.s sVar = (g.s) this.b;
        if (lVar != lVar.k() || !sVar.O || (callback = sVar.f.getCallback()) == null || sVar.Z) {
            return true;
        }
        callback.onMenuOpened(108, lVar);
        return true;
    }

    public ic.a r(float f7, float f10, int i10, int i11) {
        ic.a b10;
        ic.a b11;
        int i12 = (int) (f10 * f7);
        int max = Math.max(0, i10 - i12);
        dc.b bVar = (dc.b) this.b;
        int min = Math.min(bVar.a - 1, i10 + i12) - max;
        float f11 = 3.0f * f7;
        if (min < f11) {
            throw cc.e.a();
        }
        int max2 = Math.max(0, i11 - i12);
        int min2 = Math.min(bVar.b - 1, i11 + i12) - max2;
        if (min2 < f11) {
            throw cc.e.a();
        }
        dc.b bVar2 = (dc.b) this.b;
        ic.b bVar3 = new ic.b(bVar2, max, max2, min, min2, f7);
        int i13 = bVar3.e;
        int i14 = bVar3.c;
        int i15 = i13 + i14;
        int i16 = bVar3.f;
        int i17 = (i16 / 2) + bVar3.d;
        int[] iArr = new int[3];
        for (int i18 = 0; i18 < i16; i18++) {
            int i19 = ((i18 & 1) == 0 ? (i18 + 1) / 2 : -((i18 + 1) / 2)) + i17;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i20 = i14;
            while (i20 < i15 && !bVar2.b(i20, i19)) {
                i20++;
            }
            int i21 = 0;
            while (i20 < i15) {
                if (!bVar2.b(i20, i19)) {
                    if (i21 == 1) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + 1;
                } else if (i21 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i21 != 2) {
                    i21++;
                    iArr[i21] = iArr[i21] + 1;
                } else {
                    if (bVar3.a(iArr) && (b11 = bVar3.b(i19, i20, iArr)) != null) {
                        return b11;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i21 = 1;
                }
                i20++;
            }
            if (bVar3.a(iArr) && (b10 = bVar3.b(i19, i15, iArr)) != null) {
                return b10;
            }
        }
        ArrayList arrayList = bVar3.b;
        if (arrayList.isEmpty()) {
            throw cc.e.a();
        }
        return (ic.a) arrayList.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // g6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void s(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        Iterator it;
        e6.p pVar = (e6.p) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof g6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                pVar.a(new o(status, 2));
            } catch (IllegalStateException e7) {
                e = e7;
                g6.b bVar = e6.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = pVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e10) {
            e = e10;
            i11 = i10;
        }
        it = pVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j3, i11, j10, j11);
            i11 = i10;
        }
    }

    public boolean t() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.b).d;
        return x0Var != null && x0Var.b();
    }

    @Override // ji.j0
    public q9 u() {
        n4 n4Var = ((p4) this.b).G;
        if (n4Var != null) {
            return ((r3) n4Var).a.getTextSelectionHelper();
        }
        return null;
    }

    @Override // org.telegram.ui.Components.la0
    public void v(int i10, int i11, CharSequence charSequence, boolean z10) {
        di.g gVar = ((di.m) this.b).f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public void w(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    public void y(long j3) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.b).putLong("android.media.metadata.DURATION", j3);
    }

    public void z(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a4.a.p("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.d71
    public void onRenderedFirstFrame() {
    }

    public i(Context context, int i10) {
        boolean isEmpty;
        String d;
        this.a = i10;
        switch (i10) {
            case 12:
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
                this.b = sharedPreferences;
                File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
                if (file.exists()) {
                    return;
                }
                try {
                    if (file.createNewFile()) {
                        synchronized (this) {
                            isEmpty = sharedPreferences.getAll().isEmpty();
                        }
                        if (isEmpty) {
                            return;
                        }
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        o();
                        return;
                    }
                    return;
                } catch (IOException e7) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e7.getMessage());
                        return;
                    }
                    return;
                }
            default:
                b a2 = b.a(context);
                this.b = a2;
                a2.b();
                String d10 = a2.d("defaultGoogleSignInAccount");
                if (TextUtils.isEmpty(d10) || (d = a2.d(b.f("googleSignInOptions", d10))) == null) {
                    return;
                }
                try {
                    GoogleSignInOptions.b(d);
                    return;
                } catch (JSONException unused) {
                    return;
                }
        }
    }

    public i(x6.a aVar) {
        this.a = 26;
        n6.l.h(aVar);
        this.b = aVar;
    }

    public i(ba.c cVar) {
        this.a = 14;
        this.b = new File(cVar.b, "com.crashlytics.settings.json");
    }

    @Override // a3.k0
    public void h0() {
    }

    public i(int i10) {
        this.a = i10;
        switch (i10) {
            case 24:
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    @Override // bi.lb
    public /* synthetic */ void e(boolean z10) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.d71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.la0
    public /* synthetic */ void x(String str) {
    }

    public i(MediaMetadataCompat mediaMetadataCompat) {
        this.a = 3;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        c0.a(bundle);
    }

    @Override // org.telegram.ui.Components.d71
    public void onError(g71 g71Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.la0
    public /* synthetic */ void f(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.la0
    public /* synthetic */ void n(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.d71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
