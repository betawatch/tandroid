// default package

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class a24 implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a24(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                e34 e34Var = ((e24) obj).G;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        e34Var.f = false;
                        break;
                    }
                } else {
                    e34Var.f = true;
                    break;
                }
                break;
            case 1:
                e34 e34Var2 = ((s24) obj).H;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        e34Var2.f = false;
                        break;
                    }
                } else {
                    e34Var2.f = true;
                    break;
                }
                break;
            case 2:
                e34 e34Var3 = ((z24) obj).R;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        e34Var3.f = false;
                        break;
                    }
                } else {
                    e34Var3.f = true;
                    break;
                }
                break;
            default:
                o76 o76Var = (o76) obj;
                m76 m76Var = o76Var.H;
                Handler handler = o76Var.L;
                nq nqVar = o76Var.P;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && nqVar != null && nqVar.isShowing() && x >= 0 && x < nqVar.getWidth() && y >= 0 && y < nqVar.getHeight()) {
                    handler.postDelayed(m76Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(m76Var);
                    break;
                }
                break;
        }
        return false;
    }
}
