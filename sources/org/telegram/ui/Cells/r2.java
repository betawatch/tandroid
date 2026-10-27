package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r2 extends FrameLayout {
    public int a;
    public TextView b;
    public TextView c;
    public RadioButton d;
    public boolean e;
    public int f;

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
        FrameLayout.LayoutParams h;
        FrameLayout.LayoutParams h10;
        TextView textView = this.b;
        TextView textView2 = this.c;
        if (textView2.getVisibility() == 0) {
            boolean z10 = LocaleController.isRTL;
            h = kb1.h(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? this.f : 61.0f, 0.0f, z10 ? 61.0f : this.f, 0.0f);
        } else {
            boolean z11 = LocaleController.isRTL;
            h = kb1.h(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 61.0f : this.f, 0.0f, z11 ? this.f : 61.0f, 0.0f);
        }
        textView.setLayoutParams(h);
        RadioButton radioButton = this.d;
        if (textView2.getVisibility() == 0) {
            h10 = kb1.h(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        } else {
            h10 = kb1.h(22, 22.0f, (LocaleController.isRTL ? 3 : 5) | 48, 20.0f, 15.0f, 20.0f, 0.0f);
        }
        radioButton.setLayoutParams(h10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : this.f), getHeight() - 1, getMeasuredWidth() - AndroidUtilities.dp(LocaleController.isRTL ? this.f : 0.0f), getHeight() - 1, org.telegram.ui.ActionBar.y6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.e ? 1 : 0));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int i12 = this.f + 61;
        TextView textView = this.c;
        int dp = measuredWidth - AndroidUtilities.dp(i12 + (textView.getVisibility() == 0 ? 12 : 0));
        this.d.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(22.0f), TLObject.FLAG_30));
        if (textView.getVisibility() == 0) {
            textView.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
            dp = wh.z(12.0f, textView.getMeasuredWidth(), dp);
        }
        this.b.measure(View.MeasureSpec.makeMeasureSpec(dp, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30));
    }

    public void setHorizontalPadding(int i10) {
        TextView textView = this.c;
        if (this.f != i10) {
            this.f = i10;
            float f7 = i10;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(f7);
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(f7);
            b();
        }
    }

    public void setTextColor(int i10) {
        this.b.setTextColor(i10);
    }
}
