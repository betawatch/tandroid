package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ h20(j20 j20Var, String str, int i7, int i10) {
        this.a = i10;
        this.b = j20Var;
        this.c = str;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j20 j20Var = this.b;
                String str = this.c;
                int i7 = this.d;
                if (j20Var.e != null) {
                    j20Var.e = null;
                    org.telegram.messenger.g0.h3(new h20(j20Var, str, i7, 1));
                    break;
                }
                break;
            default:
                j20 j20Var2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                ArrayList arrayList = null;
                j20Var2.e = null;
                if (!org.telegram.messenger.t3.T(j20Var2.x.Q1) && j20Var2.x.R1 != null) {
                    arrayList = new ArrayList(j20Var2.x.R1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.g.c(new ci.p0(j20Var2, str2, i10, arrayList2, 24));
                } else {
                    j20Var2.h = false;
                }
                j20Var2.d.g(str2, org.telegram.messenger.t3.w(3, j20Var2.x.Q1), false, true, false, org.telegram.messenger.t3.T(j20Var2.x.Q1) ? j20Var2.x.Q1.id : 0L, false, 2, i10);
                break;
        }
    }
}
