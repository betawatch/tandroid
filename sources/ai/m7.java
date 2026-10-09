package ai;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class m7 extends n6 {
    public final /* synthetic */ kc N;
    public final /* synthetic */ t7 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(t7 t7Var, kc kcVar, Context context) {
        super(context);
        this.O = t7Var;
        this.N = kcVar;
        this.w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new k6(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.k(-16777216, 160)});
    }

    @Override // ai.n6
    public final void b(int i10) {
        gc gcVar;
        t7 t7Var = this.O;
        n7 n7Var = t7Var.E;
        if (t7Var.w) {
            return;
        }
        if (n7Var.getCurrentItem() != i10) {
            try {
                n7Var.x(i10, false);
            } catch (Throwable th2) {
                FileLog.e(th2);
                n7Var.getAdapter().g();
                n7Var.x(i10, false);
            }
        }
        kc kcVar = this.N;
        if (kcVar.O0 == null || (gcVar = kcVar.t0) == null) {
            return;
        }
        if (i10 < 10) {
            gcVar.b(false);
        } else if (i10 >= this.E.size() - 10) {
            kcVar.t0.b(true);
        }
    }
}
