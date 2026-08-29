package nh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gb b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ m9(gb gbVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = gbVar;
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
                gb gbVar = this.b;
                gbVar.f(false);
                AndroidUtilities.cancelRunOnUIThread(gbVar.c2);
                gbVar.c2 = null;
                gbVar.O1 = false;
                this.c.run();
                break;
        }
    }
}
