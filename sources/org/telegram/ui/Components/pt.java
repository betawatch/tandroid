package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rt b;

    public /* synthetic */ pt(rt rtVar, int i7) {
        this.a = i7;
        this.b = rtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rt rtVar = this.b;
                rtVar.post(new pt(rtVar, 1));
                break;
            default:
                rt rtVar2 = this.b;
                rtVar2.h();
                rtVar2.d();
                break;
        }
    }
}
