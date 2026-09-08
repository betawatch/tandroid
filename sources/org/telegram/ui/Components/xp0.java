package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class xp0 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ zp0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp0(zp0 zp0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0, f6Var);
        this.N = zp0Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
