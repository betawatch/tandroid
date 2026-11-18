package fi;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;
import org.telegram.messenger.ks;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class b5 extends f4 {
    public final /* synthetic */ f9 O;
    public final /* synthetic */ i5 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(Context context, i5 i5Var, f9 f9Var) {
        super(context);
        this.P = i5Var;
        this.O = f9Var;
        this.x = -1;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.J = new GestureDetector(new c4(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.I = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, i0.a.o(-16777216, ks.q2)});
    }

    @Override // fi.f4
    public final void b(int i7) {
        b9 b9Var;
        i5 i5Var = this.P;
        c5 c5Var = i5Var.F;
        if (i5Var.x) {
            return;
        }
        if (c5Var.getCurrentItem() != i7) {
            try {
                c5Var.x(i7, false);
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
                c5Var.getAdapter().g();
                c5Var.x(i7, false);
            }
        }
        f9 f9Var = this.O;
        if (f9Var.O0 == null || (b9Var = f9Var.u0) == null) {
            return;
        }
        if (i7 < 10) {
            b9Var.b(false);
        } else if (i7 >= this.F.size() - 10) {
            f9Var.u0.b(true);
        }
    }
}
