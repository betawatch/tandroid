// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class ayb extends View {
    public final byb a;
    public pcc b;
    public final vnb c;
    public int d;

    public ayb(int i, vnb vnbVar, Context context) {
        super(context);
        this.c = vnbVar;
        byb bybVar = new byb(i, this, vnbVar, false);
        this.a = bybVar;
        bybVar.s = new s8b(this, (byte) 28);
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        vnb vnbVar = this.c;
        if (vnbVar != null) {
            vnbVar.b(0.0f, 0.0f, getMeasuredWidth(), this.d);
        } else {
            aob.q(0.0f, 0.0f, getMeasuredWidth(), this.d);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(33.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.a.d(motionEvent, false) || super.onTouchEvent(motionEvent);
    }

    public void set(r47 r47Var) {
        byb bybVar = this.a;
        bybVar.e(r47Var);
        if (isAttachedToWindow()) {
            bybVar.a();
        }
    }

    public void setBackgroundHeight(int i) {
        this.d = i;
    }

    public void setOnTopicClickListener(pcc pccVar) {
        this.b = pccVar;
    }
}
