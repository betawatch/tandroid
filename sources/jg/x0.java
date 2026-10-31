package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.qz0;
import vh.k4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x0 extends Drawable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ x0() {
        this.a = 3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.save();
                g6 g6Var = (g6) this.b;
                if (g6Var.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, g6Var.getBounds().centerX(), g6Var.getBounds().centerY());
                }
                g6Var.draw(canvas);
                canvas.restore();
                break;
            case 1:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((k4) this.b).draw(canvas);
                canvas.restore();
                break;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.f;
                    if (drawable != null) {
                        drawable.draw(canvas);
                        break;
                    }
                } else {
                    Drawable drawable2 = actionBarContainer.d;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.e;
                    if (drawable3 != null && actionBarContainer.n) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            case 3:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - org.telegram.messenger.i0.L(1.0f), (getBounds().width() - org.telegram.messenger.i0.L(8.0f)) / 2.0f, (Paint) this.b);
                break;
            case 4:
                Drawable[] drawableArr = (Drawable[]) this.b;
                for (int i10 = 0; i10 < drawableArr.length; i10++) {
                    drawableArr[i10].setBounds(getBounds());
                    drawableArr[i10].draw(canvas);
                }
                break;
            case 5:
                kg.k1 k1Var = (kg.k1) this.b;
                Rect bounds = getBounds();
                k1Var.getClass();
                k1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, k1Var.f);
                break;
            case 6:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.z0(getBounds());
                imageReceiver.h(canvas, null);
                break;
            case 7:
                ((qz0) this.b).c(getBounds().centerX() - (((qz0) this.b).c / 2.0f), getBounds().centerY(), 1.0f, t6.x0(null, t6.G6, false), canvas);
                break;
            case 8:
                canvas.save();
                vh.p2 p2Var = (vh.p2) this.b;
                canvas.drawPath(p2Var.t0, p2Var.b0);
                canvas.restore();
                break;
            default:
                canvas.save();
                canvas.translate(0.0f, org.telegram.messenger.i0.L(1.0f));
                xh.m2 m2Var = (xh.m2) this.b;
                m2Var.M0.setBounds(getBounds());
                m2Var.M0.draw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return ((k4) this.b).getHeight();
            case 4:
                return ((Drawable[]) this.b)[0].getIntrinsicHeight();
            case 6:
                return org.telegram.messenger.i0.L(30.0f);
            case 9:
                return org.telegram.messenger.i0.L(20.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return ((k4) this.b).getWidth();
            case 4:
                return ((Drawable[]) this.b)[0].getIntrinsicWidth();
            case 6:
                return org.telegram.messenger.i0.L(30.0f);
            case 9:
                return org.telegram.messenger.i0.L(20.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return ((g6) this.b).getOpacity();
            case 1:
                return -2;
            case 2:
                return 0;
            case 3:
                return 0;
            case 4:
                return -2;
            case 5:
                return -2;
            case 6:
                return -2;
            case 7:
                return -2;
            case 8:
                return -2;
            default:
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.a) {
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (!actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.d;
                    if (drawable != null) {
                        drawable.getOutline(outline);
                        break;
                    }
                } else if (actionBarContainer.f != null) {
                    actionBarContainer.d.getOutline(outline);
                    break;
                }
                break;
            default:
                super.getOutline(outline);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        switch (this.a) {
            case 0:
                ((g6) this.b).setAlpha(i10);
                break;
            case 1:
            case 2:
                break;
            case 3:
                ((Paint) this.b).setAlpha(i10);
                break;
            case 4:
                int i11 = 0;
                while (true) {
                    Drawable[] drawableArr = (Drawable[]) this.b;
                    if (i11 >= drawableArr.length) {
                        break;
                    } else {
                        drawableArr[i11].setAlpha(i10);
                        i11++;
                    }
                }
            case 5:
                break;
            case 6:
                ((ImageReceiver) this.b).setAlpha(i10 / 255.0f);
                break;
            case 7:
            case 8:
                break;
            default:
                ((xh.m2) this.b).M0.setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        switch (this.a) {
            case 0:
                ((g6) this.b).setBounds(rect);
                break;
            default:
                super.setBounds(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 0:
                ((g6) this.b).setColorFilter(colorFilter);
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                break;
            case 6:
                ((ImageReceiver) this.b).o1 = colorFilter;
                break;
            case 7:
            case 8:
                break;
            default:
                ((xh.m2) this.b).M0.setColorFilter(colorFilter);
                break;
        }
    }

    public /* synthetic */ x0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                ((g6) this.b).setBounds(i10, i11, i12, i13);
                break;
            default:
                super.setBounds(i10, i11, i12, i13);
                break;
        }
    }

    public x0(ActionBarContainer actionBarContainer) {
        this.a = 2;
        this.b = actionBarContainer;
    }

    public x0(Context context) {
        this.a = 4;
        this.b = new Drawable[]{r1, context.getResources().getDrawable(R.drawable.verified_check).mutate()};
        Drawable f7 = i0.a.f(context, R.drawable.verified_area);
        f7.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
    }

    public x0(String str) {
        this.a = 7;
        this.b = new qz0(str.substring(0, !str.isEmpty() ? 1 : 0), 14.0f, org.telegram.messenger.i0.o());
    }

    private final void a(int i10) {
    }

    private final void b(int i10) {
    }

    private final void c(int i10) {
    }

    private final void d(int i10) {
    }

    private final void e(int i10) {
    }

    private final void f(ColorFilter colorFilter) {
    }

    private final void g(ColorFilter colorFilter) {
    }

    private final void h(ColorFilter colorFilter) {
    }

    private final void i(ColorFilter colorFilter) {
    }

    private final void j(ColorFilter colorFilter) {
    }

    private final void k(ColorFilter colorFilter) {
    }

    private final void l(ColorFilter colorFilter) {
    }
}
