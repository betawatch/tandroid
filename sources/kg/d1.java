package kg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.f8;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d1 extends z4.g {
    public long w0;
    public boolean x0;
    public final c1 y0;
    public final /* synthetic */ i1 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(i1 i1Var, Context context) {
        super(context);
        this.z0 = i1Var;
        try {
            Field declaredField = z4.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            c1 c1Var = new c1(this, getContext());
            this.y0 = c1Var;
            declaredField.set(this, c1Var);
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        c1 c1Var;
        if (motionEvent.getAction() == 0) {
            this.w0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.w0 <= ViewConfiguration.getTapTimeout() && (c1Var = this.y0) != null && c1Var.isFinished()) {
                this.x0 = true;
                float x10 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                i1 i1Var = this.z0;
                if (x10 <= width) {
                    int i10 = i1Var.x1 - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                } else if (i1Var.x1 + 1 < i1Var.k1.size()) {
                    x(i1Var.x1 + 1, true);
                }
                this.x0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.w0 = -1L;
        }
        return false;
    }

    @Override // z4.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            A(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // z4.g, android.view.View
    public final void onMeasure(int i10, int i11) {
        int L = org.telegram.messenger.i0.L(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            L = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(L + this.z0.C1, TLObject.FLAG_30));
    }

    @Override // z4.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.z0.s1) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || A(motionEvent);
    }
}
