package k6;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.q;
import androidx.biometric.v;
import androidx.biometric.z;
import androidx.fragment.app.e0;
import androidx.lifecycle.a0;
import b2.u0;
import bi.jb;
import bi.n9;
import bi.q5;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.i0;
import di.mb;
import e9.l1;
import g.r;
import gb.t;
import gi.s0;
import gi.t0;
import j$.util.Objects;
import java.io.EOFException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import ji.d2;
import ji.m5;
import m.t3;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.f5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.t8;
import org.telegram.ui.fo;
import org.telegram.ui.sv0;
import org.telegram.ui.web.b1;
import org.telegram.ui.web.y0;
import qg.q1;
import r0.c0;
import r0.j0;
import rg.x1;
import v7.j5;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class h implements z3.e, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, sv0, v0, OnSuccessListener, mg.o, x1, l1, r0.o, gb.o, s0, s, f5 {
    public static h c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ h(i7.b bVar, x5.e eVar) {
        this.a = 28;
        this.b = eVar;
    }

    public static p m(Looper looper, Object obj, String str) {
        n6.l.i(obj, "Listener must not be null");
        n6.l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    public static h p(Context context) {
        n6.l.h(context);
        synchronized (h.class) {
            try {
                if (c == null) {
                    o.a(context);
                    c = new h(context);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c;
    }

    public static final l s(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i10 = 0; i10 < lVarArr.length; i10++) {
                if (lVarArr[i10].equals(mVar)) {
                    return lVarArr[i10];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean t(PackageInfo packageInfo, boolean z10) {
        PackageInfo packageInfo2;
        if (z10) {
            if (packageInfo == null) {
                packageInfo2 = null;
                if (packageInfo != null && packageInfo2.signatures != null) {
                    if ((!z10 ? s(packageInfo2, n.a) : s(packageInfo2, n.a[0])) == null) {
                        return true;
                    }
                }
                return false;
            }
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
        }
        packageInfo2 = packageInfo;
        if (packageInfo != null) {
            if ((!z10 ? s(packageInfo2, n.a) : s(packageInfo2, n.a[0])) == null) {
            }
        }
        return false;
    }

    @Override // mg.o
    public void A() {
        ((i0) this.b).d.invalidate();
    }

    @Override // rg.x1
    public void B0(float f7) {
        mb mbVar = (mb) this.b;
        qg.s0.e(mbVar.F1).k(String.valueOf(qg.m.a.indexOf(mbVar.O0.getCurrentBrush())), f7);
        q1 q1Var = mbVar.A1;
        q1Var.c = f7;
        mbVar.D0(q1Var, null, false);
    }

    @Override // org.telegram.ui.sv0
    public void D0(MessageObject messageObject) {
        ((jb) ((q5) this.b).Q1).f(true);
    }

    @Override // org.telegram.ui.sv0
    public void H(MessageObject messageObject) {
        ((jb) ((q5) this.b).Q1).f(false);
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        ((d2) this.b).s0(i10, i11, z10);
    }

    @Override // r0.o
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        boolean z10;
        boolean z11;
        int d = l1Var.d();
        r rVar = (r) this.b;
        Context context = rVar.e;
        int d10 = l1Var.d();
        ActionBarContextView actionBarContextView = rVar.y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.y.getLayoutParams();
            if (rVar.y.isShown()) {
                if (rVar.l0 == null) {
                    rVar.l0 = new Rect();
                    rVar.m0 = new Rect();
                }
                Rect rect = rVar.l0;
                Rect rect2 = rVar.m0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = t3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                ViewGroup viewGroup2 = rVar.J;
                WeakHashMap weakHashMap = j0.a;
                r0.l1 a2 = c0.a(viewGroup2);
                int b10 = a2 == null ? 0 : a2.b();
                int c10 = a2 == null ? 0 : a2.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || rVar.L != null) {
                    View view2 = rVar.L;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            rVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    rVar.L = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    rVar.J.addView(rVar.L, -1, layoutParams);
                }
                View view4 = rVar.L;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = rVar.L;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!rVar.Q && r9) {
                    d10 = 0;
                }
                z10 = r9;
                r9 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r9 = false;
            }
            if (r9) {
                rVar.y.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = rVar.L;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return j0.g(view, d != d10 ? l1Var.f(l1Var.b(), d10, l1Var.c(), l1Var.a()) : l1Var);
    }

    @Override // gi.s0
    public void a(long j10) {
        ((gi.s) this.b).presentFragment(fo.W9(j10));
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        a6.l lVar = new a6.l((TaskCompletionSource) obj2);
        i7.i iVar = (i7.i) ((i7.c) obj).u();
        x5.e eVar = (x5.e) this.b;
        Parcel J0 = iVar.J0();
        int i10 = i7.f.a;
        J0.writeStrongBinder(lVar);
        i7.f.c(J0, eVar);
        iVar.K0(J0, 1);
    }

    @Override // gi.s0
    public void b() {
        gi.s sVar = (gi.s) this.b;
        ne.b bVar = sVar.a;
        t0 t0Var = sVar.v;
        bVar.a(t0Var.n && t0Var.l == 0, true);
        sVar.d.W2.N(true);
    }

    @Override // z3.e
    public int c(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // gi.s0
    public void close() {
        ((gi.s) this.b).finishFragment();
    }

    @Override // z3.e
    public long d(int i10) {
        u6.g(i10 == 0);
        return 0L;
    }

    @Override // e9.l1
    public Object e(Object obj, Object obj2) {
        return ((d9.k) this.b).apply(obj2);
    }

    @Override // z3.e
    public List f(long j10) {
        return j10 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // gb.o
    public Object f2() {
        Class cls = (Class) this.b;
        try {
            return t.a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }

    public void g(StringBuilder sb2, Iterator it) {
        d9.l lVar = (d9.l) this.b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(d9.l.d(entry.getKey()));
            sb2.append("=");
            sb2.append(d9.l.d(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) lVar.a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(d9.l.d(entry2.getKey()));
                sb2.append("=");
                sb2.append(d9.l.d(entry2.getValue()));
            }
        }
    }

    @Override // org.telegram.ui.sv0
    public /* synthetic */ TextureView g0() {
        return null;
    }

    @Override // rg.x1
    public float get() {
        mb mbVar = (mb) this.b;
        int i10 = mbVar.F1;
        qg.m currentBrush = mbVar.O0.getCurrentBrush();
        return currentBrush == null ? qg.s0.e(i10).i : qg.s0.e(i10).f(String.valueOf(qg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void h(a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // androidx.activity.result.b
    public void i(Object obj) {
        switch (this.a) {
            case 7:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.b;
                e0 e0Var = (e0) i0Var.F.pollFirst();
                if (e0Var != null) {
                    String str = e0Var.a;
                    int i10 = e0Var.b;
                    androidx.fragment.app.r f7 = i0Var.c.f(str);
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
                int i11 = aVar2.a;
                Bundle extras = intent == null ? null : intent.getExtras();
                if (i11 != -1) {
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    u.h("ProxyBillingActivityV2", "External offer flow finished with resultCode: " + i11);
                    extras.putInt("INTERNAL_LOG_ERROR_REASON", 134);
                    extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "External offer flow finished with error resultCode: " + i11);
                }
                int i12 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.O;
                if (resultReceiver != null) {
                    resultReceiver.send(i12, extras);
                } else {
                    u.h("ProxyBillingActivityV2", "External offer flow result receiver is null");
                }
                if (i12 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer flow finished with billing responseCode: " + i12);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    @Override // z3.e
    public int j() {
        return 1;
    }

    public void k(j6.l lVar, v vVar) {
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        if (j0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            return;
        }
        if (j0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            return;
        }
        androidx.fragment.app.j0 j0Var2 = (androidx.fragment.app.j0) this.b;
        q qVar = (q) j0Var2.D("androidx.biometric.BiometricFragment");
        if (qVar == null) {
            qVar = new q();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(j0Var2);
            aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            j0Var2.A(true);
            j0Var2.E();
        }
        androidx.fragment.app.u k10 = qVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        z zVar = qVar.l0;
        zVar.f = lVar;
        int i10 = lVar.a;
        if (i10 == 0) {
            i10 = vVar != null ? 15 : 255;
        }
        if (Build.VERSION.SDK_INT < 30 && i10 == 15 && vVar == null) {
            zVar.g = v7.m.a();
        } else {
            zVar.g = vVar;
        }
        if (qVar.Q()) {
            qVar.l0.k = qVar.q(R.string.confirm_device_credential_password);
        } else {
            qVar.l0.k = null;
        }
        if (qVar.Q() && new androidx.biometric.e(new androidx.biometric.t(k10, 0)).h(255) != 0) {
            qVar.l0.n = true;
            qVar.S();
        } else if (qVar.l0.p) {
            qVar.k0.postDelayed(new androidx.biometric.p(qVar), 600L);
        } else {
            qVar.X();
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void l(int i10) {
        a aVar;
        x xVar = (x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (!xVar.n && (aVar = xVar.m) != null && aVar.c()) {
                xVar.n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05e7 A[Catch: a | c -> 0x0684, TryCatch #5 {a | c -> 0x0684, blocks: (B:294:0x05cd, B:295:0x05e3, B:297:0x05e7, B:298:0x05ea, B:300:0x05ee, B:302:0x05f8, B:304:0x05fe, B:309:0x0603), top: B:293:0x05cd }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public androidx.biometric.e n(n4.s sVar) {
        int i10;
        ArrayList arrayList;
        jc.c cVar;
        jc.c cVar2;
        jc.c cVar3;
        float f7;
        float f10;
        jc.a aVar;
        float f11;
        float f12;
        float f13;
        int i11;
        int i12;
        dc.j[] jVarArr;
        dc.a aVar2;
        ec.b bVar;
        int i13;
        c2.r rVar;
        int i14;
        androidx.biometric.e eVar;
        List list;
        String str;
        int i15;
        boolean z10;
        double d;
        double abs;
        int i16;
        int i17;
        int i18;
        qb.c cVar4 = (qb.c) this.b;
        ec.b m10 = sVar.m();
        ya.c cVar5 = new ya.c(m10, 27);
        jc.e eVar2 = new jc.e(m10);
        int i19 = m10.b;
        int i20 = m10.a;
        int i21 = (i19 * 3) / 388;
        int i22 = 3;
        if (i21 < 3) {
            i21 = 3;
        }
        char c10 = 5;
        int[] iArr = new int[5];
        int i23 = i21 - 1;
        int i24 = 0;
        boolean z11 = false;
        while (true) {
            char c11 = c10;
            int i25 = 1;
            i10 = i22;
            arrayList = eVar2.b;
            if (i23 >= i19 || z11) {
                break;
            }
            Arrays.fill(iArr, i24);
            int i26 = i24;
            while (i26 < i20) {
                if (m10.b(i26, i23)) {
                    if ((i24 & 1) == i25) {
                        i24++;
                    }
                    iArr[i24] = iArr[i24] + i25;
                    i16 = i19;
                } else if ((i24 & 1) != 0) {
                    i16 = i19;
                    iArr[i24] = iArr[i24] + 1;
                } else if (i24 == 4) {
                    if (!jc.e.b(iArr)) {
                        i16 = i19;
                        int i27 = i25;
                        iArr[0] = iArr[2];
                        iArr[i27] = iArr[i10];
                        iArr[2] = iArr[4];
                        iArr[i10] = i27;
                        iArr[4] = 0;
                    } else if (eVar2.c(i23, i26, iArr)) {
                        if (eVar2.c) {
                            z11 = eVar2.d();
                            i16 = i19;
                            i17 = 2;
                        } else {
                            if (arrayList.size() > i25) {
                                int size = arrayList.size();
                                int i28 = 0;
                                jc.c cVar6 = null;
                                while (true) {
                                    if (i28 >= size) {
                                        i16 = i19;
                                        i17 = 2;
                                        i18 = 0;
                                        break;
                                    }
                                    Object obj = arrayList.get(i28);
                                    i28++;
                                    jc.c cVar7 = (jc.c) obj;
                                    i16 = i19;
                                    if (cVar7.d >= 2) {
                                        if (cVar6 != null) {
                                            eVar2.c = true;
                                            i17 = 2;
                                            i18 = ((int) (Math.abs(cVar6.a - cVar7.a) - Math.abs(cVar6.b - cVar7.b))) / 2;
                                            break;
                                        }
                                        cVar6 = cVar7;
                                    }
                                    i19 = i16;
                                }
                            } else {
                                i16 = i19;
                                i18 = 0;
                                i17 = 2;
                            }
                            if (i18 > iArr[i17]) {
                                i23 += (i18 - r5) - 2;
                                i26 = i20 - 1;
                            }
                        }
                        Arrays.fill(iArr, 0);
                        i24 = 0;
                        i21 = i17;
                    } else {
                        i16 = i19;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i10];
                        iArr[2] = iArr[4];
                        iArr[i10] = 1;
                        iArr[4] = 0;
                    }
                    i24 = i10;
                } else {
                    i16 = i19;
                    int i29 = i24 + 1;
                    iArr[i29] = iArr[i29] + 1;
                    i24 = i29;
                }
                i26++;
                i19 = i16;
                i25 = 1;
            }
            int i30 = i19;
            if (jc.e.b(iArr) && eVar2.c(i23, i20, iArr)) {
                int i31 = iArr[0];
                if (eVar2.c) {
                    i21 = i31;
                    z11 = eVar2.d();
                } else {
                    i21 = i31;
                }
            }
            i23 += i21;
            c10 = c11;
            i22 = i10;
            i19 = i30;
            i24 = 0;
        }
        if (arrayList.size() < i10) {
            throw dc.e.a();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((jc.c) it.next()).d < 2) {
                it.remove();
            }
        }
        Collections.sort(arrayList, jc.e.e);
        jc.c[] cVarArr = new jc.c[3];
        int i32 = 0;
        double d10 = Double.MAX_VALUE;
        for (int i33 = 2; i32 < arrayList.size() - i33; i33 = 2) {
            jc.c cVar8 = (jc.c) arrayList.get(i32);
            float f14 = cVar8.c;
            i32++;
            int i34 = i32;
            while (i34 < arrayList.size() - 1) {
                jc.c cVar9 = (jc.c) arrayList.get(i34);
                double e = jc.e.e(cVar8, cVar9);
                i34++;
                for (int i35 = i34; i35 < arrayList.size(); i35++) {
                    jc.c cVar10 = (jc.c) arrayList.get(i35);
                    if (cVar10.c <= 1.4f * f14) {
                        double e7 = jc.e.e(cVar9, cVar10);
                        double e10 = jc.e.e(cVar8, cVar10);
                        if (e < e7) {
                            if (e7 <= e10) {
                                e10 = e7;
                                e7 = e10;
                            } else if (e >= e10) {
                                d = e10;
                                e10 = e;
                                abs = Math.abs(e7 - (d * 2.0d)) + Math.abs(e7 - (e10 * 2.0d));
                                if (abs >= d10) {
                                    cVarArr[0] = cVar8;
                                    cVarArr[1] = cVar9;
                                    cVarArr[2] = cVar10;
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
            throw dc.e.a();
        }
        float a2 = dc.j.a(cVarArr[0], cVarArr[1]);
        float a10 = dc.j.a(cVarArr[1], cVarArr[2]);
        float a11 = dc.j.a(cVarArr[0], cVarArr[2]);
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
        if (k3.D(cVar2.a, f15, cVar3.b - f16, (cVar2.b - f16) * (cVar3.a - f15)) < 0.0f) {
            jc.c cVar11 = cVar3;
            cVar3 = cVar2;
            cVar2 = cVar11;
        }
        cVarArr[0] = cVar2;
        cVarArr[1] = cVar;
        cVarArr[2] = cVar3;
        float s02 = cVar5.s0(cVar, cVar3);
        float f17 = cVar.a;
        float f18 = cVar3.b;
        float f19 = cVar3.a;
        float s03 = cVar5.s0(cVar, cVar2);
        float f20 = cVar2.b;
        float f21 = cVar2.a;
        float f22 = (s03 + s02) / 2.0f;
        if (f22 < 1.0f) {
            throw dc.e.a();
        }
        float a12 = dc.j.a(cVar, cVar3) / f22;
        int i36 = (int) (a12 + (a12 < 0.0f ? -0.5f : 0.5f));
        float a13 = dc.j.a(cVar, cVar2) / f22;
        int i37 = (((int) (a13 + (a13 >= 0.0f ? 0.5f : -0.5f))) + i36) / 2;
        int i38 = i37 + 7;
        int i39 = i38 & 3;
        if (i39 == 0) {
            i38 = i37 + 8;
        } else if (i39 == 2) {
            i38 = i37 + 6;
        } else if (i39 == 3) {
            i38 = i37 + 5;
        }
        int i40 = i38;
        int[] iArr2 = ic.f.e;
        if (i40 % 4 != 1) {
            throw dc.c.a();
        }
        try {
            ic.f c12 = ic.f.c((i40 - 17) / 4);
            int i41 = (c12.a * 4) + 10;
            if (c12.b.length > 0) {
                float f23 = (f19 - f17) + f21;
                f10 = f19;
                float f24 = (f18 - f16) + f20;
                float f25 = 1.0f - (3.0f / i41);
                int y3 = (int) k3.y(f23, f17, f25, f17);
                int y10 = (int) k3.y(f24, f16, f25, f16);
                f7 = f17;
                for (int i42 = 4; i42 <= 16; i42 <<= 1) {
                    try {
                        aVar = cVar5.z0(f22, i42, y3, y10);
                        break;
                    } catch (dc.e unused) {
                    }
                }
            } else {
                f7 = f17;
                f10 = f19;
            }
            aVar = null;
            float f26 = i40 - 3.5f;
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
            ec.f a14 = ec.f.a(3.5f, 3.5f, f26, 3.5f, f13, f13, 3.5f, f26);
            jc.a aVar3 = aVar;
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
            ec.f a15 = ec.f.a(f28, f29, f30, f31, f11, f27, f32, f33);
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
            if (i40 <= 0 || i40 <= 0) {
                throw dc.e.a();
            }
            ec.b bVar2 = new ec.b(i40, i40);
            int i43 = i40 * 2;
            jc.c cVar12 = cVar;
            float[] fArr = new float[i43];
            int i44 = 0;
            while (i44 < i40) {
                int i45 = i40;
                float f73 = i44 + 0.5f;
                int i46 = 0;
                while (i46 < i43) {
                    int i47 = i46;
                    fArr[i47] = (i47 / 2) + 0.5f;
                    fArr[i47 + 1] = f73;
                    i46 = i47 + 2;
                }
                int i48 = i43 - 1;
                int i49 = i44;
                int i50 = 0;
                while (i50 < i48) {
                    float f74 = fArr[i50];
                    int i51 = i50 + 1;
                    int i52 = i50;
                    float f75 = fArr[i51];
                    jc.c cVar13 = cVar2;
                    float c13 = t8.b.c(f71, f75, f70 * f74, f72);
                    fArr[i52] = (((f59 * f75) + (f58 * f74)) + f60) / c13;
                    fArr[i51] = (((f75 * f65) + (f74 * f64)) + f66) / c13;
                    i50 = i52 + 2;
                    cVar2 = cVar13;
                }
                jc.c cVar14 = cVar2;
                int i53 = m10.b;
                float f76 = f71;
                int i54 = 0;
                boolean z12 = true;
                while (i54 < i48 && z12) {
                    int i55 = (int) fArr[i54];
                    int i56 = i54 + 1;
                    int i57 = i48;
                    int i58 = (int) fArr[i56];
                    int i59 = i54;
                    if (i55 < -1 || i55 > i20 || i58 < -1 || i58 > i53) {
                        throw dc.e.a();
                    }
                    if (i55 == -1) {
                        fArr[i59] = 0.0f;
                    } else if (i55 == i20) {
                        fArr[i59] = i20 - 1;
                    } else {
                        z10 = false;
                        if (i58 != -1) {
                            fArr[i56] = 0.0f;
                        } else if (i58 == i53) {
                            fArr[i56] = i53 - 1;
                        } else {
                            z12 = z10;
                            i54 = i59 + 2;
                            i48 = i57;
                        }
                        z12 = true;
                        i54 = i59 + 2;
                        i48 = i57;
                    }
                    z10 = true;
                    if (i58 != -1) {
                    }
                    z12 = true;
                    i54 = i59 + 2;
                    i48 = i57;
                }
                int i60 = i43 - 2;
                boolean z13 = true;
                while (i60 >= 0 && z13) {
                    int i61 = (int) fArr[i60];
                    int i62 = i60 + 1;
                    int i63 = i60;
                    int i64 = (int) fArr[i62];
                    if (i61 < -1 || i61 > i20 || i64 < -1 || i64 > i53) {
                        throw dc.e.a();
                    }
                    if (i61 == -1) {
                        fArr[i63] = 0.0f;
                    } else if (i61 == i20) {
                        fArr[i63] = i20 - 1;
                    } else {
                        z13 = false;
                        if (i64 != -1) {
                            fArr[i62] = 0.0f;
                        } else if (i64 == i53) {
                            fArr[i62] = i53 - 1;
                        } else {
                            i60 = i63 - 2;
                        }
                        z13 = true;
                        i60 = i63 - 2;
                    }
                    z13 = true;
                    if (i64 != -1) {
                    }
                    z13 = true;
                    i60 = i63 - 2;
                }
                for (int i65 = 0; i65 < i43; i65 += 2) {
                    try {
                        if (m10.b((int) fArr[i65], (int) fArr[i65 + 1])) {
                            int i66 = i65 / 2;
                            int i67 = (i66 / 32) + (bVar2.c * i49);
                            int[] iArr3 = bVar2.d;
                            iArr3[i67] = iArr3[i67] | (1 << (i66 & 31));
                        }
                    } catch (ArrayIndexOutOfBoundsException unused2) {
                        throw dc.e.a();
                    }
                }
                i44 = i49 + 1;
                i40 = i45;
                f71 = f76;
                cVar2 = cVar14;
            }
            jc.c cVar15 = cVar2;
            if (aVar3 == null) {
                i12 = 3;
                i11 = 1;
                jVarArr = new dc.j[]{cVar15, cVar12, cVar3};
            } else {
                i11 = 1;
                i12 = 3;
                jVarArr = new dc.j[]{cVar15, cVar12, cVar3, aVar3};
            }
            dc.j[] jVarArr2 = jVarArr;
            cVar4.getClass();
            c2.b bVar3 = new c2.b();
            int i68 = bVar2.b;
            if (i68 < 21 || (i68 & i12) != i11) {
                throw dc.c.a();
            }
            bVar3.b = bVar2;
            try {
                rVar = cVar4.N(bVar3);
            } catch (dc.a e11) {
                aVar2 = e11;
                e = null;
                try {
                    bVar3.u();
                    bVar3.c = null;
                    bVar3.d = null;
                    bVar3.a = true;
                    bVar3.t();
                    bVar3.s();
                    bVar = (ec.b) bVar3.b;
                    i13 = 0;
                    while (i13 < bVar.a) {
                        int i69 = i13 + 1;
                        for (int i70 = i69; i70 < bVar.b; i70++) {
                            if (bVar.b(i13, i70) != bVar.b(i70, i13)) {
                                bVar.a(i70, i13);
                                bVar.a(i13, i70);
                            }
                        }
                        i13 = i69;
                    }
                    c2.r N = cVar4.N(bVar3);
                    N.h = new rb.b(11);
                    rVar = N;
                    i14 = rVar.a;
                    if (k3.s((rb.b) rVar.h)) {
                        dc.j jVar = jVarArr2[0];
                        jVarArr2[0] = jVarArr2[2];
                        jVarArr2[2] = jVar;
                    }
                    eVar = new androidx.biometric.e((String) rVar.d, jVarArr2);
                    list = (List) rVar.e;
                    if (list != null) {
                    }
                    str = (String) rVar.f;
                    if (str != null) {
                    }
                    if (i14 >= 0) {
                        eVar.t(dc.i.d, Integer.valueOf(i15));
                        eVar.t(dc.i.e, Integer.valueOf(i14));
                    }
                    eVar.t(dc.i.c, (Integer) rVar.g);
                    eVar.t(dc.i.f, "]Q" + rVar.c);
                    return eVar;
                } catch (dc.a | dc.c unused3) {
                    if (e != null) {
                        throw e;
                    }
                    throw aVar2;
                }
            } catch (dc.c e12) {
                e = e12;
                aVar2 = null;
                bVar3.u();
                bVar3.c = null;
                bVar3.d = null;
                bVar3.a = true;
                bVar3.t();
                bVar3.s();
                bVar = (ec.b) bVar3.b;
                i13 = 0;
                while (i13 < bVar.a) {
                }
                c2.r N2 = cVar4.N(bVar3);
                N2.h = new rb.b(11);
                rVar = N2;
                i14 = rVar.a;
                if (k3.s((rb.b) rVar.h)) {
                }
                eVar = new androidx.biometric.e((String) rVar.d, jVarArr2);
                list = (List) rVar.e;
                if (list != null) {
                }
                str = (String) rVar.f;
                if (str != null) {
                }
                if (i14 >= 0) {
                }
                eVar.t(dc.i.c, (Integer) rVar.g);
                eVar.t(dc.i.f, "]Q" + rVar.c);
                return eVar;
            }
            i14 = rVar.a;
            if (k3.s((rb.b) rVar.h) && jVarArr2.length >= 3) {
                dc.j jVar2 = jVarArr2[0];
                jVarArr2[0] = jVarArr2[2];
                jVarArr2[2] = jVar2;
            }
            eVar = new androidx.biometric.e((String) rVar.d, jVarArr2);
            list = (List) rVar.e;
            if (list != null) {
                eVar.t(dc.i.a, list);
            }
            str = (String) rVar.f;
            if (str != null) {
                eVar.t(dc.i.b, str);
            }
            if (i14 >= 0 && (i15 = rVar.b) >= 0) {
                eVar.t(dc.i.d, Integer.valueOf(i15));
                eVar.t(dc.i.e, Integer.valueOf(i14));
            }
            eVar.t(dc.i.c, (Integer) rVar.g);
            eVar.t(dc.i.f, "]Q" + rVar.c);
            return eVar;
        } catch (IllegalArgumentException unused4) {
            throw dc.c.a();
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void o(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        a5.a aVar;
        a5.a aVar2;
        b5.h hVar;
        WebMessageBoundaryInterface webMessageBoundaryInterface = (WebMessageBoundaryInterface) androidx.activity.result.c.a(WebMessageBoundaryInterface.class, invocationHandler);
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        qb.c[] cVarArr = new qb.c[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            InvocationHandler invocationHandler3 = ports[i10];
            qb.c cVar = new qb.c(7);
            cVar.b = (WebMessagePortBoundaryInterface) androidx.activity.result.c.a(WebMessagePortBoundaryInterface.class, invocationHandler3);
            cVarArr[i10] = cVar;
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
                        b5.h hVar2 = (b5.h) jsReplyProxyBoundaryInterface.getOrCreatePeer(new b5.g(jsReplyProxyBoundaryInterface, 0));
                        m5 m5Var = (m5) this.b;
                        switch (m5Var.a) {
                            case 18:
                                y0 y0Var = (y0) m5Var.b;
                                b1 b1Var = y0Var.Q;
                                if (webView != y0Var || b1Var == null) {
                                    return;
                                }
                                if (webView != b1Var.a || aVar2.b != 0) {
                                    b1Var.g("onBotWebMessage ignored: invalid source or payload");
                                    return;
                                }
                                String k10 = b1.k(uri == null ? null : uri.toString());
                                if (b1Var.t0 && (TextUtils.isEmpty(b1Var.F0) || !TextUtils.equals(b1Var.F0, k10) || !TextUtils.equals(b1Var.F0, b1Var.getOriginHost()))) {
                                    b1Var.g("onBotWebMessage ignored: untrusted origin");
                                    return;
                                }
                                n9 f7 = b1Var.f();
                                try {
                                    aVar2.h(0);
                                    String str = (String) aVar2.c;
                                    if (str != null && str.length() <= 1048576) {
                                        JSONObject jSONObject = new JSONObject(str);
                                        String string = jSONObject.getString("eventType");
                                        if (!string.isEmpty() && string.length() <= 128) {
                                            AndroidUtilities.runOnUIThread(new org.telegram.ui.web.a0(b1Var, webView, f7, string, jSONObject.optString("eventData", null), 2));
                                            return;
                                        }
                                        b1Var.g("onBotWebMessage ignored: invalid event type");
                                        return;
                                    }
                                    b1Var.g("onBotWebMessage ignored: invalid payload length");
                                    return;
                                } catch (JSONException e) {
                                    FileLog.e(e);
                                    return;
                                }
                            default:
                                qi.i iVar = (qi.i) m5Var.b;
                                if (webView == iVar.o && z10 && uri != null && iVar.f.equals(uri.toString()) && iVar.h(webView)) {
                                    int i11 = aVar2.b;
                                    if (i11 != 0) {
                                        if (i11 == 1) {
                                            synchronized (iVar.a) {
                                                if (!iVar.u && (hVar = iVar.p) != null && hVar == hVar2) {
                                                    aVar2.h(1);
                                                    byte[] bArr = (byte[]) aVar2.d;
                                                    Objects.requireNonNull(bArr);
                                                    iVar.k.execute(new t8(19, iVar, bArr));
                                                }
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    aVar2.h(0);
                                    String str2 = (String) aVar2.c;
                                    if (iVar.q || str2 == null || !str2.startsWith("tproxy-base64:")) {
                                        iVar.g(str2, hVar2);
                                        return;
                                    }
                                    synchronized (iVar.a) {
                                        if (!iVar.u && iVar.r && iVar.p == hVar2) {
                                            if (str2.length() - 14 > 1398112) {
                                                iVar.f();
                                            } else {
                                                iVar.k.execute(new t8(18, iVar, str2));
                                            }
                                        }
                                    }
                                    return;
                                }
                                return;
                        }
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

    public ea.a q(JSONObject jSONObject) {
        ea.c dVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            dVar = new t7.u(7);
        } else {
            dVar = new oa.d(8);
        }
        return dVar.B0((t7.u) this.b, jSONObject);
    }

    public u0 r(c3.p pVar, q3.g gVar, int i10) {
        e2.x xVar = (e2.x) this.b;
        u0 u0Var = null;
        int i11 = 0;
        loop0: while (true) {
            int i12 = 0;
            do {
                int i13 = i12 % 10;
                int i14 = i13 + 10;
                if (i13 == 0 && i12 != 0) {
                    byte[] bArr = xVar.a;
                    System.arraycopy(bArr, 10, bArr, 0, 9);
                }
                int i15 = i12 == 0 ? 10 : 1;
                try {
                    pVar.a(i14 - i15, i15, xVar.a);
                    xVar.N(i13);
                    xVar.M(i14);
                    if (xVar.a() < 3) {
                        throw new IndexOutOfBoundsException("position=" + xVar.b + ", limit=" + xVar.c);
                    }
                    int D = xVar.D();
                    int i16 = xVar.b - 3;
                    xVar.b = i16;
                    if (D != 4801587) {
                        if (c3.b.h(xVar.i()) != -1) {
                            break loop0;
                        }
                        if (i12 == 0) {
                            xVar.c(20);
                        }
                        i12++;
                    } else {
                        xVar.O(6);
                        int z10 = xVar.z();
                        int i17 = z10 + 10;
                        if (u0Var == null) {
                            byte[] bArr2 = new byte[i17];
                            System.arraycopy(xVar.a, i16, bArr2, 0, 10);
                            pVar.a(10, z10, bArr2);
                            u0Var = new q3.h(gVar).c(i17, bArr2);
                        } else {
                            pVar.l(z10);
                        }
                        i11 += i17;
                    }
                } catch (EOFException unused) {
                }
            } while (i12 <= i10);
        }
        pVar.q();
        pVar.l(i11);
        return u0Var;
    }

    @Override // androidx.lifecycle.a0
    public void v0(Object obj) {
        switch (this.a) {
            case 4:
                q qVar = (q) this.b;
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(R.string.fingerprint_not_recognized));
                    }
                    z zVar = qVar.l0;
                    if (zVar.n) {
                        Executor executor = zVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.o(1);
                        }
                        executor.execute(new androidx.biometric.h(qVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    z zVar2 = qVar.l0;
                    if (zVar2.u == null) {
                        zVar2.u = new androidx.lifecycle.z();
                    }
                    z.h(zVar2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                androidx.lifecycle.t tVar = (androidx.lifecycle.t) obj;
                androidx.fragment.app.o oVar = (androidx.fragment.app.o) this.b;
                if (tVar == null || !oVar.r0) {
                    return;
                }
                oVar.getClass();
                throw new IllegalStateException("Fragment " + oVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public /* synthetic */ h(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public h(Context context) {
        this.a = 0;
        this.b = context.getApplicationContext();
    }

    public h(int i10) {
        this.a = i10;
        switch (i10) {
            case 10:
                this.b = new e2.x(10);
                break;
            case 11:
                break;
            case 13:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 26:
                this.b = new qb.c();
                break;
            case 27:
                this.b = new HashMap();
                break;
            default:
                this.b = new n4.s[ag.b.values().length];
                break;
        }
    }

    public h(LaunchActivity launchActivity, Executor executor, v7.l lVar) {
        this.a = 5;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            androidx.fragment.app.j0 s10 = launchActivity.s();
            z zVar = (z) new androidx.biometric.e(launchActivity).m(z.class);
            this.b = s10;
            zVar.d = executor;
            zVar.e = lVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // mg.o
    public void k0() {
    }

    @Override // mg.o
    public void M(boolean z10) {
    }

    @Override // mg.o
    public void i0(boolean z10) {
    }
}
