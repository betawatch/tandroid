package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.x71;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b5 extends View {
    public final /* synthetic */ int a = 1;
    public final Paint b;
    public final Object c;
    public final Object d;
    public final Object e;

    public b5(Activity activity, org.telegram.ui.ActionBar.p6 p6Var) {
        super(activity);
        this.c = new fe.b(this, gr.h, 380L);
        this.b = new Paint(1);
        this.d = p6Var;
        z41 z41Var = new z41(true);
        this.e = z41Var;
        z41Var.setCallback(this);
        z41Var.b(-1);
        z41Var.i = true;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 1:
                super.onAttachedToWindow();
                ((z41) this.e).d();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 1:
                super.onDetachedFromWindow();
                ((z41) this.e).e();
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
                c5 c5Var = (c5) this.e;
                int d12 = c5Var.d1();
                Paint paint = this.b;
                paint.setColor(d12);
                ViewGroup viewGroup = c5Var.T1;
                int[] iArr = (int[]) this.c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f7 = iArr[0] - iArr2[0];
                View view = ((x71) c5Var.T1).getViewPages()[0];
                int paddingLeft = view != null ? view.getPaddingLeft() : 0;
                int paddingRight = view != null ? view.getPaddingRight() : 0;
                canvas.save();
                canvas.clipRect(paddingLeft + f7, 0.0f, (f7 + c5Var.T1.getWidth()) - paddingRight, getHeight());
                for (View view2 : ((x71) c5Var.T1).getViewPages()) {
                    if (view2 != null && view2.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view2.getLeft() + (iArr[0] - iArr2[0]), view2.getTop() + (iArr[1] - iArr2[1]));
                        canvas.concat(view2.getMatrix());
                        canvas.drawRect(view2.getPaddingLeft(), 0.0f, view2.getWidth() - view2.getPaddingRight(), org.telegram.messenger.i0.L(100.0f) + view2.getHeight(), paint);
                        canvas.restore();
                    }
                }
                canvas.restore();
                break;
            default:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Me, (org.telegram.ui.ActionBar.p6) this.d);
                Paint paint2 = this.b;
                paint2.setColor(w02);
                canvas.drawCircle(width, height, org.telegram.messenger.i0.L(19.0f), paint2);
                float f10 = ((fe.b) this.c).e;
                float f11 = 1.0f - f10;
                if (f11 > 0.0f) {
                    rf.o.b(canvas, (z41) this.e, f11 * 1.35f);
                    invalidate();
                }
                if (f10 > 0.0f) {
                    float L = org.telegram.messenger.i0.L(6.666f) * f10;
                    float L2 = org.telegram.messenger.i0.L(2.666f) * f10;
                    canvas.drawRoundRect(width - L, height - L, width + L, height + L, L2, L2, org.telegram.ui.ActionBar.t6.n0(-1));
                    break;
                }
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                rf.o.d((z41) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 1:
                return super.verifyDrawable(drawable) || (drawable == ((z41) this.e) && !((fe.b) this.c).f);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(c5 c5Var, Context context) {
        super(context);
        this.e = c5Var;
        this.b = new Paint(1);
        this.c = new int[2];
        this.d = new int[2];
    }
}
