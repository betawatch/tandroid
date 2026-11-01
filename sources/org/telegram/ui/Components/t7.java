package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ t7(v7 v7Var, String str, int i10) {
        this.a = i10;
        this.b = v7Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v7 v7Var = this.b;
                String str = this.c;
                v7Var.f = null;
                org.telegram.messenger.i0.g3(new t7(v7Var, str, 1));
                break;
            default:
                v7 v7Var2 = this.b;
                String str2 = this.c;
                v7Var2.getClass();
                Utilities.g.c(new u7(v7Var2, str2, new ArrayList(v7Var2.n.n2)));
                break;
        }
    }
}
