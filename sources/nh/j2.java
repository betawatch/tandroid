package nh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class j2 extends View {
    public final RectF A;
    public float B;
    public d1 C;
    public int D;
    public final TextPaint a;
    public final Paint b;
    public StaticLayout c;
    public float d;
    public float e;
    public StaticLayout f;
    public float h;
    public float n;
    public StaticLayout r;
    public float s;
    public float v;
    public final RectF w;
    public final RectF x;
    public final RectF y;

    public j2(Context context) {
        super(context);
        this.a = new TextPaint(1);
        this.b = new Paint(1);
        this.w = new RectF();
        this.x = new RectF();
        this.y = new RectF();
        this.A = new RectF();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawColor(-14737633);
        Paint paint = this.b;
        paint.setColor(-13224394);
        float f9 = this.B;
        int i10 = (int) f9;
        RectF rectF = this.y;
        RectF rectF2 = this.x;
        RectF rectF3 = this.w;
        RectF rectF4 = i10 <= 0 ? rectF3 : i10 == 1 ? rectF2 : rectF;
        int ceil = (int) Math.ceil(f9);
        RectF rectF5 = ceil <= 0 ? rectF3 : ceil == 1 ? rectF2 : rectF;
        float f10 = this.B;
        RectF rectF6 = this.A;
        AndroidUtilities.lerp(rectF4, rectF5, f10 - ((int) f10), rectF6);
        canvas.drawRoundRect(rectF6, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), paint);
        StaticLayout staticLayout = this.c;
        TextPaint textPaint = this.a;
        if (staticLayout != null) {
            canvas.save();
            canvas.translate((rectF3.left + AndroidUtilities.dp(12.0f)) - this.e, com.google.android.recaptcha.internal.a.A(rectF3.height(), this.c.getHeight(), 2.0f, rectF3.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.B - 0.0f), 1.0f, 0.0f), -8158333, -1));
            this.c.draw(canvas);
            canvas.restore();
        }
        if (this.f != null) {
            canvas.save();
            canvas.translate((rectF2.left + AndroidUtilities.dp(12.0f)) - this.n, com.google.android.recaptcha.internal.a.A(rectF2.height(), this.f.getHeight(), 2.0f, rectF2.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.B - 1.0f), 1.0f, 0.0f), -8158333, -1));
            this.f.draw(canvas);
            canvas.restore();
        }
        if (this.r != null) {
            canvas.save();
            canvas.translate((rectF.left + AndroidUtilities.dp(12.0f)) - this.v, com.google.android.recaptcha.internal.a.A(rectF.height(), this.r.getHeight(), 2.0f, rectF.top));
            textPaint.setColor(i0.a.d(Utilities.clamp(1.0f - Math.abs(this.B - 2.0f), 1.0f, 0.0f), -8158333, -1));
            this.r.draw(canvas);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(40.0f) + AndroidUtilities.navigationBarHeight);
        if (getMeasuredWidth() != this.D || this.c == null) {
            float dp = AndroidUtilities.dp(14.0f);
            TextPaint textPaint = this.a;
            textPaint.setTextSize(dp);
            textPaint.setTypeface(AndroidUtilities.bold());
            String string = LocaleController.getString("Emoji");
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout = new StaticLayout(string, textPaint, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.c = staticLayout;
            this.d = staticLayout.getLineCount() >= 1 ? this.c.getLineWidth(0) : 0.0f;
            this.e = this.c.getLineCount() >= 1 ? this.c.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout2 = new StaticLayout(LocaleController.getString("AccDescrStickers"), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.f = staticLayout2;
            this.h = staticLayout2.getLineCount() >= 1 ? this.f.getLineWidth(0) : 0.0f;
            this.n = this.f.getLineCount() >= 1 ? this.f.getLineLeft(0) : 0.0f;
            StaticLayout staticLayout3 = new StaticLayout(LocaleController.getString(R.string.AccDescrGIFs), textPaint, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.r = staticLayout3;
            this.s = staticLayout3.getLineCount() >= 1 ? this.r.getLineWidth(0) : 0.0f;
            this.v = this.r.getLineCount() >= 1 ? this.r.getLineLeft(0) : 0.0f;
            float dp2 = AndroidUtilities.dp(14.0f) / 2.0f;
            float dp3 = AndroidUtilities.dp(66.0f) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() - ((((((AndroidUtilities.dp(12.0f) + this.d) + AndroidUtilities.dp(36.0f)) + this.h) + AndroidUtilities.dp(36.0f)) + this.s) + AndroidUtilities.dp(12.0f))) / 2.0f;
            this.w.set(measuredWidth2, dp2, this.d + measuredWidth2 + AndroidUtilities.dp(24.0f), dp3);
            float dp4 = this.d + AndroidUtilities.dp(36.0f) + measuredWidth2;
            this.x.set(dp4, dp2, this.h + dp4 + AndroidUtilities.dp(24.0f), dp3);
            float dp5 = this.h + AndroidUtilities.dp(36.0f) + dp4;
            this.y.set(dp5, dp2, this.s + dp5 + AndroidUtilities.dp(24.0f), dp3);
            AndroidUtilities.dp(36.0f);
        }
        this.D = getMeasuredWidth();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            if (motionEvent.getAction() != 1 || this.C == null) {
                return super.onTouchEvent(motionEvent);
            }
            if (this.w.contains(motionEvent.getX(), motionEvent.getY())) {
                this.C.run(0);
                return true;
            }
            if (this.x.contains(motionEvent.getX(), motionEvent.getY())) {
                this.C.run(1);
                return true;
            }
            if (this.y.contains(motionEvent.getX(), motionEvent.getY())) {
                this.C.run(2);
            }
        }
        return true;
    }
}
