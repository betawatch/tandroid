// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class f6 extends Drawable {
    public final /* synthetic */ byte a;
    public final Object b;

    public f6(Context context) {
        this.a = (byte) 2;
        this.b = new Drawable[]{r4, context.getResources().getDrawable(R.drawable.verified_check).mutate()};
        Drawable d = b10.d(context, R.drawable.verified_area);
        d.setColorFilter(new PorterDuffColorFilter(-9063442, PorterDuff.Mode.MULTIPLY));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ActionBarContainer actionBarContainer = (ActionBarContainer) obj;
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
            case 1:
                canvas.save();
                canvas.translate(0.0f, gm.L(1.0f));
                wx0 wx0Var = (wx0) obj;
                wx0Var.N0.setBounds(getBounds());
                wx0Var.N0.draw(canvas);
                canvas.restore();
                break;
            case 2:
                Drawable[] drawableArr = (Drawable[]) obj;
                for (int i = 0; i < drawableArr.length; i++) {
                    drawableArr[i].setBounds(getBounds());
                    drawableArr[i].draw(canvas);
                }
                break;
            case 3:
                nj8 nj8Var = (nj8) obj;
                Rect bounds = getBounds();
                nj8Var.d(bounds.left, 0.0f, bounds.top, bounds.right, 0.0f, bounds.bottom);
                canvas.drawCircle(getBounds().centerX(), getBounds().centerY(), Math.min(getBounds().width(), getBounds().height()) / 2.0f, nj8Var.f);
                break;
            case 4:
                canvas.save();
                hg5 hg5Var = (hg5) obj;
                canvas.drawPath(hg5Var.F0, hg5Var.c0);
                canvas.restore();
                break;
            case 5:
                canvas.save();
                cw3 cw3Var = (cw3) obj;
                if (cw3Var.getBounds() != null) {
                    canvas.scale(0.8333333f, 0.8333333f, cw3Var.getBounds().centerX(), cw3Var.getBounds().centerY());
                }
                cw3Var.draw(canvas);
                canvas.restore();
                break;
            case 6:
                canvas.save();
                canvas.translate(getBounds().left, getBounds().top);
                ((k9b) obj).draw(canvas);
                canvas.restore();
                break;
            case 7:
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                imageReceiver.j0(getBounds());
                imageReceiver.h(canvas, null);
                break;
            default:
                ((uib) obj).c(getBounds().centerX() - (((uib) obj).c / 2.0f), getBounds().centerY(), 1.0f, cmb.w0(null, cmb.F6, false), canvas);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        switch (this.a) {
            case 1:
                return gm.L(20.0f);
            case 2:
                return ((Drawable[]) this.b)[0].getIntrinsicHeight();
            case 3:
            case 4:
            case 5:
            default:
                return super.getIntrinsicHeight();
            case 6:
                return ((k9b) this.b).getHeight();
            case 7:
                return gm.L(30.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        switch (this.a) {
            case 1:
                return gm.L(20.0f);
            case 2:
                return ((Drawable[]) this.b)[0].getIntrinsicWidth();
            case 3:
            case 4:
            case 5:
            default:
                return super.getIntrinsicWidth();
            case 6:
                return ((k9b) this.b).getWidth();
            case 7:
                return gm.L(30.0f);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        switch (this.a) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
                return -2;
            case 5:
                return ((cw3) this.b).getOpacity();
            case 6:
            case 7:
            default:
                return -2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        switch (this.a) {
            case 0:
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
    public final void setAlpha(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((wx0) obj).N0.setAlpha(i);
                break;
            case 2:
                int i2 = 0;
                while (true) {
                    Drawable[] drawableArr = (Drawable[]) obj;
                    if (i2 >= drawableArr.length) {
                        break;
                    } else {
                        drawableArr[i2].setAlpha(i);
                        i2++;
                    }
                }
            case 5:
                ((cw3) obj).setAlpha(i);
                break;
            case 7:
                ((ImageReceiver) obj).setAlpha(i / 255.0f);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        switch (this.a) {
            case 5:
                ((cw3) this.b).setBounds(rect);
                break;
            default:
                super.setBounds(rect);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((wx0) obj).N0.setColorFilter(colorFilter);
                break;
            case 5:
                ((cw3) obj).setColorFilter(colorFilter);
                break;
            case 7:
                ((ImageReceiver) obj).p1 = colorFilter;
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 5:
                ((cw3) this.b).setBounds(i, i2, i3, i4);
                break;
            default:
                super.setBounds(i, i2, i3, i4);
                break;
        }
    }

    private final void a(int i) {
    }

    private final void b(int i) {
    }

    private final void c(int i) {
    }

    private final void d(int i) {
    }

    private final void e(int i) {
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

    public f6(ActionBarContainer actionBarContainer) {
        this.a = (byte) 0;
        this.b = actionBarContainer;
    }

    public /* synthetic */ f6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public f6(String str) {
        this.a = (byte) 8;
        this.b = new uib(str.substring(0, !str.isEmpty() ? 1 : 0), 14.0f, gm.o());
    }
}
