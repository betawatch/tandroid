package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.xy;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                jy jyVar = (jy) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        jyVar.F.f = false;
                        break;
                    }
                } else {
                    jyVar.F.f = true;
                    break;
                }
                break;
            case 2:
                xy xyVar = (xy) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        xyVar.G.f = false;
                        break;
                    }
                } else {
                    xyVar.G.f = true;
                    break;
                }
                break;
            default:
                fz fzVar = (fz) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        fzVar.Q.f = false;
                        break;
                    }
                } else {
                    fzVar.Q.f = true;
                    break;
                }
                break;
        }
        return false;
    }
}
