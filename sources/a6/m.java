package a6;

import ab.e0;
import ah.i1;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import androidx.biometric.o;
import androidx.biometric.q;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import c5.b0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.xa;
import g6.n;
import g6.s;
import hg.z1;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import m.j1;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.LaunchActivity;
import qg.s1;
import rg.v1;
import v7.c8;
import v7.i8;
import v7.j5;
import v7.r8;
import v7.u6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class m implements bl0, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, u0, OnSuccessListener, n, ee.b, v1, j1, r, gb.n, z1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ m(g6.r rVar, String[] strArr) {
        this.a = 23;
        this.b = strArr;
    }

    public static p d(Looper looper, Object obj, String str) {
        n6.l.i(obj, "Listener must not be null");
        n6.l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override // hg.z1
    public /* synthetic */ a0.h J() {
        return null;
    }

    @Override // hg.z1
    public /* synthetic */ boolean O(int i10) {
        return true;
    }

    @Override // rg.v1
    public void U(float f7) {
        xa xaVar = (xa) this.b;
        qg.u0.e(xaVar.F1).k(String.valueOf(qg.m.a.indexOf(xaVar.O0.getCurrentBrush())), f7);
        s1 s1Var = xaVar.A1;
        s1Var.c = f7;
        xaVar.D0(s1Var, null, false);
    }

    @Override // hg.z1
    public void Y(ArrayList arrayList) {
        hg.j1 j1Var = (hg.j1) this.b;
        String str = j1Var.Z;
        if (str != null) {
            j1Var.U(str, j1Var.c0, j1Var.d0, j1Var.b0, j1Var.a0);
        }
    }

    @Override // androidx.lifecycle.a0
    public void Z(Object obj) {
        switch (this.a) {
            case 4:
                q qVar = (q) this.b;
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(R.string.fingerprint_not_recognized));
                    }
                    y yVar = qVar.l0;
                    if (yVar.n) {
                        Executor executor = yVar.d;
                        if (executor == null) {
                            executor = new o(1);
                        }
                        executor.execute(new androidx.biometric.h(qVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    y yVar2 = qVar.l0;
                    if (yVar2.u == null) {
                        yVar2.u = new z();
                    }
                    y.h(yVar2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.b;
                if (tVar == null || !pVar.r0) {
                    return;
                }
                pVar.getClass();
                throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public void a(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        long[] jArr = jVar.e;
        if (jArr.length <= 0 || linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            return;
        }
        linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 23:
                g6.q qVar = new g6.q(1, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((s) obj).u();
                String[] strArr = (String[]) this.b;
                Parcel N0 = iVar.N0();
                v.d(N0, qVar);
                N0.writeStringArray(strArr);
                iVar.S0(N0, 6);
                break;
            default:
                GetCredentialRequest getCredentialRequest = (GetCredentialRequest) this.b;
                h7.f fVar = new h7.f(1, (TaskCompletionSource) obj2);
                h7.d dVar = (h7.d) ((h7.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = q7.a.a;
                obtain.writeStrongBinder(fVar);
                q7.a.b(obtain, getCredentialRequest);
                q7.a.b(obtain, gVar);
                ((h7.b) dVar).F0(obtain, 1);
                break;
        }
    }

    public void b(StringBuilder sb2, Iterator it) {
        d9.l lVar = (d9.l) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(d9.l.f(entry.getKey()));
            sb2.append("=");
            sb2.append(d9.l.f(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) lVar.a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(d9.l.f(entry2.getKey()));
                sb2.append("=");
                sb2.append(d9.l.f(entry2.getValue()));
            }
        }
    }

    public void c(j6.l lVar, u uVar) {
        k0 k0Var = (k0) this.b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        k0 k0Var2 = (k0) this.b;
        q qVar = (q) k0Var2.D("androidx.biometric.BiometricFragment");
        if (qVar == null) {
            qVar = new q();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
            aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            k0Var2.A(true);
            k0Var2.E();
        }
        androidx.fragment.app.v k10 = qVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        y yVar = qVar.l0;
        yVar.f = lVar;
        int i10 = lVar.a;
        if (i10 == 0) {
            i10 = uVar != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i10 == 15 && uVar == null) {
            yVar.g = v7.m.a();
        } else {
            yVar.g = uVar;
        }
        if (qVar.Q()) {
            qVar.l0.k = qVar.q(R.string.confirm_device_credential_password);
        } else {
            qVar.l0.k = null;
        }
        if (qVar.Q() && new androidx.biometric.e(new k6.h(k10, 1)).i(255) != 0) {
            qVar.l0.n = true;
            qVar.S();
        } else if (qVar.l0.p) {
            qVar.k0.postDelayed(new androidx.biometric.p(qVar), 600L);
        } else {
            qVar.X();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:222:0x034c, code lost:
    
        throw dc.c.a();
     */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a7 A[LOOP:21: B:146:0x022c->B:176:0x03a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0376 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c2.r e(c2.b bVar) {
        int e;
        ic.e eVar;
        ic.c cVar;
        int i10;
        int i11;
        ec.c cVar2;
        int e7;
        ic.f t10 = bVar.t();
        ic.c cVar3 = bVar.s().a;
        ic.d s10 = bVar.s();
        ic.f t11 = bVar.t();
        int i12 = m1.j.d(8)[s10.b];
        ec.b bVar2 = (ec.b) bVar.b;
        int i13 = bVar2.b;
        int i14 = 0;
        for (int i15 = 0; i15 < i13; i15++) {
            for (int i16 = 0; i16 < i13; i16++) {
                if (i2.d.a(i12, i15, i16)) {
                    bVar2.a(i16, i15);
                }
            }
        }
        int i17 = t11.a * 4;
        int i18 = i17 + 17;
        int i19 = t11.d;
        ec.b bVar3 = new ec.b(i18, i18);
        bVar3.d(0, 0, 9, 9);
        int i20 = i17 + 9;
        bVar3.d(i20, 0, 8, 9);
        bVar3.d(0, i20, 9, 8);
        int[] iArr = t11.b;
        int length = iArr.length;
        int i21 = 0;
        while (i21 < length) {
            int i22 = iArr[i21] - 2;
            for (int i23 = i14; i23 < length; i23++) {
                if ((i21 != 0 || (i23 != 0 && i23 != length - 1)) && (i21 != length - 1 || i23 != 0)) {
                    bVar3.d(iArr[i23] - 2, i22, 5, 5);
                }
            }
            i21++;
            i14 = 0;
        }
        int i24 = 2;
        int i25 = 6;
        int i26 = 1;
        bVar3.d(6, 9, 1, i17);
        bVar3.d(9, 6, i17, 1);
        if (t11.a > 6) {
            int i27 = i17 + 6;
            bVar3.d(i27, 0, 3, 6);
            bVar3.d(0, i27, 6, 3);
        }
        byte[] bArr = new byte[i19];
        int i28 = i13 - 1;
        int i29 = i28;
        boolean z10 = true;
        int i30 = 0;
        int i31 = 0;
        int i32 = 0;
        while (i29 > 0) {
            if (i29 == i25) {
                i29--;
            }
            int i33 = 0;
            while (i33 < i13) {
                int i34 = z10 ? i28 - i33 : i33;
                int i35 = i26;
                int i36 = 0;
                for (int i37 = i24; i36 < i37; i37 = 2) {
                    int i38 = i29 - i36;
                    if (!bVar3.b(i38, i34)) {
                        i31++;
                        i32 <<= 1;
                        if (bVar2.b(i38, i34)) {
                            i32 |= 1;
                        }
                        if (i31 == 8) {
                            bArr[i30] = (byte) i32;
                            i30++;
                            i31 = 0;
                            i32 = 0;
                        }
                    }
                    i36++;
                }
                i33++;
                i26 = i35;
                i24 = 2;
            }
            z10 = !z10;
            i29 -= 2;
            i25 = 6;
            i24 = 2;
        }
        int i39 = i26;
        if (i30 != i19) {
            throw dc.c.a();
        }
        if (i19 != t10.d) {
            throw new IllegalArgumentException();
        }
        b0 b0Var = t10.c[cVar3.ordinal()];
        b2.u0[] u0VarArr = (b2.u0[]) b0Var.c;
        int i40 = b0Var.b;
        int i41 = 0;
        for (b2.u0 u0Var : u0VarArr) {
            i41 += u0Var.a;
        }
        ic.a[] aVarArr = new ic.a[i41];
        int i42 = 0;
        for (b2.u0 u0Var2 : u0VarArr) {
            int i43 = 0;
            while (i43 < u0Var2.a) {
                int i44 = u0Var2.b;
                aVarArr[i42] = new ic.a(i44, new byte[i40 + i44]);
                i43++;
                i42++;
            }
        }
        int length2 = aVarArr[0].a.length;
        int i45 = i41 - 1;
        while (i45 >= 0 && aVarArr[i45].a.length != length2) {
            i45--;
        }
        int i46 = i45 + 1;
        int i47 = length2 - i40;
        int i48 = 0;
        int i49 = 0;
        while (i48 < i47) {
            int i50 = i49;
            int i51 = 0;
            while (i51 < i42) {
                aVarArr[i51].a[i48] = bArr[i50];
                i51++;
                i50++;
            }
            i48++;
            i49 = i50;
        }
        int i52 = i46;
        while (i52 < i42) {
            aVarArr[i52].a[i47] = bArr[i49];
            i52++;
            i49++;
        }
        boolean z11 = false;
        int length3 = aVarArr[0].a.length;
        while (i47 < length3) {
            int i53 = i49;
            int i54 = 0;
            while (i54 < i42) {
                aVarArr[i54].a[i54 < i46 ? i47 : i47 + 1] = bArr[i53];
                i54++;
                i53++;
            }
            i47++;
            i49 = i53;
        }
        int i55 = 0;
        for (int i56 = 0; i56 < i41; i56++) {
            i55 += aVarArr[i56].b;
        }
        byte[] bArr2 = new byte[i55];
        int i57 = 0;
        int i58 = 0;
        int i59 = 0;
        while (i58 < i41) {
            ic.a aVar = aVarArr[i58];
            byte[] bArr3 = aVar.a;
            int i60 = aVar.b;
            int length4 = bArr3.length;
            int[] iArr2 = new int[length4];
            for (int i61 = 0; i61 < length4; i61++) {
                iArr2[i61] = bArr3[i61] & 255;
            }
            try {
                int G = ((ya.d) this.b).G(bArr3.length - i60, iArr2);
                for (int i62 = 0; i62 < i60; i62++) {
                    bArr3[i62] = (byte) iArr2[i62];
                }
                i57 += G;
                int i63 = i59;
                int i64 = 0;
                while (i64 < i60) {
                    bArr2[i63] = bArr3[i64];
                    i64++;
                    i63++;
                }
                i58++;
                i59 = i63;
            } catch (gc.c unused) {
                dc.a aVar2 = dc.a.c;
                if (dc.h.a) {
                    throw new dc.a();
                }
                throw dc.a.c;
            }
        }
        char[] cArr = ic.b.a;
        b4.d dVar = new b4.d(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(i39);
        int i65 = -1;
        int i66 = -1;
        boolean z12 = false;
        boolean z13 = false;
        ec.c cVar4 = null;
        while (true) {
            try {
                int d = dVar.d();
                ic.e eVar2 = ic.e.c;
                if (d < 4 || (e = dVar.e(4)) == 0) {
                    eVar = eVar2;
                } else if (e == 1) {
                    eVar = ic.e.d;
                } else if (e == 2) {
                    eVar = ic.e.e;
                } else if (e == 3) {
                    eVar = ic.e.f;
                } else if (e == 4) {
                    eVar = ic.e.h;
                } else if (e == 5) {
                    eVar = ic.e.s;
                } else if (e == 7) {
                    eVar = ic.e.n;
                } else if (e == 8) {
                    eVar = ic.e.r;
                } else if (e == 9) {
                    eVar = ic.e.v;
                } else {
                    if (e != 13) {
                        throw new IllegalArgumentException();
                    }
                    eVar = ic.e.w;
                }
                int ordinal = eVar.ordinal();
                if (ordinal != 0) {
                    cVar = cVar3;
                    if (ordinal != 3) {
                        if (ordinal == 5) {
                            i10 = i57;
                            i11 = 1;
                            int e10 = dVar.e(8);
                            if ((e10 & 128) == 0) {
                                e7 = e10 & 127;
                            } else if ((e10 & 192) == 128) {
                                e7 = ((e10 & 63) << 8) | dVar.e(8);
                            } else {
                                if ((e10 & 224) != 192) {
                                    throw dc.c.a();
                                }
                                e7 = ((e10 & 31) << 16) | dVar.e(16);
                            }
                            HashMap hashMap = ec.c.c;
                            if (e7 < 0 || e7 >= 900) {
                                break;
                            }
                            ec.c cVar5 = (ec.c) ec.c.c.get(Integer.valueOf(e7));
                            if (cVar5 == null) {
                                throw dc.c.a();
                            }
                            cVar2 = cVar5;
                        } else if (ordinal == 7) {
                            i10 = i57;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z11 = true;
                        } else if (ordinal == 8) {
                            i10 = i57;
                            i11 = 1;
                            cVar2 = cVar4;
                            z12 = true;
                            z13 = true;
                            int i67 = i65;
                            if (eVar != eVar2) {
                                if (cVar2 != null) {
                                    i11 = z11 ? 4 : z13 ? 6 : 2;
                                } else if (z11) {
                                    i11 = 3;
                                } else if (z13) {
                                    i11 = 5;
                                }
                                c2.r rVar = new c2.r(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, cVar.toString(), i67, i66, i11);
                                rVar.g = Integer.valueOf(i10);
                                return rVar;
                            }
                            i65 = i67;
                            cVar3 = cVar;
                            cVar4 = cVar2;
                            i57 = i10;
                        } else if (ordinal != 9) {
                            int e11 = dVar.e(eVar.a(t10));
                            int ordinal2 = eVar.ordinal();
                            i10 = i57;
                            if (ordinal2 == 1) {
                                ic.b.e(dVar, sb2, e11);
                            } else if (ordinal2 == 2) {
                                ic.b.a(dVar, sb2, e11, z12);
                            } else if (ordinal2 == 4) {
                                ic.b.b(dVar, sb2, e11, cVar4, arrayList);
                            } else {
                                if (ordinal2 != 6) {
                                    throw dc.c.a();
                                }
                                ic.b.d(dVar, sb2, e11);
                            }
                        } else {
                            i10 = i57;
                            int e12 = dVar.e(4);
                            int e13 = dVar.e(eVar.a(t10));
                            i11 = 1;
                            if (e12 == 1) {
                                ic.b.c(dVar, sb2, e13);
                            }
                        }
                        int i672 = i65;
                        if (eVar != eVar2) {
                        }
                    } else {
                        i10 = i57;
                        i11 = 1;
                        if (dVar.d() < 16) {
                            throw dc.c.a();
                        }
                        i65 = dVar.e(8);
                        i66 = dVar.e(8);
                    }
                    cVar2 = cVar4;
                    int i6722 = i65;
                    if (eVar != eVar2) {
                    }
                } else {
                    cVar = cVar3;
                    i10 = i57;
                }
                i11 = 1;
                cVar2 = cVar4;
                int i67222 = i65;
                if (eVar != eVar2) {
                }
            } catch (IllegalArgumentException unused2) {
                throw dc.c.a();
            }
        }
    }

    @Override // hg.z1
    public void f(int i10) {
        ((hg.j1) this.b).l();
    }

    @Override // gb.n
    public Object f2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            r8 r8Var = jb.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void g(k6.a aVar) {
        w wVar = (w) this.b;
        wVar.o.lock();
        try {
            wVar.l = aVar;
            w.l(wVar);
        } finally {
            wVar.o.unlock();
        }
    }

    @Override // rg.v1
    public float get() {
        xa xaVar = (xa) this.b;
        int i10 = xaVar.F1;
        qg.m currentBrush = xaVar.O0.getCurrentBrush();
        return currentBrush == null ? qg.u0.e(i10).i : qg.u0.e(i10).f(String.valueOf(qg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public Boolean h() {
        Bundle bundle = (Bundle) this.b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // androidx.activity.result.b
    public void i(Object obj) {
        switch (this.a) {
            case 7:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.b;
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var != null) {
                    String str = f0Var.a;
                    int i10 = f0Var.b;
                    androidx.fragment.app.s f7 = j0Var.c.f(str);
                    if (f7 != null) {
                        f7.x(i10, aVar.a, aVar.b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.b;
                int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    resultReceiver.send(i11, intent == null ? null : intent.getExtras());
                }
                int i12 = aVar2.a;
                if (i12 != -1 || i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public void l(View view, i1 i1Var, boolean z10, boolean z11) {
        ah.f0 f0Var = (ah.f0) this.b;
        f0Var.a.eb(null, f0Var.e, f0Var.b, view, 0.0f, 0.0f, i1Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new a3.d(this, 3));
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void n(int i10) {
        k6.a aVar;
        w wVar = (w) this.b;
        Lock lock = wVar.o;
        lock.lock();
        try {
            if (!wVar.n && (aVar = wVar.m) != null && aVar.c()) {
                wVar.n = true;
                wVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            wVar.n = false;
            w.k(wVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public void o(Bundle bundle) {
        w wVar = (w) this.b;
        wVar.o.lock();
        try {
            Bundle bundle2 = wVar.k;
            if (bundle2 == null) {
                wVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            wVar.l = k6.a.e;
            w.l(wVar);
        } finally {
            wVar.o.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        a5.a aVar;
        a5.a aVar2;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) androidx.activity.result.c.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        ya.d[] dVarArr = new ya.d[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            ya.d dVar = new ya.d(6);
            dVar.b = (WebMessagePortBoundaryInterface) androidx.activity.result.c.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            dVarArr[i10] = dVar;
        }
        if (b5.m.a.b()) {
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) androidx.activity.result.c.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
            int type = webMessagePayloadBoundaryInterface.getType();
            if (type == 0) {
                aVar = new a5.a(webMessagePayloadBoundaryInterface.getAsString());
            } else {
                if (type != 1) {
                    aVar2 = null;
                    if (aVar2 == null) {
                        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) androidx.activity.result.c.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
                        ((a5.b) this.b).c(webView, aVar2, uri, z10, (b5.h) jsReplyProxyBoundaryInterface.getOrCreatePeer(new b5.g(jsReplyProxyBoundaryInterface, 0)));
                        return;
                    }
                    return;
                }
                aVar = new a5.a(webMessagePayloadBoundaryInterface.getAsArrayBuffer());
            }
        } else {
            aVar = new a5.a(webMessageBoundaryInterface.getData());
        }
        aVar2 = aVar;
        if (aVar2 == null) {
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((d6.a) this.b).getClass();
        j5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // g6.n
    public void p(String str, long j10, long j11, long j12) {
        e6.o oVar = (e6.o) this.b;
        try {
            oVar.a(new e6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ee.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object r(ee.c cVar, md.c cVar2) {
        ee.a aVar;
        int i10;
        Throwable th2;
        fe.g gVar;
        if (cVar2 instanceof ee.a) {
            aVar = (ee.a) cVar2;
            int i11 = aVar.d;
            if ((i11 & TLObject.FLAG_31) != 0) {
                aVar.d = i11 - TLObject.FLAG_31;
                Object obj = aVar.b;
                ld.a aVar2 = ld.a.a;
                i10 = aVar.d;
                id.i iVar = id.i.a;
                if (i10 != 0) {
                    i8.b(obj);
                    fe.g gVar2 = new fe.g(cVar, aVar.getContext());
                    try {
                        aVar.a = gVar2;
                        aVar.d = 1;
                        Object invoke = ((k1.n) this.b).invoke(gVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = iVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        gVar = gVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        gVar = gVar2;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = aVar.a;
                    try {
                        i8.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        gVar.releaseIntercepted();
                        throw th2;
                    }
                }
                gVar.releaseIntercepted();
                return iVar;
            }
        }
        aVar = new ee.a(this, cVar2);
        Object obj2 = aVar.b;
        ld.a aVar22 = ld.a.a;
        i10 = aVar.d;
        id.i iVar2 = id.i.a;
        if (i10 != 0) {
        }
        gVar.releaseIntercepted();
        return iVar2;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean s() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // g6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void t(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        Iterator it;
        e6.o oVar = (e6.o) this.b;
        try {
            i11 = i10;
            try {
                Status status = new Status(i11, null, null, null);
                Object obj2 = true == (obj instanceof g6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                oVar.a(new e6.n(status, 2));
            } catch (IllegalStateException e) {
                e = e;
                g6.b bVar = e6.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = oVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e7) {
            e = e7;
            i11 = i10;
        }
        it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j10, i11, j11, j12);
            i11 = i10;
        }
    }

    public void u(e0 e0Var) {
        ((l5.r) ((i5.f) ((qa.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new a1.c(this, 2)).a(new i5.a(null, e0Var, i5.d.a, null), new k2.f0(4));
    }

    public c3.j v() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (c3.j jVar : ((LinkedHashMap) this.b).values()) {
            arrayList.add(jVar.b);
            arrayList2.add(jVar.c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()][]);
        long j10 = 0;
        for (int[] iArr2 : iArr) {
            j10 += iArr2.length;
        }
        int i10 = (int) j10;
        u6.c(j10, "the total number of elements (%s) in the arrays must fit in an int", j10 == ((long) i10));
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i11, iArr4.length);
            i11 += iArr4.length;
        }
        return new c3.j(iArr3, c8.a((long[][]) arrayList2.toArray(new long[arrayList2.size()][])), c8.a((long[][]) arrayList3.toArray(new long[arrayList3.size()][])), c8.a((long[][]) arrayList4.toArray(new long[arrayList4.size()][])));
    }

    public JSONObject w() {
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
                        jSONObject = new JSONObject(x9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        x9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    x9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override // hg.z1
    public /* synthetic */ a0.h y() {
        return null;
    }

    public /* synthetic */ m(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public m(JSONArray jSONArray) {
        this.a = 10;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new c5.m(optJSONObject));
                }
            }
        }
        this.b = arrayList;
    }

    public m(x6.a aVar) {
        this.a = 29;
        n6.l.h(aVar);
        this.b = aVar;
    }

    public m(Context context) {
        this.a = 12;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public m(ca.c cVar) {
        this.a = 19;
        this.b = new File(cVar.b, "com.crashlytics.settings.json");
    }

    public m(int i10) {
        this.a = i10;
        switch (i10) {
            case 13:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 27:
                break;
            case 28:
                this.b = new ya.d(gc.a.h, 21);
                break;
            default:
                this.b = new LinkedHashMap();
                break;
        }
    }

    public m(LaunchActivity launchActivity, Executor executor, v7.l lVar) {
        this.a = 5;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s10 = launchActivity.s();
            y yVar = (y) new androidx.biometric.e(launchActivity).m(y.class);
            this.b = s10;
            yVar.d = executor;
            yVar.e = lVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
