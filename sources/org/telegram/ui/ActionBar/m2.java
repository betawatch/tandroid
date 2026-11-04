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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m2 extends FrameLayout {
    public final org.telegram.ui.Components.o5 a;
    public final ImageView b;
    public final ImageView c;
    public final int d;
    public boolean e;
    public boolean f;

    public m2(int i3, Context context, e6 e6Var) {
        super(context);
        this.f = false;
        this.d = i3;
        if (i3 != 4) {
            setBackgroundDrawable(k6.M0(e6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        r6.t(imageView, k6.J5, e6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, mf.e(56, 48, (bd.a0 ? 5 : 3) | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        r6.t(imageView2, k6.h7, e6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView2, mf.e(56, 48, (bd.a0 ? 3 : 5) | 16));
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(context);
        this.a = o5Var;
        o5Var.setLines(1);
        o5Var.setSingleLine(true);
        o5Var.setGravity(1);
        o5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i3 == 0 || i3 == 4) {
            r6.V(o5Var, k6.j5, e6Var);
            o5Var.setTextSize(1, 16.0f);
            addView(o5Var, mf.e(-2, -2, (bd.a0 ? 5 : 3) | 16));
            return;
        }
        if (i3 == 1) {
            o5Var.setGravity(17);
            r6.V(o5Var, k6.j5, e6Var);
            o5Var.setTextSize(1, 14.0f);
            o5Var.setTypeface(org.telegram.messenger.g0.o());
            addView(o5Var, mf.c(-1.0f, -1));
            return;
        }
        if (i3 == 2) {
            o5Var.setGravity(17);
            r6.V(o5Var, k6.Gi, e6Var);
            o5Var.setTextSize(1, 14.0f);
            o5Var.setTypeface(org.telegram.messenger.g0.o());
            o5Var.setBackground(y5.e(k6.w0(k6.Ci, e6Var), 6.0f));
            addView(o5Var, mf.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        }
    }

    public final void a(CharSequence charSequence, int i3, Drawable drawable, boolean z10) {
        org.telegram.ui.Components.o5 o5Var = this.a;
        o5Var.setText(charSequence);
        ImageView imageView = this.b;
        if (i3 == 0 && drawable == null) {
            imageView.setVisibility(4);
            o5Var.setPadding(org.telegram.messenger.g0.L(z10 ? 21.0f : 16.0f), 0, org.telegram.messenger.g0.L(z10 ? 21.0f : 16.0f), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i3);
        }
        imageView.setVisibility(0);
        if (z10) {
            o5Var.setPadding(org.telegram.messenger.g0.L(bd.a0 ? 21.0f : 72.0f), 0, org.telegram.messenger.g0.L(bd.a0 ? 72.0f : 21.0f), 0);
            imageView.setPadding(bd.a0 ? 0 : org.telegram.messenger.g0.L(5.0f), 0, bd.a0 ? org.telegram.messenger.g0.L(5.0f) : 5, 0);
        } else {
            o5Var.setPadding(org.telegram.messenger.g0.L(bd.a0 ? 16.0f : 72.0f), 0, org.telegram.messenger.g0.L(bd.a0 ? 72.0f : 16.0f), 0);
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    public ImageView getImageView() {
        return this.b;
    }

    public org.telegram.ui.Components.o5 getTextView() {
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
    public final void onMeasure(int i3, int i10) {
        int i11 = this.d;
        int i12 = i11 == 2 ? 80 : 48;
        if (i11 == 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), TLObject.FLAG_30);
        }
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(i12), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        this.e = z10;
        this.c.setImageResource(z10 ? R.drawable.checkbig : 0);
    }

    public void setGravity(int i3) {
        this.a.setGravity(i3);
    }

    public void setIconColor(int i3) {
        this.b.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
    }

    public void setTextColor(int i3) {
        this.a.setTextColor(i3);
    }
}
