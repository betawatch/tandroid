package fh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f4 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new f4());
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        l80 l80Var = (l80) view;
        l80Var.setGravity(l41Var.z);
        l80Var.setTextColor((int) l41Var.B);
        l80Var.setTextSize(1, l41Var.A);
        l80Var.setTypeface(l41Var.q ? AndroidUtilities.bold() : null);
        int i9 = l41Var.i;
        l80Var.setPadding(i9, 0, i9, l41Var.k);
        l80Var.setText(l41Var.l);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new e4(context, 0, null);
    }
}
