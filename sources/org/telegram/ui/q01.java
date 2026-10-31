package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q01 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final Path a;
    public vg.f b;

    public q01(Activity activity) {
        super(activity);
        this.a = new Path();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(9.0f), i10 - org.telegram.messenger.i0.L(9.0f), i11 - org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(vg.f fVar) {
        this.b = fVar;
        setBackground(fVar);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        vg.f fVar = this.b;
        if (fVar != null) {
            fVar.updateColors();
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
