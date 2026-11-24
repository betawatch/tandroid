// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class jz3 extends ImageView {
    public final /* synthetic */ t14 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz3(t14 t14Var, Context context) {
        super(context);
        this.a = t14Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        u04 u04Var;
        int action = motionEvent.getAction();
        byte b = 3;
        t14 t14Var = this.a;
        if (action == 0) {
            t14Var.Q1 = true;
            t14Var.R1 = false;
            gl.e3(new sm3(t14Var, kk7.U5, b), 350L);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            t14Var.Q1 = false;
            if (!t14Var.R1 && (u04Var = t14Var.u1) != null && u04Var.l()) {
                try {
                    t14Var.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
