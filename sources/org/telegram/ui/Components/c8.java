package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ c8(e8 e8Var, String str, int i7) {
        this.a = i7;
        this.b = e8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e8 e8Var = this.b;
                String str = this.c;
                e8Var.f = null;
                org.telegram.messenger.g0.g3(new c8(e8Var, str, 1));
                break;
            default:
                e8 e8Var2 = this.b;
                String str2 = this.c;
                e8Var2.getClass();
                Utilities.g.c(new d8(e8Var2, str2, new ArrayList(e8Var2.n.r2)));
                break;
        }
    }
}
