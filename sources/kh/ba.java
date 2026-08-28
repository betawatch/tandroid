package kh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ba implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wb b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ ba(wb wbVar, Runnable runnable, int i9) {
        this.a = i9;
        this.b = wbVar;
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
                wb wbVar = this.b;
                wbVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(wbVar.c2);
                wbVar.c2 = null;
                wbVar.O1 = false;
                this.c.run();
                break;
        }
    }
}
