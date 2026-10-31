package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class s7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ String c;

    public /* synthetic */ s7(b8 b8Var, String str, int i10) {
        this.a = i10;
        this.b = b8Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b8 b8Var = this.b;
                m7 m7Var = (m7) b8Var.w.remove(this.c);
                if (m7Var != null && ((ArrayList) m7Var.e1.d).remove(m7Var)) {
                    Utilities.d.c(new b7(m7Var, 7));
                    break;
                }
                break;
            default:
                b8 b8Var2 = this.b;
                m7 m7Var2 = (m7) b8Var2.w.remove(this.c);
                if (m7Var2 != null && ((ArrayList) m7Var2.e1.d).remove(m7Var2)) {
                    Utilities.d.c(new b7(m7Var2, 7));
                    break;
                }
                break;
        }
    }
}
