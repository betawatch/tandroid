package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fg1 b;

    public /* synthetic */ df1(fg1 fg1Var, int i10) {
        this.a = i10;
        this.b = fg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fg1 fg1Var = this.b;
                fg1Var.x0();
                fg1Var.B0();
                break;
            case 1:
                this.b.x0();
                break;
            case 2:
                this.b.O0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                fg1 fg1Var2 = this.b;
                fg1Var2.A0 = null;
                fg1Var2.U0(true, false);
                break;
            default:
                fg1 fg1Var3 = this.b;
                fg1Var3.N.postOnAnimation(new df1(fg1Var3, 1));
                break;
        }
    }
}
