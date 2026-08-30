package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f41 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public boolean b;
    public final c41 c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final d41 f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final z5 s;

    public f41(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.r = -1;
        this.s = new z5(this, 0L, 320L, nr.h);
        this.a = f6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        c41 c41Var = new c41(this, context);
        this.c = c41Var;
        NotificationCenter.listenEmojiLoading(c41Var);
        c41Var.setTextSize(1, 16.0f);
        c41Var.setMaxLines(1);
        c41Var.setSingleLine();
        c41Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(c41Var, k7.b6.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.b.e(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        k7.d6.a(textView);
        addView(textView, k7.b6.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        d41 d41Var = new d41(context);
        this.f = d41Var;
        NotificationCenter.listenEmojiLoading(d41Var);
        d41Var.setTextSize(1, 16.0f);
        d41Var.setTextIsSelectable(true);
        FrameLayout.LayoutParams c3 = k7.b6.c(-2.0f, -1);
        this.e = c3;
        addView(d41Var, c3);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        k7.d6.a(imageView);
        addView(imageView, k7.b6.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.s.d(this.r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.L6;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var))));
        int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        d41 d41Var = this.f;
        d41Var.setTextColor(v03);
        d41Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        d41Var.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.uf, f6Var));
        setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), 1, -1));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b) {
            View view = this.h ? this.c : this.f;
            Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", this.a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.j6.k0;
            }
            Paint paint = T0;
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.n.getVisibility() == 0) {
            Layout layout = this.f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.r && !this.h) {
            this.r = getMeasuredHeight();
            invalidate();
        } else {
            int measuredHeight = getMeasuredHeight();
            this.r = measuredHeight;
            this.s.d(measuredHeight, true);
        }
    }

    public void setHandlesColor(int i10) {
        d41 d41Var = this.f;
        if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI()) {
            return;
        }
        try {
            Drawable textSelectHandleLeft = d41Var.getTextSelectHandleLeft();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            textSelectHandleLeft.setColorFilter(i10, mode);
            d41Var.setTextSelectHandleLeft(textSelectHandleLeft);
            Drawable textSelectHandle = d41Var.getTextSelectHandle();
            textSelectHandle.setColorFilter(i10, mode);
            d41Var.setTextSelectHandle(textSelectHandle);
            Drawable textSelectHandleRight = d41Var.getTextSelectHandleRight();
            textSelectHandleRight.setColorFilter(i10, mode);
            d41Var.setTextSelectHandleRight(textSelectHandleRight);
        } catch (Exception unused) {
        }
    }
}
