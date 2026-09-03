package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class t2 extends FrameLayout {
    public int a;
    public TextView b;
    public TextView c;
    public RadioButton d;
    public boolean e;

    public final void a(boolean z4, boolean z10) {
        RadioButton radioButton = this.d;
        TextView textView = this.c;
        TextView textView2 = this.b;
        setEnabled(z4);
        if (z10) {
            textView2.animate().alpha(z4 ? 1.0f : 0.5f).start();
            textView.animate().alpha(z4 ? 1.0f : 0.5f).start();
            radioButton.animate().alpha(z4 ? 1.0f : 0.5f).start();
        } else {
            textView2.setAlpha(z4 ? 1.0f : 0.5f);
            textView.setAlpha(z4 ? 1.0f : 0.5f);
            radioButton.setAlpha(z4 ? 1.0f : 0.5f);
        }
    }

    public final void b() {
        FrameLayout.LayoutParams d;
        FrameLayout.LayoutParams d10;
        TextView textView = this.b;
        TextView textView2 = this.c;
        if (textView2.getVisibility() == 0) {
            boolean z4 = LocaleController.isRTL;
            d = k7.c6.d(-1, -1.0f, (z4 ? 5 : 3) | 48, z4 ? 23.0f : 61.0f, 0.0f, z4 ? 61.0f : 23.0f, 0.0f);
        } else {
            boolean z10 = LocaleController.isRTL;
            d = k7.c6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 61.0f : 23.0f, 0.0f, z10 ? 23.0f : 61.0f, 0.0f);
        }
        textView.setLayoutParams(d);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            d10 = k7.c6.d(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            d10 = k7.c6.d(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(d10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 23.0f), getHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 23.0f : 0.0f), getHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        TextView textView = this.c;
        int dp = measuredWidth - AndroidUtilities.dp((textView.getVisibility() == 0 ? 12 : 0) + 84);
        this.d.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            dp = org.telegram.ui.b.t(12.0f, textView.getMeasuredWidth(), dp);
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
    }
}
