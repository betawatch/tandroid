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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.em;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class w3 extends FrameLayout {
    public org.telegram.ui.ActionBar.l5 a;
    public org.telegram.ui.ActionBar.l5 b;
    public ImageView c;
    public ImageView d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public Paint r;

    public final void a(int i10, int i11) {
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        l5Var.setTextColor(i11);
        l5Var.setTag(null);
        ImageView imageView = this.c;
        imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.MULTIPLY));
        imageView.setTag(null);
    }

    public final void b(int i10, String str, boolean z10) {
        this.a.l(str, false);
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        l5Var.l(null, false);
        ImageView imageView = this.c;
        imageView.setImageResource(i10);
        imageView.setVisibility(0);
        l5Var.setVisibility(8);
        this.d.setVisibility(8);
        imageView.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
        this.f = z10;
        setWillNotDraw(!z10);
    }

    public org.telegram.ui.ActionBar.l5 getTextView() {
        return this.a;
    }

    public ImageView getValueImageView() {
        return this.d;
    }

    public org.telegram.ui.ActionBar.l5 getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        ImageView imageView = this.c;
        if (this.f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 68.0f : 20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, this.r);
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
        int dp;
        int i14 = this.n;
        int i15 = this.e;
        org.telegram.ui.ActionBar.l5 l5Var = this.a;
        ImageView imageView = this.d;
        ImageView imageView2 = this.c;
        int i16 = i13 - i11;
        int i17 = i12 - i10;
        org.telegram.ui.ActionBar.l5 l5Var2 = this.b;
        int textHeight = (i16 - l5Var2.getTextHeight()) / 2;
        int dp2 = LocaleController.isRTL ? AndroidUtilities.dp(i15) : 0;
        l5Var2.layout(dp2, textHeight, l5Var2.getMeasuredWidth() + dp2, l5Var2.getMeasuredHeight() + textHeight);
        int textHeight2 = (i16 - l5Var.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            int measuredWidth = getMeasuredWidth() - l5Var.getMeasuredWidth();
            if (imageView2.getVisibility() == 0) {
                i15 = this.h;
            }
            dp = measuredWidth - AndroidUtilities.dp(i15);
        } else {
            dp = AndroidUtilities.dp(imageView2.getVisibility() == 0 ? this.h : i15);
        }
        l5Var.layout(dp, textHeight2, l5Var.getMeasuredWidth() + dp, l5Var.getMeasuredHeight() + textHeight2);
        if (imageView2.getVisibility() == 0) {
            int dp3 = AndroidUtilities.dp(5.0f);
            int dp4 = !LocaleController.isRTL ? AndroidUtilities.dp(i14) : (i17 - imageView2.getMeasuredWidth()) - AndroidUtilities.dp(i14);
            imageView2.layout(dp4, dp3, imageView2.getMeasuredWidth() + dp4, imageView2.getMeasuredHeight() + dp3);
        }
        if (imageView.getVisibility() == 0) {
            int measuredHeight = (i16 - imageView.getMeasuredHeight()) / 2;
            int dp5 = LocaleController.isRTL ? AndroidUtilities.dp(23.0f) : (i17 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(23.0f);
            imageView.layout(dp5, measuredHeight, imageView.getMeasuredWidth() + dp5, imageView.getMeasuredHeight() + measuredHeight);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        ImageView imageView = this.d;
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(48.0f);
        org.telegram.ui.ActionBar.l5 l5Var = this.b;
        l5Var.measure(em.d(this.e, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.a.measure(View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(r2 + 71)) - l5Var.getTextWidth(), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        ImageView imageView2 = this.c;
        if (imageView2.getVisibility() == 0) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
        }
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
        }
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f) + (this.f ? 1 : 0));
    }

    public void setOffsetFromImage(int i10) {
        this.h = i10;
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }
}
