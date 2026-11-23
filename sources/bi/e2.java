package bi;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e2 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new e2());
    }

    @Override // org.telegram.ui.Components.m41
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        ah.r rVar = (ah.r) view;
        rVar.setUser((TLRPC.User) n41Var.H);
        CharSequence charSequence = n41Var.n;
        if (charSequence != null) {
            rVar.setSubtitle(charSequence);
            rVar.setSubtitleColorKey(org.telegram.ui.ActionBar.n6.r5);
        }
        rVar.setOptions(n41Var.E);
        rVar.setDivider(z10);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        ah.r rVar = new ah.r(context, false, false, i6Var, false);
        rVar.setCellBackgroundVisible(false);
        return rVar;
    }
}
