package di;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class u5 extends w4 {
    public final /* synthetic */ y9 N;
    public final /* synthetic */ b6 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(Context context, b6 b6Var, y9 y9Var) {
        super(context);
        this.O = b6Var;
        this.N = y9Var;
        this.w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new t4(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 160)});
    }

    @Override // di.w4
    public final void b(int i10) {
        u9 u9Var;
        b6 b6Var = this.O;
        v5 v5Var = b6Var.E;
        if (b6Var.w) {
            return;
        }
        if (v5Var.getCurrentItem() != i10) {
            try {
                v5Var.x(i10, false);
            } catch (Throwable th2) {
                FileLog.e(th2);
                v5Var.getAdapter().g();
                v5Var.x(i10, false);
            }
        }
        y9 y9Var = this.N;
        if (y9Var.O0 == null || (u9Var = y9Var.t0) == null) {
            return;
        }
        if (i10 < 10) {
            u9Var.b(false);
        } else if (i10 >= this.E.size() - 10) {
            y9Var.t0.b(true);
        }
    }
}
