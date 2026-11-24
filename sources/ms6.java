// default package

import android.view.animation.Animation;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ms6 implements Animation.AnimationListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ws6 b;

    public /* synthetic */ ms6(ws6 ws6Var, byte b) {
        this.a = b;
        this.b = ws6Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                this.b.j(true);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        byte b = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                break;
            default:
                ws6 ws6Var = this.b;
                OverlayListView overlayListView = ws6Var.V;
                ArrayList arrayList = overlayListView.a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    hr7 hr7Var = (hr7) obj;
                    if (!hr7Var.j) {
                        hr7Var.i = overlayListView.getDrawingTime();
                        hr7Var.j = true;
                    }
                }
                ws6Var.V.postDelayed(ws6Var.F0, ws6Var.y0);
                break;
        }
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
