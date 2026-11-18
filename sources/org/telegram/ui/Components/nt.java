package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt b;

    public /* synthetic */ nt(pt ptVar, int i7) {
        this.a = i7;
        this.b = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pt ptVar = this.b;
                ptVar.post(new nt(ptVar, 1));
                break;
            default:
                pt ptVar2 = this.b;
                ptVar2.h();
                ptVar2.d();
                break;
        }
    }
}
