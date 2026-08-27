package ag;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.reflect.Field;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a2 extends m2.g {
    public long s0;
    public boolean t0;
    public final z1 u0;
    public final /* synthetic */ g2 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(g2 g2Var, Context context) {
        super(context);
        this.v0 = g2Var;
        try {
            Field declaredField = m2.g.class.getDeclaredField("r");
            declaredField.setAccessible(true);
            z1 z1Var = new z1(this, getContext());
            this.u0 = z1Var;
            declaredField.set(this, z1Var);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public final boolean A(MotionEvent motionEvent) {
        z1 z1Var;
        if (motionEvent.getAction() == 0) {
            this.s0 = System.currentTimeMillis();
            return true;
        }
        if (motionEvent.getAction() == 1) {
            if (System.currentTimeMillis() - this.s0 <= ViewConfiguration.getTapTimeout() && (z1Var = this.u0) != null && z1Var.isFinished()) {
                this.t0 = true;
                float x8 = motionEvent.getX();
                float width = getWidth() * 0.45f;
                g2 g2Var = this.v0;
                if (x8 <= width) {
                    int i10 = g2Var.C - 1;
                    if (i10 >= 0) {
                        x(i10, true);
                    }
                } else if (g2Var.C + 1 < g2Var.d.size()) {
                    x(g2Var.C + 1, true);
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
