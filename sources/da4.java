// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class da4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ int c;

    public /* synthetic */ da4(int[] iArr, int i) {
        this.a = (byte) 0;
        this.c = i;
        this.b = iArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        int[] iArr = this.b;
        switch (b) {
            case 0:
                ia4.i.d(i, iArr[0], 0, false);
                break;
            case 1:
                gm.c3(new da4((byte) 2, i, iArr));
                break;
            default:
                int i2 = iArr[0];
                if (i2 != 0) {
                    ia4.a(ia4.i.d(i, i2, 0, false));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ da4(byte b, int i, int[] iArr) {
        this.a = b;
        this.b = iArr;
        this.c = i;
    }
}
