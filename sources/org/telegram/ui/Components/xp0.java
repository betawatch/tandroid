package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xp0 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ zp0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp0(zp0 zp0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0, e6Var);
        this.N = zp0Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
