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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class h6 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Message message;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener;
        yv6 yv6Var;
        yv6 yv6Var2;
        yv6 yv6Var3;
        Message message2 = null;
        message2 = null;
        byte b = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                ((g9) this.b).b();
                break;
            case 1:
                tc tcVar = (tc) this.b;
                if (view == tcVar.i && (message = tcVar.k) != null) {
                    message2 = Message.obtain(message);
                }
                if (message2 != null) {
                    message2.sendToTarget();
                }
                tcVar.z.obtainMessage(1, tcVar.b).sendToTarget();
                break;
            case 2:
                g81 g81Var = (g81) this.b;
                j81 j81Var = g81Var.y;
                if (g81Var.n != null && j81Var.H) {
                    int i2 = -1;
                    int i3 = -1;
                    while (b < g81Var.d) {
                        h81 h81Var = (h81) g81Var.n.get(b, null);
                        if (h81Var != null) {
                            if (i2 == -1) {
                                i2 = h81Var.h;
                            }
                            i3 = h81Var.h;
                        }
                        b++;
                    }
                    if (i2 >= 0 && i3 >= 0) {
                        j81Var.Q = i2;
                        j81Var.R = i3;
                        j81Var.B0();
                        j81Var.r0();
                        break;
                    }
                }
                break;
            case 3:
                v21.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 4:
                oe2 oe2Var = (oe2) this.b;
                zu1 zu1Var = oe2Var.u1;
                n12 n12Var = new n12(zu1Var.getParentActivity(), zu1Var, false, false, false, zu1Var.getResourceProvider());
                oe2Var.R1 = n12Var;
                n12Var.n = true;
                n12Var.w1(ob6.M0(2131752104, null));
                n12 n12Var2 = oe2Var.R1;
                n12Var2.W3 = new he2(oe2Var);
                n12Var2.u1(1, false);
                oe2Var.R1.a1();
                oe2Var.R1.d2.g0();
                oe2Var.R1.show();
                oe2Var.S1 = new tt(oe2Var, oe2Var.getContext());
                in inVar = new in(oe2Var.getContext(), true, true, true);
                oe2Var.T1 = inVar;
                inVar.setTextSize(hl.L(14.0f));
                oe2Var.T1.setText(ob6.M0(2131745265, null));
                oe2Var.T1.setGravity(17);
                in inVar2 = oe2Var.T1;
                int i4 = aob.Fi;
                yob.U(inVar2, i4, oe2Var.J0);
                oe2Var.S1.addView(oe2Var.T1, tre.e(-1, -2, 17));
                tt ttVar = oe2Var.S1;
                int L = hl.L(0.0f);
                int i5 = aob.d6;
                int v0 = aob.v0(i5, oe2Var.J0);
                int o = vm2.o(aob.v0(i4, oe2Var.J0), 76);
                yob.R(ttVar, aob.i0(L, L, L, L, v0, o, o), yob.M(i5), yob.g(i4, 76), oe2Var.J0);
                oe2Var.S1.setOnClickListener(new zd2(oe2Var, b));
                oe2Var.R1.o3.addView(oe2Var.S1, tre.e(-1, -2, 80));
                break;
            case 5:
                boolean[] zArr = new boolean[1];
                o14 o14Var = (o14) this.b;
                o24 o24Var = o14Var.G;
                z8d z8dVar = new z8d(o24Var.getContext(), (vnb) null);
                LinearLayout linearLayout = new LinearLayout(o24Var.getContext());
                linearLayout.setOrientation(1);
                linearLayout.setPadding(hl.L(21.0f), 0, hl.L(21.0f), 0);
                ImageView imageView = new ImageView(o24Var.getContext());
                imageView.setImageResource(R.drawable.smiles_info);
                linearLayout.addView(imageView, tre.t(-2, -2, 49, 0, 15, 0, 0));
                TextView textView = new TextView(o24Var.getContext());
                qd4.u(15.0f, 2131751129, 1, textView, null);
                yob.X(textView, aob.n5, o24Var.a2);
                textView.setGravity(ob6.a0 ? 5 : 3);
                textView.setTypeface(hl.o());
                linearLayout.addView(textView, tre.t(-2, -2, 51, 0, 24, 0, 0));
                TextView textView2 = new TextView(o24Var.getContext());
                textView2.setText(hl.S2(ob6.M0(2131751128, null)));
                textView2.setTextSize(1, 15.0f);
                yob.X(textView2, aob.j5, o24Var.a2);
                textView2.setGravity(ob6.a0 ? 5 : 3);
                linearLayout.addView(textView2, tre.t(-2, -2, 51, 0, 11, 0, 0));
                TextView textView3 = new TextView(o24Var.getContext());
                Object obj = o14Var.x;
                if (obj == null) {
                    obj = o24Var.X0;
                }
                textView3.setText(ob6.a0("EmojiSuggestionsUrl", null, 2131751127, obj));
                textView3.setTextSize(1, 15.0f);
                yob.X(textView3, aob.k5, o24Var.a2);
                textView3.setGravity(ob6.a0 ? 5 : 3);
                linearLayout.addView(textView3, tre.t(-2, -2, 51, 0, 18, 0, 16));
                textView3.setOnClickListener(new l14(this, zArr, z8dVar));
                ((nx0) z8dVar.b).O = linearLayout;
                z8dVar.o1();
                break;
            case 6:
                if ((view.getTag() instanceof MenuItem) && (onMenuItemClickListener = ((jm4) this.b).K) != null) {
                    onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
                    break;
                }
                break;
            case 7:
                zc5 zc5Var = (zc5) view;
                boolean z = zc5Var.E;
                lt5 lt5Var = (lt5) this.b;
                if (z) {
                    lt5Var.d2 = null;
                    lt5Var.Z1.l(zc5Var.getUid());
                    lt5Var.O1.b(zc5Var);
                    lt5Var.O0(true);
                    hl.V3(lt5Var.n1);
                    break;
                } else {
                    zc5 zc5Var2 = lt5Var.d2;
                    if (zc5Var2 != null) {
                        zc5Var2.a();
                    }
                    lt5Var.d2 = zc5Var;
                    zc5Var.b();
                    break;
                }
            case 8:
                ((i56) this.b).e.callOnClick();
                break;
            case 9:
                ((lv6) this.b).dismiss();
                break;
            case 10:
                ov6 ov6Var = (ov6) this.b;
                wv6 wv6Var = ov6Var.y;
                if (wv6Var.N != null) {
                    wv6Var.I.removeMessages(2);
                }
                wv6Var.N = ov6Var.v;
                boolean isActivated = view.isActivated();
                boolean z2 = !isActivated;
                if (isActivated) {
                    Integer num = (Integer) wv6Var.O.get(ov6Var.v.c);
                    i = num == null ? 1 : Math.max(1, num.intValue());
                }
                ov6Var.u(z2);
                ov6Var.x.setProgress(i);
                ov6Var.v.j(i);
                wv6Var.I.sendEmptyMessageDelayed(2, 500L);
                break;
            case 11:
                pv6 pv6Var = (pv6) this.b;
                lw6 lw6Var = pv6Var.B.x.f;
                jw6 jw6Var = pv6Var.A;
                lw6Var.getClass();
                if (jw6Var != null) {
                    lw6.b();
                    a05 c = lw6.c();
                    if (c.e instanceof zv6) {
                        v34 b2 = c.d.b(jw6Var);
                        if (b2 == null || (yv6Var = (yv6) b2.b) == null || !yv6Var.e) {
                            Log.w("GlobalMediaRouter", "Ignoring attempt to transfer to a non-transferable route.");
                        } else {
                            ((zv6) c.e).o(Collections.singletonList(jw6Var.b));
                        }
                        pv6Var.w.setVisibility(4);
                        pv6Var.x.setVisibility(0);
                        break;
                    } else {
                        grb.i("There is no currently selected dynamic group route.");
                        break;
                    }
                } else {
                    p3d.h("route must not be null");
                    break;
                }
                break;
            case 12:
                tv6 tv6Var = (tv6) this.b;
                boolean v = tv6Var.v(tv6Var.v);
                boolean z3 = !v;
                boolean e = tv6Var.v.e();
                uv6 uv6Var = tv6Var.I;
                if (!v) {
                    lw6 lw6Var2 = uv6Var.x.f;
                    jw6 jw6Var2 = tv6Var.v;
                    lw6Var2.getClass();
                    if (jw6Var2 == null) {
                        p3d.h("route must not be null");
                        break;
                    } else {
                        lw6.b();
                        a05 c2 = lw6.c();
                        if (!(c2.e instanceof zv6)) {
                            grb.i("There is no currently selected dynamic group route.");
                            break;
                        } else {
                            v34 b3 = c2.d.b(jw6Var2);
                            if (DesugarCollections.unmodifiableList(c2.d.v).contains(jw6Var2) || b3 == null || (yv6Var3 = (yv6) b3.b) == null || !yv6Var3.d) {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to add a non-groupable route to dynamic group : " + jw6Var2);
                            } else {
                                ((zv6) c2.e).m(jw6Var2.b);
                            }
                        }
                    }
                } else {
                    lw6 lw6Var3 = uv6Var.x.f;
                    jw6 jw6Var3 = tv6Var.v;
                    lw6Var3.getClass();
                    if (jw6Var3 == null) {
                        p3d.h("route must not be null");
                        break;
                    } else {
                        lw6.b();
                        a05 c3 = lw6.c();
                        if (!(c3.e instanceof zv6)) {
                            grb.i("There is no currently selected dynamic group route.");
                            break;
                        } else {
                            v34 b4 = c3.d.b(jw6Var3);
                            if (!DesugarCollections.unmodifiableList(c3.d.v).contains(jw6Var3) || b4 == null || ((yv6Var2 = (yv6) b4.b) != null && !yv6Var2.c)) {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to remove a non-unselectable member route : " + jw6Var3);
                            } else if (DesugarCollections.unmodifiableList(c3.d.v).size() <= 1) {
                                Log.w("GlobalMediaRouter", "Ignoring attempt to remove the last member route.");
                            } else {
                                ((zv6) c3.e).n(jw6Var3.b);
                            }
                        }
                    }
                }
                tv6Var.w(z3, !e);
                if (e) {
                    List unmodifiableList = DesugarCollections.unmodifiableList(uv6Var.x.r.v);
                    for (jw6 jw6Var4 : DesugarCollections.unmodifiableList(tv6Var.v.v)) {
                        if (unmodifiableList.contains(jw6Var4) != z3) {
                            ov6 ov6Var2 = (ov6) uv6Var.x.M.get(jw6Var4.c);
                            if (ov6Var2 instanceof tv6) {
                                ((tv6) ov6Var2).w(z3, true);
                            }
                        }
                    }
                }
                wv6 wv6Var2 = uv6Var.x;
                jw6 jw6Var5 = tv6Var.v;
                List unmodifiableList2 = DesugarCollections.unmodifiableList(wv6Var2.r.v);
                int max = Math.max(1, unmodifiableList2.size());
                if (jw6Var5.e()) {
                    Iterator it = DesugarCollections.unmodifiableList(jw6Var5.v).iterator();
                    while (it.hasNext()) {
                        if (unmodifiableList2.contains((jw6) it.next()) != z3) {
                            max += !v ? 1 : -1;
                        }
                    }
                } else {
                    max += v ? -1 : 1;
                }
                boolean z4 = wv6Var2.j0 && DesugarCollections.unmodifiableList(wv6Var2.r.v).size() > 1;
                boolean z5 = wv6Var2.j0 && max >= 2;
                if (z4 != z5) {
                    f89 L2 = wv6Var2.J.L(0);
                    if (L2 instanceof qv6) {
                        qv6 qv6Var = (qv6) L2;
                        uv6Var.D(z5 ? qv6Var.A : 0, qv6Var.a);
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
                if (((yaa) this.b).a.getImageReceiver().y() != null && !((yaa) this.b).a.getImageReceiver().y().l0) {
                    ((yaa) this.b).a.getImageReceiver().y().I(0, false, false);
                    ((yaa) this.b).a.getImageReceiver().y().C(false);
                    break;
                }
                break;
            case 15:
                m01.u((Activity) this.b, ob6.M0(2131744912, null));
                break;
            case 16:
                exb exbVar = ((Toolbar) this.b).f0;
                j27 j27Var = exbVar != null ? exbVar.b : null;
                if (j27Var != null) {
                    j27Var.collapseActionView();
                    break;
                }
                break;
            default:
                ((tzb) this.b).L0(true);
                break;
        }
    }
}
