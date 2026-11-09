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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class ia extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.w5 D;
    public float E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public final org.telegram.ui.Components.w5 I;
    public boolean a;
    public final org.telegram.ui.ActionBar.g6 b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final ImageView d;
    public final org.telegram.ui.Components.cp e;
    public final org.telegram.ui.Components.j6 f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username w;
    public boolean x;
    public long y;

    public ia(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = false;
        this.D = new org.telegram.ui.Components.w5(this, 300L, org.telegram.ui.Components.xq.f);
        this.I = new org.telegram.ui.Components.w5(this, 400L, org.telegram.ui.Components.xq.h);
        this.b = g6Var;
        org.telegram.ui.ActionBar.s6.h(org.telegram.ui.ActionBar.l6.d6, this, g6Var);
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        this.c = l5Var;
        l5Var.setTextSize(16);
        org.telegram.ui.ActionBar.s6.X(l5Var, org.telegram.ui.ActionBar.l6.G6, g6Var);
        l5Var.setEllipsizeByGradient(true);
        addView(l5Var, c8.ha.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(1.35f), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.n6, g6Var));
        this.e = cpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(cpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        cpVar.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        addView(imageView, c8.ha.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, true, true);
        this.f = j6Var;
        j6Var.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z6, g6Var));
        j6Var.b(0.4f, 120L, org.telegram.ui.Components.xq.g);
        j6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        addView(j6Var, c8.ha.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        la.H.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var));
        la.I.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.V8, g6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z9, boolean z10, long j3) {
        this.w = tL_username;
        this.x = z9;
        this.y = j3;
        invalidate();
        if (this.w == null) {
            this.G = false;
            this.H = false;
            return;
        }
        this.G = tL_username.active;
        int i7 = 1;
        this.H = j3 == 0 && tL_username.editable;
        b(tL_username.username);
        boolean z11 = this.a;
        org.telegram.ui.Components.j6 j6Var = this.f;
        if (z11) {
            j6Var.c(org.telegram.messenger.id.M0(this.H ? 2131743646 : this.G ? 2131743647 : 2131743645, null), z10, !this.G);
        } else {
            j6Var.c(org.telegram.messenger.id.M0(this.H ? 2131743650 : this.G ? 2131743651 : 2131743649, null), z10, !this.G);
        }
        boolean z12 = this.G || this.H;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.F = null;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.E, z12 ? 1.0f : 0.0f);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new ha(this, i7));
            this.F.setDuration(120L);
            this.F.setInterpolator(org.telegram.ui.Components.xq.g);
            this.F.start();
            return;
        }
        this.E = z12 ? 1.0f : 0.0f;
        int i10 = org.telegram.ui.ActionBar.l6.z6;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        int f10 = i0.a.f(this.E, org.telegram.ui.ActionBar.l6.w0(i10, g6Var), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.n6, g6Var));
        this.e.b(f10);
        j6Var.setTextColor(f10);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.n6));
    }

    public final void b(String str) {
        if (this.H) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.l5 l5Var = this.c;
        if (!isEmpty) {
            l5Var.l("@" + str, false);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(org.telegram.messenger.id.M0(2131743648, null));
            spannableString.setSpan(new org.telegram.ui.Components.yz(org.telegram.ui.ActionBar.l6.H6, this.b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            l5Var.l(spannableStringBuilder, false);
        }
    }

    public String getUsernameEditable() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f10;
        float f11;
        super.onDraw(canvas);
        float e10 = this.I.e(false, this.G ? 1.0f : 0.0f);
        Drawable[] drawableArr = this.h;
        if (e10 < 1.0f) {
            f11 = 0.0f;
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f), la.I);
            drawableArr[1].setAlpha((int) ((1.0f - e10) * 255.0f));
            f10 = 255.0f;
            drawableArr[1].setBounds(org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.y(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]), org.telegram.ui.Cells.f1.w(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.f(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (e10 > f11) {
            Paint paint = la.H;
            int i7 = (int) (e10 * f10);
            paint.setAlpha(i7);
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f) * e10, paint);
            drawableArr[0].setAlpha(i7);
            drawableArr[0].setBounds(org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.y(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]), org.telegram.ui.Cells.f1.w(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.f(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        float e11 = this.D.e(false, this.x ? 1.0f : f11);
        if (e11 > f11) {
            int alpha = org.telegram.ui.ActionBar.l6.k0.getAlpha();
            org.telegram.ui.ActionBar.l6.k0.setAlpha((int) (alpha * e11));
            canvas.drawRect(org.telegram.messenger.g0.L(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.l6.k0);
            org.telegram.ui.ActionBar.l6.k0.setAlpha(alpha);
        }
        Paint paint2 = la.J;
        paint2.setColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.Ii, false));
        paint2.setAlpha((int) (paint2.getAlpha() * e10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getWidth() - org.telegram.messenger.g0.L(37.0f), org.telegram.messenger.g0.L(25.0f), getWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(27.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.3f), org.telegram.messenger.g0.L(0.3f), paint2);
        rectF.set(getWidth() - org.telegram.messenger.g0.L(37.0f), org.telegram.messenger.g0.L(31.0f), getWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(33.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.3f), org.telegram.messenger.g0.L(0.3f), paint2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), TLObject.FLAG_30));
    }

    public void setLoading(boolean z9) {
        if (this.r != z9) {
            this.r = z9;
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i7 = 0;
            this.d.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z9 ? 1.0f : 0.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new ha(this, i7));
            this.s.addListener(new ch.y(26, this, z9));
            this.s.setInterpolator(org.telegram.ui.Components.xq.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.Components.cp cpVar;
        org.telegram.ui.Components.j6 j6Var;
        org.telegram.ui.ActionBar.g6 g6Var = this.b;
        try {
            la.H.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, g6Var));
            la.I.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.V8, g6Var));
            ValueAnimator valueAnimator = this.F;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (cpVar = this.e) != null && (j6Var = this.f) != null) {
                int f10 = i0.a.f(this.E, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.z6, g6Var), org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.n6, g6Var));
                cpVar.b(f10);
                j6Var.setTextColor(f10);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
