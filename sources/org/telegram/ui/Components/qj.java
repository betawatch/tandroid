package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class qj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj b;

    public /* synthetic */ qj(sj sjVar, int i7) {
        this.a = i7;
        this.b = sjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sj sjVar = this.b;
                if (sjVar.f != null) {
                    sjVar.w = org.telegram.messenger.n10.h(new StringBuilder("+"), sjVar.f.phone, pf.b.c());
                    sjVar.s = sjVar.f;
                    org.telegram.messenger.g0.g3(new qj(sjVar, 1));
                    break;
                }
                break;
            default:
                sj sjVar2 = this.b;
                sjVar2.c.l(sjVar2.w, false);
                break;
        }
    }
}
