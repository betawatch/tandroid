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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class e51 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public boolean b;
    public final b51 c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final c51 f;
    public boolean h;
    public final ImageView n;
    public int r;
    public final e6 s;

    public e51(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.r = -1;
        this.s = new e6(this, 0L, 320L, tr.h);
        this.a = d6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        b51 b51Var = new b51(this, context);
        this.c = b51Var;
        NotificationCenter.listenEmojiLoading(b51Var);
        b51Var.setTextSize(1, 16.0f);
        b51Var.setMaxLines(1);
        b51Var.setSingleLine();
        b51Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(b51Var, w7.z5.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.c1.d(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.b6.a(textView);
        addView(textView, w7.z5.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        c51 c51Var = new c51(context);
        this.f = c51Var;
        NotificationCenter.listenEmojiLoading(c51Var);
        c51Var.setTextSize(1, 16.0f);
        c51Var.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = w7.z5.c(-2.0f, -1);
        this.e = c10;
        addView(c51Var, c10);
        ImageView imageView = new ImageView(context);
        this.n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        w7.b6.a(imageView);
        addView(imageView, w7.z5.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
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

    @Override // org.telegram.ui.ActionBar.y5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        this.c.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        int i11 = org.telegram.ui.ActionBar.i6.L6;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(i11, d6Var))));
        int v03 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
        c51 c51Var = this.f;
        c51Var.setTextColor(v03);
        c51Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        c51Var.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.uf, d6Var));
        setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.vf, d6Var));
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i12, d6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(i12, d6Var)), 1, -1));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.b) {
            View view = this.h ? this.c : this.f;
            Paint T0 = org.telegram.ui.ActionBar.i6.T0("paintDivider", this.a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.i6.k0;
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
        c51 c51Var = this.f;
        if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI()) {
            return;
        }
        try {
            Drawable textSelectHandleLeft = c51Var.getTextSelectHandleLeft();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            textSelectHandleLeft.setColorFilter(i10, mode);
            c51Var.setTextSelectHandleLeft(textSelectHandleLeft);
            Drawable textSelectHandle = c51Var.getTextSelectHandle();
            textSelectHandle.setColorFilter(i10, mode);
            c51Var.setTextSelectHandle(textSelectHandle);
            Drawable textSelectHandleRight = c51Var.getTextSelectHandleRight();
            textSelectHandleRight.setColorFilter(i10, mode);
            c51Var.setTextSelectHandleRight(textSelectHandleRight);
        } catch (Exception unused) {
        }
    }
}
