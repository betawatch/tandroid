package org.telegram.ui.Components;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class au implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bu b;

    public /* synthetic */ au(bu buVar, int i10) {
        this.a = i10;
        this.b = buVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bu buVar = this.b;
                buVar.post(new au(buVar, 1));
                break;
            case 1:
                bu buVar2 = this.b;
                buVar2.invalidateSpoilers();
                buVar2.b();
                break;
            case 2:
                bu.a(this.b);
                break;
            case 3:
                bu buVar3 = this.b;
                buVar3.post(new au(buVar3, 4));
                break;
            default:
                this.b.setSpoilersRevealed(false, true);
                break;
        }
    }
}
