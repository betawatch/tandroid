// default package

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.SecretMediaViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class dy9 extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public final tsb d;
    public boolean e;
    public long f;
    public long h;
    public final b29 n;
    public final TextPaint r;
    public StaticLayout s;
    public float w;
    public float x;
    public final /* synthetic */ SecretMediaViewer y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dy9(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.y = secretMediaViewer;
        this.c = new RectF();
        this.d = new tsb();
        this.r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(hl.L(1.5f));
        paint.setColor(-1644826);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = new Paint(1);
        this.a = paint2;
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setColor(-1644826);
        paint2.setStrokeWidth(hl.L(2.0f));
        new Paint(1).setColor(2130706432);
        b29 b29Var = new b29(R.raw.fire_on, hl.L(16.0f), hl.L(16.0f));
        this.n = b29Var;
        b29Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        b29Var.M(this);
        b29Var.start();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException
        */
    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dy9.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth() - hl.L(35.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = hl.N(10.5f);
        this.c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}
