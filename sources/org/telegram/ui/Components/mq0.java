package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class mq0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ oq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq0(oq0 oq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0, f6Var);
        this.N = oq0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
