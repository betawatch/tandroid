package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hf0 implements org.telegram.ui.Components.ik0, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ jf0 a;

    public /* synthetic */ hf0(jf0 jf0Var) {
        this.a = jf0Var;
    }

    @Override // org.telegram.ui.Components.ik0
    public void b(float f7, float f10, int i10, View view) {
        jf0.b0(this.a, i10);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        org.telegram.messenger.wp.r1(this.a.currentAccount).x3(1);
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ boolean h1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.ik0
    public /* synthetic */ void q0(View view, float f7, float f10) {
    }
}
