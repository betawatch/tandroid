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
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c3 extends FrameLayout {
    public final org.telegram.ui.Components.b6 a;
    public final ImageView b;
    public final ImageView c;
    public final int d;
    public boolean e;
    public boolean f;

    public c3(Context context, int i10, u6 u6Var) {
        super(context);
        this.f = false;
        this.d = i10;
        if (i10 != 4) {
            setBackgroundDrawable(y6.L0(u6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        f7.t(imageView, y6.J5, u6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, kb1.i(56, 48, (LocaleController.isRTL ? 5 : 3) | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        f7.t(imageView2, y6.h7, u6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView2, kb1.i(56, 48, (LocaleController.isRTL ? 3 : 5) | 16));
        org.telegram.ui.Components.b6 b6Var = new org.telegram.ui.Components.b6(context);
        this.a = b6Var;
        b6Var.setLines(1);
        b6Var.setSingleLine(true);
        b6Var.setGravity(1);
        b6Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0 || i10 == 4) {
            f7.V(b6Var, y6.j5, u6Var);
            b6Var.setTextSize(1, 16.0f);
            addView(b6Var, kb1.i(-2, -2, (LocaleController.isRTL ? 5 : 3) | 16));
            return;
        }
        if (i10 == 1) {
            b6Var.setGravity(17);
            f7.V(b6Var, y6.j5, u6Var);
            b6Var.setTextSize(1, 14.0f);
            b6Var.setTypeface(AndroidUtilities.bold());
            addView(b6Var, kb1.g(-1.0f, -1));
            return;
        }
        if (i10 == 2) {
            b6Var.setGravity(17);
            f7.V(b6Var, y6.Sh, u6Var);
            b6Var.setTextSize(1, 14.0f);
            b6Var.setTypeface(AndroidUtilities.bold());
            b6Var.setBackground(o6.e(new float[]{6.0f}, y6.w0(y6.Oh, u6Var)));
            addView(b6Var, kb1.h(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        }
    }

    public final void a(CharSequence charSequence, int i10, Drawable drawable, boolean z10) {
        org.telegram.ui.Components.b6 b6Var = this.a;
        b6Var.setText(charSequence);
        ImageView imageView = this.b;
        if (i10 == 0 && drawable == null) {
            imageView.setVisibility(4);
            b6Var.setPadding(AndroidUtilities.dp(z10 ? 21.0f : 16.0f), 0, AndroidUtilities.dp(z10 ? 21.0f : 16.0f), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i10);
        }
        imageView.setVisibility(0);
        if (z10) {
            b6Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 21.0f : 72.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 21.0f), 0);
            imageView.setPadding(LocaleController.isRTL ? 0 : AndroidUtilities.dp(5.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(5.0f) : 5, 0);
        } else {
            b6Var.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 72.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 72.0f : 16.0f), 0);
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    public ImageView getImageView() {
        return this.b;
    }

    public org.telegram.ui.Components.b6 getTextView() {
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

    public void setChecked(boolean z10) {
        this.e = z10;
        this.c.setImageResource(z10 ? R.drawable.checkbig : 0);
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
