package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import f2.q1;
import g7.e6;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lo;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.w20;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int max;
        c2.p pVar;
        c2.p pVar2;
        c2.p pVar3;
        Message message;
        switch (this.a) {
            case 0:
                ((e0) this.b).dismiss();
                return;
            case 1:
                h0 h0Var = (h0) this.b;
                p0 p0Var = h0Var.y;
                if (p0Var.I != null) {
                    p0Var.D.removeMessages(2);
                }
                p0Var.I = h0Var.v;
                boolean isActivated = view.isActivated();
                boolean z10 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) p0Var.J.get(h0Var.v.c);
                    max = num == null ? 1 : Math.max(1, num.intValue());
                } else {
                    max = 0;
                }
                h0Var.u(z10);
                h0Var.x.setProgress(max);
                h0Var.v.j(max);
                p0Var.D.sendEmptyMessageDelayed(2, 500L);
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
                c2.e c10 = c2.c0.c();
                if (!(c10.e instanceof c2.q)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                fa.c b10 = c10.d.b(a0Var);
                if (b10 == null || (pVar = (c2.p) b10.b) == null || !pVar.e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((c2.q) c10.e).o(Collections.singletonList(a0Var.b));
                }
                i0Var.w.setVisibility(4);
                i0Var.x.setVisibility(0);
                return;
            case 3:
                m0 m0Var = (m0) this.b;
                n0 n0Var = m0Var.I;
                boolean v = m0Var.v(m0Var.v);
                boolean z11 = !v;
                boolean e10 = m0Var.v.e();
                if (v) {
                    c2.c0 c0Var2 = n0Var.w.f;
                    c2.a0 a0Var2 = m0Var.v;
                    c0Var2.getClass();
                    if (a0Var2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    c2.c0.b();
                    c2.e c11 = c2.c0.c();
                    if (!(c11.e instanceof c2.q)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    fa.c b11 = c11.d.b(a0Var2);
                    if (!DesugarCollections.unmodifiableList(c11.d.v).contains(a0Var2) || b11 == null || ((pVar2 = (c2.p) b11.b) != null && !pVar2.c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + a0Var2);
                    } else if (DesugarCollections.unmodifiableList(c11.d.v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((c2.q) c11.e).n(a0Var2.b);
                    }
                } else {
                    c2.c0 c0Var3 = n0Var.w.f;
                    c2.a0 a0Var3 = m0Var.v;
                    c0Var3.getClass();
                    if (a0Var3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    c2.c0.b();
                    c2.e c12 = c2.c0.c();
                    if (!(c12.e instanceof c2.q)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    fa.c b12 = c12.d.b(a0Var3);
                    if (DesugarCollections.unmodifiableList(c12.d.v).contains(a0Var3) || b12 == null || (pVar3 = (c2.p) b12.b) == null || !pVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + a0Var3);
                    } else {
                        ((c2.q) c12.e).m(a0Var3.b);
                    }
                }
                m0Var.w(z11, !e10);
                if (e10) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(n0Var.w.r.v);
                    for (c2.a0 a0Var4 : DesugarCollections.unmodifiableList(m0Var.v.v)) {
                        if (unmodifiableList.contains(a0Var4) != z11) {
                            h0 h0Var2 = (h0) n0Var.w.H.get(a0Var4.c);
                            if (h0Var2 instanceof m0) {
                                ((m0) h0Var2).w(z11, true);
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
                        if (unmodifiableList2.contains((c2.a0) it.next()) != z11) {
                            max2 += !v ? 1 : -1;
                        }
                    }
                } else {
                    max2 += v ? -1 : 1;
                }
                boolean z12 = p0Var2.e0 && DesugarCollections.unmodifiableList(p0Var2.r.v).size() > 1;
                boolean z13 = p0Var2.e0 && max2 >= 2;
                if (z12 != z13) {
                    q1 K = p0Var2.E.K(0);
                    if (K instanceof j0) {
                        j0 j0Var = (j0) K;
                        n0Var.D(z13 ? j0Var.A : 0, j0Var.a);
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
                k3 k3Var = ((Toolbar) this.b).a0;
                l.m mVar = k3Var == null ? null : k3Var.b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                cp cpVar = (cp) this.b;
                qn qnVar = cpVar.v;
                ki kiVar = new ki(qnVar.getParentActivity(), qnVar, false, false, false, qnVar.getResourceProvider());
                cpVar.U = kiVar;
                kiVar.drawNavigationBar = true;
                kiVar.L1(LocaleController.getString(R.string.ChooseBackground));
                ki kiVar2 = cpVar.U;
                kiVar2.V1 = new to(cpVar);
                kiVar2.J1(1, false);
                cpVar.U.r1();
                cpVar.U.f0.e0();
                cpVar.U.show();
                cpVar.V = new fh.v(cpVar, cpVar.getContext());
                j6 j6Var = new j6(cpVar.getContext(), true, true, true);
                cpVar.W = j6Var;
                j6Var.setTextSize(AndroidUtilities.dp(14.0f));
                cpVar.W.setText(LocaleController.getString(R.string.SetColorAsBackground));
                cpVar.W.setGravity(17);
                j6 j6Var2 = cpVar.W;
                int i9 = f6.Oh;
                j6Var2.setTextColor(cpVar.getThemedColor(i9));
                cpVar.V.addView(cpVar.W, e6.e(-1, -2, 17));
                fh.v vVar = cpVar.V;
                int dp = AndroidUtilities.dp(0.0f);
                int themedColor = cpVar.getThemedColor(f6.d6);
                int k10 = i0.a.k(cpVar.getThemedColor(i9), 76);
                vVar.setBackground(f6.i0(dp, dp, dp, dp, themedColor, k10, k10));
                cpVar.V.setOnClickListener(new lo(cpVar, 0));
                cpVar.U.n1.addView(cpVar.V, e6.e(-1, -2, 80));
                return;
            case 9:
                k60 k60Var = (k60) this.b;
                w20 w20Var = (w20) view;
                if (w20Var.y) {
                    k60Var.f0 = null;
                    k60Var.b0.l(w20Var.getUid());
                    k60Var.Q.b(w20Var);
                    k60Var.Z(true);
                    AndroidUtilities.updateVisibleRows(k60Var.d);
                    return;
                }
                w20 w20Var2 = k60Var.f0;
                if (w20Var2 != null) {
                    w20Var2.a();
                }
                k60Var.f0 = w20Var;
                w20Var.b();
                return;
            default:
                ((e80) this.b).e.callOnClick();
                return;
        }
    }
}
