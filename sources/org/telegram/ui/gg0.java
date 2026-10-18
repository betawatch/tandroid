package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gg0 implements org.telegram.ui.Components.xl0, org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ ig0 a;

    public /* synthetic */ gg0(ig0 ig0Var) {
        this.a = ig0Var;
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.xl0
    public void d(float f7, float f10, int i10, View view) {
        ig0.W(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        MessagesController.getInstance(this.a.currentAccount).performLogout(1);
    }

    @Override // org.telegram.ui.Components.xl0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
