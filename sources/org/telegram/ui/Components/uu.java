package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uu extends jv {
    public final /* synthetic */ jv S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu(jv jvVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(o2Var, context, c6Var, arrayList);
        this.S = jvVar;
    }

    @Override // org.telegram.ui.Components.jv
    public final void Y() {
        this.S.dismiss();
    }
}
