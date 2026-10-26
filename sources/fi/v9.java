package fi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ v9(sb sbVar, Runnable runnable, int i10) {
        this.a = i10;
        this.b = sbVar;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.c.run();
                this.b.o0();
                break;
            default:
                sb sbVar = this.b;
                sbVar.e(false);
                AndroidUtilities.cancelRunOnUIThread(sbVar.g2);
                sbVar.g2 = null;
                sbVar.S1 = false;
                this.c.run();
                break;
        }
    }
}
