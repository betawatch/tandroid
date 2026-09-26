package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q21 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ o21(q21 q21Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = q21Var;
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
