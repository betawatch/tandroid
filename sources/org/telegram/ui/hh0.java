package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ hh0(jh0 jh0Var, String str, int i3) {
        this.a = i3;
        this.b = jh0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jh0 jh0Var = this.b;
                String str = this.c;
                jh0Var.getClass();
                org.telegram.messenger.g0.h3(new hh0(jh0Var, str, 1));
                break;
            default:
                jh0 jh0Var2 = this.b;
                String str2 = this.c;
                kg.v1 v1Var = jh0Var2.h;
                int i3 = jh0Var2.n.s;
                v1Var.g(str2, true, (i3 == 1 || i3 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.g.c(new hc0(jh0Var2, str2, new ArrayList(jh0Var2.n.x), 11));
                break;
        }
    }
}
