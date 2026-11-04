package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zo extends gi.l3 {
    public final /* synthetic */ int X0 = 0;
    public final Object Y0;
    public final Object Z0;

    public zo(Activity activity, int i3, org.telegram.ui.Components.voip.x0 x0Var, boolean z10) {
        super(activity, i3);
        Paint paint = new Paint(1);
        this.Y0 = paint;
        this.Z0 = x0Var;
        x0Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.w));
        if (z10) {
            k(true);
        }
    }

    @Override // gi.l3
    public void c(Canvas canvas, float f10) {
        switch (this.X0) {
            case 1:
                Paint paint = (Paint) this.Y0;
                org.telegram.ui.Components.voip.x0 x0Var = (org.telegram.ui.Components.voip.x0) this.Z0;
                paint.setShader(x0Var.b().getShader());
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.G.getAlpha(), x0Var.b().getAlpha()) * f10), 31);
                Path path = this.F0;
                canvas.drawPath(path, paint);
                if (x0Var.e) {
                    paint.setShader(((Paint) x0Var.d.a).getShader());
                    canvas.drawPath(path, paint);
                }
                canvas.restore();
                break;
            default:
                super.c(canvas, f10);
                break;
        }
    }

    @Override // gi.l3, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.X0) {
            case 1:
                ((org.telegram.ui.Components.voip.x0) this.Z0).d(getX(), getY());
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // gi.l3, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.X0) {
            case 0:
                ch0[] ch0VarArr = (ch0[]) this.Y0;
                return (ch0VarArr != null && (drawable == ch0VarArr[0] || drawable == ch0VarArr[1])) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(Activity activity) {
        super(activity, 3);
        int i3 = 0;
        this.Y0 = new ch0[2];
        this.Z0 = new int[2];
        r(true);
        this.L = Layout.Alignment.ALIGN_NORMAL;
        this.d = 3200L;
        this.U = true;
        this.e = true;
        n(8.0f, 6.0f, 10.0f, 6.0f);
        this.v0 = 0.0f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        while (i3 < 2) {
            ((ch0[]) this.Y0)[i3] = new ch0(i3 == 0 ? R.raw.ticks_single : R.raw.ticks_double, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            ((ch0[]) this.Y0)[i3].setCallback(this);
            if (i3 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(new yo(((ch0[]) this.Y0)[i3]), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(i3 == 0 ? 2131749306 : 2131749307, null));
            i3++;
        }
        u(spannableStringBuilder);
    }
}
