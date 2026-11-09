package org.telegram.ui.Components.voip;

import bi.m5;
import org.telegram.ui.Components.dh0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m5 b;
    public final /* synthetic */ dh0 c;

    public /* synthetic */ a1(m5 m5Var, dh0 dh0Var, int i7) {
        this.a = i7;
        this.b = m5Var;
        this.c = dh0Var;
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
