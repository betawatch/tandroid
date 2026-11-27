// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class f23 extends FrameLayout {
    public final ema a;
    public final ImageView b;
    public boolean c;
    public byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public f23(int i, vnb vnbVar, Context context) {
        super(context);
        this.d = i;
        ema emaVar = new ema(context);
        this.a = emaVar;
        emaVar.setTextSize(16);
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        int i2 = aob.o6;
        yob.W(emaVar, i2, vnbVar);
        emaVar.setTag(Integer.valueOf(i2));
        addView(emaVar);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView);
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            canvas.drawLine(hl.L(this.d), getMeasuredHeight() - 1, hl.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int i5 = i3 - i;
        ema emaVar = this.a;
        int textHeight = ((i4 - i2) - emaVar.getTextHeight()) / 2;
        boolean z2 = ob6.a0;
        ImageView imageView = this.b;
        if (z2) {
            L = (getMeasuredWidth() - emaVar.getMeasuredWidth()) - hl.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        } else {
            L = hl.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        }
        emaVar.layout(L, textHeight, emaVar.getMeasuredWidth() + L, emaVar.getMeasuredHeight() + textHeight);
        int L2 = !ob6.a0 ? (hl.L(this.d) - imageView.getMeasuredWidth()) / 2 : (i5 - imageView.getMeasuredWidth()) - hl.L(25.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        Typeface typeface = hl.a;
        this.a.measure(ik8.f(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, hl.L(50.0f));
    }
}
