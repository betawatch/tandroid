package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class vp extends m2.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((wh0) this).c.size();
        int j10 = j();
        if (i10 < j10) {
            return ((size - (j10 * 2)) - ((j10 - i10) - 1)) - 1;
        }
        int i11 = size - j10;
        return i10 >= i11 ? i10 - i11 : i10 - j10;
    }
}
