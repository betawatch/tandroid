package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class jx extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs {
    public Paint E;
    public int F;
    public AnimatorSet G;
    public final /* synthetic */ ry H;
    public int a;
    public int b;
    public final ph0 c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public final TextView n;
    public final ug.s0 r;
    public TLRPC.TL_inputStickerSetID s;
    public TLRPC.TL_inputStickerSetID w;
    public fx x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(ry ryVar, Context context) {
        super(context);
        this.H = ryVar;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.a;
        ph0 ph0Var = new ph0(context);
        this.c = ph0Var;
        ph0Var.f(R.raw.unlock_icon, 24, 24, null);
        int i7 = org.telegram.ui.ActionBar.n6.Lf;
        org.telegram.ui.ActionBar.i6 i6Var = ryVar.a2;
        org.telegram.ui.ActionBar.u6.s(ph0Var, i7, i6Var, PorterDuff.Mode.SRC_ATOP);
        addView(ph0Var, c8.ma.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(15);
        org.telegram.ui.ActionBar.u6.X(n5Var, i7, i6Var);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setOnClickListener(new ix(this, 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Ef;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.12f, ryVar.z(i10)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(textView, d02, K, null, i6Var);
        textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f));
        textView.setText(org.telegram.messenger.gd.M0(2131749252, null));
        n5Var.setEllipsizeByGradient(true);
        addView(n5Var, c8.ma.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, c8.ma.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new ix(this, 1));
        addView(frameLayout, c8.ma.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(org.telegram.messenger.gd.M0(2131754484, null));
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        textView2.setBackground(org.telegram.ui.ActionBar.b6.d(ryVar.z(i11), ryVar.z(org.telegram.ui.ActionBar.n6.Hi), 16.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new ix(this, 2));
        frameLayout.addView(textView2, c8.ma.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(org.telegram.messenger.gd.M0(2131744620, null));
        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.Ii, i6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.b6.d(0, ryVar.z(i11) & 452984831, 16.0f));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        textView3.setOnClickListener(new ix(this, 3));
        frameLayout.addView(textView3, c8.ma.h(-2.0f, 26.0f, 8388661));
        ug.s0 s0Var = new ug.s0(org.telegram.messenger.g0.L(16.0f), context, i6Var, false);
        this.r = s0Var;
        s0Var.setIcon(R.raw.unlock_icon);
        s0Var.b(org.telegram.messenger.gd.M0(2131743639, null), new ix(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) s0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L2;
            marginLayoutParams.width = L2;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) s0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = org.telegram.messenger.g0.L(5.0f);
            marginLayoutParams2.topMargin = org.telegram.messenger.g0.L(-0.5f);
            s0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f.addView(this.r, c8.ma.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        char c10;
        float f10;
        fx fxVar = this.x;
        if (fxVar == null) {
            return;
        }
        boolean z11 = fxVar.f;
        ry ryVar = this.H;
        int i7 = (this.x.e || org.telegram.messenger.j10.i(ryVar.d1).q() || ryVar.V0) ? this.x.g ? z11 || ryVar.q1.contains(Long.valueOf(fxVar.b.id)) ? 3 : 2 : 0 : 1;
        if ((i7 == 0) != (this.F == 0)) {
            requestLayout();
        }
        this.F = i7;
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G = null;
        }
        boolean z12 = i7 == 1;
        ug.s0 s0Var = this.r;
        s0Var.setEnabled(z12);
        boolean z13 = i7 == 2;
        TextView textView = this.h;
        textView.setEnabled(z13);
        boolean z14 = i7 == 3;
        TextView textView2 = this.n;
        textView2.setEnabled(z14);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        ph0 ph0Var = this.c;
        if (!z10) {
            ph0Var.setAlpha(i7 == 1 ? 1.0f : 0.0f);
            ph0Var.setTranslationX(i7 == 1 ? 0.0f : -org.telegram.messenger.g0.L(16.0f));
            n5Var.setTranslationX(i7 == 1 ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            s0Var.setAlpha(i7 == 1 ? 1.0f : 0.0f);
            s0Var.setScaleX(i7 == 1 ? 1.0f : 0.6f);
            s0Var.setScaleY(i7 == 1 ? 1.0f : 0.6f);
            s0Var.setVisibility(i7 == 1 ? 0 : 8);
            textView.setAlpha(i7 == 2 ? 1.0f : 0.0f);
            textView.setScaleX(i7 == 2 ? 1.0f : 0.6f);
            textView.setScaleY(i7 == 2 ? 1.0f : 0.6f);
            textView.setVisibility(i7 == 2 ? 0 : 8);
            textView2.setAlpha(i7 == 3 ? 1.0f : 0.0f);
            textView2.setScaleX(i7 == 3 ? 1.0f : 0.6f);
            textView2.setScaleY(i7 == 3 ? 1.0f : 0.6f);
            textView2.setVisibility(i7 == 3 ? 0 : 8);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G = animatorSet2;
        if (i7 == 1) {
            f10 = 0.0f;
            c10 = 0;
        } else {
            c10 = 0;
            f10 = -org.telegram.messenger.g0.L(16.0f);
        }
        float[] fArr = new float[1];
        fArr[c10] = f10;
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ph0Var, (Property<ph0, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c10] = i7 == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ph0Var, (Property<ph0, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c10] = i7 == 1 ? org.telegram.messenger.g0.L(16.0f) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c10] = i7 == 1 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(s0Var, (Property<ug.s0, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c10] = i7 == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(s0Var, (Property<ug.s0, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c10] = i7 == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(s0Var, (Property<ug.s0, Float>) property4, fArr6);
        float[] fArr7 = new float[1];
        fArr7[c10] = i7 == 2 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr7);
        float[] fArr8 = new float[1];
        fArr8[c10] = i7 == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, fArr8);
        float[] fArr9 = new float[1];
        fArr9[c10] = i7 == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr9);
        float[] fArr10 = new float[1];
        fArr10[c10] = i7 == 3 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr10);
        float[] fArr11 = new float[1];
        fArr11[c10] = i7 == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr11);
        float[] fArr12 = new float[1];
        fArr12[c10] = i7 == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr12);
        Animator[] animatorArr = new Animator[12];
        animatorArr[c10] = ofFloat;
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
        this.G.addListener(new ki.f2(this, i7, 9));
        this.G.setDuration(250L);
        this.G.setInterpolator(new OvershootInterpolator(1.02f));
        this.G.start();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet q02;
        TLRPC.TL_messages_stickerSet q03;
        ry ryVar = this.H;
        int i11 = ryVar.d1;
        if (i7 == org.telegram.messenger.ks.B0) {
            int i12 = 1;
            if (this.s != null && (q03 = org.telegram.messenger.ri.d0(i11).q0(this.s.id)) != null && q03.set != null) {
                org.telegram.ui.ActionBar.h2 h2Var = ryVar.Z1;
                if (h2Var == null) {
                    h2Var = new bi.y8(this, 8);
                }
                bv.K0(h2Var, q03, true, null, new mo(this, 15));
                this.s = null;
            }
            if (this.w == null || (q02 = org.telegram.messenger.ri.d0(i11).q0(this.w.id)) == null || q02.set == null) {
                return;
            }
            org.telegram.ui.ActionBar.h2 h2Var2 = ryVar.Z1;
            if (h2Var2 == null) {
                h2Var2 = new bi.y8(this, 8);
            }
            org.telegram.ui.ActionBar.h2 h2Var3 = h2Var2;
            dw dwVar = new dw(i12, this, q02);
            Pattern pattern = bv.Q1;
            if (h2Var3.getFragmentView() != null) {
                org.telegram.messenger.ri.d0(h2Var3.getCurrentAccount()).l2(h2Var3.getFragmentView().getContext(), q02, null, 0, h2Var3, null, true, true, dwVar, false);
            }
            this.w = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.H.d1).n(this, org.telegram.messenger.ks.B0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.y) {
            if (this.E == null) {
                Paint paint = new Paint(1);
                this.E = paint;
                paint.setStrokeWidth(1.0f);
                this.E.setColor(this.H.z(org.telegram.ui.ActionBar.n6.d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.E);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(11.0f) + this.f.getWidth();
        TextView textView = this.e;
        int measuredWidth = L + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() : 0);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.setRightPadding(measuredWidth);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(org.telegram.messenger.g0.L(4.0f) + n5Var.getTextWidth());
            float L2 = org.telegram.messenger.g0.L(4.0f) + (n5Var.getMaxTextWidth() - measuredWidth);
            if (textView.getTranslationX() > L2) {
                textView.setTranslationX(L2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(this.F == 0 ? 10.0f : 15.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.F == 0 ? 32.0f : 42.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        ry ryVar = this.H;
        try {
            int z10 = ryVar.z(org.telegram.ui.ActionBar.n6.Fi);
            int z11 = ryVar.z(org.telegram.ui.ActionBar.n6.Hi);
            if (z10 == this.a) {
                if (z11 != this.b) {
                }
                invalidate();
            }
            this.a = z10;
            this.b = z11;
            TextView textView = this.h;
            if (textView != null) {
                org.telegram.ui.ActionBar.n6.H1(textView.getBackground(), z10, false);
                org.telegram.ui.ActionBar.n6.H1(textView.getBackground(), z11, true);
                textView.invalidate();
            }
            TextView textView2 = this.n;
            if (textView2 != null) {
                org.telegram.ui.ActionBar.n6.H1(textView2.getBackground(), z10 & 452984831, true);
                textView2.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
