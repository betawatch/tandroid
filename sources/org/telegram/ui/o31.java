package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o31 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final Path a;
    public kg.d b;

    public o31(Activity activity) {
        super(activity);
        this.a = new Path();
    }

    @Override // org.telegram.ui.ActionBar.w5
    public final void d() {
        kg.d dVar = this.b;
        if (dVar != null) {
            dVar.u();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i9 - AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(kg.d dVar) {
        this.b = dVar;
        setBackground(dVar);
    }
}
