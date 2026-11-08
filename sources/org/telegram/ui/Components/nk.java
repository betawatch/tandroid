package org.telegram.ui.Components;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
