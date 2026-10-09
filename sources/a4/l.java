package a4;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Parcel;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.p;
import androidx.lifecycle.a0;
import c6.o;
import ci.b7;
import ci.g0;
import ci.i0;
import ci.rc;
import ci.z6;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.z4;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.d0;
import e2.v;
import ei.w4;
import fb.n;
import gg.a2;
import ii.a1;
import ii.c3;
import ii.g5;
import ii.h1;
import ii.i1;
import ii.i2;
import ii.i5;
import ii.p2;
import ii.s3;
import ii.x3;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.regex.Pattern;
import l.w;
import m.t3;
import n7.l1;
import n7.m1;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.k81;
import r0.b0;
import r0.k1;
import v7.k8;
import z3.m;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class l implements z3.d, a0, androidx.activity.result.b, s, lg.e, h81, k0, v0, OnCompleteListener, n, r0.n, db.n, a2, m, ii.k0, h1, y2.m, w {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ l(a6.i iVar) {
        this.a = 6;
        this.b = (r) iVar.b;
    }

    @Override // ii.k0
    public void A(CharSequence charSequence) {
        s3 s3Var = ((a1) this.b).S;
        if (s3Var != null) {
            s3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            s3Var.a.u4(charSequence.toString());
        }
    }

    @Override // ii.k0
    public n9 C() {
        return (a1) this.b;
    }

    @Override // ii.k0
    public ii.a F() {
        return ((a1) this.b).a;
    }

    @Override // ii.k0
    public boolean G() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var == null) {
            return false;
        }
        ii.a aVar = a1Var.a;
        return s3Var.a.T4();
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void H() {
        m0 m0Var = (m0) this.b;
        Iterator it = m0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.o.F = Collections.EMPTY_SET;
    }

    @Override // ii.k0
    public void I(int i10, int i11) {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.a;
            i2 i2Var = s3Var.a.H3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    @Override // lg.e
    public void I0() {
        ((i0) this.b).f.k();
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public boolean J() {
        return true;
    }

    @Override // lg.e
    public void K() {
        ((i0) this.b).f.o();
    }

    @Override // lg.e
    public void K0(float f7) {
        ((i0) this.b).f.setRotation(f7);
    }

    @Override // ii.h1
    public void L(Editable editable) {
        ((i5) this.b).h();
    }

    @Override // ii.k0
    public void M() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.a;
            x3 x3Var = s3Var.a;
            i2 i2Var = x3Var.H3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f3.onContentChanged();
        }
    }

    @Override // r0.n
    public k1 M0(View view, k1 k1Var) {
        boolean z10;
        boolean z11;
        int d = k1Var.d();
        g.r rVar = (g.r) this.b;
        Context context = rVar.e;
        int d10 = k1Var.d();
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
                rect.set(k1Var.b(), k1Var.d(), k1Var.c(), k1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = t3.a;
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
                ViewGroup viewGroup2 = rVar.J;
                WeakHashMap weakHashMap = r0.i0.a;
                k1 a2 = b0.a(viewGroup2);
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
        return r0.i0.g(view, d != d10 ? k1Var.f(k1Var.b(), d10, k1Var.c(), k1Var.a()) : k1Var);
    }

    @Override // ii.h1
    public /* synthetic */ boolean N(boolean z10) {
        return false;
    }

    @Override // z3.m
    public int O() {
        return 2;
    }

    @Override // z3.m
    public void P(byte[] bArr, int i10, int i11, z3.l lVar, e2.h hVar) {
        d2.b a2;
        v vVar = (v) this.b;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        ArrayList arrayList = new ArrayList();
        while (vVar.a() > 0) {
            e2.d.a("Incomplete Mp4Webvtt Top Level box header found.", vVar.a() >= 8);
            int j3 = vVar.j();
            if (vVar.j() == 1987343459) {
                int i12 = j3 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    e2.d.a("Incomplete vtt cue box header found.", i12 >= 8);
                    int j10 = vVar.j();
                    int j11 = vVar.j();
                    int i13 = j10 - 8;
                    byte[] bArr2 = vVar.a;
                    int i14 = vVar.b;
                    String str = d0.a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    vVar.K(i13);
                    i12 = (i12 - 8) - i13;
                    if (j11 == 1937011815) {
                        i4.g gVar = new i4.g();
                        i4.h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (j11 == 1885436268) {
                        charSequence = i4.h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.a = charSequence;
                    aVar.b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = i4.h.a;
                    i4.g gVar2 = new i4.g();
                    gVar2.c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                vVar.K(j3 - 8);
            }
        }
        hVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // ii.k0
    public void Q() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            ii.a aVar = a1Var.a;
            x3.P1(s3Var.a);
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public com.google.android.gms.common.api.internal.e R(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public o S() {
        o oVar = (o) this.b;
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

    public String T(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            ka.d dVar = (ka.d) this.b;
            ka.e eVar = new ka.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public da.b U(JSONObject jSONObject) {
        da.d aVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            aVar = new na.d(7);
        } else {
            aVar = new ob.a(7);
        }
        return aVar.D((rb.a) this.b, jSONObject);
    }

    @Override // gg.a2
    public /* synthetic */ a0.i V() {
        return null;
    }

    public db.i W(Object obj) {
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

    @Override // androidx.lifecycle.a0
    public void X(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        p pVar = (p) this.b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.l0.d(null);
        }
    }

    @Override // y2.m
    public void a() {
        l2.h hVar = (l2.h) this.b;
        hVar.A.a();
        z4 z4Var = hVar.C;
        if (z4Var != null) {
            throw z4Var;
        }
    }

    @Override // lg.e
    public void a0() {
        ((i0) this.b).f.a.g(1, true);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        int i10 = this.a;
        Object obj3 = this.b;
        switch (i10) {
            case 4:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                m1 m1Var = (m1) ((l1) obj).u();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(m1Var.b);
                int i11 = n7.j.a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                ((c7.v) obj3).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    m1Var.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
            default:
                h7.f fVar = new h7.f(0, (TaskCompletionSource) obj2);
                h7.d dVar = (h7.d) ((h7.e) obj).u();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i12 = q7.a.a;
                obtain3.writeStrongBinder(fVar);
                q7.a.b(obtain3, (g7.f) obj3);
                q7.a.b(obtain3, gVar);
                ((h7.b) dVar).F0(obtain3, 6);
                return;
        }
    }

    @Override // ii.k0, ii.h1
    public void c(i1 i1Var) {
        switch (this.a) {
            case 22:
                s3 s3Var = ((a1) this.b).S;
                if (s3Var != null) {
                    x3 x3Var = s3Var.a;
                    x3.N1(x3Var, i1Var);
                    x3Var.f3.r(i1Var, true);
                    break;
                }
                break;
            default:
                g5 g5Var = ((i5) this.b).s;
                if (g5Var != null) {
                    x3 x3Var2 = ((c3) g5Var).a;
                    x3.N1(x3Var2, i1Var);
                    x3Var2.f3.r(i1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // l.w
    public void d(l.k kVar, boolean z10) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).z.k().c(false);
        }
        w wVar = ((m.h) this.b).e;
        if (wVar != null) {
            wVar.d(kVar, z10);
        }
    }

    @Override // gg.a2
    public /* synthetic */ a0.i d0() {
        return null;
    }

    @Override // z3.d
    public int e(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // ii.h1
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // ii.k0
    public void g() {
        a1 a1Var = (a1) this.b;
        s3 s3Var = a1Var.S;
        if (s3Var != null) {
            x3.Q1(s3Var.a, a1Var.a);
        }
    }

    @Override // gg.a2
    public void h(int i10) {
        AndroidUtilities.runOnUIThread(new rc(this, 21));
    }

    @Override // lg.e
    public boolean i0() {
        i0 i0Var = (i0) this.b;
        g0 g0Var = i0Var.f;
        boolean m10 = g0Var.m(-90.0f);
        g0Var.i();
        i0Var.d.invalidate();
        return m10;
    }

    @Override // androidx.activity.result.b
    public void j(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.k0 k0Var = (androidx.fragment.app.k0) this.b;
        androidx.fragment.app.g0 g0Var = (androidx.fragment.app.g0) k0Var.F.pollLast();
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

    @Override // ii.h1
    public void k(i1 i1Var) {
        ii.a aVar;
        i5 i5Var = (i5) this.b;
        g5 g5Var = i5Var.s;
        if (g5Var == null || (aVar = i5Var.a) == null) {
            return;
        }
        x3 x3Var = ((c3) g5Var).a;
        ArrayList arrayList = x3Var.j3;
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
        i2 i2Var = x3Var.H3;
        if (i2Var != null) {
            i2Var.d();
        }
        ii.a aVar2 = new ii.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a1.g.y(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        x3Var.t4();
        x3Var.W2.N(false);
        i2 i2Var2 = x3Var.H3;
        if (i2Var2 != null) {
            i2Var2.h();
        }
        x3Var.post(new p2(x3Var, aVar2, 26));
    }

    @Override // z3.d
    public long l(int i10) {
        e2.d.b(i10 == 0);
        return 0L;
    }

    @Override // ii.h1
    public /* synthetic */ boolean m(i1 i1Var) {
        return false;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void n() {
        m0 m0Var = (m0) this.b;
        m0Var.a.lock();
        try {
            m0Var.m = new com.google.android.gms.common.api.internal.g0(m0Var, m0Var.j, m0Var.k, m0Var.d, m0Var.l, m0Var.a, m0Var.c);
            m0Var.m.H();
            m0Var.b.signalAll();
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void o(k6.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "launchApplication", task);
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public void onStateChanged(boolean z10, int i10) {
        b7 b7Var = (b7) this.b;
        z6 z6Var = b7Var.L;
        AndroidUtilities.cancelRunOnUIThread(z6Var);
        k81 k81Var = b7Var.y;
        if (k81Var == null || !k81Var.y()) {
            return;
        }
        AndroidUtilities.runOnUIThread(z6Var);
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.h81
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((b7) this.b).i();
    }

    @Override // z3.d
    public List p(long j3) {
        return j3 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // lg.e
    public boolean q() {
        i0 i0Var = (i0) this.b;
        i0Var.d.invalidate();
        return i0Var.f.j();
    }

    @Override // ii.h1
    public /* synthetic */ boolean r(i1 i1Var) {
        return false;
    }

    @Override // z3.m
    public /* synthetic */ z3.d s(int i10, int i11, byte[] bArr) {
        return sc.v.a(this, bArr, i11);
    }

    @Override // gg.a2
    public /* synthetic */ boolean s0(int i10) {
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void u(int i10) {
        x xVar = (x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (xVar.n) {
                xVar.n = false;
                x.k(xVar, i10);
            } else {
                xVar.n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // l.w
    public boolean v(l.k kVar) {
        m.h hVar = (m.h) this.b;
        if (kVar == hVar.c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        w wVar = hVar.e;
        if (wVar != null) {
            return wVar.v(kVar);
        }
        return false;
    }

    @Override // fb.n
    public Object v2() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e7) {
            k8 k8Var = ib.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    @Override // z3.d
    public int w() {
        return 1;
    }

    @Override // ii.h1
    public void x(i1 i1Var, int i10, int i11) {
        g5 g5Var;
        o9 textSelectionHelper;
        i5 i5Var = (i5) this.b;
        if (i5Var.w || i10 == i11 || (g5Var = i5Var.s) == null || (textSelectionHelper = ((c3) g5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        i1Var.post(new w4(this, i1Var, i11, textSelectionHelper, i10, 3));
    }

    @Override // ii.k0
    public o9 y() {
        s3 s3Var = ((a1) this.b).S;
        if (s3Var == null) {
            return null;
        }
        return s3Var.a.getTextSelectionHelper();
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void z(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = k6.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // org.telegram.ui.Components.h81
    public void onRenderedFirstFrame() {
    }

    public /* synthetic */ l(b7.a aVar, c7.v vVar) {
        this.a = 4;
        this.b = vVar;
    }

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public l(MediaInfo mediaInfo) {
        this.a = 7;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public l(JSONObject jSONObject) {
        this.a = 7;
        this.b = new o(jSONObject);
    }

    public l() {
        this.a = 21;
        this.b = new v();
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    @Override // ii.h1
    public /* synthetic */ void t() {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void D(int i10) {
    }

    @Override // ii.h1
    public /* synthetic */ void E(CharSequence charSequence) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void b(Bundle bundle) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.h81
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // gg.a2
    public /* synthetic */ void x0(ArrayList arrayList) {
    }

    @Override // ii.h1
    public /* synthetic */ void i(int i10, int i11) {
    }

    @Override // org.telegram.ui.Components.h81
    public void onError(k81 k81Var, Exception exc) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void B(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override // org.telegram.ui.Components.h81
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }
}
