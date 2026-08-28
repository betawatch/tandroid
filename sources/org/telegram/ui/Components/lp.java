package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class lp extends m2.a {
    public abstract int j();

    public final int k(int i9) {
        int size = ((zg0) this).c.size();
        int j10 = j();
        if (i9 < j10) {
            return ((size - (j10 * 2)) - ((j10 - i9) - 1)) - 1;
        }
        int i10 = size - j10;
        return i9 >= i10 ? i9 - i10 : i9 - j10;
    }
}
