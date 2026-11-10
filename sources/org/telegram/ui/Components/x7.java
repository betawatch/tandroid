package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x7(z7 z7Var, String str, int i7) {
        this.a = i7;
        this.b = z7Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                z7 z7Var = this.b;
                String str = this.c;
                z7Var.f = null;
                org.telegram.messenger.g0.h3(new x7(z7Var, str, 1));
                break;
            default:
                z7 z7Var2 = this.b;
                String str2 = this.c;
                z7Var2.getClass();
                Utilities.g.c(new y7(z7Var2, str2, new ArrayList(z7Var2.n.q2)));
                break;
        }
    }
}
