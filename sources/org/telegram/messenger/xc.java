package org.telegram.messenger;

import org.telegram.ui.i60;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class xc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ id b;
    public final /* synthetic */ String c;
    public final /* synthetic */ i60 d;

    public /* synthetic */ xc(id idVar, String str, i60 i60Var, int i7) {
        this.a = i7;
        this.b = idVar;
        this.c = str;
        this.d = i60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.h3(new xc(this.b, this.c, this.d, 1));
                break;
            default:
                qp.e1().edit().putBoolean("langpack_patched" + this.c, true).apply();
                this.d.run();
                this.b.Q = false;
                break;
        }
    }
}
