package org.telegram.ui.Components;

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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class mx extends FrameLayout implements org.telegram.ui.ActionBar.k6, org.telegram.messenger.us {
    public Paint D;
    public int E;
    public AnimatorSet F;
    public final /* synthetic */ vy G;
    public int a;
    public int b;
    public final ei0 c;
    public final org.telegram.ui.ActionBar.u5 d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public final TextView n;
    public final kg.x0 r;
    public TLRPC.TL_inputStickerSetID s;
    public TLRPC.TL_inputStickerSetID w;
    public ix x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(vy vyVar, Context context) {
        super(context);
        this.G = vyVar;
        org.telegram.ui.ActionBar.z6 z6Var = org.telegram.ui.ActionBar.a7.a;
        ei0 ei0Var = new ei0(context);
        this.c = ei0Var;
        ei0Var.f(R.raw.unlock_icon, 24, 24, null);
        int i10 = org.telegram.ui.ActionBar.t6.If;
        org.telegram.ui.ActionBar.p6 p6Var = vyVar.Z1;
        org.telegram.ui.ActionBar.a7.t(ei0Var, i10, p6Var, PorterDuff.Mode.SRC_ATOP);
        addView(ei0Var, w7.b6.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(context);
        this.d = u5Var;
        u5Var.setTextSize(15);
        org.telegram.ui.ActionBar.a7.Y(u5Var, i10, p6Var);
        u5Var.setTypeface(org.telegram.messenger.i0.o());
        u5Var.setOnClickListener(new lx(this, 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        int L = org.telegram.messenger.i0.L(8.0f);
        int i11 = org.telegram.ui.ActionBar.t6.Bf;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.r1(0.12f, vyVar.A(i11)));
        org.telegram.ui.ActionBar.w6 L2 = org.telegram.ui.ActionBar.a7.L(0.12f, i11);
        textView.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(textView, d02, L2, null, p6Var);
        textView.setPadding(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.5f), org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(1.5f));
        textView.setText(org.telegram.messenger.cd.L0(2131749453, null));
        u5Var.setEllipsizeByGradient(true);
        addView(u5Var, w7.b6.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, w7.b6.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setPadding(org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new lx(this, 1));
        addView(frameLayout, w7.b6.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setText(org.telegram.messenger.cd.L0(2131754486, null));
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.Gi, p6Var);
        int i12 = org.telegram.ui.ActionBar.t6.Ci;
        textView2.setBackground(org.telegram.ui.ActionBar.j6.d(vyVar.A(i12), vyVar.A(org.telegram.ui.ActionBar.t6.Ei), 16.0f));
        textView2.setPadding(org.telegram.messenger.i0.L(14.0f), 0, org.telegram.messenger.i0.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new lx(this, 2));
        frameLayout.addView(textView2, w7.b6.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setText(org.telegram.messenger.cd.L0(2131744873, null));
        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.Fi, p6Var);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.d(0, vyVar.A(i12) & 452984831, 16.0f));
        textView3.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(org.telegram.messenger.i0.L(4.0f));
        textView3.setOnClickListener(new lx(this, 3));
        frameLayout.addView(textView3, w7.b6.h(-2.0f, 26.0f, 8388661));
        kg.x0 x0Var = new kg.x0(org.telegram.messenger.i0.L(16.0f), context, p6Var, false);
        this.r = x0Var;
        x0Var.setIcon(R.raw.unlock_icon);
        x0Var.b(org.telegram.messenger.cd.L0(2131743901, null), new lx(this, 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) x0Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(1.0f);
            marginLayoutParams.topMargin = org.telegram.messenger.i0.L(1.0f);
            int L3 = org.telegram.messenger.i0.L(20.0f);
            marginLayoutParams.height = L3;
            marginLayoutParams.width = L3;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) x0Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = org.telegram.messenger.i0.L(5.0f);
            marginLayoutParams2.topMargin = org.telegram.messenger.i0.L(-0.5f);
            x0Var.getChildAt(0).setPadding(org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f.addView(this.r, w7.b6.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        float f7;
        float f10;
        ix ixVar = this.x;
        if (ixVar == null) {
            return;
        }
        boolean z11 = ixVar.f;
        vy vyVar = this.G;
        int i10 = (this.x.e || org.telegram.messenger.d20.i(vyVar.c1).q() || vyVar.U0) ? this.x.g ? z11 || vyVar.p1.contains(Long.valueOf(ixVar.b.id)) ? 3 : 2 : 0 : 1;
        if ((i10 == 0) != (this.E == 0)) {
            requestLayout();
        }
        this.E = i10;
        AnimatorSet animatorSet = this.F;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.F = null;
        }
        boolean z12 = i10 == 1;
        kg.x0 x0Var = this.r;
        x0Var.setEnabled(z12);
        boolean z13 = i10 == 2;
        TextView textView = this.h;
        textView.setEnabled(z13);
        boolean z14 = i10 == 3;
        TextView textView2 = this.n;
        textView2.setEnabled(z14);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        ei0 ei0Var = this.c;
        if (!z10) {
            ei0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            ei0Var.setTranslationX(i10 == 1 ? 0.0f : -org.telegram.messenger.i0.L(16.0f));
            u5Var.setTranslationX(i10 == 1 ? org.telegram.messenger.i0.L(16.0f) : 0.0f);
            x0Var.setAlpha(i10 == 1 ? 1.0f : 0.0f);
            x0Var.setScaleX(i10 == 1 ? 1.0f : 0.6f);
            x0Var.setScaleY(i10 == 1 ? 1.0f : 0.6f);
            x0Var.setVisibility(i10 == 1 ? 0 : 8);
            textView.setAlpha(i10 == 2 ? 1.0f : 0.0f);
            textView.setScaleX(i10 == 2 ? 1.0f : 0.6f);
            textView.setScaleY(i10 == 2 ? 1.0f : 0.6f);
            textView.setVisibility(i10 == 2 ? 0 : 8);
            textView2.setAlpha(i10 == 3 ? 1.0f : 0.0f);
            textView2.setScaleX(i10 == 3 ? 1.0f : 0.6f);
            textView2.setScaleY(i10 == 3 ? 1.0f : 0.6f);
            textView2.setVisibility(i10 == 3 ? 0 : 8);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.F = animatorSet2;
        if (i10 == 1) {
            f10 = 0.0f;
            f7 = 16.0f;
        } else {
            f7 = 16.0f;
            f10 = -org.telegram.messenger.i0.L(16.0f);
        }
        float[] fArr = {f10};
        Property property = FrameLayout.TRANSLATION_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property, fArr);
        float f11 = i10 == 1 ? 1.0f : 0.0f;
        Property property2 = FrameLayout.ALPHA;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ei0Var, (Property<ei0, Float>) property2, f11);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(u5Var, (Property<org.telegram.ui.ActionBar.u5, Float>) property, i10 == 1 ? org.telegram.messenger.i0.L(f7) : 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(x0Var, (Property<kg.x0, Float>) property2, i10 == 1 ? 1.0f : 0.0f);
        float[] fArr2 = {i10 == 1 ? 1.0f : 0.6f};
        Property property3 = FrameLayout.SCALE_X;
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(x0Var, (Property<kg.x0, Float>) property3, fArr2);
        float f12 = i10 == 1 ? 1.0f : 0.6f;
        Property property4 = FrameLayout.SCALE_Y;
        animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(x0Var, (Property<kg.x0, Float>) property4, f12), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, i10 == 2 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, i10 == 2 ? 1.0f : 0.6f), ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, i10 == 2 ? 1.0f : 0.6f), ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, i10 == 3 ? 1.0f : 0.0f), ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, i10 == 3 ? 1.0f : 0.6f), ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, i10 == 3 ? 1.0f : 0.6f));
        this.F.addListener(new bi.d5(this, i10, 8));
        this.F.setDuration(250L);
        this.F.setInterpolator(new OvershootInterpolator(1.02f));
        this.F.start();
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.TL_messages_stickerSet o02;
        TLRPC.TL_messages_stickerSet o03;
        vy vyVar = this.G;
        int i12 = vyVar.c1;
        if (i10 == org.telegram.messenger.zs.B0) {
            if (this.s != null && (o03 = org.telegram.messenger.ui.b0(i12).o0(this.s.id)) != null && o03.set != null) {
                org.telegram.ui.ActionBar.k2 k2Var = vyVar.Y1;
                if (k2Var == null) {
                    k2Var = new kg.q1(this, 4);
                }
                cv.J0(k2Var, o03, true, null, new ho(this, 15));
                this.s = null;
            }
            if (this.w == null || (o02 = org.telegram.messenger.ui.b0(i12).o0(this.w.id)) == null || o02.set == null) {
                return;
            }
            org.telegram.ui.ActionBar.k2 k2Var2 = vyVar.Y1;
            if (k2Var2 == null) {
                k2Var2 = new kg.q1(this, 4);
            }
            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
            at atVar = new at(5, this, o02);
            Pattern pattern = cv.M1;
            if (k2Var3.getFragmentView() != null) {
                org.telegram.messenger.ui.b0(k2Var3.getCurrentAccount()).g2(k2Var3.getFragmentView().getContext(), o02, null, 0, k2Var3, null, true, true, atVar, false);
            }
            this.w = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.G.c1).n(this, org.telegram.messenger.zs.B0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.y) {
            if (this.D == null) {
                Paint paint = new Paint(1);
                this.D = paint;
                paint.setStrokeWidth(1.0f);
                this.D.setColor(this.G.A(org.telegram.ui.ActionBar.t6.d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.D);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int L = org.telegram.messenger.i0.L(11.0f) + this.f.getWidth();
        TextView textView = this.e;
        int measuredWidth = L + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() : 0);
        org.telegram.ui.ActionBar.u5 u5Var = this.d;
        u5Var.setRightPadding(measuredWidth);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(org.telegram.messenger.i0.L(4.0f) + u5Var.getTextWidth());
            float L2 = org.telegram.messenger.i0.L(4.0f) + (u5Var.getMaxTextWidth() - measuredWidth);
            if (textView.getTranslationX() > L2) {
                textView.setTranslationX(L2);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        ((ViewGroup.MarginLayoutParams) this.d.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(this.E == 0 ? 10.0f : 15.0f);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(this.E == 0 ? 32.0f : 42.0f), TLObject.FLAG_30));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        vy vyVar = this.G;
        try {
            int A = vyVar.A(org.telegram.ui.ActionBar.t6.Ci);
            int A2 = vyVar.A(org.telegram.ui.ActionBar.t6.Ei);
            if (A == this.a) {
                if (A2 != this.b) {
                }
                invalidate();
            }
            this.a = A;
            this.b = A2;
            TextView textView = this.h;
            if (textView != null) {
                org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), A, false);
                org.telegram.ui.ActionBar.t6.H1(textView.getBackground(), A2, true);
                textView.invalidate();
            }
            TextView textView2 = this.n;
            if (textView2 != null) {
                org.telegram.ui.ActionBar.t6.H1(textView2.getBackground(), A & 452984831, true);
                textView2.invalidate();
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
