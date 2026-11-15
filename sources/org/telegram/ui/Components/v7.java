package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class v7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ v7(x7 x7Var, String str, int i7) {
        this.a = i7;
        this.b = x7Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x7 x7Var = this.b;
                String str = this.c;
                x7Var.f = null;
                org.telegram.messenger.g0.h3(new v7(x7Var, str, 1));
                break;
            default:
                x7 x7Var2 = this.b;
                String str2 = this.c;
                x7Var2.getClass();
                Utilities.g.c(new w7(x7Var2, str2, new ArrayList(x7Var2.n.r2)));
                break;
        }
    }
}
