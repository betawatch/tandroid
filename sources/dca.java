// default package

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class dca implements View.OnTouchListener {
    public final /* synthetic */ byte a;
    public final Rect b;
    public final /* synthetic */ tca c;

    public dca(tca tcaVar, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.c = tcaVar;
                this.b = new Rect();
                break;
            default:
                this.c = tcaVar;
                this.b = new Rect();
                break;
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        m8 m8Var;
        m8 m8Var2;
        byte b = this.a;
        tca tcaVar = this.c;
        Rect rect = this.b;
        switch (b) {
            case 0:
                if (motionEvent.getActionMasked() == 0 && (m8Var = tcaVar.E2) != null && m8Var.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        tcaVar.E2.d(true);
                        break;
                    }
                }
                break;
            default:
                if (motionEvent.getActionMasked() == 0 && (m8Var2 = tcaVar.E2) != null && m8Var2.isShowing()) {
                    view.getHitRect(rect);
                    if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        tcaVar.E2.d(true);
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
