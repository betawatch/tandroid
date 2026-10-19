package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hr b;

    public /* synthetic */ cq(hr hrVar, int i10) {
        this.a = i10;
        this.b = hrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r0();
                break;
            default:
                hr hrVar = this.b;
                hrVar.getMessagesController().loadFullChat(hrVar.N, 0, true);
                break;
        }
    }
}
