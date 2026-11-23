package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.mr b;

    public /* synthetic */ a2(org.telegram.messenger.mr mrVar, int i7) {
        this.a = i7;
        this.b = mrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.mr mrVar = this.b;
                if (mrVar != null) {
                    mrVar.d(false);
                    break;
                }
                break;
            default:
                org.telegram.messenger.mr mrVar2 = this.b;
                if (mrVar2 != null) {
                    mrVar2.d(false);
                    break;
                }
                break;
        }
    }
}
