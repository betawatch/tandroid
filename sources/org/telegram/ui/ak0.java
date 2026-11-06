package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ak0 extends FrameLayout {
    public TextView a;
    public TextView b;
    public ImageView c;
    public boolean d;

    public final void a(String str, boolean z9) {
        this.a.setText(str);
        this.b.setText("");
        this.d = z9;
        setWillNotDraw(!z9);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(org.telegram.messenger.hd.a0 ? 0.0f : org.telegram.messenger.g0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (org.telegram.messenger.hd.a0 ? org.telegram.messenger.g0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }

    public void setChecked(boolean z9) {
        this.c.setVisibility(z9 ? 0 : 4);
    }

    public void setNeedDivider(boolean z9) {
        this.d = z9;
        setWillNotDraw(!z9);
        invalidate();
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
