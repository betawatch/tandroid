// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class gmb extends be0 {
    public Drawable H;
    public final boolean I;
    public float J;
    public float K;
    public final /* synthetic */ qmb L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmb(qmb qmbVar, Activity activity) {
        super(activity);
        this.L = qmbVar;
        this.I = true;
    }

    @Override // android.view.View
    public Drawable getBackground() {
        return this.H;
    }

    @Override // be0, android.view.View
    public final void onDraw(Canvas canvas) {
        this.J = 0.0f;
        this.K = 0.0f;
        boolean z = this.I;
        qmb qmbVar = this.L;
        if (z) {
            Drawable drawable = this.H;
            if ((drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable) || (drawable instanceof ye7)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                this.H.draw(canvas);
            } else if (drawable instanceof BitmapDrawable) {
                if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                    canvas.save();
                    float f = 2.0f / gl.p;
                    canvas.scale(f, f);
                    this.H.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f), (int) Math.ceil(getMeasuredHeight() / f));
                    this.H.draw(canvas);
                    canvas.restore();
                } else {
                    int measuredHeight = getMeasuredHeight();
                    float max = Math.max(getMeasuredWidth() / this.H.getIntrinsicWidth(), measuredHeight / this.H.getIntrinsicHeight());
                    int ceil = (int) Math.ceil(this.H.getIntrinsicWidth() * max * qmbVar.A1);
                    int ceil2 = (int) Math.ceil(this.H.getIntrinsicHeight() * max * qmbVar.A1);
                    int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                    int i = (measuredHeight - ceil2) / 2;
                    this.K = i;
                    this.H.setBounds(measuredWidth, i, ceil + measuredWidth, ceil2 + i);
                    this.H.draw(canvas);
                }
            }
        }
        if (qmbVar.c2) {
            if (!qmbVar.c.isFinished() && qmbVar.c.computeScrollOffset()) {
                if (qmbVar.c.getStartX() < qmbVar.Y1 && qmbVar.c.getStartX() > 0) {
                    qmbVar.Z1 = qmbVar.c.getCurrX();
                }
                qmbVar.W0();
                invalidate();
            }
            canvas.save();
            float f2 = -qmbVar.Z1;
            this.J = f2;
            canvas.translate(f2, 0.0f);
            super.onDraw(canvas);
            canvas.restore();
        } else {
            super.onDraw(canvas);
        }
        if (qmbVar.O1) {
            float f3 = qmbVar.p1;
            if (f3 > 0.0f) {
                canvas.drawColor(bm2.o(-16777216, (int) (f3 * 255.0f * qmbVar.q1)));
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        qmb qmbVar = this.L;
        brc brcVar = qmbVar.x1;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        brcVar.getClass();
        float a = brc.a(measuredWidth, measuredHeight);
        qmbVar.A1 = a;
        if (qmbVar.G1) {
            setScaleX(a);
            setScaleY(qmbVar.A1);
        }
        if (qmbVar.b == 2) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
        int measuredWidth2 = getMeasuredWidth() + (getMeasuredHeight() << 16);
        if (qmbVar.d2 != measuredWidth2) {
            qmbVar.c2 = false;
            if (qmbVar.E1 != null) {
                int measuredHeight2 = (int) ((getMeasuredHeight() / qmbVar.E1.getHeight()) * r1.getWidth());
                if (measuredHeight2 - getMeasuredWidth() > 100) {
                    qmbVar.c2 = true;
                    qmbVar.b2 = (int) ((qmbVar.E1.getHeight() / getMeasuredHeight()) * getMeasuredWidth());
                    float measuredWidth3 = (measuredHeight2 - getMeasuredWidth()) / 2.0f;
                    qmbVar.Z1 = measuredWidth3;
                    qmbVar.a2 = measuredWidth3;
                    qmbVar.Y1 = measuredWidth3 * 2.0f;
                    t(measuredHeight2, getMeasuredHeight());
                    this.w = true;
                    qmbVar.W0();
                }
            }
            if (!qmbVar.c2) {
                t(-1, -1);
                this.w = false;
            }
        }
        qmbVar.d2 = measuredWidth2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.H = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // be0, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.H == drawable || super.verifyDrawable(drawable);
    }
}
