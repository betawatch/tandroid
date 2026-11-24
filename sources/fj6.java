// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class fj6 extends FrameLayout {
    public final lka a;
    public final lka b;
    public final ImageView c;
    public boolean d;
    public int e;
    public int f;

    public fj6(Context context) {
        super(context);
        this.e = 0;
        this.f = 71;
        lka lkaVar = new lka(context);
        this.a = lkaVar;
        anb.W(lkaVar, cmb.F6, null);
        lkaVar.setTextSize(16);
        lkaVar.setGravity(jb6.a0 ? 5 : 3);
        addView(lkaVar);
        lka lkaVar2 = new lka(context);
        this.b = lkaVar2;
        anb.W(lkaVar2, cmb.H6, null);
        lkaVar2.setTextSize(16);
        lkaVar2.setGravity(jb6.a0 ? 3 : 5);
        addView(lkaVar2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.l6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i, int i2) {
        lka lkaVar = this.a;
        anb.W(lkaVar, i2, null);
        lkaVar.setTag(Integer.valueOf(i2));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.c;
        anb.s(imageView, i, null, mode);
        imageView.setTag(Integer.valueOf(i));
    }

    public final void b(int i, int i2, String str, boolean z) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int L = gm.L(i2);
        ImageView imageView = this.c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i);
        this.d = z;
        setWillNotDraw(!z);
    }

    public int getFullHeight() {
        return gm.L(56.0f);
    }

    public lka getTextView() {
        return this.a;
    }

    public lka getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            int i = this.e;
            if (i != 0) {
                cmb.k0.setColor(cmb.w0(null, i, false));
            }
            canvas.drawLine(gm.L(this.f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.e != 0 ? cmb.k0 : cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        lka lkaVar = this.b;
        int textHeight = (i5 - lkaVar.getTextHeight()) / 2;
        int L = jb6.a0 ? gm.L(24.0f) : 0;
        lkaVar.layout(L, textHeight, lkaVar.getMeasuredWidth() + L, lkaVar.getMeasuredHeight() + textHeight);
        lka lkaVar2 = this.a;
        int textHeight2 = (i5 - lkaVar2.getTextHeight()) / 2;
        int L2 = !jb6.a0 ? gm.L(this.f) : gm.L(24.0f);
        lkaVar2.layout(L2, textHeight2, lkaVar2.getMeasuredWidth() + L2, lkaVar2.getMeasuredHeight() + textHeight2);
        int L3 = gm.L(9.0f);
        boolean z2 = jb6.a0;
        ImageView imageView = this.c;
        int L4 = !z2 ? gm.L(21.0f) : (i6 - imageView.getMeasuredWidth()) - gm.L(21.0f);
        imageView.layout(L4, L3, imageView.getMeasuredWidth() + L4, imageView.getMeasuredHeight() + L3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gm.L(48.0f);
        this.b.measure(wi8.f(24.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
        this.a.measure(wi8.f(this.f + 24, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gm.L(20.0f), TLObject.FLAG_30));
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
