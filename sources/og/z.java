package og;

import android.content.Context;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.p4;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gr;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z extends p4 {
    public final f6 r;

    public z(Context context, p6 p6Var) {
        super(context, p6Var);
        f6 f6Var = new f6(context, true, true, true);
        this.r = f6Var;
        f6Var.b(0.45f, 240L, gr.h);
        f6Var.setGravity(cd.X ? 3 : 5);
        f6Var.setTextSize(i0.L(15.0f));
        f6Var.setTypeface(i0.o());
        a7.Z(f6Var, t6.L6, p6Var);
        addView(f6Var, b6.d(-2, 24.0f, (cd.X ? 3 : 5) | 80, 24.0f, 0.0f, 24.0f, 0.0f));
        a7.i(t6.h5, this, p6Var);
    }
}
