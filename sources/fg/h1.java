package fg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class h1 extends m2.h {
    public long t0;
    public boolean u0;
    public final g1 v0;
    public final /* synthetic */ n1 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(n1 n1Var, Context context) {
        super(context);
        this.w0 = n1Var;
        try {
            Field declaredField = m2.h.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            g1 g1Var = new g1(this, getContext());
            this.v0 = g1Var;
            declaredField.set(this, g1Var);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        g1 g1Var;
        if (motionEvent.getAction() == 0) {
            this.t0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.t0 <= ViewConfiguration.getTapTimeout() && (g1Var = this.v0) != null && g1Var.isFinished()) {
                this.u0 = true;
                float x10 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                n1 n1Var = this.w0;
                if (x10 <= width) {
                    int i10 = n1Var.D - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                } else if (n1Var.D + 1 < n1Var.d.size()) {
                    x(n1Var.D + 1, true);
                }
                this.u0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.t0 = -1L;
        }
        return false;
    }

    @Override // m2.h, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            A(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // m2.h, android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp + this.w0.I, TLObject.FLAG_30));
    }

    @Override // m2.h, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.w0.w) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || A(motionEvent);
    }
}
