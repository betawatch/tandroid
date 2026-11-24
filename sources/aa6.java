// default package

import org.telegram.messenger.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class aa6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qa6 b;
    public final /* synthetic */ vh5 c;

    public /* synthetic */ aa6(qa6 qa6Var, vh5 vh5Var, byte b) {
        this.a = b;
        this.b = qa6Var;
        this.c = vh5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qa6 qa6Var = this.b;
                vh5 vh5Var = this.c;
                if (qa6Var.H != null && qa6Var.getParentActivity() != null) {
                    try {
                        ((gl2) vh5Var).G();
                        ((ize) a.j()).initializeMaps(a.b);
                        ((gl2) qa6Var.H).s(new gw(qa6Var, (byte) 9));
                        qa6Var.x0 = true;
                        if (qa6Var.y0) {
                            ((gl2) qa6Var.H).J();
                            break;
                        }
                    } catch (Exception e) {
                        fa4.g(e, true);
                        return;
                    }
                }
                break;
            default:
                qa6 qa6Var2 = this.b;
                vh5 vh5Var2 = this.c;
                try {
                    ((gl2) vh5Var2).G();
                } catch (Exception unused) {
                }
                gl.d3(new aa6(qa6Var2, vh5Var2, (byte) 0));
                break;
        }
    }
}
