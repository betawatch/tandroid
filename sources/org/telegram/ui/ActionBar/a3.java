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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class a3 extends FrameLayout {
    public final org.telegram.ui.Components.t5 a;
    public final ImageView b;
    public final ImageView c;
    public final int d;
    public boolean e;
    public boolean f;

    public a3(Context context, int i10, g6 g6Var) {
        super(context);
        this.f = false;
        this.d = i10;
        if (i10 != 4) {
            setBackgroundDrawable(k6.J0(g6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.J5, g6Var), PorterDuff.Mode.MULTIPLY));
        addView(imageView, k7.c6.e(56, 48, (LocaleController.isRTL ? 5 : 3) | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.h7, g6Var), PorterDuff.Mode.SRC_IN));
        addView(imageView2, k7.c6.e(56, 48, (LocaleController.isRTL ? 3 : 5) | 16));
        org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(context);
        this.a = t5Var;
        t5Var.setLines(1);
        t5Var.setSingleLine(true);
        t5Var.setGravity(1);
        t5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0 || i10 == 4) {
            t5Var.setTextColor(k6.v0(k6.j5, g6Var));
            t5Var.setTextSize(1, 16.0f);
            addView(t5Var, k7.c6.e(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
            return;
        }
        if (i10 == 1) {
            t5Var.setGravity(17);
            t5Var.setTextColor(k6.v0(k6.j5, g6Var));
            t5Var.setTextSize(1, 14.0f);
            t5Var.setTypeface(AndroidUtilities.bold());
            addView(t5Var, k7.c6.c(-1.0f, -1));
            return;
        }
        if (i10 == 2) {
            t5Var.setGravity(17);
            t5Var.setTextColor(k6.v0(k6.Sh, g6Var));
            t5Var.setTextSize(1, 14.0f);
            t5Var.setTypeface(AndroidUtilities.bold());
            t5Var.setBackground(a6.e(new float[]{6.0f}, k6.v0(k6.Oh, g6Var)));
            addView(t5Var, k7.c6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        }
    }

    public final void a(CharSequence charSequence, int i10, Drawable drawable, boolean z4) {
        org.telegram.ui.Components.t5 t5Var = this.a;
        t5Var.setText(charSequence);
        ImageView imageView = this.b;
        if (i10 == 0 && drawable == null) {
            imageView.setVisibility(4);
            t5Var.setPadding(AndroidUtilities.dp(z4 ? 21.0f : 16.0f), 0, AndroidUtilities.dp(z4 ? 21.0f : 16.0f), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i10);
        }
        imageView.setVisibility(0);
        if (z4) {
            t5Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 21.0f : 72.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 21.0f), 0);
            imageView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(5.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(5.0f) : 5, 0);
        } else {
            t5Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 72.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 16.0f), 0);
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    public ImageView getImageView() {
        return this.b;
    }

    public org.telegram.ui.Components.t5 getTextView() {
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
    public final void onMeasure(int i10, int i11) {
        int i12 = this.d;
        int i13 = i12 == 2 ? 80 : 48;
        if (i12 == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i13), TLObject.FLAG_30));
    }

    public void setChecked(boolean z4) {
        this.e = z4;
        this.c.setImageResource(z4 ? R.drawable.checkbig : 0);
    }

    public void setGravity(int i10) {
        this.a.setGravity(i10);
    }

    public void setIconColor(int i10) {
        this.b.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }
}
