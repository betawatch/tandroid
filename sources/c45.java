// default package

import android.graphics.Point;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class c45 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c45(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((if4) obj).run();
                break;
            case 1:
                ((mx5) obj).d();
                break;
            case 2:
                String str = LaunchActivity.C1;
                int measuredHeight = ((View) obj).getMeasuredHeight();
                StringBuilder l = hg9.l(measuredHeight, "height = ", " displayHeight = ");
                Point point = gm.q;
                b10.p(point.y, l);
                int i = (measuredHeight - gm.n) - gm.m;
                if (i > gm.L(100.0f) && i < point.y && gm.L(100.0f) + i > point.y) {
                    point.y = i;
                    if (e21.a) {
                        b10.p(point.y, new StringBuilder("fix display size y to "));
                        break;
                    }
                }
                break;
            case 3:
                rob robVar = (rob) obj;
                robVar.R = SystemClock.elapsedRealtime() + 1500;
                robVar.m0.invalidate();
                break;
            default:
                nsc nscVar = (nsc) obj;
                PopupWindow popupWindow = nscVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    nscVar.c();
                    break;
                }
                break;
        }
    }
}
