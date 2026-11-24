// default package

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class l04 extends FrameLayout implements tjb, gk7 {
    public Paint E;
    public byte F;
    public AnimatorSet G;
    public final /* synthetic */ t14 H;
    public int a;
    public int b;
    public final ry8 c;
    public final jia d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public final TextView n;
    public final ah8 r;
    public TLRPC.TL_inputStickerSetID s;
    public TLRPC.TL_inputStickerSetID w;
    public h04 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l04(t14 t14Var, Context context) {
        super(context);
        this.H = t14Var;
        ykb ykbVar = zkb.a;
        ry8 ry8Var = new ry8(context);
        this.c = ry8Var;
        ry8Var.f(R.raw.unlock_icon, 24, 24, null);
        int i = bkb.Kf;
        wjb wjbVar = t14Var.a2;
        zkb.s(ry8Var, i, wjbVar, PorterDuff.Mode.SRC_ATOP);
        addView(ry8Var, nme.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        jia jiaVar = new jia(context);
        this.d = jiaVar;
        jiaVar.setTextSize(15);
        zkb.W(jiaVar, i, wjbVar);
        jiaVar.setTypeface(gl.o());
        jiaVar.setOnClickListener(new k04(this, (byte) 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        zkb.X(textView, i, wjbVar);
        textView.setTypeface(gl.o());
        int L = gl.L(8.0f);
        int i2 = bkb.Df;
        ShapeDrawable b0 = bkb.b0(L, bkb.p1(0.12f, t14Var.y(i2)));
        vkb K = zkb.K(0.12f, i2);
        textView.setBackground(b0);
        zkb.j(textView, b0, K, null, wjbVar);
        textView.setPadding(gl.L(6.0f), gl.L(1.5f), gl.L(6.0f), gl.L(1.5f));
        textView.setText(k96.M0(2131749252, null));
        jiaVar.setEllipsizeByGradient(true);
        addView(jiaVar, nme.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, nme.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setPadding(gl.L(11.0f), gl.L(11.0f), gl.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new k04(this, (byte) 1));
        addView(frameLayout, nme.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        textView2.setText(k96.M0(2131754483, null));
        zkb.X(textView2, bkb.Ii, wjbVar);
        int i3 = bkb.Ei;
        textView2.setBackground(sjb.d(t14Var.y(i3), t14Var.y(bkb.Gi), 16.0f));
        textView2.setPadding(gl.L(14.0f), 0, gl.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new k04(this, (byte) 2));
        frameLayout.addView(textView2, nme.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(gl.o());
        textView3.setText(k96.M0(2131744618, null));
        zkb.X(textView3, bkb.Hi, wjbVar);
        textView3.setBackground(sjb.d(0, t14Var.y(i3) & 452984831, 16.0f));
        textView3.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(gl.L(4.0f));
        textView3.setOnClickListener(new k04(this, (byte) 3));
        frameLayout.addView(textView3, nme.h(-2.0f, 26.0f, 8388661));
        ah8 ah8Var = new ah8(gl.L(16.0f), wjbVar, context, false);
        this.r = ah8Var;
        ah8Var.setIcon(R.raw.unlock_icon);
        ah8Var.b(k96.M0(2131743637, null), new k04(this, (byte) 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ah8Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = gl.L(1.0f);
            marginLayoutParams.topMargin = gl.L(1.0f);
            int L2 = gl.L(20.0f);
            marginLayoutParams.height = L2;
            marginLayoutParams.width = L2;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ah8Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = gl.L(5.0f);
            marginLayoutParams2.topMargin = gl.L(-0.5f);
            ah8Var.getChildAt(0).setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f.addView(this.r, nme.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z) {
        char c;
        float f;
        h04 h04Var = this.x;
        if (h04Var == null) {
            return;
        }
        boolean z2 = h04Var.f;
        t14 t14Var = this.H;
        byte b = (this.x.e || y6c.h(t14Var.d1).p() || t14Var.V0) ? this.x.g ? z2 || t14Var.q1.contains(Long.valueOf(h04Var.b.id)) ? (byte) 3 : (byte) 2 : (byte) 0 : (byte) 1;
        if ((b == 0) != (this.F == 0)) {
            requestLayout();
        }
        this.F = b;
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G = null;
        }
        boolean z3 = b == 1;
        ah8 ah8Var = this.r;
        ah8Var.setEnabled(z3);
        boolean z4 = b == 2;
        TextView textView = this.h;
        textView.setEnabled(z4);
        boolean z5 = b == 3;
        TextView textView2 = this.n;
        textView2.setEnabled(z5);
        jia jiaVar = this.d;
        ry8 ry8Var = this.c;
        if (!z) {
            ry8Var.setAlpha(b == 1 ? 1.0f : 0.0f);
            ry8Var.setTranslationX(b == 1 ? 0.0f : -gl.L(16.0f));
            jiaVar.setTranslationX(b == 1 ? gl.L(16.0f) : 0.0f);
            ah8Var.setAlpha(b == 1 ? 1.0f : 0.0f);
            ah8Var.setScaleX(b == 1 ? 1.0f : 0.6f);
            ah8Var.setScaleY(b == 1 ? 1.0f : 0.6f);
            ah8Var.setVisibility(b == 1 ? 0 : 8);
            textView.setAlpha(b == 2 ? 1.0f : 0.0f);
            textView.setScaleX(b == 2 ? 1.0f : 0.6f);
            textView.setScaleY(b == 2 ? 1.0f : 0.6f);
            textView.setVisibility(b == 2 ? 0 : 8);
            textView2.setAlpha(b == 3 ? 1.0f : 0.0f);
            textView2.setScaleX(b == 3 ? 1.0f : 0.6f);
            textView2.setScaleY(b == 3 ? 1.0f : 0.6f);
            textView2.setVisibility(b == 3 ? 0 : 8);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G = animatorSet2;
        if (b == 1) {
            f = 0.0f;
            c = 0;
        } else {
            c = 0;
            f = -gl.L(16.0f);
        }
        float[] fArr = new float[1];
        fArr[c] = f;
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ry8Var, (Property<ry8, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c] = b == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ry8Var, (Property<ry8, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c] = b == 1 ? gl.L(16.0f) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(jiaVar, (Property<jia, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c] = b == 1 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ah8Var, (Property<ah8, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c] = b == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ah8Var, (Property<ah8, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c] = b == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(ah8Var, (Property<ah8, Float>) property4, fArr6);
        float[] fArr7 = new float[1];
        fArr7[c] = b == 2 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr7);
        float[] fArr8 = new float[1];
        fArr8[c] = b == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, fArr8);
        float[] fArr9 = new float[1];
        fArr9[c] = b == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr9);
        float[] fArr10 = new float[1];
        fArr10[c] = b == 3 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr10);
        float[] fArr11 = new float[1];
        fArr11[c] = b == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr11);
        float[] fArr12 = new float[1];
        fArr12[c] = b == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr12);
        Animator[] animatorArr = new Animator[12];
        animatorArr[c] = ofFloat;
        animatorArr[1] = ofFloat2;
        animatorArr[2] = ofFloat3;
        animatorArr[3] = ofFloat4;
        animatorArr[4] = ofFloat5;
        animatorArr[5] = ofFloat6;
        animatorArr[6] = ofFloat7;
        animatorArr[7] = ofFloat8;
        animatorArr[8] = ofFloat9;
        animatorArr[9] = ofFloat10;
        animatorArr[10] = ofFloat11;
        animatorArr[11] = ofFloat12;
        animatorSet2.playTogether(animatorArr);
        this.G.addListener(new by1(this, b, (byte) 1));
        this.G.setDuration(250L);
        this.G.setInterpolator(new OvershootInterpolator(1.02f));
        this.G.start();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_messages_stickerSet p0;
        TLRPC.TL_messages_stickerSet p02;
        t14 t14Var = this.H;
        int i3 = t14Var.d1;
        if (i == kk7.A0) {
            if (this.s != null && (p02 = hq6.d0(i3).p0(this.s.id)) != null && p02.set != null) {
                d dVar = t14Var.Z1;
                if (dVar == null) {
                    dVar = new hu0(this, (byte) 5);
                }
                qx3.E0(dVar, p02, true, null, new li3(this, (byte) 27));
                this.s = null;
            }
            if (this.w == null || (p0 = hq6.d0(i3).p0(this.w.id)) == null || p0.set == null) {
                return;
            }
            d dVar2 = t14Var.Z1;
            if (dVar2 == null) {
                dVar2 = new hu0(this, (byte) 5);
            }
            d dVar3 = dVar2;
            eu3 eu3Var = new eu3(this, p0, (byte) 6);
            Pattern pattern = qx3.P1;
            if (dVar3.getFragmentView() != null) {
                hq6.d0(dVar3.getCurrentAccount()).i2(dVar3.getFragmentView().getContext(), p0, null, 0, dVar3, null, true, true, eu3Var, false);
            }
            this.w = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        kk7.f(this.H.d1).n(this, kk7.A0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.y) {
            if (this.E == null) {
                Paint paint = new Paint(1);
                this.E = paint;
                paint.setStrokeWidth(1.0f);
                this.E.setColor(this.H.y(bkb.c7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.E);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int L = gl.L(11.0f) + this.f.getWidth();
        TextView textView = this.e;
        int measuredWidth = L + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() : 0);
        jia jiaVar = this.d;
        jiaVar.setRightPadding(measuredWidth);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(gl.L(4.0f) + jiaVar.getTextWidth());
            float L2 = gl.L(4.0f) + (jiaVar.getMaxTextWidth() - measuredWidth);
            if (textView.getTranslationX() > L2) {
                textView.setTranslationX(L2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = gl.L(this.F == 0 ? 10.0f : 15.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(this.F == 0 ? 32.0f : 42.0f), TLObject.FLAG_30));
    }

    @Override // tjb
    public final void updateColors() {
        t14 t14Var = this.H;
        try {
            int y = t14Var.y(bkb.Ei);
            int y2 = t14Var.y(bkb.Gi);
            if (y != this.a || y2 != this.b) {
                this.a = y;
                this.b = y2;
                TextView textView = this.h;
                if (textView != null) {
                    bkb.F1(textView.getBackground(), y, false);
                    bkb.F1(textView.getBackground(), y2, true);
                    textView.invalidate();
                }
                TextView textView2 = this.n;
                if (textView2 != null) {
                    bkb.F1(textView2.getBackground(), y & 452984831, true);
                    textView2.invalidate();
                }
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
