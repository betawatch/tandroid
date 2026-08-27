package m;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.wx;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                int x8 = (int) motionEvent.getX();
                int y10 = (int) motionEvent.getY();
                if (action == 0 && yVar != null && yVar.isShowing() && x8 >= 0 && x8 < yVar.getWidth() && y10 >= 0 && y10 < yVar.getHeight()) {
                    handler.postDelayed(b2Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(b2Var);
                    break;
                }
                break;
            case 1:
                wx wxVar = (wx) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        wxVar.B.f = false;
                        break;
                    }
                } else {
                    wxVar.B.f = true;
                    break;
                }
                break;
            case 2:
                ky kyVar = (ky) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        kyVar.C.f = false;
                        break;
                    }
                } else {
                    kyVar.C.f = true;
                    break;
                }
                break;
            default:
                ty tyVar = (ty) this.b;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        tyVar.M.f = false;
                        break;
                    }
                } else {
                    tyVar.M.f = true;
                    break;
                }
                break;
        }
        return false;
    }
}
