// default package

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class g71 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y71 b;
    public final /* synthetic */ p c;
    public final /* synthetic */ o71 d;

    public /* synthetic */ g71(y71 y71Var, p pVar, o71 o71Var, byte b) {
        this.a = b;
        this.b = y71Var;
        this.c = pVar;
        this.d = o71Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.e.c(new g71(this.b, this.c, this.d, (byte) 1));
                break;
            default:
                this.b.g0(this.c, this.d);
                break;
        }
    }
}
