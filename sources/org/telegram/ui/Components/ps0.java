package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ps0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qs0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ps0(qs0 qs0Var, String str, int i10) {
        this.a = i10;
        this.b = qs0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qs0 qs0Var = this.b;
                String str = this.c;
                qs0Var.getClass();
                org.telegram.messenger.i0.g3(new ps0(qs0Var, str, 1));
                break;
            default:
                qs0 qs0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                qs0Var2.f = null;
                if (!org.telegram.messenger.w3.T(qs0Var2.n) && qs0Var2.s.f1 != null) {
                    arrayList = new ArrayList(qs0Var2.s.f1.participants.participants);
                }
                qs0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new jg(qs0Var2, str2, arrayList, 22));
                } else {
                    qs0Var2.r = 1;
                }
                qs0Var2.e.g(str2, false, false, true, false, org.telegram.messenger.w3.T(qs0Var2.n) ? qs0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
