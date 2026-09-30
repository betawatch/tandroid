package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class mq0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ oq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq0(oq0 oq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = oq0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
