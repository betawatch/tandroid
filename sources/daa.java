// default package

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class daa implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final Rect b;
    public final /* synthetic */ taa c;

    public daa(taa taaVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = taaVar;
                this.b = new Rect();
                break;
            default:
                this.c = taaVar;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m8 m8Var;
        m8 m8Var2;
        byte b = this.a;
        taa taaVar = this.c;
        Rect rect = this.b;
        switch (b) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m8Var = taaVar.E2) != null && m8Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        taaVar.E2.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (m8Var2 = taaVar.E2) != null && m8Var2.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        taaVar.E2.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
