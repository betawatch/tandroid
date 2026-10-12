package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ji.w4;
import m.h3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.qp;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.z30;
import org.telegram.ui.Components.zp;
import org.telegram.ui.fo;
import s4.b1;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                p4.y yVar = g0Var.B.w.f;
                p4.w wVar = g0Var.A;
                yVar.getClass();
                if (wVar == null) {
                    throw new NullPointerException("route must not be null");
                }
                p4.y.b();
                p4.e c10 = p4.y.c();
                if (!(c10.e instanceof p4.p)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                w4 b10 = c10.d.b(wVar);
                if (b10 == null || (oVar = (p4.o) b10.b) == null || !oVar.e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((p4.p) c10.e).o(Collections.singletonList(wVar.b));
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
                    p4.y yVar2 = l0Var.w.f;
                    p4.w wVar2 = k0Var.v;
                    yVar2.getClass();
                    if (wVar2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    p4.y.b();
                    p4.e c11 = p4.y.c();
                    if (!(c11.e instanceof p4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    w4 b11 = c11.d.b(wVar2);
                    if (!DesugarCollections.unmodifiableList(c11.d.v).contains(wVar2) || b11 == null || ((oVar2 = (p4.o) b11.b) != null && !oVar2.c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + wVar2);
                    } else if (DesugarCollections.unmodifiableList(c11.d.v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((p4.p) c11.e).n(wVar2.b);
                    }
                } else {
                    p4.y yVar3 = l0Var.w.f;
                    p4.w wVar3 = k0Var.v;
                    yVar3.getClass();
                    if (wVar3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    p4.y.b();
                    p4.e c12 = p4.y.c();
                    if (!(c12.e instanceof p4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    w4 b12 = c12.d.b(wVar3);
                    if (DesugarCollections.unmodifiableList(c12.d.v).contains(wVar3) || b12 == null || (oVar3 = (p4.o) b12.b) == null || !oVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + wVar3);
                    } else {
                        ((p4.p) c12.e).m(wVar3.b);
                    }
                }
                k0Var.w(z11, !e);
                if (e) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(l0Var.w.r.v);
                    for (p4.w wVar4 : DesugarCollections.unmodifiableList(k0Var.v.v)) {
                        if (unmodifiableList.contains(wVar4) != z11) {
                            f0 f0Var2 = (f0) l0Var.w.L.get(wVar4.c);
                            if (f0Var2 instanceof k0) {
                                ((k0) f0Var2).w(z11, true);
                            }
                        }
                    }
                }
                n0 n0Var2 = l0Var.w;
                p4.w wVar5 = k0Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(n0Var2.r.v);
                int max2 = Math.max(1, unmodifiableList2.size());
                if (wVar5.e()) {
                    Iterator it = DesugarCollections.unmodifiableList(wVar5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((p4.w) it.next()) != z11) {
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
                h3 h3Var = ((Toolbar) this.b).e0;
                l.m mVar = h3Var == null ? null : h3Var.b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                zp zpVar = (zp) this.b;
                fo foVar = zpVar.v;
                vi viVar = new vi(foVar.getParentActivity(), foVar, false, false, false, foVar.getResourceProvider());
                zpVar.Y = viVar;
                viVar.drawNavigationBar = true;
                viVar.P1(LocaleController.getString(R.string.ChooseBackground));
                vi viVar2 = zpVar.Y;
                viVar2.c2 = new qp(zpVar);
                viVar2.N1(1, false);
                zpVar.Y.t1();
                zpVar.Y.j0.f0();
                zpVar.Y.show();
                zpVar.Z = new ah.v(zpVar, zpVar.getContext());
                s6 s6Var = new s6(zpVar.getContext(), true, true, true);
                zpVar.a0 = s6Var;
                s6Var.setTextSize(AndroidUtilities.dp(14.0f));
                zpVar.a0.setText(LocaleController.getString(R.string.SetColorAsBackground));
                zpVar.a0.setGravity(17);
                s6 s6Var2 = zpVar.a0;
                int i10 = g6.Oh;
                s6Var2.setTextColor(zpVar.getThemedColor(i10));
                zpVar.Z.addView(zpVar.a0, a6.e(-1, -2, 17));
                ah.v vVar = zpVar.Z;
                int dp = AndroidUtilities.dp(0.0f);
                int themedColor = zpVar.getThemedColor(g6.d6);
                int k10 = i0.a.k(zpVar.getThemedColor(i10), 76);
                vVar.setBackground(g6.j0(dp, dp, dp, dp, themedColor, k10, k10));
                zpVar.Z.setOnClickListener(new ip(zpVar, 0));
                zpVar.Y.u1.addView(zpVar.Z, a6.e(-1, -2, 80));
                return;
            case 9:
                a80 a80Var = (a80) this.b;
                z30 z30Var = (z30) view;
                if (z30Var.y) {
                    a80Var.j0 = null;
                    a80Var.f0.l(z30Var.getUid());
                    a80Var.U.b(z30Var);
                    a80Var.b0(true);
                    AndroidUtilities.updateVisibleRows(a80Var.d);
                    return;
                }
                z30 z30Var2 = a80Var.j0;
                if (z30Var2 != null) {
                    z30Var2.a();
                }
                a80Var.j0 = z30Var;
                z30Var.b();
                return;
            default:
                ((w90) this.b).e.callOnClick();
                return;
        }
    }
}
