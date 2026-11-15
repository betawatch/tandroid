package ci;

import org.telegram.messenger.hd;
import org.telegram.messenger.z10;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ z10 c;
    public final /* synthetic */ e2 d;

    public /* synthetic */ y(String str, z10 z10Var, e2 e2Var) {
        this.b = str;
        this.c = z10Var;
        this.d = e2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        e2 e2Var = this.d;
        z10 z10Var = this.c;
        String str = this.b;
        switch (i7) {
            case 0:
                a0.p(e2Var, 0, new y(str, z10Var, e2Var));
                break;
            default:
                if (str == null) {
                    cc.a0(e2Var).N(hd.M0(2131745861, null), hd.M0(2131751105, null)).j();
                    break;
                } else {
                    z10Var.a(str);
                    break;
                }
        }
    }

    public /* synthetic */ y(e2 e2Var, String str, z10 z10Var) {
        this.d = e2Var;
        this.b = str;
        this.c = z10Var;
    }
}
