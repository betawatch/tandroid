package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sp0 extends org.telegram.ui.Cells.c7 {
    public final /* synthetic */ up0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp0(up0 up0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0, c6Var);
        this.J = up0Var;
    }

    @Override // org.telegram.ui.Cells.c7
    public final String a() {
        return this.J.f.W ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
