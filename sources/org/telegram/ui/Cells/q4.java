package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q4 extends FrameLayout {
    public final RadioButton a;
    public final TextView b;
    public final TextView c;
    public boolean d;
    public LocaleController.LocaleInfo e;
    public final int f;

    public q4(Context context) {
        super(context);
        this.f = 62;
        if (org.telegram.ui.ActionBar.f6.k0 == null) {
            org.telegram.ui.ActionBar.f6.P(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(AndroidUtilities.dp(20.0f));
        radioButton.b(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.D5, false), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E5, false));
        boolean z10 = LocaleController.isRTL;
        addView(radioButton, g7.e6.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z11 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 23 : 62, 0.0f, z11 ? 62 : 23, 17.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.r5, false));
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        boolean z12 = LocaleController.isRTL;
        addView(textView2, g7.e6.d(-1, -1.0f, (z12 ? 5 : 3) | 48, z12 ? 23 : 62, 20.0f, z12 ? 62 : 23, 0.0f));
    }

    public LocaleController.LocaleInfo getCurrentLocale() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            boolean z10 = LocaleController.isRTL;
            int i9 = this.f;
            canvas.drawLine(z10 ? 0.0f : AndroidUtilities.dp(i9 - 3), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(i9 - 3) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }
}
