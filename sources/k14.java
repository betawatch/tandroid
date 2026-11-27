// default package

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class k14 implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k14(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                o24 o24Var = ((o14) obj).G;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        o24Var.f = false;
                        break;
                    }
                } else {
                    o24Var.f = true;
                    break;
                }
                break;
            case 1:
                o24 o24Var2 = ((c24) obj).H;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        o24Var2.f = false;
                        break;
                    }
                } else {
                    o24Var2.f = true;
                    break;
                }
                break;
            case 2:
                o24 o24Var3 = ((j24) obj).R;
                if (motionEvent.getAction() != 0) {
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        o24Var3.f = false;
                        break;
                    }
                } else {
                    o24Var3.f = true;
                    break;
                }
                break;
            default:
                s76 s76Var = (s76) obj;
                q76 q76Var = s76Var.H;
                Handler handler = s76Var.L;
                op opVar = s76Var.P;
                int action = motionEvent.getAction();
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && opVar != null && opVar.isShowing() && x >= 0 && x < opVar.getWidth() && y >= 0 && y < opVar.getHeight()) {
                    handler.postDelayed(q76Var, 250L);
                    break;
                } else if (action == 1) {
                    handler.removeCallbacks(q76Var);
                    break;
                }
                break;
        }
        return false;
    }
}
