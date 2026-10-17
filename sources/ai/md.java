package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final /* synthetic */ class md implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ke b;

    public /* synthetic */ md(ke keVar, int i10) {
        this.a = i10;
        this.b = keVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ke keVar = this.b;
                keVar.S = true;
                keVar.p(null);
                AndroidUtilities.runOnUIThread(new md(keVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                td tdVar = this.b.r;
                tdVar.F = false;
                tdVar.invalidate();
                break;
        }
    }
}
