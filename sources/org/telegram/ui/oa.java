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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class oa extends FrameLayout {
    public float E;
    public ValueAnimator F;
    public boolean G;
    public boolean H;
    public final org.telegram.ui.Components.d6 I;
    public boolean a;
    public final org.telegram.ui.ActionBar.f6 b;
    public final org.telegram.ui.ActionBar.l5 c;
    public final ImageView d;
    public final org.telegram.ui.Components.zp e;
    public final org.telegram.ui.Components.o6 f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username v;
    public boolean w;
    public long x;
    public final org.telegram.ui.Components.d6 y;

    public oa(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = false;
        this.y = new org.telegram.ui.Components.d6(this, 300L, org.telegram.ui.Components.wr.f);
        this.I = new org.telegram.ui.Components.d6(this, 400L, org.telegram.ui.Components.wr.h);
        this.b = f6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, f6Var));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(getContext());
        this.c = l5Var;
        l5Var.setTextSize(16);
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        l5Var.setEllipsizeByGradient(true);
        addView(l5Var, w7.a6.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var));
        this.e = zpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(zpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        zpVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, w7.a6.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), false, true, true);
        this.f = o6Var;
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.z6, f6Var));
        o6Var.b(0.4f, 120L, org.telegram.ui.Components.wr.g);
        o6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(o6Var, w7.a6.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        ra.H.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Oh, f6Var));
        ra.I.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.V8, f6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j3) {
        this.v = tL_username;
        this.w = z10;
        this.x = j3;
        invalidate();
        if (this.v == null) {
            this.G = false;
            this.H = false;
            return;
        }
        this.G = tL_username.active;
        int i10 = 1;
        this.H = j3 == 0 && tL_username.editable;
        b(tL_username.username);
        boolean z12 = this.a;
        org.telegram.ui.Components.o6 o6Var = this.f;
        if (z12) {
            o6Var.c(LocaleController.getString(this.H ? R.string.UsernameProfileLinkEditable : this.G ? R.string.UsernameProfileLinkActive : R.string.UsernameProfileLinkInactive), z11, !this.G);
        } else {
            o6Var.c(LocaleController.getString(this.H ? R.string.UsernameLinkEditable : this.G ? R.string.UsernameLinkActive : R.string.UsernameLinkInactive), z11, !this.G);
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
            ofFloat.addUpdateListener(new na(this, i10));
            this.F.setDuration(120L);
            this.F.setInterpolator(org.telegram.ui.Components.wr.g);
            this.F.start();
            return;
        }
        this.E = z13 ? 1.0f : 0.0f;
        int i11 = org.telegram.ui.ActionBar.j6.z6;
        org.telegram.ui.ActionBar.f6 f6Var = this.b;
        int d = i0.a.d(this.E, org.telegram.ui.ActionBar.j6.v0(i11, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var));
        this.e.b(d);
        o6Var.setTextColor(d);
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
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, this.b)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            l5Var.l(spannableStringBuilder, false);
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
        float d = this.I.d(this.G ? 1.0f : 0.0f, false);
        Drawable[] drawableArr = this.h;
        if (d < 1.0f) {
            f7 = 255.0f;
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), ra.I);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f10 = 0.0f;
            drawableArr[1].setBounds(org.telegram.messenger.em.w(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.messenger.em.e(2, AndroidUtilities.dp(29.0f), drawableArr[1]), org.telegram.messenger.em.B(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.messenger.em.z(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f7 = 255.0f;
            f10 = 0.0f;
        }
        if (d > f10) {
            Paint paint = ra.H;
            int i10 = (int) (d * f7);
            paint.setAlpha(i10);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(org.telegram.messenger.em.w(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.messenger.em.e(2, AndroidUtilities.dp(29.0f), drawableArr[0]), org.telegram.messenger.em.B(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.messenger.em.z(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        float d10 = this.y.d(this.w ? 1.0f : 0.0f, false);
        if (d10 > f10) {
            int alpha = org.telegram.ui.ActionBar.j6.k0.getAlpha();
            org.telegram.ui.ActionBar.j6.k0.setAlpha((int) (alpha * d10));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.j6.k0);
            org.telegram.ui.ActionBar.j6.k0.setAlpha(alpha);
        }
        Paint paint2 = ra.J;
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
            ofFloat.addUpdateListener(new na(this, i10));
            this.s.addListener(new ai.e(22, this, z10));
            this.s.setInterpolator(org.telegram.ui.Components.wr.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }
}
