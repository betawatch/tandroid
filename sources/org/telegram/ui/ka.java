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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class ka extends FrameLayout {
    public float A;
    public ValueAnimator B;
    public boolean C;
    public boolean D;
    public final org.telegram.ui.Components.y5 E;
    public boolean a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final ImageView d;
    public final org.telegram.ui.Components.hp e;
    public final org.telegram.ui.Components.j6 f;
    public final Drawable[] h;
    public float n;
    public boolean r;
    public ValueAnimator s;
    public TLRPC.TL_username v;
    public boolean w;
    public long x;
    public final org.telegram.ui.Components.y5 y;

    public ka(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.a = false;
        this.y = new org.telegram.ui.Components.y5(this, 300L, org.telegram.ui.Components.er.f);
        this.E = new org.telegram.ui.Components.y5(this, 400L, org.telegram.ui.Components.er.h);
        this.b = c6Var;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d6, c6Var));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.c = h5Var;
        h5Var.setTextSize(16);
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        h5Var.setEllipsizeByGradient(true);
        addView(h5Var, h7.z5.d(-1, -2.0f, 48, 70.0f, 9.0f, 0.0f, 50.0f));
        ImageView imageView = new ImageView(getContext());
        this.d = imageView;
        org.telegram.ui.Components.hp hpVar = new org.telegram.ui.Components.hp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(1.35f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n6, c6Var));
        this.e = hpVar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageDrawable(hpVar);
        imageView.setAlpha(0.0f);
        imageView.setVisibility(0);
        hpVar.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
        addView(imageView, h7.z5.d(14, 14.0f, 48, 70.0f, 35.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, true, true);
        this.f = j6Var;
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        j6Var.b(0.4f, 120L, org.telegram.ui.Components.er.g);
        j6Var.setTextSize(AndroidUtilities.dp(13.0f));
        addView(j6Var, h7.z5.d(-1, -2.0f, 48, 70.0f, 23.0f, 0.0f, 0.0f));
        Drawable[] drawableArr = {context.getDrawable(R.drawable.msg_link_1).mutate(), context.getDrawable(R.drawable.msg_link_2).mutate()};
        this.h = drawableArr;
        Drawable drawable = drawableArr[0];
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawable.setColorFilter(new PorterDuffColorFilter(-1, mode));
        drawableArr[1].setColorFilter(new PorterDuffColorFilter(-1, mode));
        na.D.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        na.E.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.V8, c6Var));
    }

    public final void a(TLRPC.TL_username tL_username, boolean z10, boolean z11, long j10) {
        this.v = tL_username;
        this.w = z10;
        this.x = j10;
        invalidate();
        if (this.v == null) {
            this.C = false;
            this.D = false;
            return;
        }
        this.C = tL_username.active;
        int i10 = 1;
        this.D = j10 == 0 && tL_username.editable;
        b(tL_username.username);
        boolean z12 = this.a;
        org.telegram.ui.Components.j6 j6Var = this.f;
        if (z12) {
            j6Var.c(LocaleController.getString(this.D ? R.string.UsernameProfileLinkEditable : this.C ? R.string.UsernameProfileLinkActive : R.string.UsernameProfileLinkInactive), z11, !this.C);
        } else {
            j6Var.c(LocaleController.getString(this.D ? R.string.UsernameLinkEditable : this.C ? R.string.UsernameLinkActive : R.string.UsernameLinkInactive), z11, !this.C);
        }
        boolean z13 = this.C || this.D;
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        if (z11) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, z13 ? 1.0f : 0.0f);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new ja(this, i10));
            this.B.setDuration(120L);
            this.B.setInterpolator(org.telegram.ui.Components.er.g);
            this.B.start();
            return;
        }
        this.A = z13 ? 1.0f : 0.0f;
        int i11 = org.telegram.ui.ActionBar.g6.z6;
        org.telegram.ui.ActionBar.c6 c6Var = this.b;
        int d = i0.b.d(this.A, org.telegram.ui.ActionBar.g6.v0(i11, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.n6, c6Var));
        this.e.b(d);
        j6Var.setTextColor(d);
    }

    public final void b(String str) {
        if (this.D) {
            str = getUsernameEditable();
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        org.telegram.ui.ActionBar.h5 h5Var = this.c;
        if (!isEmpty) {
            h5Var.l("@" + str, false);
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
            SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.UsernameLinkPlaceholder));
            spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.H6, this.b)), 0, spannableString.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            h5Var.l(spannableStringBuilder, false);
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
        float d = this.E.d(this.C ? 1.0f : 0.0f, false);
        Drawable[] drawableArr = this.h;
        if (d < 1.0f) {
            f10 = 255.0f;
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f), na.E);
            drawableArr[1].setAlpha((int) ((1.0f - d) * 255.0f));
            f11 = 0.0f;
            drawableArr[1].setBounds(org.telegram.messenger.rl.v(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.messenger.rl.e(2, AndroidUtilities.dp(29.0f), drawableArr[1]), org.telegram.messenger.rl.A(2, AndroidUtilities.dp(35.0f), drawableArr[1]), org.telegram.messenger.rl.y(2, AndroidUtilities.dp(29.0f), drawableArr[1]));
            drawableArr[1].draw(canvas);
        } else {
            f10 = 255.0f;
            f11 = 0.0f;
        }
        if (d > f11) {
            Paint paint = na.D;
            int i10 = (int) (d * f10);
            paint.setAlpha(i10);
            canvas.drawCircle(AndroidUtilities.dp(35.0f), AndroidUtilities.dp(29.0f), AndroidUtilities.dp(16.0f) * d, paint);
            drawableArr[0].setAlpha(i10);
            drawableArr[0].setBounds(org.telegram.messenger.rl.v(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.messenger.rl.e(2, AndroidUtilities.dp(29.0f), drawableArr[0]), org.telegram.messenger.rl.A(2, AndroidUtilities.dp(35.0f), drawableArr[0]), org.telegram.messenger.rl.y(2, AndroidUtilities.dp(29.0f), drawableArr[0]));
            drawableArr[0].draw(canvas);
        }
        float d10 = this.y.d(this.w ? 1.0f : 0.0f, false);
        if (d10 > f11) {
            int alpha = org.telegram.ui.ActionBar.g6.k0.getAlpha();
            org.telegram.ui.ActionBar.g6.k0.setAlpha((int) (alpha * d10));
            canvas.drawRect(AndroidUtilities.dp(70.0f), getHeight() - 1, getWidth(), getHeight(), org.telegram.ui.ActionBar.g6.k0);
            org.telegram.ui.ActionBar.g6.k0.setAlpha(alpha);
        }
        Paint paint2 = na.F;
        paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Uh, false));
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
            ofFloat.addUpdateListener(new ja(this, i10));
            this.s.addListener(new ag.x(27, this, z10));
            this.s.setInterpolator(org.telegram.ui.Components.er.g);
            this.s.setDuration(200L);
            this.s.start();
        }
    }
}
