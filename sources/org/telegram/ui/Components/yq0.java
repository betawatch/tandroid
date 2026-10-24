package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
