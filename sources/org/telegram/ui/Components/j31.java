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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j31 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 a;
    public boolean b;
    public final g31 c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final h31 f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final y5 s;

    public j31(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.r = -1;
        this.s = new y5(this, 0L, 320L, gr.h);
        this.a = b6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        g31 g31Var = new g31(this, context);
        this.c = g31Var;
        NotificationCenter.listenEmojiLoading(g31Var);
        g31Var.setTextSize(1, 16.0f);
        g31Var.setMaxLines(1);
        g31Var.setSingleLine();
        g31Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(g31Var, g7.e6.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.j2.c(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        g7.g6.a(textView);
        addView(textView, g7.e6.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        h31 h31Var = new h31(context);
        this.f = h31Var;
        NotificationCenter.listenEmojiLoading(h31Var);
        h31Var.setTextSize(1, 16.0f);
        h31Var.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = g7.e6.c(-2.0f, -1);
        this.e = c10;
        addView(h31Var, c10);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        g7.g6.a(imageView);
        addView(imageView, g7.e6.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        d();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        int i10 = org.telegram.ui.ActionBar.f6.L6;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var))));
        int v03 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        h31 h31Var = this.f;
        h31Var.setTextColor(v03);
        h31Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        h31Var.setHighlightColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.uf, b6Var));
        setHandlesColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.vf, b6Var));
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var)), 1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.s.d(this.r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b) {
            View view = this.h ? this.c : this.f;
            Paint T0 = org.telegram.ui.ActionBar.f6.T0("paintDivider", this.a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.f6.k0;
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
    public final void onMeasure(int i9, int i10) {
        this.r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i10);
        if (this.n.getVisibility() == 0) {
            Layout layout = this.f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i10);
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

    public void setHandlesColor(int i9) {
        h31 h31Var = this.f;
        if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI()) {
            return;
        }
        try {
            Drawable textSelectHandleLeft = h31Var.getTextSelectHandleLeft();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            textSelectHandleLeft.setColorFilter(i9, mode);
            h31Var.setTextSelectHandleLeft(textSelectHandleLeft);
            Drawable textSelectHandle = h31Var.getTextSelectHandle();
            textSelectHandle.setColorFilter(i9, mode);
            h31Var.setTextSelectHandle(textSelectHandle);
            Drawable textSelectHandleRight = h31Var.getTextSelectHandleRight();
            textSelectHandleRight.setColorFilter(i9, mode);
            h31Var.setTextSelectHandleRight(textSelectHandleRight);
        } catch (Exception unused) {
        }
    }
}
