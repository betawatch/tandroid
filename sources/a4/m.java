package a4;

import ai.q5;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.c0;
import androidx.fragment.app.g0;
import androidx.lifecycle.a0;
import b2.s0;
import c7.v;
import ci.ac;
import ci.b7;
import ci.d0;
import ci.e0;
import ci.j0;
import ci.j6;
import ci.k8;
import ci.kc;
import ci.mb;
import ci.oc;
import ci.yb;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.x0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.cast.p;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import fb.n;
import g2.u;
import ii.f6;
import ii.i1;
import ii.i2;
import ii.k0;
import ii.k3;
import ii.k4;
import ii.n4;
import ii.q3;
import ii.r3;
import ii.u3;
import ii.v3;
import ii.w3;
import ii.w4;
import ii.x3;
import ii.z;
import j$.util.Objects;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import lg.o;
import m.e2;
import m.p3;
import m.s3;
import n7.m1;
import n7.n1;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.q;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.q20;
import qg.b2;
import r0.i0;
import r0.l1;
import u2.t;
import w7.z8;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class m implements z3.d, a0, androidx.activity.result.b, s, o, oc, OnCompleteListener, yv0, n, r0.n, db.n, k0, v3, e2, y2.g, le.d, l.i, l2.i {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ m() {
        this.a = 19;
    }

    @Override // ci.oc
    public void A(float f7) {
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.s0 = f7;
        k8Var.j = true;
        b7Var.y(true);
    }

    public JSONObject A0() {
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

    @Override // ii.v3
    public void B() {
        ii.e2 e2Var = (ii.e2) this.b;
        e2Var.I0 = e2Var.K0;
        ii.e2.Y(e2Var, false, false);
        e2Var.x0(2, true);
    }

    public db.i B0(Object obj) {
        db.g gVar = ((gb.a0) this.b).b;
        gVar.getClass();
        if (obj == null) {
            return db.k.a;
        }
        Class<?> cls = obj.getClass();
        gb.n nVar = new gb.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    @Override // ci.oc
    public void C(boolean z10) {
        b7 b7Var = (b7) this.b;
        if (b7Var.j()) {
            b7Var.E.getClass();
        }
        b7Var.x(-4, z10);
    }

    @Override // ii.v3
    public void D(ii.a aVar) {
        ii.e2 e2Var = (ii.e2) this.b;
        if (aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(e2Var)) {
            xi xiVar = new xi(e2Var.getParentActivity(), e2Var, false, false, false, e2Var.getResourceProvider());
            xiVar.Z1 = new qb.b(11);
            xiVar.P = true;
            xiVar.x1.setVisibility(8);
            xiVar.t2 = new q5(e2Var, aVar, xiVar, 11);
            xiVar.q1();
            xiVar.show();
        }
    }

    @Override // org.telegram.ui.Components.yv0
    public void E(boolean z10) {
        di.k kVar = (di.k) this.b;
        le.b bVar = kVar.W;
        if (bVar != null) {
            bVar.a(z10, true);
        }
        q20 q20Var = kVar.s;
        if (q20Var != null) {
            q20Var.invalidate();
        }
    }

    @Override // lg.o
    public void F() {
        ((j0) this.b).d.invalidate();
    }

    @Override // z3.d
    public int G() {
        return 1;
    }

    @Override // l2.i
    public long H(long j3, long j10) {
        return 0L;
    }

    @Override // ci.oc
    public void I(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null || (arrayList = k8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((k8) b7Var.d.T.get(i10)).P = f7;
    }

    @Override // ii.k0
    public q9 J() {
        switch (this.a) {
            case 21:
                r3 r3Var = ((z) this.b).O;
                if (r3Var != null) {
                    return r3Var.a.getTextSelectionHelper();
                }
                return null;
            default:
                q3 q3Var = ((w4) this.b).N;
                if (q3Var != null) {
                    return q3Var.a.getTextSelectionHelper();
                }
                return null;
        }
    }

    @Override // ci.oc
    public void L(float f7) {
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.P = f7;
        b7Var.c();
    }

    @Override // l.i
    public boolean M(l.k kVar, MenuItem menuItem) {
        m.k kVar2 = ((ActionMenuView) this.b).P;
        if (kVar2 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((k2.e) kVar2).b).W.d).iterator();
        while (it.hasNext()) {
            if (((c0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // ii.k0
    public void N(CharSequence charSequence) {
        switch (this.a) {
            case 21:
                r3 r3Var = ((z) this.b).O;
                if (r3Var != null) {
                    r3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        r3Var.a.u4(charSequence.toString());
                        break;
                    }
                }
                break;
            default:
                q3 q3Var = ((w4) this.b).N;
                if (q3Var != null) {
                    q3Var.getClass();
                    if (charSequence != null && charSequence.length() > 0) {
                        q3Var.a.u4(charSequence.toString());
                        break;
                    }
                }
                break;
        }
    }

    @Override // ci.oc
    public void O(float f7, boolean z10) {
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.Z = f7;
        k8Var.j = true;
        e81 e81Var = b7Var.e;
        if (e81Var == null || e81Var.p() == -9223372036854775807L) {
            return;
        }
        b7Var.m((long) (f7 * b7Var.e.p()));
    }

    @Override // r0.n
    public l1 Q0(View view, l1 l1Var) {
        boolean z10;
        boolean z11;
        int d = l1Var.d();
        g.s sVar = (g.s) this.b;
        Context context = sVar.e;
        int d10 = l1Var.d();
        ActionBarContextView actionBarContextView = sVar.y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.y.getLayoutParams();
            if (sVar.y.isShown()) {
                if (sVar.l0 == null) {
                    sVar.l0 = new Rect();
                    sVar.m0 = new Rect();
                }
                Rect rect = sVar.l0;
                Rect rect2 = sVar.m0;
                rect.set(l1Var.b(), l1Var.d(), l1Var.c(), l1Var.a());
                ViewGroup viewGroup = sVar.J;
                Method method = s3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e7) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                l1 f7 = i0.f(sVar.J);
                int b10 = f7 == null ? 0 : f7.b();
                int c10 = f7 == null ? 0 : f7.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || sVar.L != null) {
                    View view2 = sVar.L;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            sVar.L.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    sVar.L = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    sVar.J.addView(sVar.L, -1, layoutParams);
                }
                View view4 = sVar.L;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = sVar.L;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? f0.e.c(context, R.color.abc_decor_view_status_guard_light) : f0.e.c(context, R.color.abc_decor_view_status_guard));
                }
                if (!sVar.Q && r9) {
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
                sVar.y.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = sVar.L;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return i0.h(view, d != d10 ? l1Var.f(l1Var.b(), d10, l1Var.c(), l1Var.a()) : l1Var);
    }

    @Override // ii.k0
    public p9 R() {
        switch (this.a) {
            case 21:
                return (z) this.b;
            default:
                return (w4) this.b;
        }
    }

    @Override // ii.k0
    public ii.a T() {
        switch (this.a) {
            case 21:
                return ((z) this.b).a;
            default:
                return ((w4) this.b).a;
        }
    }

    @Override // ci.oc
    public void U(long j3) {
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.r0 = j3;
        k8Var.j = true;
        b7Var.y(true);
    }

    @Override // le.d
    public void V(float f7, int i10) {
        ((le.j) this.b).i(f7);
    }

    @Override // ii.k0
    public boolean W() {
        switch (this.a) {
            case 21:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    if (r3Var.a.T4()) {
                    }
                }
                break;
            default:
                w4 w4Var = (w4) this.b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.a;
                    if (q3Var.a.T4()) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // ci.oc
    public void X(boolean z10) {
        b2 b2Var;
        kc kcVar = ((yb) ((b7) this.b)).C0;
        mb mbVar = kcVar.v1;
        if (mbVar == null) {
            return;
        }
        b2 b2Var2 = null;
        if (!z10 && (mbVar.getSelectedEntity() instanceof b2)) {
            kcVar.v1.D0(null, true);
            return;
        }
        if (!z10 || (kcVar.v1.getSelectedEntity() instanceof b2)) {
            return;
        }
        j6 j6Var = kcVar.v1.R0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= j6Var.getChildCount()) {
                b2Var = null;
                break;
            }
            View childAt = j6Var.getChildAt(i11);
            if (childAt instanceof b2) {
                b2Var = (b2) childAt;
                break;
            }
            i11++;
        }
        if (b2Var != null) {
            mb mbVar2 = kcVar.v1;
            j6 j6Var2 = mbVar2.R0;
            while (true) {
                if (i10 >= j6Var2.getChildCount()) {
                    break;
                }
                View childAt2 = j6Var2.getChildAt(i10);
                if (childAt2 instanceof b2) {
                    b2Var2 = (b2) childAt2;
                    break;
                }
                i10++;
            }
            mbVar2.D0(b2Var2, true);
        }
    }

    @Override // ii.v3
    public void Y() {
        ii.e2 e2Var = (ii.e2) this.b;
        ii.e2.Y(e2Var, false, true);
        int i10 = e2Var.I0;
        e2Var.x0(i10 != 2 ? i10 : 0, true);
    }

    @Override // org.telegram.ui.Components.yv0
    public float Y0() {
        return q.b(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + ((di.k) this.b).Z, 0);
    }

    @Override // ii.k0
    public void Z(int i10, int i11) {
        switch (this.a) {
            case 21:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    i2 i2Var = r3Var.a.Q3;
                    if (i2Var != null) {
                        i2Var.f(i10, i11);
                        break;
                    }
                }
                break;
            default:
                w4 w4Var = (w4) this.b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.a;
                    i2 i2Var2 = q3Var.a.Q3;
                    if (i2Var2 != null) {
                        i2Var2.f(i10, i11);
                        break;
                    }
                }
                break;
        }
    }

    @Override // l2.i
    public long a(long j3) {
        return 0L;
    }

    @Override // le.d
    public void a0(int i10, float f7, float f10, le.e eVar) {
        ((le.j) this.b).i(f7);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 4:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                n1 n1Var = (n1) ((m1) obj).u();
                v vVar = (v) this.b;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(n1Var.b);
                int i10 = n7.j.a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                vVar.writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    n1Var.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            case 18:
                g7.f fVar = (g7.f) this.b;
                h7.f fVar2 = new h7.f(0, (TaskCompletionSource) obj2);
                h7.d dVar = (h7.d) ((h7.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.a;
                obtain3.writeStrongBinder(fVar2);
                q7.a.b(obtain3, fVar);
                q7.a.b(obtain3, gVar);
                ((h7.b) dVar).G0(obtain3, 6);
                return;
            default:
                a6.l lVar = new a6.l((TaskCompletionSource) obj2);
                i7.i iVar = (i7.i) ((i7.c) obj).u();
                x5.e eVar = (x5.e) this.b;
                Parcel K0 = iVar.K0();
                int i12 = i7.f.a;
                K0.writeStrongBinder(lVar);
                i7.f.c(K0, eVar);
                iVar.L0(K0, 1);
                return;
        }
    }

    @Override // ii.k0
    public void b(i1 i1Var) {
        switch (this.a) {
            case 21:
                r3 r3Var = ((z) this.b).O;
                if (r3Var != null) {
                    x3 x3Var = r3Var.a;
                    x3.N1(x3Var, i1Var);
                    x3Var.o3.P(i1Var, true);
                    break;
                }
                break;
            default:
                q3 q3Var = ((w4) this.b).N;
                if (q3Var != null) {
                    x3 x3Var2 = q3Var.a;
                    x3.N1(x3Var2, i1Var);
                    x3Var2.o3.P(i1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // ci.oc
    public void b0(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null || (arrayList = k8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((k8) b7Var.d.T.get(i10)).V = f7;
    }

    @Override // z3.d
    public int c(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // ci.oc
    public void c0(float f7) {
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.F = f7;
        k8Var.j = true;
        b7Var.w(true);
    }

    @Override // ci.oc
    public void d(int i10) {
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

    @Override // m.e2
    public void d0(l.k kVar, l.m mVar) {
        l.e eVar = (l.e) this.b;
        Handler handler = eVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = eVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (kVar == ((l.d) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new p(this, i11 < arrayList.size() ? (l.d) arrayList.get(i11) : null, mVar, kVar, false, 1), kVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // ii.v3
    public void e(w3 w3Var, View view) {
        ii.e2 e2Var = (ii.e2) this.b;
        b80 H = b80.H(e2Var, view);
        H.Q = true;
        e2Var.getParentActivity();
        e2Var.getResourceProvider();
        e2Var.x0 = k4.b(H, e2Var, w3Var, false);
    }

    @Override // l2.i
    public boolean e0() {
        return true;
    }

    @Override // org.telegram.ui.Components.yv0
    public int e1() {
        return ((di.k) this.b).a0;
    }

    @Override // ii.v3
    public boolean f(float f7) {
        boolean z10;
        ii.e2 e2Var = (ii.e2) this.b;
        FrameLayout frameLayout = e2Var.v0;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f7 >= r3[1]) {
                z10 = true;
                ii.e2.Y(e2Var, z10, true);
                return z10;
            }
        }
        z10 = false;
        ii.e2.Y(e2Var, z10, true);
        return z10;
    }

    @Override // ii.v3
    public b80 f0(View view) {
        return b80.H((ii.e2) this.b, view);
    }

    @Override // ii.k0
    public void g() {
        switch (this.a) {
            case 21:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    x3.Q1(r3Var.a, zVar.a);
                    break;
                }
                break;
            default:
                w4 w4Var = (w4) this.b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    x3.Q1(q3Var.a, w4Var.a);
                    break;
                }
                break;
        }
    }

    @Override // ii.k0
    public void g0() {
        switch (this.a) {
            case 21:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    x3 x3Var = r3Var.a;
                    i2 i2Var = x3Var.Q3;
                    if (i2Var != null) {
                        i2Var.g();
                    }
                    x3Var.o3.onContentChanged();
                    break;
                }
                break;
            default:
                w4 w4Var = (w4) this.b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.a;
                    x3 x3Var2 = q3Var.a;
                    i2 i2Var2 = x3Var2.Q3;
                    if (i2Var2 != null) {
                        i2Var2.g();
                    }
                    x3Var2.o3.onContentChanged();
                    break;
                }
                break;
        }
    }

    @Override // ci.oc
    public void h(float f7) {
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.u0 = f7;
        k8Var.j = true;
        b7Var.c();
    }

    @Override // ci.oc
    public void h0(float f7) {
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.E = f7;
        k8Var.j = true;
        b7Var.w(true);
    }

    @Override // ii.v3
    public void i0() {
        ii.e2 e2Var = (ii.e2) this.b;
        e2Var.z0();
        e2Var.C0();
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
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

    @Override // l2.i
    public long j0() {
        return 0L;
    }

    @Override // ci.oc
    public void k(float f7) {
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.G = f7;
        k8Var.j = true;
        b7Var.c();
    }

    @Override // ci.oc
    public void k0(float f7, int i10) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null || (arrayList = k8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((k8) b7Var.d.T.get(i10)).W = f7;
    }

    @Override // ci.oc
    public void l(long j3, boolean z10) {
        b7 b7Var = (b7) this.b;
        if (!z10) {
            b7Var.m(j3);
            return;
        }
        e81 e81Var = b7Var.e;
        if (e81Var != null) {
            e81Var.L(j3, true);
            return;
        }
        if (b7Var.j()) {
            b7Var.E.m(j3, true);
            return;
        }
        e81 e81Var2 = b7Var.y;
        if (e81Var2 != null) {
            e81Var2.L(j3, false);
        }
    }

    @Override // ci.oc
    public void l0(float f7) {
        k8 k8Var = ((b7) this.b).d;
        if (k8Var == null) {
            return;
        }
        k8Var.a0 = f7;
        k8Var.j = true;
    }

    @Override // z3.d
    public long m(int i10) {
        e2.d.b(i10 == 0);
        return 0L;
    }

    @Override // ci.oc
    public void m0() {
        ((b7) this.b).q(null);
    }

    @Override // l2.i
    public long n(long j3, long j10) {
        return 0L;
    }

    @Override // ii.v3
    public void o(f6 f6Var, String str) {
        ii.e2 e2Var = (ii.e2) this.b;
        if (e2Var.z0 == null) {
            e2Var.z0 = new p3(new ei.f(this, 16), e2Var.getResourceProvider());
        }
        e2Var.z0.d(f6Var, str);
    }

    @Override // ii.v3
    public void o0(u3 u3Var, View view) {
        ii.e2 e2Var = (ii.e2) this.b;
        b80 H = b80.H(e2Var, view);
        H.Q = true;
        e2Var.x0 = k4.c(H, e2Var, e2Var.getParentActivity(), e2Var.getResourceProvider(), u3Var, false);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "joinApplication", task);
    }

    @Override // ii.v3
    public void onContentChanged() {
        ii.e2 e2Var = (ii.e2) this.b;
        if (e2Var.y0 != null) {
            boolean n32 = e2Var.P.n3();
            e2Var.L0 = n32;
            e2Var.y0.h(n32);
            e2Var.y0.invalidate();
        }
        e2Var.C0();
        Runnable runnable = e2Var.M0;
        AndroidUtilities.cancelRunOnUIThread(runnable);
        AndroidUtilities.runOnUIThread(runnable, 1000L);
    }

    @Override // l2.i
    public long p(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // l2.i
    public long p0(long j3) {
        return 1L;
    }

    @Override // fb.n
    public Object p2() {
        Class cls = (Class) this.b;
        try {
            return fb.s.a.a(cls);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e7);
        }
    }

    @Override // l2.i
    public m2.j q(long j3) {
        return (m2.j) this.b;
    }

    @Override // l2.i
    public long q0(long j3, long j10) {
        return 1L;
    }

    @Override // ii.v3
    public void r(int i10) {
        ((ii.e2) this.b).o0(74, i10);
    }

    @Override // ci.oc
    public void s() {
        b7 b7Var = (b7) this.b;
        b7Var.s(null, null, true);
        kc kcVar = ((yb) b7Var).C0;
        yb ybVar = kcVar.X0;
        if (ybVar != null) {
            ybVar.s(null, null, true);
        }
        mb mbVar = kcVar.v1;
        if (mbVar != null) {
            mbVar.q0();
        }
        ac acVar = kcVar.c1;
        if (acVar != null) {
            acVar.setHasRoundVideo(false);
        }
        k8 k8Var = kcVar.K1;
        if (k8Var != null) {
            File file = k8Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                kcVar.K1.o0 = null;
            }
            if (kcVar.K1.p0 != null) {
                try {
                    new File(kcVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                kcVar.K1.p0 = null;
            }
        }
    }

    @Override // ci.oc
    public void s0(float f7) {
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.t0 = f7;
        k8Var.j = true;
        b7Var.y(true);
    }

    @Override // ii.v3
    public void t() {
        ii.e2 e2Var = (ii.e2) this.b;
        k3 k3Var = e2Var.P.u3;
        e2Var.x0((k3Var != null && k3Var.y() && e2Var.P.D4()) ? 1 : 0, true);
        e2Var.y0();
        e2Var.w0();
    }

    @Override // ci.oc
    public void t0(int i10, long j3) {
        ArrayList arrayList;
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null || (arrayList = k8Var.T) == null || i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ((k8) b7Var.d.T.get(i10)).X = j3;
    }

    @Override // m.e2
    public void u(l.k kVar, MenuItem menuItem) {
        ((l.e) this.b).f.removeCallbacksAndMessages(kVar);
    }

    @Override // ci.oc
    public void u0(long j3) {
        b7 b7Var = (b7) this.b;
        k8 k8Var = b7Var.d;
        if (k8Var == null) {
            return;
        }
        k8Var.D = j3;
        k8Var.j = true;
        b7Var.w(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k4.d v(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.b;
        long j12 = oVar.a;
        Uri uri = oVar.d.c;
        t tVar = new t(j10);
        int i11 = oVar.c;
        hVar.m.getClass();
        if (!(iOException instanceof s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof u) && !(iOException instanceof y2.k)) {
            int i12 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            k4.d dVar = j11 != -9223372036854775807L ? y2.l.f : new k4.d(0, j11, false);
            hVar.q.r(tVar, i11, iOException, !dVar.a());
            return dVar;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        hVar.q.r(tVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override // ii.k0
    public void v0() {
        switch (this.a) {
            case 21:
                z zVar = (z) this.b;
                r3 r3Var = zVar.O;
                if (r3Var != null) {
                    ii.a aVar = zVar.a;
                    x3.P1(r3Var.a);
                    break;
                }
                break;
            default:
                w4 w4Var = (w4) this.b;
                q3 q3Var = w4Var.N;
                if (q3Var != null) {
                    ii.a aVar2 = w4Var.a;
                    x3.P1(q3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // l.i
    public void w(l.k kVar) {
        n4 n4Var = ((ActionMenuView) this.b).K;
        if (n4Var != null) {
            n4Var.w(kVar);
        }
    }

    @Override // androidx.lifecycle.a0
    public void w0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.p pVar = (androidx.biometric.p) this.b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.l0.d(null);
        }
    }

    @Override // y2.g
    public void x(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.b;
        if (i10 == 0) {
            long j11 = oVar.a;
            tVar = new t(oVar.b);
        } else {
            long j12 = oVar.a;
            Uri uri = oVar.d.c;
            tVar = new t(j10);
        }
        hVar.q.s(tVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // y2.g
    public void x0(y2.i iVar, long j3, long j10, boolean z10) {
        ((l2.h) this.b).w((y2.o) iVar, j10);
    }

    @Override // y2.g
    public void y(y2.i iVar, long j3, long j10) {
        int i10;
        long j11;
        y2.o oVar = (y2.o) iVar;
        l2.h hVar = (l2.h) this.b;
        long j12 = oVar.a;
        Uri uri = oVar.d.c;
        t tVar = new t(j10);
        hVar.m.getClass();
        hVar.q.p(tVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f;
        m2.c cVar2 = hVar.H;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i11 = 0;
        while (i11 < size && hVar.H.b(i11).b < j13) {
            i11++;
        }
        if (cVar.d) {
            if (size - i11 > cVar.m.size()) {
                e2.a.n("DashMediaSource", "Loaded out of sync manifest");
            } else {
                j11 = -9223372036854775807L;
                long j14 = hVar.N;
                if (j14 != -9223372036854775807L) {
                    i10 = i11;
                    if (cVar.h * 1000 <= j14) {
                        e2.a.n("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.N);
                    }
                } else {
                    i10 = i11;
                }
                hVar.M = 0;
            }
            int i12 = hVar.M;
            hVar.M = i12 + 1;
            if (i12 < hVar.m.L3(oVar.c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.M - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                hVar.C = new b5();
                return;
            }
        }
        i10 = i11;
        j11 = -9223372036854775807L;
        hVar.H = cVar;
        hVar.I = cVar.d & hVar.I;
        hVar.J = j3 - j10;
        hVar.K = j3;
        hVar.O += i10;
        synchronized (hVar.t) {
            try {
                if (oVar.b.a.equals(hVar.F)) {
                    Uri uri2 = hVar.H.k;
                    if (uri2 == null) {
                        uri2 = z8.a(oVar.d.c);
                    }
                    hVar.F = uri2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.H;
        if (!cVar3.d || hVar.L != j11) {
            hVar.y(true);
            return;
        }
        lf.g gVar = cVar3.i;
        if (gVar == null) {
            hVar.v();
            return;
        }
        String str = gVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.L = e2.d0.T(gVar.c) - hVar.K;
                hVar.y(true);
                return;
            } catch (s0 e7) {
                hVar.x(e7);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            hVar.z(gVar, new l2.f());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            hVar.z(gVar, new ob.a(12));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.v();
        } else {
            hVar.x(new IOException("Unsupported UTC timing scheme"));
        }
    }

    public c6.o y0() {
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

    @Override // z3.d
    public List z(long j3) {
        return j3 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    public boolean z0() {
        x0 x0Var = ((com.google.android.gms.common.api.internal.j0) this.b).d;
        return x0Var != null && x0Var.b();
    }

    public /* synthetic */ m(a6.i iVar) {
        this.a = 6;
        this.b = (r) iVar.b;
    }

    public /* synthetic */ m(com.google.android.gms.common.api.j jVar, o6.a aVar, int i10) {
        this.a = i10;
        this.b = aVar;
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

    @Override // ii.v3
    public void K() {
    }

    @Override // lg.o
    public void r0() {
    }

    @Override // ii.v3
    public void Q(int i10) {
    }

    @Override // lg.o
    public void S(boolean z10) {
    }

    @Override // lg.o
    public void n0(boolean z10) {
    }

    @Override // ii.v3
    public void P(i1 i1Var, boolean z10) {
    }

    @Override // l2.i
    public long i(long j3, long j10) {
        return j10;
    }
}
