package bi;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class t6 extends w5 {
    public final /* synthetic */ pb N;
    public final /* synthetic */ a7 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(Context context, a7 a7Var, pb pbVar) {
        super(context);
        this.O = a7Var;
        this.N = pbVar;
        this.w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new t5(0, this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override // bi.w5
    public final void b(int i10) {
        lb lbVar;
        a7 a7Var = this.O;
        u6 u6Var = a7Var.E;
        if (a7Var.w) {
            return;
        }
        if (u6Var.getCurrentItem() != i10) {
            try {
                u6Var.x(i10, false);
            } catch (Throwable th2) {
                FileLog.e(th2);
                u6Var.getAdapter().g();
                u6Var.x(i10, false);
            }
        }
        pb pbVar = this.N;
        if (pbVar.O0 == null || (lbVar = pbVar.t0) == null) {
            return;
        }
        if (i10 < 10) {
            lbVar.e(false);
        } else if (i10 >= this.E.size() - 10) {
            pbVar.t0.e(true);
        }
    }
}
