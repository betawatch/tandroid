package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk b;
    public final /* synthetic */ org.telegram.messenger.za c;

    public /* synthetic */ nk(wk wkVar, org.telegram.messenger.za zaVar, int i7) {
        this.a = i7;
        this.b = wkVar;
        this.c = zaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.za zaVar = this.c;
                try {
                    ((a8.r7) zaVar).u();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.h3(new nk(this.b, zaVar, 1));
                break;
            default:
                wk.R(this.b, this.c);
                break;
        }
    }
}
