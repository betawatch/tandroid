package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public class c5 extends FrameLayout {
    public final org.telegram.ui.ActionBar.b6 a;
    public final org.telegram.ui.ActionBar.b6 b;
    public final ImageView c;
    public boolean d;
    public int e;

    public c5(Context context) {
        super(context);
        this.e = 0;
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.a = b6Var;
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, null);
        b6Var.setTextSize(16);
        b6Var.setGravity(LocaleController.isRTL ? 5 : 3);
        addView(b6Var);
        org.telegram.ui.ActionBar.b6 b6Var2 = new org.telegram.ui.ActionBar.b6(context);
        this.b = b6Var2;
        org.telegram.ui.ActionBar.f7.Y(b6Var2, org.telegram.ui.ActionBar.y6.I6, null);
        b6Var2.setTextSize(16);
        b6Var2.setGravity(LocaleController.isRTL ? 3 : 5);
        addView(b6Var2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i10, int i11) {
        org.telegram.ui.ActionBar.b6 b6Var = this.a;
        org.telegram.ui.ActionBar.f7.Y(b6Var, i11, null);
        b6Var.setTag(Integer.valueOf(i11));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.c;
        org.telegram.ui.ActionBar.f7.t(imageView, i10, null, mode);
        imageView.setTag(Integer.valueOf(i10));
    }

    public final void b(String str, int i10, int i11, boolean z10) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int dp = AndroidUtilities.dp(i11);
        ImageView imageView = this.c;
        imageView.setPadding(0, dp, 0, 0);
        imageView.setImageResource(i10);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public int getFullHeight() {
        return AndroidUtilities.dp(56.0f);
    }

    public org.telegram.ui.ActionBar.b6 getTextView() {
        return this.a;
    }

    public org.telegram.ui.ActionBar.b6 getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            int i10 = this.e;
            if (i10 != 0) {
                org.telegram.ui.ActionBar.y6.l0.setColor(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
            }
            canvas.drawLine(AndroidUtilities.dp(71.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.e != 0 ? org.telegram.ui.ActionBar.y6.l0 : org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i13 - i11;
        int i15 = i12 - i10;
        org.telegram.ui.ActionBar.b6 b6Var = this.b;
        int textHeight = (i14 - b6Var.getTextHeight()) / 2;
        int dp = LocaleController.isRTL ? AndroidUtilities.dp(24.0f) : 0;
        b6Var.layout(dp, textHeight, b6Var.getMeasuredWidth() + dp, b6Var.getMeasuredHeight() + textHeight);
        org.telegram.ui.ActionBar.b6 b6Var2 = this.a;
        int textHeight2 = (i14 - b6Var2.getTextHeight()) / 2;
        int dp2 = !LocaleController.isRTL ? AndroidUtilities.dp(71.0f) : AndroidUtilities.dp(24.0f);
        b6Var2.layout(dp2, textHeight2, b6Var2.getMeasuredWidth() + dp2, b6Var2.getMeasuredHeight() + textHeight2);
        int dp3 = AndroidUtilities.dp(9.0f);
        boolean z11 = LocaleController.isRTL;
        ImageView imageView = this.c;
        int dp4 = !z11 ? AndroidUtilities.dp(21.0f) : (i15 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(21.0f);
        imageView.layout(dp4, dp3, imageView.getMeasuredWidth() + dp4, imageView.getMeasuredHeight() + dp3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int dp = AndroidUtilities.dp(48.0f);
        this.b.measure(wh.x(24.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.a.measure(wh.x(95.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
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
