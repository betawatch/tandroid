package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ e20(g20 g20Var, String str, int i7, int i10) {
        this.a = i10;
        this.b = g20Var;
        this.c = str;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g20 g20Var = this.b;
                String str = this.c;
                int i7 = this.d;
                if (g20Var.e != null) {
                    g20Var.e = null;
                    org.telegram.messenger.g0.h3(new e20(g20Var, str, i7, 1));
                    break;
                }
                break;
            default:
                g20 g20Var2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                ArrayList arrayList = null;
                g20Var2.e = null;
                if (!org.telegram.messenger.t3.T(g20Var2.x.M1) && g20Var2.x.N1 != null) {
                    arrayList = new ArrayList(g20Var2.x.N1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.g.c(new ai.a1(g20Var2, str2, i10, arrayList2, 24));
                } else {
                    g20Var2.h = false;
                }
                g20Var2.d.g(str2, org.telegram.messenger.t3.w(3, g20Var2.x.M1), false, true, false, org.telegram.messenger.t3.T(g20Var2.x.M1) ? g20Var2.x.M1.id : 0L, false, 2, i10);
                break;
        }
    }
}
