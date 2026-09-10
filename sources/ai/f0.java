package ai;

import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class f0 extends ab {
    public final int X;
    public final CharSequence Y;
    public j61 Z;

    public f0(p2 p2Var, String str, b bVar) {
        super(p2Var, true, false, p2Var.getResourceProvider());
        new FrameLayout(getContext());
        new ImageView(getContext());
        this.X = p2Var.getCurrentAccount();
        this.Y = str;
        N();
        this.v = 0.6f;
        this.y = true;
        this.E = true;
        fixNavigationBar();
        K();
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new b0(0, this, bVar));
    }

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        j61 j61Var = new j61(vl0Var, getContext(), this.X, 0, false, new c0(this, 0), this.resourcesProvider);
        this.Z = j61Var;
        j61Var.r = false;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        return this.Y;
    }
}
