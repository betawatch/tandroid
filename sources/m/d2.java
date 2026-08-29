package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ry;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d2 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d2(Object obj, int i10) {
        this.a = i10;
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
                int x4 = (int) motionEvent.getX();
                int y8 = (int) motionEvent.getY();
                if (action == 0 && yVar != null && yVar.isShowing() && x4 >= 0 && x4 < yVar.getWidth() && y8 >= 0 && y8 < yVar.getHeight()) {
                    handler.postDelayed(b2Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(b2Var);
                    break;
                }
                break;
            case 1:
                ey eyVar = (ey) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        eyVar.B.f = false;
                        break;
                    }
                } else {
                    eyVar.B.f = true;
                    break;
                }
                break;
            case 2:
                ry ryVar = (ry) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        ryVar.C.f = false;
                        break;
                    }
                } else {
                    ryVar.C.f = true;
                    break;
                }
                break;
            default:
                az azVar = (az) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        azVar.M.f = false;
                        break;
                    }
                } else {
                    azVar.M.f = true;
                    break;
                }
                break;
        }
        return false;
    }
}
