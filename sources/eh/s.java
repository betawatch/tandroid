package eh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new s());
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        u00 u00Var = new u00(context, null);
        u00Var.setViewType(16);
        u00Var.setMinimumHeight(AndroidUtilities.dp(48.0f));
        return u00Var;
    }
}
