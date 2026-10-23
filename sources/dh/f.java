package dh;

import android.graphics.Canvas;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final class f extends d {
    public final gh.a X;

    public f(gh.a aVar) {
        this.X = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10 = r6.b;
        if (this.s != i10) {
            this.s = i10;
            try {
                updateColors();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        c(canvas, this.X);
    }

    @Override // dh.d
    public final gh.a i() {
        return this.X;
    }
}
