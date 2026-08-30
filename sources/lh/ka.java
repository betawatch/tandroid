package lh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ka implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eb b;

    public /* synthetic */ ka(eb ebVar, int i10) {
        this.a = i10;
        this.b = ebVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eb ebVar = this.b;
                ebVar.O = true;
                ebVar.o(null);
                AndroidUtilities.runOnUIThread(new ka(ebVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                qa qaVar = this.b.r;
                qaVar.C = false;
                qaVar.invalidate();
                break;
        }
    }
}
