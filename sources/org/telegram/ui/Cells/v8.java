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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class v8 extends FrameLayout {
    public static Paint d;
    public static final int[] e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView a;
    public boolean b;
    public int c;

    public v8(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.a = textView;
        ll.n(org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        addView(textView, g7.e6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
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

    public final void b(int i9, String str, boolean z10) {
        this.a.setText(str);
        this.b = z10;
        this.c = i9;
        setWillNotDraw(!z10 && i9 == 0);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.b) {
            canvas2 = canvas;
            canvas2.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.k0);
        } else {
            canvas2 = canvas;
        }
        int i9 = this.c;
        if (i9 != 0) {
            d.setColor(i9);
            canvas2.drawCircle(LocaleController.isRTL ? AndroidUtilities.dp(33.0f) : getMeasuredWidth() - AndroidUtilities.dp(33.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(10.0f), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f) + (this.b ? 1 : 0), TLObject.FLAG_30));
    }
}
