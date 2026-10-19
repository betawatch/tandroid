package ai;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
