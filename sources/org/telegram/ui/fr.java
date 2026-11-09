package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr b;

    public /* synthetic */ fr(pr prVar, int i7) {
        this.a = i7;
        this.b = prVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pr.d0(this.b);
                break;
            case 1:
                pr prVar = this.b;
                if (prVar.J) {
                    prVar.d.d.requestFocus();
                    org.telegram.messenger.g0.K3(prVar.d.d);
                    break;
                }
                break;
            default:
                pr prVar2 = this.b;
                prVar2.presentFragment(cn.ta(prVar2.H), true);
                break;
        }
    }
}
