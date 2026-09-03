package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cd0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hc0(cd0 cd0Var, boolean z4, int i10) {
        this.a = i10;
        this.b = cd0Var;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z4 = this.c;
                cd0 cd0Var = this.b;
                if (!z4) {
                    cd0Var.b.setVisibility(8);
                    break;
                } else {
                    cd0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
