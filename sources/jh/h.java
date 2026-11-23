package jh;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import bg.t;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Wallet.p5;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h extends View {
    public final /* synthetic */ int a = 0;
    public final Paint b;
    public final Object c;
    public final Object d;
    public final Object e;

    public h(Activity activity, h6 h6Var) {
        super(activity);
        this.c = new te.a(this, nr.h, 380L);
        this.b = new Paint(1);
        this.d = h6Var;
        m41 m41Var = new m41(true);
        this.e = m41Var;
        m41Var.setCallback(this);
        m41Var.b(-1);
        m41Var.i = true;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                ((m41) this.e).d();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                ((m41) this.e).e();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = m6.w0(m6.Pe, (h6) this.d);
                Paint paint = this.b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, g0.L(19.0f), paint);
                float f10 = ((te.a) this.c).e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    t.b(canvas, (m41) this.e, f11 * 1.35f);
                    invalidate();
                }
                if (f10 > 0.0f) {
                    float L = g0.L(6.666f) * f10;
                    float L2 = g0.L(2.666f) * f10;
                    canvas.drawRoundRect(width - L, height - L, width + L, L + height, L2, L2, m6.n0(-1));
                    break;
                }
                break;
            default:
                p5 p5Var = (p5) this.e;
                int e12 = p5Var.e1();
                Paint paint2 = this.b;
                paint2.setColor(e12);
                ViewGroup viewGroup = p5Var.X1;
                int[] iArr = (int[]) this.c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f12 = iArr[0] - iArr2[0];
                View view = ((j71) p5Var.X1).getViewPages()[0];
                int paddingLeft = view != null ? view.getPaddingLeft() : 0;
                int paddingRight = view != null ? view.getPaddingRight() : 0;
                canvas.save();
                canvas.clipRect(paddingLeft + f12, 0.0f, (f12 + p5Var.X1.getWidth()) - paddingRight, getHeight());
                for (View view2 : ((j71) p5Var.X1).getViewPages()) {
                    if (view2 != null && view2.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view2.getLeft() + (iArr[0] - iArr2[0]), view2.getTop() + (iArr[1] - iArr2[1]));
                        canvas.concat(view2.getMatrix());
                        canvas.drawRect(view2.getPaddingLeft(), 0.0f, view2.getWidth() - view2.getPaddingRight(), g0.L(100.0f) + view2.getHeight(), paint2);
                        canvas.restore();
                    }
                }
                canvas.restore();
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i7, i10, i11, i12);
                t.d((m41) this.e, i7 / 2.0f, i10 / 2.0f, 17);
                break;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                return super.verifyDrawable(drawable) || (drawable == ((m41) this.e) && !((te.a) this.c).f);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p5 p5Var, Context context) {
        super(context);
        this.e = p5Var;
        this.b = new Paint(1);
        this.c = new int[2];
        this.d = new int[2];
    }
}
