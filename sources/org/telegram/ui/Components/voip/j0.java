package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.ud1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j0 extends TextView {
    public final /* synthetic */ int a = 1;
    public final Object b;
    public final Object c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(v1 v1Var, Activity activity, x0 x0Var) {
        super(activity);
        this.d = v1Var;
        this.c = x0Var;
        this.b = new RectF();
        x0Var.a(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11 = this.a;
        Object obj = this.c;
        FrameLayout frameLayout = this.d;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                Paint paint = (Paint) obj2;
                ud1 ud1Var = (ud1) frameLayout;
                j0 j0Var = ud1Var.c;
                ud1Var.P.x(-getX(), -getY(), ud1Var.getWidth() - getX(), ud1Var.getHeight() - getY());
                ud1Var.Q.x(-getX(), -getY(), ud1Var.getWidth() - getX(), ud1Var.getHeight() - getY());
                RectF rectF = org.telegram.messenger.i0.P;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                Paint[] paintArr = (Paint[]) obj;
                paintArr[ud1Var.w].setAlpha(zs.e4);
                float L = org.telegram.messenger.i0.L(8.0f) + ((int) ((1.0f - ud1Var.D) * (org.telegram.messenger.i0.L(26.0f) - org.telegram.messenger.i0.L(8.0f))));
                canvas.drawRoundRect(rectF, L, L, paintArr[ud1Var.w]);
                float f7 = ud1Var.s;
                if (f7 > 0.0f && (i10 = ud1Var.w + 1) < paintArr.length) {
                    paintArr[i10].setAlpha((int) (f7 * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paintArr[ud1Var.w + 1]);
                }
                float f10 = ud1Var.D;
                if (f10 < 1.0f) {
                    paint.setAlpha((int) ((1.0f - f10) * 255.0f));
                    canvas.drawRoundRect(rectF, L, L, paint);
                }
                super.onDraw(canvas);
                if (ud1Var.O) {
                    canvas.drawText(cd.L0(2131743266, null), getWidth() / 2, (int) ((getHeight() / 2) - ((j0Var.getPaint().ascent() + j0Var.getPaint().descent()) / 2.0f)), j0Var.getPaint());
                    break;
                }
                break;
            default:
                RectF rectF2 = (RectF) obj2;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                v1 v1Var = (v1) frameLayout;
                x0 x0Var = (x0) obj;
                x0Var.d(((View) v1Var.getParent()).getX() + v1Var.getX() + ((View) getParent()).getX() + getX(), ((View) v1Var.getParent()).getY() + v1Var.getY() + ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), x0Var.b());
                super.onDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                ud1 ud1Var = (ud1) this.d;
                j2.f fVar = ud1Var.P;
                super.onSizeChanged(i10, i11, i12, i13);
                int i14 = 0;
                while (true) {
                    Paint[] paintArr = (Paint[]) this.c;
                    if (i14 >= paintArr.length) {
                        break;
                    } else {
                        if (i14 == 0) {
                            paintArr[i14] = (Paint) fVar.a;
                        } else if (i14 == 1) {
                            paintArr[i14] = (Paint) ud1Var.Q.a;
                        } else {
                            paintArr[i14] = (Paint) fVar.a;
                        }
                        i14++;
                    }
                }
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ud1 ud1Var, Context context) {
        super(context);
        this.d = ud1Var;
        Paint paint = new Paint();
        this.b = paint;
        this.c = new Paint[ud1Var.e.length];
        jb0 jb0Var = ud1Var.R;
        jb0Var.setBounds(0, 0, 80, 80);
        jb0 jb0Var2 = ud1Var.S;
        jb0Var2.setBounds(0, 0, 80, 80);
        j2.f fVar = ud1Var.P;
        fVar.x(0.0f, 0.0f, 80.0f, 80.0f);
        j2.f fVar2 = ud1Var.Q;
        fVar2.x(0.0f, 0.0f, 80.0f, 80.0f);
        jb0Var.setAlpha(zs.e4);
        jb0Var2.setAlpha(zs.e4);
        Canvas canvas = (Canvas) fVar.b;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        canvas.drawColor(0, mode);
        ((Canvas) fVar2.b).drawColor(0, mode);
        jb0Var.draw((Canvas) fVar.b);
        jb0Var2.draw((Canvas) fVar2.b);
        paint.setColor(-1);
    }
}
