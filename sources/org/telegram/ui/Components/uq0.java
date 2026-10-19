package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class uq0 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ wq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(wq0 wq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = wq0Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final String a() {
        return this.N.f.b0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
