package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u3 b;

    public /* synthetic */ s3(u3 u3Var, int i7) {
        this.a = i7;
        this.b = u3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u3 u3Var = this.b;
                View view = u3Var.m;
                if (view.getWindowVisibility() == 0 && view.isShown()) {
                    t3 t3Var = u3Var.s;
                    t3Var.getClass();
                    System.currentTimeMillis();
                    t3Var.c = false;
                    u3Var.s.a();
                    break;
                }
                break;
            default:
                u3 u3Var2 = this.b;
                View view2 = u3Var2.m;
                if (view2.getWindowVisibility() == 0 && view2.isShown()) {
                    t3 t3Var2 = u3Var2.s;
                    t3Var2.b = false;
                    t3Var2.a();
                    break;
                }
                break;
        }
    }
}
