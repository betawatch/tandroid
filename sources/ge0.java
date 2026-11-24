// default package

import android.app.Activity;
import android.view.MotionEvent;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ge0 extends ImageView {
    public long a;
    public final /* synthetic */ he0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge0(he0 he0Var, Activity activity) {
        super(activity);
        this.b = he0Var;
        this.a = 0L;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        qac qacVar;
        int action = motionEvent.getAction();
        he0 he0Var = this.b;
        if (action == 0) {
            if (System.currentTimeMillis() < this.a + 350) {
                return false;
            }
            this.a = System.currentTimeMillis();
            he0Var.b = true;
            he0Var.c = false;
            gm.d3(new eh(he0Var, nm7.U5, (byte) 8), 350L);
        } else if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            he0Var.b = false;
            if (!he0Var.c && (qacVar = he0Var.d) != null) {
                qacVar.a(Boolean.FALSE);
                try {
                    he0Var.a.performHapticFeedback(3);
                } catch (Exception unused) {
                }
            }
        }
        super.onTouchEvent(motionEvent);
        return true;
    }
}
