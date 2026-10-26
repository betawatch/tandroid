package fi;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.q11;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class u3 extends Drawable {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ u3() {
        this.a = 3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        switch (this.a) {
            case 0:
                canvas.save();
                v3 v3Var = (v3) this.b;
                canvas.drawPath(v3Var.t0, v3Var.b0);
                canvas.restore();
                break;
            case 1:
                canvas.save();
                canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                hi.m3 m3Var = (hi.m3) this.b;
                m3Var.M0.setBounds(getBounds());
                m3Var.M0.draw(canvas);
                canvas.restore();
                break;
            case 2:
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
            case 3:
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY() - AndroidUtilities.dp(1.0f), (getBounds().width() - AndroidUtilities.dp(8.0f)) / 2.0f, (Paint) this.b);
                break;
            case 4:
                tg.a1 a1Var = (tg.a1) this.b;
                Rect bounds = getBounds();
                a1Var.getClass();
                a1Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, a1Var.f);
                break;
            case 5:
                ImageReceiver imageReceiver = (ImageReceiver) this.b;
                imageReceiver.setImageCoords(getBounds());
                imageReceiver.draw(canvas);
                break;
            case 6:
                ((q11) this.b).c(getBounds().centerX() - (((q11) this.b).c / 2.0f), getBounds().centerY(), 1.0f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G6, false), canvas);
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
                ((o6) this.b).draw(canvas);
                canvas.restore();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 5:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((o6) this.b).getHeight();
            default:
                return super.getIntrinsicHeight();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return AndroidUtilities.dp(20.0f);
            case 5:
                return AndroidUtilities.dp(30.0f);
            case 8:
                return ((o6) this.b).getWidth();
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
                return ((Drawable) this.b).getOpacity();
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
            case 1:
                ((hi.m3) this.b).M0.setAlpha(i10);
                break;
            case 3:
                ((Paint) this.b).setAlpha(i10);
                break;
            case 5:
                ((ImageReceiver) this.b).setAlpha(i10 / 255.0f);
                break;
            case 7:
                ((Drawable) this.b).setAlpha(i10);
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
            case 1:
                ((hi.m3) this.b).M0.setColorFilter(colorFilter);
                break;
            case 5:
                ((ImageReceiver) this.b).setColorFilter(colorFilter);
                break;
            case 7:
                ((Drawable) this.b).setColorFilter(colorFilter);
                break;
        }
    }

    public /* synthetic */ u3(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 7:
                ((Drawable) this.b).setBounds(i10, i11, i12, i13);
                break;
            default:
                super.setBounds(i10, i11, i12, i13);
                break;
        }
    }

    public u3(ActionBarContainer actionBarContainer) {
        this.a = 2;
        this.b = actionBarContainer;
    }

    public u3(String str) {
        this.a = 6;
        this.b = new q11(str.substring(0, !str.isEmpty() ? 1 : 0), 14.0f, AndroidUtilities.bold());
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
}
