package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class li extends org.telegram.ui.Components.qu {
    public final /* synthetic */ an N1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li(an anVar, org.telegram.ui.ActionBar.f2 f2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(f2Var, activity, f6Var, arrayList);
        this.N1 = anVar;
    }

    @Override // org.telegram.ui.Components.qu, org.telegram.ui.ActionBar.v2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.b2
    public final void dismiss() {
        super.dismiss();
        an anVar = this.N1;
        anVar.getClass();
        anVar.v8(false, true, 0.0f);
    }
}
