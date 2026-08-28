package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class hp0 extends org.telegram.ui.Cells.e7 {
    public final /* synthetic */ jp0 J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp0(jp0 jp0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 0, b6Var);
        this.J = jp0Var;
    }

    @Override // org.telegram.ui.Cells.e7
    public final String a() {
        return this.J.f.W ? LocaleController.getString(R.string.RepostToStory) : LocaleController.getString(R.string.FwdMyStory);
    }
}
