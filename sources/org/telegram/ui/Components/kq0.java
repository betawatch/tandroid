package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class kq0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ mq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(mq0 mq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = mq0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
