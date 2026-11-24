// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class by3 extends jr9 {
    public int h;
    public boolean n;
    public float r;
    public final /* synthetic */ cy3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by3(cy3 cy3Var, Context context) {
        super(context);
        this.s = cy3Var;
        boolean z = cy3Var.h;
        this.n = z;
        this.r = z ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        pkb pkbVar = new pkb((byte) 5, context, this);
        this.b = pkbVar;
        pkbVar.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        for (int i = 0; i < 8; i++) {
            int i2 = cy3.e0[i];
            ay3 ay3Var = new ay3(this, context, cy3.f0[i]);
            ay3Var.setContentDescription(cy3.f(i));
            this.b.addView(ay3Var);
        }
    }

    public final void d(MotionEvent motionEvent) {
        if (!this.n || this.d) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                this.a = false;
                return;
            } else if (action != 2) {
                return;
            }
        }
        this.a = true;
        if (!this.d) {
            this.e = -1;
        }
        this.s.requestDisallowInterceptTouchEvent(true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.U1(this.r, gl.L(30.0f), gl.L(Math.min(5.7f, this.b.getChildCount()) * 32.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(30.0f), TLObject.FLAG_30));
    }

    @Override // jr9, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
