package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class iq0 extends org.telegram.ui.Cells.h7 {
    public final /* synthetic */ kq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iq0(kq0 kq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0, f6Var);
        this.N = kq0Var;
    }

    @Override // org.telegram.ui.Cells.h7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
