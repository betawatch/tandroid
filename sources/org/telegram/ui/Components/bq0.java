package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class bq0 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ dq0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bq0(dq0 dq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0, f6Var);
        this.K = dq0Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final String a() {
        return this.K.f.X ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
