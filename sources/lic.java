// default package

import android.graphics.Canvas;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
