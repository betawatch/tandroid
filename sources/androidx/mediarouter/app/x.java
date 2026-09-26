package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import ci.m6;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.wi;
import org.telegram.ui.Components.wo;
import org.telegram.ui.wn;
import s4.c1;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                k2.u b10 = c10.d.b(vVar);
                if (b10 == null || (oVar = (p4.o) b10.b) == null || !oVar.e) {
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
                    k2.u b11 = c11.d.b(vVar2);
                    if (!DesugarCollections.unmodifiableList(c11.d.v).contains(vVar2) || b11 == null || ((oVar2 = (p4.o) b11.b) != null && !oVar2.c)) {
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
                    k2.u b12 = c12.d.b(vVar3);
                    if (DesugarCollections.unmodifiableList(c12.d.v).contains(vVar3) || b12 == null || (oVar3 = (p4.o) b12.b) == null || !oVar3.d) {
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
                    c1 K = o0Var2.I.K(0);
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
                g.f fVar = (g.f) this.b;
                Message obtain = (view != fVar.i || (message = fVar.k) == null) ? null : Message.obtain(message);
                if (obtain != null) {
                    obtain.sendToTarget();
                }
                fVar.z.obtainMessage(1, fVar.b).sendToTarget();
                return;
            case 6:
                ((k.a) this.b).a();
                return;
            case 7:
                g3 g3Var = ((Toolbar) this.b).e0;
                l.n nVar = g3Var == null ? null : g3Var.b;
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                np npVar = (np) this.b;
                wn wnVar = npVar.v;
                wi wiVar = new wi(wnVar.getParentActivity(), wnVar, false, false, false, wnVar.getResourceProvider());
                npVar.Y = wiVar;
                wiVar.drawNavigationBar = true;
                wiVar.L1(LocaleController.getString(R.string.ChooseBackground));
                wi wiVar2 = npVar.Y;
                wiVar2.Z1 = new ep(npVar);
                wiVar2.J1(1, false);
                npVar.Y.r1();
                npVar.Y.j0.f0();
                npVar.Y.show();
                npVar.Z = new m6(npVar, npVar.getContext());
                p6 p6Var = new p6(npVar.getContext(), true, true, true);
                npVar.a0 = p6Var;
                p6Var.setTextSize(AndroidUtilities.dp(14.0f));
                npVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                npVar.a0.setGravity(17);
                p6 p6Var2 = npVar.a0;
                int i10 = h6.Oh;
                p6Var2.setTextColor(npVar.getThemedColor(i10));
                npVar.Z.addView(npVar.a0, y5.e(-1, -2, 17));
                m6 m6Var = npVar.Z;
                int dp = AndroidUtilities.dp(0.0f);
                int themedColor = npVar.getThemedColor(h6.d6);
                int k10 = i0.a.k(npVar.getThemedColor(i10), 76);
                m6Var.setBackground(h6.i0(dp, dp, dp, dp, themedColor, k10, k10));
                npVar.Z.setOnClickListener(new wo(npVar, 0));
                npVar.Y.r1.addView(npVar.Z, y5.e(-1, -2, 80));
                return;
            case 9:
                m70 m70Var = (m70) this.b;
                n30 n30Var = (n30) view;
                if (n30Var.y) {
                    m70Var.j0 = null;
                    m70Var.f0.l(n30Var.getUid());
                    m70Var.U.b(n30Var);
                    m70Var.a0(true);
                    AndroidUtilities.updateVisibleRows(m70Var.d);
                    return;
                }
                n30 n30Var2 = m70Var.j0;
                if (n30Var2 != null) {
                    n30Var2.a();
                }
                m70Var.j0 = n30Var;
                n30Var.b();
                return;
            default:
                ((g90) this.b).e.callOnClick();
                return;
        }
    }
}
