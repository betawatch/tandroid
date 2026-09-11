package org.telegram.ui.Components;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
