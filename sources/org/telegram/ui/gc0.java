package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gc0(bd0 bd0Var, boolean z4, int i10) {
        this.a = i10;
        this.b = bd0Var;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z4 = this.c;
                bd0 bd0Var = this.b;
                if (!z4) {
                    bd0Var.b.setVisibility(8);
                    break;
                } else {
                    bd0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
