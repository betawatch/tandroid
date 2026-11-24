// default package

import android.util.Pair;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ay6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ by6 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ ay6(by6 by6Var, Pair pair, byte b) {
        this.a = b;
        this.b = by6Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Pair pair = this.c;
        by6 by6Var = this.b;
        switch (b) {
            case 0:
                by6Var.b.i.I(((Integer) pair.first).intValue(), (rx6) pair.second);
                break;
            default:
                by6Var.b.i.y(((Integer) pair.first).intValue(), (rx6) pair.second);
                break;
        }
    }
}
