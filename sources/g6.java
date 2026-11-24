// default package

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Message;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.mediarouter.app.MediaRouteExpandCollapseButton;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class g6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        tv6 tv6Var;
        tv6 tv6Var2;
        tv6 tv6Var3;
        Message message2 = null;
        message2 = null;
        byte b = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                ((f9) this.b).b();
                break;
            case 1:
                sd sdVar = (sd) this.b;
                if (view == sdVar.i && (message = sdVar.k) != null) {
                    message2 = Message.obtain(message);
                }
                if (message2 != null) {
                    message2.sendToTarget();
                }
                sdVar.z.obtainMessage(1, sdVar.b).sendToTarget();
                break;
            case 2:
                h91 h91Var = (h91) this.b;
                k91 k91Var = h91Var.y;
                if (h91Var.n != null && k91Var.H) {
                    int i2 = -1;
                    int i3 = -1;
                    while (b < h91Var.d) {
                        i91 i91Var = (i91) h91Var.n.get(b, null);
                        if (i91Var != null) {
                            if (i2 == -1) {
                                i2 = i91Var.h;
                            }
                            i3 = i91Var.h;
                        }
                        b++;
                    }
                    if (i2 >= 0 && i3 >= 0) {
                        k91Var.Q = i2;
                        k91Var.R = i3;
                        k91Var.B0();
                        k91Var.s0();
                        break;
                    }
                }
                break;
            case 3:
                u31.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 4:
                if2 if2Var = (if2) this.b;
                yv1 yv1Var = if2Var.u1;
                i22 i22Var = new i22(yv1Var.getParentActivity(), yv1Var, false, false, false, yv1Var.getResourceProvider());
                if2Var.R1 = i22Var;
                i22Var.n = true;
                i22Var.v1(jb6.M0(2131752076, null));
                i22 i22Var2 = if2Var.R1;
                i22Var2.W3 = new bf2(if2Var);
                i22Var2.t1(1, false);
                if2Var.R1.Z0();
                if2Var.R1.d2.h0();
                if2Var.R1.show();
                if2Var.S1 = new su(if2Var, if2Var.getContext());
                io ioVar = new io(if2Var.getContext(), true, true, true);
                if2Var.T1 = ioVar;
                ioVar.setTextSize(gm.L(14.0f));
                if2Var.T1.setText(jb6.M0(2131745271, null));
                if2Var.T1.setGravity(17);
                io ioVar2 = if2Var.T1;
                int i4 = cmb.Ei;
                anb.U(ioVar2, i4, if2Var.J0);
                if2Var.S1.addView(if2Var.T1, qoe.e(-1, -2, 17));
                su suVar = if2Var.S1;
                int L = gm.L(0.0f);
                int i5 = cmb.c6;
                int v0 = cmb.v0(i5, if2Var.J0);
                int p = on2.p(cmb.v0(i4, if2Var.J0), 76);
                anb.R(suVar, cmb.i0(L, L, L, L, v0, p, p), anb.M(i5), anb.g(i4, 76), if2Var.J0);
                if2Var.S1.setOnClickListener(new se2(if2Var, b));
                if2Var.R1.o3.addView(if2Var.S1, qoe.e(-1, -2, 80));
                break;
            case 5:
                boolean[] zArr = new boolean[1];
                e24 e24Var = (e24) this.b;
                e34 e34Var = e24Var.G;
                k6d k6dVar = new k6d(e34Var.getContext(), (ylb) null);
                LinearLayout linearLayout = new LinearLayout(e34Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(gm.L(21.0f), 0, gm.L(21.0f), 0);
                ImageView imageView = new ImageView(e34Var.getContext());
                imageView.setImageResource(R.drawable.smiles_info);
                linearLayout.addView(imageView, qoe.t(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(e34Var.getContext());
                td4.v(15.0f, 2131751101, 1, textView, null);
                anb.X(textView, cmb.m5, e34Var.a2);
                textView.setGravity(jb6.a0 ? 5 : 3);
                textView.setTypeface(gm.o());
                linearLayout.addView(textView, qoe.t(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(e34Var.getContext());
                textView2.setText(gm.S2(jb6.M0(2131751100, null)));
                textView2.setTextSize(1, 15.0f);
                anb.X(textView2, cmb.i5, e34Var.a2);
                textView2.setGravity(jb6.a0 ? 5 : 3);
                linearLayout.addView(textView2, qoe.t(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(e34Var.getContext());
                Object obj = e24Var.x;
                if (obj == null) {
                    obj = e34Var.X0;
                }
                textView3.setText(jb6.a0("EmojiSuggestionsUrl", null, 2131751099, obj));
                textView3.setTextSize(1, 15.0f);
                anb.X(textView3, cmb.j5, e34Var.a2);
                textView3.setGravity(jb6.a0 ? 5 : 3);
                linearLayout.addView(textView3, qoe.t(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new b24(this, zArr, k6dVar));
                ((my0) k6dVar.b).O = linearLayout;
                k6dVar.h1();
                break;
            case 6:
                if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = ((fm4) this.b).K) != null) {
                    onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
                    break;
                }
                break;
            case 7:
                wc5 wc5Var = (wc5) view;
                boolean z = wc5Var.E;
                it5 it5Var = (it5) this.b;
                if (z) {
                    it5Var.d2 = null;
                    it5Var.Z1.l(wc5Var.getUid());
                    it5Var.O1.b(wc5Var);
                    it5Var.N0(true);
                    gm.V3(it5Var.n1);
                    break;
                } else {
                    wc5 wc5Var2 = it5Var.d2;
                    if (wc5Var2 != null) {
                        wc5Var2.a();
                    }
                    it5Var.d2 = wc5Var;
                    wc5Var.b();
                    break;
                }
            case 8:
                ((f56) this.b).e.callOnClick();
                break;
            case 9:
                ((gv6) this.b).dismiss();
                break;
            case 10:
                jv6 jv6Var = (jv6) this.b;
                rv6 rv6Var = jv6Var.y;
                if (rv6Var.N != null) {
                    rv6Var.I.removeMessages(2);
                }
                rv6Var.N = jv6Var.v;
                boolean isActivated = view.isActivated();
                boolean z2 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) rv6Var.O.get(jv6Var.v.c);
                    i = num == null ? 1 : Math.max(1, num.intValue());
                }
                jv6Var.u(z2);
                jv6Var.x.setProgress(i);
                jv6Var.v.j(i);
                rv6Var.I.sendEmptyMessageDelayed(2, 500L);
                break;
            case 11:
                kv6 kv6Var = (kv6) this.b;
                gw6 gw6Var = kv6Var.B.x.f;
                ew6 ew6Var = kv6Var.A;
                gw6Var.getClass();
                if (ew6Var != null) {
                    gw6.b();
                    wz4 c = gw6.c();
                    if (c.e instanceof uv6) {
                        k44 b2 = c.d.b(ew6Var);
                        if (b2 == null || (tv6Var = (tv6) b2.b) == null || !tv6Var.e) {
                            Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                        } else {
                            ((uv6) c.e).o(Collections.singletonList(ew6Var.b));
                        }
                        kv6Var.w.setVisibility(4);
                        kv6Var.x.setVisibility(0);
                        break;
                    } else {
                        dq9.m("There is no currently selected dynamic group route.");
                        break;
                    }
                } else {
                    gxc.d("route must not be null");
                    break;
                }
                break;
            case 12:
                ov6 ov6Var = (ov6) this.b;
                boolean v = ov6Var.v(ov6Var.v);
                boolean z3 = !v;
                boolean e = ov6Var.v.e();
                pv6 pv6Var = ov6Var.I;
                if (!v) {
                    gw6 gw6Var2 = pv6Var.x.f;
                    ew6 ew6Var2 = ov6Var.v;
                    gw6Var2.getClass();
                    if (ew6Var2 == null) {
                        gxc.d("route must not be null");
                        break;
                    } else {
                        gw6.b();
                        wz4 c2 = gw6.c();
                        if (!(c2.e instanceof uv6)) {
                            dq9.m("There is no currently selected dynamic group route.");
                            break;
                        } else {
                            k44 b3 = c2.d.b(ew6Var2);
                            if (DesugarCollections.unmodifiableList(c2.d.v).contains(ew6Var2) || b3 == null || (tv6Var3 = (tv6) b3.b) == null || !tv6Var3.d) {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + ew6Var2);
                            } else {
                                ((uv6) c2.e).m(ew6Var2.b);
                            }
                        }
                    }
                } else {
                    gw6 gw6Var3 = pv6Var.x.f;
                    ew6 ew6Var3 = ov6Var.v;
                    gw6Var3.getClass();
                    if (ew6Var3 == null) {
                        gxc.d("route must not be null");
                        break;
                    } else {
                        gw6.b();
                        wz4 c3 = gw6.c();
                        if (!(c3.e instanceof uv6)) {
                            dq9.m("There is no currently selected dynamic group route.");
                            break;
                        } else {
                            k44 b4 = c3.d.b(ew6Var3);
                            if (!DesugarCollections.unmodifiableList(c3.d.v).contains(ew6Var3) || b4 == null || ((tv6Var2 = (tv6) b4.b) != null && !tv6Var2.c)) {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + ew6Var3);
                            } else if (DesugarCollections.unmodifiableList(c3.d.v).size() <= 1) {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                            } else {
                                ((uv6) c3.e).n(ew6Var3.b);
                            }
                        }
                    }
                }
                ov6Var.w(z3, !e);
                if (e) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(pv6Var.x.r.v);
                    for (ew6 ew6Var4 : DesugarCollections.unmodifiableList(ov6Var.v.v)) {
                        if (unmodifiableList.contains(ew6Var4) != z3) {
                            jv6 jv6Var2 = (jv6) pv6Var.x.M.get(ew6Var4.c);
                            if (jv6Var2 instanceof ov6) {
                                ((ov6) jv6Var2).w(z3, true);
                            }
                        }
                    }
                }
                rv6 rv6Var2 = pv6Var.x;
                ew6 ew6Var5 = ov6Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(rv6Var2.r.v);
                int max = Math.max(1, unmodifiableList2.size());
                if (ew6Var5.e()) {
                    Iterator it = DesugarCollections.unmodifiableList(ew6Var5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((ew6) it.next()) != z3) {
                            max += !v ? 1 : -1;
                        }
                    }
                } else {
                    max += v ? -1 : 1;
                }
                boolean z4 = rv6Var2.j0 && DesugarCollections.unmodifiableList(rv6Var2.r.v).size() > 1;
                boolean z5 = rv6Var2.j0 && max >= 2;
                if (z4 != z5) {
                    u69 K = rv6Var2.J.K(0);
                    if (K instanceof lv6) {
                        lv6 lv6Var = (lv6) K;
                        pv6Var.D(z5 ? lv6Var.A : 0, lv6Var.a);
                        break;
                    }
                }
                break;
            case 13:
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = (MediaRouteExpandCollapseButton) this.b;
                AnimationDrawable animationDrawable = mediaRouteExpandCollapseButton.e;
                AnimationDrawable animationDrawable2 = mediaRouteExpandCollapseButton.d;
                boolean z6 = mediaRouteExpandCollapseButton.n;
                mediaRouteExpandCollapseButton.n = !z6;
                if (z6) {
                    mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable);
                    animationDrawable.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.f);
                } else {
                    mediaRouteExpandCollapseButton.setImageDrawable(animationDrawable2);
                    animationDrawable2.start();
                    mediaRouteExpandCollapseButton.setContentDescription(mediaRouteExpandCollapseButton.h);
                }
                View.OnClickListener onClickListener = mediaRouteExpandCollapseButton.r;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 14:
                if (((i9a) this.b).a.getImageReceiver().y() != null && !((i9a) this.b).a.getImageReceiver().y().l0) {
                    ((i9a) this.b).a.getImageReceiver().y().I(0, false, false);
                    ((i9a) this.b).a.getImageReceiver().y().C(false);
                    break;
                }
                break;
            case 15:
                l11.u((Activity) this.b, jb6.M0(2131744944, null));
                break;
            case 16:
                evb evbVar = ((Toolbar) this.b).f0;
                c27 c27Var = evbVar != null ? evbVar.b : null;
                if (c27Var != null) {
                    c27Var.collapseActionView();
                    break;
                }
                break;
            default:
                ((sxb) this.b).L0(true);
                break;
        }
    }
}
