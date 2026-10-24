package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.j3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.r90;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
import s4.b1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class w implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int max;
        p4.o oVar;
        p4.o oVar2;
        p4.o oVar3;
        Message message;
        switch (this.a) {
            case 0:
                ((c0) this.b).dismiss();
                return;
            case 1:
                f0 f0Var = (f0) this.b;
                n0 n0Var = f0Var.y;
                if (n0Var.M != null) {
                    n0Var.H.removeMessages(2);
                }
                n0Var.M = f0Var.v;
                boolean isActivated = view.isActivated();
                boolean z10 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) n0Var.N.get(f0Var.v.c);
                    max = num == null ? 1 : Math.max(1, num.intValue());
                } else {
                    max = 0;
                }
                f0Var.u(z10);
                f0Var.x.setProgress(max);
                f0Var.v.j(max);
                n0Var.H.sendEmptyMessageDelayed(2, 500L);
                return;
            case 2:
                g0 g0Var = (g0) this.b;
                p4.x xVar = g0Var.B.w.f;
                p4.v vVar = g0Var.A;
                xVar.getClass();
                if (vVar == null) {
                    throw new NullPointerException("route must not be null");
                }
                p4.x.b();
                p4.e c10 = p4.x.c();
                if (!(c10.e instanceof p4.p)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                l2.f b10 = c10.d.b(vVar);
                if (b10 == null || (oVar = (p4.o) b10.b) == null || !oVar.e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((p4.p) c10.e).o(Collections.singletonList(vVar.b));
                }
                g0Var.w.setVisibility(4);
                g0Var.x.setVisibility(0);
                return;
            case 3:
                k0 k0Var = (k0) this.b;
                l0 l0Var = k0Var.I;
                boolean v = k0Var.v(k0Var.v);
                boolean z11 = !v;
                boolean e = k0Var.v.e();
                if (v) {
                    p4.x xVar2 = l0Var.w.f;
                    p4.v vVar2 = k0Var.v;
                    xVar2.getClass();
                    if (vVar2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    p4.x.b();
                    p4.e c11 = p4.x.c();
                    if (!(c11.e instanceof p4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    l2.f b11 = c11.d.b(vVar2);
                    if (!DesugarCollections.unmodifiableList(c11.d.v).contains(vVar2) || b11 == null || ((oVar2 = (p4.o) b11.b) != null && !oVar2.c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + vVar2);
                    } else if (DesugarCollections.unmodifiableList(c11.d.v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((p4.p) c11.e).n(vVar2.b);
                    }
                } else {
                    p4.x xVar3 = l0Var.w.f;
                    p4.v vVar3 = k0Var.v;
                    xVar3.getClass();
                    if (vVar3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    p4.x.b();
                    p4.e c12 = p4.x.c();
                    if (!(c12.e instanceof p4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    l2.f b12 = c12.d.b(vVar3);
                    if (DesugarCollections.unmodifiableList(c12.d.v).contains(vVar3) || b12 == null || (oVar3 = (p4.o) b12.b) == null || !oVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + vVar3);
                    } else {
                        ((p4.p) c12.e).m(vVar3.b);
                    }
                }
                k0Var.w(z11, !e);
                if (e) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(l0Var.w.r.v);
                    for (p4.v vVar4 : DesugarCollections.unmodifiableList(k0Var.v.v)) {
                        if (unmodifiableList.contains(vVar4) != z11) {
                            f0 f0Var2 = (f0) l0Var.w.L.get(vVar4.c);
                            if (f0Var2 instanceof k0) {
                                ((k0) f0Var2).w(z11, true);
                            }
                        }
                    }
                }
                n0 n0Var2 = l0Var.w;
                p4.v vVar5 = k0Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(n0Var2.r.v);
                int max2 = Math.max(1, unmodifiableList2.size());
                if (vVar5.e()) {
                    Iterator it = DesugarCollections.unmodifiableList(vVar5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((p4.v) it.next()) != z11) {
                            max2 += !v ? 1 : -1;
                        }
                    }
                } else {
                    max2 += v ? -1 : 1;
                }
                boolean z12 = n0Var2.i0 && DesugarCollections.unmodifiableList(n0Var2.r.v).size() > 1;
                boolean z13 = n0Var2.i0 && max2 >= 2;
                if (z12 != z13) {
                    b1 K = n0Var2.I.K(0);
                    if (K instanceof h0) {
                        h0 h0Var = (h0) K;
                        l0Var.D(z13 ? h0Var.A : 0, h0Var.a);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) this.b;
                boolean z14 = mediaRouteExpandCollapseButton.n;
                mediaRouteExpandCollapseButton.n = !z14;
                if (z14) {
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
            case 5:
                g.e eVar = (g.e) this.b;
                Message obtain = (view != eVar.i || (message = eVar.k) == null) ? null : Message.obtain(message);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                eVar.z.obtainMessage(1, eVar.b).sendToTarget();
                return;
            case 6:
                ((k.a) this.b).a();
                return;
            case 7:
                j3 j3Var = ((Toolbar) this.b).e0;
                l.m mVar = j3Var == null ? null : j3Var.b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                wp.s((wp) this.b);
                return;
            case 9:
                x70 x70Var = (x70) this.b;
                v30 v30Var = (v30) view;
                if (v30Var.y) {
                    x70Var.j0 = null;
                    x70Var.f0.l(v30Var.getUid());
                    x70Var.U.b(v30Var);
                    x70Var.a0(true);
                    AndroidUtilities.updateVisibleRows(x70Var.d);
                    return;
                }
                v30 v30Var2 = x70Var.j0;
                if (v30Var2 != null) {
                    v30Var2.a();
                }
                x70Var.j0 = v30Var;
                v30Var.b();
                return;
            default:
                ((r90) this.b).e.callOnClick();
                return;
        }
    }
}
