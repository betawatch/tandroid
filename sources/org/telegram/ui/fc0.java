package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ad0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ fc0(ad0 ad0Var, boolean z4, int i10) {
        this.a = i10;
        this.b = ad0Var;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z4 = this.c;
                ad0 ad0Var = this.b;
                if (!z4) {
                    ad0Var.b.setVisibility(8);
                    break;
                } else {
                    ad0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
