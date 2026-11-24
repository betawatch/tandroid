// default package

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class djb extends FrameLayout {
    public static Paint d;
    public static final int[] e = {-1031100, -29183, -12769, -8792480, -12521994, -12140801, -2984711, -45162, -4473925};
    public static final int[] f = {-65536, -29183, -256, -16711936, -16711681, -16776961, -2984711, -65281, -1};
    public final TextView a;
    public boolean b;
    public int c;

    public djb(Context context, ylb ylbVar) {
        super(context);
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.F6, ylbVar);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        addView(textView, qoe.d(-1, -1.0f, (jb6.a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(ArrayList arrayList, boolean z) {
        setEnabled(z);
        TextView textView = this.a;
        if (arrayList == null) {
            textView.setAlpha(z ? 1.0f : 0.5f);
            setAlpha(z ? 1.0f : 0.5f);
        } else {
            float[] fArr = {z ? 1.0f : 0.5f};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr));
            arrayList.add(ObjectAnimator.ofFloat(this, (Property<djb, Float>) property, z ? 1.0f : 0.5f));
        }
    }

    public final void b(int i, String str, boolean z) {
        this.a.setText(str);
        this.b = z;
        this.c = i;
        setWillNotDraw(!z && i == 0);
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.b) {
            canvas2 = canvas;
            canvas2.drawLine(jb6.a0 ? 0.0f : gm.L(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(20.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        } else {
            canvas2 = canvas;
        }
        int i = this.c;
        if (i != 0) {
            d.setColor(i);
            canvas2.drawCircle(jb6.a0 ? gm.L(33.0f) : getMeasuredWidth() - gm.L(33.0f), getMeasuredHeight() / 2, gm.L(10.0f), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f) + (this.b ? 1 : 0), TLObject.FLAG_30));
    }
}
