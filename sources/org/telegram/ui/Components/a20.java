package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ a20(c20 c20Var, String str, int i3, int i10) {
        this.a = i10;
        this.b = c20Var;
        this.c = str;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c20 c20Var = this.b;
                String str = this.c;
                int i3 = this.d;
                if (c20Var.e != null) {
                    c20Var.e = null;
                    org.telegram.messenger.g0.h3(new a20(c20Var, str, i3, 1));
                    break;
                }
                break;
            default:
                c20 c20Var2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                ArrayList arrayList = null;
                c20Var2.e = null;
                if (!org.telegram.messenger.t3.T(c20Var2.x.N1) && c20Var2.x.O1 != null) {
                    arrayList = new ArrayList(c20Var2.x.O1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.g.c(new bi.q0(c20Var2, str2, i10, arrayList2, 25));
                } else {
                    c20Var2.h = false;
                }
                c20Var2.d.g(str2, org.telegram.messenger.t3.w(3, c20Var2.x.N1), false, true, false, org.telegram.messenger.t3.T(c20Var2.x.N1) ? c20Var2.x.N1.id : 0L, false, 2, i10);
                break;
        }
    }
}
