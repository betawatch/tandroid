// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class o87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ TL_account.TL_webBrowserSettings c;

    public /* synthetic */ o87(uc7 uc7Var, TL_account.TL_webBrowserSettings tL_webBrowserSettings, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = tL_webBrowserSettings;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TL_account.TL_webBrowserSettings tL_webBrowserSettings = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                l87 l87Var = uc7Var.n5;
                if (tL_webBrowserSettings != null) {
                    uc7Var.o5 = tL_webBrowserSettings;
                    uc7Var.getNotificationCenter().k(jn7.U5, new Object[0]);
                }
                hl.r(l87Var);
                hl.d3(l87Var, 3600010L);
                break;
            default:
                if (tL_webBrowserSettings != null) {
                    uc7Var.o5 = tL_webBrowserSettings;
                    uc7Var.getNotificationCenter().k(jn7.U5, new Object[0]);
                    break;
                }
                break;
        }
    }
}
