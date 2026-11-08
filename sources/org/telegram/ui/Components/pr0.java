package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qr0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ pr0(qr0 qr0Var, String str, int i7) {
        this.a = i7;
        this.b = qr0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qr0 qr0Var = this.b;
                String str = this.c;
                qr0Var.getClass();
                org.telegram.messenger.g0.h3(new pr0(qr0Var, str, 1));
                break;
            default:
                qr0 qr0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                qr0Var2.f = null;
                if (!org.telegram.messenger.t3.T(qr0Var2.n) && qr0Var2.s.f1 != null) {
                    arrayList = new ArrayList(qr0Var2.s.f1.participants.participants);
                }
                qr0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new ng(qr0Var2, str2, arrayList, 22));
                } else {
                    qr0Var2.r = 1;
                }
                qr0Var2.e.g(str2, false, false, true, false, org.telegram.messenger.t3.T(qr0Var2.n) ? qr0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
