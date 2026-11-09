package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final /* synthetic */ class o7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w7 b;
    public final /* synthetic */ String c;

    public /* synthetic */ o7(w7 w7Var, String str, int i7) {
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
