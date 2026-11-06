package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
