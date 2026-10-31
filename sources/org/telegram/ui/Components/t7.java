package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ t7(v7 v7Var, String str, int i10) {
        this.a = i10;
        this.b = v7Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v7 v7Var = this.b;
                String str = this.c;
                v7Var.f = null;
                org.telegram.messenger.i0.g3(new t7(v7Var, str, 1));
                break;
            default:
                v7 v7Var2 = this.b;
                String str2 = this.c;
                v7Var2.getClass();
                Utilities.g.c(new u7(v7Var2, str2, new ArrayList(v7Var2.n.n2)));
                break;
        }
    }
}
