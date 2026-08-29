package gg;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.jq;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f0 extends y8 {
    public final c6 v;

    public f0(Context context, c6 c6Var) {
        super(context, c6Var);
        this.v = c6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i10 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i11 = g6.b7;
        c6 c6Var = this.v;
        jq jqVar = new jq(new ColorDrawable(g6.v0(g6.a7, c6Var)), g6.U0(context, i10, g6.v0(i11, c6Var)), 0, 0);
        jqVar.w = true;
        setBackground(jqVar);
    }
}
