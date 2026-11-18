package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.lr b;

    public /* synthetic */ z1(org.telegram.messenger.lr lrVar, int i7) {
        this.a = i7;
        this.b = lrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.lr lrVar = this.b;
                if (lrVar != null) {
                    lrVar.d(false);
                    break;
                }
                break;
            default:
                org.telegram.messenger.lr lrVar2 = this.b;
                if (lrVar2 != null) {
                    lrVar2.d(false);
                    break;
                }
                break;
        }
    }
}
