package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pk0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ gk0(pk0 pk0Var, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = pk0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pk0 pk0Var = this.b;
                NotificationCenter.getInstance(pk0Var.b).doOnIdle(new gk0(pk0Var, this.c, 1));
                break;
            default:
                pk0.a(this.b, this.c);
                break;
        }
    }
}
