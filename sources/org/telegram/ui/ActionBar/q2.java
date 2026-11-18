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
import org.telegram.messenger.gd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q2 extends FrameLayout {
    public final org.telegram.ui.Components.w5 a;
    public final ImageView b;
    public final ImageView c;
    public final int d;
    public boolean e;
    public boolean f;

    public q2(int i7, Context context, i6 i6Var) {
        super(context);
        this.f = false;
        this.d = i7;
        if (i7 != 4) {
            setBackgroundDrawable(n6.M0(i6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        u6.s(imageView, n6.J5, i6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, ma.e(56, 48, (gd.a0 ? 5 : 3) | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        u6.s(imageView2, n6.h7, i6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView2, ma.e(56, 48, (gd.a0 ? 3 : 5) | 16));
        org.telegram.ui.Components.w5 w5Var = new org.telegram.ui.Components.w5(context);
        this.a = w5Var;
        w5Var.setLines(1);
        w5Var.setSingleLine(true);
        w5Var.setGravity(1);
        w5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0 || i7 == 4) {
            u6.U(w5Var, n6.j5, i6Var);
            w5Var.setTextSize(1, 16.0f);
            addView(w5Var, ma.e(-2, -2, (gd.a0 ? 5 : 3) | 16));
            return;
        }
        if (i7 == 1) {
            w5Var.setGravity(17);
            u6.U(w5Var, n6.j5, i6Var);
            w5Var.setTextSize(1, 14.0f);
            w5Var.setTypeface(org.telegram.messenger.g0.o());
            addView(w5Var, ma.c(-1.0f, -1));
            return;
        }
        if (i7 == 2) {
            w5Var.setGravity(17);
            u6.U(w5Var, n6.Ji, i6Var);
            w5Var.setTextSize(1, 14.0f);
            w5Var.setTypeface(org.telegram.messenger.g0.o());
            w5Var.setBackground(b6.e(n6.w0(n6.Fi, i6Var), 6.0f));
            addView(w5Var, ma.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        }
    }

    public final void a(CharSequence charSequence, int i7, Drawable drawable, boolean z10) {
        org.telegram.ui.Components.w5 w5Var = this.a;
        w5Var.setText(charSequence);
        ImageView imageView = this.b;
        if (i7 == 0 && drawable == null) {
            imageView.setVisibility(4);
            w5Var.setPadding(org.telegram.messenger.g0.L(z10 ? 21.0f : 16.0f), 0, org.telegram.messenger.g0.L(z10 ? 21.0f : 16.0f), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i7);
        }
        imageView.setVisibility(0);
        if (z10) {
            w5Var.setPadding(org.telegram.messenger.g0.L(gd.a0 ? 21.0f : 72.0f), 0, org.telegram.messenger.g0.L(gd.a0 ? 72.0f : 21.0f), 0);
            imageView.setPadding(gd.a0 ? 0 : org.telegram.messenger.g0.L(5.0f), 0, gd.a0 ? org.telegram.messenger.g0.L(5.0f) : 5, 0);
        } else {
            w5Var.setPadding(org.telegram.messenger.g0.L(gd.a0 ? 16.0f : 72.0f), 0, org.telegram.messenger.g0.L(gd.a0 ? 72.0f : 16.0f), 0);
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    public ImageView getImageView() {
        return this.b;
    }

    public org.telegram.ui.Components.w5 getTextView() {
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
