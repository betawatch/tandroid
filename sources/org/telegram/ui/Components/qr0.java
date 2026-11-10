package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ qr0(rr0 rr0Var, String str, int i7) {
        this.a = i7;
        this.b = rr0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rr0 rr0Var = this.b;
                String str = this.c;
                rr0Var.getClass();
                org.telegram.messenger.g0.h3(new qr0(rr0Var, str, 1));
                break;
            default:
                rr0 rr0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                rr0Var2.f = null;
                if (!org.telegram.messenger.t3.T(rr0Var2.n) && rr0Var2.s.f1 != null) {
                    arrayList = new ArrayList(rr0Var2.s.f1.participants.participants);
                }
                rr0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new mg(rr0Var2, str2, arrayList, 22));
                } else {
                    rr0Var2.r = 1;
                }
                rr0Var2.e.g(str2, false, false, true, false, org.telegram.messenger.t3.T(rr0Var2.n) ? rr0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
