// default package

import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class e04 extends ImageView {
    public final /* synthetic */ o24 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e04(o24 o24Var, Context context) {
        super(context);
        this.a = o24Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        p14 p14Var;
        int action = motionEvent.getAction();
        o24 o24Var = this.a;
        if (action == 0) {
            o24Var.Q1 = true;
            o24Var.R1 = false;
            hl.d3(new hl3((Object) o24Var, jn7.U5, (byte) 4), 350L);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            o24Var.Q1 = false;
            if (!o24Var.R1 && (p14Var = o24Var.u1) != null && p14Var.l()) {
                try {
                    o24Var.y.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
