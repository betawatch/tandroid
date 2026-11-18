package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
