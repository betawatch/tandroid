package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m21 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o21 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ m21(o21 o21Var, int i10, int i11, int i12) {
        this.a = i12;
        this.b = o21Var;
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
