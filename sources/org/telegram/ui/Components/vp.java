package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public abstract class vp extends z4.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((yh0) this).c.size();
        int j3 = j();
        if (i10 < j3) {
            return ((size - (j3 * 2)) - ((j3 - i10) - 1)) - 1;
        }
        int i11 = size - j3;
        return i10 >= i11 ? i10 - i11 : i10 - j3;
    }
}
