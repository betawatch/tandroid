package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class qe0 extends FrameLayout {
    public TextView a;
    public TextView b;
    public ImageView c;
    public Switch d;
    public boolean e;

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Switch r02 = this.d;
        if (r02 != null) {
            r02.invalidate();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.e) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(13.0f) + this.a.getMeasuredHeight();
        TextView textView = this.b;
        textView.layout(textView.getLeft(), dp, textView.getRight(), textView.getMeasuredHeight() + dp);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        TextView textView = this.a;
        measureChildWithMargins(textView, i10, 0, i11, 0);
        TextView textView2 = this.b;
        measureChildWithMargins(textView2, i10, 0, i11, 0);
        measureChildWithMargins(this.c, i10, 0, i11, 0);
        Switch r72 = this.d;
        if (r72 != null) {
            measureChildWithMargins(r72, i10, 0, i11, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.y3.b(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), AndroidUtilities.dp(64.0f)) + (this.e ? 1 : 0));
    }

    public void setChecked(boolean z4) {
        Switch r02 = this.d;
        if (r02 != null) {
            r02.c(z4, true);
        }
    }
}
