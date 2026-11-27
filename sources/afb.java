// default package

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class afb extends View {
    public ImageReceiver a;
    public ImageReceiver b;
    public View c;
    public k88 d;
    public Path e;
    public Drawable f;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - hl.L(30.0f);
        int L = measuredWidth - hl.L(46.0f);
        int L2 = hl.L(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(L - hl.L(30.0f), measuredHeight - hl.L(30.0f), hl.L(60.0f), hl.L(60.0f));
        this.b.i0(L2 - hl.L(30.0f), measuredHeight - hl.L(30.0f), hl.L(60.0f), hl.L(60.0f));
        Drawable drawable = this.f;
        drawable.setBounds(bp1.A(2, measuredWidth, drawable), bp1.y(2, measuredHeight, drawable), bp1.w(2, measuredWidth, drawable), bp1.i(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(L2, measuredHeight, hl.L(30.0f), Path.Direction.CW);
        imageReceiver.h(canvas, null);
        if (this.c != null) {
            float L3 = hl.L(60.0f);
            CropAreaView cropAreaView = this.d.b.a;
            float f = L3 / cropAreaView.a;
            float top = (0.0f - this.d.getTop()) - cropAreaView.c;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(f, f, 0.0f, 0.0f);
            canvas.translate(left, top);
            canvas.translate((L2 - hl.L(30.0f)) / f, (measuredHeight - hl.L(30.0f)) / f);
            PhotoViewer.q0().g4 = true;
            this.c.draw(canvas);
            PhotoViewer.q0().g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.c.invalidate();
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
        this.b.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        this.b.K();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        this.a.q0(hl.L(30.0f));
        this.b.q0(hl.L(30.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(86.0f), TLObject.FLAG_30));
    }
}
