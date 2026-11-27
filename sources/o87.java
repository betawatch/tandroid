// default package

import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
                l87 l87Var = uc7Var.m5;
                if (tL_webBrowserSettings != null) {
                    uc7Var.n5 = tL_webBrowserSettings;
                    uc7Var.getNotificationCenter().k(jn7.U5, new Object[0]);
                }
                hl.r(l87Var);
                hl.d3(l87Var, 3600010L);
                break;
            default:
                if (tL_webBrowserSettings != null) {
                    uc7Var.n5 = tL_webBrowserSettings;
                    uc7Var.getNotificationCenter().k(jn7.U5, new Object[0]);
                    break;
                }
                break;
        }
    }
}
