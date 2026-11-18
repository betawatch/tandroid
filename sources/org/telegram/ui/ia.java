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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class ia extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.Components.c6 E;
    public float F;
    public ValueAnimator G;
    public boolean H;
    public boolean I;
    public final org.telegram.ui.Components.c6 J;
    public boolean a;
    public final org.telegram.ui.ActionBar.i6 b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final ImageView d;
    public final org.telegram.ui.Components.sp e;
    public final org.telegram.ui.Components.n6 f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username w;
    public boolean x;
    public long y;

    public ia(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.a = false;
        this.E = new org.telegram.ui.Components.c6(this, 300L, org.telegram.ui.Components.lr.f);
        this.J = new org.telegram.ui.Components.c6(this, 400L, org.telegram.ui.Components.lr.h);
        this.b = i6Var;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.d6, this, i6Var);
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(getContext());
        this.c = n5Var;
        n5Var.setTextSize(16);
        org.telegram.ui.ActionBar.u6.X(n5Var, org.telegram.ui.ActionBar.n6.G6, i6Var);
        n5Var.setEllipsizeByGradient(true);
        addView(n5Var, c8.ma.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.sp spVar = new org.telegram.ui.Components.sp(org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(1.35f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.n6, i6Var));
        this.e = spVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(spVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        spVar.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
        addView(imageView, c8.ma.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(getContext(), false, true, true);
        this.f = n6Var;
        n6Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.z6, i6Var));
        n6Var.b(0.4f, 120L, org.telegram.ui.Components.lr.g);
        n6Var.setTextSize(org.telegram.messenger.g0.L(13.0f));
        addView(n6Var, c8.ma.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        la.I.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
        la.J.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.V8, i6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j3) {
        this.w = tL_username;
        this.x = z10;
        this.y = j3;
        invalidate();
        if (this.w == null) {
            this.H = false;
            this.I = false;
            return;
        }
        this.H = tL_username.active;
        int i7 = 1;
        this.I = j3 == 0 && tL_username.editable;
        b(tL_username.username);
        boolean z12 = this.a;
        org.telegram.ui.Components.n6 n6Var = this.f;
        if (z12) {
            n6Var.c(org.telegram.messenger.gd.M0(this.I ? 2131743409 : this.H ? 2131743410 : 2131743408, null), z11, !this.H);
        } else {
            n6Var.c(org.telegram.messenger.gd.M0(this.I ? 2131743413 : this.H ? 2131743414 : 2131743412, null), z11, !this.H);
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
            ofFloat.addUpdateListener(new ha(this, i7));
            this.G.setDuration(120L);
            this.G.setInterpolator(org.telegram.ui.Components.lr.g);
            this.G.start();
            return;
        }
        this.F = z13 ? 1.0f : 0.0f;
        int i10 = org.telegram.ui.ActionBar.n6.z6;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        int f10 = i0.a.f(this.F, org.telegram.ui.ActionBar.n6.w0(i10, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.n6, i6Var));
        this.e.b(f10);
        n6Var.setTextColor(f10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.V8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.n6));
    }

    public final void b(String str) {
        if (this.I) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.n5 n5Var = this.c;
        if (!isEmpty) {
            n5Var.l("@" + str, false);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(org.telegram.messenger.gd.M0(2131743411, null));
            spannableString.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.H6, this.b), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            n5Var.l(spannableStringBuilder, false);
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
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f), la.J);
            drawableArr[1].setAlpha((int) ((1.0f - e10) * 255.0f));
            f10 = 255.0f;
            drawableArr[1].setBounds(org.telegram.ui.Cells.c0.C(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.c0.A(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]), org.telegram.ui.Cells.c0.y(2, org.telegram.messenger.g0.L(35.0f), drawableArr[1]), org.telegram.ui.Cells.c0.j(2, org.telegram.messenger.g0.L(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (e10 > f11) {
            Paint paint = la.I;
            int i7 = (int) (e10 * f10);
            paint.setAlpha(i7);
            canvas.drawCircle(org.telegram.messenger.g0.L(35.0f), org.telegram.messenger.g0.L(29.0f), org.telegram.messenger.g0.L(16.0f) * e10, paint);
            drawableArr[0].setAlpha(i7);
            drawableArr[0].setBounds(org.telegram.ui.Cells.c0.C(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.c0.A(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]), org.telegram.ui.Cells.c0.y(2, org.telegram.messenger.g0.L(35.0f), drawableArr[0]), org.telegram.ui.Cells.c0.j(2, org.telegram.messenger.g0.L(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        float e11 = this.E.e(false, this.x ? 1.0f : f11);
        if (e11 > f11) {
            int alpha = org.telegram.ui.ActionBar.n6.k0.getAlpha();
            org.telegram.ui.ActionBar.n6.k0.setAlpha((int) (alpha * e11));
            canvas.drawRect(org.telegram.messenger.g0.L(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.n6.k0);
            org.telegram.ui.ActionBar.n6.k0.setAlpha(alpha);
        }
        Paint paint2 = la.K;
        paint2.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Li, false));
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

    public void setLoading(boolean z10) {
        if (this.r != z10) {
            this.r = z10;
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i7 = 0;
            this.d.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z10 ? 1.0f : 0.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new ha(this, i7));
            this.s.addListener(new bi.e7(27, this, z10));
            this.s.setInterpolator(org.telegram.ui.Components.lr.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        org.telegram.ui.Components.sp spVar;
        org.telegram.ui.Components.n6 n6Var;
        org.telegram.ui.ActionBar.i6 i6Var = this.b;
        try {
            la.I.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
            la.J.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.V8, i6Var));
            ValueAnimator valueAnimator = this.G;
            if ((valueAnimator == null || !valueAnimator.isRunning()) && (spVar = this.e) != null && (n6Var = this.f) != null) {
                int f10 = i0.a.f(this.F, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.z6, i6Var), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.n6, i6Var));
                spVar.b(f10);
                n6Var.setTextColor(f10);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
