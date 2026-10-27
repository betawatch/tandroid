package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ lg0 a;

    public /* synthetic */ jg0(lg0 lg0Var) {
        this.a = lg0Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void e(float f7, float f10, int i10, View view) {
        lg0.X(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        MessagesController.getInstance(this.a.currentAccount).performLogout(1);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
