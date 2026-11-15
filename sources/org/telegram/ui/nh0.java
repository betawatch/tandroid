package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class nh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oh0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ nh0(oh0 oh0Var, String str, int i7) {
        this.a = i7;
        this.b = oh0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oh0 oh0Var = this.b;
                String str = this.c;
                oh0Var.getClass();
                org.telegram.messenger.g0.h3(new nh0(oh0Var, str, 1));
                break;
            default:
                oh0 oh0Var2 = this.b;
                String str2 = this.c;
                jg.z1 z1Var = oh0Var2.h;
                int i7 = oh0Var2.n.s;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.g.c(new lc0(oh0Var2, str2, new ArrayList(oh0Var2.n.x), 10));
                break;
        }
    }
}
