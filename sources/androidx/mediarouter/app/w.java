package androidx.mediarouter.app;

import android.os.Message;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import c8.ja;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m.f3;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.ou;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g4;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u2;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.f20;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lx;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.xo;
import org.telegram.ui.an;
import v4.e1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                cf b10 = c10.d.b(vVar);
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
                    cf b11 = c11.d.b(vVar2);
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
                    cf b12 = c12.d.b(vVar3);
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
                    e1 K = n0Var2.J.K(0);
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
                if (!(view.getTag() instanceof MenuItem) || (onMenuItemClickListener = ((g4) obj).K) == null) {
                    return;
                }
                onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
                return;
            case 9:
                ep epVar = (ep) obj;
                an anVar = epVar.v1;
                ki kiVar = new ki(anVar.getParentActivity(), anVar, false, false, false, anVar.getResourceProvider());
                epVar.S1 = kiVar;
                kiVar.n = true;
                kiVar.A1(hd.M0(2131752139, null));
                ki kiVar2 = epVar.S1;
                kiVar2.X3 = new xo(epVar);
                kiVar2.y1(1, false);
                epVar.S1.e1();
                epVar.S1.e2.i0();
                epVar.S1.show();
                epVar.T1 = new ai.k0(epVar, epVar.getContext());
                h6 h6Var = new h6(epVar.getContext(), true, true, true);
                epVar.U1 = h6Var;
                h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
                epVar.U1.setText(hd.M0(2131745537, null));
                epVar.U1.setGravity(17);
                h6 h6Var2 = epVar.U1;
                int i10 = j6.Fi;
                q6.Y(h6Var2, i10, epVar.J0);
                epVar.T1.addView(epVar.U1, ja.e(-1, -2, 17));
                ai.k0 k0Var2 = epVar.T1;
                int L = org.telegram.messenger.g0.L(0.0f);
                int i11 = j6.d6;
                int w02 = j6.w0(i11, epVar.J0);
                int o4 = i0.a.o(j6.w0(i10, epVar.J0), 76);
                q6.Q(k0Var2, j6.k0(L, L, L, L, w02, o4, o4), q6.M(i11), q6.g(i10, 76), epVar.J0);
                epVar.T1.setOnClickListener(new oo(epVar, r9));
                epVar.S1.p3.addView(epVar.T1, ja.e(-1, -2, 80));
                return;
            case 10:
                boolean[] zArr = new boolean[1];
                lx lxVar = (lx) obj;
                ly lyVar = lxVar.G;
                ou ouVar = new ou(lyVar.getContext(), (e6) null);
                LinearLayout linearLayout = new LinearLayout(lyVar.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(org.telegram.messenger.g0.L(21.0f), 0, org.telegram.messenger.g0.L(21.0f), 0);
                ImageView imageView = new ImageView(lyVar.getContext());
                imageView.setImageResource(R.drawable.smiles_info);
                linearLayout.addView(imageView, ja.t(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(lyVar.getContext());
                textView.setText(hd.M0(2131751164, null));
                textView.setTextSize(1, 15.0f);
                q6.U(textView, j6.n5, lyVar.a2);
                textView.setGravity(hd.a0 ? 5 : 3);
                textView.setTypeface(org.telegram.messenger.g0.o());
                linearLayout.addView(textView, ja.t(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(lyVar.getContext());
                textView2.setText(org.telegram.messenger.g0.X2(hd.M0(2131751163, null)));
                textView2.setTextSize(1, 15.0f);
                q6.U(textView2, j6.j5, lyVar.a2);
                textView2.setGravity(hd.a0 ? 5 : 3);
                linearLayout.addView(textView2, ja.t(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(lyVar.getContext());
                Object obj2 = lxVar.x;
                if (obj2 == null) {
                    obj2 = lyVar.X0;
                }
                textView3.setText(hd.a0("EmojiSuggestionsUrl", null, 2131751162, obj2));
                textView3.setTextSize(1, 15.0f);
                q6.U(textView3, j6.k5, lyVar.a2);
                textView3.setGravity(hd.a0 ? 5 : 3);
                linearLayout.addView(textView3, ja.t(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new ix(this, zArr, ouVar));
                u2 u2Var = (u2) ouVar.b;
                u2Var.O = linearLayout;
                u2Var.show();
                return;
            case 11:
                a60 a60Var = (a60) obj;
                f20 f20Var = (f20) view;
                if (f20Var.E) {
                    a60Var.e2 = null;
                    a60Var.a2.l(f20Var.getUid());
                    a60Var.P1.b(f20Var);
                    a60Var.S0(true);
                    org.telegram.messenger.g0.a4(a60Var.o1);
                    return;
                }
                f20 f20Var2 = a60Var.e2;
                if (f20Var2 != null) {
                    f20Var2.a();
                }
                a60Var.e2 = f20Var;
                f20Var.b();
                return;
            default:
                ((t70) obj).e.callOnClick();
                return;
        }
    }
}
