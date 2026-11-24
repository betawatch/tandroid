// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jg2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kg2 b;

    public /* synthetic */ jg2(kg2 kg2Var, byte b) {
        this.a = b;
        this.b = kg2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kg2 kg2Var = this.b;
        switch (b) {
            case 0:
                va vaVar = kg2Var.a;
                if (vaVar != null) {
                    vaVar.g3.O(true);
                    break;
                }
                break;
            default:
                va vaVar2 = kg2Var.a;
                if (vaVar2 != null) {
                    vaVar2.g3.O(true);
                    break;
                }
                break;
        }
    }
}
