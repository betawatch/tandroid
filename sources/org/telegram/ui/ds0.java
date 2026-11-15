package org.telegram.ui;

import android.view.View;
import java.io.Serializable;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ds0 implements org.telegram.ui.ActionBar.q1, org.telegram.messenger.x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ es0 b;

    public /* synthetic */ ds0(es0 es0Var, int i7) {
        this.a = i7;
        this.b = es0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 0:
                this.b.d0();
                break;
            default:
                this.b.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        View view = (View) obj2;
        if (((org.telegram.ui.Components.b41) obj).d == 1) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            boolean z10 = !q8Var.e.h;
            es0 es0Var = this.b;
            es0Var.n = z10;
            q8Var.setChecked(z10);
            es0Var.d.g3.O(true);
            es0Var.a0(true);
        }
    }
}
