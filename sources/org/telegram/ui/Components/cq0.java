package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class cq0 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ eq0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq0(eq0 eq0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0, g6Var);
        this.K = eq0Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final String a() {
        return this.K.f.X ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
