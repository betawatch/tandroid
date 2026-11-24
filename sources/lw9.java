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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lw9 extends FrameLayout {
    public static final /* synthetic */ int E = 0;
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public final uqb d;
    public boolean e;
    public long f;
    public long h;
    public final p09 n;
    public final TextPaint r;
    public StaticLayout s;
    public float w;
    public float x;
    public final /* synthetic */ SecretMediaViewer y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw9(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.y = secretMediaViewer;
        this.c = new RectF();
        this.d = new uqb();
        this.r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(gm.L(1.5f));
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
        paint2.setStrokeWidth(gm.L(2.0f));
        new Paint(1).setColor(2130706432);
        p09 p09Var = new p09(R.raw.fire_on, gm.L(16.0f), gm.L(16.0f));
        this.n = p09Var;
        p09Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        p09Var.M(this);
        p09Var.start();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lw9.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        float measuredWidth = getMeasuredWidth() - gm.L(35.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = gm.N(10.5f);
        this.c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}
