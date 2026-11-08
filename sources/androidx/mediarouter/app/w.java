package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import bi.x5;
import c8.ha;
import h9.f1;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.h3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.x50;
import org.telegram.ui.an;
import v4.d1;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                if (n0Var.M != null) {
                    n0Var.H.removeMessages(2);
                }
                n0Var.M = e0Var.v;
                boolean isActivated = view.isActivated();
                boolean z9 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) n0Var.N.get(e0Var.v.c);
                    r9 = num == null ? 1 : Math.max(1, num.intValue());
                }
                e0Var.u(z9);
                e0Var.x.setProgress(r9);
                e0Var.v.j(r9);
                n0Var.H.sendEmptyMessageDelayed(2, 500L);
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
                org.telegram.ui.Components.n b10 = c10.d.b(vVar);
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
                boolean z10 = !v;
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
                    org.telegram.ui.Components.n b11 = c11.d.b(vVar2);
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
                    org.telegram.ui.Components.n b12 = c12.d.b(vVar3);
                    if (DesugarCollections.unmodifiableList(c12.d.v).contains(vVar3) || b12 == null || (oVar3 = (s4.o) b12.a) == null || !oVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + vVar3);
                    } else {
                        ((s4.p) c12.e).m(vVar3.b);
                    }
                }
                k0Var.w(z10, !e10);
                if (e10) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(l0Var.x.r.v);
                    for (s4.v vVar4 : DesugarCollections.unmodifiableList(k0Var.v.v)) {
                        if (unmodifiableList.contains(vVar4) != z10) {
                            e0 e0Var2 = (e0) l0Var.x.L.get(vVar4.c);
                            if (e0Var2 instanceof k0) {
                                ((k0) e0Var2).w(z10, true);
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
                        if (unmodifiableList2.contains((s4.v) it.next()) != z10) {
                            max += !v ? 1 : -1;
                        }
                    }
                } else {
                    max += v ? -1 : 1;
                }
                boolean z11 = n0Var2.i0 && DesugarCollections.unmodifiableList(n0Var2.r.v).size() > 1;
                boolean z12 = n0Var2.i0 && max >= 2;
                if (z11 != z12) {
                    d1 K = n0Var2.I.K(0);
                    if (K instanceof h0) {
                        h0 h0Var = (h0) K;
                        l0Var.D(z12 ? h0Var.A : 0, h0Var.a);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) obj;
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
                h3 h3Var = ((Toolbar) obj).e0;
                l.m mVar = h3Var != null ? h3Var.b : null;
                if (mVar != null) {
                    mVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                if (!(view.getTag() instanceof MenuItem) || (onMenuItemClickListener = ((i4) obj).K) == null) {
                    return;
                }
                onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
                return;
            case 9:
                vo voVar = (vo) obj;
                an anVar = voVar.r1;
                di diVar = new di(anVar.getParentActivity(), anVar, false, false, false, anVar.getResourceProvider());
                voVar.O1 = diVar;
                diVar.n = true;
                diVar.A1(id.M0(2131752139, null));
                di diVar2 = voVar.O1;
                diVar2.T3 = new oo(voVar);
                diVar2.y1(1, false);
                voVar.O1.e1();
                voVar.O1.a2.i0();
                voVar.O1.show();
                voVar.P1 = new x5(voVar, voVar.getContext());
                j6 j6Var = new j6(voVar.getContext(), true, true, true);
                voVar.Q1 = j6Var;
                j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                voVar.Q1.setText(id.M0(2131745540, null));
                voVar.Q1.setGravity(17);
                j6 j6Var2 = voVar.Q1;
                int i10 = k6.Ci;
                r6.Z(j6Var2, i10, voVar.I0);
                voVar.P1.addView(voVar.Q1, ha.e(-1, -2, 17));
                x5 x5Var = voVar.P1;
                int L = org.telegram.messenger.g0.L(0.0f);
                int i11 = k6.d6;
                int w02 = k6.w0(i11, voVar.I0);
                int o4 = i0.a.o(k6.w0(i10, voVar.I0), 76);
                r6.R(x5Var, k6.k0(L, L, L, L, w02, o4, o4), r6.N(i11), r6.h(i10, 76), voVar.I0);
                voVar.P1.setOnClickListener(new fo(voVar, r9));
                voVar.O1.l3.addView(voVar.P1, ha.e(-1, -2, 80));
                return;
            case 10:
                boolean[] zArr = new boolean[1];
                hx hxVar = (hx) obj;
                hy hyVar = hxVar.F;
                f1 f1Var = new f1(hyVar.getContext(), (f6) null);
                LinearLayout linearLayout = new LinearLayout(hyVar.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                ImageView imageView = new ImageView(hyVar.getContext());
                imageView.setImageResource(R.drawable.smiles_info);
                linearLayout.addView(imageView, ha.t(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(hyVar.getContext());
                textView.setText(id.M0(2131751165, null));
                textView.setTextSize(1, 15.0f);
                r6.V(textView, k6.n5, hyVar.Z1);
                textView.setGravity(id.a0 ? 5 : 3);
                textView.setTypeface(org.telegram.messenger.g0.o());
                linearLayout.addView(textView, ha.t(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(hyVar.getContext());
                textView2.setText(org.telegram.messenger.g0.X2(id.M0(2131751164, null)));
                textView2.setTextSize(1, 15.0f);
                r6.V(textView2, k6.j5, hyVar.Z1);
                textView2.setGravity(id.a0 ? 5 : 3);
                linearLayout.addView(textView2, ha.t(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(hyVar.getContext());
                Object obj2 = hxVar.x;
                if (obj2 == null) {
                    obj2 = hyVar.W0;
                }
                textView3.setText(id.a0("EmojiSuggestionsUrl", null, 2131751163, obj2));
                textView3.setTextSize(1, 15.0f);
                r6.V(textView3, k6.k5, hyVar.Z1);
                textView3.setGravity(id.a0 ? 5 : 3);
                linearLayout.addView(textView3, ha.t(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new dx(this, zArr, f1Var));
                v2 v2Var = (v2) f1Var.b;
                v2Var.N = linearLayout;
                v2Var.show();
                return;
            case 11:
                x50 x50Var = (x50) obj;
                c20 c20Var = (c20) view;
                if (c20Var.D) {
                    x50Var.a2 = null;
                    x50Var.W1.l(c20Var.getUid());
                    x50Var.L1.b(c20Var);
                    x50Var.S0(true);
                    org.telegram.messenger.g0.b4(x50Var.k1);
                    return;
                }
                c20 c20Var2 = x50Var.a2;
                if (c20Var2 != null) {
                    c20Var2.a();
                }
                x50Var.a2 = c20Var;
                c20Var.b();
                return;
            default:
                ((q70) obj).e.callOnClick();
                return;
        }
    }
}
