package org.telegram.ui;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s21 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ q21(s21 s21Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = s21Var;
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
