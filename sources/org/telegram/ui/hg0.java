package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hg0 implements org.telegram.ui.Components.am0, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ jg0 a;

    public /* synthetic */ hg0(jg0 jg0Var) {
        this.a = jg0Var;
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.am0
    public void e(float f7, float f10, int i10, View view) {
        jg0.X(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        MessagesController.getInstance(this.a.currentAccount).performLogout(1);
    }

    @Override // org.telegram.ui.Components.am0
    public /* synthetic */ void l0(View view, float f7, float f10) {
    }
}
