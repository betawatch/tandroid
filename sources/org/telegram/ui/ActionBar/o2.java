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
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class o2 extends FrameLayout {
    public final org.telegram.ui.Components.q5 a;
    public final ImageView b;
    public final ImageView c;
    public final int d;
    public boolean e;
    public boolean f;

    public o2(int i7, Context context, f6 f6Var) {
        super(context);
        this.f = false;
        this.d = i7;
        if (i7 != 4) {
            setBackgroundDrawable(k6.M0(f6Var, false));
        }
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        r6.t(imageView, k6.J5, f6Var, PorterDuff.Mode.MULTIPLY);
        addView(imageView, ha.e(56, 48, (hd.a0 ? 5 : 3) | 16));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(scaleType);
        r6.t(imageView2, k6.h7, f6Var, PorterDuff.Mode.SRC_IN);
        addView(imageView2, ha.e(56, 48, (hd.a0 ? 3 : 5) | 16));
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(context);
        this.a = q5Var;
        q5Var.setLines(1);
        q5Var.setSingleLine(true);
        q5Var.setGravity(1);
        q5Var.setEllipsize(TextUtils.TruncateAt.END);
        if (i7 == 0 || i7 == 4) {
            r6.V(q5Var, k6.j5, f6Var);
            q5Var.setTextSize(1, 16.0f);
            addView(q5Var, ha.e(-2, -2, (hd.a0 ? 5 : 3) | 16));
            return;
        }
        if (i7 == 1) {
            q5Var.setGravity(17);
            r6.V(q5Var, k6.j5, f6Var);
            q5Var.setTextSize(1, 14.0f);
            q5Var.setTypeface(org.telegram.messenger.g0.o());
            addView(q5Var, ha.c(-1.0f, -1));
            return;
        }
        if (i7 == 2) {
            q5Var.setGravity(17);
            r6.V(q5Var, k6.Gi, f6Var);
            q5Var.setTextSize(1, 14.0f);
            q5Var.setTypeface(org.telegram.messenger.g0.o());
            q5Var.setBackground(z5.e(k6.w0(k6.Ci, f6Var), 6.0f));
            addView(q5Var, ha.d(-1, -1.0f, 0, 16.0f, 16.0f, 16.0f, 16.0f));
        }
    }

    public final void a(CharSequence charSequence, int i7, Drawable drawable, boolean z9) {
        org.telegram.ui.Components.q5 q5Var = this.a;
        q5Var.setText(charSequence);
        ImageView imageView = this.b;
        if (i7 == 0 && drawable == null) {
            imageView.setVisibility(4);
            q5Var.setPadding(org.telegram.messenger.g0.L(z9 ? 21.0f : 16.0f), 0, org.telegram.messenger.g0.L(z9 ? 21.0f : 16.0f), 0);
            return;
        }
        if (drawable != null) {
            imageView.setImageDrawable(drawable);
        } else {
            imageView.setImageResource(i7);
        }
        imageView.setVisibility(0);
        if (z9) {
            q5Var.setPadding(org.telegram.messenger.g0.L(hd.a0 ? 21.0f : 72.0f), 0, org.telegram.messenger.g0.L(hd.a0 ? 72.0f : 21.0f), 0);
            imageView.setPadding(hd.a0 ? 0 : org.telegram.messenger.g0.L(5.0f), 0, hd.a0 ? org.telegram.messenger.g0.L(5.0f) : 5, 0);
        } else {
            q5Var.setPadding(org.telegram.messenger.g0.L(hd.a0 ? 16.0f : 72.0f), 0, org.telegram.messenger.g0.L(hd.a0 ? 72.0f : 16.0f), 0);
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    public ImageView getImageView() {
        return this.b;
    }

    public org.telegram.ui.Components.q5 getTextView() {
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

    public void setChecked(boolean z9) {
        this.e = z9;
        this.c.setImageResource(z9 ? R.drawable.checkbig : 0);
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
