package org.telegram.ui.Components.voip;

import bi.m5;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;
    public final /* synthetic */ ch0 c;

    public /* synthetic */ a1(m5 m5Var, ch0 ch0Var, int i7) {
        this.a = i7;
        this.b = m5Var;
        this.c = ch0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new a1(this.b, this.c, 1));
                break;
            default:
                this.b.removeView(this.c);
                break;
        }
    }
}
