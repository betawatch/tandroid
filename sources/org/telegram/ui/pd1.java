package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pd1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zd1 b;

    public /* synthetic */ pd1(zd1 zd1Var, int i10) {
        this.a = i10;
        this.b = zd1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(false);
                break;
            case 1:
                super/*android.app.Dialog*/.dismiss();
                break;
            default:
                this.b.c(false);
                break;
        }
    }
}
