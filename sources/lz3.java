// default package

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class lz3 extends lt9 {
    public int h;
    public boolean n;
    public float r;
    public final /* synthetic */ mz3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lz3(mz3 mz3Var, Context context) {
        super(context);
        this.s = mz3Var;
        boolean z = mz3Var.h;
        this.n = z;
        this.r = z ? 1.0f : 0.0f;
        setSmoothScrollingEnabled(true);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setNestedScrollingEnabled(true);
        qmb qmbVar = new qmb((byte) 5, context, this);
        this.b = qmbVar;
        qmbVar.setOrientation(0);
        addView(this.b, new FrameLayout.LayoutParams(-2, -1));
        for (int i = 0; i < 8; i++) {
            int i2 = mz3.e0[i];
            kz3 kz3Var = new kz3(this, context, mz3.f0[i]);
            kz3Var.setContentDescription(mz3.f(i));
            this.b.addView(kz3Var);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.U1(this.r, gm.L(30.0f), gm.L(Math.min(5.7f, this.b.getChildCount()) * 32.0f)), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(30.0f), TLObject.FLAG_30));
    }

    @Override // lt9, android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d(motionEvent);
        return super.onTouchEvent(motionEvent);
    }
}
