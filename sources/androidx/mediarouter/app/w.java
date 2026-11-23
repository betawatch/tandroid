package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c8.na;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.f3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j4;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.uo;
import org.telegram.ui.bn;
import v4.f1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class w implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s4.o oVar;
        s4.o oVar2;
        s4.o oVar3;
        Message message;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        int i7 = this.a;
        Message message2 = null;
        message2 = null;
        Object obj = this.b;
        switch (i7) {
            case 0:
                ((b0) obj).dismiss();
                return;
            case 1:
                e0 e0Var = (e0) obj;
                n0 n0Var = e0Var.y;
                if (n0Var.N != null) {
                    n0Var.I.removeMessages(2);
                }
                n0Var.N = e0Var.v;
                boolean isActivated = view.isActivated();
                boolean z10 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) n0Var.O.get(e0Var.v.c);
                    r9 = num == null ? 1 : Math.max(1, num.intValue());
                }
                e0Var.u(z10);
                e0Var.x.setProgress(r9);
                e0Var.v.j(r9);
                n0Var.I.sendEmptyMessageDelayed(2, 500L);
                return;
            case 2:
                g0 g0Var = (g0) obj;
                s4.x xVar = g0Var.B.x.f;
                s4.v vVar = g0Var.A;
                xVar.getClass();
                if (vVar == null) {
                    throw new NullPointerException("route must not be null");
                }
                s4.x.b();
                s4.e c10 = s4.x.c();
                if (!(c10.e instanceof s4.p)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                i5 b10 = c10.d.b(vVar);
                if (b10 == null || (oVar = (s4.o) b10.a) == null || !oVar.e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((s4.p) c10.e).o(Collections.singletonList(vVar.b));
                }
                g0Var.w.setVisibility(4);
                g0Var.x.setVisibility(0);
                return;
            case 3:
                k0 k0Var = (k0) obj;
                l0 l0Var = k0Var.I;
                boolean v = k0Var.v(k0Var.v);
                boolean z11 = !v;
                boolean e10 = k0Var.v.e();
                if (v) {
                    s4.x xVar2 = l0Var.x.f;
                    s4.v vVar2 = k0Var.v;
                    xVar2.getClass();
                    if (vVar2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    s4.x.b();
                    s4.e c11 = s4.x.c();
                    if (!(c11.e instanceof s4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    i5 b11 = c11.d.b(vVar2);
                    if (!DesugarCollections.unmodifiableList(c11.d.v).contains(vVar2) || b11 == null || ((oVar2 = (s4.o) b11.a) != null && !oVar2.c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + vVar2);
                    } else if (DesugarCollections.unmodifiableList(c11.d.v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((s4.p) c11.e).n(vVar2.b);
                    }
                } else {
                    s4.x xVar3 = l0Var.x.f;
                    s4.v vVar3 = k0Var.v;
                    xVar3.getClass();
                    if (vVar3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    s4.x.b();
                    s4.e c12 = s4.x.c();
                    if (!(c12.e instanceof s4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    i5 b12 = c12.d.b(vVar3);
                    if (DesugarCollections.unmodifiableList(c12.d.v).contains(vVar3) || b12 == null || (oVar3 = (s4.o) b12.a) == null || !oVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + vVar3);
                    } else {
                        ((s4.p) c12.e).m(vVar3.b);
                    }
                }
                k0Var.w(z11, !e10);
                if (e10) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(l0Var.x.r.v);
                    for (s4.v vVar4 : DesugarCollections.unmodifiableList(k0Var.v.v)) {
                        if (unmodifiableList.contains(vVar4) != z11) {
                            e0 e0Var2 = (e0) l0Var.x.M.get(vVar4.c);
                            if (e0Var2 instanceof k0) {
                                ((k0) e0Var2).w(z11, true);
                            }
                        }
                    }
                }
                n0 n0Var2 = l0Var.x;
                s4.v vVar5 = k0Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(n0Var2.r.v);
                int max = Math.max(1, unmodifiableList2.size());
                if (vVar5.e()) {
                    Iterator it = DesugarCollections.unmodifiableList(vVar5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((s4.v) it.next()) != z11) {
                            max += !v ? 1 : -1;
                        }
                    }
                } else {
                    max += v ? -1 : 1;
                }
                boolean z12 = n0Var2.j0 && DesugarCollections.unmodifiableList(n0Var2.r.v).size() > 1;
                boolean z13 = n0Var2.j0 && max >= 2;
                if (z12 != z13) {
                    f1 K = n0Var2.J.K(0);
                    if (K instanceof h0) {
                        h0 h0Var = (h0) K;
                        l0Var.D(z13 ? h0Var.A : 0, h0Var.a);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) obj;
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
                g.e eVar = (g.e) obj;
                if (view == eVar.i && (message = eVar.k) != null) {
                    message2 = Message.obtain(message);
                }
                if (message2 != null) {
                    message2.sendToTarget();
                }
                eVar.z.obtainMessage(1, eVar.b).sendToTarget();
                return;
            case 6:
                ((k.a) obj).b();
                return;
            case 7:
                f3 f3Var = ((Toolbar) obj).f0;
                l.m mVar = f3Var != null ? f3Var.b : null;
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                if (!(view.getTag() instanceof MenuItem) || (onMenuItemClickListener = ((j4) obj).K) == null) {
                    return;
                }
                onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
                return;
            case 9:
                kp kpVar = (kp) obj;
                bn bnVar = kpVar.v1;
                ti tiVar = new ti(bnVar.getParentActivity(), bnVar, false, false, false, bnVar.getResourceProvider());
                kpVar.S1 = tiVar;
                tiVar.n = true;
                tiVar.B1(gd.N0(2131752127, null));
                ti tiVar2 = kpVar.S1;
                tiVar2.X3 = new dp(kpVar);
                tiVar2.z1(1, false);
                kpVar.S1.f1();
                kpVar.S1.e2.i0();
                kpVar.S1.show();
                kpVar.T1 = new ai.h0(kpVar, kpVar.getContext());
                n6 n6Var = new n6(kpVar.getContext(), true, true, true);
                kpVar.U1 = n6Var;
                n6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                kpVar.U1.setText(gd.N0(2131745341, null));
                kpVar.U1.setGravity(17);
                n6 n6Var2 = kpVar.U1;
                int i10 = org.telegram.ui.ActionBar.n6.Fi;
                u6.Y(n6Var2, i10, kpVar.J0);
                kpVar.T1.addView(kpVar.U1, na.e(-1, -2, 17));
                ai.h0 h0Var2 = kpVar.T1;
                int L = org.telegram.messenger.g0.L(0.0f);
                int i11 = org.telegram.ui.ActionBar.n6.d6;
                int w02 = org.telegram.ui.ActionBar.n6.w0(i11, kpVar.J0);
                int o4 = i0.a.o(org.telegram.ui.ActionBar.n6.w0(i10, kpVar.J0), 76);
                u6.Q(h0Var2, org.telegram.ui.ActionBar.n6.k0(L, L, L, L, w02, o4, o4), u6.M(i11), u6.g(i10, 76), kpVar.J0);
                kpVar.T1.setOnClickListener(new uo(kpVar, r9));
                kpVar.S1.p3.addView(kpVar.T1, na.e(-1, -2, 80));
                return;
            case 10:
                boolean[] zArr = new boolean[1];
                px pxVar = (px) obj;
                qy qyVar = pxVar.G;
                h6.o oVar4 = new h6.o(qyVar.getContext(), (i6) null);
                LinearLayout linearLayout = new LinearLayout(qyVar.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                ImageView imageView = new ImageView(qyVar.getContext());
                imageView.setImageResource(R.drawable.smiles_info);
                linearLayout.addView(imageView, na.t(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(qyVar.getContext());
                m10.l(15.0f, 2131751152, 1, textView, null);
                u6.U(textView, org.telegram.ui.ActionBar.n6.n5, qyVar.a2);
                textView.setGravity(gd.a0 ? 5 : 3);
                textView.setTypeface(org.telegram.messenger.g0.o());
                linearLayout.addView(textView, na.t(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(qyVar.getContext());
                textView2.setText(org.telegram.messenger.g0.W2(gd.N0(2131751151, null)));
                textView2.setTextSize(1, 15.0f);
                u6.U(textView2, org.telegram.ui.ActionBar.n6.j5, qyVar.a2);
                textView2.setGravity(gd.a0 ? 5 : 3);
                linearLayout.addView(textView2, na.t(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(qyVar.getContext());
                Object obj2 = pxVar.x;
                if (obj2 == null) {
                    obj2 = qyVar.X0;
                }
                textView3.setText(gd.a0("EmojiSuggestionsUrl", null, 2131751150, obj2));
                textView3.setTextSize(1, 15.0f);
                u6.U(textView3, org.telegram.ui.ActionBar.n6.k5, qyVar.a2);
                textView3.setGravity(gd.a0 ? 5 : 3);
                linearLayout.addView(textView3, na.t(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new mx(this, zArr, oVar4));
                ((w2) oVar4.b).O = linearLayout;
                oVar4.D0();
                return;
            case 11:
                i60 i60Var = (i60) obj;
                n20 n20Var = (n20) view;
                if (n20Var.E) {
                    i60Var.e2 = null;
                    i60Var.a2.l(n20Var.getUid());
                    i60Var.P1.b(n20Var);
                    i60Var.T0(true);
                    org.telegram.messenger.g0.Z3(i60Var.o1);
                    return;
                }
                n20 n20Var2 = i60Var.e2;
                if (n20Var2 != null) {
                    n20Var2.a();
                }
                i60Var.e2 = n20Var;
                n20Var.b();
                return;
            default:
                ((d80) obj).e.callOnClick();
                return;
        }
    }
}
