package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bh0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ dh0 a;

    public /* synthetic */ bh0(dh0 dh0Var) {
        this.a = dh0Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        dh0.W(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        MessagesController.getInstance(this.a.currentAccount).performLogout(1);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
