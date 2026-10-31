package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.g3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.q4;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.rx;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.ux;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.wo;
import org.telegram.ui.un;
import s4.c1;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        p4.o oVar;
        p4.o oVar2;
        p4.o oVar3;
        Message message;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        int i10 = this.a;
        Message message2 = null;
        message2 = null;
        Object obj = this.b;
        switch (i10) {
            case 0:
                ((c0) obj).dismiss();
                return;
            case 1:
                f0 f0Var = (f0) obj;
                o0 o0Var = f0Var.y;
                if (o0Var.M != null) {
                    o0Var.H.removeMessages(2);
                }
                o0Var.M = f0Var.v;
                boolean isActivated = view.isActivated();
                boolean z10 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) o0Var.N.get(f0Var.v.c);
                    r9 = num == null ? 1 : Math.max(1, num.intValue());
                }
                f0Var.u(z10);
                f0Var.x.setProgress(r9);
                f0Var.v.j(r9);
                o0Var.H.sendEmptyMessageDelayed(2, 500L);
                return;
            case 2:
                h0 h0Var = (h0) obj;
                p4.y yVar = h0Var.B.x.f;
                p4.w wVar = h0Var.A;
                yVar.getClass();
                if (wVar == null) {
                    throw new NullPointerException("route must not be null");
                }
                p4.y.b();
                p4.e c10 = p4.y.c();
                if (!(c10.e instanceof p4.p)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                k2.m0 b10 = c10.d.b(wVar);
                if (b10 == null || (oVar = (p4.o) b10.a) == null || !oVar.e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((p4.p) c10.e).o(Collections.singletonList(wVar.b));
                }
                h0Var.w.setVisibility(4);
                h0Var.x.setVisibility(0);
                return;
            case 3:
                l0 l0Var = (l0) obj;
                m0 m0Var = l0Var.I;
                boolean v = l0Var.v(l0Var.v);
                boolean z11 = !v;
                boolean e = l0Var.v.e();
                if (v) {
                    p4.y yVar2 = m0Var.x.f;
                    p4.w wVar2 = l0Var.v;
                    yVar2.getClass();
                    if (wVar2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    p4.y.b();
                    p4.e c11 = p4.y.c();
                    if (!(c11.e instanceof p4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    k2.m0 b11 = c11.d.b(wVar2);
                    if (!DesugarCollections.unmodifiableList(c11.d.v).contains(wVar2) || b11 == null || ((oVar2 = (p4.o) b11.a) != null && !oVar2.c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + wVar2);
                    } else if (DesugarCollections.unmodifiableList(c11.d.v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((p4.p) c11.e).n(wVar2.b);
                    }
                } else {
                    p4.y yVar3 = m0Var.x.f;
                    p4.w wVar3 = l0Var.v;
                    yVar3.getClass();
                    if (wVar3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    p4.y.b();
                    p4.e c12 = p4.y.c();
                    if (!(c12.e instanceof p4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    k2.m0 b12 = c12.d.b(wVar3);
                    if (DesugarCollections.unmodifiableList(c12.d.v).contains(wVar3) || b12 == null || (oVar3 = (p4.o) b12.a) == null || !oVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + wVar3);
                    } else {
                        ((p4.p) c12.e).m(wVar3.b);
                    }
                }
                l0Var.w(z11, !e);
                if (e) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(m0Var.x.r.v);
                    for (p4.w wVar4 : DesugarCollections.unmodifiableList(l0Var.v.v)) {
                        if (unmodifiableList.contains(wVar4) != z11) {
                            f0 f0Var2 = (f0) m0Var.x.L.get(wVar4.c);
                            if (f0Var2 instanceof l0) {
                                ((l0) f0Var2).w(z11, true);
                            }
                        }
                    }
                }
                o0 o0Var2 = m0Var.x;
                p4.w wVar5 = l0Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(o0Var2.r.v);
                int max = Math.max(1, unmodifiableList2.size());
                if (wVar5.e()) {
                    Iterator it = DesugarCollections.unmodifiableList(wVar5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((p4.w) it.next()) != z11) {
                            max += !v ? 1 : -1;
                        }
                    }
                } else {
                    max += v ? -1 : 1;
                }
                boolean z12 = o0Var2.i0 && DesugarCollections.unmodifiableList(o0Var2.r.v).size() > 1;
                boolean z13 = o0Var2.i0 && max >= 2;
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
                g3 g3Var = ((Toolbar) obj).e0;
                l.n nVar = g3Var != null ? g3Var.b : null;
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                if (!(view.getTag() instanceof MenuItem) || (onMenuItemClickListener = ((q4) obj).K) == null) {
                    return;
                }
                onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
                return;
            case 9:
                dp dpVar = (dp) obj;
                un unVar = dpVar.r1;
                bi biVar = new bi(unVar.getParentActivity(), unVar, false, false, false, unVar.getResourceProvider());
                dpVar.O1 = biVar;
                biVar.n = true;
                biVar.z1(cd.L0(2131752139, null));
                bi biVar2 = dpVar.O1;
                biVar2.T3 = new wo(dpVar);
                biVar2.x1(1, false);
                dpVar.O1.d1();
                dpVar.O1.a2.g0();
                dpVar.O1.show();
                dpVar.P1 = new fg.i(dpVar, dpVar.getContext());
                f6 f6Var = new f6(dpVar.getContext(), true, true, true);
                dpVar.Q1 = f6Var;
                f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
                dpVar.Q1.setText(cd.L0(2131745554, null));
                dpVar.Q1.setGravity(17);
                f6 f6Var2 = dpVar.Q1;
                int i11 = t6.Ci;
                a7.Z(f6Var2, i11, dpVar.I0);
                dpVar.P1.addView(dpVar.Q1, b6.e(-1, -2, 17));
                fg.i iVar = dpVar.P1;
                int L = org.telegram.messenger.i0.L(0.0f);
                int i12 = t6.d6;
                int w02 = t6.w0(i12, dpVar.I0);
                int o10 = i0.b.o(t6.w0(i11, dpVar.I0), 76);
                a7.R(iVar, t6.k0(L, L, L, L, w02, o10, o10), a7.N(i12), a7.h(i11, 76), dpVar.I0);
                dpVar.P1.setOnClickListener(new no(dpVar, r9));
                dpVar.O1.l3.addView(dpVar.P1, b6.e(-1, -2, 80));
                return;
            case 10:
                boolean[] zArr = new boolean[1];
                ux uxVar = (ux) obj;
                vy vyVar = uxVar.F;
                l2.f fVar = new l2.f(vyVar.getContext(), (p6) null);
                LinearLayout linearLayout = new LinearLayout(vyVar.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.i0.L(21.0f), 0, org.telegram.messenger.i0.L(21.0f), 0);
                ImageView imageView = new ImageView(vyVar.getContext());
                imageView.setImageResource(R.drawable.smiles_info);
                linearLayout.addView(imageView, b6.t(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(vyVar.getContext());
                textView.setText(cd.L0(2131751165, null));
                textView.setTextSize(1, 15.0f);
                a7.V(textView, t6.n5, vyVar.Z1);
                textView.setGravity(cd.X ? 5 : 3);
                textView.setTypeface(org.telegram.messenger.i0.o());
                linearLayout.addView(textView, b6.t(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(vyVar.getContext());
                textView2.setText(org.telegram.messenger.i0.W2(cd.L0(2131751164, null)));
                textView2.setTextSize(1, 15.0f);
                a7.V(textView2, t6.j5, vyVar.Z1);
                textView2.setGravity(cd.X ? 5 : 3);
                linearLayout.addView(textView2, b6.t(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(vyVar.getContext());
                Object obj2 = uxVar.x;
                if (obj2 == null) {
                    obj2 = vyVar.W0;
                }
                textView3.setText(cd.a0("EmojiSuggestionsUrl", null, 2131751163, obj2));
                textView3.setTextSize(1, 15.0f);
                a7.V(textView3, t6.k5, vyVar.Z1);
                textView3.setGravity(cd.X ? 5 : 3);
                linearLayout.addView(textView3, b6.t(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new rx(this, zArr, fVar));
                z2 z2Var = (z2) fVar.b;
                z2Var.N = linearLayout;
                z2Var.show();
                return;
            case 11:
                m60 m60Var = (m60) obj;
                s20 s20Var = (s20) view;
                if (s20Var.D) {
                    m60Var.a2 = null;
                    m60Var.W1.l(s20Var.getUid());
                    m60Var.L1.b(s20Var);
                    m60Var.S0(true);
                    org.telegram.messenger.i0.a4(m60Var.k1);
                    return;
                }
                s20 s20Var2 = m60Var.a2;
                if (s20Var2 != null) {
                    s20Var2.a();
                }
                m60Var.a2 = s20Var;
                s20Var.b();
                return;
            default:
                ((j80) obj).e.callOnClick();
                return;
        }
    }
}
