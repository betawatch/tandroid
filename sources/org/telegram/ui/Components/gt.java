package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class gt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kt b;

    public /* synthetic */ gt(kt ktVar, int i7) {
        this.a = i7;
        this.b = ktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kt ktVar = this.b;
                ktVar.post(new gt(ktVar, 1));
                break;
            default:
                kt ktVar2 = this.b;
                ktVar2.h();
                ktVar2.d();
                break;
        }
    }
}
