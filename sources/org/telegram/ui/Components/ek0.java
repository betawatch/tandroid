package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nk0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ ek0(nk0 nk0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = nk0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nk0 nk0Var = this.b;
                NotificationCenter.getInstance(nk0Var.b).doOnIdle(new ek0(nk0Var, this.c, 1));
                break;
            default:
                nk0.a(this.b, this.c);
                break;
        }
    }
}
