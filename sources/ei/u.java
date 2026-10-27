package ei;

import android.widget.FrameLayout;
import android.widget.ImageView;
import di.x4;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class u extends bb {
    public final int X;
    public final CharSequence Y;
    public k71 Z;

    public u(r2 r2Var, String str, ai.i iVar) {
        super(r2Var, true, false, r2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = r2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.y = true;
        this.E = true;
        fixNavigationBar();
        K();
        nm0 nm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        nm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new x4(1, this, iVar));
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        k71 k71Var = new k71(nm0Var, getContext(), this.X, 0, false, new ai.e(this, 14), this.resourcesProvider);
        this.Z = k71Var;
        k71Var.r = false;
        return k71Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        return this.Y;
    }
}
