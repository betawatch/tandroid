package dg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.k01;
import ph.k5;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k1 extends Drawable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ k1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.save();
                Drawable drawable = (Drawable) this.b;
                if (drawable.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable.getBounds().centerX(), drawable.getBounds().centerY());
                }
                drawable.draw(canvas);
                canvas.restore();
                break;
            case 1:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((k5) this.b).draw(canvas);
                canvas.restore();
                break;
            case 2:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (!actionBarContainer.h) {
                    Drawable drawable2 = actionBarContainer.d;
                    if (drawable2 != null) {
                        drawable2.draw(canvas);
                    }
                    Drawable drawable3 = actionBarContainer.e;
                    if (drawable3 != null && actionBarContainer.n) {
                        drawable3.draw(canvas);
                        break;
                    }
                } else {
                    Drawable drawable4 = actionBarContainer.f;
                    if (drawable4 != null) {
                        drawable4.draw(canvas);
                        break;
                    }
                }
                break;
            case 3:
                eg.q1 q1Var = (eg.q1) this.b;
                Rect bounds = getBounds();
                q1Var.getClass();
                q1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, q1Var.f);
                break;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                break;
            case 5:
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), AndroidUtilities.dp(18.0f), ((Switch) this.b).G);
                break;
            case 6:
                ((k01) this.b).c(getBounds().centerX() - (((k01) this.b).c / 2.0f), getBounds().centerY(), 1.0f, j6.w0(null, j6.G6, false), canvas);
                break;
            case 7:
                canvas.save();
                ph.f3 f3Var = (ph.f3) this.b;
                canvas.drawPath(f3Var.q0, f3Var.V);
                canvas.restore();
                break;
            default:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                rh.p2 p2Var = (rh.p2) this.b;
                p2Var.F0.setBounds(getBounds());
                p2Var.F0.draw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return ((k5) this.b).getHeight();
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return AndroidUtilities.dp(20.0f);
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return ((k5) this.b).getWidth();
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return AndroidUtilities.dp(20.0f);
            default:
                return super.getIntrinsicWidth();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return ((Drawable) this.b).getOpacity();
            case 1:
                return -2;
            case 2:
                return 0;
            case 3:
                return -2;
            case 4:
                return -2;
            case 5:
                return 0;
            case 6:
                return -2;
            case 7:
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
                ((Drawable) this.b).setAlpha(i10);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                ((ImageReceiver) this.b).setAlpha(i10 / 255.0f);
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                ((rh.p2) this.b).F0.setAlpha(i10);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        switch (this.a) {
            case 0:
                ((Drawable) this.b).setBounds(rect);
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
                ((Drawable) this.b).setColorFilter(colorFilter);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
                ((ImageReceiver) this.b).setColorFilter(colorFilter);
                break;
            case 5:
            case 6:
            case 7:
                break;
            default:
                ((rh.p2) this.b).F0.setColorFilter(colorFilter);
                break;
        }
    }

    public k1(ActionBarContainer actionBarContainer) {
        this.a = 2;
        this.b = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                ((Drawable) this.b).setBounds(i10, i11, i12, i13);
                break;
            default:
                super.setBounds(i10, i11, i12, i13);
                break;
        }
    }

    public k1(String str) {
        this.a = 6;
        this.b = new k01(str.substring(0, !str.isEmpty() ? 1 : 0), 14.0f, AndroidUtilities.bold());
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

    private final void f(int i10) {
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
