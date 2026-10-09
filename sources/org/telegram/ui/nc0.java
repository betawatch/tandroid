package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ nc0(hd0 hd0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = hd0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                hd0 hd0Var = this.b;
                if (!z10) {
                    hd0Var.b.setVisibility(8);
                    break;
                } else {
                    hd0Var.getClass();
                    break;
                }
            default:
                this.b.r0(this.c);
                break;
        }
    }
}
