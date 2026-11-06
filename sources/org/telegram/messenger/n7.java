package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class n7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ n7(w7 w7Var, String str, int i7) {
        this.a = i7;
        this.b = w7Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w7 w7Var = this.b;
                i7 i7Var = (i7) w7Var.w.remove(this.c);
                if (i7Var != null && ((ArrayList) i7Var.e1.d).remove(i7Var)) {
                    Utilities.d.c(new y6(i7Var, 7));
                    break;
                }
                break;
            default:
                w7 w7Var2 = this.b;
                i7 i7Var2 = (i7) w7Var2.w.remove(this.c);
                if (i7Var2 != null && ((ArrayList) i7Var2.e1.d).remove(i7Var2)) {
                    Utilities.d.c(new y6(i7Var2, 7));
                    break;
                }
                break;
        }
    }
}
