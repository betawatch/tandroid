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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class iu9 extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public final tob d;
    public boolean e;
    public long f;
    public long h;
    public final oy8 n;
    public final TextPaint r;
    public StaticLayout s;
    public float w;
    public float x;
    public final /* synthetic */ SecretMediaViewer y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu9(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.y = secretMediaViewer;
        this.c = new RectF();
        this.d = new tob();
        this.r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(gl.L(1.5f));
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
        paint2.setStrokeWidth(gl.L(2.0f));
        new Paint(1).setColor(2130706432);
        oy8 oy8Var = new oy8(R.raw.fire_on, gl.L(16.0f), gl.L(16.0f));
        this.n = oy8Var;
        oy8Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        oy8Var.M(this);
        oy8Var.start();
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
        throw new UnsupportedOperationException("Method not decompiled: iu9.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth() - gl.L(35.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = gl.N(10.5f);
        this.c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}
