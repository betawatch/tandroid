// default package

import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class byc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cyc b;

    public /* synthetic */ byc(cyc cycVar, byte b) {
        this.a = b;
        this.b = cycVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        cyc cycVar = this.b;
        switch (b) {
            case 0:
                z zVar = cycVar.e;
                if (zVar != null) {
                    zVar.f(cycVar.w);
                    break;
                }
                break;
            default:
                z zVar2 = cycVar.e;
                if (zVar2 != null) {
                    zVar2.f(cycVar.w);
                    break;
                }
                break;
        }
    }
}
