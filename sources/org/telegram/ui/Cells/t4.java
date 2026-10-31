package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.zc;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t4 extends FrameLayout {
    public final RadioButton a;
    public final TextView b;
    public final TextView c;
    public boolean d;
    public zc e;
    public final int f;

    public t4(Context context) {
        super(context);
        this.f = 62;
        if (org.telegram.ui.ActionBar.t6.k0 == null) {
            org.telegram.ui.ActionBar.t6.R(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(org.telegram.messenger.i0.L(20.0f));
        org.telegram.ui.ActionBar.a7.P(radioButton, org.telegram.ui.ActionBar.t6.D5, org.telegram.ui.ActionBar.t6.E5, null);
        boolean z10 = cd.X;
        addView(radioButton, w7.b6.d(22, 22.0f, (z10 ? 5 : 3) | 16, z10 ? 0 : 20, 0.0f, z10 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((cd.X ? 5 : 3) | 16);
        boolean z11 = cd.X;
        addView(textView, w7.b6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 23 : 62, 0.0f, z11 ? 62 : 23, 17.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.r5, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((cd.X ? 5 : 3) | 16);
        boolean z12 = cd.X;
        addView(textView2, w7.b6.d(-1, -1.0f, (z12 ? 5 : 3) | 48, z12 ? 23 : 62, 20.0f, z12 ? 62 : 23, 0.0f));
    }

    public zc getCurrentLocale() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            boolean z10 = cd.X;
            int i10 = this.f;
            canvas.drawLine(z10 ? 0.0f : org.telegram.messenger.i0.L(i10 - 3), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(i10 - 3) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }
}
