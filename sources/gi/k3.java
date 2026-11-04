package gi;

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
import org.telegram.ui.Components.ly0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k3 extends Drawable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ k3() {
        this.a = 3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.save();
                l3 l3Var = (l3) this.b;
                canvas.drawPath(l3Var.F0, l3Var.c0);
                canvas.restore();
                break;
            case 1:
                canvas.save();
                canvas.translate(0.0f, org.telegram.messenger.g0.L(1.0f));
                ii.a3 a3Var = (ii.a3) this.b;
                a3Var.N0.setBounds(getBounds());
                a3Var.N0.draw(canvas);
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
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - org.telegram.messenger.g0.L(1.0f), (getBounds().width() - org.telegram.messenger.g0.L(8.0f)) / 2.0f, (Paint) this.b);
                break;
            case 4:
                Drawable[] drawableArr = (Drawable[]) this.b;
                for (int i3 = 0; i3 < drawableArr.length; i3++) {
                    drawableArr[i3].setBounds(getBounds());
                    drawableArr[i3].draw(canvas);
                }
                break;
            case 5:
                vg.x0 x0Var = (vg.x0) this.b;
                Rect bounds = getBounds();
                x0Var.getClass();
                x0Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, x0Var.f);
                break;
            case 6:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.z0(getBounds());
                imageReceiver.h(canvas, null);
                break;
            case 7:
                ((ly0) this.b).c(getBounds().centerX() - (((ly0) this.b).c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false), canvas);
                break;
            case 8:
                canvas.save();
                org.telegram.messenger.e6 e6Var = (org.telegram.messenger.e6) this.b;
                if (e6Var.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, e6Var.getBounds().centerX(), e6Var.getBounds().centerY());
                }
                e6Var.draw(canvas);
                canvas.restore();
                break;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((y5) this.b).draw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return org.telegram.messenger.g0.L(20.0f);
            case 4:
                return ((Drawable[]) this.b)[0].getIntrinsicHeight();
            case 6:
                return org.telegram.messenger.g0.L(30.0f);
            case 9:
                return ((y5) this.b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return org.telegram.messenger.g0.L(20.0f);
            case 4:
                return ((Drawable[]) this.b)[0].getIntrinsicWidth();
            case 6:
                return org.telegram.messenger.g0.L(30.0f);
            case 9:
                return ((y5) this.b).getWidth();
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return -2;
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
                return ((org.telegram.messenger.e6) this.b).getOpacity();
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
    public final void setAlpha(int i3) {
        switch (this.a) {
            case 1:
                ((ii.a3) this.b).N0.setAlpha(i3);
                break;
            case 3:
                ((Paint) this.b).setAlpha(i3);
                break;
            case 4:
                int i10 = 0;
                while (true) {
                    Drawable[] drawableArr = (Drawable[]) this.b;
                    if (i10 >= drawableArr.length) {
                        break;
                    } else {
                        drawableArr[i10].setAlpha(i3);
                        i10++;
                    }
                }
            case 6:
                ((ImageReceiver) this.b).setAlpha(i3 / 255.0f);
                break;
            case 8:
                ((org.telegram.messenger.e6) this.b).setAlpha(i3);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        switch (this.a) {
            case 8:
                ((org.telegram.messenger.e6) this.b).setBounds(rect);
                break;
            default:
                super.setBounds(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        switch (this.a) {
            case 1:
                ((ii.a3) this.b).N0.setColorFilter(colorFilter);
                break;
            case 6:
                ((ImageReceiver) this.b).p1 = colorFilter;
                break;
            case 8:
                ((org.telegram.messenger.e6) this.b).setColorFilter(colorFilter);
                break;
        }
    }

    public /* synthetic */ k3(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 8:
                ((org.telegram.messenger.e6) this.b).setBounds(i3, i10, i11, i12);
                break;
            default:
                super.setBounds(i3, i10, i11, i12);
                break;
        }
    }

    public k3(ActionBarContainer actionBarContainer) {
        this.a = 2;
        this.b = actionBarContainer;
    }

    public k3(Context context) {
        this.a = 4;
        this.b = new Drawable[]{r1, context.getResources().getDrawable(R.drawable.verified_check).mutate()};
        Drawable g7 = k2.p1.g(context, R.drawable.verified_area);
        g7.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
    }

    public k3(String str) {
        this.a = 7;
        this.b = new ly0(str.substring(0, !str.isEmpty() ? 1 : 0), 14.0f, org.telegram.messenger.g0.o());
    }

    private final void a(int i3) {
    }

    private final void b(int i3) {
    }

    private final void c(int i3) {
    }

    private final void d(int i3) {
    }

    private final void e(int i3) {
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
