// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class nda extends zo {
    public final /* synthetic */ byte c;
    public final /* synthetic */ kea d;

    public /* synthetic */ nda(kea keaVar, byte b) {
        this.c = b;
        this.d = keaVar;
    }

    @Override // zo
    public final int i(int i) {
        byte b = this.c;
        kea keaVar = this.d;
        switch (b) {
            case 0:
                if (i == 0) {
                    return keaVar.C1.J;
                }
                return 1;
            case 1:
                hea heaVar = keaVar.H1;
                return (i == heaVar.x || i == heaVar.y || i == heaVar.E || i == heaVar.G || heaVar.d(i) == 0) ? 4 : 1;
            default:
                if (i == 0) {
                    return keaVar.D1.J;
                }
                return 1;
        }
    }
}
