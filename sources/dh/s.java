package dh;

import org.telegram.ui.Components.jb0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ s(a0 a0Var, int i3) {
        this.a = i3;
        this.b = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.invalidate();
                break;
            default:
                a0 a0Var = this.b;
                ai.c0 c0Var = a0Var.c;
                if (c0Var.getParent() != null) {
                    if (a0Var.d) {
                        org.telegram.messenger.g0.E2(c0Var);
                    } else {
                        try {
                            a0Var.b.removeView(c0Var);
                        } catch (Exception unused) {
                        }
                    }
                    jb0 jb0Var = a0Var.p;
                    if (jb0Var != null) {
                        jb0Var.run();
                        break;
                    }
                }
                break;
        }
    }
}
