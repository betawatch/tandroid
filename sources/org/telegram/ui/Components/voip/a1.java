package org.telegram.ui.Components.voip;

import bi.m5;
import org.telegram.ui.Components.ch0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
