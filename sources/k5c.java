// default package

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class k5c extends ColorDrawable {
    public final int a;
    public final wjb b;

    public k5c(int i, wjb wjbVar) {
        super(bkb.v0(i, wjbVar));
        this.a = i;
        this.b = wjbVar;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int v0 = bkb.v0(this.a, this.b);
        if (getColor() != v0) {
            setColor(v0);
        }
        super.draw(canvas);
    }
}
