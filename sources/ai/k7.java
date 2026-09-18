package ai;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes4.dex */
public final class k7 extends n6 {
    public final /* synthetic */ jc N;
    public final /* synthetic */ r7 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(r7 r7Var, jc jcVar, Context context) {
        super(context);
        this.O = r7Var;
        this.N = jcVar;
        this.w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new k6(0, this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override // ai.n6
    public final void b(int i10) {
        fc fcVar;
        r7 r7Var = this.O;
        l7 l7Var = r7Var.E;
        if (r7Var.w) {
            return;
        }
        if (l7Var.getCurrentItem() != i10) {
            try {
                l7Var.x(i10, false);
            } catch (Throwable th2) {
                FileLog.e(th2);
                l7Var.getAdapter().g();
                l7Var.x(i10, false);
            }
        }
        jc jcVar = this.N;
        if (jcVar.O0 == null || (fcVar = jcVar.t0) == null) {
            return;
        }
        if (i10 < 10) {
            fcVar.b(false);
        } else if (i10 >= this.E.size() - 10) {
            jcVar.t0.b(true);
        }
    }
}
