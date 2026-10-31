package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ w20(y20 y20Var, String str, int i10, int i11) {
        this.a = i11;
        this.b = y20Var;
        this.c = str;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y20 y20Var = this.b;
                String str = this.c;
                int i10 = this.d;
                if (y20Var.e != null) {
                    y20Var.e = null;
                    org.telegram.messenger.i0.g3(new w20(y20Var, str, i10, 1));
                    break;
                }
                break;
            default:
                y20 y20Var2 = this.b;
                String str2 = this.c;
                int i11 = this.d;
                ArrayList arrayList = null;
                y20Var2.e = null;
                if (!org.telegram.messenger.w3.T(y20Var2.x.M1) && y20Var2.x.N1 != null) {
                    arrayList = new ArrayList(y20Var2.x.N1.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.g.c(new ag.g3(y20Var2, str2, i11, arrayList));
                } else {
                    y20Var2.h = false;
                }
                y20Var2.d.g(str2, org.telegram.messenger.w3.w(3, y20Var2.x.M1), false, true, false, org.telegram.messenger.w3.T(y20Var2.x.M1) ? y20Var2.x.M1.id : 0L, false, 2, i11);
                break;
        }
    }
}
