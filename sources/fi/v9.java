package fi;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
