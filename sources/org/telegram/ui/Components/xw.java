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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class xw extends FrameLayout implements org.telegram.ui.ActionBar.a6, org.telegram.messenger.ls {
    public Paint D;
    public int E;
    public AnimatorSet F;
    public final /* synthetic */ gy G;
    public int a;
    public int b;
    public final ch0 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public final TextView n;
    public final ug.p0 r;
    public TLRPC.TL_inputStickerSetID s;
    public TLRPC.TL_inputStickerSetID w;
    public tw x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(gy gyVar, Context context) {
        super(context);
        this.G = gyVar;
        org.telegram.ui.ActionBar.q6 q6Var = org.telegram.ui.ActionBar.r6.a;
        ch0 ch0Var = new ch0(context);
        this.c = ch0Var;
        ch0Var.f(R.raw.unlock_icon, 24, 24, null);
        int i7 = org.telegram.ui.ActionBar.k6.If;
        org.telegram.ui.ActionBar.f6 f6Var = gyVar.Z1;
        org.telegram.ui.ActionBar.r6.t(ch0Var, i7, f6Var, PorterDuff.Mode.SRC_ATOP);
        addView(ch0Var, c8.ha.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var;
        k5Var.setTextSize(15);
        org.telegram.ui.ActionBar.r6.Y(k5Var, i7, f6Var);
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setOnClickListener(new ww(this, 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.k6.Bf;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.r1(0.12f, gyVar.z(i10)));
        org.telegram.ui.ActionBar.n6 L2 = org.telegram.ui.ActionBar.r6.L(0.12f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(textView, d02, L2, null, f6Var);
        textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f));
        textView.setText(org.telegram.messenger.hd.M0(2131749443, null));
        k5Var.setEllipsizeByGradient(true);
        addView(k5Var, c8.ha.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, c8.ha.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new ww(this, 1));
        addView(frameLayout, c8.ha.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(org.telegram.messenger.hd.M0(2131754486, null));
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.Gi, f6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Ci;
        textView2.setBackground(org.telegram.ui.ActionBar.z5.d(gyVar.z(i11), gyVar.z(org.telegram.ui.ActionBar.k6.Ei), 16.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new ww(this, 2));
        frameLayout.addView(textView2, c8.ha.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(org.telegram.messenger.hd.M0(2131744856, null));
        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.Fi, f6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.z5.d(0, gyVar.z(i11) & 452984831, 16.0f));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        textView3.setOnClickListener(new ww(this, 3));
        frameLayout.addView(textView3, c8.ha.h(-2.0f, 26.0f, 8388661));
        ug.p0 p0Var = new ug.p0(org.telegram.messenger.g0.L(16.0f), context, f6Var, false);
        this.r = p0Var;
        p0Var.setIcon(R.raw.unlock_icon);
        p0Var.b(org.telegram.messenger.hd.M0(2131743877, null), new ww(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) p0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L3 = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L3;
            marginLayoutParams.width = L3;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) p0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = org.telegram.messenger.g0.L(5.0f);
            marginLayoutParams2.topMargin = org.telegram.messenger.g0.L(-0.5f);
            p0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f.addView(this.r, c8.ha.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z9) {
        char c10;
        float f10;
        tw twVar = this.x;
        if (twVar == null) {
            return;
        }
        boolean z10 = twVar.f;
        gy gyVar = this.G;
        int i7 = (this.x.e || org.telegram.messenger.p10.i(gyVar.c1).q() || gyVar.U0) ? this.x.g ? z10 || gyVar.p1.contains(Long.valueOf(twVar.b.id)) ? 3 : 2 : 0 : 1;
        if ((i7 == 0) != (this.E == 0)) {
            requestLayout();
        }
        this.E = i7;
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F = null;
        }
        boolean z11 = i7 == 1;
        ug.p0 p0Var = this.r;
        p0Var.setEnabled(z11);
        boolean z12 = i7 == 2;
        TextView textView = this.h;
        textView.setEnabled(z12);
        boolean z13 = i7 == 3;
        TextView textView2 = this.n;
        textView2.setEnabled(z13);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        ch0 ch0Var = this.c;
        if (!z9) {
            ch0Var.setAlpha(i7 == 1 ? 1.0f : 0.0f);
            ch0Var.setTranslationX(i7 == 1 ? 0.0f : -org.telegram.messenger.g0.L(16.0f));
            k5Var.setTranslationX(i7 == 1 ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            p0Var.setAlpha(i7 == 1 ? 1.0f : 0.0f);
            p0Var.setScaleX(i7 == 1 ? 1.0f : 0.6f);
            p0Var.setScaleY(i7 == 1 ? 1.0f : 0.6f);
            p0Var.setVisibility(i7 == 1 ? 0 : 8);
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
        this.F = animatorSet2;
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
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ch0Var, (Property<ch0, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c10] = i7 == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ch0Var, (Property<ch0, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c10] = i7 == 1 ? org.telegram.messenger.g0.L(16.0f) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(k5Var, (Property<org.telegram.ui.ActionBar.k5, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c10] = i7 == 1 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(p0Var, (Property<ug.p0, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c10] = i7 == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(p0Var, (Property<ug.p0, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c10] = i7 == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(p0Var, (Property<ug.p0, Float>) property4, fArr6);
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
        this.F.addListener(new hi.m2(this, i7, 9));
        this.F.setDuration(250L);
        this.F.setInterpolator(new OvershootInterpolator(1.02f));
        this.F.start();
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet o02;
        TLRPC.TL_messages_stickerSet o03;
        gy gyVar = this.G;
        int i11 = gyVar.c1;
        if (i7 == org.telegram.messenger.qs.B0) {
            if (this.s != null && (o03 = org.telegram.messenger.ui.b0(i11).o0(this.s.id)) != null && o03.set != null) {
                org.telegram.ui.ActionBar.f2 f2Var = gyVar.Y1;
                if (f2Var == null) {
                    f2Var = new bi.w4(this, 7);
                }
                qu.J0(f2Var, o03, true, null, new gp(this, 13));
                this.s = null;
            }
            if (this.w == null || (o02 = org.telegram.messenger.ui.b0(i11).o0(this.w.id)) == null || o02.set == null) {
                return;
            }
            org.telegram.ui.ActionBar.f2 f2Var2 = gyVar.Y1;
            if (f2Var2 == null) {
                f2Var2 = new bi.w4(this, 7);
            }
            org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
            fq fqVar = new fq(11, this, o02);
            Pattern pattern = qu.M1;
            if (f2Var3.getFragmentView() != null) {
                org.telegram.messenger.ui.b0(f2Var3.getCurrentAccount()).g2(f2Var3.getFragmentView().getContext(), o02, null, 0, f2Var3, null, true, true, fqVar, false);
            }
            this.w = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.G.c1).n(this, org.telegram.messenger.qs.B0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.y) {
            if (this.D == null) {
                Paint paint = new Paint(1);
                this.D = paint;
                paint.setStrokeWidth(1.0f);
                this.D.setColor(this.G.z(org.telegram.ui.ActionBar.k6.d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.D);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
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
    public final void onMeasure(int i7, int i10) {
        ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(this.E == 0 ? 10.0f : 15.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(this.E == 0 ? 32.0f : 42.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        gy gyVar = this.G;
        try {
            int z9 = gyVar.z(org.telegram.ui.ActionBar.k6.Ci);
            int z10 = gyVar.z(org.telegram.ui.ActionBar.k6.Ei);
            if (z9 == this.a) {
                if (z10 != this.b) {
                }
                invalidate();
            }
            this.a = z9;
            this.b = z10;
            TextView textView = this.h;
            if (textView != null) {
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), z9, false);
                org.telegram.ui.ActionBar.k6.H1(textView.getBackground(), z10, true);
                textView.invalidate();
            }
            TextView textView2 = this.n;
            if (textView2 != null) {
                org.telegram.ui.ActionBar.k6.H1(textView2.getBackground(), z9 & 452984831, true);
                textView2.invalidate();
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
