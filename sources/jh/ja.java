package jh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ja implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ db b;

    public /* synthetic */ ja(db dbVar, int i10) {
        this.a = i10;
        this.b = dbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                db dbVar = this.b;
                dbVar.N = true;
                dbVar.o(null);
                AndroidUtilities.runOnUIThread(new ja(dbVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                pa paVar = this.b.r;
                paVar.B = false;
                paVar.invalidate();
                break;
        }
    }
}
