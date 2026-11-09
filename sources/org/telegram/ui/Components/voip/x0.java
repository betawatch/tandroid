package org.telegram.ui.Components.voip;

import a8.b8;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.cc1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class x0 extends TextView {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(h2 h2Var, Activity activity, i1 i1Var) {
        super(activity);
        this.d = h2Var;
        this.c = i1Var;
        this.b = new RectF();
        i1Var.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i7;
        int i10 = this.a;
        Object obj = this.c;
        FrameLayout frameLayout = this.d;
        Object obj2 = this.b;
        switch (i10) {
            case 0:
                Paint paint = (Paint) obj2;
                cc1 cc1Var = (cc1) frameLayout;
                x0 x0Var = cc1Var.c;
                cc1Var.P.k(-getX(), -getY(), cc1Var.getWidth() - getX(), cc1Var.getHeight() - getY());
                cc1Var.Q.k(-getX(), -getY(), cc1Var.getWidth() - getX(), cc1Var.getHeight() - getY());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[cc1Var.w].setAlpha(qs.e4);
                float L = org.telegram.messenger.g0.L(8.0f) + ((int) ((1.0f - cc1Var.D) * (org.telegram.messenger.g0.L(26.0f) - org.telegram.messenger.g0.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[cc1Var.w]);
                float f10 = cc1Var.s;
                if (f10 > 0.0f && (i7 = cc1Var.w + 1) < paintArr.length) {
                    paintArr[i7].setAlpha((int) (f10 * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[cc1Var.w + 1]);
                }
                float f11 = cc1Var.D;
                if (f11 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f11) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (cc1Var.O) {
                    canvas.drawText(id.M0(2131743240, null), getWidth() / 2, (int) ((getHeight() / 2) - ((x0Var.getPaint().ascent() + x0Var.getPaint().descent()) / 2.0f)), x0Var.getPaint());
                    break;
                }
                break;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                h2 h2Var = (h2) frameLayout;
                i1 i1Var = (i1) obj;
                i1Var.d(((View) h2Var.getParent()).getX() + h2Var.getX() + ((View) getParent()).getX() + getX(), ((View) h2Var.getParent()).getY() + h2Var.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), i1Var.b());
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                cc1 cc1Var = (cc1) this.d;
                b8 b8Var = cc1Var.P;
                super.onSizeChanged(i7, i10, i11, i12);
                int i13 = 0;
                while (true) {
                    Paint[] paintArr = (Paint[]) this.c;
                    if (i13 >= paintArr.length) {
                        break;
                    } else {
                        if (i13 == 0) {
                            paintArr[i13] = (Paint) b8Var.a;
                        } else if (i13 == 1) {
                            paintArr[i13] = (Paint) cc1Var.Q.a;
                        } else {
                            paintArr[i13] = (Paint) b8Var.a;
                        }
                        i13++;
                    }
                }
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(cc1 cc1Var, Context context) {
        super(context);
        this.d = cc1Var;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Paint[cc1Var.e.length];
        ra0 ra0Var = cc1Var.R;
        ra0Var.setBounds(0, 0, 80, 80);
        ra0 ra0Var2 = cc1Var.S;
        ra0Var2.setBounds(0, 0, 80, 80);
        b8 b8Var = cc1Var.P;
        b8Var.k(0.0f, 0.0f, 80.0f, 80.0f);
        b8 b8Var2 = cc1Var.Q;
        b8Var2.k(0.0f, 0.0f, 80.0f, 80.0f);
        ra0Var.setAlpha(qs.e4);
        ra0Var2.setAlpha(qs.e4);
        Canvas canvas = (Canvas) b8Var.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) b8Var2.b).drawColor(0, mode);
        ra0Var.draw((Canvas) b8Var.b);
        ra0Var2.draw((Canvas) b8Var2.b);
        paint.setColor(-1);
    }
}
