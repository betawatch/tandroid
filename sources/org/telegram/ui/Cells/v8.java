package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v8 extends FrameLayout {
    public static Paint d;
    public static final int[] e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView a;
    public boolean b;
    public int c;

    public v8(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        z20.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((cd.X ? 5 : 3) | 16);
        addView(textView, w7.b6.d(-1, -1.0f, (cd.X ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z10) {
        setEnabled(z10);
        TextView textView = this.a;
        if (arrayList == null) {
            textView.setAlpha(z10 ? 1.0f : 0.5f);
            setAlpha(z10 ? 1.0f : 0.5f);
        } else {
            float[] fArr = {z10 ? 1.0f : 0.5f};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr));
            arrayList.add(ObjectAnimator.ofFloat(this, (Property<v8, Float>) property, z10 ? 1.0f : 0.5f));
        }
    }

    public final void b(int i10, String str, boolean z10) {
        this.a.setText(str);
        this.b = z10;
        this.c = i10;
        setWillNotDraw(!z10 && i10 == 0);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.b) {
            canvas2 = canvas;
            canvas2.drawLine(cd.X ? 0.0f : org.telegram.messenger.i0.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? org.telegram.messenger.i0.L(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.k0);
        } else {
            canvas2 = canvas;
        }
        int i10 = this.c;
        if (i10 != 0) {
            d.setColor(i10);
            canvas2.drawCircle(cd.X ? org.telegram.messenger.i0.L(33.0f) : getMeasuredWidth() - org.telegram.messenger.i0.L(33.0f), getMeasuredHeight() / 2, org.telegram.messenger.i0.L(10.0f), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(50.0f) + (this.b ? 1 : 0), TLObject.FLAG_30));
    }
}
