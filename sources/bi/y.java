package bi;

import ai.o6;
import ai.y1;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class y extends ab {
    public final int X;
    public final CharSequence Y;
    public m61 Z;

    public y(n2 n2Var, String str, y1 y1Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = n2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.y = true;
        this.E = true;
        fixNavigationBar();
        K();
        yl0 yl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new o6(1, this, y1Var));
    }

    @Override // org.telegram.ui.Components.ab
    public final xl0 v(yl0 yl0Var) {
        m61 m61Var = new m61(yl0Var, getContext(), this.X, 0, false, new v(this, 0), this.resourcesProvider);
        this.Z = m61Var;
        m61Var.r = false;
        return m61Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return this.Y;
    }
}
