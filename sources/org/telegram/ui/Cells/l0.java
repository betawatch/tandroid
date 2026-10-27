package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class l0 extends Drawable {
    public final /* synthetic */ int a;
    public final Paint b;
    public final Object c;
    public final /* synthetic */ Object d;

    public l0(s1 s1Var, int[] iArr, Paint paint) {
        this.a = 0;
        this.c = s1Var;
        this.d = iArr;
        this.b = paint;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                s1 s1Var = (s1) this.c;
                int v = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.ra, s1Var.Id), org.telegram.ui.ActionBar.y6.o1(0.5f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.y6, s1Var.Id)));
                int[] iArr = (int[]) this.d;
                int i10 = iArr[0];
                Paint paint = this.b;
                if (v != i10) {
                    int alpha = paint.getAlpha();
                    iArr[0] = v;
                    paint.setColor(v);
                    paint.setAlpha(alpha);
                }
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), getBounds().width() / 2.0f, paint);
                break;
            default:
                Rect bounds = getBounds();
                float dp = AndroidUtilities.dp(25.0f);
                float f7 = bounds.top;
                nr0 nr0Var = (nr0) this.d;
                float min = Math.min(f7, nr0Var.n - nr0Var.b.getY());
                int themedColor = nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.h5);
                Paint paint2 = this.b;
                paint2.setColor(themedColor);
                Path path = (Path) this.c;
                path.rewind();
                path.addRoundRect(bounds.left, min, bounds.right, bounds.bottom + dp, dp, dp, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(bounds);
                canvas.drawPath(path, paint2);
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -2;
            default:
                return -3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                this.b.setAlpha(org.telegram.ui.ActionBar.y6.o1(i10 / 255.0f, ((int[]) this.d)[0]));
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                this.b.setColorFilter(colorFilter);
                break;
        }
    }

    public l0(nr0 nr0Var) {
        this.a = 1;
        this.d = nr0Var;
        this.b = new Paint(1);
        this.c = new Path();
    }

    private final void a(int i10) {
    }

    private final void b(ColorFilter colorFilter) {
    }
}
