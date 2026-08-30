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
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public abstract class ma extends FrameLayout {
    public float B;
    public ValueAnimator C;
    public boolean D;
    public boolean E;
    public final org.telegram.ui.Components.z5 F;
    public boolean a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final ImageView d;
    public final org.telegram.ui.Components.rp e;
    public final org.telegram.ui.Components.k6 f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username v;
    public boolean w;
    public long x;
    public final org.telegram.ui.Components.z5 y;

    public ma(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = false;
        this.y = new org.telegram.ui.Components.z5(this, 300L, org.telegram.ui.Components.nr.f);
        this.F = new org.telegram.ui.Components.z5(this, 400L, org.telegram.ui.Components.nr.h);
        this.b = f6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(getContext());
        this.c = k5Var;
        k5Var.setTextSize(16);
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        k5Var.setEllipsizeByGradient(true);
        addView(k5Var, k7.b6.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.rp rpVar = new org.telegram.ui.Components.rp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var));
        this.e = rpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(rpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        rpVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, k7.b6.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(getContext(), false, true, true);
        this.f = k6Var;
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        k6Var.b(0.4f, 120L, org.telegram.ui.Components.nr.g);
        k6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(k6Var, k7.b6.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        pa.E.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        pa.F.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.V8, f6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z4, boolean z10, long j10) {
        this.v = tL_username;
        this.w = z4;
        this.x = j10;
        invalidate();
        if (this.v == null) {
            this.D = false;
            this.E = false;
            return;
        }
        this.D = tL_username.active;
        int i10 = 1;
        this.E = j10 == 0 && tL_username.editable;
        b(tL_username.username);
        boolean z11 = this.a;
        org.telegram.ui.Components.k6 k6Var = this.f;
        if (z11) {
            k6Var.c(LocaleController.getString(this.E ? R.string.UsernameProfileLinkEditable : this.D ? R.string.UsernameProfileLinkActive : R.string.UsernameProfileLinkInactive), z10, !this.D);
        } else {
            k6Var.c(LocaleController.getString(this.E ? R.string.UsernameLinkEditable : this.D ? R.string.UsernameLinkActive : R.string.UsernameLinkInactive), z10, !this.D);
        }
        boolean z12 = this.D || this.E;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.C = null;
        }
        if (z10) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.B, z12 ? 1.0f : 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new la(this, i10));
            this.C.setDuration(120L);
            this.C.setInterpolator(org.telegram.ui.Components.nr.g);
            this.C.start();
            return;
        }
        this.B = z12 ? 1.0f : 0.0f;
        int i11 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        int d = i0.a.d(this.B, org.telegram.ui.ActionBar.j6.v0(i11, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var));
        this.e.b(d);
        k6Var.setTextColor(d);
    }

    public final void b(String str) {
        if (this.E) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.k5 k5Var = this.c;
        if (!isEmpty) {
            k5Var.l("@" + str, false);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, this.b)), 0, spannableString.length(), 33);
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
        float d = this.F.d(this.D ? 1.0f : 0.0f, false);
        Drawable[] drawableArr = this.h;
        if (d < 1.0f) {
            f10 = 255.0f;
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), pa.F);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f11 = 0.0f;
            drawableArr[1].setBounds(b.u(2, AndroidUtilities.dp(35.0f), drawableArr[1]), b.f(2, AndroidUtilities.dp(29.0f), drawableArr[1]), b.A(2, AndroidUtilities.dp(35.0f), drawableArr[1]), b.y(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (d > f11) {
            Paint paint = pa.E;
            int i10 = (int) (d * f10);
            paint.setAlpha(i10);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(b.u(2, AndroidUtilities.dp(35.0f), drawableArr[0]), b.f(2, AndroidUtilities.dp(29.0f), drawableArr[0]), b.A(2, AndroidUtilities.dp(35.0f), drawableArr[0]), b.y(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        float d10 = this.y.d(this.w ? 1.0f : 0.0f, false);
        if (d10 > f11) {
            int alpha = org.telegram.ui.ActionBar.j6.k0.getAlpha();
            org.telegram.ui.ActionBar.j6.k0.setAlpha((int) (alpha * d10));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.j6.k0);
            org.telegram.ui.ActionBar.j6.k0.setAlpha(alpha);
        }
        Paint paint2 = pa.G;
        paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Uh, false));
        paint2.setAlpha((int) (paint2.getAlpha() * d));
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getWidth() - AndroidUtilities.dp(37.0f), AndroidUtilities.dp(25.0f), getWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(27.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.3f), AndroidUtilities.dp(0.3f), paint2);
        rectF.set(getWidth() - AndroidUtilities.dp(37.0f), AndroidUtilities.dp(31.0f), getWidth() - AndroidUtilities.dp(21.0f), AndroidUtilities.dp(33.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(0.3f), AndroidUtilities.dp(0.3f), paint2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(58.0f), TLObject.FLAG_30));
    }

    public void setLoading(boolean z4) {
        if (this.r != z4) {
            this.r = z4;
            ValueAnimator valueAnimator = this.s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int i10 = 0;
            this.d.setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.n, z4 ? 1.0f : 0.0f);
            this.s = ofFloat;
            ofFloat.addUpdateListener(new la(this, i10));
            this.s.addListener(new dg.w2(18, this, z4));
            this.s.setInterpolator(org.telegram.ui.Components.nr.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }
}
