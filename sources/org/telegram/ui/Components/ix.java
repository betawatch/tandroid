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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ix extends FrameLayout implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs {
    public Paint E;
    public int F;
    public AnimatorSet G;
    public final /* synthetic */ qy H;
    public int a;
    public int b;
    public final qh0 c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public final TextView n;
    public final ug.r0 r;
    public TLRPC.TL_inputStickerSetID s;
    public TLRPC.TL_inputStickerSetID w;
    public ex x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix(qy qyVar, Context context) {
        super(context);
        this.H = qyVar;
        org.telegram.ui.ActionBar.t6 t6Var = org.telegram.ui.ActionBar.u6.a;
        qh0 qh0Var = new qh0(context);
        this.c = qh0Var;
        qh0Var.f(R.raw.unlock_icon, 24, 24, null);
        int i7 = org.telegram.ui.ActionBar.n6.Lf;
        org.telegram.ui.ActionBar.i6 i6Var = qyVar.a2;
        org.telegram.ui.ActionBar.u6.s(qh0Var, i7, i6Var, PorterDuff.Mode.SRC_ATOP);
        addView(qh0Var, c8.na.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var;
        n5Var.setTextSize(15);
        org.telegram.ui.ActionBar.u6.X(n5Var, i7, i6Var);
        n5Var.setTypeface(org.telegram.messenger.g0.o());
        n5Var.setOnClickListener(new hx(this, 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        int L = org.telegram.messenger.g0.L(8.0f);
        int i10 = org.telegram.ui.ActionBar.n6.Ef;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.n6.d0(L, org.telegram.ui.ActionBar.n6.r1(0.12f, qyVar.z(i10)));
        org.telegram.ui.ActionBar.q6 K = org.telegram.ui.ActionBar.u6.K(0.12f, i10);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.u6.j(textView, d02, K, null, i6Var);
        textView.setPadding(org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(1.5f));
        textView.setText(org.telegram.messenger.gd.N0(2131749251, null));
        n5Var.setEllipsizeByGradient(true);
        addView(n5Var, c8.na.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, c8.na.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new hx(this, 1));
        addView(frameLayout, c8.na.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(org.telegram.messenger.gd.N0(2131754483, null));
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.Ji, i6Var);
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        textView2.setBackground(org.telegram.ui.ActionBar.b6.d(qyVar.z(i11), qyVar.z(org.telegram.ui.ActionBar.n6.Hi), 16.0f));
        textView2.setPadding(org.telegram.messenger.g0.L(14.0f), 0, org.telegram.messenger.g0.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new hx(this, 2));
        frameLayout.addView(textView2, c8.na.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setText(org.telegram.messenger.gd.N0(2131744614, null));
        org.telegram.ui.ActionBar.u6.U(textView3, org.telegram.ui.ActionBar.n6.Ii, i6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.b6.d(0, qyVar.z(i11) & 452984831, 16.0f));
        textView3.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(org.telegram.messenger.g0.L(4.0f));
        textView3.setOnClickListener(new hx(this, 3));
        frameLayout.addView(textView3, c8.na.h(-2.0f, 26.0f, 8388661));
        ug.r0 r0Var = new ug.r0(org.telegram.messenger.g0.L(16.0f), context, i6Var, false);
        this.r = r0Var;
        r0Var.setIcon(R.raw.unlock_icon);
        r0Var.b(org.telegram.messenger.gd.N0(2131743629, null), new hx(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.g0.L(1.0f);
            int L2 = org.telegram.messenger.g0.L(20.0f);
            marginLayoutParams.height = L2;
            marginLayoutParams.width = L2;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) r0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = org.telegram.messenger.g0.L(5.0f);
            marginLayoutParams2.topMargin = org.telegram.messenger.g0.L(-0.5f);
            r0Var.getChildAt(0).setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f.addView(this.r, c8.na.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        char c10;
        float f10;
        ex exVar = this.x;
        if (exVar == null) {
            return;
        }
        boolean z11 = exVar.f;
        qy qyVar = this.H;
        int i7 = (this.x.e || org.telegram.messenger.i10.i(qyVar.d1).q() || qyVar.V0) ? this.x.g ? z11 || qyVar.q1.contains(Long.valueOf(exVar.b.id)) ? 3 : 2 : 0 : 1;
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
        ug.r0 r0Var = this.r;
        r0Var.setEnabled(z12);
        boolean z13 = i7 == 2;
        TextView textView = this.h;
        textView.setEnabled(z13);
        boolean z14 = i7 == 3;
        TextView textView2 = this.n;
        textView2.setEnabled(z14);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        qh0 qh0Var = this.c;
        if (!z10) {
            qh0Var.setAlpha(i7 == 1 ? 1.0f : 0.0f);
            qh0Var.setTranslationX(i7 == 1 ? 0.0f : -org.telegram.messenger.g0.L(16.0f));
            n5Var.setTranslationX(i7 == 1 ? org.telegram.messenger.g0.L(16.0f) : 0.0f);
            r0Var.setAlpha(i7 == 1 ? 1.0f : 0.0f);
            r0Var.setScaleX(i7 == 1 ? 1.0f : 0.6f);
            r0Var.setScaleY(i7 == 1 ? 1.0f : 0.6f);
            r0Var.setVisibility(i7 == 1 ? 0 : 8);
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
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qh0Var, (Property<qh0, Float>) property, fArr);
        float[] fArr2 = new float[1];
        fArr2[c10] = i7 == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qh0Var, (Property<qh0, Float>) property2, fArr2);
        float[] fArr3 = new float[1];
        fArr3[c10] = i7 == 1 ? org.telegram.messenger.g0.L(16.0f) : 0.0f;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(n5Var, (Property<org.telegram.ui.ActionBar.n5, Float>) property, fArr3);
        float[] fArr4 = new float[1];
        fArr4[c10] = i7 == 1 ? 1.0f : 0.0f;
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(r0Var, (Property<ug.r0, Float>) property2, fArr4);
        float[] fArr5 = new float[1];
        fArr5[c10] = i7 == 1 ? 1.0f : 0.6f;
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(r0Var, (Property<ug.r0, Float>) property3, fArr5);
        float[] fArr6 = new float[1];
        fArr6[c10] = i7 == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(r0Var, (Property<ug.r0, Float>) property4, fArr6);
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
        this.G.addListener(new ki.e2(this, i7, 9));
        this.G.setDuration(250L);
        this.G.setInterpolator(new OvershootInterpolator(1.02f));
        this.G.start();
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TLRPC.TL_messages_stickerSet q02;
        TLRPC.TL_messages_stickerSet q03;
        qy qyVar = this.H;
        int i11 = qyVar.d1;
        if (i7 == org.telegram.messenger.ks.B0) {
            if (this.s != null && (q03 = org.telegram.messenger.ri.d0(i11).q0(this.s.id)) != null && q03.set != null) {
                org.telegram.ui.ActionBar.g2 g2Var = qyVar.Z1;
                if (g2Var == null) {
                    g2Var = new bi.e9(this, 8);
                }
                bv.K0(g2Var, q03, true, null, new lo(this, 15));
                this.s = null;
            }
            if (this.w == null || (q02 = org.telegram.messenger.ri.d0(i11).q0(this.w.id)) == null || q02.set == null) {
                return;
            }
            org.telegram.ui.ActionBar.g2 g2Var2 = qyVar.Z1;
            if (g2Var2 == null) {
                g2Var2 = new bi.e9(this, 8);
            }
            org.telegram.ui.ActionBar.g2 g2Var3 = g2Var2;
            bt btVar = new bt(5, this, q02);
            Pattern pattern = bv.Q1;
            if (g2Var3.getFragmentView() != null) {
                org.telegram.messenger.ri.d0(g2Var3.getCurrentAccount()).l2(g2Var3.getFragmentView().getContext(), q02, null, 0, g2Var3, null, true, true, btVar, false);
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
        qy qyVar = this.H;
        try {
            int z10 = qyVar.z(org.telegram.ui.ActionBar.n6.Fi);
            int z11 = qyVar.z(org.telegram.ui.ActionBar.n6.Hi);
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
