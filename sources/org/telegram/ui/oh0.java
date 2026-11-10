package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ oh0(ph0 ph0Var, String str, int i7) {
        this.a = i7;
        this.b = ph0Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ph0 ph0Var = this.b;
                String str = this.c;
                ph0Var.getClass();
                org.telegram.messenger.g0.h3(new oh0(ph0Var, str, 1));
                break;
            default:
                ph0 ph0Var2 = this.b;
                String str2 = this.c;
                jg.z1 z1Var = ph0Var2.h;
                int i7 = ph0Var2.n.s;
                z1Var.g(str2, true, (i7 == 1 || i7 == 3) ? false : true, true, false, 0L, false, 0, 0);
                Utilities.g.c(new pc0(ph0Var2, str2, new ArrayList(ph0Var2.n.x), 10));
                break;
        }
    }
}
