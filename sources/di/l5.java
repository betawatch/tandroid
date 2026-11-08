package di;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class l5 extends o4 {
    public final /* synthetic */ p9 N;
    public final /* synthetic */ s5 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(Context context, s5 s5Var, p9 p9Var) {
        super(context);
        this.O = s5Var;
        this.N = p9Var;
        this.x = -1;
        this.E = new ArrayList();
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.I = new GestureDetector(new l4(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.H = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, qs.q2)});
    }

    @Override // di.o4
    public final void b(int i7) {
        l9 l9Var;
        s5 s5Var = this.O;
        m5 m5Var = s5Var.E;
        if (s5Var.x) {
            return;
        }
        if (m5Var.getCurrentItem() != i7) {
            try {
                m5Var.x(i7, false);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
                m5Var.getAdapter().g();
                m5Var.x(i7, false);
            }
        }
        p9 p9Var = this.N;
        if (p9Var.N0 == null || (l9Var = p9Var.t0) == null) {
            return;
        }
        if (i7 < 10) {
            l9Var.b(false);
        } else if (i7 >= this.E.size() - 10) {
            p9Var.t0.b(true);
        }
    }
}
