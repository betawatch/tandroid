package fh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.yq0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e3 extends Drawable {
    public final /* synthetic */ int a;
    public final ShapeDrawable b;
    public final Rect c;

    public e3(vq0 vq0Var) {
        this.a = 0;
        this.b = org.telegram.ui.ActionBar.f6.c0(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), 0);
        this.c = new Rect();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                Rect bounds = getBounds();
                Rect rect = this.c;
                rect.set(bounds);
                rect.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                ShapeDrawable shapeDrawable = this.b;
                shapeDrawable.setBounds(rect);
                shapeDrawable.draw(canvas);
                break;
            default:
                Rect bounds2 = getBounds();
                Rect rect2 = this.c;
                rect2.set(bounds2);
                rect2.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
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
    public final void setAlpha(int i9) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(i9);
                break;
            default:
                this.b.setAlpha(i9);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        int i9 = this.a;
    }

    public e3(yq0 yq0Var) {
        this.a = 1;
        int dp = AndroidUtilities.dp(16.0f);
        int dp2 = AndroidUtilities.dp(16.0f);
        int i9 = org.telegram.ui.ActionBar.f6.d6;
        org.telegram.ui.ActionBar.b6 b6Var = yq0Var.c;
        this.b = org.telegram.ui.ActionBar.f6.c0(dp, dp2, org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(i9, b6Var), org.telegram.ui.ActionBar.f6.l1(0.04f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var))));
        this.c = new Rect();
    }

    private final void a(ColorFilter colorFilter) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
