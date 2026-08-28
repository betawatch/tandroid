package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p20 extends f2.x {
    public final /* synthetic */ o50 c;

    public p20(o50 o50Var) {
        this.c = o50Var;
    }

    @Override // f2.x
    public final int i(int i9) {
        int size = this.c.k2.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i9 == 0 || i9 == 1) ? 3 : 6;
        }
        return 6;
    }
}
