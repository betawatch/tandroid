// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jnb implements pcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ String c;

    public /* synthetic */ jnb(boolean z, String str, byte b) {
        this.a = b;
        this.b = z;
        this.c = str;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b = this.a;
        String str = this.c;
        boolean z = this.b;
        avc avcVar = (avc) obj;
        switch (b) {
            case 0:
                if (avcVar != null && z && aob.Dm.add(str)) {
                    znb znbVar = aob.I;
                    ynb i = znbVar != null ? znbVar.i(false) : null;
                    if (i != null && str.equals(i.o)) {
                        aob.s1(true);
                        break;
                    }
                }
                break;
            default:
                if (avcVar != null && z && aob.Dm.add(str)) {
                    znb znbVar2 = aob.I;
                    unb unbVar = znbVar2 != null ? znbVar2.j0 : null;
                    if (unbVar != null && str.equals(unbVar.c)) {
                        aob.s1(true);
                        break;
                    }
                }
                break;
        }
    }
}
