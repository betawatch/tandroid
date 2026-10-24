package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.ty;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                b2 b2Var = e2Var.G;
                Handler handler = e2Var.K;
                y yVar = e2Var.O;
                int action = motionEvent.getAction();
                int x10 = (int) motionEvent.getX();
                int y3 = (int) motionEvent.getY();
                if (action == 0 && yVar != null && yVar.isShowing() && x10 >= 0 && x10 < yVar.getWidth() && y3 >= 0 && y3 < yVar.getHeight()) {
                    handler.postDelayed(b2Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(b2Var);
                    break;
                }
                break;
            case 1:
                ty tyVar = (ty) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        tyVar.F.f = false;
                        break;
                    }
                } else {
                    tyVar.F.f = true;
                    break;
                }
                break;
            case 2:
                gz gzVar = (gz) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        gzVar.G.f = false;
                        break;
                    }
                } else {
                    gzVar.G.f = true;
                    break;
                }
                break;
            default:
                oz ozVar = (oz) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        ozVar.Q.f = false;
                        break;
                    }
                } else {
                    ozVar.Q.f = true;
                    break;
                }
                break;
        }
        return false;
    }
}
