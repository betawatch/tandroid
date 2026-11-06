package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.gx;
import org.telegram.ui.Components.tx;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d2 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d2(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.b;
                b2 b2Var = e2Var.G;
                Handler handler = e2Var.K;
                y yVar = e2Var.O;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (action == 0 && yVar != null && yVar.isShowing() && x10 >= 0 && x10 < yVar.getWidth() && y10 >= 0 && y10 < yVar.getHeight()) {
                    handler.postDelayed(b2Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(b2Var);
                    break;
                }
                break;
            case 1:
                gx gxVar = (gx) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        gxVar.F.f = false;
                        break;
                    }
                } else {
                    gxVar.F.f = true;
                    break;
                }
                break;
            case 2:
                tx txVar = (tx) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        txVar.G.f = false;
                        break;
                    }
                } else {
                    txVar.G.f = true;
                    break;
                }
                break;
            default:
                ay ayVar = (ay) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        ayVar.Q.f = false;
                        break;
                    }
                } else {
                    ayVar.Q.f = true;
                    break;
                }
                break;
        }
        return false;
    }
}
