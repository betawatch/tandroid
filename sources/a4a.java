// default package

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.GestureDetector;
import android.view.animation.OvershootInterpolator;
import android.widget.Scroller;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class a4a extends h3a {
    public final /* synthetic */ lcb O;
    public final /* synthetic */ g4a P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4a(g4a g4aVar, lcb lcbVar, Context context) {
        super(context);
        this.P = g4aVar;
        this.O = lcbVar;
        this.x = -1;
        this.F = new ArrayList();
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.J = new GestureDetector(new f3a(this));
        this.d = new Scroller(context, new OvershootInterpolator());
        this.I = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{0, vm2.o(-16777216, jn7.p2)});
    }

    @Override // h3a
    public final void b(int i) {
        hcb hcbVar;
        g4a g4aVar = this.P;
        b4a b4aVar = g4aVar.F;
        if (g4aVar.x) {
            return;
        }
        if (b4aVar.getCurrentItem() != i) {
            try {
                b4aVar.x(i, false);
            } catch (Throwable th) {
                cc4.g(th, true);
                b4aVar.getAdapter().g();
                b4aVar.x(i, false);
            }
        }
        lcb lcbVar = this.O;
        if (lcbVar.O0 == null || (hcbVar = lcbVar.u0) == null) {
            return;
        }
        if (i < 10) {
            hcbVar.f(false);
        } else if (i >= this.F.size() - 10) {
            lcbVar.u0.f(true);
        }
    }
}
