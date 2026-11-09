package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sr0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ rr0(sr0 sr0Var, String str, int i7) {
        this.a = i7;
        this.b = sr0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sr0 sr0Var = this.b;
                String str = this.c;
                sr0Var.getClass();
                org.telegram.messenger.g0.h3(new rr0(sr0Var, str, 1));
                break;
            default:
                sr0 sr0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                sr0Var2.f = null;
                if (!org.telegram.messenger.t3.T(sr0Var2.n) && sr0Var2.s.f1 != null) {
                    arrayList = new ArrayList(sr0Var2.s.f1.participants.participants);
                }
                sr0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new ng(sr0Var2, str2, arrayList, 22));
                } else {
                    sr0Var2.r = 1;
                }
                sr0Var2.e.g(str2, false, false, true, false, org.telegram.messenger.t3.T(sr0Var2.n) ? sr0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
