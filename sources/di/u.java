package di;

import ai.r0;
import android.widget.FrameLayout;
import android.widget.ImageView;
import ci.y4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class u extends bb {
    public final int X;
    public final CharSequence Y;
    public s61 Z;

    public u(n2 n2Var, String str, r0 r0Var) {
        super(n2Var, true, false, n2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = n2Var.getCurrentAccount();
        this.Y = str;
        O();
        this.v = 0.6f;
        this.y = true;
        this.E = true;
        fixNavigationBar();
        L();
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        im0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new y4(1, this, r0Var));
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        return this.Y;
    }

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        s61 s61Var = new s61(im0Var, getContext(), this.X, 0, false, new ai.q(this, 11), this.resourcesProvider);
        this.Z = s61Var;
        s61Var.r = false;
        return s61Var;
    }
}
