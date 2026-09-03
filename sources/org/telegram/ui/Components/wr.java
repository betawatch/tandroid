package org.telegram.ui.Components;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds b;

    public /* synthetic */ wr(ds dsVar, int i10) {
        this.a = i10;
        this.b = dsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.W(false);
                break;
            default:
                ds.Q(this.b);
                break;
        }
    }
}
