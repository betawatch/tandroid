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
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class z3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.ui.ActionBar.n5 a;
    public org.telegram.ui.ActionBar.n5 b;
    public ImageView c;
    public ImageView d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public Paint r;

    public final void a(int i7, int i10) {
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        org.telegram.ui.ActionBar.u6.q(n5Var);
        ImageView imageView = this.c;
        org.telegram.ui.ActionBar.u6.q(imageView);
        n5Var.setTextColor(i10);
        n5Var.setTag(null);
        imageView.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i7, String str, boolean z10) {
        this.a.l(str, false);
        org.telegram.ui.ActionBar.n5 n5Var = this.b;
        n5Var.l(null, false);
        ImageView imageView = this.c;
        imageView.setImageResource(i7);
        imageView.setVisibility(0);
        n5Var.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
        this.f = z10;
        setWillNotDraw(!z10);
    }

    public org.telegram.ui.ActionBar.n5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.n5 getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        ImageView imageView = this.c;
        if (this.f) {
            if (gd.a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.a0) {
                i7 = org.telegram.messenger.g0.L(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, this.r);
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
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int L;
        int i13 = this.n;
        int i14 = this.e;
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.c;
        int i15 = i12 - i10;
        int i16 = i11 - i7;
        org.telegram.ui.ActionBar.n5 n5Var2 = this.b;
        int textHeight = (i15 - n5Var2.getTextHeight()) / 2;
        int L2 = gd.a0 ? org.telegram.messenger.g0.L(i14) : 0;
        n5Var2.layout(L2, textHeight, n5Var2.getMeasuredWidth() + L2, n5Var2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i15 - n5Var.getTextHeight()) / 2;
        if (gd.a0) {
            int measuredWidth = getMeasuredWidth() - n5Var.getMeasuredWidth();
            if (imageView2.getVisibility() == 0) {
                i14 = this.h;
            }
            L = measuredWidth - org.telegram.messenger.g0.L(i14);
        } else {
            L = org.telegram.messenger.g0.L(imageView2.getVisibility() == 0 ? this.h : i14);
        }
        n5Var.layout(L, textHeight2, n5Var.getMeasuredWidth() + L, n5Var.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int L3 = org.telegram.messenger.g0.L(5.0f);
            int L4 = !gd.a0 ? org.telegram.messenger.g0.L(i13) : (i16 - imageView2.getMeasuredWidth()) - org.telegram.messenger.g0.L(i13);
            imageView2.layout(L4, L3, imageView2.getMeasuredWidth() + L4, imageView2.getMeasuredHeight() + L3);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i15 - imageView.getMeasuredHeight()) / 2;
            int L5 = gd.a0 ? org.telegram.messenger.g0.L(23.0f) : (i16 - imageView.getMeasuredWidth()) - org.telegram.messenger.g0.L(23.0f);
            imageView.layout(L5, measuredHeight, imageView.getMeasuredWidth() + L5, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i10) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i7);
        int L = org.telegram.messenger.g0.L(48.0f);
        org.telegram.ui.ActionBar.n5 n5Var = this.b;
        n5Var.measure(n10.c(this.e, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        this.a.measure(View.MeasureSpec.makeMeasureSpec((size - org.telegram.messenger.g0.L(r2 + 71)) - n5Var.getTextWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(20.0f), TLObject.FLAG_30));
        ImageView imageView2 = this.c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        }
        setMeasuredDimension(size, org.telegram.messenger.g0.L(50.0f) + (this.f ? 1 : 0));
    }

    public void setOffsetFromImage(int i7) {
        this.h = i7;
    }

    public void setTextColor(int i7) {
        org.telegram.ui.ActionBar.n5 n5Var = this.a;
        org.telegram.ui.ActionBar.u6.q(n5Var);
        n5Var.setTextColor(i7);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.r.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Xg, false));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
