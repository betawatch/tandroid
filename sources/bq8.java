// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bq8 extends Drawable {
    public final /* synthetic */ byte a;
    public final ShapeDrawable b;
    public final Rect c;

    public bq8(nca ncaVar) {
        this.a = (byte) 1;
        int L = gl.L(16.0f);
        int L2 = gl.L(16.0f);
        int i = bkb.c6;
        wjb wjbVar = ncaVar.c;
        this.b = bkb.c0(L, L2, bkb.v(bkb.v0(i, wjbVar), bkb.p1(0.04f, bkb.v0(bkb.F6, wjbVar))));
        this.c = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        ShapeDrawable shapeDrawable = this.b;
        Rect rect = this.c;
        switch (b) {
            case 0:
                rect.set(getBounds());
                rect.inset(gl.L(2.0f), gl.L(8.0f));
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                break;
            default:
                rect.set(getBounds());
                rect.inset(gl.L(2.0f), gl.L(8.0f));
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        byte b = this.a;
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i);
                break;
            default:
                this.b.setAlpha(i);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }

    public bq8(lca lcaVar) {
        this.a = (byte) 0;
        this.b = bkb.c0(gl.L(16.0f), gl.L(16.0f), 0);
        this.c = new Rect();
    }
}
