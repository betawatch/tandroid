package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t2 extends FrameLayout {
    public int a;
    public TextView b;
    public TextView c;
    public RadioButton d;
    public boolean e;

    public final void a(boolean z10, boolean z11) {
        RadioButton radioButton = this.d;
        TextView textView = this.c;
        TextView textView2 = this.b;
        setEnabled(z10);
        if (z11) {
            textView2.animate().alpha(z10 ? 1.0f : 0.5f).start();
            textView.animate().alpha(z10 ? 1.0f : 0.5f).start();
            radioButton.animate().alpha(z10 ? 1.0f : 0.5f).start();
        } else {
            textView2.setAlpha(z10 ? 1.0f : 0.5f);
            textView.setAlpha(z10 ? 1.0f : 0.5f);
            radioButton.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    public final void b() {
        FrameLayout.LayoutParams d;
        FrameLayout.LayoutParams d9;
        TextView textView = this.b;
        TextView textView2 = this.c;
        if (textView2.getVisibility() == 0) {
            boolean z10 = LocaleController.isRTL;
            d = g7.e6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 23.0f : 61.0f, 0.0f, z10 ? 61.0f : 23.0f, 0.0f);
        } else {
            boolean z11 = LocaleController.isRTL;
            d = g7.e6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : 23.0f, 0.0f, z11 ? 23.0f : 61.0f, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            d9 = g7.e6.d(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            d9 = g7.e6.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d9);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 23.0f), getHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 23.0f : 0.0f), getHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(50.0f) + (this.e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        TextView textView = this.c;
        int dp = measuredWidth - AndroidUtilities.dp((textView.getVisibility() == 0 ? 12 : 0) + 84);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            dp = ll.w(12.0f, textView.getMeasuredWidth(), dp);
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setTextColor(int i9) {
        this.b.setTextColor(i9);
    }
}
