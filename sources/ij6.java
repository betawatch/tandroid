// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public class ij6 extends FrameLayout {
    public final ema a;
    public final ema b;
    public final ImageView c;
    public boolean d;
    public int e;
    public int f;

    public ij6(Context context) {
        super(context);
        this.e = 0;
        this.f = 71;
        ema emaVar = new ema(context);
        this.a = emaVar;
        yob.W(emaVar, aob.G6, null);
        emaVar.setTextSize(16);
        emaVar.setGravity(ob6.a0 ? 5 : 3);
        addView(emaVar);
        ema emaVar2 = new ema(context);
        this.b = emaVar2;
        yob.W(emaVar2, aob.I6, null);
        emaVar2.setTextSize(16);
        emaVar2.setGravity(ob6.a0 ? 3 : 5);
        addView(emaVar2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.m6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i, int i2) {
        ema emaVar = this.a;
        yob.W(emaVar, i2, null);
        emaVar.setTag(Integer.valueOf(i2));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.c;
        yob.s(imageView, i, null, mode);
        imageView.setTag(Integer.valueOf(i));
    }

    public final void b(int i, int i2, String str, boolean z) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int L = hl.L(i2);
        ImageView imageView = this.c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i);
        this.d = z;
        setWillNotDraw(!z);
    }

    public int getFullHeight() {
        return hl.L(56.0f);
    }

    public ema getTextView() {
        return this.a;
    }

    public ema getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            int i = this.e;
            if (i != 0) {
                aob.k0.setColor(aob.w0(null, i, false));
            }
            canvas.drawLine(hl.L(this.f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.e != 0 ? aob.k0 : aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        ema emaVar = this.b;
        int textHeight = (i5 - emaVar.getTextHeight()) / 2;
        int L = ob6.a0 ? hl.L(24.0f) : 0;
        emaVar.layout(L, textHeight, emaVar.getMeasuredWidth() + L, emaVar.getMeasuredHeight() + textHeight);
        ema emaVar2 = this.a;
        int textHeight2 = (i5 - emaVar2.getTextHeight()) / 2;
        int L2 = !ob6.a0 ? hl.L(this.f) : hl.L(24.0f);
        emaVar2.layout(L2, textHeight2, emaVar2.getMeasuredWidth() + L2, emaVar2.getMeasuredHeight() + textHeight2);
        int L3 = hl.L(9.0f);
        boolean z2 = ob6.a0;
        ImageView imageView = this.c;
        int L4 = !z2 ? hl.L(21.0f) : (i6 - imageView.getMeasuredWidth()) - hl.L(21.0f);
        imageView.layout(L4, L3, imageView.getMeasuredWidth() + L4, imageView.getMeasuredHeight() + L3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = hl.L(48.0f);
        this.b.measure(ik8.f(24.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        this.a.measure(ik8.f(this.f + 24, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(hl.L(20.0f), TLObject.FLAG_30));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(L, TLObject.FLAG_31));
        setMeasuredDimension(size, getFullHeight() + (this.d ? 1 : 0));
    }

    public void setDividerColor(int i) {
        this.e = i;
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }

    public void setTextLeft(int i) {
        this.f = i;
        requestLayout();
    }
}
