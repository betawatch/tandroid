package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public class x4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 a;
    public final org.telegram.ui.ActionBar.k5 b;
    public final ImageView c;
    public boolean d;
    public int e;

    public x4(Context context) {
        super(context);
        this.e = 0;
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.a = k5Var;
        k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        k5Var.setTextSize(16);
        k5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(k5Var);
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.b = k5Var2;
        k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
        k5Var2.setTextSize(16);
        k5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(k5Var2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.m6, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView);
    }

    public final void a(int i10, int i11) {
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i11, false);
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        k5Var.setTextColor(w02);
        k5Var.setTag(Integer.valueOf(i11));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.c;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setTag(Integer.valueOf(i10));
    }

    public final void b(String str, int i10, int i11, boolean z4) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int dp = AndroidUtilities.dp(i11);
        ImageView imageView = this.c;
        imageView.setPadding(0, dp, 0, 0);
        imageView.setImageResource(i10);
        this.d = z4;
        setWillNotDraw(!z4);
    }

    public int getFullHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    public org.telegram.ui.ActionBar.k5 getTextView() {
        return this.a;
    }

    public org.telegram.ui.ActionBar.k5 getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            int i10 = this.e;
            if (i10 != 0) {
                org.telegram.ui.ActionBar.j6.l0.setColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            }
            canvas.drawLine(AndroidUtilities.dp(71.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.e != 0 ? org.telegram.ui.ActionBar.j6.l0 : org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int i15 = i12 - i10;
        org.telegram.ui.ActionBar.k5 k5Var = this.b;
        int textHeight = (i14 - k5Var.getTextHeight()) / 2;
        int dp = LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0;
        k5Var.layout(dp, textHeight, k5Var.getMeasuredWidth() + dp, k5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.k5 k5Var2 = this.a;
        int textHeight2 = (i14 - k5Var2.getTextHeight()) / 2;
        int dp2 = !LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : AndroidUtilities.dp(24.0f);
        k5Var2.layout(dp2, textHeight2, k5Var2.getMeasuredWidth() + dp2, k5Var2.getMeasuredHeight() + textHeight2);
        int dp3 = AndroidUtilities.dp(9.0f);
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = this.c;
        int dp4 = !z10 ? AndroidUtilities.dp(21.0f) : (i15 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(21.0f);
        imageView.layout(dp4, dp3, imageView.getMeasuredWidth() + dp4, imageView.getMeasuredHeight() + dp3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(48.0f);
        this.b.measure(org.telegram.ui.b.d(24.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.a.measure(org.telegram.ui.b.d(95.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i10) {
        this.e = i10;
    }

    public void setTextColor(int i10) {
        this.a.setTextColor(i10);
    }
}
