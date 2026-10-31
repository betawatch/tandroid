package ih;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new n());
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, p6 p6Var) {
        zz zzVar = new zz(context, null);
        zzVar.setViewType(16);
        zzVar.setMinimumHeight(i0.L(48.0f));
        return zzVar;
    }
}
