package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class kl0 extends FrameLayout {
    public TextView a;
    public TextView b;
    public ImageView c;
    public boolean d;

    public final void a(String str, boolean z10) {
        this.a.setText(str);
        this.b.setText("");
        this.d = z10;
        setWillNotDraw(!z10);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(org.telegram.messenger.cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }

    public void setChecked(boolean z10) {
        this.c.setVisibility(z10 ? 0 : 4);
    }

    public void setNeedDivider(boolean z10) {
        this.d = z10;
        setWillNotDraw(!z10);
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
