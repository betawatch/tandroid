package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class lq0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ nq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq0(nq0 nq0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0, e6Var);
        this.N = nq0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
