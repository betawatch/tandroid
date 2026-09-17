package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
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
