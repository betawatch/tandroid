// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bp5 extends my0 implements jm7 {
    public final TextView[] l1;
    public final TextView m1;
    public final k46 n1;
    public final yv1 o1;
    public final s09 p1;
    public final ap5 q1;
    public boolean r1;
    public final p09 s1;
    public final TextView[] t1;
    public final String u1;

    public bp5(Context context, String str, yv1 yv1Var, ylb ylbVar) {
        super(1, ylbVar, context, false);
        this.l1 = new TextView[2];
        this.t1 = new TextView[2];
        kg5 kg5Var = new kg5(this, (byte) 5);
        this.w0 = false;
        this.v0 = false;
        this.o1 = yv1Var;
        this.u1 = str;
        FrameLayout frameLayout = new FrameLayout(context);
        this.O = frameLayout;
        TextView textView = new TextView(context);
        wi8.v(textView, 1, 20.0f);
        int i = cmb.i5;
        anb.X(textView, i, ylbVar);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 51, 17.0f, 20.0f, 17.0f, 0.0f));
        p09 p09Var = new p09(R.raw.import_finish, gm.L(120.0f), gm.L(120.0f), false, null);
        this.s1 = p09Var;
        p09Var.E(true);
        s09 s09Var = new s09(context);
        this.p1 = s09Var;
        s09Var.setAutoRepeat(true);
        s09Var.f(R.raw.import_loop, nm7.E1, nm7.E1, null);
        s09Var.d();
        frameLayout.addView(s09Var, qoe.d(nm7.p2, 160.0f, 49, 17.0f, 79.0f, 17.0f, 0.0f));
        s09Var.getAnimatedDrawable().N(nm7.H2, kg5Var);
        TextView textView2 = new TextView(context);
        this.m1 = textView2;
        wi8.v(textView2, 1, 24.0f);
        anb.X(textView2, i, ylbVar);
        frameLayout.addView(textView2, qoe.d(-2, -2.0f, 49, 17.0f, 262.0f, 17.0f, 0.0f));
        k46 k46Var = new k46(getContext());
        this.n1 = k46Var;
        int i2 = cmb.Ei;
        k46Var.setProgressColor(cmb.v0(i2, this.J0));
        k46Var.setBackColor(cmb.v0(cmb.F5, this.J0));
        frameLayout.addView(k46Var, qoe.d(-1, 4.0f, 51, 50.0f, 307.0f, 50.0f, 0.0f));
        ap5 ap5Var = new ap5(context);
        View view = new View(context);
        ap5Var.a = view;
        int L = gm.L(4.0f);
        int v0 = cmb.v0(i2, ylbVar);
        int i3 = cmb.Gi;
        int v02 = cmb.v0(i3, ylbVar);
        Drawable i0 = cmb.i0(L, L, L, L, v0, v02, v02);
        wmb M = anb.M(i2);
        wmb M2 = anb.M(i3);
        view.setBackground(i0);
        anb.j(view, i0, M, M2, ylbVar);
        ap5Var.addView(view, qoe.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        ap5Var.d = linearLayout;
        linearLayout.setOrientation(0);
        ap5Var.addView(linearLayout, qoe.e(-2, -2, 17));
        s09 s09Var2 = new s09(context);
        ap5Var.c = s09Var2;
        int L2 = gm.L(20.0f);
        int i4 = cmb.Ii;
        ShapeDrawable K = cmb.K(L2, cmb.v0(i4, ylbVar));
        wmb M3 = anb.M(i4);
        s09Var2.setBackground(K);
        anb.j(s09Var2, K, M3, null, ylbVar);
        s09Var2.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(s09Var2, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
        s09Var2.f(R.raw.import_check, 26, 26, null);
        s09Var2.setScaleX(0.8f);
        s09Var2.setScaleY(0.8f);
        linearLayout.addView(s09Var2, qoe.r(20, 20, 16));
        TextView textView3 = new TextView(context);
        ap5Var.b = textView3;
        textView3.setLines(1);
        textView3.setSingleLine(true);
        textView3.setGravity(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(17);
        td4.x(textView3, i4, ylbVar, 1, 14.0f);
        linearLayout.addView(textView3, qoe.t(-2, -2, 16, 10, 0, 0, 0));
        this.q1 = ap5Var;
        ap5Var.setBackground(null);
        ap5Var.setText(jb6.M0(2131749019, null));
        ap5Var.setVisibility(4);
        view.setOnClickListener(new ca5(this, (byte) 11));
        view.setPivotY(gm.L(48.0f));
        view.setScaleY(0.04f);
        frameLayout.addView(ap5Var, qoe.d(-1, 50.0f, 51, 34.0f, 247.0f, 34.0f, 0.0f));
        for (int i5 = 0; i5 < 2; i5++) {
            this.l1[i5] = new TextView(context);
            this.l1[i5].setTextSize(1, 16.0f);
            this.l1[i5].setTypeface(gm.o());
            anb.X(this.l1[i5], cmb.i5, ylbVar);
            frameLayout.addView(this.l1[i5], qoe.d(-2, -2.0f, 49, 17.0f, 340.0f, 17.0f, 0.0f));
            this.t1[i5] = new TextView(context);
            this.t1[i5].setTextSize(1, 14.0f);
            anb.X(this.t1[i5], cmb.q5, ylbVar);
            this.t1[i5].setGravity(1);
            frameLayout.addView(this.t1[i5], qoe.d(-2, -2.0f, 49, 30.0f, 368.0f, 30.0f, 44.0f));
            TextView[] textViewArr = this.t1;
            if (i5 == 0) {
                textViewArr[i5].setText(jb6.M0(2131749004, null));
            } else {
                textViewArr[i5].setAlpha(0.0f);
                this.t1[i5].setTranslationY(gm.L(10.0f));
                this.l1[i5].setAlpha(0.0f);
                this.l1[i5].setTranslationY(gm.L(10.0f));
            }
        }
        if (this.o1 != null) {
            textView.setText(jb6.M0(2131749003, null));
            r5a A = this.o1.getSendMessagesHelper().A(this.o1.a());
            this.m1.setText(String.format("%d%%", Integer.valueOf(A.l)));
            this.n1.a(false, A.l / 100.0f);
            this.l1[0].setText(jb6.a0("ImportCount", null, 2131749020, gm.i0(A.i, false, false), gm.i0(A.h, false, false)));
            this.t1[1].setText(jb6.M0(2131749018, null));
            this.l1[1].setText(jb6.M0(2131749017, null));
            this.o1.getNotificationCenter().b(this, nm7.v1);
            return;
        }
        textView.setText(jb6.M0(2131748993, null));
        v5a v5aVar = (v5a) a6a.B(this.a).G.get(str);
        this.m1.setText(String.format("%d%%", Integer.valueOf(v5aVar.j)));
        this.n1.a(false, v5aVar.j / 100.0f);
        this.l1[0].setText(jb6.a0("ImportCount", null, 2131749020, gm.i0(v5aVar.i, false, false), gm.i0(v5aVar.h, false, false)));
        this.t1[1].setText(jb6.M0(2131748998, null));
        this.l1[1].setText(jb6.M0(2131748997, null));
        nm7.f(this.a).b(this, nm7.w1);
    }

    public final void D0() {
        this.r1 = true;
        this.p1.setAutoRepeat(false);
        ap5 ap5Var = this.q1;
        ap5Var.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        animatorSet.setInterpolator(d53.g);
        Property property = View.ALPHA;
        TextView textView = this.m1;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f);
        Property property2 = View.TRANSLATION_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, -gm.L(10.0f));
        TextView[] textViewArr = this.t1;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(textViewArr[0], (Property<TextView, Float>) property2, -gm.L(10.0f));
        TextView[] textViewArr2 = this.l1;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property, 0.0f), ObjectAnimator.ofFloat(textViewArr2[0], (Property<TextView, Float>) property2, -gm.L(10.0f)), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(textViewArr2[1], (Property<TextView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.n1, (Property<k46, Float>) property, 0.0f), ObjectAnimator.ofFloat(ap5Var.d, (Property<LinearLayout, Float>) property2, gm.L(8.0f), 0.0f));
        ap5Var.a.animate().scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        ap5Var.c.animate().scaleY(1.0f).scaleX(1.0f).setInterpolator(new OvershootInterpolator(1.02f)).setDuration(250L).start();
        ap5Var.c.d();
        animatorSet.start();
    }

    @Override // my0
    public final void H() {
        super.H();
        yv1 yv1Var = this.o1;
        if (yv1Var != null) {
            yv1Var.getNotificationCenter().n(this, nm7.v1);
        } else {
            nm7.f(this.a).n(this, nm7.w1);
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.v1;
        k46 k46Var = this.n1;
        TextView[] textViewArr = this.l1;
        TextView textView = this.m1;
        s09 s09Var = this.p1;
        if (i == i3) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            yv1 yv1Var = this.o1;
            r5a A = yv1Var.getSendMessagesHelper().A(yv1Var.a());
            if (A == null) {
                D0();
                return;
            }
            if (!this.r1 && ((180 - s09Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= A.p) {
                s09Var.setAutoRepeat(false);
                this.r1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(A.l)));
            textViewArr[0].setText(jb6.a0("ImportCount", null, 2131749020, gm.i0(A.i, false, false), gm.i0(A.h, false, false)));
            k46Var.a(true, A.l / 100.0f);
            return;
        }
        if (i == nm7.w1) {
            if (objArr.length > 1) {
                dismiss();
                return;
            }
            v5a v5aVar = (v5a) a6a.B(this.a).G.get(this.u1);
            if (v5aVar == null) {
                D0();
                return;
            }
            if (!this.r1 && ((180 - s09Var.getAnimatedDrawable().b0) * 16.6d) + 3000.0d >= v5aVar.n) {
                s09Var.setAutoRepeat(false);
                this.r1 = true;
            }
            textView.setText(String.format("%d%%", Integer.valueOf(v5aVar.j)));
            textViewArr[0].setText(jb6.a0("ImportCount", null, 2131749020, gm.i0(v5aVar.i, false, false), gm.i0(v5aVar.h, false, false)));
            k46Var.a(true, v5aVar.j / 100.0f);
        }
    }

    @Override // my0
    public final void p0() {
        try {
            super.p0();
            k46 k46Var = this.n1;
            if (k46Var != null) {
                k46Var.setProgressColor(cmb.v0(cmb.Ei, this.J0));
                k46Var.setBackColor(cmb.v0(cmb.F5, this.J0));
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
