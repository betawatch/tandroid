// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
