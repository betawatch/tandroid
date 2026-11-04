package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ w7(y7 y7Var, String str, int i3) {
        this.a = i3;
        this.b = y7Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y7 y7Var = this.b;
                String str = this.c;
                y7Var.f = null;
                org.telegram.messenger.g0.h3(new w7(y7Var, str, 1));
                break;
            default:
                y7 y7Var2 = this.b;
                String str2 = this.c;
                y7Var2.getClass();
                Utilities.g.c(new x7(y7Var2, str2, new ArrayList(y7Var2.n.o2)));
                break;
        }
    }
}
