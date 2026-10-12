package org.telegram.ui.Components;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;
    public final /* synthetic */ MessageObject c;

    public /* synthetic */ f7(m8 m8Var, MessageObject messageObject, int i10) {
        this.a = i10;
        this.b = m8Var;
        this.c = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m8.n(this.b, this.c);
                break;
            default:
                m8.r(this.b, this.c);
                break;
        }
    }
}
