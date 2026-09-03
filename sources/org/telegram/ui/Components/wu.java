package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class wu extends lv {
    public final /* synthetic */ lv T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(lv lvVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(p2Var, context, f6Var, arrayList);
        this.T = lvVar;
    }

    @Override // org.telegram.ui.Components.lv
    public final void Y() {
        this.T.dismiss();
    }
}
