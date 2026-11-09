package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class f20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;

    public /* synthetic */ f20(h20 h20Var, String str, int i7, int i10) {
        this.a = i10;
        this.b = h20Var;
        this.c = str;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h20 h20Var = this.b;
                String str = this.c;
                int i7 = this.d;
                if (h20Var.e != null) {
                    h20Var.e = null;
                    org.telegram.messenger.g0.h3(new f20(h20Var, str, i7, 1));
                    break;
                }
                break;
            default:
                h20 h20Var2 = this.b;
                String str2 = this.c;
                int i10 = this.d;
                ArrayList arrayList = null;
                h20Var2.e = null;
                if (!org.telegram.messenger.t3.T(h20Var2.x.M1) && h20Var2.x.N1 != null) {
                    arrayList = new ArrayList(h20Var2.x.N1.participants.participants);
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2 != null) {
                    Utilities.g.c(new ai.a1(h20Var2, str2, i10, arrayList2, 24));
                } else {
                    h20Var2.h = false;
                }
                h20Var2.d.g(str2, org.telegram.messenger.t3.w(3, h20Var2.x.M1), false, true, false, org.telegram.messenger.t3.T(h20Var2.x.M1) ? h20Var2.x.M1.id : 0L, false, 2, i10);
                break;
        }
    }
}
