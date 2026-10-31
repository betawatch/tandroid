package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.ux;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c2 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                d2 d2Var = (d2) this.b;
                a2 a2Var = d2Var.G;
                Handler handler = d2Var.K;
                x xVar = d2Var.O;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                if (action == 0 && xVar != null && xVar.isShowing() && x10 >= 0 && x10 < xVar.getWidth() && y3 >= 0 && y3 < xVar.getHeight()) {
                    handler.postDelayed(a2Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(a2Var);
                    break;
                }
                break;
            case 1:
                ux uxVar = (ux) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        uxVar.F.f = false;
                        break;
                    }
                } else {
                    uxVar.F.f = true;
                    break;
                }
                break;
            case 2:
                iy iyVar = (iy) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        iyVar.G.f = false;
                        break;
                    }
                } else {
                    iyVar.G.f = true;
                    break;
                }
                break;
            default:
                qy qyVar = (qy) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        qyVar.Q.f = false;
                        break;
                    }
                } else {
                    qyVar.Q.f = true;
                    break;
                }
                break;
        }
        return false;
    }
}
