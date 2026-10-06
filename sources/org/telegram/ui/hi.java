package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class hi extends org.telegram.ui.Components.wv {
    public final /* synthetic */ yn W;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi(yn ynVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, activity, d6Var, arrayList);
        this.W = ynVar;
    }

    @Override // org.telegram.ui.Components.wv, org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        yn ynVar = this.W;
        ynVar.getClass();
        ynVar.g8(false, true, 0.0f);
    }
}
