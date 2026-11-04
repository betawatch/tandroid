package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import b8.mf;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.f3;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.t2;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.ex;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.y00;
import org.telegram.ui.Components.y10;
import org.telegram.ui.wm;
import u4.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r4.o oVar;
        r4.o oVar2;
        r4.o oVar3;
        Message message;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        int i3 = this.a;
        Message message2 = null;
        message2 = null;
        Object obj = this.b;
        switch (i3) {
            case 0:
                ((c0) obj).dismiss();
                return;
            case 1:
                f0 f0Var = (f0) obj;
                o0 o0Var = f0Var.y;
                if (o0Var.N != null) {
                    o0Var.I.removeMessages(2);
                }
                o0Var.N = f0Var.v;
                boolean isActivated = view.isActivated();
                boolean z10 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) o0Var.O.get(f0Var.v.c);
                    r9 = num == null ? 1 : Math.max(1, num.intValue());
                }
                f0Var.u(z10);
                f0Var.x.setProgress(r9);
                f0Var.v.j(r9);
                o0Var.I.sendEmptyMessageDelayed(2, 500L);
                return;
            case 2:
                h0 h0Var = (h0) obj;
                r4.y yVar = h0Var.B.x.f;
                r4.w wVar = h0Var.A;
                yVar.getClass();
                if (wVar == null) {
                    throw new NullPointerException("route must not be null");
                }
                r4.y.b();
                r4.e c2 = r4.y.c();
                if (!(c2.e instanceof r4.p)) {
                    throw new IllegalStateException("There is no currently selected dynamic group route.");
                }
                y00 b10 = c2.d.b(wVar);
                if (b10 == null || (oVar = (r4.o) b10.a) == null || !oVar.e) {
                    Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                } else {
                    ((r4.p) c2.e).o(Collections.singletonList(wVar.b));
                }
                h0Var.w.setVisibility(4);
                h0Var.x.setVisibility(0);
                return;
            case 3:
                l0 l0Var = (l0) obj;
                m0 m0Var = l0Var.I;
                boolean v = l0Var.v(l0Var.v);
                boolean z11 = !v;
                boolean e10 = l0Var.v.e();
                if (v) {
                    r4.y yVar2 = m0Var.x.f;
                    r4.w wVar2 = l0Var.v;
                    yVar2.getClass();
                    if (wVar2 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    r4.y.b();
                    r4.e c10 = r4.y.c();
                    if (!(c10.e instanceof r4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    y00 b11 = c10.d.b(wVar2);
                    if (!DesugarCollections.unmodifiableList(c10.d.v).contains(wVar2) || b11 == null || ((oVar2 = (r4.o) b11.a) != null && !oVar2.c)) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + wVar2);
                    } else if (DesugarCollections.unmodifiableList(c10.d.v).size() <= 1) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                    } else {
                        ((r4.p) c10.e).n(wVar2.b);
                    }
                } else {
                    r4.y yVar3 = m0Var.x.f;
                    r4.w wVar3 = l0Var.v;
                    yVar3.getClass();
                    if (wVar3 == null) {
                        throw new NullPointerException("route must not be null");
                    }
                    r4.y.b();
                    r4.e c11 = r4.y.c();
                    if (!(c11.e instanceof r4.p)) {
                        throw new IllegalStateException("There is no currently selected dynamic group route.");
                    }
                    y00 b12 = c11.d.b(wVar3);
                    if (DesugarCollections.unmodifiableList(c11.d.v).contains(wVar3) || b12 == null || (oVar3 = (r4.o) b12.a) == null || !oVar3.d) {
                        Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + wVar3);
                    } else {
                        ((r4.p) c11.e).m(wVar3.b);
                    }
                }
                l0Var.w(z11, !e10);
                if (e10) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(m0Var.x.r.v);
                    for (r4.w wVar4 : DesugarCollections.unmodifiableList(l0Var.v.v)) {
                        if (unmodifiableList.contains(wVar4) != z11) {
                            f0 f0Var2 = (f0) m0Var.x.M.get(wVar4.c);
                            if (f0Var2 instanceof l0) {
                                ((l0) f0Var2).w(z11, true);
                            }
                        }
                    }
                }
                o0 o0Var2 = m0Var.x;
                r4.w wVar5 = l0Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(o0Var2.r.v);
                int max = Math.max(1, unmodifiableList2.size());
                if (wVar5.e()) {
                    Iterator it = DesugarCollections.unmodifiableList(wVar5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((r4.w) it.next()) != z11) {
                            max += !v ? 1 : -1;
                        }
                    }
                } else {
                    max += v ? -1 : 1;
                }
                boolean z12 = o0Var2.j0 && DesugarCollections.unmodifiableList(o0Var2.r.v).size() > 1;
                boolean z13 = o0Var2.j0 && max >= 2;
                if (z12 != z13) {
                    d1 K = o0Var2.J.K(0);
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
                ((k.a) obj).c();
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
                if (!(view.getTag() instanceof MenuItem) || (onMenuItemClickListener = ((i4) obj).K) == null) {
                    return;
                }
                onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
                return;
            case 9:
                vo voVar = (vo) obj;
                wm wmVar = voVar.s1;
                bi biVar = new bi(wmVar.getParentActivity(), wmVar, false, false, false, wmVar.getResourceProvider());
                voVar.P1 = biVar;
                biVar.n = true;
                biVar.A1(bd.M0(2131752139, null));
                bi biVar2 = voVar.P1;
                biVar2.U3 = new oo(voVar);
                biVar2.y1(1, false);
                voVar.P1.e1();
                voVar.P1.b2.i0();
                voVar.P1.show();
                voVar.Q1 = new ai.c0(voVar, voVar.getContext());
                h6 h6Var = new h6(voVar.getContext(), true, true, true);
                voVar.R1 = h6Var;
                h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                voVar.R1.setText(bd.M0(2131745547, null));
                voVar.R1.setGravity(17);
                h6 h6Var2 = voVar.R1;
                int i10 = k6.Ci;
                r6.Z(h6Var2, i10, voVar.J0);
                voVar.Q1.addView(voVar.R1, mf.e(-1, -2, 17));
                ai.c0 c0Var = voVar.Q1;
                int L = org.telegram.messenger.g0.L(0.0f);
                int i11 = k6.d6;
                int w02 = k6.w0(i11, voVar.J0);
                int o10 = i0.a.o(k6.w0(i10, voVar.J0), 76);
                r6.R(c0Var, k6.k0(L, L, L, L, w02, o10, o10), r6.N(i11), r6.h(i10, 76), voVar.J0);
                voVar.Q1.setOnClickListener(new eo(voVar, r9));
                voVar.P1.m3.addView(voVar.Q1, mf.e(-1, -2, 80));
                return;
            case 10:
                boolean[] zArr = new boolean[1];
                ex exVar = (ex) obj;
                ey eyVar = exVar.G;
                hi.d dVar = new hi.d(eyVar.getContext(), (e6) null);
                LinearLayout linearLayout = new LinearLayout(eyVar.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                ImageView imageView = new ImageView(eyVar.getContext());
                imageView.setImageResource(R.drawable.smiles_info);
                linearLayout.addView(imageView, mf.t(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(eyVar.getContext());
                textView.setText(bd.M0(2131751165, null));
                textView.setTextSize(1, 15.0f);
                r6.V(textView, k6.n5, eyVar.a2);
                textView.setGravity(bd.a0 ? 5 : 3);
                textView.setTypeface(org.telegram.messenger.g0.o());
                linearLayout.addView(textView, mf.t(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(eyVar.getContext());
                textView2.setText(org.telegram.messenger.g0.X2(bd.M0(2131751164, null)));
                textView2.setTextSize(1, 15.0f);
                r6.V(textView2, k6.j5, eyVar.a2);
                textView2.setGravity(bd.a0 ? 5 : 3);
                linearLayout.addView(textView2, mf.t(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(eyVar.getContext());
                Object obj2 = exVar.x;
                if (obj2 == null) {
                    obj2 = eyVar.X0;
                }
                textView3.setText(bd.a0("EmojiSuggestionsUrl", null, 2131751163, obj2));
                textView3.setTextSize(1, 15.0f);
                r6.V(textView3, k6.k5, eyVar.a2);
                textView3.setGravity(bd.a0 ? 5 : 3);
                linearLayout.addView(textView3, mf.t(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new bx(this, zArr, dVar));
                t2 t2Var = (t2) dVar.b;
                t2Var.O = linearLayout;
                t2Var.show();
                return;
            case 11:
                t50 t50Var = (t50) obj;
                y10 y10Var = (y10) view;
                if (y10Var.E) {
                    t50Var.b2 = null;
                    t50Var.X1.l(y10Var.getUid());
                    t50Var.M1.b(y10Var);
                    t50Var.S0(true);
                    org.telegram.messenger.g0.b4(t50Var.l1);
                    return;
                }
                y10 y10Var2 = t50Var.b2;
                if (y10Var2 != null) {
                    y10Var2.a();
                }
                t50Var.b2 = y10Var;
                y10Var.b();
                return;
            default:
                ((m70) obj).e.callOnClick();
                return;
        }
    }
}
