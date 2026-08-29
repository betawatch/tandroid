package nh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public abstract class t6 extends FrameLayout {
    public float A;
    public final s6 a;
    public final File b;
    public long c;
    public long d;
    public final Paint e;
    public final Paint f;
    public final p6 h;
    public lh.z n;
    public n r;
    public float s;
    public bg.f3 v;
    public ValueAnimator w;
    public boolean x;
    public ValueAnimator y;

    public t6(Context context) {
        super(context);
        this.c = -1L;
        this.d = -1L;
        this.e = new Paint(1);
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new p6(this, 0);
        this.s = 1.0f;
        this.x = false;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        this.b = o7.x(UserConfig.selectedAccount, true);
        s6 s6Var = new s6(this, context);
        this.a = s6Var;
        s6Var.setScaleX(0.0f);
        s6Var.setScaleY(0.0f);
        addView(s6Var);
        s6Var.setDelegate(new q6(this));
        s6Var.initTexture();
        setWillNotDraw(false);
    }

    public final void a(boolean z10) {
        n nVar = this.r;
        if (nVar != null) {
            nVar.run();
            this.r = null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.h);
        this.a.destroy(true, null);
        try {
            this.b.delete();
        } catch (Exception unused) {
        }
        if (z10) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).removeView(this);
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.A, 1.0f);
        this.y = ofFloat;
        ofFloat.addUpdateListener(new lh.d5(this, 12));
        this.y.addListener(new q5(this, 2));
        this.y.setInterpolator(jr.h);
        this.y.setDuration(280L);
        this.y.start();
    }

    public final long b() {
        if (this.c < 0) {
            return 0L;
        }
        long j10 = this.d;
        if (j10 < 0) {
            j10 = System.currentTimeMillis();
        }
        return Math.min(59500L, j10 - this.c);
    }

    public abstract void c();

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        s6 s6Var = this.a;
        rectF.set(((1.0f - s6Var.getScaleX()) * (s6Var.getWidth() / 2.0f)) + s6Var.getX(), ((1.0f - s6Var.getScaleY()) * (s6Var.getHeight() / 2.0f)) + s6Var.getY(), (s6Var.getX() + s6Var.getWidth()) - ((1.0f - s6Var.getScaleX()) * (s6Var.getWidth() / 2.0f)), (s6Var.getY() + s6Var.getHeight()) - ((1.0f - s6Var.getScaleY()) * (s6Var.getHeight() / 2.0f)));
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(0.66f);
        int l1 = org.telegram.ui.ActionBar.g6.l1(this.s, TLObject.FLAG_29);
        Paint paint = this.e;
        paint.setShadowLayer(dp, 0.0f, dp2, l1);
        paint.setAlpha((int) (this.s * 255.0f));
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f) - 1.0f, paint);
        super.dispatchDraw(canvas);
        bg.f3 f3Var = this.v;
        if (f3Var != null && f3Var.getWidth() > 0 && this.v.getHeight() > 0) {
            canvas.save();
            canvas.translate(rectF.left, rectF.top);
            canvas.scale(rectF.width() / this.v.getWidth(), rectF.height() / this.v.getHeight());
            float alpha = this.v.getAlpha();
            this.v.setDraw(true);
            this.v.setAlpha(1.0f - this.s);
            this.v.draw(canvas);
            this.v.setAlpha(alpha);
            this.v.setDraw(false);
            canvas.restore();
        }
        if (this.c > 0) {
            float clamp = Utilities.clamp(b() / 59500.0f, 1.0f, 0.0f);
            float dp3 = AndroidUtilities.dp(3.33f);
            Paint paint2 = this.f;
            paint2.setStrokeWidth(dp3);
            paint2.setColor(org.telegram.ui.ActionBar.g6.l1(this.s, -1090519041));
            paint2.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(0.33f), org.telegram.ui.ActionBar.g6.l1(this.s, TLObject.FLAG_29));
            rectF.inset(-AndroidUtilities.dp(7.665f), -AndroidUtilities.dp(7.665f));
            canvas.drawArc(rectF, -90.0f, clamp * 360.0f, false, paint2);
            if (this.d <= 0) {
                invalidate();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        s6 s6Var = this.a;
        int measuredWidth = ((i12 - i10) - s6Var.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
        int dp = AndroidUtilities.dp(72.0f);
        s6Var.layout(measuredWidth, dp, s6Var.getMeasuredWidth() + measuredWidth, s6Var.getMeasuredHeight() + dp);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int min = (int) (Math.min(size, size2) * 0.43f);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(min, TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }
}
