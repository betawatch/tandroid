package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class zu extends ov {
    public final /* synthetic */ ov T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(ov ovVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(p2Var, context, g6Var, arrayList);
        this.T = ovVar;
    }

    @Override // org.telegram.ui.Components.ov
    public final void Y() {
        this.T.dismiss();
    }
}
