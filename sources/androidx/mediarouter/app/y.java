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
import org.telegram.ui.Components.d70;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.zo;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                c2.d0 d0Var = i0Var.B.w.f;
                c2.b0 b0Var = i0Var.A;
                d0Var.getClass();
                if (b0Var == null) {
                    throw new NullPointerException("route must not be null");
                }
                c2.d0.b();
                c2.e c3 = c2.d0.c();
                if (!(c3.e instanceof c2.r)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                bb.b b10 = c3.d.b(b0Var);
                if (b10 == null || (qVar = (c2.q) b10.b) == null || !qVar.e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((c2.r) c3.e).o(Collections.singletonList(b0Var.b));
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
                    c2.d0 d0Var2 = n0Var.w.f;
                    c2.b0 b0Var2 = m0Var.v;
                    d0Var2.getClass();
                    if (b0Var2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    c2.d0.b();
                    c2.e c10 = c2.d0.c();
                    if (!(c10.e instanceof c2.r)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    bb.b b11 = c10.d.b(b0Var2);
                    if (!DesugarCollections.unmodifiableList(c10.d.v).contains(b0Var2) || b11 == null || ((qVar2 = (c2.q) b11.b) != null && !qVar2.c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + b0Var2);
                    } else if (DesugarCollections.unmodifiableList(c10.d.v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((c2.r) c10.e).n(b0Var2.b);
                    }
                } else {
                    c2.d0 d0Var3 = n0Var.w.f;
                    c2.b0 b0Var3 = m0Var.v;
                    d0Var3.getClass();
                    if (b0Var3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    c2.d0.b();
                    c2.e c11 = c2.d0.c();
                    if (!(c11.e instanceof c2.r)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    bb.b b12 = c11.d.b(b0Var3);
                    if (DesugarCollections.unmodifiableList(c11.d.v).contains(b0Var3) || b12 == null || (qVar3 = (c2.q) b12.b) == null || !qVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + b0Var3);
                    } else {
                        ((c2.r) c11.e).m(b0Var3.b);
                    }
                }
                m0Var.w(z10, !e);
                if (e) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(n0Var.w.r.v);
                    for (c2.b0 b0Var4 : DesugarCollections.unmodifiableList(m0Var.v.v)) {
                        if (unmodifiableList.contains(b0Var4) != z10) {
                            h0 h0Var2 = (h0) n0Var.w.I.get(b0Var4.c);
                            if (h0Var2 instanceof m0) {
                                ((m0) h0Var2).w(z10, true);
                            }
                        }
                    }
                }
                p0 p0Var2 = n0Var.w;
                c2.b0 b0Var5 = m0Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(p0Var2.r.v);
                int max2 = Math.max(1, unmodifiableList2.size());
                if (b0Var5.e()) {
                    Iterator it = DesugarCollections.unmodifiableList(b0Var5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((c2.b0) it.next()) != z10) {
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
                jp jpVar = (jp) this.b;
                zn znVar = jpVar.v;
                li liVar = new li(znVar.getParentActivity(), znVar, false, false, false, znVar.getResourceProvider());
                jpVar.V = liVar;
                liVar.drawNavigationBar = true;
                liVar.L1(LocaleController.getString(R.string.ChooseBackground));
                li liVar2 = jpVar.V;
                liVar2.W1 = new zo(jpVar);
                liVar2.J1(1, false);
                jpVar.V.r1();
                jpVar.V.g0.f0();
                jpVar.V.show();
                jpVar.W = new ah.e(jpVar, jpVar.getContext());
                k6 k6Var = new k6(jpVar.getContext(), true, true, true);
                jpVar.X = k6Var;
                k6Var.setTextSize(AndroidUtilities.dp(14.0f));
                jpVar.X.setText(LocaleController.getString(R.string.SetColorAsBackground));
                jpVar.X.setGravity(17);
                k6 k6Var2 = jpVar.X;
                int i10 = j6.Oh;
                k6Var2.setTextColor(jpVar.getThemedColor(i10));
                jpVar.W.addView(jpVar.X, b6.e(-1, -2, 17));
                ah.e eVar2 = jpVar.W;
                int dp = AndroidUtilities.dp(0.0f);
                int themedColor = jpVar.getThemedColor(j6.d6);
                int k10 = i0.a.k(jpVar.getThemedColor(i10), 76);
                eVar2.setBackground(j6.i0(dp, dp, dp, dp, themedColor, k10, k10));
                jpVar.W.setOnClickListener(new qo(jpVar, 0));
                jpVar.V.o1.addView(jpVar.W, b6.e(-1, -2, 80));
                return;
            case 9:
                d70 d70Var = (d70) this.b;
                o30 o30Var = (o30) view;
                if (o30Var.y) {
                    d70Var.g0 = null;
                    d70Var.c0.l(o30Var.getUid());
                    d70Var.R.b(o30Var);
                    d70Var.a0(true);
                    AndroidUtilities.updateVisibleRows(d70Var.d);
                    return;
                }
                o30 o30Var2 = d70Var.g0;
                if (o30Var2 != null) {
                    o30Var2.a();
                }
                d70Var.g0 = o30Var;
                o30Var.b();
                return;
            default:
                ((x80) this.b).e.callOnClick();
                return;
        }
    }
}
