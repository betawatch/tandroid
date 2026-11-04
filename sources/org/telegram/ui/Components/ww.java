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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ww extends FrameLayout implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.cs {
    public Paint E;
    public int F;
    public AnimatorSet G;
    public final /* synthetic */ ey H;
    public int a;
    public int b;
    public final fh0 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public final TextView n;
    public final vg.o0 r;
    public TLRPC.TL_inputStickerSetID s;
    public TLRPC.TL_inputStickerSetID w;
    public sw x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(ey eyVar, Context context) {
        super(context);
        this.H = eyVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.a;
        fh0 fh0Var = new fh0(context);
        this.c = fh0Var;
        fh0Var.f(R.raw.unlock_icon, 24, 24, null);
        int i3 = org.telegram.ui.ActionBar.k6.If;
        org.telegram.ui.ActionBar.e6 e6Var = eyVar.a2;
        org.telegram.ui.ActionBar.r6.t(fh0Var, i3, e6Var, PorterDuff.Mode.SRC_ATOP);
        addView(fh0Var, b8.mf.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(15);
        org.telegram.ui.ActionBar.r6.Y(k5Var, i3, e6Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setOnClickListener(new vw(this, 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Bf;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.12f, eyVar.z(i10)));
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(textView, d02, L2, null, e6Var);
        textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f));
        textView.setText(org.telegram.messenger.bd.M0(2131749452, null));
        k5Var.setEllipsizeByGradient(true);
        addView(k5Var, b8.mf.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, b8.mf.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new vw(this, 1));
        addView(frameLayout, b8.mf.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(org.telegram.messenger.bd.M0(2131754486, null));
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, e6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        textView2.setBackground(org.telegram.ui.ActionBar.y5.d(eyVar.z(i11), eyVar.z(org.telegram.ui.ActionBar.k6.Ei), 16.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new vw(this, 2));
        frameLayout.addView(textView2, b8.mf.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(org.telegram.messenger.bd.M0(2131744865, null));
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Fi, e6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.y5.d(0, eyVar.z(i11) & 452984831, 16.0f));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        textView3.setOnClickListener(new vw(this, 3));
        frameLayout.addView(textView3, b8.mf.h(-2.0f, 26.0f, 8388661));
        vg.o0 o0Var = new vg.o0(org.telegram.messenger.g0.L(16.0f), context, e6Var, false);
        this.r = o0Var;
        o0Var.setIcon(R.raw.unlock_icon);
        o0Var.b(org.telegram.messenger.bd.M0(2131743886, null), new vw(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) o0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L3 = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L3;
            marginLayoutParams.width = L3;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) o0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = org.telegram.messenger.g0.L(5.0f);
            marginLayoutParams2.topMargin = org.telegram.messenger.g0.L(-0.5f);
            o0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f.addView(this.r, b8.mf.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        char c2;
        float f10;
        sw swVar = this.x;
        if (swVar == null) {
            return;
        }
        boolean z11 = swVar.f;
        ey eyVar = this.H;
        int i3 = (this.x.e || org.telegram.messenger.h10.i(eyVar.d1).q() || eyVar.V0) ? this.x.g ? z11 || eyVar.q1.contains(Long.valueOf(swVar.b.id)) ? 3 : 2 : 0 : 1;
        if ((i3 == 0) != (this.F == 0)) {
            requestLayout();
        }
        this.F = i3;
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G = null;
        }
        boolean z12 = i3 == 1;
        vg.o0 o0Var = this.r;
        o0Var.setEnabled(z12);
        boolean z13 = i3 == 2;
        TextView textView = this.h;
        textView.setEnabled(z13);
        boolean z14 = i3 == 3;
        TextView textView2 = this.n;
        textView2.setEnabled(z14);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        fh0 fh0Var = this.c;
        if (!z10) {
            fh0Var.setAlpha(i3 == 1 ? 1.0f : 0.0f);
            fh0Var.setTranslationX(i3 == 1 ? 0.0f : -org.telegram.messenger.g0.L(16.0f));
            k5Var.setTranslationX(i3 == 1 ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            o0Var.setAlpha(i3 == 1 ? 1.0f : 0.0f);
            o0Var.setScaleX(i3 == 1 ? 1.0f : 0.6f);
            o0Var.setScaleY(i3 == 1 ? 1.0f : 0.6f);
            o0Var.setVisibility(i3 == 1 ? 0 : 8);
            textView.setAlpha(i3 == 2 ? 1.0f : 0.0f);
            textView.setScaleX(i3 == 2 ? 1.0f : 0.6f);
            textView.setScaleY(i3 == 2 ? 1.0f : 0.6f);
            textView.setVisibility(i3 == 2 ? 0 : 8);
            textView2.setAlpha(i3 == 3 ? 1.0f : 0.0f);
            textView2.setScaleX(i3 == 3 ? 1.0f : 0.6f);
            textView2.setScaleY(i3 == 3 ? 1.0f : 0.6f);
            textView2.setVisibility(i3 == 3 ? 0 : 8);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.G = animatorSet2;
        if (i3 == 1) {
            f10 = 0.0f;
            c2 = 0;
        } else {
            c2 = 0;
            f10 = -org.telegram.messenger.g0.L(16.0f);
        }
        float[] fArr = new float[1];
        fArr[c2] = f10;
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c2] = i3 == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fh0Var, (Property<fh0, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c2] = i3 == 1 ? org.telegram.messenger.g0.L(16.0f) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c2] = i3 == 1 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(o0Var, (Property<vg.o0, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c2] = i3 == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(o0Var, (Property<vg.o0, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c2] = i3 == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(o0Var, (Property<vg.o0, Float>) property4, fArr6);
        float[] fArr7 = new float[1];
        fArr7[c2] = i3 == 2 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, fArr7);
        float[] fArr8 = new float[1];
        fArr8[c2] = i3 == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, fArr8);
        float[] fArr9 = new float[1];
        fArr9[c2] = i3 == 2 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr9);
        float[] fArr10 = new float[1];
        fArr10[c2] = i3 == 3 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, fArr10);
        float[] fArr11 = new float[1];
        fArr11[c2] = i3 == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, fArr11);
        float[] fArr12 = new float[1];
        fArr12[c2] = i3 == 3 ? 1.0f : 0.6f;
        ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, fArr12);
        Animator[] animatorArr = new Animator[12];
        animatorArr[c2] = ofFloat;
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
        this.G.addListener(new ii.m2(this, i3, 9));
        this.G.setDuration(250L);
        this.G.setInterpolator(new OvershootInterpolator(1.02f));
        this.G.start();
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet o02;
        TLRPC.TL_messages_stickerSet o03;
        ey eyVar = this.H;
        int i11 = eyVar.d1;
        if (i3 == org.telegram.messenger.hs.B0) {
            if (this.s != null && (o03 = org.telegram.messenger.li.b0(i11).o0(this.s.id)) != null && o03.set != null) {
                org.telegram.ui.ActionBar.d2 d2Var = eyVar.Z1;
                if (d2Var == null) {
                    d2Var = new ai.c7(this, 8);
                }
                pu.J0(d2Var, o03, true, null, new gp(this, 13));
                this.s = null;
            }
            if (this.w == null || (o02 = org.telegram.messenger.li.b0(i11).o0(this.w.id)) == null || o02.set == null) {
                return;
            }
            org.telegram.ui.ActionBar.d2 d2Var2 = eyVar.Z1;
            if (d2Var2 == null) {
                d2Var2 = new ai.c7(this, 8);
            }
            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
            cl clVar = new cl(16, this, o02);
            Pattern pattern = pu.N1;
            if (d2Var3.getFragmentView() != null) {
                org.telegram.messenger.li.b0(d2Var3.getCurrentAccount()).g2(d2Var3.getFragmentView().getContext(), o02, null, 0, d2Var3, null, true, true, clVar, false);
            }
            this.w = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.H.d1).n(this, org.telegram.messenger.hs.B0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.y) {
            if (this.E == null) {
                Paint paint = new Paint(1);
                this.E = paint;
                paint.setStrokeWidth(1.0f);
                this.E.setColor(this.H.z(org.telegram.ui.ActionBar.k6.d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.E);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        int L = org.telegram.messenger.g0.L(11.0f) + this.f.getWidth();
        TextView textView = this.e;
        int measuredWidth = L + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() : 0);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        k5Var.setRightPadding(measuredWidth);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(org.telegram.messenger.g0.L(4.0f) + k5Var.getTextWidth());
            float L2 = org.telegram.messenger.g0.L(4.0f) + (k5Var.getMaxTextWidth() - measuredWidth);
            if (textView.getTranslationX() > L2) {
                textView.setTranslationX(L2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(this.F == 0 ? 10.0f : 15.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.F == 0 ? 32.0f : 42.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        ey eyVar = this.H;
        try {
            int z10 = eyVar.z(org.telegram.ui.ActionBar.k6.Ci);
            int z11 = eyVar.z(org.telegram.ui.ActionBar.k6.Ei);
            if (z10 == this.a) {
                if (z11 != this.b) {
                }
                invalidate();
            }
            this.a = z10;
            this.b = z11;
            TextView textView = this.h;
            if (textView != null) {
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), z10, false);
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), z11, true);
                textView.invalidate();
            }
            TextView textView2 = this.n;
            if (textView2 != null) {
                org.telegram.ui.ActionBar.k6.H1(textView2.getBackground(), z10 & 452984831, true);
                textView2.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
