package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public abstract class ep extends c5.a {
    public abstract int j();

    public final int k(int i7) {
        int size = ((rf0) this).c.size();
        int j3 = j();
        if (i7 < j3) {
            return ((size - (j3 * 2)) - ((j3 - i7) - 1)) - 1;
        }
        int i10 = size - j3;
        return i7 >= i10 ? i7 - i10 : i7 - j3;
    }
}
