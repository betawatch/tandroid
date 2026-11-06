package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i7 b;
    public final /* synthetic */ j7 c;

    public /* synthetic */ e7(i7 i7Var, j7 j7Var, int i7) {
        this.a = i7;
        this.b = i7Var;
        this.c = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i7 i7Var = this.b;
                j7 j7Var = this.c;
                if (i7Var.m != null) {
                    a8.d("FileLoadOperation " + i7Var.r + " removing stream listener " + j7Var);
                    i7Var.m.remove(j7Var);
                    break;
                }
                break;
            default:
                i7 i7Var2 = this.b;
                j7 j7Var2 = this.c;
                if (i7Var2.m == null) {
                    i7Var2.m = new ArrayList();
                }
                if (j7Var2 != null && !i7Var2.m.contains(j7Var2)) {
                    i7Var2.m.add(j7Var2);
                }
                if (!i7Var2.m.isEmpty()) {
                    Utilities.d.a(i7Var2.f1);
                }
                if (j7Var2 != null && i7Var2.Y != 1 && i7Var2.Y != 0) {
                    j7Var2.a();
                    break;
                }
                break;
        }
    }
}
