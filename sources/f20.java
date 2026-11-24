// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class f20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ h20 b;
    public final /* synthetic */ String c;

    public /* synthetic */ f20(h20 h20Var, String str, byte b) {
        this.a = b;
        this.b = h20Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h20 h20Var = this.b;
                String str = this.c;
                h20Var.f = null;
                gl.d3(new f20(h20Var, str, (byte) 1));
                break;
            default:
                h20 h20Var2 = this.b;
                String str2 = this.c;
                h20Var2.getClass();
                Utilities.g.c(new g20(h20Var2, str2, new ArrayList(h20Var2.n.q2)));
                break;
        }
    }
}
