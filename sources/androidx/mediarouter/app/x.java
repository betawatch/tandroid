package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import ci.n6;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.g3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.vo;
import org.telegram.ui.zn;
import s4.c1;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                k2.e b10 = c10.d.b(vVar);
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
                    k2.e b11 = c11.d.b(vVar2);
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
                    k2.e b12 = c12.d.b(vVar3);
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
                    c1 L = o0Var2.I.L(0);
                    if (L instanceof i0) {
                        i0 i0Var = (i0) L;
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
                mp mpVar = (mp) this.b;
                zn znVar = mpVar.v;
                vi viVar = new vi(znVar.getParentActivity(), znVar, false, false, false, znVar.getResourceProvider());
                mpVar.Y = viVar;
                viVar.drawNavigationBar = true;
                viVar.L1(LocaleController.getString(R.string.ChooseBackground));
                vi viVar2 = mpVar.Y;
                viVar2.Z1 = new dp(mpVar);
                viVar2.J1(1, false);
                mpVar.Y.r1();
                mpVar.Y.j0.f0();
                mpVar.Y.show();
                mpVar.Z = new n6(mpVar, mpVar.getContext());
                o6 o6Var = new o6(mpVar.getContext(), true, true, true);
                mpVar.a0 = o6Var;
                o6Var.setTextSize(AndroidUtilities.dp(14.0f));
                mpVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                mpVar.a0.setGravity(17);
                o6 o6Var2 = mpVar.a0;
                int i10 = j6.Oh;
                o6Var2.setTextColor(mpVar.getThemedColor(i10));
                mpVar.Z.addView(mpVar.a0, y5.e(-1, -2, 17));
                n6 n6Var = mpVar.Z;
                int dp = AndroidUtilities.dp(0.0f);
                int themedColor = mpVar.getThemedColor(j6.d6);
                int k10 = i0.a.k(mpVar.getThemedColor(i10), 76);
                n6Var.setBackground(j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
                mpVar.Z.setOnClickListener(new vo(mpVar, 0));
                mpVar.Y.r1.addView(mpVar.Z, y5.e(-1, -2, 80));
                return;
            case 9:
                m70 m70Var = (m70) this.b;
                m30 m30Var = (m30) view;
                if (m30Var.y) {
                    m70Var.j0 = null;
                    m70Var.f0.l(m30Var.getUid());
                    m70Var.U.b(m30Var);
                    m70Var.a0(true);
                    AndroidUtilities.updateVisibleRows(m70Var.d);
                    return;
                }
                m30 m30Var2 = m70Var.j0;
                if (m30Var2 != null) {
                    m30Var2.a();
                }
                m70Var.j0 = m30Var;
                m30Var.b();
                return;
            default:
                ((g90) this.b).e.callOnClick();
                return;
        }
    }
}
