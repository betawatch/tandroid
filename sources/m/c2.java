package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.qx;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class c2 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.b;
                a2 a2Var = d2Var.H;
                Handler handler = d2Var.L;
                x xVar = d2Var.P;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (action == 0 && xVar != null && xVar.isShowing() && x10 >= 0 && x10 < xVar.getWidth() && y10 >= 0 && y10 < xVar.getHeight()) {
                    handler.postDelayed(a2Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(a2Var);
                    break;
                }
                break;
            case 1:
                qx qxVar = (qx) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        qxVar.G.f = false;
                        break;
                    }
                } else {
                    qxVar.G.f = true;
                    break;
                }
                break;
            case 2:
                ey eyVar = (ey) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        eyVar.H.f = false;
                        break;
                    }
                } else {
                    eyVar.H.f = true;
                    break;
                }
                break;
            default:
                my myVar = (my) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        myVar.R.f = false;
                        break;
                    }
                } else {
                    myVar.R.f = true;
                    break;
                }
                break;
        }
        return false;
    }
}
