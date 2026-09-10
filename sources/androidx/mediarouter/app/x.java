package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import bi.n7;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.i3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.w30;
import org.telegram.ui.Components.yi;
import org.telegram.ui.eo;
import s4.c1;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                l2.g b10 = c10.d.b(vVar);
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
                    l2.g b11 = c11.d.b(vVar2);
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
                    l2.g b12 = c12.d.b(vVar3);
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
                i3 i3Var = ((Toolbar) this.b).e0;
                l.n nVar = i3Var == null ? null : i3Var.b;
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                sp spVar = (sp) this.b;
                eo eoVar = spVar.v;
                yi yiVar = new yi(eoVar.getParentActivity(), eoVar, false, false, false, eoVar.getResourceProvider());
                spVar.Y = yiVar;
                yiVar.drawNavigationBar = true;
                yiVar.L1(LocaleController.getString(R.string.ChooseBackground));
                yi yiVar2 = spVar.Y;
                yiVar2.Z1 = new jp(spVar);
                yiVar2.J1(1, false);
                spVar.Y.r1();
                spVar.Y.j0.f0();
                spVar.Y.show();
                spVar.Z = new n7(spVar, spVar.getContext());
                o6 o6Var = new o6(spVar.getContext(), true, true, true);
                spVar.a0 = o6Var;
                o6Var.setTextSize(AndroidUtilities.dp(14.0f));
                spVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                spVar.a0.setGravity(17);
                o6 o6Var2 = spVar.a0;
                int i10 = j6.Oh;
                o6Var2.setTextColor(spVar.getThemedColor(i10));
                spVar.Z.addView(spVar.a0, a6.e(-1, -2, 17));
                n7 n7Var = spVar.Z;
                int dp = AndroidUtilities.dp(0.0f);
                int themedColor = spVar.getThemedColor(j6.d6);
                int k10 = i0.a.k(spVar.getThemedColor(i10), 76);
                n7Var.setBackground(j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
                spVar.Z.setOnClickListener(new bp(spVar, 0));
                spVar.Y.r1.addView(spVar.Z, a6.e(-1, -2, 80));
                return;
            case 9:
                k70 k70Var = (k70) this.b;
                w30 w30Var = (w30) view;
                if (w30Var.y) {
                    k70Var.j0 = null;
                    k70Var.f0.l(w30Var.getUid());
                    k70Var.U.b(w30Var);
                    k70Var.a0(true);
                    AndroidUtilities.updateVisibleRows(k70Var.d);
                    return;
                }
                w30 w30Var2 = k70Var.j0;
                if (w30Var2 != null) {
                    w30Var2.a();
                }
                k70Var.j0 = w30Var;
                w30Var.b();
                return;
            default:
                ((f90) this.b).e.callOnClick();
                return;
        }
    }
}
