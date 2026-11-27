// default package

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class h61 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z61 b;
    public final /* synthetic */ p c;
    public final /* synthetic */ p61 d;

    public /* synthetic */ h61(z61 z61Var, p pVar, p61 p61Var, byte b) {
        this.a = b;
        this.b = z61Var;
        this.c = pVar;
        this.d = p61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Utilities.e.c(new h61(this.b, this.c, this.d, (byte) 1));
                break;
            default:
                this.b.f0(this.c, this.d);
                break;
        }
    }
}
