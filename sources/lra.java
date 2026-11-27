// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class lra implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wua b;
    public final /* synthetic */ long c;

    public /* synthetic */ lra(wua wuaVar, long j, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.c;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.Z1(j);
                break;
            case 1:
                wuaVar.Z1(j);
                break;
            case 2:
                jra jraVar = wuaVar.s3;
                wuaVar.A2(1, true, null);
                if (j > 0) {
                    hl.r(jraVar);
                    hl.c3(jraVar);
                    break;
                }
                break;
            case 3:
                wuaVar.Z1(j);
                break;
            case 4:
                wuaVar.Z1(j);
                break;
            case 5:
                dza dzaVar = new dza(wuaVar.getContext(), wuaVar.J0, this.c, 10, null, new kba(wuaVar, new boolean[]{false}, (byte) 17), 0L);
                dzaVar.setOnDismissListener(new rsa(wuaVar, (byte) 0));
                dzaVar.show();
                break;
            case 6:
                wuaVar.V1(j);
                break;
            case 7:
                wuaVar.Z1(j);
                break;
            case 8:
                wuaVar.V1(j);
                break;
            case 9:
                wuaVar.Z1(j);
                break;
            case 10:
                wuaVar.V1(j);
                break;
            case 11:
                wuaVar.Z1(j);
                break;
            default:
                wuaVar.V1(j);
                break;
        }
    }
}
