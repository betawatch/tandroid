// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class av4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tv4 b;
    public final /* synthetic */ p8c c;

    public /* synthetic */ av4(tv4 tv4Var, p8c p8cVar, byte b) {
        this.a = b;
        this.b = tv4Var;
        this.c = p8cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        p8c p8cVar = this.c;
        tv4 tv4Var = this.b;
        switch (b) {
            case 0:
                if (p8cVar != null) {
                    p8cVar.a(Boolean.FALSE);
                }
                tv4Var.dismiss();
                break;
            case 1:
                if (p8cVar != null) {
                    p8cVar.a(Boolean.FALSE);
                }
                tv4Var.dismiss();
                break;
            default:
                if (p8cVar != null) {
                    p8cVar.a(Boolean.FALSE);
                }
                tv4Var.dismiss();
                break;
        }
    }
}
