package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class bl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl b;
    public final /* synthetic */ org.telegram.messenger.xa c;

    public /* synthetic */ bl(kl klVar, org.telegram.messenger.xa xaVar, int i7) {
        this.a = i7;
        this.b = klVar;
        this.c = xaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.xa xaVar = this.c;
                try {
                    ((a8.r7) xaVar).y();
                } catch (Exception unused) {
                }
                org.telegram.messenger.g0.g3(new bl(this.b, xaVar, 1));
                break;
            default:
                kl.S(this.b, this.c);
                break;
        }
    }
}
