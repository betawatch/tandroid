// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class awb extends View {
    public final bwb a;
    public qac b;
    public final ylb c;
    public int d;

    public awb(int i, ylb ylbVar, Context context) {
        super(context);
        this.c = ylbVar;
        bwb bwbVar = new bwb(i, this, ylbVar, false);
        this.a = bwbVar;
        bwbVar.s = new zcb(this, (byte) 19);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        ylb ylbVar = this.c;
        if (ylbVar != null) {
            ylbVar.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            cmb.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
        }
        this.a.c(canvas, getWidth(), 0.0f, 0.0f, 0.75f, 1.0f, true);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.b();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(33.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.d(motionEvent, false) || super.onTouchEvent(motionEvent);
    }

    public void set(k47 k47Var) {
        bwb bwbVar = this.a;
        bwbVar.e(k47Var);
        if (isAttachedToWindow()) {
            bwbVar.a();
        }
    }

    public void setBackgroundHeight(int i) {
        this.d = i;
    }

    public void setOnTopicClickListener(qac qacVar) {
        this.b = qacVar;
    }
}
