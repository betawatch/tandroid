package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class e2 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                f2 f2Var = (f2) this.b;
                c2 c2Var = f2Var.G;
                Handler handler = f2Var.K;
                z zVar = f2Var.O;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                if (action == 0 && zVar != null && zVar.isShowing() && x10 >= 0 && x10 < zVar.getWidth() && y3 >= 0 && y3 < zVar.getHeight()) {
                    handler.postDelayed(c2Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(c2Var);
                    break;
                }
                break;
            case 1:
                vy vyVar = (vy) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        vyVar.F.f = false;
                        break;
                    }
                } else {
                    vyVar.F.f = true;
                    break;
                }
                break;
            case 2:
                iz izVar = (iz) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        izVar.G.f = false;
                        break;
                    }
                } else {
                    izVar.G.f = true;
                    break;
                }
                break;
            default:
                rz rzVar = (rz) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        rzVar.Q.f = false;
                        break;
                    }
                } else {
                    rzVar.Q.f = true;
                    break;
                }
                break;
        }
        return false;
    }
}
