package org.telegram.ui.Components;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ej0 b;
    public final /* synthetic */ TLObject c;

    public /* synthetic */ vi0(ej0 ej0Var, TLObject tLObject, int i9) {
        this.a = i9;
        this.b = ej0Var;
        this.c = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ej0 ej0Var = this.b;
                NotificationCenter.getInstance(ej0Var.b).doOnIdle(new vi0(ej0Var, this.c, 1));
                break;
            default:
                ej0.a(this.b, this.c);
                break;
        }
    }
}
