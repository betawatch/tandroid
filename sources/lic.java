// default package

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class lic extends View {
    public cka a;
    public boolean b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        cka ckaVar;
        if (this.b || (ckaVar = this.a) == null) {
            return;
        }
        ckaVar.b(canvas, this);
    }

    public void setState(boolean z) {
        this.b = z;
        invalidate();
    }
}
