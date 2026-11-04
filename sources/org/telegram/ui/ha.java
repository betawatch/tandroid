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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ha extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.Components.u5 E;
    public float F;
    public ValueAnimator G;
    public boolean H;
    public boolean I;
    public final org.telegram.ui.Components.u5 J;
    public boolean a;
    public final org.telegram.ui.ActionBar.e6 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final ImageView d;
    public final org.telegram.ui.Components.cp e;
    public final org.telegram.ui.Components.h6 f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username w;
    public boolean x;
    public long y;

    public ha(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = false;
        this.E = new org.telegram.ui.Components.u5(this, 300L, org.telegram.ui.Components.xq.f);
        this.J = new org.telegram.ui.Components.u5(this, 400L, org.telegram.ui.Components.xq.h);
        this.b = e6Var;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this, e6Var);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.c = k5Var;
        k5Var.setTextSize(16);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        k5Var.setEllipsizeByGradient(true);
        addView(k5Var, b8.mf.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(1.35f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, e6Var));
        this.e = cpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(cpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        cpVar.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        addView(imageView, b8.mf.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getContext(), false, true, true);
        this.f = h6Var;
        h6Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, e6Var));
        h6Var.b(0.4f, 120L, org.telegram.ui.Components.xq.g);
        h6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        addView(h6Var, b8.mf.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        ka.I.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
        ka.J.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.V8, e6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j10) {
        this.w = tL_username;
        this.x = z10;
        this.y = j10;
        invalidate();
        if (this.w == null) {
            this.H = false;
            this.I = false;
            return;
        }
        this.H = tL_username.active;
        int i3 = 1;
        this.I = j10 == 0 && tL_username.editable;
        b(tL_username.username);
        boolean z12 = this.a;
        org.telegram.ui.Components.h6 h6Var = this.f;
        if (z12) {
            h6Var.c(org.telegram.messenger.bd.M0(this.I ? 2131743656 : this.H ? 2131743657 : 2131743655, null), z11, !this.H);
        } else {
            h6Var.c(org.telegram.messenger.bd.M0(this.I ? 2131743660 : this.H ? 2131743661 : 2131743659, null), z11, !this.H);
        }
        boolean z13 = this.H || this.I;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, z13 ? 1.0f : 0.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new ga(this, i3));
            this.G.setDuration(120L);
            this.G.setInterpolator(org.telegram.ui.Components.xq.g);
            this.G.start();
            return;
        }
        this.F = z13 ? 1.0f : 0.0f;
        int i10 = org.telegram.ui.ActionBar.k6.z6;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        int f10 = i0.a.f(this.F, org.telegram.ui.ActionBar.k6.w0(i10, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, e6Var));
        this.e.b(f10);
        h6Var.setTextColor(f10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.n6));
    }

    public final void b(String str) {
        if (this.I) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (!isEmpty) {
            k5Var.l("@" + str, false);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(org.telegram.messenger.bd.M0(2131743658, null));
            spannableString.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.H6, this.b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            k5Var.l(spannableStringBuilder, false);
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
        float e10 = this.J.e(false, this.H ? 1.0f : 0.0f);
        Drawable[] drawableArr = this.h;
        if (e10 < 1.0f) {
            f11 = 0.0f;
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f), ka.J);
            drawableArr[1].setAlpha((int) ((1.0f - e10) * 255.0f));
            f10 = 255.0f;
            drawableArr[1].setBounds(org.telegram.ui.Cells.f1.C(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.B(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]), org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.f1.i(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (e10 > f11) {
            Paint paint = ka.I;
            int i3 = (int) (e10 * f10);
            paint.setAlpha(i3);
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f) * e10, paint);
            drawableArr[0].setAlpha(i3);
            drawableArr[0].setBounds(org.telegram.ui.Cells.f1.C(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.B(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]), org.telegram.ui.Cells.f1.z(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.f1.i(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        float e11 = this.E.e(false, this.x ? 1.0f : f11);
        if (e11 > f11) {
            int alpha = org.telegram.ui.ActionBar.k6.k0.getAlpha();
            org.telegram.ui.ActionBar.k6.k0.setAlpha((int) (alpha * e11));
            canvas.drawRect(org.telegram.messenger.g0.L(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.k6.k0);
            org.telegram.ui.ActionBar.k6.k0.setAlpha(alpha);
        }
        Paint paint2 = ka.K;
        paint2.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ii, false));
        paint2.setAlpha((int) (paint2.getAlpha() * e10));
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(getWidth() - org.telegram.messenger.g0.L(37.0f), org.telegram.messenger.g0.L(25.0f), getWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(27.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.3f), org.telegram.messenger.g0.L(0.3f), paint2);
        rectF.set(getWidth() - org.telegram.messenger.g0.L(37.0f), org.telegram.messenger.g0.L(31.0f), getWidth() - org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(33.0f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(0.3f), org.telegram.messenger.g0.L(0.3f), paint2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(58.0f), TLObject.FLAG_30));
    }

    public void setLoading(boolean z10) {
        if (this.r != z10) {
            this.r = z10;
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i3 = 0;
            this.d.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z10 ? 1.0f : 0.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new ga(this, i3));
            this.s.addListener(new dh.x(26, this, z10));
            this.s.setInterpolator(org.telegram.ui.Components.xq.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.Components.cp cpVar;
        org.telegram.ui.Components.h6 h6Var;
        org.telegram.ui.ActionBar.e6 e6Var = this.b;
        try {
            ka.I.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, e6Var));
            ka.J.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.V8, e6Var));
            ValueAnimator valueAnimator = this.G;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (cpVar = this.e) != null && (h6Var = this.f) != null) {
                int f10 = i0.a.f(this.F, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, e6Var), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.n6, e6Var));
                cpVar.b(f10);
                h6Var.setTextColor(f10);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
