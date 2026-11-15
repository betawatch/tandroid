package org.telegram.ui.Components.voip;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b0 b;

    public /* synthetic */ a0(b0 b0Var, int i7) {
        this.a = i7;
        this.b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b0.a(this.b);
                break;
            default:
                b0 b0Var = this.b;
                if (b0Var.y) {
                    b0Var.h();
                    b0Var.post(new a0(b0Var, 0));
                    break;
                }
                break;
        }
    }
}
