package eh;

import android.graphics.Canvas;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.f7;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class f extends d {
    public final hh.a Y;

    public f(hh.a aVar) {
        this.Y = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10 = f7.b;
        if (this.w != i10) {
            this.w = i10;
            try {
                updateColors();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        m(canvas, this.Y);
    }

    @Override // eh.d
    public final hh.a s() {
        return this.Y;
    }
}
