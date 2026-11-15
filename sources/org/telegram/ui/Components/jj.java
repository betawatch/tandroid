package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lj b;

    public /* synthetic */ jj(lj ljVar, int i7) {
        this.a = i7;
        this.b = ljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lj ljVar = this.b;
                if (ljVar.f != null) {
                    ljVar.w = org.telegram.messenger.k5.h(new StringBuilder("+"), ljVar.f.phone, pf.b.c());
                    ljVar.s = ljVar.f;
                    org.telegram.messenger.g0.h3(new jj(ljVar, 1));
                    break;
                }
                break;
            default:
                lj ljVar2 = this.b;
                ljVar2.c.l(ljVar2.w, false);
                break;
        }
    }
}
