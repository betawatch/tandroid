package lh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ y9(sb sbVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = sbVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.run();
                this.b.p0();
                break;
            default:
                sb sbVar = this.b;
                sbVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(sbVar.c2);
                sbVar.c2 = null;
                sbVar.O1 = false;
                this.c.run();
                break;
        }
    }
}
