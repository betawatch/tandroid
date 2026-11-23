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
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.Components.za0;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class b1 extends TextView {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(l2 l2Var, Activity activity, m1 m1Var) {
        super(activity);
        this.d = l2Var;
        this.c = m1Var;
        this.b = new RectF();
        m1Var.a(this);
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
                zb1 zb1Var = (zb1) frameLayout;
                b1 b1Var = zb1Var.c;
                zb1Var.Q.k(-getX(), -getY(), zb1Var.getWidth() - getX(), zb1Var.getHeight() - getY());
                zb1Var.R.k(-getX(), -getY(), zb1Var.getWidth() - getX(), zb1Var.getHeight() - getY());
                RectF rectF = org.telegram.messenger.g0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[zb1Var.w].setAlpha(ks.e4);
                float L = org.telegram.messenger.g0.L(8.0f) + ((int) ((1.0f - zb1Var.E) * (org.telegram.messenger.g0.L(26.0f) - org.telegram.messenger.g0.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[zb1Var.w]);
                float f10 = zb1Var.s;
                if (f10 > 0.0f && (i7 = zb1Var.w + 1) < paintArr.length) {
                    paintArr[i7].setAlpha((int) (f10 * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[zb1Var.w + 1]);
                }
                float f11 = zb1Var.E;
                if (f11 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f11) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (zb1Var.P) {
                    canvas.drawText(gd.N0(2131742990, null), getWidth() / 2, (int) ((getHeight() / 2) - ((b1Var.getPaint().ascent() + b1Var.getPaint().descent()) / 2.0f)), b1Var.getPaint());
                    break;
                }
                break;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                l2 l2Var = (l2) frameLayout;
                m1 m1Var = (m1) obj;
                m1Var.d(((View) l2Var.getParent()).getX() + l2Var.getX() + ((View) getParent()).getX() + getX(), ((View) l2Var.getParent()).getY() + l2Var.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), m1Var.b());
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                zb1 zb1Var = (zb1) this.d;
                b8 b8Var = zb1Var.Q;
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
                            paintArr[i13] = (Paint) zb1Var.R.a;
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
    public b1(zb1 zb1Var, Context context) {
        super(context);
        this.d = zb1Var;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Paint[zb1Var.e.length];
        za0 za0Var = zb1Var.S;
        za0Var.setBounds(0, 0, 80, 80);
        za0 za0Var2 = zb1Var.T;
        za0Var2.setBounds(0, 0, 80, 80);
        b8 b8Var = zb1Var.Q;
        b8Var.k(0.0f, 0.0f, 80.0f, 80.0f);
        b8 b8Var2 = zb1Var.R;
        b8Var2.k(0.0f, 0.0f, 80.0f, 80.0f);
        za0Var.setAlpha(ks.e4);
        za0Var2.setAlpha(ks.e4);
        Canvas canvas = (Canvas) b8Var.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) b8Var2.b).drawColor(0, mode);
        za0Var.draw((Canvas) b8Var.b);
        za0Var2.draw((Canvas) b8Var2.b);
        paint.setColor(-1);
    }
}
