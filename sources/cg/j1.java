package cg;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class j1 extends m2.g {
    public long s0;
    public boolean t0;
    public final i1 u0;
    public final /* synthetic */ p1 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(p1 p1Var, Context context) {
        super(context);
        this.v0 = p1Var;
        try {
            Field declaredField = m2.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            i1 i1Var = new i1(this, getContext());
            this.u0 = i1Var;
            declaredField.set(this, i1Var);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        i1 i1Var;
        if (motionEvent.getAction() == 0) {
            this.s0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.s0 <= ViewConfiguration.getTapTimeout() && (i1Var = this.u0) != null && i1Var.isFinished()) {
                this.t0 = true;
                float x4 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                p1 p1Var = this.v0;
                if (x4 <= width) {
                    int i10 = p1Var.C - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                } else if (p1Var.C + 1 < p1Var.d.size()) {
                    x(p1Var.C + 1, true);
                }
                this.t0 = false;
                return false;
            }
        } else if (motionEvent.getAction() == 3) {
            this.s0 = -1L;
        }
        return false;
    }

    @Override // m2.g, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            A(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // m2.g, android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp = AndroidUtilities.dp(100.0f);
        if (getChildCount() > 0) {
            getChildAt(0).measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
            dp = getChildAt(0).getMeasuredHeight();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp + this.v0.H, TLObject.FLAG_30));
    }

    @Override // m2.g, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.v0.w) {
            return false;
        }
        return super.onTouchEvent(motionEvent) || A(motionEvent);
    }
}
