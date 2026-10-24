package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg0 implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ lg0 a;

    public /* synthetic */ jg0(lg0 lg0Var) {
        this.a = lg0Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void c(float f7, float f10, int i10, View view) {
        lg0.W(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        MessagesController.getInstance(this.a.currentAccount).performLogout(1);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void a0(View view, float f7, float f10) {
    }
}
