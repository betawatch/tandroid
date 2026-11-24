// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class cg2 extends je5 {
    public final /* synthetic */ byte X0 = 0;
    public final Object Y0;
    public final Object Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg2(Activity activity) {
        super(activity, 3);
        int i = 0;
        this.Y0 = new oy8[2];
        this.Z0 = new int[2];
        p(true);
        this.L = Layout.Alignment.ALIGN_NORMAL;
        this.d = 3200L;
        this.U = true;
        this.e = true;
        m(8.0f, 6.0f, 10.0f, 6.0f);
        this.v0 = 0.0f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        while (i < 2) {
            ((oy8[]) this.Y0)[i] = new oy8(i == 0 ? R.raw.ticks_single : R.raw.ticks_double, gl.L(24.0f), gl.L(24.0f));
            ((oy8[]) this.Y0)[i].setCallback(this);
            if (i > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(new bg2(((oy8[]) this.Y0)[i]), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) k96.M0(i == 0 ? 2131749106 : 2131749107, null));
            i++;
        }
        t(spannableStringBuilder);
    }

    @Override // je5
    public final void c(Canvas canvas, float f) {
        switch (this.X0) {
            case 1:
                Paint paint = (Paint) this.Y0;
                lfc lfcVar = (lfc) this.Z0;
                paint.setShader(lfcVar.b().getShader());
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.G.getAlpha(), lfcVar.b().getAlpha()) * f), 31);
                Path path = this.F0;
                canvas.drawPath(path, paint);
                if (lfcVar.e) {
                    paint.setShader(((Paint) lfcVar.d.a).getShader());
                    canvas.drawPath(path, paint);
                }
                canvas.restore();
                break;
            default:
                super.c(canvas, f);
                break;
        }
    }

    @Override // je5, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.X0) {
            case 1:
                ((lfc) this.Z0).d(getX(), getY());
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // je5, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        switch (this.X0) {
            case 0:
                oy8[] oy8VarArr = (oy8[]) this.Y0;
                return (oy8VarArr != null && (drawable == oy8VarArr[0] || drawable == oy8VarArr[1])) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public cg2(Activity activity, int i, lfc lfcVar, boolean z) {
        super(activity, i);
        Paint paint = new Paint(1);
        this.Y0 = paint;
        this.Z0 = lfcVar;
        lfcVar.a(this);
        paint.setPathEffect(new CornerPathEffect(this.w));
        if (z) {
            j(true);
        }
    }
}
