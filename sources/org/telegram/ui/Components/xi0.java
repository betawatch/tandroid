package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gj0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ xi0(gj0 gj0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = gj0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                gj0 gj0Var = this.b;
                NotificationCenter.getInstance(gj0Var.b).doOnIdle(new xi0(gj0Var, this.c, 1));
                break;
            default:
                gj0.a(this.b, this.c);
                break;
        }
    }
}
