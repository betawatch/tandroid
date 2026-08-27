package androidx.mediarouter.app;

import android.util.Log;
import android.view.View;
import f2.o1;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class f0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int max;
        c2.p pVar;
        c2.p pVar2;
        c2.p pVar3;
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) this.b;
                p0 p0Var = g0Var.y;
                if (p0Var.I != null) {
                    p0Var.D.removeMessages(2);
                }
                p0Var.I = g0Var.v;
                boolean isActivated = view.isActivated();
                boolean z10 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) p0Var.J.get(g0Var.v.c);
                    max = num == null ? 1 : Math.max(1, num.intValue());
                } else {
                    max = 0;
                }
                g0Var.u(z10);
                g0Var.x.setProgress(max);
                g0Var.v.j(max);
                p0Var.D.sendEmptyMessageDelayed(2, 500L);
                return;
            case 1:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) this.b;
                boolean z11 = mediaRouteExpandCollapseButton.n;
                mediaRouteExpandCollapseButton.n = !z11;
                if (z11) {
                    mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.e);
                    mediaRouteExpandCollapseButton.e.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f);
                } else {
                    mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.d);
                    mediaRouteExpandCollapseButton.d.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.h);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.r;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                ((c0) this.b).dismiss();
                return;
            case 3:
                i0 i0Var = (i0) this.b;
                c2.b0 b0Var = i0Var.B.w.f;
                c2.z zVar = i0Var.A;
                b0Var.getClass();
                if (zVar == null) {
                    throw new NullPointerException("route must not be null");
                }
                c2.b0.b();
                c2.e c10 = c2.b0.c();
                if (!(c10.e instanceof c2.q)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                ae.b b10 = c10.d.b(zVar);
                if (b10 == null || (pVar = (c2.p) b10.b) == null || !pVar.e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((c2.q) c10.e).o(Collections.singletonList(zVar.b));
                }
                i0Var.w.setVisibility(4);
                i0Var.x.setVisibility(0);
                return;
            default:
                m0 m0Var = (m0) this.b;
                n0 n0Var = m0Var.I;
                boolean v = m0Var.v(m0Var.v);
                boolean z12 = !v;
                boolean e9 = m0Var.v.e();
                if (v) {
                    c2.b0 b0Var2 = n0Var.w.f;
                    c2.z zVar2 = m0Var.v;
                    b0Var2.getClass();
                    if (zVar2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    c2.b0.b();
                    c2.e c11 = c2.b0.c();
                    if (!(c11.e instanceof c2.q)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    ae.b b11 = c11.d.b(zVar2);
                    if (!DesugarCollections.unmodifiableList(c11.d.v).contains(zVar2) || b11 == null || ((pVar2 = (c2.p) b11.b) != null && !pVar2.c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + zVar2);
                    } else if (DesugarCollections.unmodifiableList(c11.d.v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((c2.q) c11.e).n(zVar2.b);
                    }
                } else {
                    c2.b0 b0Var3 = n0Var.w.f;
                    c2.z zVar3 = m0Var.v;
                    b0Var3.getClass();
                    if (zVar3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    c2.b0.b();
                    c2.e c12 = c2.b0.c();
                    if (!(c12.e instanceof c2.q)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    ae.b b12 = c12.d.b(zVar3);
                    if (DesugarCollections.unmodifiableList(c12.d.v).contains(zVar3) || b12 == null || (pVar3 = (c2.p) b12.b) == null || !pVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + zVar3);
                    } else {
                        ((c2.q) c12.e).m(zVar3.b);
                    }
                }
                m0Var.w(z12, !e9);
                if (e9) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(n0Var.w.r.v);
                    for (c2.z zVar4 : DesugarCollections.unmodifiableList(m0Var.v.v)) {
                        if (unmodifiableList.contains(zVar4) != z12) {
                            g0 g0Var2 = (g0) n0Var.w.H.get(zVar4.c);
                            if (g0Var2 instanceof m0) {
                                ((m0) g0Var2).w(z12, true);
                            }
                        }
                    }
                }
                p0 p0Var2 = n0Var.w;
                c2.z zVar5 = m0Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(p0Var2.r.v);
                int max2 = Math.max(1, unmodifiableList2.size());
                if (zVar5.e()) {
                    Iterator it = DesugarCollections.unmodifiableList(zVar5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((c2.z) it.next()) != z12) {
                            max2 += !v ? 1 : -1;
                        }
                    }
                } else {
                    max2 += v ? -1 : 1;
                }
                boolean z13 = p0Var2.e0 && DesugarCollections.unmodifiableList(p0Var2.r.v).size() > 1;
                boolean z14 = p0Var2.e0 && max2 >= 2;
                if (z13 != z14) {
                    o1 K = p0Var2.E.K(0);
                    if (K instanceof j0) {
                        j0 j0Var = (j0) K;
                        n0Var.D(z14 ? j0Var.A : 0, j0Var.a);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
