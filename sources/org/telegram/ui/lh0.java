package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ lh0(mh0 mh0Var, String str, int i7) {
        this.a = i7;
        this.b = mh0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mh0 mh0Var = this.b;
                String str = this.c;
                mh0Var.getClass();
                org.telegram.messenger.g0.h3(new lh0(mh0Var, str, 1));
                break;
            default:
                mh0 mh0Var2 = this.b;
                String str2 = this.c;
                jg.z1 z1Var = mh0Var2.h;
                int i7 = mh0Var2.n.s;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.g.c(new mc0(mh0Var2, str2, new ArrayList(mh0Var2.n.x), 10));
                break;
        }
    }
}
