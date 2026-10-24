package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class yq0 extends org.telegram.ui.Cells.g7 {
    public final /* synthetic */ ar0 N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq0(ar0 ar0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0, g6Var);
        this.N = ar0Var;
    }

    @Override // org.telegram.ui.Cells.g7
    public final String a() {
        return this.N.f.b0 ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
