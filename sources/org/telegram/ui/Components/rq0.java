package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class rq0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ tq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(tq0 tq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = tq0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
