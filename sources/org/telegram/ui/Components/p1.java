package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.nr b;

    public /* synthetic */ p1(org.telegram.messenger.nr nrVar, int i7) {
        this.a = i7;
        this.b = nrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.nr nrVar = this.b;
                if (nrVar != null) {
                    nrVar.j(false);
                    break;
                }
                break;
            default:
                org.telegram.messenger.nr nrVar2 = this.b;
                if (nrVar2 != null) {
                    nrVar2.j(false);
                    break;
                }
                break;
        }
    }
}
