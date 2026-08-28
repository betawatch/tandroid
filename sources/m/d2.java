package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.vx;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d2 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d2(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                e2 e2Var = (e2) this.b;
                b2 b2Var = e2Var.C;
                Handler handler = e2Var.G;
                y yVar = e2Var.K;
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
                vx vxVar = (vx) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        vxVar.B.f = false;
                        break;
                    }
                } else {
                    vxVar.B.f = true;
                    break;
                }
                break;
            case 2:
                jy jyVar = (jy) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        jyVar.C.f = false;
                        break;
                    }
                } else {
                    jyVar.C.f = true;
                    break;
                }
                break;
            default:
                ry ryVar = (ry) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        ryVar.M.f = false;
                        break;
                    }
                } else {
                    ryVar.M.f = true;
                    break;
                }
                break;
        }
        return false;
    }
}
