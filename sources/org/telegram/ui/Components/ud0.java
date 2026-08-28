package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ud0 extends FrameLayout {
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
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        int dp = AndroidUtilities.dp(13.0f) + this.a.getMeasuredHeight();
        TextView textView = this.b;
        textView.layout(textView.getLeft(), dp, textView.getRight(), textView.getMeasuredHeight() + dp);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        TextView textView = this.a;
        measureChildWithMargins(textView, i9, 0, i10, 0);
        TextView textView2 = this.b;
        measureChildWithMargins(textView2, i9, 0, i10, 0);
        measureChildWithMargins(this.c, i9, 0, i10, 0);
        Switch r72 = this.d;
        if (r72 != null) {
            measureChildWithMargins(r72, i9, 0, i10, 0);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i9), org.telegram.messenger.l0.z(20.0f, textView2.getMeasuredHeight() + textView.getMeasuredHeight(), AndroidUtilities.dp(64.0f)) + (this.e ? 1 : 0));
    }

    public void setChecked(boolean z10) {
        Switch r02 = this.d;
        if (r02 != null) {
            r02.c(z10, true);
        }
    }
}
