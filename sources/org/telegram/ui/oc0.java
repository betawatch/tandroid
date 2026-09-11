package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
