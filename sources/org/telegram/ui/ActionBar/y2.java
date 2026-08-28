package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y2 extends FrameLayout {
    public final org.telegram.ui.Components.s5 a;
    public final ImageView b;
    public final ImageView c;
    public final int d;
    public boolean e;
    public boolean f;

    public y2(Context context, int i9, b6 b6Var) {
        super(context);
        this.f = false;
        this.d = i9;
        if (i9 != 4) {
            setBackgroundDrawable(f6.J0(b6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.J5, b6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, g7.e6.e(56, 48, (LocaleController.isRTL ? 5 : 3) | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.v0(f6.h7, b6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView2, g7.e6.e(56, 48, (LocaleController.isRTL ? 3 : 5) | 16));
        org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(context);
        this.a = s5Var;
        s5Var.setLines(1);
        s5Var.setSingleLine(true);
        s5Var.setGravity(1);
        s5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i9 == 0 || i9 == 4) {
            s5Var.setTextColor(f6.v0(f6.j5, b6Var));
            s5Var.setTextSize(1, 16.0f);
            addView(s5Var, g7.e6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
            return;
        }
        if (i9 == 1) {
            s5Var.setGravity(17);
            s5Var.setTextColor(f6.v0(f6.j5, b6Var));
            s5Var.setTextSize(1, 14.0f);
            s5Var.setTypeface(AndroidUtilities.bold());
            addView(s5Var, g7.e6.c(-1.0f, -1));
            return;
        }
        if (i9 == 2) {
            s5Var.setGravity(17);
            s5Var.setTextColor(f6.v0(f6.Sh, b6Var));
            s5Var.setTextSize(1, 14.0f);
            s5Var.setTypeface(AndroidUtilities.bold());
            s5Var.setBackground(v5.e(new float[]{6.0f}, f6.v0(f6.Oh, b6Var)));
            addView(s5Var, g7.e6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        }
    }

    public final void a(CharSequence charSequence, int i9, Drawable drawable, boolean z10) {
        org.telegram.ui.Components.s5 s5Var = this.a;
        s5Var.setText(charSequence);
        ImageView imageView = this.b;
        if (i9 == 0 && drawable == null) {
            imageView.setVisibility(4);
            s5Var.setPadding(AndroidUtilities.dp(z10 ? 21.0f : 16.0f), 0, AndroidUtilities.dp(z10 ? 21.0f : 16.0f), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i9);
        }
        imageView.setVisibility(0);
        if (z10) {
            s5Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 21.0f : 72.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 21.0f), 0);
            imageView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(5.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(5.0f) : 5, 0);
        } else {
            s5Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 72.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 16.0f), 0);
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    public ImageView getImageView() {
        return this.b;
    }

    public org.telegram.ui.Components.s5 getTextView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f) {
            accessibilityNodeInfo.setSelected(true);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int i11 = this.d;
        int i12 = i11 == 2 ? 80 : 48;
        if (i11 == 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30);
        }
        super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        this.e = z10;
        this.c.setImageResource(z10 ? R.drawable.checkbig : 0);
    }

    public void setGravity(int i9) {
        this.a.setGravity(i9);
    }

    public void setIconColor(int i9) {
        this.b.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i9) {
        this.a.setTextColor(i9);
    }
}
