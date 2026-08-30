package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import f2.l1;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k7.b6;
import m.j3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.x80;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class y implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int max;
        c2.q qVar;
        c2.q qVar2;
        c2.q qVar3;
        Message message;
        switch (this.a) {
            case 0:
                ((e0) this.b).dismiss();
                return;
            case 1:
                h0 h0Var = (h0) this.b;
                p0 p0Var = h0Var.y;
                if (p0Var.J != null) {
                    p0Var.E.removeMessages(2);
                }
                p0Var.J = h0Var.v;
                boolean isActivated = view.isActivated();
                boolean z4 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) p0Var.K.get(h0Var.v.c);
                    max = num == null ? 1 : Math.max(1, num.intValue());
                } else {
                    max = 0;
                }
                h0Var.u(z4);
                h0Var.x.setProgress(max);
                h0Var.v.j(max);
                p0Var.E.sendEmptyMessageDelayed(2, 500L);
                return;
            case 2:
                i0 i0Var = (i0) this.b;
                c2.c0 c0Var = i0Var.B.w.f;
                c2.a0 a0Var = i0Var.A;
                c0Var.getClass();
                if (a0Var == null) {
                    throw new NullPointerException("route must not be null");
                }
                c2.c0.b();
                c2.e c3 = c2.c0.c();
                if (!(c3.e instanceof c2.r)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                a3.c b10 = c3.d.b(a0Var);
                if (b10 == null || (qVar = (c2.q) b10.b) == null || !qVar.e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((c2.r) c3.e).o(Collections.singletonList(a0Var.b));
                }
                i0Var.w.setVisibility(4);
                i0Var.x.setVisibility(0);
                return;
            case 3:
                m0 m0Var = (m0) this.b;
                n0 n0Var = m0Var.I;
                boolean v = m0Var.v(m0Var.v);
                boolean z10 = !v;
                boolean e = m0Var.v.e();
                if (v) {
                    c2.c0 c0Var2 = n0Var.w.f;
                    c2.a0 a0Var2 = m0Var.v;
                    c0Var2.getClass();
                    if (a0Var2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    c2.c0.b();
                    c2.e c10 = c2.c0.c();
                    if (!(c10.e instanceof c2.r)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    a3.c b11 = c10.d.b(a0Var2);
                    if (!DesugarCollections.unmodifiableList(c10.d.v).contains(a0Var2) || b11 == null || ((qVar2 = (c2.q) b11.b) != null && !qVar2.c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + a0Var2);
                    } else if (DesugarCollections.unmodifiableList(c10.d.v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((c2.r) c10.e).n(a0Var2.b);
                    }
                } else {
                    c2.c0 c0Var3 = n0Var.w.f;
                    c2.a0 a0Var3 = m0Var.v;
                    c0Var3.getClass();
                    if (a0Var3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    c2.c0.b();
                    c2.e c11 = c2.c0.c();
                    if (!(c11.e instanceof c2.r)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    a3.c b12 = c11.d.b(a0Var3);
                    if (DesugarCollections.unmodifiableList(c11.d.v).contains(a0Var3) || b12 == null || (qVar3 = (c2.q) b12.b) == null || !qVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + a0Var3);
                    } else {
                        ((c2.r) c11.e).m(a0Var3.b);
                    }
                }
                m0Var.w(z10, !e);
                if (e) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(n0Var.w.r.v);
                    for (c2.a0 a0Var4 : DesugarCollections.unmodifiableList(m0Var.v.v)) {
                        if (unmodifiableList.contains(a0Var4) != z10) {
                            h0 h0Var2 = (h0) n0Var.w.I.get(a0Var4.c);
                            if (h0Var2 instanceof m0) {
                                ((m0) h0Var2).w(z10, true);
                            }
                        }
                    }
                }
                p0 p0Var2 = n0Var.w;
                c2.a0 a0Var5 = m0Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(p0Var2.r.v);
                int max2 = Math.max(1, unmodifiableList2.size());
                if (a0Var5.e()) {
                    Iterator it = DesugarCollections.unmodifiableList(a0Var5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((c2.a0) it.next()) != z10) {
                            max2 += !v ? 1 : -1;
                        }
                    }
                } else {
                    max2 += v ? -1 : 1;
                }
                boolean z11 = p0Var2.f0 && DesugarCollections.unmodifiableList(p0Var2.r.v).size() > 1;
                boolean z12 = p0Var2.f0 && max2 >= 2;
                if (z11 != z12) {
                    l1 K = p0Var2.F.K(0);
                    if (K instanceof j0) {
                        j0 j0Var = (j0) K;
                        n0Var.D(z12 ? j0Var.A : 0, j0Var.a);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) this.b;
                boolean z13 = mediaRouteExpandCollapseButton.n;
                mediaRouteExpandCollapseButton.n = !z13;
                if (z13) {
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
                j3 j3Var = ((Toolbar) this.b).b0;
                l.m mVar = j3Var == null ? null : j3Var.b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                kp kpVar = (kp) this.b;
                xn xnVar = kpVar.v;
                li liVar = new li(xnVar.getParentActivity(), xnVar, false, false, false, xnVar.getResourceProvider());
                kpVar.V = liVar;
                liVar.drawNavigationBar = true;
                liVar.L1(LocaleController.getString(R.string.ChooseBackground));
                li liVar2 = kpVar.V;
                liVar2.W1 = new ap(kpVar);
                liVar2.J1(1, false);
                kpVar.V.r1();
                kpVar.V.g0.f0();
                kpVar.V.show();
                kpVar.W = new ah.d(kpVar, kpVar.getContext());
                k6 k6Var = new k6(kpVar.getContext(), true, true, true);
                kpVar.X = k6Var;
                k6Var.setTextSize(AndroidUtilities.dp(14.0f));
                kpVar.X.setText(LocaleController.getString(R.string.SetColorAsBackground));
                kpVar.X.setGravity(17);
                k6 k6Var2 = kpVar.X;
                int i10 = j6.Oh;
                k6Var2.setTextColor(kpVar.getThemedColor(i10));
                kpVar.W.addView(kpVar.X, b6.e(-1, -2, 17));
                ah.d dVar = kpVar.W;
                int dp = AndroidUtilities.dp(0.0f);
                int themedColor = kpVar.getThemedColor(j6.d6);
                int k10 = i0.a.k(kpVar.getThemedColor(i10), 76);
                dVar.setBackground(j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
                kpVar.W.setOnClickListener(new ro(kpVar, 0));
                kpVar.V.o1.addView(kpVar.W, b6.e(-1, -2, 80));
                return;
            case 9:
                c70 c70Var = (c70) this.b;
                n30 n30Var = (n30) view;
                if (n30Var.y) {
                    c70Var.g0 = null;
                    c70Var.c0.l(n30Var.getUid());
                    c70Var.R.b(n30Var);
                    c70Var.a0(true);
                    AndroidUtilities.updateVisibleRows(c70Var.d);
                    return;
                }
                n30 n30Var2 = c70Var.g0;
                if (n30Var2 != null) {
                    n30Var2.a();
                }
                c70Var.g0 = n30Var;
                n30Var.b();
                return;
            default:
                ((x80) this.b).e.callOnClick();
                return;
        }
    }
}
