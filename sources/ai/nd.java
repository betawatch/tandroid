package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class nd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ le b;

    public /* synthetic */ nd(le leVar, int i10) {
        this.a = i10;
        this.b = leVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                le leVar = this.b;
                leVar.S = true;
                leVar.p(null);
                AndroidUtilities.runOnUIThread(new nd(leVar, 1), 240L);
                break;
            case 1:
                this.b.dismiss();
                break;
            default:
                ud udVar = this.b.r;
                udVar.F = false;
                udVar.invalidate();
                break;
        }
    }
}
