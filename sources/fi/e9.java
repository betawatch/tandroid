package fi;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ va b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ e9(va vaVar, boolean z9, int i7) {
        this.a = i7;
        this.b = vaVar;
        this.c = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e(this.c);
                break;
            case 1:
                va vaVar = this.b;
                if (!this.c) {
                    vaVar.J0.b(false, false);
                    break;
                } else {
                    vaVar.getClass();
                    break;
                }
            default:
                va vaVar2 = this.b;
                vaVar2.R = null;
                vaVar2.e = false;
                vaVar2.p(this.c);
                break;
        }
    }
}
