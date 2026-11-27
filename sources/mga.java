// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mga extends p79 {
    public final /* synthetic */ gga a;

    public mga(gga ggaVar) {
        this.a = ggaVar;
    }

    @Override // p79
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        if (!(view instanceof jja)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        jja jjaVar = (jja) view;
        gga ggaVar = this.a;
        ggaVar.n.getClass();
        int S = RecyclerView.S(jjaVar);
        int i = ggaVar.r.J;
        jjaVar.b0 = S < i;
        int i2 = S % i;
        jjaVar.W = i2 == 0;
        jjaVar.a0 = i2 == i - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
