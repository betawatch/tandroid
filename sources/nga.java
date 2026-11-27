// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class nga extends p79 {
    public final /* synthetic */ gga a;
    public final /* synthetic */ eja b;

    public nga(eja ejaVar, gga ggaVar) {
        this.b = ejaVar;
        this.a = ggaVar;
    }

    @Override // p79
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        gga ggaVar = this.a;
        if (ggaVar.h.getAdapter() == this.b.R) {
            int S = RecyclerView.S(view);
            rect.left = 0;
            rect.bottom = 0;
            hga hgaVar = ggaVar.x;
            hgaVar.z1();
            if (S <= hgaVar.U) {
                rect.top = 0;
            } else {
                rect.top = hl.L(2.0f);
            }
            rect.right = ggaVar.x.C1(S) ? 0 : hl.L(2.0f);
            return;
        }
        if (!(view instanceof jja)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        jja jjaVar = (jja) view;
        ggaVar.h.getClass();
        int S2 = RecyclerView.S(jjaVar);
        int i = ggaVar.x.J;
        jjaVar.b0 = S2 < i;
        int i2 = S2 % i;
        jjaVar.W = i2 == 0;
        jjaVar.a0 = i2 == i - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
