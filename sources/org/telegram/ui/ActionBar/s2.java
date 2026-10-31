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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s2 extends FrameLayout {
    public final org.telegram.ui.Components.n5 a;
    public final ImageView b;
    public final ImageView c;
    public final int d;
    public boolean e;
    public boolean f;

    public s2(int i10, Context context, p6 p6Var) {
        super(context);
        this.f = false;
        this.d = i10;
        if (i10 != 4) {
            setBackgroundDrawable(t6.M0(p6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        a7.t(imageView, t6.J5, p6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, w7.b6.e(56, 48, (cd.X ? 5 : 3) | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        a7.t(imageView2, t6.h7, p6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView2, w7.b6.e(56, 48, (cd.X ? 3 : 5) | 16));
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(context);
        this.a = n5Var;
        n5Var.setLines(1);
        n5Var.setSingleLine(true);
        n5Var.setGravity(1);
        n5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i10 == 0 || i10 == 4) {
            a7.V(n5Var, t6.j5, p6Var);
            n5Var.setTextSize(1, 16.0f);
            addView(n5Var, w7.b6.e(-2, -2, (cd.X ? 5 : 3) | 16));
            return;
        }
        if (i10 == 1) {
            n5Var.setGravity(17);
            a7.V(n5Var, t6.j5, p6Var);
            n5Var.setTextSize(1, 14.0f);
            n5Var.setTypeface(org.telegram.messenger.i0.o());
            addView(n5Var, w7.b6.c(-1.0f, -1));
            return;
        }
        if (i10 == 2) {
            n5Var.setGravity(17);
            a7.V(n5Var, t6.Gi, p6Var);
            n5Var.setTextSize(1, 14.0f);
            n5Var.setTypeface(org.telegram.messenger.i0.o());
            n5Var.setBackground(j6.e(t6.w0(t6.Ci, p6Var), 6.0f));
            addView(n5Var, w7.b6.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        }
    }

    public final void a(CharSequence charSequence, int i10, Drawable drawable, boolean z10) {
        org.telegram.ui.Components.n5 n5Var = this.a;
        n5Var.setText(charSequence);
        ImageView imageView = this.b;
        if (i10 == 0 && drawable == null) {
            imageView.setVisibility(4);
            n5Var.setPadding(org.telegram.messenger.i0.L(z10 ? 21.0f : 16.0f), 0, org.telegram.messenger.i0.L(z10 ? 21.0f : 16.0f), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i10);
        }
        imageView.setVisibility(0);
        if (z10) {
            n5Var.setPadding(org.telegram.messenger.i0.L(cd.X ? 21.0f : 72.0f), 0, org.telegram.messenger.i0.L(cd.X ? 72.0f : 21.0f), 0);
            imageView.setPadding(cd.X ? 0 : org.telegram.messenger.i0.L(5.0f), 0, cd.X ? org.telegram.messenger.i0.L(5.0f) : 5, 0);
        } else {
            n5Var.setPadding(org.telegram.messenger.i0.L(cd.X ? 16.0f : 72.0f), 0, org.telegram.messenger.i0.L(cd.X ? 72.0f : 16.0f), 0);
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    public ImageView getImageView() {
        return this.b;
    }

    public org.telegram.ui.Components.n5 getTextView() {
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
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(i13), TLObject.FLAG_30));
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
