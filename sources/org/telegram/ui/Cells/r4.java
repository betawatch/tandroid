package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.fd;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class r4 extends FrameLayout {
    public final RadioButton a;
    public final TextView b;
    public final TextView c;
    public boolean d;
    public fd e;
    public final int f;

    public r4(Context context) {
        super(context);
        this.f = 62;
        if (org.telegram.ui.ActionBar.k6.k0 == null) {
            org.telegram.ui.ActionBar.k6.R(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(org.telegram.messenger.g0.L(20.0f));
        org.telegram.ui.ActionBar.r6.P(radioButton, org.telegram.ui.ActionBar.k6.D5, org.telegram.ui.ActionBar.k6.E5, null);
        boolean z9 = id.a0;
        addView(radioButton, c8.ha.d(22, 22.0f, (z9 ? 5 : 3) | 16, z9 ? 0 : 20, 0.0f, z9 ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((id.a0 ? 5 : 3) | 16);
        boolean z10 = id.a0;
        addView(textView, c8.ha.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 23 : 62, 0.0f, z10 ? 62 : 23, 17.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.r5, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((id.a0 ? 5 : 3) | 16);
        boolean z11 = id.a0;
        addView(textView2, c8.ha.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 23 : 62, 20.0f, z11 ? 62 : 23, 0.0f));
    }

    public fd getCurrentLocale() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            boolean z9 = id.a0;
            int i7 = this.f;
            canvas.drawLine(z9 ? 0.0f : org.telegram.messenger.g0.L(i7 - 3), getMeasuredHeight() - 1, getMeasuredWidth() - (id.a0 ? org.telegram.messenger.g0.L(i7 - 3) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.k0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }
}
