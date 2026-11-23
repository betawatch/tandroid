package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class s20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ s20(u20 u20Var, String str, int i7, int i10) {
        this.a = i10;
        this.b = u20Var;
        this.c = str;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u20 u20Var = this.b;
                String str = this.c;
                int i7 = this.d;
                if (u20Var.e != null) {
                    u20Var.e = null;
                    org.telegram.messenger.g0.g3(new s20(u20Var, str, i7, 1));
                    break;
                }
                break;
            default:
                u20 u20Var2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                ArrayList arrayList = null;
                u20Var2.e = null;
                if (!org.telegram.messenger.v3.T(u20Var2.x.Q1) && u20Var2.x.R1 != null) {
                    arrayList = new ArrayList(u20Var2.x.R1.participants.participants);
                }
                if (arrayList != null) {
                    Utilities.g.c(new ai.b1(u20Var2, str2, i10, arrayList));
                } else {
                    u20Var2.h = false;
                }
                u20Var2.d.g(str2, org.telegram.messenger.v3.w(3, u20Var2.x.Q1), false, true, false, org.telegram.messenger.v3.T(u20Var2.x.Q1) ? u20Var2.x.Q1.id : 0L, false, 2, i10);
                break;
        }
    }
}
