package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.yy;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                ky kyVar = (ky) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        kyVar.F.f = false;
                        break;
                    }
                } else {
                    kyVar.F.f = true;
                    break;
                }
                break;
            case 2:
                yy yyVar = (yy) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        yyVar.G.f = false;
                        break;
                    }
                } else {
                    yyVar.G.f = true;
                    break;
                }
                break;
            default:
                gz gzVar = (gz) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        gzVar.Q.f = false;
                        break;
                    }
                } else {
                    gzVar.Q.f = true;
                    break;
                }
                break;
        }
        return false;
    }
}
