package jh;

import ag.v;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Wallet.m4;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class h extends View {
    public final /* synthetic */ int a = 0;
    public final Paint b;
    public final Object c;
    public final Object d;
    public final Object e;

    public h(Activity activity, u6 u6Var) {
        super(activity);
        this.c = new oe.b(this, ds.h, 380L);
        this.b = new Paint(1);
        this.d = u6Var;
        r61 r61Var = new r61(true);
        this.e = r61Var;
        r61Var.setCallback(this);
        r61Var.b(-1);
        r61Var.i = true;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                ((r61) this.e).d();
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
                ((r61) this.e).e();
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
                int w02 = y6.w0(y6.Yd, (u6) this.d);
                Paint paint = this.b;
                paint.setColor(w02);
                canvas.drawCircle(width, height, AndroidUtilities.dp(19.0f), paint);
                float f7 = ((oe.b) this.c).e;
                float f10 = 1.0f - f7;
                if (f10 > 0.0f) {
                    v.b(canvas, (r61) this.e, f10 * 1.35f);
                    invalidate();
                }
                if (f7 > 0.0f) {
                    float dp = AndroidUtilities.dp(6.666f) * f7;
                    float dp2 = AndroidUtilities.dp(2.666f) * f7;
                    canvas.drawRoundRect(width - dp, height - dp, width + dp, dp + height, dp2, dp2, y6.m0(-1));
                    break;
                }
                break;
            default:
                m4 m4Var = (m4) this.e;
                m4Var.getClass();
                int themedColor = m4Var.getThemedColor(y6.d6);
                Paint paint2 = this.b;
                paint2.setColor(themedColor);
                ViewGroup viewGroup = m4Var.b0;
                int[] iArr = (int[]) this.c;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) this.d;
                getLocationInWindow(iArr2);
                float f11 = iArr[0] - iArr2[0];
                View view = ((u91) m4Var.b0).getViewPages()[0];
                int paddingLeft = view != null ? view.getPaddingLeft() : 0;
                int paddingRight = view != null ? view.getPaddingRight() : 0;
                canvas.save();
                canvas.clipRect(paddingLeft + f11, 0.0f, (f11 + m4Var.b0.getWidth()) - paddingRight, getHeight());
                for (View view2 : ((u91) m4Var.b0).getViewPages()) {
                    if (view2 != null && view2.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view2.getLeft() + (iArr[0] - iArr2[0]), view2.getTop() + (iArr[1] - iArr2[1]));
                        canvas.concat(view2.getMatrix());
                        canvas.drawRect(view2.getPaddingLeft(), 0.0f, view2.getWidth() - view2.getPaddingRight(), AndroidUtilities.dp(100.0f) + view2.getHeight(), paint2);
                        canvas.restore();
                    }
                }
                canvas.restore();
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                v.d((r61) this.e, i10 / 2.0f, i11 / 2.0f, 17);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                return super.verifyDrawable(drawable) || (drawable == ((r61) this.e) && !((oe.b) this.c).f);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m4 m4Var, Context context) {
        super(context);
        this.e = m4Var;
        this.b = new Paint(1);
        this.c = new int[2];
        this.d = new int[2];
    }
}
