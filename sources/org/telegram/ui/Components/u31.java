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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class u31 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 a;
    public boolean b;
    public final r31 c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final s31 f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final d6 s;

    public u31(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.r = -1;
        this.s = new d6(this, 0L, 320L, jr.h);
        this.a = c6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        r31 r31Var = new r31(this, context);
        this.c = r31Var;
        NotificationCenter.listenEmojiLoading(r31Var);
        r31Var.setTextSize(1, 16.0f);
        r31Var.setMaxLines(1);
        r31Var.setSingleLine();
        r31Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(r31Var, i7.f6.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.b.e(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        i7.h6.a(textView);
        addView(textView, i7.f6.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        s31 s31Var = new s31(context);
        this.f = s31Var;
        NotificationCenter.listenEmojiLoading(s31Var);
        s31Var.setTextSize(1, 16.0f);
        s31Var.setTextIsSelectable(true);
        FrameLayout.LayoutParams c3 = i7.f6.c(-2.0f, -1);
        this.e = c3;
        addView(s31Var, c3);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        i7.h6.a(imageView);
        addView(imageView, i7.f6.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
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

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.L6;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var))));
        int v03 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        s31 s31Var = this.f;
        s31Var.setTextColor(v03);
        s31Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        s31Var.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.uf, c6Var));
        setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.vf, c6Var));
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)), 1, -1));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b) {
            View view = this.h ? this.c : this.f;
            Paint T0 = org.telegram.ui.ActionBar.g6.T0("paintDivider", this.a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.g6.k0;
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
        s31 s31Var = this.f;
        if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI()) {
            return;
        }
        try {
            Drawable textSelectHandleLeft = s31Var.getTextSelectHandleLeft();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            textSelectHandleLeft.setColorFilter(i10, mode);
            s31Var.setTextSelectHandleLeft(textSelectHandleLeft);
            Drawable textSelectHandle = s31Var.getTextSelectHandle();
            textSelectHandle.setColorFilter(i10, mode);
            s31Var.setTextSelectHandle(textSelectHandle);
            Drawable textSelectHandleRight = s31Var.getTextSelectHandleRight();
            textSelectHandleRight.setColorFilter(i10, mode);
            s31Var.setTextSelectHandleRight(textSelectHandleRight);
        } catch (Exception unused) {
        }
    }
}
