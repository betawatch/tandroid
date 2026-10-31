package org.telegram.ui.Wallet;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.y41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        y41 y41Var = new y41(true);
        this.e = y41Var;
        y41Var.setCallback(this);
        y41Var.b(-1);
        y41Var.i = true;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 1:
                super.onAttachedToWindow();
                ((y41) this.e).d();
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
                ((y41) this.e).e();
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
                View view = ((w71) c5Var.T1).getViewPages()[0];
                int paddingLeft = view != null ? view.getPaddingLeft() : 0;
                int paddingRight = view != null ? view.getPaddingRight() : 0;
                canvas.save();
                canvas.clipRect(paddingLeft + f7, 0.0f, (f7 + c5Var.T1.getWidth()) - paddingRight, getHeight());
                for (View view2 : ((w71) c5Var.T1).getViewPages()) {
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
                    rf.o.b(canvas, (y41) this.e, f11 * 1.35f);
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
                rf.o.d((y41) this.e, i10 / 2.0f, i11 / 2.0f, 17);
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
                return super.verifyDrawable(drawable) || (drawable == ((y41) this.e) && !((fe.b) this.c).f);
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
