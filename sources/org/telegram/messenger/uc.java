package org.telegram.messenger;

import org.telegram.ui.g60;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final /* synthetic */ class uc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd b;
    public final /* synthetic */ String c;
    public final /* synthetic */ g60 d;

    public /* synthetic */ uc(gd gdVar, String str, g60 g60Var, int i7) {
        this.a = i7;
        this.b = gdVar;
        this.c = str;
        this.d = g60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.g3(new uc(this.b, this.c, this.d, 1));
                break;
            default:
                mp.g1().edit().putBoolean("langpack_patched" + this.c, true).apply();
                this.d.run();
                this.b.Q = false;
                break;
        }
    }
}
