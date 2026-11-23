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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class op extends hi.u3 {
    public final /* synthetic */ int X0 = 0;
    public final Object Y0;
    public final Object Z0;

    public op(Activity activity, int i7, org.telegram.ui.Components.voip.m1 m1Var, boolean z10) {
        super(activity, i7);
        Paint paint = new Paint(1);
        this.Y0 = paint;
        this.Z0 = m1Var;
        m1Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.w));
        if (z10) {
            k(true);
        }
    }

    @Override // hi.u3
    public void c(Canvas canvas, float f10) {
        switch (this.X0) {
            case 1:
                Paint paint = (Paint) this.Y0;
                org.telegram.ui.Components.voip.m1 m1Var = (org.telegram.ui.Components.voip.m1) this.Z0;
                paint.setShader(m1Var.b().getShader());
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.G.getAlpha(), m1Var.b().getAlpha()) * f10), 31);
                Path path = this.F0;
                canvas.drawPath(path, paint);
                if (m1Var.e) {
                    paint.setShader(((Paint) m1Var.d.a).getShader());
                    canvas.drawPath(path, paint);
                }
                canvas.restore();
                break;
            default:
                super.c(canvas, f10);
                break;
        }
    }

    @Override // hi.u3, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.X0) {
            case 1:
                ((org.telegram.ui.Components.voip.m1) this.Z0).d(getX(), getY());
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // hi.u3, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.X0) {
            case 0:
                nh0[] nh0VarArr = (nh0[]) this.Y0;
                return (nh0VarArr != null && (drawable == nh0VarArr[0] || drawable == nh0VarArr[1])) || super.verifyDrawable(drawable);
            default:
                return super.verifyDrawable(drawable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op(Activity activity) {
        super(activity, 3);
        int i7 = 0;
        this.Y0 = new nh0[2];
        this.Z0 = new int[2];
        r(true);
        this.L = Layout.Alignment.ALIGN_NORMAL;
        this.d = 3200L;
        this.U = true;
        this.e = true;
        n(8.0f, 6.0f, 10.0f, 6.0f);
        this.v0 = 0.0f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        while (i7 < 2) {
            ((nh0[]) this.Y0)[i7] = new nh0(i7 == 0 ? R.raw.ticks_single : R.raw.ticks_double, org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(24.0f));
            ((nh0[]) this.Y0)[i7].setCallback(this);
            if (i7 > 0) {
                spannableStringBuilder.append((CharSequence) "\n");
            }
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) "x");
            spannableStringBuilder.setSpan(new np(((nh0[]) this.Y0)[i7]), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) org.telegram.messenger.gd.N0(i7 == 0 ? 2131749105 : 2131749106, null));
            i7++;
        }
        v(spannableStringBuilder);
    }
}
