// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_agent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class jc extends el7 implements jm7 {
    public final mc W1;
    public final ao8 X1;
    public final boolean Y1;
    public final ic Z1;
    public final q7c a2;
    public final q7c b2;
    public final FrameLayout c2;
    public final FrameLayout d2;
    public final FrameLayout e2;
    public final TextView f2;
    public final su3 g2;
    public final TextView h2;
    public final FrameLayout i2;
    public final b61 j2;
    public TL_agent.agentProvider k2;
    public boolean l2;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [ec] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jc(Activity activity, int i, ao8 ao8Var, ylb ylbVar) {
        super(activity, r8, ylbVar);
        ic icVar = new ic(activity);
        View[] viewArr = new View[2];
        icVar.a = viewArr;
        this.Z1 = icVar;
        this.a = i;
        mc c = mc.c(i);
        this.W1 = c;
        this.k2 = null;
        final byte b = 0;
        this.Y1 = false;
        this.X1 = ao8Var;
        final byte b2 = 1;
        this.Q0 = true;
        this.R0 = true;
        this.c2 = a1(activity, jb6.M0(2131754295, null), null);
        this.d2 = a1(activity, jb6.M0(2131754301, null), new View.OnClickListener(this) { // from class: ec
            public final /* synthetic */ jc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                jc jcVar = this.b;
                switch (b3) {
                    case 0:
                        if (!jcVar.l2) {
                            gm.t1(jcVar.g2.d);
                            jcVar.Z1.b(0, true);
                            break;
                        }
                        break;
                    default:
                        jcVar.Z0();
                        break;
                }
            }
        });
        FrameLayout frameLayout = new FrameLayout(activity);
        this.e2 = frameLayout;
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gm.o());
        textView.setTextColor(cmb.v0(cmb.K6, this.J0));
        textView.setText(jb6.M0(2131754300, null));
        frameLayout.addView(textView, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 80, 21.0f, 15.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f2 = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(cmb.v0(cmb.o7, this.J0));
        textView2.setText(jb6.M0(2131754298, null));
        textView2.setAlpha(0.0f);
        frameLayout.addView(textView2, qoe.d(-2, -2.0f, (jb6.a0 ? 3 : 5) | 80, 21.0f, 15.0f, 21.0f, 0.0f));
        su3 su3Var = new su3(activity, "", true, false, -1, ylbVar);
        this.g2 = su3Var;
        ru3 ru3Var = su3Var.d;
        ru3Var.setInputType(655361);
        ru3Var.setTypeface(Typeface.MONOSPACE);
        TextView textView3 = new TextView(activity);
        this.h2 = textView3;
        textView3.setTextSize(1, 17.0f);
        textView3.setTextColor(cmb.v0(cmb.G6, this.J0));
        textView3.setText(jb6.M0(2131754297, null));
        textView3.setSingleLine();
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        textView3.setGravity((jb6.a0 ? 5 : 3) | 48);
        textView3.setPadding(gm.L(21.0f), gm.L(15.0f), gm.L(21.0f), gm.L(15.0f));
        textView3.setClickable(false);
        textView3.setFocusable(false);
        su3Var.addView(textView3, qoe.e(-1, -2, 48));
        su3Var.d(new fc(this, b));
        ru3Var.addTextChangedListener(new hc(this));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.i2 = frameLayout2;
        b61 b61Var = new b61(ylbVar, activity, true);
        b61Var.setRoundRadius(24);
        this.j2 = b61Var;
        b61Var.setOnClickListener(new View.OnClickListener(this) { // from class: ec
            public final /* synthetic */ jc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                jc jcVar = this.b;
                switch (b3) {
                    case 0:
                        if (!jcVar.l2) {
                            gm.t1(jcVar.g2.d);
                            jcVar.Z1.b(0, true);
                            break;
                        }
                        break;
                    default:
                        jcVar.Z0();
                        break;
                }
            }
        });
        frameLayout2.addView(b61Var, qoe.d(-1, 48.0f, nm7.D1, 12.0f, 12.0f, 12.0f, 12.0f));
        q7c b1 = b1(activity, new jac(this) { // from class: gc
            public final /* synthetic */ jc b;

            {
                this.b = this;
            }

            @Override // jac
            public final void a(Object obj, Object obj2) {
                byte b3 = b;
                jc jcVar = this.b;
                ArrayList arrayList = (ArrayList) obj;
                switch (b3) {
                    case 0:
                        mc mcVar = jcVar.W1;
                        if (mcVar != null) {
                            ArrayList arrayList2 = mcVar.b;
                            arrayList.add(c6c.m(jcVar.c2));
                            arrayList.add(c6c.u(jb6.M0(2131754277, null)));
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                TL_agent.agentProvider agentprovider = (TL_agent.agentProvider) arrayList2.get(i2);
                                int i3 = bd.b;
                                c6c K = c6c.K(bd.class);
                                K.d = 1;
                                K.H = agentprovider;
                                K.A = 1;
                                arrayList.add(K);
                            }
                            if (arrayList2.isEmpty()) {
                                arrayList.add(c6c.p(6));
                            }
                            arrayList.add(c6c.C(jb6.M0(2131754276, null)));
                            arrayList.add(c6c.D(gm.L(8.0f)));
                            break;
                        }
                        break;
                    default:
                        if (jcVar.W1 != null && jcVar.k2 != null) {
                            arrayList.add(c6c.m(jcVar.d2));
                            TL_agent.agentProvider agentprovider2 = jcVar.k2;
                            int i4 = bd.b;
                            c6c K2 = c6c.K(bd.class);
                            K2.d = 0;
                            K2.H = agentprovider2;
                            K2.A = 0;
                            K2.g = false;
                            arrayList.add(K2);
                            arrayList.add(c6c.C(null));
                            arrayList.add(c6c.k(jcVar.e2));
                            arrayList.add(c6c.k(jcVar.g2));
                            if (TextUtils.isEmpty(jcVar.k2.key_url)) {
                                arrayList.add(c6c.C(jb6.M0(2131754299, null).replace("**", "")));
                            } else {
                                arrayList.add(c6c.C(gm.N2(jb6.M0(2131754299, null), -1, 0, new pf2(jcVar, jcVar.k2.key_url, (byte) 23), null)));
                            }
                            arrayList.add(c6c.m(jcVar.i2));
                            break;
                        }
                        break;
                }
            }
        }, new l0(this, (byte) 8));
        this.a2 = b1;
        q7c b12 = b1(activity, new jac(this) { // from class: gc
            public final /* synthetic */ jc b;

            {
                this.b = this;
            }

            @Override // jac
            public final void a(Object obj, Object obj2) {
                byte b3 = b2;
                jc jcVar = this.b;
                ArrayList arrayList = (ArrayList) obj;
                switch (b3) {
                    case 0:
                        mc mcVar = jcVar.W1;
                        if (mcVar != null) {
                            ArrayList arrayList2 = mcVar.b;
                            arrayList.add(c6c.m(jcVar.c2));
                            arrayList.add(c6c.u(jb6.M0(2131754277, null)));
                            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                TL_agent.agentProvider agentprovider = (TL_agent.agentProvider) arrayList2.get(i2);
                                int i3 = bd.b;
                                c6c K = c6c.K(bd.class);
                                K.d = 1;
                                K.H = agentprovider;
                                K.A = 1;
                                arrayList.add(K);
                            }
                            if (arrayList2.isEmpty()) {
                                arrayList.add(c6c.p(6));
                            }
                            arrayList.add(c6c.C(jb6.M0(2131754276, null)));
                            arrayList.add(c6c.D(gm.L(8.0f)));
                            break;
                        }
                        break;
                    default:
                        if (jcVar.W1 != null && jcVar.k2 != null) {
                            arrayList.add(c6c.m(jcVar.d2));
                            TL_agent.agentProvider agentprovider2 = jcVar.k2;
                            int i4 = bd.b;
                            c6c K2 = c6c.K(bd.class);
                            K2.d = 0;
                            K2.H = agentprovider2;
                            K2.A = 0;
                            K2.g = false;
                            arrayList.add(K2);
                            arrayList.add(c6c.C(null));
                            arrayList.add(c6c.k(jcVar.e2));
                            arrayList.add(c6c.k(jcVar.g2));
                            if (TextUtils.isEmpty(jcVar.k2.key_url)) {
                                arrayList.add(c6c.C(jb6.M0(2131754299, null).replace("**", "")));
                            } else {
                                arrayList.add(c6c.C(gm.N2(jb6.M0(2131754299, null), -1, 0, new pf2(jcVar, jcVar.k2.key_url, (byte) 23), null)));
                            }
                            arrayList.add(c6c.m(jcVar.i2));
                            break;
                        }
                        break;
                }
            }
        }, null);
        this.b2 = b12;
        viewArr[0] = b1;
        viewArr[1] = b12;
        icVar.addView(b1, qoe.e(-1, -2, 48));
        icVar.addView(b12, qoe.e(-1, -2, 48));
        icVar.a();
        c.g();
        b1.g3.O(false);
    }

    public final void Z0() {
        if (this.k2 == null || this.l2) {
            return;
        }
        String trim = this.g2.getText().toString().trim();
        if (TextUtils.isEmpty(trim)) {
            return;
        }
        byte b = 1;
        this.l2 = true;
        String M0 = jb6.M0(2131754293, null);
        b61 b61Var = this.j2;
        b61Var.i(M0, true, true);
        b61Var.setLoading(true);
        d1();
        String str = this.k2.id;
        x0 x0Var = new x0(this, str, b);
        mc mcVar = this.W1;
        mcVar.getClass();
        TL_agent.connect connectVar = new TL_agent.connect();
        connectVar.provider = str;
        connectVar.key = trim;
        ConnectionsManager.getInstance(mcVar.a).sendRequestTyped(connectVar, new kc((byte) 0), new lf2(mcVar, x0Var, b));
    }

    public final FrameLayout a1(Activity activity, String str, ec ecVar) {
        FrameLayout frameLayout = new FrameLayout(activity);
        if (ecVar != null) {
            ImageView imageView = new ImageView(activity);
            imageView.setImageResource(R.drawable.ic_ab_back);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.F6, this.J0), PorterDuff.Mode.SRC_IN));
            imageView.setBackground(cmb.f0(cmb.v0(cmb.h6, this.J0), 1, -1));
            imageView.setOnClickListener(ecVar);
            rve.a(imageView);
            frameLayout.addView(imageView, qoe.d(48, 48.0f, (jb6.a0 ? 5 : 3) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        }
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setTextColor(cmb.v0(cmb.F6, this.J0));
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(str);
        frameLayout.addView(textView, qoe.d(-1, -2.0f, 23, ecVar != null ? 60.0f : 22.0f, 0.0f, 22.0f, 0.0f));
        frameLayout.setMinimumHeight(gm.L(56.0f));
        return frameLayout;
    }

    public final q7c b1(Activity activity, jac jacVar, l0 l0Var) {
        q7c q7cVar = new q7c(activity, this.a, 0, true, jacVar, l0Var, null, this.J0);
        q7cVar.g3.r = false;
        q7cVar.r1();
        q7cVar.setNestedScrollingEnabled(false);
        q7cVar.setOverScrollMode(2);
        q7cVar.setItemAnimator(null);
        return q7cVar;
    }

    public final void c1(boolean z) {
        wi8.s(this.f2.animate(), z ? 1.0f : 0.0f, 220L);
    }

    public final void d1() {
        this.j2.setEnabled((this.l2 || TextUtils.isEmpty(this.g2.getText().toString().trim())) ? false : true);
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.c4) {
            this.a2.g3.O(false);
        }
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        nm7.f(this.a).n(this, nm7.c4);
        gm.t1(this.g2.d);
        super.dismiss();
    }

    @Override // my0, android.app.Dialog
    public final void onBackPressed() {
        ic icVar = this.Z1;
        if (!icVar.b || this.Y1) {
            super.onBackPressed();
        } else {
            if (this.l2) {
                return;
            }
            gm.t1(this.g2.d);
            icVar.b(0, true);
        }
    }

    @Override // el7, my0, android.app.Dialog
    public final void show() {
        super.show();
        nm7.f(this.a).b(this, nm7.c4);
    }
}
