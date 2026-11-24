// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class mo8 extends View {
    public static final /* synthetic */ int r = 0;
    public final RectF a;
    public final TextPaint b;
    public final Paint c;
    public final ValueAnimator d;
    public final float[] e;
    public final pr7 f;
    public boolean h;
    public final /* synthetic */ ProfileActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo8(ProfileActivity profileActivity, Context context) {
        super(context);
        this.n = profileActivity;
        this.a = new RectF();
        this.e = new float[]{0.0f, 1.0f};
        pr7 adapter = profileActivity.o0.getAdapter();
        this.f = adapter;
        setVisibility(8);
        TextPaint textPaint = new TextPaint(1);
        this.b = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(gl.N(15.0f));
        Paint paint = new Paint(1);
        this.c = paint;
        paint.setColor(637534208);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.setInterpolator(s33.j);
        ofFloat.addUpdateListener(new u28(this, (byte) 16));
        ofFloat.addListener(new id4((byte) 26, this, profileActivity.n1));
        profileActivity.o0.b(new jh2(this, (byte) 1));
        adapter.a.registerObserver(new c43(this, (byte) 2));
    }

    public final void a(boolean z) {
        a aVar;
        int i;
        a aVar2;
        ProfileActivity profileActivity = this.n;
        if (z) {
            lo8 lo8Var = profileActivity.N;
            lo8Var.K = lo8Var.M;
            lo8Var.L = lo8Var.N;
            lo8Var.O = 0.0f;
            lo8Var.P = 1;
        }
        profileActivity.N.invalidate();
        float measureText = this.b.measureText(((String) this.f.d(profileActivity.o0.getCurrentItem())).toString());
        float measuredWidth = getMeasuredWidth() - gl.L(54.0f);
        RectF rectF = this.a;
        rectF.right = measuredWidth;
        rectF.left = measuredWidth - (gl.N(16.0f) + measureText);
        aVar = ((d) profileActivity).actionBar;
        if (aVar != null) {
            aVar2 = ((d) profileActivity).actionBar;
            if (aVar2.getOccupyStatusBar()) {
                i = gl.m;
                float L = gl.L(15.0f) + i;
                rectF.top = L;
                rectF.bottom = L + gl.L(26.0f);
                setPivotX(rectF.centerX());
                setPivotY(rectF.centerY());
                invalidate();
            }
        }
        i = 0;
        float L2 = gl.L(15.0f) + i;
        rectF.top = L2;
        rectF.bottom = L2 + gl.L(26.0f);
        setPivotX(rectF.centerX());
        setPivotY(rectF.centerY());
        invalidate();
    }

    public final void b(float f) {
        ProfileActivity profileActivity = this.n;
        boolean z = profileActivity.q2 && profileActivity.o0.getRealCount() > 20;
        if (z != this.h) {
            this.h = z;
            ValueAnimator valueAnimator = this.d;
            valueAnimator.cancel();
            float animatedFraction = valueAnimator.getAnimatedFraction();
            float[] fArr = this.e;
            float S1 = gl.S1(animatedFraction, fArr);
            if (f <= 0.0f) {
                valueAnimator.setDuration(0L);
            } else if (z) {
                valueAnimator.setDuration((long) (((1.0f - S1) * 250.0f) / f));
            } else {
                valueAnimator.setDuration((long) ((250.0f * S1) / f));
            }
            fArr[0] = S1;
            fArr[1] = z ? 1.0f : 0.0f;
            valueAnimator.start();
        }
    }

    public final void c() {
        ym8 ym8Var;
        ProfileActivity profileActivity = this.n;
        if (profileActivity.T0 == null || (ym8Var = profileActivity.o0) == null || !profileActivity.q2) {
            return;
        }
        int realPosition = ym8Var.getRealPosition();
        xha xhaVar = profileActivity.T0;
        if (realPosition == 0) {
            xhaVar.u(33);
            profileActivity.T0.S(36);
        } else {
            xhaVar.S(33);
            profileActivity.T0.u(36);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float N = gl.N(12.0f);
        Paint paint = this.c;
        RectF rectF = this.a;
        canvas.drawRoundRect(rectF, N, N, paint);
        canvas.drawText(((String) this.f.d(this.n.o0.getCurrentItem())).toString(), rectF.centerX(), gl.N(18.5f) + rectF.top, this.b);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        a(false);
    }
}
