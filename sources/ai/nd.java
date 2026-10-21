package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
