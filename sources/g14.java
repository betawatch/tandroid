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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class g14 extends FrameLayout implements snb, fn7 {
    public Paint E;
    public byte F;
    public AnimatorSet G;
    public final /* synthetic */ o24 H;
    public int a;
    public int b;
    public final e29 c;
    public final ema d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public final TextView n;
    public final ok8 r;
    public TLRPC.TL_inputStickerSetID s;
    public TLRPC.TL_inputStickerSetID w;
    public c14 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g14(o24 o24Var, Context context) {
        super(context);
        this.H = o24Var;
        xob xobVar = yob.a;
        e29 e29Var = new e29(context);
        this.c = e29Var;
        e29Var.f(R.raw.unlock_icon, 24, 24, null);
        int i = aob.Lf;
        vnb vnbVar = o24Var.a2;
        yob.s(e29Var, i, vnbVar, PorterDuff.Mode.SRC_ATOP);
        addView(e29Var, tre.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        ema emaVar = new ema(context);
        this.d = emaVar;
        emaVar.setTextSize(15);
        yob.W(emaVar, i, vnbVar);
        emaVar.setTypeface(hl.o());
        emaVar.setOnClickListener(new f14(this, (byte) 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        yob.X(textView, i, vnbVar);
        textView.setTypeface(hl.o());
        int L = hl.L(8.0f);
        int i2 = aob.Ef;
        ShapeDrawable b0 = aob.b0(L, aob.p1(0.12f, o24Var.y(i2)));
        uob K = yob.K(0.12f, i2);
        textView.setBackground(b0);
        yob.j(textView, b0, K, null, vnbVar);
        textView.setPadding(hl.L(6.0f), hl.L(1.5f), hl.L(6.0f), hl.L(1.5f));
        textView.setText(ob6.M0(2131749198, null));
        emaVar.setEllipsizeByGradient(true);
        addView(emaVar, tre.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, tre.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setPadding(hl.L(11.0f), hl.L(11.0f), hl.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new f14(this, (byte) 1));
        addView(frameLayout, tre.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        textView2.setText(ob6.M0(2131754479, null));
        yob.X(textView2, aob.Ji, vnbVar);
        int i3 = aob.Fi;
        textView2.setBackground(rnb.d(o24Var.y(i3), o24Var.y(aob.Hi), 16.0f));
        textView2.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new f14(this, (byte) 2));
        frameLayout.addView(textView2, tre.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(hl.o());
        textView3.setText(ob6.M0(2131744512, null));
        yob.X(textView3, aob.Ii, vnbVar);
        textView3.setBackground(rnb.d(0, o24Var.y(i3) & 452984831, 16.0f));
        textView3.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(hl.L(4.0f));
        textView3.setOnClickListener(new f14(this, (byte) 3));
        frameLayout.addView(textView3, tre.h(-2.0f, 26.0f, 8388661));
        ok8 ok8Var = new ok8(hl.L(16.0f), vnbVar, context, false);
        this.r = ok8Var;
        ok8Var.setIcon(R.raw.unlock_icon);
        ok8Var.b(ob6.M0(2131743531, null), new f14(this, (byte) 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ok8Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = hl.L(1.0f);
            marginLayoutParams.topMargin = hl.L(1.0f);
            int L2 = hl.L(20.0f);
            marginLayoutParams.height = L2;
            marginLayoutParams.width = L2;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ok8Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = hl.L(5.0f);
            marginLayoutParams2.topMargin = hl.L(-0.5f);
            ok8Var.getChildAt(0).setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f.addView(this.r, tre.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z) {
        char c;
        float f;
        c14 c14Var = this.x;
        if (c14Var == null) {
            return;
        }
        boolean z2 = c14Var.f;
        o24 o24Var = this.H;
        byte b = (this.x.e || yac.h(o24Var.d1).p() || o24Var.V0) ? this.x.g ? z2 || o24Var.q1.contains(Long.valueOf(c14Var.b.id)) ? (byte) 3 : (byte) 2 : (byte) 0 : (byte) 1;
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
        ok8 ok8Var = this.r;
        ok8Var.setEnabled(z3);
        boolean z4 = b == 2;
        TextView textView = this.h;
        textView.setEnabled(z4);
        boolean z5 = b == 3;
        TextView textView2 = this.n;
        textView2.setEnabled(z5);
        ema emaVar = this.d;
        e29 e29Var = this.c;
        if (!z) {
            e29Var.setAlpha(b == 1 ? 1.0f : 0.0f);
            e29Var.setTranslationX(b == 1 ? 0.0f : -hl.L(16.0f));
            emaVar.setTranslationX(b == 1 ? hl.L(16.0f) : 0.0f);
            ok8Var.setAlpha(b == 1 ? 1.0f : 0.0f);
            ok8Var.setScaleX(b == 1 ? 1.0f : 0.6f);
            ok8Var.setScaleY(b == 1 ? 1.0f : 0.6f);
            ok8Var.setVisibility(b == 1 ? 0 : 8);
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
            f = -hl.L(16.0f);
        }
        float[] fArr = new float[1];
        fArr[c] = f;
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c] = b == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(e29Var, (Property<e29, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c] = b == 1 ? hl.L(16.0f) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(emaVar, (Property<ema, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c] = b == 1 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ok8Var, (Property<ok8, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c] = b == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ok8Var, (Property<ok8, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c] = b == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(ok8Var, (Property<ok8, Float>) property4, fArr6);
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
        this.G.addListener(new ry1(this, b, (byte) 1));
        this.G.setDuration(250L);
        this.G.setInterpolator(new OvershootInterpolator(1.02f));
        this.G.start();
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_messages_stickerSet p0;
        TLRPC.TL_messages_stickerSet p02;
        o24 o24Var = this.H;
        int i3 = o24Var.d1;
        if (i == jn7.B0) {
            if (this.s != null && (p02 = ls6.d0(i3).p0(this.s.id)) != null && p02.set != null) {
                e eVar = o24Var.Z1;
                if (eVar == null) {
                    eVar = new qu0(this, (byte) 5);
                }
                ly3.F0(eVar, p02, true, null, new lw3(this, (byte) 6));
                this.s = null;
            }
            if (this.w == null || (p0 = ls6.d0(i3).p0(this.w.id)) == null || p0.set == null) {
                return;
            }
            e eVar2 = o24Var.Z1;
            if (eVar2 == null) {
                eVar2 = new qu0(this, (byte) 5);
            }
            e eVar3 = eVar2;
            vx3 vx3Var = new vx3(this, p0, (byte) 3);
            Pattern pattern = ly3.P1;
            if (eVar3.getFragmentView() != null) {
                ls6.d0(eVar3.getCurrentAccount()).i2(eVar3.getFragmentView().getContext(), p0, null, 0, eVar3, null, true, true, vx3Var, false);
            }
            this.w = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.H.d1).n(this, jn7.B0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.y) {
            if (this.E == null) {
                Paint paint = new Paint(1);
                this.E = paint;
                paint.setStrokeWidth(1.0f);
                this.E.setColor(this.H.y(aob.d7));
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
        int L = hl.L(11.0f) + this.f.getWidth();
        TextView textView = this.e;
        int measuredWidth = L + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() : 0);
        ema emaVar = this.d;
        emaVar.setRightPadding(measuredWidth);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(hl.L(4.0f) + emaVar.getTextWidth());
            float L2 = hl.L(4.0f) + (emaVar.getMaxTextWidth() - measuredWidth);
            if (textView.getTranslationX() > L2) {
                textView.setTranslationX(L2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = hl.L(this.F == 0 ? 10.0f : 15.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(this.F == 0 ? 32.0f : 42.0f), TLObject.FLAG_30));
    }

    @Override // snb
    public final void updateColors() {
        o24 o24Var = this.H;
        try {
            int y = o24Var.y(aob.Fi);
            int y2 = o24Var.y(aob.Hi);
            if (y != this.a || y2 != this.b) {
                this.a = y;
                this.b = y2;
                TextView textView = this.h;
                if (textView != null) {
                    aob.F1(textView.getBackground(), y, false);
                    aob.F1(textView.getBackground(), y2, true);
                    textView.invalidate();
                }
                TextView textView2 = this.n;
                if (textView2 != null) {
                    aob.F1(textView2.getBackground(), y & 452984831, true);
                    textView2.invalidate();
                }
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
