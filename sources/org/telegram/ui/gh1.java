package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mh1 b;
    public final /* synthetic */ byte[] c;

    public /* synthetic */ gh1(mh1 mh1Var, byte[] bArr, int i10) {
        this.a = i10;
        this.b = mh1Var;
        this.c = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mh1.Y(this.b, this.c);
                break;
            default:
                mh1 mh1Var = this.b;
                mh1Var.w0();
                mh1Var.V = this.c;
                mh1Var.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
                mh1 mh1Var2 = new mh1(9, mh1Var.U);
                mh1Var2.H = mh1Var.H;
                mh1Var2.G = mh1Var.G;
                mh1Var.presentFragment(mh1Var2, true);
                break;
        }
    }
}
