// default package

import android.util.Pair;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class a07 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b07 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ a07(b07 b07Var, Pair pair, byte b) {
        this.a = b;
        this.b = b07Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        Pair pair = this.c;
        b07 b07Var = this.b;
        switch (b) {
            case 0:
                b07Var.b.i.I(((Integer) pair.first).intValue(), (rz6) pair.second);
                break;
            default:
                b07Var.b.i.y(((Integer) pair.first).intValue(), (rz6) pair.second);
                break;
        }
    }
}
