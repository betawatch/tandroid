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
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class y4 extends FrameLayout {
    public final org.telegram.ui.ActionBar.h5 a;
    public final org.telegram.ui.ActionBar.h5 b;
    public final ImageView c;
    public boolean d;
    public int e;

    public y4(Context context) {
        super(context);
        this.e = 0;
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.a = h5Var;
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        h5Var.setTextSize(16);
        h5Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(h5Var);
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.b = h5Var2;
        h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
        h5Var2.setTextSize(16);
        h5Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(h5Var2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.m6, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView);
    }

    public final void a(int i9, int i10) {
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i10, false);
        org.telegram.ui.ActionBar.h5 h5Var = this.a;
        h5Var.setTextColor(w02);
        h5Var.setTag(Integer.valueOf(i10));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.c;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setTag(Integer.valueOf(i9));
    }

    public final void b(String str, int i9, int i10, boolean z10) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int dp = AndroidUtilities.dp(i10);
        ImageView imageView = this.c;
        imageView.setPadding(0, dp, 0, 0);
        imageView.setImageResource(i9);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    public org.telegram.ui.ActionBar.h5 getTextView() {
        return this.a;
    }

    public org.telegram.ui.ActionBar.h5 getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            int i9 = this.e;
            if (i9 != 0) {
                org.telegram.ui.ActionBar.f6.l0.setColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            }
            canvas.drawLine(AndroidUtilities.dp(71.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.e != 0 ? org.telegram.ui.ActionBar.f6.l0 : org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13 = i12 - i10;
        int i14 = i11 - i9;
        org.telegram.ui.ActionBar.h5 h5Var = this.b;
        int textHeight = (i13 - h5Var.getTextHeight()) / 2;
        int dp = LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0;
        h5Var.layout(dp, textHeight, h5Var.getMeasuredWidth() + dp, h5Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.a;
        int textHeight2 = (i13 - h5Var2.getTextHeight()) / 2;
        int dp2 = !LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : AndroidUtilities.dp(24.0f);
        h5Var2.layout(dp2, textHeight2, h5Var2.getMeasuredWidth() + dp2, h5Var2.getMeasuredHeight() + textHeight2);
        int dp3 = AndroidUtilities.dp(9.0f);
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.c;
        int dp4 = !z11 ? AndroidUtilities.dp(21.0f) : (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(21.0f);
        imageView.layout(dp4, dp3, imageView.getMeasuredWidth() + dp4, imageView.getMeasuredHeight() + dp3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int dp = AndroidUtilities.dp(48.0f);
        this.b.measure(ll.d(24.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.a.measure(ll.d(95.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i9) {
        this.e = i9;
    }

    public void setTextColor(int i9) {
        this.a.setTextColor(i9);
    }
}
