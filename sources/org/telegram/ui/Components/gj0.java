package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ gj0(pj0 pj0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = pj0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pj0 pj0Var = this.b;
                NotificationCenter.getInstance(pj0Var.b).doOnIdle(new gj0(pj0Var, this.c, 1));
                break;
            default:
                pj0.a(this.b, this.c);
                break;
        }
    }
}
