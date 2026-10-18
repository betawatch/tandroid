package org.telegram.ui.Components;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public abstract class fq extends z4.a {
    public abstract int j();

    public final int k(int i10) {
        int size = ((ji0) this).c.size();
        int j10 = j();
        if (i10 < j10) {
            return ((size - (j10 * 2)) - ((j10 - i10) - 1)) - 1;
        }
        int i11 = size - j10;
        return i10 >= i11 ? i10 - i11 : i10 - j10;
    }
}
