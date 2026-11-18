package bi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.gq0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class p5 extends Drawable {
    public final /* synthetic */ int a;
    public final ShapeDrawable b;
    public final Rect c;

    public p5(eq0 eq0Var) {
        this.a = 0;
        this.b = org.telegram.ui.ActionBar.n6.e0(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), 0);
        this.c = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.c;
                rect.set(bounds);
                rect.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable = this.b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                break;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.c;
                rect2.set(bounds2);
                rect2.inset(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(8.0f));
                ShapeDrawable shapeDrawable2 = this.b;
                shapeDrawable2.setBounds(rect2);
                shapeDrawable2.draw(canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i7);
                break;
            default:
                this.b.setAlpha(i7);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i7 = this.a;
    }

    public p5(gq0 gq0Var) {
        this.a = 1;
        int L = org.telegram.messenger.g0.L(16.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f);
        int i7 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.i6 i6Var = gq0Var.c;
        this.b = org.telegram.ui.ActionBar.n6.e0(L, L2, org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(i7, i6Var), org.telegram.ui.ActionBar.n6.r1(0.04f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, i6Var))));
        this.c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
