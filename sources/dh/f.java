package dh;

import android.graphics.Canvas;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
