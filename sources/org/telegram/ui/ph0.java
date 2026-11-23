package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ph0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qh0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ph0(qh0 qh0Var, String str, int i7) {
        this.a = i7;
        this.b = qh0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qh0 qh0Var = this.b;
                String str = this.c;
                qh0Var.getClass();
                org.telegram.messenger.g0.g3(new ph0(qh0Var, str, 1));
                break;
            default:
                qh0 qh0Var2 = this.b;
                String str2 = this.c;
                jg.z1 z1Var = qh0Var2.h;
                int i7 = qh0Var2.n.s;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.g.c(new lc0(qh0Var2, str2, new ArrayList(qh0Var2.n.x), 10));
                break;
        }
    }
}
