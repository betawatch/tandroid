package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
