package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class yp0 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ aq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp0(aq0 aq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0, f6Var);
        this.N = aq0Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
