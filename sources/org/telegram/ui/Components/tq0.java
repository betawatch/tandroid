package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class tq0 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ vq0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(vq0 vq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0, d6Var);
        this.N = vq0Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final String a() {
        return this.N.f.a0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
