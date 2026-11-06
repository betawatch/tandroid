package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class k51 extends View {
    public ImageReceiver a;
    public ImageReceiver b;
    public View c;
    public org.telegram.ui.Components.fd0 d;
    public Path e;
    public Drawable f;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(30.0f);
        int L = measuredWidth - org.telegram.messenger.g0.L(46.0f);
        int L2 = org.telegram.messenger.g0.L(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(L - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        this.b.y0(L2 - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        Drawable drawable = this.f;
        drawable.setBounds(org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.y(2, measuredHeight, drawable), org.telegram.ui.Cells.f1.w(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.f(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(L2, measuredHeight, org.telegram.messenger.g0.L(30.0f), Path.Direction.CW);
        imageReceiver.h(canvas, null);
        if (this.c != null) {
            float L3 = org.telegram.messenger.g0.L(60.0f);
            CropAreaView cropAreaView = this.d.b.a;
            float f10 = L3 / cropAreaView.a;
            float top = (0.0f - this.d.getTop()) - cropAreaView.c;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(f10, f10, 0.0f, 0.0f);
            canvas.translate(left, top);
            canvas.translate((L2 - org.telegram.messenger.g0.L(30.0f)) / f10, (measuredHeight - org.telegram.messenger.g0.L(30.0f)) / f10);
            PhotoViewer.p1().f4 = true;
            this.c.draw(canvas);
            PhotoViewer.p1().f4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.c.invalidate();
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.P();
        this.b.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.R();
        this.b.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a.J0(org.telegram.messenger.g0.L(30.0f));
        this.b.J0(org.telegram.messenger.g0.L(30.0f));
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), TLObject.FLAG_30));
    }
}
