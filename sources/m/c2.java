package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.sy;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                int x9 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                if (action == 0 && xVar != null && xVar.isShowing() && x9 >= 0 && x9 < xVar.getWidth() && y3 >= 0 && y3 < xVar.getHeight()) {
                    handler.postDelayed(a2Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(a2Var);
                    break;
                }
                break;
            case 1:
                sy syVar = (sy) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        syVar.F.f = false;
                        break;
                    }
                } else {
                    syVar.F.f = true;
                    break;
                }
                break;
            case 2:
                fz fzVar = (fz) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        fzVar.G.f = false;
                        break;
                    }
                } else {
                    fzVar.G.f = true;
                    break;
                }
                break;
            default:
                nz nzVar = (nz) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        nzVar.Q.f = false;
                        break;
                    }
                } else {
                    nzVar.Q.f = true;
                    break;
                }
                break;
        }
        return false;
    }
}
