package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zr0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ yr0(zr0 zr0Var, String str, int i7) {
        this.a = i7;
        this.b = zr0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zr0 zr0Var = this.b;
                String str = this.c;
                zr0Var.getClass();
                org.telegram.messenger.g0.g3(new yr0(zr0Var, str, 1));
                break;
            default:
                zr0 zr0Var2 = this.b;
                String str2 = this.c;
                ArrayList arrayList = null;
                zr0Var2.f = null;
                if (!org.telegram.messenger.v3.T(zr0Var2.n) && zr0Var2.s.g1 != null) {
                    arrayList = new ArrayList(zr0Var2.s.g1.participants.participants);
                }
                zr0Var2.r = 2;
                if (arrayList != null) {
                    Utilities.g.c(new k7(zr0Var2, str2, arrayList, 27));
                } else {
                    zr0Var2.r = 1;
                }
                zr0Var2.e.g(str2, false, false, true, false, org.telegram.messenger.v3.T(zr0Var2.n) ? zr0Var2.n.id : 0L, false, 2, 1);
                break;
        }
    }
}
