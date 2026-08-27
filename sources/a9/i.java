package a9;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.fragment.app.k0;
import androidx.fragment.app.v;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.upstream.e0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.p0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.internal.cast.x4;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d5.g0;
import f2.t1;
import f2.x0;
import f2.y0;
import g7.g5;
import j4.d1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import jh.e9;
import jh.f9;
import jh.g4;
import jh.l3;
import lh.m6;
import lh.q6;
import m.f2;
import m.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.iz0;
import org.telegram.ui.oy0;
import r0.j0;
import r0.m1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class i implements a0, androidx.activity.result.b, com.google.android.gms.common.api.internal.o, v0, y2.b, t1, r0.o, s, OnCompleteListener, d1, e9, f2, x90, j61, l.j, l0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(int i10, boolean z10) {
        this.a = i10;
    }

    public static com.google.android.gms.common.api.internal.p N(Looper looper, Object obj, String str) {
        y5.l.i(obj, "Listener must not be null");
        y5.l.i(looper, "Looper must not be null");
        return new com.google.android.gms.common.api.internal.p(looper, obj, str);
    }

    @Override // f2.t1
    public View A(int i10) {
        return ((x0) this.b).q(i10);
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void C(v5.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // j4.d1
    public long D() {
        long j10 = Long.MAX_VALUE;
        for (d1 d1Var : (d1[]) this.b) {
            long D = d1Var.D();
            if (D != Long.MIN_VALUE) {
                j10 = Math.min(j10, D);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // f2.t1
    public int G(View view) {
        return x0.v(view) + ((ViewGroup.MarginLayoutParams) ((y0) view.getLayoutParams())).bottomMargin;
    }

    @Override // org.telegram.ui.Components.x90
    public void H(int i10, int i11, CharSequence charSequence, boolean z10) {
        lh.g gVar = ((lh.m) this.b).f;
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
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override // j4.d1
    public void I(long j10) {
        for (d1 d1Var : (d1[]) this.b) {
            d1Var.I(j10);
        }
    }

    @Override // r0.o
    public m1 I0(View view, m1 m1Var) {
        boolean z10;
        boolean z11;
        int d = m1Var.d();
        g.r rVar = (g.r) this.b;
        Context context = rVar.e;
        int d10 = m1Var.d();
        ActionBarContextView actionBarContextView = rVar.y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.y.getLayoutParams();
            if (rVar.y.isShown()) {
                if (rVar.h0 == null) {
                    rVar.h0 = new Rect();
                    rVar.i0 = new Rect();
                }
                Rect rect = rVar.h0;
                Rect rect2 = rVar.i0;
                rect.set(m1Var.b(), m1Var.d(), m1Var.c(), m1Var.a());
                ViewGroup viewGroup = rVar.F;
                Method method = w3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e9) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e9);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                m1 f10 = j0.f(rVar.F);
                int b10 = f10 == null ? 0 : f10.b();
                int c10 = f10 == null ? 0 : f10.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z11 = true;
                }
                if (i10 <= 0 || rVar.H != null) {
                    View view2 = rVar.H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            rVar.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    rVar.H = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    rVar.F.addView(rVar.H, -1, layoutParams);
                }
                View view4 = rVar.H;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = rVar.H;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? f0.e.c(context, R.color.abc_decor_view_status_guard_light) : f0.e.c(context, R.color.abc_decor_view_status_guard));
                }
                if (!rVar.M && r9) {
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
        View view6 = rVar.H;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return j0.h(view, d != d10 ? m1Var.f(m1Var.b(), d10, m1Var.c(), m1Var.a()) : m1Var);
    }

    @Override // androidx.lifecycle.a0
    public void J(Object obj) {
        switch (this.a) {
            case 2:
                androidx.biometric.p pVar = (androidx.biometric.p) this.b;
                if (((Boolean) obj).booleanValue()) {
                    if (pVar.R()) {
                        pVar.W(pVar.q(R.string.fingerprint_not_recognized));
                    }
                    y yVar = pVar.h0;
                    if (yVar.n) {
                        Executor executor = yVar.d;
                        if (executor == null) {
                            executor = new androidx.biometric.n(1);
                        }
                        executor.execute(new androidx.biometric.g(pVar, 0));
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    y yVar2 = pVar.h0;
                    if (yVar2.u == null) {
                        yVar2.u = new z();
                    }
                    y.h(yVar2.u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                androidx.fragment.app.p pVar2 = (androidx.fragment.app.p) this.b;
                if (tVar == null || !pVar2.n0) {
                    return;
                }
                pVar2.getClass();
                throw new IllegalStateException("Fragment " + pVar2 + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    public void L(u5.k kVar, u uVar) {
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
        androidx.biometric.p pVar = (androidx.biometric.p) k0Var2.D("androidx.biometric.BiometricFragment");
        if (pVar == null) {
            pVar = new androidx.biometric.p();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
            aVar.f(0, pVar, "androidx.biometric.BiometricFragment");
            aVar.e(true, true);
            k0Var2.A(true);
            k0Var2.E();
        }
        v k10 = pVar.k();
        if (k10 == null) {
            Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
            return;
        }
        y yVar = pVar.h0;
        yVar.f = kVar;
        int i10 = kVar.a;
        if (i10 == 0) {
            i10 = uVar != null ? 15 : 255;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 23 || i11 >= 30 || i10 != 15 || uVar != null) {
            yVar.g = uVar;
        } else {
            yVar.g = g7.m.a();
        }
        if (pVar.Q()) {
            pVar.h0.k = pVar.q(R.string.confirm_device_credential_password);
        } else {
            pVar.h0.k = null;
        }
        if (pVar.Q() && new a5.n(new androidx.biometric.s(k10, 0)).g(255) != 0) {
            pVar.h0.n = true;
            pVar.S();
        } else if (pVar.h0.p) {
            pVar.g0.postDelayed(new androidx.biometric.o(pVar), 600L);
        } else {
            pVar.X();
        }
    }

    public c2.u M() {
        if (((ArrayList) this.b) == null) {
            return c2.u.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", (ArrayList) this.b);
        return new c2.u(bundle, (ArrayList) this.b);
    }

    public void O(c2.q qVar, c2.n nVar, Collection collection) {
        c2.e eVar = (c2.e) this.b;
        if (qVar != eVar.y || nVar == null) {
            if (qVar == eVar.e) {
                if (nVar != null) {
                    eVar.n(eVar.d, nVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        c2.y yVar = eVar.x.a;
        String d = nVar.d();
        c2.z zVar = new c2.z(yVar, d, eVar.b(yVar, d), false);
        zVar.i(nVar);
        if (eVar.d == zVar) {
            return;
        }
        eVar.h(eVar, zVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    public void P(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override // androidx.activity.result.b
    public void a(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = f0Var.a;
        int i10 = f0Var.b;
        androidx.fragment.app.s q6 = j0Var.c.q(str);
        if (q6 != null) {
            q6.x(i10, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 17:
                g8.e eVar = (g8.e) this.b;
                p7.b bVar = (p7.b) obj;
                bVar.getClass();
                p7.a aVar = new p7.a(1, (TaskCompletionSource) obj2);
                try {
                    p7.i iVar = (p7.i) bVar.u();
                    Bundle G = bVar.G();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
                    int i10 = p7.c.a;
                    obtain.writeInt(1);
                    eVar.writeToParcel(obtain, 0);
                    obtain.writeInt(1);
                    G.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(aVar);
                    try {
                        iVar.a.transact(14, obtain, null, 1);
                        obtain.recycle();
                        return;
                    } catch (Throwable th) {
                        obtain.recycle();
                        throw th;
                    }
                } catch (RemoteException e9) {
                    Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e9);
                    Bundle bundle = Bundle.EMPTY;
                    g5.a(Status.h, Boolean.FALSE, aVar.b);
                    return;
                }
            default:
                w7.a aVar2 = (w7.a) this.b;
                l7.d dVar = new l7.d(0, (TaskCompletionSource) obj2);
                l7.c cVar = (l7.c) ((l7.f) obj).u();
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i11 = l7.a.a;
                obtain2.writeStrongBinder(dVar);
                obtain2.writeInt(1);
                aVar2.writeToParcel(obtain2, 0);
                cVar.E0(obtain2, 2);
                return;
        }
    }

    @Override // j4.d1
    public boolean b() {
        for (d1 d1Var : (d1[]) this.b) {
            if (d1Var.b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void d(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        m4.g gVar = (m4.g) this.b;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        j4.p pVar = new j4.p();
        gVar.n.getClass();
        gVar.q.d(pVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // f2.t1
    public int f(View view) {
        return x0.z(view) - ((ViewGroup.MarginLayoutParams) ((y0) view.getLayoutParams())).topMargin;
    }

    @Override // j4.d1
    public long g() {
        long j10 = Long.MAX_VALUE;
        for (d1 d1Var : (d1[]) this.b) {
            long g10 = d1Var.g();
            if (g10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, g10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    @Override // jh.e9
    public void g1(long j10, int i10, l3 l3Var) {
        oy0 oy0Var = (oy0) this.b;
        int i11 = ProfileStoriesView.o0;
        oy0Var.f(true, false);
        l3Var.run();
    }

    @Override // oc.a
    public Object get() {
        return new d3.j((Context) ((oc.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(d3.j.d).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    @Override // com.google.android.exoplayer2.upstream.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.android.exoplayer2.upstream.k0 h(n0 n0Var, IOException iOException, int i10) {
        long j10;
        t0 t0Var = (t0) n0Var;
        m4.g gVar = (m4.g) this.b;
        long j11 = t0Var.a;
        Uri uri = t0Var.d.c;
        j4.p pVar = new j4.p();
        int i11 = t0Var.c;
        gVar.n.getClass();
        if (!(iOException instanceof h3.t1) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof e0) && !(iOException instanceof p0)) {
            int i12 = com.google.android.exoplayer2.upstream.n.b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof com.google.android.exoplayer2.upstream.n) || ((com.google.android.exoplayer2.upstream.n) th).a != 2008) {
                }
            }
            j10 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            com.google.android.exoplayer2.upstream.k0 k0Var = j10 != -9223372036854775807L ? q0.f : new com.google.android.exoplayer2.upstream.k0(0, j10, false);
            gVar.q.i(pVar, i11, iOException, !k0Var.a());
            return k0Var;
        }
        j10 = -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
        }
        gVar.q.i(pVar, i11, iOException, !k0Var.a());
        return k0Var;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void i(Object obj) {
        ((r7.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    @Override // m.f2
    public void j(l.l lVar, MenuItem menuItem) {
        ((l.f) this.b).f.removeCallbacksAndMessages(lVar);
    }

    @Override // l.j
    public void k(l.l lVar) {
        k5.i iVar = ((ActionMenuView) this.b).G;
        if (iVar != null) {
            iVar.k(lVar);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public void l(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        m4.g gVar = (m4.g) this.b;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        j4.p pVar = new j4.p();
        gVar.n.getClass();
        gVar.q.f(pVar, t0Var.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        n4.c cVar = (n4.c) t0Var.f;
        n4.c cVar2 = gVar.H;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j13 = cVar.b(0).b;
        int i10 = 0;
        while (i10 < size && gVar.H.b(i10).b < j13) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.m.size()) {
                d5.a.K("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j14 = gVar.N;
                if (j14 == -9223372036854775807L || cVar.h * 1000 > j14) {
                    gVar.M = 0;
                } else {
                    d5.a.K("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + gVar.N);
                }
            }
            int i11 = gVar.M;
            gVar.M = i11 + 1;
            if (i11 < gVar.n.z3(t0Var.c)) {
                gVar.D.postDelayed(gVar.v, Math.min((gVar.M - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000));
                return;
            } else {
                gVar.C = new x4();
                return;
            }
        }
        gVar.H = cVar;
        gVar.I = cVar.d & gVar.I;
        gVar.J = j10 - j11;
        gVar.K = j10;
        synchronized (gVar.t) {
            try {
                if (t0Var.b.a == gVar.F) {
                    Uri uri2 = gVar.H.k;
                    if (uri2 == null) {
                        uri2 = t0Var.d.c;
                    }
                    gVar.F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size != 0) {
            gVar.O += i10;
            gVar.u(true);
            return;
        }
        n4.c cVar3 = gVar.H;
        if (!cVar3.d) {
            gVar.u(true);
            return;
        }
        c9.b bVar = cVar3.i;
        if (bVar == null) {
            gVar.t();
            return;
        }
        String str = bVar.b;
        if (g0.a(str, "urn:mpeg:dash:utc:direct:2014") || g0.a(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                gVar.L = g0.K(bVar.c) - gVar.K;
                gVar.u(true);
                return;
            } catch (h3.t1 e9) {
                d5.a.p("DashMediaSource", "Failed to resolve time offset.", e9);
                gVar.u(true);
                return;
            }
        }
        if (g0.a(str, "urn:mpeg:dash:utc:http-iso:2014") || g0.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            t0 t0Var2 = new t0(gVar.z, Uri.parse(bVar.c), 5, new m4.f());
            gVar.A.f(t0Var2, new m4.d(gVar), 1);
            gVar.q.k(new j4.p(t0Var2.b), t0Var2.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (g0.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") || g0.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            t0 t0Var3 = new t0(gVar.z, Uri.parse(bVar.c), 5, new za.b(14));
            gVar.A.f(t0Var3, new m4.d(gVar), 1);
            gVar.q.k(new j4.p(t0Var3.b), t0Var3.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else if (g0.a(str, "urn:mpeg:dash:utc:ntp:2014") || g0.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
            gVar.t();
        } else {
            d5.a.p("DashMediaSource", "Failed to resolve time offset.", new IOException("Unsupported UTC timing scheme"));
            gVar.u(true);
        }
    }

    @Override // f2.t1
    public int n() {
        return ((x0) this.b).G();
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        j8.e0 e0Var = (j8.e0) this.b;
        if (task.isSuccessful()) {
            i8.m.K0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            i8.m.K0(e0Var, false, null);
        }
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onStateChanged(boolean z10, int i10) {
        q6 q6Var = (q6) this.b;
        m6 m6Var = q6Var.H;
        AndroidUtilities.cancelRunOnUIThread(m6Var);
        m61 m61Var = q6Var.y;
        if (m61Var == null || !m61Var.z()) {
            return;
        }
        AndroidUtilities.runOnUIThread(m6Var);
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.j61
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((q6) this.b).i();
    }

    @Override // j4.d1
    public boolean q(long j10) {
        boolean z10;
        boolean z11 = false;
        do {
            long g10 = g();
            if (g10 == Long.MIN_VALUE) {
                return z11;
            }
            z10 = false;
            for (d1 d1Var : (d1[]) this.b) {
                long g11 = d1Var.g();
                boolean z12 = g11 != Long.MIN_VALUE && g11 <= j10;
                if (g11 == g10 || z12) {
                    z10 |= d1Var.q(j10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void r(int i10) {
        v5.a aVar;
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
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void s(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = v5.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // l.j
    public boolean t(l.l lVar, MenuItem menuItem) {
        m.l lVar2 = ((ActionMenuView) this.b).L;
        if (lVar2 == null) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((ga.c) lVar2).b).S.d).iterator();
        while (it.hasNext()) {
            if (((b0) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.x90
    public Paint.FontMetricsInt u() {
        return ((lh.m) this.b).f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override // f2.t1
    public int v() {
        x0 x0Var = (x0) this.b;
        return x0Var.n - x0Var.C();
    }

    @Override // m.f2
    public void y(l.l lVar, l.n nVar) {
        l.f fVar = (l.f) this.b;
        Handler handler = fVar.f;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fVar.n;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (lVar == ((l.e) arrayList.get(i10)).b) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            return;
        }
        int i11 = i10 + 1;
        handler.postAtTime(new bf.e(this, i11 < arrayList.size() ? (l.e) arrayList.get(i11) : null, nVar, lVar, 7), lVar, SystemClock.uptimeMillis() + 200);
    }

    @Override // jh.e9
    public boolean y0(long j10, int i10, int i11, int i12, f9 f9Var) {
        ImageReceiver imageReceiver;
        g4 g4Var;
        g4 g4Var2;
        f9Var.b = null;
        f9Var.c = null;
        oy0 oy0Var = (oy0) this.b;
        iz0 iz0Var = oy0Var.h;
        ArrayList arrayList = oy0Var.w;
        if (oy0Var.J < 0.2f) {
            f9Var.b = iz0Var.getImageReceiver();
            f9Var.c = null;
            f9Var.a = iz0Var;
            f9Var.h = 0.0f;
            f9Var.i = AndroidUtilities.displaySize.y;
            f9Var.g = (View) oy0Var.getParent();
            f9Var.d = oy0Var.y;
            f9Var.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                g4Var = null;
                g4Var2 = null;
                break;
            }
            g4 g4Var3 = (g4) arrayList.get(i13);
            if (g4Var3.e >= 1.0f && g4Var3.a == i11) {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                g4 d = ProfileStoriesView.d(i14 >= 0 ? (g4) arrayList.get(i14) : null, i15 >= 0 ? (g4) arrayList.get(i15) : null, g4Var3);
                imageReceiver = g4Var3.b;
                g4Var2 = d;
                g4Var = g4Var3;
            }
            i13++;
        }
        if (imageReceiver == null) {
            return false;
        }
        f9Var.c = imageReceiver;
        f9Var.b = null;
        f9Var.a = oy0Var;
        f9Var.h = 0.0f;
        f9Var.i = AndroidUtilities.displaySize.y;
        f9Var.g = (View) oy0Var.getParent();
        if (g4Var == null || g4Var2 == null) {
            f9Var.f = null;
            return true;
        }
        f9Var.f = new f1.a(this, new RectF(g4Var.m), g4Var, new RectF(g4Var2.m), g4Var2);
        return true;
    }

    public /* synthetic */ i(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.j61
    public void onRenderedFirstFrame() {
    }

    public i(int i10) {
        this.a = i10;
        switch (i10) {
            case 28:
                this.b = new d5.z(10);
                break;
            default:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
        }
    }

    public i(j3.e eVar) {
        this.a = 20;
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(eVar.a).setFlags(eVar.b).setUsage(eVar.c);
        int i10 = g0.a;
        if (i10 >= 29) {
            j3.c.a(usage, eVar.d);
        }
        if (i10 >= 32) {
            j3.d.a(usage, eVar.e);
        }
        this.b = usage.build();
    }

    public i(LaunchActivity launchActivity, Executor executor, e7.t tVar) {
        this.a = 3;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s10 = launchActivity.s();
            y yVar = (y) new a5.n(launchActivity).l(y.class);
            this.b = s10;
            yVar.d = executor;
            yVar.e = tVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override // org.telegram.ui.Components.x90
    public /* synthetic */ void K(String str) {
    }

    @Override // jh.e9
    public /* synthetic */ void e(boolean z10) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onError(m61 m61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.x90
    public /* synthetic */ void c(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override // org.telegram.ui.Components.x90
    public /* synthetic */ void x(TLRPC.TL_document tL_document, String str, Object obj) {
    }

    @Override // org.telegram.ui.Components.j61
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
    }
}
