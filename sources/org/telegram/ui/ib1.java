package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.Crop.CropAreaView;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ib1 extends View {
    public ImageReceiver a;
    public ImageReceiver b;
    public View c;
    public org.telegram.ui.Components.df0 d;
    public Path e;
    public Drawable f;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = measuredWidth - AndroidUtilities.dp(46.0f);
        int dp2 = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.b.setImageCoords(dp2 - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f;
        drawable.setBounds(org.telegram.ui.Cells.c1.r(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.c(2, measuredHeight, drawable), org.telegram.ui.Cells.c1.v(2, measuredWidth, drawable), org.telegram.ui.Cells.c1.u(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(dp2, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.c != null) {
            float dp3 = AndroidUtilities.dp(60.0f);
            CropAreaView cropAreaView = this.d.b.a;
            float f7 = dp3 / cropAreaView.a;
            float top = (0.0f - this.d.getTop()) - cropAreaView.c;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(f7, f7, 0.0f, 0.0f);
            canvas.translate(left, top);
            canvas.translate((dp2 - AndroidUtilities.dp(30.0f)) / f7, (measuredHeight - AndroidUtilities.dp(30.0f)) / f7);
            PhotoViewer.t1().g4 = true;
            this.c.draw(canvas);
            PhotoViewer.t1().g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.c.invalidate();
        invalidate();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.onAttachedToWindow();
        this.b.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
        this.b.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), TLObject.FLAG_30));
    }
}
