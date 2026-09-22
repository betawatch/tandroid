package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ id0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ oc0(id0 id0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = id0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                id0 id0Var = this.b;
                if (!z10) {
                    id0Var.b.setVisibility(8);
                    break;
                } else {
                    id0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
