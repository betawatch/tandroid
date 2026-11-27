// default package

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class l45 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l45(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((re4) obj).run();
                break;
            case 1:
                ((rx5) obj).d();
                break;
            case 2:
                String str = LaunchActivity.C1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder m = uh9.m(measuredHeight, "height = ", " displayHeight = ");
                Point point = hl.q;
                c00.q(point.y, m);
                int i = (measuredHeight - hl.n) - hl.m;
                if (i > hl.L(100.0f) && i < point.y && hl.L(100.0f) + i > point.y) {
                    point.y = i;
                    if (f11.a) {
                        c00.q(point.y, new StringBuilder("fix display size y to "));
                        break;
                    }
                }
                break;
            case 3:
                pqb pqbVar = (pqb) obj;
                pqbVar.R = SystemClock.elapsedRealtime() + 1500;
                pqbVar.m0.invalidate();
                break;
            default:
                zuc zucVar = (zuc) obj;
                PopupWindow popupWindow = zucVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    zucVar.c();
                    break;
                }
                break;
        }
    }
}
