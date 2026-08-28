package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vw extends FrameLayout {
    public final /* synthetic */ wy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw(wy wyVar, Context context) {
        super(context);
        this.a = wyVar;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        wy wyVar = this.a;
        vv vvVar = wyVar.E;
        wv wvVar = wyVar.R;
        ww wwVar = wyVar.L;
        if (view != wwVar && view != wvVar) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        float y10 = vvVar.getY() + vvVar.getMeasuredHeight() + 1.0f;
        if (view == wwVar && wvVar != null) {
            y10 = Math.max(y10, wvVar.getY() + wvVar.getMeasuredHeight() + 1.0f);
        }
        canvas.clipRect(0.0f, y10 - (AndroidUtilities.dp(16.0f) * wyVar.b.e), getMeasuredWidth(), getMeasuredHeight());
        boolean drawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return drawChild;
    }
}
