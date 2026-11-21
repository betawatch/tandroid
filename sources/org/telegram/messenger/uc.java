package org.telegram.messenger;

import org.telegram.ui.g60;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
