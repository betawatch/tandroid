package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class la extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.Components.t5 D;
    public float E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public final org.telegram.ui.Components.t5 I;
    public boolean a;
    public final org.telegram.ui.ActionBar.p6 b;
    public final org.telegram.ui.ActionBar.u5 c;
    public final ImageView d;
    public final org.telegram.ui.Components.kp e;
    public final org.telegram.ui.Components.f6 f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username w;
    public boolean x;
    public long y;

    public la(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = false;
        this.D = new org.telegram.ui.Components.t5(this, 300L, org.telegram.ui.Components.gr.f);
        this.I = new org.telegram.ui.Components.t5(this, 400L, org.telegram.ui.Components.gr.h);
        this.b = p6Var;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.d6, this, p6Var);
        org.telegram.ui.ActionBar.u5 u5Var = new org.telegram.ui.ActionBar.u5(getContext());
        this.c = u5Var;
        u5Var.setTextSize(16);
        org.telegram.ui.ActionBar.a7.Y(u5Var, org.telegram.ui.ActionBar.t6.G6, p6Var);
        u5Var.setEllipsizeByGradient(true);
        addView(u5Var, w7.b6.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(1.35f), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var));
        this.e = kpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(kpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        kpVar.setBounds(0, 0, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f));
        addView(imageView, w7.b6.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(getContext(), false, true, true);
        this.f = f6Var;
        f6Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var));
        f6Var.b(0.4f, 120L, org.telegram.ui.Components.gr.g);
        f6Var.setTextSize(org.telegram.messenger.i0.L(13.0f));
        addView(f6Var, w7.b6.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        oa.H.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
        oa.I.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.V8, p6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j10) {
        this.w = tL_username;
        this.x = z10;
        this.y = j10;
        invalidate();
        if (this.w == null) {
            this.G = false;
            this.H = false;
            return;
        }
        this.G = tL_username.active;
        int i10 = 1;
        this.H = j10 == 0 && tL_username.editable;
        b(tL_username.username);
        boolean z12 = this.a;
        org.telegram.ui.Components.f6 f6Var = this.f;
        if (z12) {
            f6Var.c(org.telegram.messenger.cd.L0(this.H ? 2131743672 : this.G ? 2131743673 : 2131743671, null), z11, !this.G);
        } else {
            f6Var.c(org.telegram.messenger.cd.L0(this.H ? 2131743676 : this.G ? 2131743677 : 2131743675, null), z11, !this.G);
        }
        boolean z13 = this.G || this.H;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z13 ? 1.0f : 0.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new ka(this, i10));
            this.F.setDuration(120L);
            this.F.setInterpolator(org.telegram.ui.Components.gr.g);
            this.F.start();
            return;
        }
        this.E = z13 ? 1.0f : 0.0f;
        int i11 = org.telegram.ui.ActionBar.t6.z6;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        int f7 = i0.b.f(this.E, org.telegram.ui.ActionBar.t6.w0(i11, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var));
        this.e.b(f7);
        f6Var.setTextColor(f7);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.n6));
    }

    public final void b(String str) {
        if (this.H) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.u5 u5Var = this.c;
        if (!isEmpty) {
            u5Var.l("@" + str, false);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(org.telegram.messenger.cd.L0(2131743674, null));
            spannableString.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.H6, this.b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            u5Var.l(spannableStringBuilder, false);
        }
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        float f10;
        super.onDraw(canvas);
        float e = this.I.e(false, this.G ? 1.0f : 0.0f);
        Drawable[] drawableArr = this.h;
        if (e < 1.0f) {
            f10 = 0.0f;
            canvas.drawCircle(org.telegram.messenger.i0.L(35.0f), org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(16.0f), oa.I);
            drawableArr[1].setAlpha((int) ((1.0f - e) * 255.0f));
            f7 = 255.0f;
            drawableArr[1].setBounds(org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.i0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.y(2, org.telegram.messenger.i0.L(29.0f), drawableArr[1]), org.telegram.ui.Cells.f1.w(2, org.telegram.messenger.i0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.f(2, org.telegram.messenger.i0.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f7 = 255.0f;
            f10 = 0.0f;
        }
        if (e > f10) {
            Paint paint = oa.H;
            int i10 = (int) (e * f7);
            paint.setAlpha(i10);
            canvas.drawCircle(org.telegram.messenger.i0.L(35.0f), org.telegram.messenger.i0.L(29.0f), org.telegram.messenger.i0.L(16.0f) * e, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.i0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.y(2, org.telegram.messenger.i0.L(29.0f), drawableArr[0]), org.telegram.ui.Cells.f1.w(2, org.telegram.messenger.i0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.f(2, org.telegram.messenger.i0.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        float e7 = this.D.e(false, this.x ? 1.0f : f10);
        if (e7 > f10) {
            int alpha = org.telegram.ui.ActionBar.t6.k0.getAlpha();
            org.telegram.ui.ActionBar.t6.k0.setAlpha((int) (alpha * e7));
            canvas.drawRect(org.telegram.messenger.i0.L(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.t6.k0);
            org.telegram.ui.ActionBar.t6.k0.setAlpha(alpha);
        }
        Paint paint2 = oa.J;
        paint2.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ii, false));
        paint2.setAlpha((int) (paint2.getAlpha() * e));
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(getWidth() - org.telegram.messenger.i0.L(37.0f), org.telegram.messenger.i0.L(25.0f), getWidth() - org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(27.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(0.3f), org.telegram.messenger.i0.L(0.3f), paint2);
        rectF.set(getWidth() - org.telegram.messenger.i0.L(37.0f), org.telegram.messenger.i0.L(31.0f), getWidth() - org.telegram.messenger.i0.L(21.0f), org.telegram.messenger.i0.L(33.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(0.3f), org.telegram.messenger.i0.L(0.3f), paint2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(58.0f), TLObject.FLAG_30));
    }

    public void setLoading(boolean z10) {
        if (this.r != z10) {
            this.r = z10;
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = 0;
            this.d.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z10 ? 1.0f : 0.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new ka(this, i10));
            this.s.addListener(new eg.m(12, this, z10));
            this.s.setInterpolator(org.telegram.ui.Components.gr.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.Components.kp kpVar;
        org.telegram.ui.Components.f6 f6Var;
        org.telegram.ui.ActionBar.p6 p6Var = this.b;
        try {
            oa.H.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, p6Var));
            oa.I.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.V8, p6Var));
            ValueAnimator valueAnimator = this.F;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (kpVar = this.e) != null && (f6Var = this.f) != null) {
                int f7 = i0.b.f(this.E, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var), org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.n6, p6Var));
                kpVar.b(f7);
                f6Var.setTextColor(f7);
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
