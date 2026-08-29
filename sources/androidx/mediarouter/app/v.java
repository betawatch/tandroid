package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import bg.d1;
import f2.n1;
import i7.f6;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.j3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xo;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v(Object obj, int i10) {
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
                ((b0) this.b).dismiss();
                return;
            case 1:
                e0 e0Var = (e0) this.b;
                m0 m0Var = e0Var.y;
                if (m0Var.I != null) {
                    m0Var.D.removeMessages(2);
                }
                m0Var.I = e0Var.v;
                boolean isActivated = view.isActivated();
                boolean z10 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) m0Var.J.get(e0Var.v.c);
                    max = num == null ? 1 : Math.max(1, num.intValue());
                } else {
                    max = 0;
                }
                e0Var.u(z10);
                e0Var.x.setProgress(max);
                e0Var.v.j(max);
                m0Var.D.sendEmptyMessageDelayed(2, 500L);
                return;
            case 2:
                f0 f0Var = (f0) this.b;
                c2.d0 d0Var = f0Var.B.w.f;
                c2.b0 b0Var = f0Var.A;
                d0Var.getClass();
                if (b0Var == null) {
                    throw new NullPointerException("route must not be null");
                }
                c2.d0.b();
                c2.e c3 = c2.d0.c();
                if (!(c3.e instanceof c2.r)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                za.c b10 = c3.d.b(b0Var);
                if (b10 == null || (qVar = (c2.q) b10.b) == null || !qVar.e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((c2.r) c3.e).o(Collections.singletonList(b0Var.b));
                }
                f0Var.w.setVisibility(4);
                f0Var.x.setVisibility(0);
                return;
            case 3:
                j0 j0Var = (j0) this.b;
                k0 k0Var = j0Var.I;
                boolean v = j0Var.v(j0Var.v);
                boolean z11 = !v;
                boolean e10 = j0Var.v.e();
                if (v) {
                    c2.d0 d0Var2 = k0Var.w.f;
                    c2.b0 b0Var2 = j0Var.v;
                    d0Var2.getClass();
                    if (b0Var2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    c2.d0.b();
                    c2.e c6 = c2.d0.c();
                    if (!(c6.e instanceof c2.r)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    za.c b11 = c6.d.b(b0Var2);
                    if (!DesugarCollections.unmodifiableList(c6.d.v).contains(b0Var2) || b11 == null || ((qVar2 = (c2.q) b11.b) != null && !qVar2.c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + b0Var2);
                    } else if (DesugarCollections.unmodifiableList(c6.d.v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((c2.r) c6.e).n(b0Var2.b);
                    }
                } else {
                    c2.d0 d0Var3 = k0Var.w.f;
                    c2.b0 b0Var3 = j0Var.v;
                    d0Var3.getClass();
                    if (b0Var3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    c2.d0.b();
                    c2.e c10 = c2.d0.c();
                    if (!(c10.e instanceof c2.r)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    za.c b12 = c10.d.b(b0Var3);
                    if (DesugarCollections.unmodifiableList(c10.d.v).contains(b0Var3) || b12 == null || (qVar3 = (c2.q) b12.b) == null || !qVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + b0Var3);
                    } else {
                        ((c2.r) c10.e).m(b0Var3.b);
                    }
                }
                j0Var.w(z11, !e10);
                if (e10) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(k0Var.w.r.v);
                    for (c2.b0 b0Var4 : DesugarCollections.unmodifiableList(j0Var.v.v)) {
                        if (unmodifiableList.contains(b0Var4) != z11) {
                            e0 e0Var2 = (e0) k0Var.w.H.get(b0Var4.c);
                            if (e0Var2 instanceof j0) {
                                ((j0) e0Var2).w(z11, true);
                            }
                        }
                    }
                }
                m0 m0Var2 = k0Var.w;
                c2.b0 b0Var5 = j0Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(m0Var2.r.v);
                int max2 = Math.max(1, unmodifiableList2.size());
                if (b0Var5.e()) {
                    Iterator it = DesugarCollections.unmodifiableList(b0Var5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((c2.b0) it.next()) != z11) {
                            max2 += !v ? 1 : -1;
                        }
                    }
                } else {
                    max2 += v ? -1 : 1;
                }
                boolean z12 = m0Var2.e0 && DesugarCollections.unmodifiableList(m0Var2.r.v).size() > 1;
                boolean z13 = m0Var2.e0 && max2 >= 2;
                if (z12 != z13) {
                    n1 K = m0Var2.E.K(0);
                    if (K instanceof g0) {
                        g0 g0Var = (g0) K;
                        k0Var.D(z13 ? g0Var.A : 0, g0Var.a);
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
                j3 j3Var = ((Toolbar) this.b).a0;
                l.m mVar = j3Var == null ? null : j3Var.b;
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                gp gpVar = (gp) this.b;
                tn tnVar = gpVar.v;
                ni niVar = new ni(tnVar.getParentActivity(), tnVar, false, false, false, tnVar.getResourceProvider());
                gpVar.U = niVar;
                niVar.drawNavigationBar = true;
                niVar.L1(LocaleController.getString(R.string.ChooseBackground));
                ni niVar2 = gpVar.U;
                niVar2.V1 = new xo(gpVar);
                niVar2.J1(1, false);
                gpVar.U.r1();
                gpVar.U.f0.f0();
                gpVar.U.show();
                gpVar.V = new d1(gpVar, gpVar.getContext());
                o6 o6Var = new o6(gpVar.getContext(), true, true, true);
                gpVar.W = o6Var;
                o6Var.setTextSize(AndroidUtilities.dp(14.0f));
                gpVar.W.setText(LocaleController.getString(R.string.SetColorAsBackground));
                gpVar.W.setGravity(17);
                o6 o6Var2 = gpVar.W;
                int i10 = g6.Oh;
                o6Var2.setTextColor(gpVar.getThemedColor(i10));
                gpVar.V.addView(gpVar.W, f6.e(-1, -2, 17));
                d1 d1Var = gpVar.V;
                int dp = AndroidUtilities.dp(0.0f);
                int themedColor = gpVar.getThemedColor(g6.d6);
                int k9 = i0.a.k(gpVar.getThemedColor(i10), 76);
                d1Var.setBackground(g6.i0(dp, dp, dp, dp, themedColor, k9, k9));
                gpVar.V.setOnClickListener(new po(gpVar, 0));
                gpVar.U.n1.addView(gpVar.V, f6.e(-1, -2, 80));
                return;
            case 9:
                x60 x60Var = (x60) this.b;
                j30 j30Var = (j30) view;
                if (j30Var.y) {
                    x60Var.f0 = null;
                    x60Var.b0.l(j30Var.getUid());
                    x60Var.Q.b(j30Var);
                    x60Var.a0(true);
                    AndroidUtilities.updateVisibleRows(x60Var.d);
                    return;
                }
                j30 j30Var2 = x60Var.f0;
                if (j30Var2 != null) {
                    j30Var2.a();
                }
                x60Var.f0 = j30Var;
                j30Var.b();
                return;
            default:
                ((r80) this.b).e.callOnClick();
                return;
        }
    }
}
