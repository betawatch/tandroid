package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class b4 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public org.telegram.ui.ActionBar.u5 a;
    public org.telegram.ui.ActionBar.u5 b;
    public ImageView c;
    public ImageView d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public Paint r;

    public final void a(int i10, int i11) {
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        org.telegram.ui.ActionBar.a7.r(u5Var);
        ImageView imageView = this.c;
        org.telegram.ui.ActionBar.a7.r(imageView);
        u5Var.setTextColor(i11);
        u5Var.setTag(null);
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i10, String str, boolean z10) {
        this.a.l(str, false);
        org.telegram.ui.ActionBar.u5 u5Var = this.b;
        u5Var.l(null, false);
        ImageView imageView = this.c;
        imageView.setImageResource(i10);
        imageView.setVisibility(0);
        u5Var.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, org.telegram.messenger.i0.L(7.0f), 0, 0);
        this.f = z10;
        setWillNotDraw(!z10);
    }

    public org.telegram.ui.ActionBar.u5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.u5 getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        ImageView imageView = this.c;
        if (this.f) {
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, this.r);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        CharSequence text = this.a.getText();
        if (TextUtils.isEmpty(text)) {
            return;
        }
        CharSequence text2 = this.b.getText();
        if (TextUtils.isEmpty(text2)) {
            accessibilityNodeInfo.setText(text);
            return;
        }
        accessibilityNodeInfo.setText(((Object) text) + ": " + ((Object) text2));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int L;
        int i14 = this.n;
        int i15 = this.e;
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.c;
        int i16 = i13 - i11;
        int i17 = i12 - i10;
        org.telegram.ui.ActionBar.u5 u5Var2 = this.b;
        int textHeight = (i16 - u5Var2.getTextHeight()) / 2;
        int L2 = cd.X ? org.telegram.messenger.i0.L(i15) : 0;
        u5Var2.layout(L2, textHeight, u5Var2.getMeasuredWidth() + L2, u5Var2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i16 - u5Var.getTextHeight()) / 2;
        if (cd.X) {
            int measuredWidth = getMeasuredWidth() - u5Var.getMeasuredWidth();
            if (imageView2.getVisibility() == 0) {
                i15 = this.h;
            }
            L = measuredWidth - org.telegram.messenger.i0.L(i15);
        } else {
            L = org.telegram.messenger.i0.L(imageView2.getVisibility() == 0 ? this.h : i15);
        }
        u5Var.layout(L, textHeight2, u5Var.getMeasuredWidth() + L, u5Var.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int L3 = org.telegram.messenger.i0.L(5.0f);
            int L4 = !cd.X ? org.telegram.messenger.i0.L(i14) : (i17 - imageView2.getMeasuredWidth()) - org.telegram.messenger.i0.L(i14);
            imageView2.layout(L4, L3, imageView2.getMeasuredWidth() + L4, imageView2.getMeasuredHeight() + L3);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i16 - imageView.getMeasuredHeight()) / 2;
            int L5 = cd.X ? org.telegram.messenger.i0.L(23.0f) : (i17 - imageView.getMeasuredWidth()) - org.telegram.messenger.i0.L(23.0f);
            imageView.layout(L5, measuredHeight, imageView.getMeasuredWidth() + L5, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i10);
        int L = org.telegram.messenger.i0.L(48.0f);
        org.telegram.ui.ActionBar.u5 u5Var = this.b;
        u5Var.measure(z20.c(this.e, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
        this.a.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.i0.L(r2 + 71)) - u5Var.getTextWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(20.0f), TLObject.FLAG_30));
        ImageView imageView2 = this.c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        setMeasuredDimension(size, org.telegram.messenger.i0.L(50.0f) + (this.f ? 1 : 0));
    }

    public void setOffsetFromImage(int i10) {
        this.h = i10;
    }

    public void setTextColor(int i10) {
        org.telegram.ui.ActionBar.u5 u5Var = this.a;
        org.telegram.ui.ActionBar.a7.r(u5Var);
        u5Var.setTextColor(i10);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            this.r.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Ug, false));
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
