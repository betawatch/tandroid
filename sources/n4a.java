// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class n4a extends View {
    public final /* synthetic */ byte a = 0;
    public final Paint b;
    public final Object c;
    public final Object d;
    public final Object e;

    public n4a(Activity activity, vnb vnbVar) {
        super(activity);
        this.c = new fm0(380L, this, k43.h);
        this.b = new Paint(1);
        this.d = vnbVar;
        z7c z7cVar = new z7c(true);
        this.e = z7cVar;
        z7cVar.setCallback(this);
        z7cVar.b(-1);
        z7cVar.i = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        switch (this.a) {
            case 0:
                super.onAttachedToWindow();
                ((z7c) this.e).d();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        switch (this.a) {
            case 0:
                super.onDetachedFromWindow();
                ((z7c) this.e).e();
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                float width = getWidth() / 2.0f;
                float height = getHeight() / 2.0f;
                super.onDraw(canvas);
                int v0 = aob.v0(aob.Pe, (vnb) obj);
                Paint paint = this.b;
                paint.setColor(v0);
                canvas.drawCircle(width, height, hl.L(19.0f), paint);
                float f = ((fm0) obj2).e;
                float f2 = 1.0f - f;
                if (f2 > 0.0f) {
                    br3.b(canvas, (z7c) obj3, f2 * 1.35f);
                    invalidate();
                }
                if (f > 0.0f) {
                    float L = hl.L(6.666f) * f;
                    float L2 = hl.L(2.666f) * f;
                    canvas.drawRoundRect(width - L, height - L, width + L, height + L, L2, L2, aob.l0(-1));
                    break;
                }
                break;
            default:
                xpc xpcVar = (xpc) obj3;
                int Z0 = xpcVar.Z0();
                Paint paint2 = this.b;
                paint2.setColor(Z0);
                ViewGroup viewGroup = xpcVar.W1;
                int[] iArr = (int[]) obj2;
                viewGroup.getLocationInWindow(iArr);
                int[] iArr2 = (int[]) obj;
                getLocationInWindow(iArr2);
                float f3 = iArr[0] - iArr2[0];
                View view = ((vic) viewGroup).getViewPages()[0];
                if (view != null) {
                    i2 = view.getPaddingLeft();
                    i = view.getPaddingRight();
                } else {
                    i = 0;
                    i2 = 0;
                }
                canvas.save();
                canvas.clipRect(i2 + f3, 0.0f, (f3 + viewGroup.getWidth()) - i, getHeight());
                for (View view2 : ((vic) viewGroup).getViewPages()) {
                    if (view2 != null && view2.getVisibility() == 0) {
                        canvas.save();
                        canvas.translate(view2.getLeft() + (iArr[0] - iArr2[0]), view2.getTop() + (iArr[1] - iArr2[1]));
                        canvas.concat(view2.getMatrix());
                        canvas.drawRect(view2.getPaddingLeft(), 0.0f, view2.getWidth() - view2.getPaddingRight(), hl.L(100.0f) + view2.getHeight(), paint2);
                        canvas.restore();
                    }
                }
                canvas.restore();
                break;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i, i2, i3, i4);
                br3.d((z7c) this.e, i / 2.0f, i2 / 2.0f, 17);
                break;
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                return super.verifyDrawable(drawable) || (drawable == ((z7c) this.e) && !((fm0) this.c).f);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4a(xpc xpcVar, Context context) {
        super(context);
        this.e = xpcVar;
        this.b = new Paint(1);
        this.c = new int[2];
        this.d = new int[2];
    }
}
