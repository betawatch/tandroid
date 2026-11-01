package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qi0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ pi0(qi0 qi0Var, String str, int i10) {
        this.a = i10;
        this.b = qi0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qi0 qi0Var = this.b;
                String str = this.c;
                qi0Var.getClass();
                org.telegram.messenger.i0.g3(new pi0(qi0Var, str, 1));
                break;
            default:
                qi0 qi0Var2 = this.b;
                String str2 = this.c;
                zf.m1 m1Var = qi0Var2.h;
                int i10 = qi0Var2.n.s;
                m1Var.g(str2, true, (i10 == 1 || i10 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.g.c(new pd0(qi0Var2, str2, new ArrayList(qi0Var2.n.x), 11));
                break;
        }
    }
}
