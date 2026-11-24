// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class m13 extends FrameLayout {
    public final jia a;
    public final ImageView b;
    public boolean c;
    public byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public m13(int i, wjb wjbVar, Context context) {
        super(context);
        this.d = i;
        jia jiaVar = new jia(context);
        this.a = jiaVar;
        jiaVar.setTextSize(16);
        jiaVar.setGravity(k96.a0 ? 5 : 3);
        int i2 = bkb.n6;
        zkb.W(jiaVar, i2, wjbVar);
        jiaVar.setTag(Integer.valueOf(i2));
        addView(jiaVar);
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
            canvas.drawLine(gl.L(this.d), getMeasuredHeight() - 1, gl.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L;
        int i5 = i3 - i;
        jia jiaVar = this.a;
        int textHeight = ((i4 - i2) - jiaVar.getTextHeight()) / 2;
        boolean z2 = k96.a0;
        ImageView imageView = this.b;
        if (z2) {
            L = (getMeasuredWidth() - jiaVar.getMeasuredWidth()) - gl.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        } else {
            L = gl.L(imageView.getVisibility() == 0 ? this.d : 25.0f);
        }
        jiaVar.layout(L, textHeight, jiaVar.getMeasuredWidth() + L, jiaVar.getMeasuredHeight() + textHeight);
        int L2 = !k96.a0 ? (gl.L(this.d) - imageView.getMeasuredWidth()) / 2 : (i5 - imageView.getMeasuredWidth()) - gl.L(25.0f);
        imageView.layout(L2, 0, imageView.getMeasuredWidth() + L2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        Typeface typeface = gl.a;
        this.a.measure(ug8.f(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(gl.L(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, gl.L(50.0f));
    }
}
