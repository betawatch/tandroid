package ih;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class f2 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new f2());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        ((g2) view).a(w41Var.d, (ArrayList) w41Var.G, w41Var.z, (Utilities.Callback) w41Var.H);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        return w41Var.z == w41Var2.z && w41Var.H == w41Var2.H && equals(w41Var, w41Var2);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new g2(context, true);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.d == w41Var2.d) {
            ArrayList arrayList = (ArrayList) w41Var.G;
            ArrayList arrayList2 = (ArrayList) w41Var2.G;
            if (arrayList == arrayList2) {
                return true;
            }
            if (arrayList == null && arrayList2 == null) {
                return true;
            }
            if (arrayList != null && arrayList2 != null && arrayList.size() == arrayList2.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) arrayList2.get(i10))) {
                    }
                }
                return true;
            }
        }
        return false;
    }
}
