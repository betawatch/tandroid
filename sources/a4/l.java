package a4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.text.Editable;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.p;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.lifecycle.a0;
import b2.w0;
import bi.d4;
import bi.e1;
import bi.j3;
import bi.m0;
import bi.m1;
import bi.n1;
import bi.o2;
import bi.p5;
import bi.r5;
import bi.u0;
import bi.v2;
import bi.y3;
import c7.v;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.x4;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.l0;
import e9.l1;
import g2.c0;
import g2.n;
import ig.c1;
import ig.s0;
import ig.z0;
import j$.util.Objects;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import jg.a1;
import jg.c2;
import m.e2;
import m.s3;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import r0.h0;
import r0.j1;
import r0.m;
import u2.u;
import v7.t6;
import w7.f9;
import y2.o;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l implements z3.d, a0, androidx.activity.result.b, s, m0, m1, OnCompleteListener, l1, f6.a, m, c2, e2, y2.g, m.k {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ l(a6.i iVar) {
        this.a = 10;
        this.b = (r) iVar.b;
    }

    public void A(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(a1.g.n("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.b).putParcelable(str, bitmap);
    }

    @Override // bi.m1
    public void B(Editable editable) {
        ((r5) this.b).g();
    }

    public void C(long j10) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey("android.media.metadata.DURATION") && ((Integer) fVar.get("android.media.metadata.DURATION")).intValue() != 0) {
            throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
        }
        ((Bundle) this.b).putLong("android.media.metadata.DURATION", j10);
    }

    public void D(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a1.g.n("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.b).putCharSequence(str, str2);
    }

    @Override // bi.m0
    public void F(CharSequence charSequence) {
        y3 y3Var = ((e1) this.b).S;
        if (y3Var != null) {
            y3Var.getClass();
            if (charSequence == null || charSequence.length() <= 0) {
                return;
            }
            y3Var.a.w4(charSequence.toString());
        }
    }

    @Override // jg.c2
    public void G(float f7) {
        a1 a1Var = (a1) this.b;
        s0.e(a1Var.a).k("-1", f7);
        a1Var.e.setBrushSize(f7);
    }

    @Override // bi.m1
    public /* synthetic */ boolean H(boolean z10) {
        return false;
    }

    @Override // bi.m1
    public /* synthetic */ boolean I(n1 n1Var) {
        return false;
    }

    @Override // bi.m0
    public j9 J() {
        return (e1) this.b;
    }

    @Override // bi.m0
    public bi.a L() {
        return ((e1) this.b).a;
    }

    @Override // y2.g
    public void M(y2.i iVar, long j10, long j11, boolean z10) {
        ((l2.h) this.b).x((o) iVar, j10, j11);
    }

    @Override // bi.m0
    public boolean O() {
        e1 e1Var = (e1) this.b;
        y3 y3Var = e1Var.S;
        if (y3Var == null) {
            return false;
        }
        bi.a aVar = e1Var.a;
        return y3Var.a.V4();
    }

    @Override // bi.m0
    public void R(int i10, int i11) {
        e1 e1Var = (e1) this.b;
        y3 y3Var = e1Var.S;
        if (y3Var != null) {
            bi.a aVar = e1Var.a;
            o2 o2Var = y3Var.a.Q3;
            if (o2Var != null) {
                o2Var.f(i10, i11);
            }
        }
    }

    @Override // r0.m
    public j1 R0(View view, j1 j1Var) {
        boolean z10;
        boolean z11;
        int d = j1Var.d();
        g.r rVar = (g.r) this.b;
        Context context = rVar.e;
        int d10 = j1Var.d();
        ActionBarContextView actionBarContextView = rVar.D;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) rVar.D.getLayoutParams();
            if (rVar.D.isShown()) {
                if (rVar.l0 == null) {
                    rVar.l0 = new Rect();
                    rVar.m0 = new Rect();
                }
                Rect rect = rVar.l0;
                Rect rect2 = rVar.m0;
                rect.set(j1Var.b(), j1Var.d(), j1Var.c(), j1Var.a());
                ViewGroup viewGroup = rVar.J;
                Method method = s3.a;
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
                WeakHashMap weakHashMap = h0.a;
                j1 a2 = r0.a0.a(viewGroup2);
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
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & TLObject.FLAG_13) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
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
                rVar.D.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = rVar.L;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return h0.g(view, d != d10 ? j1Var.f(j1Var.b(), d10, j1Var.c(), j1Var.a()) : j1Var);
    }

    @Override // bi.m0
    public void W() {
        e1 e1Var = (e1) this.b;
        y3 y3Var = e1Var.S;
        if (y3Var != null) {
            bi.a aVar = e1Var.a;
            d4 d4Var = y3Var.a;
            o2 o2Var = d4Var.Q3;
            if (o2Var != null) {
                o2Var.g();
            }
            d4Var.o3.onContentChanged();
        }
    }

    @Override // z3.d
    public int a(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 5:
                b7.b bVar = new b7.b(0, (TaskCompletionSource) obj2);
                n7.m1 m1Var = (n7.m1) ((n7.l1) obj).v();
                v vVar = (v) this.b;
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(m1Var.b);
                int i10 = n7.j.a;
                obtain.writeStrongBinder(bVar);
                obtain.writeInt(1);
                vVar.writeToParcel(obtain, 0);
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
                g7.f fVar = (g7.f) this.b;
                h7.f fVar2 = new h7.f(0, (TaskCompletionSource) obj2);
                h7.d dVar = (h7.d) ((h7.e) obj).v();
                com.google.android.gms.common.api.g gVar = new com.google.android.gms.common.api.g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain3 = Parcel.obtain();
                obtain3.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i11 = q7.a.a;
                obtain3.writeStrongBinder(fVar2);
                q7.a.b(obtain3, fVar);
                q7.a.b(obtain3, gVar);
                ((h7.b) dVar).H0(obtain3, 6);
                return;
        }
    }

    @Override // bi.m0, bi.m1
    public void b(n1 n1Var) {
        switch (this.a) {
            case 6:
                y3 y3Var = ((e1) this.b).S;
                if (y3Var != null) {
                    d4 d4Var = y3Var.a;
                    d4.P1(d4Var, n1Var);
                    d4Var.o3.h(n1Var, true);
                    break;
                }
                break;
            default:
                p5 p5Var = ((r5) this.b).s;
                if (p5Var != null) {
                    d4 d4Var2 = ((j3) p5Var).a;
                    d4.P1(d4Var2, n1Var);
                    d4Var2.o3.h(n1Var, true);
                    break;
                }
                break;
        }
    }

    @Override // e9.l1
    public Object c(Object obj, Object obj2) {
        return ((d9.k) this.b).apply(obj2);
    }

    @Override // m.e2
    public void d(l.l lVar, MenuItem menuItem) {
        ((l.f) this.b).f.removeCallbacksAndMessages(lVar);
    }

    @Override // bi.m1
    public void e(n1 n1Var) {
        bi.a aVar;
        r5 r5Var = (r5) this.b;
        p5 p5Var = r5Var.s;
        if (p5Var == null || (aVar = r5Var.a) == null) {
            return;
        }
        d4 d4Var = ((j3) p5Var).a;
        ArrayList arrayList = d4Var.s3;
        long j10 = aVar.t;
        if (j10 == 0) {
            return;
        }
        int i10 = -1;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((bi.a) arrayList.get(i11)).k.contains(Long.valueOf(j10))) {
                i10 = i11;
            }
        }
        if (i10 < 0) {
            return;
        }
        o2 o2Var = d4Var.Q3;
        if (o2Var != null) {
            o2Var.d();
        }
        bi.a aVar2 = new bi.a(new TL_iv.pageBlockParagraph(), 0, 0);
        ArrayList arrayList2 = aVar.k;
        ArrayList arrayList3 = aVar2.k;
        arrayList3.addAll(arrayList2);
        if (!arrayList3.isEmpty()) {
            a1.g.x(1, arrayList3);
        }
        arrayList.add(i10 + 1, aVar2);
        d4Var.v4();
        d4Var.f3.O(false);
        o2 o2Var2 = d4Var.Q3;
        if (o2Var2 != null) {
            o2Var2.h();
        }
        d4Var.post(new v2(d4Var, aVar2, 26));
    }

    @Override // bi.m1
    public /* synthetic */ boolean f() {
        return false;
    }

    @Override // z3.d
    public long g(int i10) {
        t6.f(i10 == 0);
        return 0L;
    }

    @Override // jg.c2
    public float get() {
        a1 a1Var = (a1) this.b;
        int i10 = a1Var.a;
        ig.h currentBrush = a1Var.e.getCurrentBrush();
        return currentBrush == null ? s0.e(i10).i : s0.e(i10).f("-1", currentBrush.d());
    }

    @Override // bi.m0
    public void h0() {
        e1 e1Var = (e1) this.b;
        y3 y3Var = e1Var.S;
        if (y3Var != null) {
            bi.a aVar = e1Var.a;
            d4.R1(y3Var.a);
        }
    }

    @Override // bi.m1
    public void i(n1 n1Var, int i10, int i11) {
        p5 p5Var;
        k9 textSelectionHelper;
        r5 r5Var = (r5) this.b;
        if (r5Var.x || i10 == i11 || (p5Var = r5Var.s) == null || (textSelectionHelper = ((j3) p5Var).a.getTextSelectionHelper()) == null) {
            return;
        }
        n1Var.post(new u0(this, n1Var, i11, textSelectionHelper, i10, 1));
    }

    @Override // bi.m0
    public void j() {
        e1 e1Var = (e1) this.b;
        y3 y3Var = e1Var.S;
        if (y3Var != null) {
            d4.S1(y3Var.a, e1Var.a);
        }
    }

    public c6.o k() {
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

    @Override // androidx.lifecycle.a0
    public void k0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        p pVar = (p) this.b;
        if (charSequence != null) {
            if (pVar.R()) {
                pVar.W(charSequence);
            }
            pVar.l0.d(null);
        }
    }

    @Override // y2.g
    public k4.d l(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        o oVar = (o) iVar;
        l2.h hVar = (l2.h) this.b;
        long j12 = oVar.a;
        n nVar = oVar.b;
        c0 c0Var = oVar.d;
        u uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        int i11 = oVar.c;
        hVar.m.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.v) || (th2 instanceof y2.k) || ((th2 instanceof g2.k) && ((g2.k) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * 1000, 5000);
        k4.d dVar = min == -9223372036854775807L ? y2.l.f : new k4.d(0, min, false);
        hVar.q.s(uVar, i11, iOException, !dVar.a());
        return dVar;
    }

    @Override // androidx.activity.result.b
    public void m(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        j0 j0Var = (j0) this.b;
        f0 f0Var = (f0) j0Var.F.pollLast();
        if (f0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = f0Var.a;
        int i10 = f0Var.b;
        androidx.fragment.app.s s10 = j0Var.c.s(str);
        if (s10 != null) {
            s10.x(i10, aVar.a, aVar.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // y2.g
    public void n(y2.i iVar, long j10, long j11, int i10) {
        u uVar;
        o oVar = (o) iVar;
        l2.h hVar = (l2.h) this.b;
        if (i10 == 0) {
            long j12 = oVar.a;
            uVar = new u(oVar.b, j10);
        } else {
            long j13 = oVar.a;
            n nVar = oVar.b;
            c0 c0Var = oVar.d;
            uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        }
        hVar.q.u(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // y2.g
    public void o(y2.i iVar, long j10, long j11) {
        long j12;
        o oVar = (o) iVar;
        l2.h hVar = (l2.h) this.b;
        long j13 = oVar.a;
        n nVar = oVar.b;
        c0 c0Var = oVar.d;
        u uVar = new u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        hVar.m.getClass();
        hVar.q.q(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        m2.c cVar = (m2.c) oVar.f;
        m2.c cVar2 = hVar.G;
        int size = cVar2 == null ? 0 : cVar2.m.size();
        long j14 = cVar.b(0).b;
        int i10 = 0;
        while (i10 < size && hVar.G.b(i10).b < j14) {
            i10++;
        }
        if (cVar.d) {
            if (size - i10 > cVar.m.size()) {
                e2.a.l("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j15 = hVar.M;
                j12 = -9223372036854775807L;
                if (j15 == -9223372036854775807L || cVar.h * 1000 > j15) {
                    hVar.L = 0;
                } else {
                    e2.a.l("DashMediaSource", "Loaded stale dynamic manifest: " + cVar.h + ", " + hVar.M);
                }
            }
            int i11 = hVar.L;
            hVar.L = i11 + 1;
            if (i11 < hVar.m.q0(oVar.c)) {
                hVar.D.postDelayed(hVar.v, Math.min((hVar.L - 1) * 1000, 5000));
                return;
            } else {
                hVar.C = new x4();
                return;
            }
        }
        j12 = -9223372036854775807L;
        hVar.G = cVar;
        hVar.H = cVar.d & hVar.H;
        hVar.I = j10 - j11;
        hVar.J = j10;
        hVar.N += i10;
        synchronized (hVar.t) {
            try {
                if (oVar.b.a.equals(hVar.E)) {
                    Uri uri = hVar.G.k;
                    if (uri == null) {
                        uri = f9.a(oVar.d.c);
                    }
                    hVar.E = uri;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m2.c cVar3 = hVar.G;
        if (!cVar3.d || hVar.K != j12) {
            hVar.z(true);
            return;
        }
        c5.a aVar = cVar3.i;
        if (aVar == null) {
            hVar.w();
            return;
        }
        String str = aVar.b;
        if (Objects.equals(str, "urn:mpeg:dash:utc:direct:2014") || Objects.equals(str, "urn:mpeg:dash:utc:direct:2012")) {
            try {
                hVar.K = l0.V(aVar.c) - hVar.J;
                hVar.z(true);
                return;
            } catch (w0 e) {
                hVar.y(e);
                return;
            }
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            hVar.A(aVar, new l2.g());
            return;
        }
        if (Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2014") || Objects.equals(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            hVar.A(aVar, new kb.a(10));
        } else if (Objects.equals(str, "urn:mpeg:dash:utc:ntp:2014") || Objects.equals(str, "urn:mpeg:dash:utc:ntp:2012")) {
            hVar.w();
        } else {
            hVar.y(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.b).c, "launchApplication", task);
    }

    @Override // z3.d
    public List p(long j10) {
        return j10 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // f6.a
    public void q(Bitmap bitmap) {
        g6.b bVar = f6.i.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f7 = width;
            int height = bitmap.getHeight();
            int A = (int) a1.g.A(f7, 9.0f, 16.0f, 0.5f);
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

    @Override // z3.d
    public int s() {
        return 1;
    }

    @Override // m.e2
    public void t(l.l lVar, l.n nVar) {
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
        handler.postAtTime(new com.google.android.gms.internal.cast.o(this, i11 < arrayList.size() ? (l.e) arrayList.get(i11) : null, nVar, lVar, false, 1), lVar, SystemClock.uptimeMillis() + 200);
    }

    public void u() {
        ig.a1 a1Var = ((c1) this.b).d;
        if (a1Var != null) {
            z0 z0Var = a1Var.s;
            if (z0Var != null) {
                a1Var.cancelRunnable(z0Var);
                a1Var.s = null;
            }
            z0 z0Var2 = new z0(a1Var, 1);
            a1Var.s = z0Var2;
            a1Var.postRunnable(z0Var2, 1L);
        }
    }

    public String v(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            la.d dVar = (la.d) this.b;
            la.e eVar = new la.e(stringWriter, dVar.a, dVar.b, dVar.c, dVar.d);
            eVar.h(obj);
            eVar.j();
            eVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    @Override // bi.m1
    public /* synthetic */ boolean x(n1 n1Var) {
        return false;
    }

    @Override // bi.m0
    public k9 y() {
        y3 y3Var = ((e1) this.b).S;
        if (y3Var == null) {
            return null;
        }
        return y3Var.a.getTextSelectionHelper();
    }

    public ea.c z(JSONObject jSONObject) {
        ea.e dVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            dVar = new kb.a(5);
        } else {
            dVar = new oa.d(5);
        }
        return dVar.h1((t7.u) this.b, jSONObject);
    }

    public /* synthetic */ l(b7.a aVar, v vVar) {
        this.a = 5;
        this.b = vVar;
    }

    public /* synthetic */ l(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public l(MediaInfo mediaInfo) {
        this.a = 11;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public l(JSONObject jSONObject) {
        this.a = 11;
        this.b = new c6.o(jSONObject);
    }

    public l(int i10) {
        this.a = i10;
        switch (i10) {
            case 20:
                break;
            default:
                this.b = new Bundle();
                break;
        }
    }

    public l(MediaMetadataCompat mediaMetadataCompat) {
        this.a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.a);
        this.b = bundle;
        android.support.v4.media.session.a0.k(bundle);
    }

    @Override // bi.m1
    public /* synthetic */ void r() {
    }

    @Override // bi.m1
    public /* synthetic */ void w(CharSequence charSequence) {
    }

    @Override // bi.m1
    public /* synthetic */ void h(int i10, int i11) {
    }
}
