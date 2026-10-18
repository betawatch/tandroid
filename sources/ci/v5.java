package ci;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class v5 extends x4 {
    public final /* synthetic */ aa N;
    public final /* synthetic */ c6 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(Context context, c6 c6Var, aa aaVar) {
        super(context);
        this.O = c6Var;
        this.N = aaVar;
        this.w = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new u4(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, 160)});
    }

    @Override // ci.x4
    public final void b(int i10) {
        w9 w9Var;
        c6 c6Var = this.O;
        w5 w5Var = c6Var.E;
        if (c6Var.w) {
            return;
        }
        if (w5Var.getCurrentItem() != i10) {
            try {
                w5Var.x(i10, false);
            } catch (Throwable th2) {
                FileLog.e(th2);
                w5Var.getAdapter().g();
                w5Var.x(i10, false);
            }
        }
        aa aaVar = this.N;
        if (aaVar.O0 == null || (w9Var = aaVar.t0) == null) {
            return;
        }
        if (i10 < 10) {
            w9Var.b(false);
        } else if (i10 >= this.E.size() - 10) {
            aaVar.t0.b(true);
        }
    }
}
