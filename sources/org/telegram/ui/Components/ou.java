package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ou extends dv {
    public final /* synthetic */ dv S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ou(dv dvVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, ArrayList arrayList) {
        super(o2Var, context, b6Var, arrayList);
        this.S = dvVar;
    }

    @Override // org.telegram.ui.Components.dv
    public final void X() {
        this.S.dismiss();
    }
}
