package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
