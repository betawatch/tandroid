package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c8.ma;
import hi.w4;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.f3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j4;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.sx;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.xo;
import org.telegram.ui.bn;
import v4.f1;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                c5 b10 = c10.d.b(vVar);
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
                    c5 b11 = c11.d.b(vVar2);
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
                    c5 b12 = c12.d.b(vVar3);
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
                if (!(view.getTag() instanceof MenuItem) || (onMenuItemClickListener = ((j4) obj).K) == null) {
                    return;
                }
                onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
                return;
            case 9:
                np npVar = (np) obj;
                bn bnVar = npVar.v1;
                ui uiVar = new ui(bnVar.getParentActivity(), bnVar, false, false, false, bnVar.getResourceProvider());
                npVar.S1 = uiVar;
                uiVar.n = true;
                uiVar.B1(hd.N0(2131752127, null));
                ui uiVar2 = npVar.S1;
                uiVar2.X3 = new gp(npVar);
                uiVar2.z1(1, false);
                npVar.S1.f1();
                npVar.S1.e2.i0();
                npVar.S1.show();
                npVar.T1 = new ai.l0(npVar, npVar.getContext());
                o6 o6Var = new o6(npVar.getContext(), true, true, true);
                npVar.U1 = o6Var;
                o6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                npVar.U1.setText(hd.N0(2131745341, null));
                npVar.U1.setGravity(17);
                o6 o6Var2 = npVar.U1;
                int i10 = m6.Fi;
                t6.Y(o6Var2, i10, npVar.J0);
                npVar.T1.addView(npVar.U1, ma.e(-1, -2, 17));
                ai.l0 l0Var2 = npVar.T1;
                int L = org.telegram.messenger.g0.L(0.0f);
                int i11 = m6.d6;
                int w02 = m6.w0(i11, npVar.J0);
                int o4 = i0.a.o(m6.w0(i10, npVar.J0), 76);
                t6.Q(l0Var2, m6.k0(L, L, L, L, w02, o4, o4), t6.M(i11), t6.g(i10, 76), npVar.J0);
                npVar.T1.setOnClickListener(new xo(npVar, r9));
                npVar.S1.p3.addView(npVar.T1, ma.e(-1, -2, 80));
                return;
            case 10:
                boolean[] zArr = new boolean[1];
                sx sxVar = (sx) obj;
                ty tyVar = sxVar.G;
                w4 w4Var = new w4(tyVar.getContext(), (h6) null);
                LinearLayout linearLayout = new LinearLayout(tyVar.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                ImageView imageView = new ImageView(tyVar.getContext());
                imageView.setImageResource(R.drawable.smiles_info);
                linearLayout.addView(imageView, ma.t(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(tyVar.getContext());
                o10.l(15.0f, 2131751152, 1, textView, null);
                t6.U(textView, m6.n5, tyVar.a2);
                textView.setGravity(hd.a0 ? 5 : 3);
                textView.setTypeface(org.telegram.messenger.g0.o());
                linearLayout.addView(textView, ma.t(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(tyVar.getContext());
                textView2.setText(org.telegram.messenger.g0.W2(hd.N0(2131751151, null)));
                textView2.setTextSize(1, 15.0f);
                t6.U(textView2, m6.j5, tyVar.a2);
                textView2.setGravity(hd.a0 ? 5 : 3);
                linearLayout.addView(textView2, ma.t(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(tyVar.getContext());
                Object obj2 = sxVar.x;
                if (obj2 == null) {
                    obj2 = tyVar.X0;
                }
                textView3.setText(hd.a0("EmojiSuggestionsUrl", null, 2131751150, obj2));
                textView3.setTextSize(1, 15.0f);
                t6.U(textView3, m6.k5, tyVar.a2);
                textView3.setGravity(hd.a0 ? 5 : 3);
                linearLayout.addView(textView3, ma.t(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new px(this, zArr, w4Var));
                ((w2) w4Var.b).O = linearLayout;
                w4Var.C2();
                return;
            case 11:
                l60 l60Var = (l60) obj;
                p20 p20Var = (p20) view;
                if (p20Var.E) {
                    l60Var.e2 = null;
                    l60Var.a2.l(p20Var.getUid());
                    l60Var.P1.b(p20Var);
                    l60Var.T0(true);
                    org.telegram.messenger.g0.Z3(l60Var.o1);
                    return;
                }
                p20 p20Var2 = l60Var.e2;
                if (p20Var2 != null) {
                    p20Var2.a();
                }
                l60Var.e2 = p20Var;
                p20Var.b();
                return;
            default:
                ((g80) obj).e.callOnClick();
                return;
        }
    }
}
