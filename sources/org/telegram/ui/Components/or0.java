package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class or0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ or0(pr0 pr0Var, String str, int i3) {
        this.a = i3;
        this.b = pr0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pr0 pr0Var = this.b;
                String str = this.c;
                pr0Var.getClass();
                org.telegram.messenger.g0.h3(new or0(pr0Var, str, 1));
                break;
            default:
                pr0 pr0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                pr0Var2.f = null;
                if (!org.telegram.messenger.t3.T(pr0Var2.n) && pr0Var2.s.g1 != null) {
                    arrayList = new ArrayList(pr0Var2.s.g1.participants.participants);
                }
                pr0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new e7(pr0Var2, str2, arrayList, 26));
                } else {
                    pr0Var2.r = 1;
                }
                pr0Var2.e.g(str2, false, false, true, false, org.telegram.messenger.t3.T(pr0Var2.n) ? pr0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
