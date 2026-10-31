package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a11 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final RectF c;
    public final org.telegram.ui.Components.h11 d;
    public boolean e;
    public long f;
    public long h;
    public final org.telegram.ui.Components.bi0 n;
    public final TextPaint r;
    public StaticLayout s;
    public float w;
    public float x;
    public final /* synthetic */ SecretMediaViewer y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a11(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.y = secretMediaViewer;
        this.c = new RectF();
        this.d = new org.telegram.ui.Components.h11();
        this.r = new TextPaint(1);
        setWillNotDraw(false);
        Paint paint = new Paint(1);
        this.b = paint;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.5f));
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
        paint2.setStrokeWidth(org.telegram.messenger.i0.L(2.0f));
        new Paint(1).setColor(2130706432);
        org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(R.raw.fire_on, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        this.n = bi0Var;
        bi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        bi0Var.R(this);
        bi0Var.start();
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas r15) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a11.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float measuredWidth = getMeasuredWidth() - org.telegram.messenger.i0.L(35.0f);
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float N = org.telegram.messenger.i0.N(10.5f);
        this.c.set(measuredWidth - N, measuredHeight - N, measuredWidth + N, N + measuredHeight);
        setPivotX(measuredWidth);
        setPivotY(measuredHeight);
    }
}
