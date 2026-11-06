package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ y7(a8 a8Var, String str, int i7) {
        this.a = i7;
        this.b = a8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                a8 a8Var = this.b;
                String str = this.c;
                a8Var.f = null;
                org.telegram.messenger.g0.h3(new y7(a8Var, str, 1));
                break;
            default:
                a8 a8Var2 = this.b;
                String str2 = this.c;
                a8Var2.getClass();
                Utilities.g.c(new z7(a8Var2, str2, new ArrayList(a8Var2.n.n2)));
                break;
        }
    }
}
