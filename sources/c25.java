// default package

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c25 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c25(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((jf4) obj).run();
                break;
            case 1:
                ((mv5) obj).d();
                break;
            case 2:
                String str = LaunchActivity.C1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder m = de9.m(measuredHeight, "height = ", " displayHeight = ");
                Point point = gl.q;
                b00.p(point.y, m);
                int i = (measuredHeight - gl.n) - gl.m;
                if (i > gl.L(100.0f) && i < point.y && gl.L(100.0f) + i > point.y) {
                    point.y = i;
                    if (w01.a) {
                        b00.p(point.y, new StringBuilder("fix display size y to "));
                        break;
                    }
                }
                break;
            case 3:
                qmb qmbVar = (qmb) obj;
                qmbVar.R = SystemClock.elapsedRealtime() + 1500;
                qmbVar.m0.invalidate();
                break;
            default:
                lqc lqcVar = (lqc) obj;
                PopupWindow popupWindow = lqcVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    lqcVar.c();
                    break;
                }
                break;
        }
    }
}
