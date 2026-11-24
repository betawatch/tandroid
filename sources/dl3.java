// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class dl3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hl3 b;
    public final /* synthetic */ int c;

    public /* synthetic */ dl3(hl3 hl3Var, int i, byte b) {
        this.a = b;
        this.b = hl3Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 1;
        switch (this.a) {
            case 0:
                hl3 hl3Var = this.b;
                hl3Var.postOnAnimation(new dl3(hl3Var, this.c, b));
                break;
            default:
                hl3 hl3Var2 = this.b;
                int i = this.c;
                if (hl3Var2.e && !hl3Var2.r && i == hl3Var2.F) {
                    hl3Var2.y = true;
                    hl3Var2.requestRender();
                    break;
                }
                break;
        }
    }
}
