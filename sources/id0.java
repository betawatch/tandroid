// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class id0 extends ImageView {
    public long a;
    public final /* synthetic */ jd0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public id0(jd0 jd0Var, Activity activity) {
        super(activity);
        this.b = jd0Var;
        this.a = 0L;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        pcc pccVar;
        int action = motionEvent.getAction();
        jd0 jd0Var = this.b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.a + 350) {
                return false;
            }
            this.a = System.currentTimeMillis();
            jd0Var.b = true;
            jd0Var.c = false;
            hl.d3(new zd(jd0Var, jn7.U5, (byte) 8), 350L);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            jd0Var.b = false;
            if (!jd0Var.c && (pccVar = jd0Var.d) != null) {
                pccVar.a(Boolean.FALSE);
                try {
                    jd0Var.a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
