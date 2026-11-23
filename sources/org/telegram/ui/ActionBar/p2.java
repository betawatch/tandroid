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
import c8.ma;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class p2 extends FrameLayout {
    public final org.telegram.ui.Components.x5 a;
    public final ImageView b;
    public final ImageView c;
    public final int d;
    public boolean e;
    public boolean f;

    public p2(int i7, Context context, h6 h6Var) {
        super(context);
        this.f = false;
        this.d = i7;
        if (i7 != 4) {
            setBackgroundDrawable(m6.M0(h6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        t6.s(imageView, m6.J5, h6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, ma.e(56, 48, (hd.a0 ? 5 : 3) | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        t6.s(imageView2, m6.h7, h6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView2, ma.e(56, 48, (hd.a0 ? 3 : 5) | 16));
        org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(context);
        this.a = x5Var;
        x5Var.setLines(1);
        x5Var.setSingleLine(true);
        x5Var.setGravity(1);
        x5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0 || i7 == 4) {
            t6.U(x5Var, m6.j5, h6Var);
            x5Var.setTextSize(1, 16.0f);
            addView(x5Var, ma.e(-2, -2, (hd.a0 ? 5 : 3) | 16));
            return;
        }
        if (i7 == 1) {
            x5Var.setGravity(17);
            t6.U(x5Var, m6.j5, h6Var);
            x5Var.setTextSize(1, 14.0f);
            x5Var.setTypeface(org.telegram.messenger.g0.o());
            addView(x5Var, ma.c(-1.0f, -1));
            return;
        }
        if (i7 == 2) {
            x5Var.setGravity(17);
            t6.U(x5Var, m6.Ji, h6Var);
            x5Var.setTextSize(1, 14.0f);
            x5Var.setTypeface(org.telegram.messenger.g0.o());
            x5Var.setBackground(a6.e(m6.w0(m6.Fi, h6Var), 6.0f));
            addView(x5Var, ma.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        }
    }

    public final void a(CharSequence charSequence, int i7, Drawable drawable, boolean z10) {
        org.telegram.ui.Components.x5 x5Var = this.a;
        x5Var.setText(charSequence);
        ImageView imageView = this.b;
        if (i7 == 0 && drawable == null) {
            imageView.setVisibility(4);
            x5Var.setPadding(org.telegram.messenger.g0.L(z10 ? 21.0f : 16.0f), 0, org.telegram.messenger.g0.L(z10 ? 21.0f : 16.0f), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i7);
        }
        imageView.setVisibility(0);
        if (z10) {
            x5Var.setPadding(org.telegram.messenger.g0.L(hd.a0 ? 21.0f : 72.0f), 0, org.telegram.messenger.g0.L(hd.a0 ? 72.0f : 21.0f), 0);
            imageView.setPadding(hd.a0 ? 0 : org.telegram.messenger.g0.L(5.0f), 0, hd.a0 ? org.telegram.messenger.g0.L(5.0f) : 5, 0);
        } else {
            x5Var.setPadding(org.telegram.messenger.g0.L(hd.a0 ? 16.0f : 72.0f), 0, org.telegram.messenger.g0.L(hd.a0 ? 72.0f : 16.0f), 0);
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    public ImageView getImageView() {
        return this.b;
    }

    public org.telegram.ui.Components.x5 getTextView() {
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
    public final void onMeasure(int i7, int i10) {
        int i11 = this.d;
        int i12 = i11 == 2 ? 80 : 48;
        if (i11 == 0) {
            i7 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30);
        }
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i12), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        this.e = z10;
        this.c.setImageResource(z10 ? R.drawable.checkbig : 0);
    }

    public void setGravity(int i7) {
        this.a.setGravity(i7);
    }

    public void setIconColor(int i7) {
        this.b.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i7) {
        this.a.setTextColor(i7);
    }
}
