package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class rj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tj b;

    public /* synthetic */ rj(tj tjVar, int i7) {
        this.a = i7;
        this.b = tjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                tj tjVar = this.b;
                if (tjVar.f != null) {
                    tjVar.w = org.telegram.messenger.m10.h(new StringBuilder("+"), tjVar.f.phone, pf.b.c());
                    tjVar.s = tjVar.f;
                    org.telegram.messenger.g0.g3(new rj(tjVar, 1));
                    break;
                }
                break;
            default:
                tj tjVar2 = this.b;
                tjVar2.c.l(tjVar2.w, false);
                break;
        }
    }
}
