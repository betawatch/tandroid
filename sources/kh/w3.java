package kh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.nz0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class w3 extends Drawable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ w3(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.save();
                x3 x3Var = (x3) this.b;
                canvas.drawPath(x3Var.p0, x3Var.U);
                canvas.restore();
                break;
            case 1:
                ActionBarContainer actionBarContainer = (ActionBarContainer) this.b;
                if (!actionBarContainer.h) {
                    Drawable drawable = actionBarContainer.d;
                    if (drawable != null) {
                        drawable.draw(canvas);
                    }
                    Drawable drawable2 = actionBarContainer.e;
                    if (drawable2 != null && actionBarContainer.n) {
                        drawable2.draw(canvas);
                        break;
                    }
                } else {
                    Drawable drawable3 = actionBarContainer.f;
                    if (drawable3 != null) {
                        drawable3.draw(canvas);
                        break;
                    }
                }
                break;
            case 2:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                mh.c3 c3Var = (mh.c3) this.b;
                c3Var.E0.setBounds(getBounds());
                c3Var.E0.draw(canvas);
                canvas.restore();
                break;
            case 3:
                zf.z0 z0Var = (zf.z0) this.b;
                Rect bounds = getBounds();
                z0Var.getClass();
                z0Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, z0Var.f);
                break;
            case 4:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                break;
            case 5:
                Rect bounds2 = getBounds();
                canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), AndroidUtilities.dp(18.0f), ((Switch) this.b).F);
                break;
            case 6:
                ((nz0) this.b).c(getBounds().centerX() - (((nz0) this.b).c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false), canvas);
                break;
            case 7:
                canvas.save();
                Drawable drawable4 = (Drawable) this.b;
                if (drawable4.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, drawable4.getBounds().centerX(), drawable4.getBounds().centerY());
                }
                drawable4.draw(canvas);
                canvas.restore();
                break;
            default:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((r6) this.b).draw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 2:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((r6) this.b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 2:
                return AndroidUtilities.dp(20.0f);
            case 4:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((r6) this.b).getWidth();
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
                return 0;
            case 2:
                return -2;
            case 3:
                return -2;
            case 4:
                return -2;
            case 5:
                return 0;
            case 6:
                return -2;
            case 7:
                return ((Drawable) this.b).getOpacity();
            default:
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        switch (this.a) {
            case 1:
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
    public final void setAlpha(int i9) {
        switch (this.a) {
            case 2:
                ((mh.c3) this.b).E0.setAlpha(i9);
                break;
            case 4:
                ((ImageReceiver) this.b).setAlpha(i9 / 255.0f);
                break;
            case 7:
                ((Drawable) this.b).setAlpha(i9);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        switch (this.a) {
            case 7:
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
            case 2:
                ((mh.c3) this.b).E0.setColorFilter(colorFilter);
                break;
            case 4:
                ((ImageReceiver) this.b).setColorFilter(colorFilter);
                break;
            case 7:
                ((Drawable) this.b).setColorFilter(colorFilter);
                break;
        }
    }

    public w3(ActionBarContainer actionBarContainer) {
        this.a = 1;
        this.b = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 7:
                ((Drawable) this.b).setBounds(i9, i10, i11, i12);
                break;
            default:
                super.setBounds(i9, i10, i11, i12);
                break;
        }
    }

    public w3(String str) {
        this.a = 6;
        this.b = new nz0(str.substring(0, !str.isEmpty() ? 1 : 0), 14.0f, AndroidUtilities.bold());
    }

    private final void a(int i9) {
    }

    private final void b(int i9) {
    }

    private final void c(int i9) {
    }

    private final void d(int i9) {
    }

    private final void e(int i9) {
    }

    private final void f(int i9) {
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
