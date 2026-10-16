package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g31 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ e31(g31 g31Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = g31Var;
        this.c = i10;
        this.d = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b(this.c, this.d);
                break;
            case 1:
                this.b.b(this.c, this.d);
                break;
            default:
                this.b.b(this.c, this.d);
                break;
        }
    }
}
