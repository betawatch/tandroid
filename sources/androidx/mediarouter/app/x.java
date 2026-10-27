package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.i3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.s90;
import org.telegram.ui.Components.x30;
import org.telegram.ui.Components.z70;
import org.telegram.ui.Components.zp;
import s4.e1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i10) {
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
                ((d0) this.b).dismiss();
                return;
            case 1:
                g0 g0Var = (g0) this.b;
                o0 o0Var = g0Var.y;
                if (o0Var.M != null) {
                    o0Var.H.removeMessages(2);
                }
                o0Var.M = g0Var.v;
                boolean isActivated = view.isActivated();
                boolean z10 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) o0Var.N.get(g0Var.v.c);
                    max = num == null ? 1 : Math.max(1, num.intValue());
                } else {
                    max = 0;
                }
                g0Var.u(z10);
                g0Var.x.setProgress(max);
                g0Var.v.j(max);
                o0Var.H.sendEmptyMessageDelayed(2, 500L);
                return;
            case 2:
                h0 h0Var = (h0) this.b;
                p4.x xVar = h0Var.B.w.f;
                p4.v vVar = h0Var.A;
                xVar.getClass();
                if (vVar == null) {
                    throw new NullPointerException("route must not be null");
                }
                p4.x.b();
                p4.e c10 = p4.x.c();
                if (!(c10.e instanceof p4.p)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                jg.i b10 = c10.d.b(vVar);
                if (b10 == null || (oVar = (p4.o) b10.a) == null || !oVar.e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((p4.p) c10.e).o(Collections.singletonList(vVar.b));
                }
                h0Var.w.setVisibility(4);
                h0Var.x.setVisibility(0);
                return;
            case 3:
                l0 l0Var = (l0) this.b;
                m0 m0Var = l0Var.I;
                boolean v = l0Var.v(l0Var.v);
                boolean z11 = !v;
                boolean e = l0Var.v.e();
                if (v) {
                    p4.x xVar2 = m0Var.w.f;
                    p4.v vVar2 = l0Var.v;
                    xVar2.getClass();
                    if (vVar2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    p4.x.b();
                    p4.e c11 = p4.x.c();
                    if (!(c11.e instanceof p4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    jg.i b11 = c11.d.b(vVar2);
                    if (!DesugarCollections.unmodifiableList(c11.d.v).contains(vVar2) || b11 == null || ((oVar2 = (p4.o) b11.a) != null && !oVar2.c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + vVar2);
                    } else if (DesugarCollections.unmodifiableList(c11.d.v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((p4.p) c11.e).n(vVar2.b);
                    }
                } else {
                    p4.x xVar3 = m0Var.w.f;
                    p4.v vVar3 = l0Var.v;
                    xVar3.getClass();
                    if (vVar3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    p4.x.b();
                    p4.e c12 = p4.x.c();
                    if (!(c12.e instanceof p4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    jg.i b12 = c12.d.b(vVar3);
                    if (DesugarCollections.unmodifiableList(c12.d.v).contains(vVar3) || b12 == null || (oVar3 = (p4.o) b12.a) == null || !oVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + vVar3);
                    } else {
                        ((p4.p) c12.e).m(vVar3.b);
                    }
                }
                l0Var.w(z11, !e);
                if (e) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(m0Var.w.r.v);
                    for (p4.v vVar4 : DesugarCollections.unmodifiableList(l0Var.v.v)) {
                        if (unmodifiableList.contains(vVar4) != z11) {
                            g0 g0Var2 = (g0) m0Var.w.L.get(vVar4.c);
                            if (g0Var2 instanceof l0) {
                                ((l0) g0Var2).w(z11, true);
                            }
                        }
                    }
                }
                o0 o0Var2 = m0Var.w;
                p4.v vVar5 = l0Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(o0Var2.r.v);
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
                boolean z12 = o0Var2.i0 && DesugarCollections.unmodifiableList(o0Var2.r.v).size() > 1;
                boolean z13 = o0Var2.i0 && max2 >= 2;
                if (z12 != z13) {
                    e1 K = o0Var2.I.K(0);
                    if (K instanceof i0) {
                        i0 i0Var = (i0) K;
                        m0Var.D(z13 ? i0Var.A : 0, i0Var.a);
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
                i3 i3Var = ((Toolbar) this.b).e0;
                l.m mVar = i3Var == null ? null : i3Var.b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                zp.r((zp) this.b);
                return;
            case 9:
                z70 z70Var = (z70) this.b;
                x30 x30Var = (x30) view;
                if (x30Var.y) {
                    z70Var.j0 = null;
                    z70Var.f0.l(x30Var.getUid());
                    z70Var.U.b(x30Var);
                    z70Var.a0(true);
                    AndroidUtilities.updateVisibleRows(z70Var.d);
                    return;
                }
                x30 x30Var2 = z70Var.j0;
                if (x30Var2 != null) {
                    x30Var2.a();
                }
                z70Var.j0 = x30Var;
                x30Var.b();
                return;
            default:
                ((s90) this.b).e.callOnClick();
                return;
        }
    }
}
