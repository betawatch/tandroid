// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class dh6 extends FrameLayout {
    public final jia a;
    public final jia b;
    public final ImageView c;
    public boolean d;
    public int e;
    public int f;

    public dh6(Context context) {
        super(context);
        this.e = 0;
        this.f = 71;
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        zkb.W(jiaVar, bkb.F6, null);
        jiaVar.setTextSize(16);
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        addView(jiaVar);
        jia jiaVar2 = new jia(context);
        this.b = jiaVar2;
        zkb.W(jiaVar2, bkb.H6, null);
        jiaVar2.setTextSize(16);
        jiaVar2.setGravity(k96.a0 ? 3 : 5);
        addView(jiaVar2);
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.l6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView);
    }

    public final void a(int i, int i2) {
        jia jiaVar = this.a;
        zkb.W(jiaVar, i2, null);
        jiaVar.setTag(Integer.valueOf(i2));
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ImageView imageView = this.c;
        zkb.s(imageView, i, null, mode);
        imageView.setTag(Integer.valueOf(i));
    }

    public final void b(int i, int i2, String str, boolean z) {
        this.a.l(str, false);
        this.b.setVisibility(4);
        int L = gl.L(i2);
        ImageView imageView = this.c;
        imageView.setPadding(0, L, 0, 0);
        imageView.setImageResource(i);
        this.d = z;
        setWillNotDraw(!z);
    }

    public int getFullHeight() {
        return gl.L(56.0f);
    }

    public jia getTextView() {
        return this.a;
    }

    public jia getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            int i = this.e;
            if (i != 0) {
                bkb.k0.setColor(bkb.w0(null, i, false));
            }
            canvas.drawLine(gl.L(this.f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, this.e != 0 ? bkb.k0 : bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i4 - i2;
        int i6 = i3 - i;
        jia jiaVar = this.b;
        int textHeight = (i5 - jiaVar.getTextHeight()) / 2;
        int L = k96.a0 ? gl.L(24.0f) : 0;
        jiaVar.layout(L, textHeight, jiaVar.getMeasuredWidth() + L, jiaVar.getMeasuredHeight() + textHeight);
        jia jiaVar2 = this.a;
        int textHeight2 = (i5 - jiaVar2.getTextHeight()) / 2;
        int L2 = !k96.a0 ? gl.L(this.f) : gl.L(24.0f);
        jiaVar2.layout(L2, textHeight2, jiaVar2.getMeasuredWidth() + L2, jiaVar2.getMeasuredHeight() + textHeight2);
        int L3 = gl.L(9.0f);
        boolean z2 = k96.a0;
        ImageView imageView = this.c;
        int L4 = !z2 ? gl.L(21.0f) : (i6 - imageView.getMeasuredWidth()) - gl.L(21.0f);
        imageView.layout(L4, L3, imageView.getMeasuredWidth() + L4, imageView.getMeasuredHeight() + L3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int L = gl.L(48.0f);
        this.b.measure(ug8.f(24.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
        this.a.measure(ug8.f(this.f + 24, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
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
