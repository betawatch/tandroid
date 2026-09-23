package a4;

import ai.o8;
import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.b0;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.g0;
import androidx.lifecycle.a0;
import b2.l1;
import c7.v;
import ci.b7;
import ci.bc;
import ci.d0;
import ci.e0;
import ci.j6;
import ci.l8;
import ci.lc;
import ci.nb;
import ci.pc;
import ci.zb;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.x4;
import fb.n;
import i2.j0;
import ii.a1;
import ii.c3;
import ii.f5;
import ii.h1;
import ii.h5;
import ii.i2;
import ii.k0;
import ii.p2;
import ii.s3;
import ii.x3;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import k2.i0;
import lg.o;
import m.i1;
import n4.y;
import n7.n1;
import n7.o1;
import o2.q;
import org.json.JSONObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.f71;
import org.telegram.ui.Components.gh;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.ui;
import qg.e2;
import u2.b1;
import u2.c1;
import v7.m8;
import v7.z6;
import x2.p;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class m implements z3.d, a0, androidx.activity.result.b, s, o, pc, OnCompleteListener, n, i1, ui, k0, h1, k2.n, m.k, eo0, o0.b, b1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ m(int i10, boolean z10) {
        this.a = i10;
    }

    @Override // z3.d
    public int A() {
        return 1;
    }

    public void A0(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a.q("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    public JSONObject B0() {
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
                    } catch (Exception e) {
                        e = e;
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
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            w9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // ci.pc
    public void C(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null || (arrayList = l8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((l8) b7Var.d.T.get(i10)).P = f7;
    }

    public float C0(int i10, int i11, int i12, int i13) {
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

    @Override // ii.h1
    public void D(ii.i1 i1Var, int i10, int i11) {
        f5 f5Var;
        r9 textSelectionHelper;
        h5 h5Var = (h5) this.b;
        if (h5Var.w || i10 == i11 || (f5Var = h5Var.s) == null || (textSelectionHelper = ((c3) f5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        i1Var.post(new x4(this, i1Var, i11, textSelectionHelper, i10, 3));
    }

    public float D0(int i10, int i11, int i12, int i13) {
        float f7;
        float f10;
        dc.b bVar = (dc.b) this.b;
        float C0 = C0(i10, i11, i12, i13);
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
        return (C0(i10, i11, (int) (((i14 - i10) * f10) + i10), i15) + C0) - 1.0f;
    }

    @Override // ii.k0
    public r9 E() {
        s3 s3Var = ((a1) this.b).S;
        if (s3Var == null) {
            return null;
        }
        return s3Var.a.getTextSelectionHelper();
    }

    @Override // ci.pc
    public void F(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.P = f7;
        b7Var.c();
    }

    @Override // o0.b
    public Cursor G(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    @Override // ci.pc
    public void H(float f7, boolean z10) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.Z = f7;
        l8Var.j = true;
        f71 f71Var = b7Var.e;
        if (f71Var == null || f71Var.p() == -9223372036854775807L) {
            return;
        }
        b7Var.m((long) (f7 * b7Var.e.p()));
    }

    @Override // ii.k0
    public void I(CharSequence charSequence) {
        s3 s3Var = ((a1) this.b).S;
        if (s3Var != null) {
            s3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            s3Var.a.t4(charSequence.toString());
        }
    }

    @Override // k2.n
    public void J() {
        p pVar;
        i0 i0Var = (i0) this.b;
        synchronized (i0Var.a) {
            pVar = i0Var.H;
        }
        if (pVar != null) {
            pVar.h();
        }
    }

    @Override // ii.k0
    public q9 K() {
        return (a1) this.b;
    }

    @Override // ii.k0
    public ii.a N() {
        return ((a1) this.b).a;
    }

    @Override // ci.pc
    public void O(long j3) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.r0 = j3;
        l8Var.j = true;
        b7Var.y(true);
    }

    @Override // ii.k0
    public boolean P() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var == null) {
            return false;
        }
        ii.a aVar = a1Var.a;
        return s3Var.a.S4();
    }

    @Override // ci.pc
    public void Q(boolean z10) {
        e2 e2Var;
        lc lcVar = ((zb) ((b7) this.b)).C0;
        nb nbVar = lcVar.v1;
        if (nbVar == null) {
            return;
        }
        e2 e2Var2 = null;
        if (!z10 && (nbVar.getSelectedEntity() instanceof e2)) {
            lcVar.v1.D0(null, true);
            return;
        }
        if (!z10 || (lcVar.v1.getSelectedEntity() instanceof e2)) {
            return;
        }
        j6 j6Var = lcVar.v1.R0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= j6Var.getChildCount()) {
                e2Var = null;
                break;
            }
            View childAt = j6Var.getChildAt(i11);
            if (childAt instanceof e2) {
                e2Var = (e2) childAt;
                break;
            }
            i11++;
        }
        if (e2Var != null) {
            nb nbVar2 = lcVar.v1;
            j6 j6Var2 = nbVar2.R0;
            while (true) {
                if (i10 >= j6Var2.getChildCount()) {
                    break;
                }
                View childAt2 = j6Var2.getChildAt(i10);
                if (childAt2 instanceof e2) {
                    e2Var2 = (e2) childAt2;
                    break;
                }
                i10++;
            }
            nbVar2.D0(e2Var2, true);
        }
    }

    @Override // k2.n
    public void R(Exception exc) {
        e2.a.f("MediaCodecAudioRenderer", "Audio sink error", exc);
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.f(yVar, exc, 1));
        }
    }

    @Override // ii.k0
    public void S(int i10, int i11) {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.a;
            i2 i2Var = s3Var.a.J3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ boolean S1() {
        return false;
    }

    @Override // ci.pc
    public void T(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null || (arrayList = l8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((l8) b7Var.d.T.get(i10)).V = f7;
    }

    @Override // k2.n
    public void U() {
        ((i0) this.b).h1 = true;
    }

    @Override // ci.pc
    public void V(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.F = f7;
        l8Var.j = true;
        b7Var.w(true);
    }

    @Override // ii.h1
    public void W(Editable editable) {
        ((h5) this.b).h();
    }

    @Override // org.telegram.ui.Components.eo0
    public void X(float f7, boolean z10) {
        mg.h hVar = (mg.h) this.b;
        float f10 = hVar.b;
        float z11 = com.google.android.gms.internal.vision.e2.z(hVar.c, f10, f7, f10);
        hVar.d = z11;
        if (z10) {
            r6 r6Var = hVar.e;
            r6Var.getClass();
            r6Var.b(null, z11);
        }
        hVar.invalidate();
    }

    @Override // k2.n
    public void Y(k2.k kVar) {
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 0));
        }
    }

    @Override // ci.pc
    public void Z(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.E = f7;
        l8Var.j = true;
        b7Var.w(true);
    }

    @Override // ii.k0
    public void a0() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.a;
            x3 x3Var = s3Var.a;
            i2 i2Var = x3Var.J3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.h3.onContentChanged();
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 5:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                o1 o1Var = (o1) ((n1) obj).u();
                v vVar = (v) this.b;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(o1Var.b);
                int i10 = n7.k.a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                vVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    o1Var.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            default:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                h7.f fVar = new h7.f(1, (TaskCompletionSource) obj2);
                h7.d dVar = (h7.d) ((h7.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.a;
                obtain3.writeStrongBinder(fVar);
                q7.a.b(obtain3, getCredentialRequest);
                q7.a.b(obtain3, gVar);
                ((h7.b) dVar).G0(obtain3, 1);
                return;
        }
    }

    @Override // ci.pc
    public void b(int i10) {
        e0 e0Var = ((b7) this.b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.a == i10) {
                    d0Var.b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // ii.h1
    public /* synthetic */ boolean b0(boolean z10) {
        return false;
    }

    @Override // ii.k0, ii.h1
    public void c(ii.i1 i1Var) {
        switch (this.a) {
            case 20:
                s3 s3Var = ((a1) this.b).S;
                if (s3Var != null) {
                    x3 x3Var = s3Var.a;
                    x3.M1(x3Var, i1Var);
                    x3Var.h3.t(i1Var, true);
                    break;
                }
                break;
            default:
                f5 f5Var = ((h5) this.b).s;
                if (f5Var != null) {
                    x3 x3Var2 = ((c3) f5Var).a;
                    x3.M1(x3Var2, i1Var);
                    x3Var2.h3.t(i1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ boolean c0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.b
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                k4.h((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // z3.d
    public int d(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // ci.pc
    public void d0(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null || (arrayList = l8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((l8) b7Var.d.T.get(i10)).W = f7;
    }

    @Override // k2.n
    public void e(long j3) {
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new ai.j(yVar, j3, 12));
        }
    }

    @Override // ci.pc
    public void e0(float f7) {
        l8 l8Var = ((b7) this.b).d;
        if (l8Var == null) {
            return;
        }
        l8Var.a0 = f7;
        l8Var.j = true;
    }

    @Override // ii.h1
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // ci.pc
    public void f0() {
        ((b7) this.b).q(null);
    }

    @Override // z3.d
    public long g(int i10) {
        e2.d.b(i10 == 0);
        return 0L;
    }

    @Override // org.telegram.ui.Components.eo0
    public CharSequence getContentDescription() {
        mg.h hVar = (mg.h) this.b;
        float f7 = hVar.b;
        return String.valueOf(Math.round((hVar.a.getProgress() * (hVar.c - f7)) + f7));
    }

    @Override // ci.pc
    public void h(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.u0 = f7;
        l8Var.j = true;
        b7Var.c();
    }

    @Override // k2.n
    public void h0() {
        j0 j0Var = ((i0) this.b).W;
        if (j0Var != null) {
            j0Var.a();
        }
    }

    @Override // ii.k0
    public void i() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            x3.P1(s3Var.a, a1Var.a);
        }
    }

    @Override // ci.pc
    public void i0(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.t0 = f7;
        l8Var.j = true;
        b7Var.y(true);
    }

    @Override // ci.pc
    public void j0(int i10, long j3) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null || (arrayList = l8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((l8) b7Var.d.T.get(i10)).X = j3;
    }

    @Override // androidx.activity.result.b
    public void k(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.b;
        g0 g0Var = (g0) k0Var.F.pollLast();
        if (g0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = g0Var.a;
        int i10 = g0Var.b;
        androidx.fragment.app.s l4 = k0Var.c.l(str);
        if (l4 != null) {
            l4.x(i10, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // z3.d
    public List l(long j3) {
        return j3 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // k2.n
    public void l0(k2.k kVar) {
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.h(yVar, kVar, 1));
        }
    }

    @Override // ii.h1
    public void m(ii.i1 i1Var) {
        ii.a aVar;
        h5 h5Var = (h5) this.b;
        f5 f5Var = h5Var.s;
        if (f5Var == null || (aVar = h5Var.a) == null) {
            return;
        }
        x3 x3Var = ((c3) f5Var).a;
        ArrayList arrayList = x3Var.l3;
        long j3 = aVar.t;
        if (j3 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((ii.a) arrayList.get(i11)).k.contains(Long.valueOf(j3))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        i2 i2Var = x3Var.J3;
        if (i2Var != null) {
            i2Var.d();
        }
        ii.a aVar2 = new ii.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a.y(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        x3Var.s4();
        x3Var.Y2.N(false);
        i2 i2Var2 = x3Var.J3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.post(new p2(x3Var, aVar2, 26));
    }

    @Override // org.telegram.ui.Components.eo0
    public /* synthetic */ int m0() {
        return 0;
    }

    @Override // ci.pc
    public void n(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.G = f7;
        l8Var.j = true;
        b7Var.c();
    }

    @Override // ii.k0
    public void n0() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.a;
            x3.O1(s3Var.a);
        }
    }

    @Override // ci.pc
    public void o(long j3, boolean z10) {
        b7 b7Var = (b7) this.b;
        if (!z10) {
            b7Var.m(j3);
            return;
        }
        f71 f71Var = b7Var.e;
        if (f71Var != null) {
            f71Var.L(j3, true);
            return;
        }
        if (b7Var.j()) {
            b7Var.E.m(j3, true);
            return;
        }
        f71 f71Var2 = b7Var.y;
        if (f71Var2 != null) {
            f71Var2.L(j3, false);
        }
    }

    @Override // ci.pc
    public void o0(long j3) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.D = j3;
        l8Var.j = true;
        b7Var.w(true);
    }

    @Override // k2.n
    public void onAudioSessionIdChanged(int i10) {
        r2.j jVar;
        i0 i0Var = (i0) this.b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = i0Var.a1) != null) {
            jVar.d(i10);
        }
        y yVar = i0Var.Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new o8(yVar, i10, 11));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "joinApplication", task);
    }

    @Override // k2.n
    public void onSkipSilenceEnabledChanged(boolean z10) {
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override // k2.n
    public void p() {
        ((i0) this.b).j1 = true;
    }

    @Override // androidx.lifecycle.a0
    public void p0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.p pVar = (androidx.biometric.p) this.b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.l0.d(null);
        }
    }

    @Override // fb.n
    public Object p2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            m8 m8Var = ib.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override // ii.h1
    public /* synthetic */ boolean q(ii.i1 i1Var) {
        return false;
    }

    public c6.o q0() {
        c6.o oVar = (c6.o) this.b;
        if (oVar.a == null) {
            throw new IllegalArgumentException("media cannot be null.");
        }
        if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
        }
        if (Double.isNaN(oVar.e)) {
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        if (Double.isNaN(oVar.f) || oVar.f < 0.0d) {
            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
        }
        return oVar;
    }

    @Override // k2.n
    public void r() {
        j0 j0Var = ((i0) this.b).W;
        if (j0Var != null) {
            j0Var.a.g0 = true;
        }
    }

    public float r0(ic.c cVar, ic.c cVar2) {
        int i10 = (int) cVar.a;
        int i11 = (int) cVar.b;
        int i12 = (int) cVar2.a;
        int i13 = (int) cVar2.b;
        float D0 = D0(i10, i11, i12, i13);
        float D02 = D0((int) cVar2.a, i13, (int) cVar.a, i11);
        return Float.isNaN(D0) ? D02 / 7.0f : Float.isNaN(D02) ? D0 / 7.0f : (D0 + D02) / 14.0f;
    }

    @Override // ci.pc
    public void s() {
        b7 b7Var = (b7) this.b;
        b7Var.s(null, null, true);
        lc lcVar = ((zb) b7Var).C0;
        zb zbVar = lcVar.X0;
        if (zbVar != null) {
            zbVar.s(null, null, true);
        }
        nb nbVar = lcVar.v1;
        if (nbVar != null) {
            nbVar.q0();
        }
        bc bcVar = lcVar.c1;
        if (bcVar != null) {
            bcVar.setHasRoundVideo(false);
        }
        l8 l8Var = lcVar.K1;
        if (l8Var != null) {
            File file = l8Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                lcVar.K1.o0 = null;
            }
            if (lcVar.K1.p0 != null) {
                try {
                    new File(lcVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                lcVar.K1.p0 = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x05e7 A[Catch: a | c -> 0x067a, TryCatch #1 {a | c -> 0x067a, blocks: (B:292:0x05cd, B:293:0x05e3, B:295:0x05e7, B:296:0x05ea, B:298:0x05ee, B:300:0x05f8, B:302:0x05fe, B:307:0x0603), top: B:291:0x05cd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public aa.a s0(of.b bVar) {
        ArrayList arrayList;
        ic.c cVar;
        ic.c cVar2;
        ic.c cVar3;
        float f7;
        float f10;
        ic.a aVar;
        float f11;
        float f12;
        float f13;
        int i10;
        int i11;
        cc.j[] jVarArr;
        cc.a aVar2;
        dc.b bVar2;
        int i12;
        dc.d dVar;
        int i13;
        aa.a aVar3;
        List list;
        String str;
        int i14;
        boolean z10;
        double d;
        double abs;
        int i15;
        char c10;
        int i16;
        a6.m mVar = (a6.m) this.b;
        dc.b L = bVar.L();
        m mVar2 = new m(L, 19);
        ic.e eVar = new ic.e(L);
        int i17 = L.b;
        int i18 = L.a;
        int i19 = (i17 * 3) / 388;
        if (i19 < 3) {
            i19 = 3;
        }
        int[] iArr = new int[5];
        int i20 = i19 - 1;
        int i21 = 0;
        boolean z11 = false;
        while (true) {
            int i22 = 1;
            arrayList = eVar.b;
            if (i20 >= i17 || z11) {
                break;
            }
            Arrays.fill(iArr, i21);
            int i23 = 0;
            while (i23 < i18) {
                if (L.b(i23, i20)) {
                    if ((i21 & 1) == i22) {
                        i21++;
                    }
                    iArr[i21] = iArr[i21] + i22;
                    i15 = i17;
                } else {
                    if ((i21 & 1) != 0) {
                        i15 = i17;
                        iArr[i21] = iArr[i21] + 1;
                    } else if (i21 == 4) {
                        if (!ic.e.b(iArr)) {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        } else if (eVar.c(i20, i23, iArr)) {
                            if (eVar.c) {
                                z11 = eVar.d();
                                i15 = i17;
                            } else {
                                if (arrayList.size() > i22) {
                                    int size = arrayList.size();
                                    int i24 = 0;
                                    ic.c cVar4 = null;
                                    while (true) {
                                        if (i24 >= size) {
                                            i15 = i17;
                                            c10 = 2;
                                            i16 = 0;
                                            break;
                                        }
                                        Object obj = arrayList.get(i24);
                                        i24++;
                                        ic.c cVar5 = (ic.c) obj;
                                        i15 = i17;
                                        if (cVar5.d >= 2) {
                                            if (cVar4 != null) {
                                                eVar.c = true;
                                                c10 = 2;
                                                i16 = ((int) (Math.abs(cVar4.a - cVar5.a) - Math.abs(cVar4.b - cVar5.b))) / 2;
                                                break;
                                            }
                                            cVar4 = cVar5;
                                        }
                                        i17 = i15;
                                    }
                                } else {
                                    i15 = i17;
                                    i16 = 0;
                                    c10 = 2;
                                }
                                if (i16 > iArr[c10]) {
                                    i20 += (i16 - r5) - 2;
                                    i23 = i18 - 1;
                                }
                            }
                            Arrays.fill(iArr, 0);
                            i19 = 2;
                            i21 = 0;
                        } else {
                            i15 = i17;
                            iArr[0] = iArr[2];
                            iArr[1] = iArr[3];
                            iArr[2] = iArr[4];
                            iArr[3] = 1;
                            iArr[4] = 0;
                        }
                        i21 = 3;
                    } else {
                        i15 = i17;
                        int i25 = i21 + 1;
                        iArr[i25] = iArr[i25] + 1;
                        i21 = i25;
                    }
                    i23++;
                    i17 = i15;
                    i22 = 1;
                }
                i23++;
                i17 = i15;
                i22 = 1;
            }
            int i26 = i17;
            if (ic.e.b(iArr) && eVar.c(i20, i18, iArr)) {
                int i27 = iArr[0];
                if (eVar.c) {
                    i19 = i27;
                    z11 = eVar.d();
                } else {
                    i19 = i27;
                }
            }
            i20 += i19;
            i17 = i26;
            i21 = 0;
        }
        if (arrayList.size() < 3) {
            throw cc.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((ic.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, ic.e.e);
        ic.c[] cVarArr = new ic.c[3];
        int i28 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i29 = 2; i28 < arrayList.size() - i29; i29 = 2) {
            ic.c cVar6 = (ic.c) arrayList.get(i28);
            float f14 = cVar6.c;
            i28++;
            int i30 = i28;
            while (i30 < arrayList.size() - 1) {
                ic.c cVar7 = (ic.c) arrayList.get(i30);
                double e = ic.e.e(cVar6, cVar7);
                i30++;
                for (int i31 = i30; i31 < arrayList.size(); i31++) {
                    ic.c cVar8 = (ic.c) arrayList.get(i31);
                    if (cVar8.c <= 1.4f * f14) {
                        double e7 = ic.e.e(cVar7, cVar8);
                        double e10 = ic.e.e(cVar6, cVar8);
                        if (e < e7) {
                            if (e7 <= e10) {
                                e10 = e7;
                                e7 = e10;
                            } else if (e >= e10) {
                                d = e10;
                                e10 = e;
                                abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar6;
                                    cVarArr[1] = cVar7;
                                    cVarArr[2] = cVar8;
                                    d10 = abs;
                                }
                            }
                            d = e;
                            abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                            if (abs >= d10) {
                            }
                        } else {
                            if (e7 >= e10) {
                                d = e10;
                                e10 = e7;
                            } else if (e < e10) {
                                d = e7;
                                e7 = e10;
                                e10 = e;
                                abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                                if (abs >= d10) {
                                }
                            } else {
                                d = e7;
                            }
                            e7 = e;
                            abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                            if (abs >= d10) {
                            }
                        }
                    }
                }
            }
        }
        if (d10 == Double.MAX_VALUE) {
            throw cc.e.a();
        }
        float a2 = cc.j.a(cVarArr[0], cVarArr[1]);
        float a10 = cc.j.a(cVarArr[1], cVarArr[2]);
        float a11 = cc.j.a(cVarArr[0], cVarArr[2]);
        if (a10 >= a2 && a10 >= a11) {
            cVar = cVarArr[0];
            cVar2 = cVarArr[1];
            cVar3 = cVarArr[2];
        } else if (a11 < a10 || a11 < a2) {
            cVar = cVarArr[2];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[1];
        } else {
            cVar = cVarArr[1];
            cVar2 = cVarArr[0];
            cVar3 = cVarArr[2];
        }
        float f15 = cVar.a;
        float f16 = cVar.b;
        if (com.google.android.gms.internal.vision.e2.b(cVar2.a, f15, cVar3.b - f16, (cVar2.b - f16) * (cVar3.a - f15)) < 0.0f) {
            ic.c cVar9 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar9;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float r02 = mVar2.r0(cVar, cVar3);
        float f17 = cVar.a;
        float f18 = cVar3.b;
        float f19 = cVar3.a;
        float r03 = mVar2.r0(cVar, cVar2);
        float f20 = cVar2.b;
        float f21 = cVar2.a;
        float f22 = (r03 + r02) / 2.0f;
        if (f22 < 1.0f) {
            throw cc.e.a();
        }
        float a12 = cc.j.a(cVar, cVar3) / f22;
        int i32 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = cc.j.a(cVar, cVar2) / f22;
        int i33 = (((int) (a13 + (a13 >= 0.0f ? 0.5f : -0.5f))) + i32) / 2;
        int i34 = i33 + 7;
        int i35 = i34 & 3;
        if (i35 == 0) {
            i34 = i33 + 8;
        } else if (i35 == 2) {
            i34 = i33 + 6;
        } else if (i35 == 3) {
            i34 = i33 + 5;
        }
        int i36 = i34;
        int[] iArr2 = hc.f.e;
        if (i36 % 4 != 1) {
            throw cc.c.a();
        }
        try {
            hc.f c11 = hc.f.c((i36 - 17) / 4);
            int i37 = (c11.a * 4) + 10;
            if (c11.b.length > 0) {
                float f23 = (f19 - f17) + f21;
                f10 = f19;
                float f24 = (f18 - f16) + f20;
                float f25 = 1.0f - (3.0f / i37);
                int z12 = (int) com.google.android.gms.internal.vision.e2.z(f23, f17, f25, f17);
                int z13 = (int) com.google.android.gms.internal.vision.e2.z(f24, f16, f25, f16);
                f7 = f17;
                for (int i38 = 4; i38 <= 16; i38 <<= 1) {
                    try {
                        aVar = mVar2.t0(f22, i38, z12, z13);
                        break;
                    } catch (cc.e unused) {
                    }
                }
            } else {
                f7 = f17;
                f10 = f19;
            }
            aVar = null;
            float f26 = i36 - 3.5f;
            if (aVar != null) {
                f11 = aVar.a;
                f12 = aVar.b;
                f13 = f26 - 3.0f;
            } else {
                f11 = (f10 - f7) + f21;
                f12 = (f18 - f16) + f20;
                f13 = f26;
            }
            float f27 = f12;
            float f28 = cVar.a;
            float f29 = cVar.b;
            float f30 = cVar3.a;
            float f31 = cVar3.b;
            float f32 = cVar2.a;
            float f33 = cVar2.b;
            dc.g a14 = dc.g.a(3.5f, 3.5f, f26, 3.5f, f13, f13, 3.5f, f26);
            ic.a aVar4 = aVar;
            float f34 = a14.e;
            float f35 = a14.i;
            float f36 = f34 * f35;
            float f37 = a14.f;
            float f38 = a14.h;
            float f39 = f36 - (f37 * f38);
            float f40 = a14.g;
            float f41 = f37 * f40;
            float f42 = a14.d;
            float f43 = f41 - (f42 * f35);
            float f44 = (f42 * f38) - (f34 * f40);
            float f45 = a14.c;
            float f46 = f45 * f38;
            float f47 = a14.b;
            float f48 = f46 - (f47 * f35);
            float f49 = a14.a;
            float f50 = (f35 * f49) - (f45 * f40);
            float f51 = (f40 * f47) - (f38 * f49);
            float f52 = (f47 * f37) - (f45 * f34);
            float f53 = (f45 * f42) - (f37 * f49);
            float f54 = (f49 * f34) - (f47 * f42);
            dc.g a15 = dc.g.a(f28, f29, f30, f31, f11, f27, f32, f33);
            float f55 = a15.a;
            float f56 = a15.d;
            float f57 = a15.g;
            float f58 = (f57 * f52) + (f56 * f48) + (f55 * f39);
            float f59 = (f57 * f53) + (f56 * f50) + (f55 * f43);
            float f60 = (f57 * f54) + (f56 * f51) + (f55 * f44);
            float f61 = a15.b;
            float f62 = a15.e;
            float f63 = a15.h;
            float f64 = (f63 * f52) + (f62 * f48) + (f61 * f39);
            float f65 = (f63 * f53) + (f62 * f50) + (f61 * f43);
            float f66 = (f63 * f54) + (f62 * f51) + (f61 * f44);
            float f67 = a15.c;
            float f68 = a15.f;
            float f69 = a15.i;
            float f70 = (f52 * f69) + (f48 * f68) + (f39 * f67);
            float f71 = (f53 * f69) + (f50 * f68) + (f43 * f67);
            float f72 = (f69 * f54) + (f68 * f51) + (f67 * f44);
            if (i36 <= 0 || i36 <= 0) {
                throw cc.e.a();
            }
            dc.b bVar3 = new dc.b(i36, i36);
            int i39 = i36 * 2;
            ic.c cVar10 = cVar;
            float[] fArr = new float[i39];
            int i40 = 0;
            while (i40 < i36) {
                int i41 = i36;
                float f73 = i40 + 0.5f;
                int i42 = 0;
                while (i42 < i39) {
                    int i43 = i42;
                    fArr[i43] = (i43 / 2) + 0.5f;
                    fArr[i43 + 1] = f73;
                    i42 = i43 + 2;
                }
                int i44 = i39 - 1;
                int i45 = i40;
                int i46 = 0;
                while (i46 < i44) {
                    float f74 = fArr[i46];
                    int i47 = i46 + 1;
                    int i48 = i46;
                    float f75 = fArr[i47];
                    ic.c cVar11 = cVar2;
                    float a16 = q3.a(f71, f75, f70 * f74, f72);
                    fArr[i48] = (((f59 * f75) + (f58 * f74)) + f60) / a16;
                    fArr[i47] = (((f75 * f65) + (f74 * f64)) + f66) / a16;
                    i46 = i48 + 2;
                    cVar2 = cVar11;
                }
                ic.c cVar12 = cVar2;
                int i49 = L.b;
                float f76 = f71;
                int i50 = 0;
                boolean z14 = true;
                while (i50 < i44 && z14) {
                    int i51 = (int) fArr[i50];
                    int i52 = i50 + 1;
                    int i53 = i44;
                    int i54 = (int) fArr[i52];
                    int i55 = i50;
                    if (i51 < -1 || i51 > i18 || i54 < -1 || i54 > i49) {
                        throw cc.e.a();
                    }
                    if (i51 == -1) {
                        fArr[i55] = 0.0f;
                    } else if (i51 == i18) {
                        fArr[i55] = i18 - 1;
                    } else {
                        z10 = false;
                        if (i54 != -1) {
                            fArr[i52] = 0.0f;
                        } else if (i54 == i49) {
                            fArr[i52] = i49 - 1;
                        } else {
                            z14 = z10;
                            i50 = i55 + 2;
                            i44 = i53;
                        }
                        z14 = true;
                        i50 = i55 + 2;
                        i44 = i53;
                    }
                    z10 = true;
                    if (i54 != -1) {
                    }
                    z14 = true;
                    i50 = i55 + 2;
                    i44 = i53;
                }
                int i56 = i39 - 2;
                boolean z15 = true;
                while (i56 >= 0 && z15) {
                    int i57 = (int) fArr[i56];
                    int i58 = i56 + 1;
                    int i59 = i56;
                    int i60 = (int) fArr[i58];
                    if (i57 < -1 || i57 > i18 || i60 < -1 || i60 > i49) {
                        throw cc.e.a();
                    }
                    if (i57 == -1) {
                        fArr[i59] = 0.0f;
                    } else if (i57 == i18) {
                        fArr[i59] = i18 - 1;
                    } else {
                        z15 = false;
                        if (i60 != -1) {
                            fArr[i58] = 0.0f;
                        } else if (i60 == i49) {
                            fArr[i58] = i49 - 1;
                        } else {
                            i56 = i59 - 2;
                        }
                        z15 = true;
                        i56 = i59 - 2;
                    }
                    z15 = true;
                    if (i60 != -1) {
                    }
                    z15 = true;
                    i56 = i59 - 2;
                }
                for (int i61 = 0; i61 < i39; i61 += 2) {
                    try {
                        if (L.b((int) fArr[i61], (int) fArr[i61 + 1])) {
                            int i62 = i61 / 2;
                            int i63 = (i62 / 32) + (bVar3.c * i45);
                            int[] iArr3 = bVar3.d;
                            iArr3[i63] = iArr3[i63] | (1 << (i62 & 31));
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw cc.e.a();
                    }
                }
                i40 = i45 + 1;
                i36 = i41;
                f71 = f76;
                cVar2 = cVar12;
            }
            ic.c cVar13 = cVar2;
            if (aVar4 == null) {
                i11 = 3;
                i10 = 1;
                jVarArr = new cc.j[]{cVar13, cVar10, cVar3};
            } else {
                i10 = 1;
                i11 = 3;
                jVarArr = new cc.j[]{cVar13, cVar10, cVar3, aVar4};
            }
            cc.j[] jVarArr2 = jVarArr;
            mVar.getClass();
            com.google.firebase.messaging.m mVar3 = new com.google.firebase.messaging.m();
            int i64 = bVar3.b;
            if (i64 < 21 || (i64 & i11) != i10) {
                throw cc.c.a();
            }
            mVar3.b = bVar3;
            try {
                dVar = mVar.b(mVar3);
            } catch (cc.a e11) {
                aVar2 = e11;
                e = null;
                try {
                    mVar3.r();
                    mVar3.c = null;
                    mVar3.d = null;
                    mVar3.a = true;
                    mVar3.q();
                    mVar3.p();
                    bVar2 = (dc.b) mVar3.b;
                    i12 = 0;
                    while (i12 < bVar2.a) {
                        int i65 = i12 + 1;
                        for (int i66 = i65; i66 < bVar2.b; i66++) {
                            if (bVar2.b(i12, i66) != bVar2.b(i66, i12)) {
                                bVar2.a(i66, i12);
                                bVar2.a(i12, i66);
                            }
                        }
                        i12 = i65;
                    }
                    dc.d b10 = mVar.b(mVar3);
                    b10.e = new na.d(10);
                    dVar = b10;
                    i13 = dVar.f;
                    if (com.google.android.gms.internal.vision.e2.u(dVar.e)) {
                        cc.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    aVar3 = new aa.a(dVar.a, jVarArr2);
                    list = dVar.b;
                    if (list != null) {
                    }
                    str = dVar.c;
                    if (str != null) {
                    }
                    if (i13 >= 0) {
                        aVar3.t(cc.i.d, Integer.valueOf(i14));
                        aVar3.t(cc.i.e, Integer.valueOf(i13));
                    }
                    aVar3.t(cc.i.c, dVar.d);
                    aVar3.t(cc.i.f, "]Q" + dVar.h);
                    return aVar3;
                } catch (cc.a | cc.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (cc.c e12) {
                e = e12;
                aVar2 = null;
                mVar3.r();
                mVar3.c = null;
                mVar3.d = null;
                mVar3.a = true;
                mVar3.q();
                mVar3.p();
                bVar2 = (dc.b) mVar3.b;
                i12 = 0;
                while (i12 < bVar2.a) {
                }
                dc.d b102 = mVar.b(mVar3);
                b102.e = new na.d(10);
                dVar = b102;
                i13 = dVar.f;
                if (com.google.android.gms.internal.vision.e2.u(dVar.e)) {
                }
                aVar3 = new aa.a(dVar.a, jVarArr2);
                list = dVar.b;
                if (list != null) {
                }
                str = dVar.c;
                if (str != null) {
                }
                if (i13 >= 0) {
                }
                aVar3.t(cc.i.c, dVar.d);
                aVar3.t(cc.i.f, "]Q" + dVar.h);
                return aVar3;
            }
            i13 = dVar.f;
            if (com.google.android.gms.internal.vision.e2.u(dVar.e) && jVarArr2.length >= 3) {
                cc.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            aVar3 = new aa.a(dVar.a, jVarArr2);
            list = dVar.b;
            if (list != null) {
                aVar3.t(cc.i.a, list);
            }
            str = dVar.c;
            if (str != null) {
                aVar3.t(cc.i.b, str);
            }
            if (i13 >= 0 && (i14 = dVar.g) >= 0) {
                aVar3.t(cc.i.d, Integer.valueOf(i14));
                aVar3.t(cc.i.e, Integer.valueOf(i13));
            }
            aVar3.t(cc.i.c, dVar.d);
            aVar3.t(cc.i.f, "]Q" + dVar.h);
            return aVar3;
        } catch (IllegalArgumentException unused4) {
            throw cc.c.a();
        }
    }

    @Override // ii.h1
    public /* synthetic */ boolean t(ii.i1 i1Var) {
        return false;
    }

    public ic.a t0(float f7, float f10, int i10, int i11) {
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

    @Override // ci.pc
    public void u(float f7) {
        b7 b7Var = (b7) this.b;
        l8 l8Var = b7Var.d;
        if (l8Var == null) {
            return;
        }
        l8Var.s0 = f7;
        l8Var.j = true;
        b7Var.y(true);
    }

    @Override // u2.b1
    public void v(c1 c1Var) {
        o2.k kVar = (o2.k) this.b;
        kVar.G.v(kVar);
    }

    public boolean v0() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.b).d;
        return x0Var != null && x0Var.b();
    }

    @Override // ci.pc
    public void w(boolean z10) {
        b7 b7Var = (b7) this.b;
        if (b7Var.j()) {
            b7Var.E.getClass();
        }
        b7Var.x(-4, z10);
    }

    public void w0() {
        o2.k kVar = (o2.k) this.b;
        int i10 = kVar.H - 1;
        kVar.H = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (q qVar : kVar.J) {
            qVar.e();
            i11 += qVar.Y.a;
        }
        l1[] l1VarArr = new l1[i11];
        int i12 = 0;
        for (q qVar2 : kVar.J) {
            qVar2.e();
            int i13 = qVar2.Y.a;
            int i14 = 0;
            while (i14 < i13) {
                qVar2.e();
                l1VarArr[i12] = qVar2.Y.a(i14);
                i14++;
                i12++;
            }
        }
        kVar.I = new u2.n1(l1VarArr);
        kVar.G.a(kVar);
    }

    @Override // org.telegram.ui.Components.ui
    public void x0(gh ghVar) {
        int i10;
        i10 = ((n2) ((hg.n) this.b)).currentAccount;
        NotificationCenter.getInstance(i10).doOnIdle(ghVar);
    }

    @Override // k2.n
    public void y(int i10, long j3, long j10) {
        y yVar = ((i0) this.b).Y0;
        Handler handler = (Handler) yVar.b;
        if (handler != null) {
            handler.post(new k2.i(yVar, i10, j3, j10, 0));
        }
    }

    public void y0(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a.q("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    @Override // lg.o
    public void z() {
        ((ci.j0) this.b).d.invalidate();
    }

    public void z0(long j3) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.b).putLong("android.media.metadata.DURATION", j3);
    }

    public /* synthetic */ m(a6.i iVar) {
        this.a = 6;
        this.b = (r) iVar.b;
    }

    public /* synthetic */ m(b7.a aVar, v vVar) {
        this.a = 5;
        this.b = vVar;
    }

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public m(MediaInfo mediaInfo) {
        this.a = 7;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public m(JSONObject jSONObject) {
        this.a = 7;
        this.b = new c6.o(jSONObject);
    }

    public m(ba.c cVar) {
        this.a = 12;
        this.b = new File(cVar.b, "com.crashlytics.settings.json");
    }

    public m(Context context, Uri uri) {
        this.a = 28;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public m(int i10) {
        this.a = i10;
        switch (i10) {
            case 15:
                this.b = new a6.m(23);
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    public m(MediaMetadataCompat mediaMetadataCompat) {
        this.a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        b0.a(bundle);
    }

    @Override // org.telegram.ui.Components.eo0
    public void B() {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void K0() {
    }

    @Override // lg.o
    public void k0() {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void u0() {
    }

    @Override // ii.h1
    public /* synthetic */ void x() {
    }

    @Override // lg.o
    public void L(boolean z10) {
    }

    @Override // ii.h1
    public /* synthetic */ void M(CharSequence charSequence) {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void U0(Object obj) {
    }

    @Override // lg.o
    public void g0(boolean z10) {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void j1(TLRPC.User user) {
    }

    @Override // ii.h1
    public /* synthetic */ void j(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.ui
    public /* synthetic */ void W1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
    }

    @Override // org.telegram.ui.Components.ui
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j3, boolean z12, boolean z13, long j10) {
    }
}
