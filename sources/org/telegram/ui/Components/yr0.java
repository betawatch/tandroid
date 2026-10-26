package org.telegram.ui.Components;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yr0(aw0 aw0Var, int i10, int i11) {
        this.a = i11;
        this.b = aw0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m1(this.c);
                break;
            case 1:
                aw0 aw0Var = this.b;
                aw0Var.U0(aw0Var.x1, aw0Var.l1, this.c);
                break;
            case 2:
                this.b.l1(this.c, false);
                break;
            case 3:
                this.b.m1(this.c);
                break;
            default:
                aw0 aw0Var2 = this.b;
                aw0Var2.V0(aw0Var2.x1, aw0Var2.l1, this.c);
                break;
        }
    }
}
