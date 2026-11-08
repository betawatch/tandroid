package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
