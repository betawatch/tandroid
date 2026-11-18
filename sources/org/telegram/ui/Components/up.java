package org.telegram.ui.Components;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class up extends c5.a {
    public abstract int j();

    public final int k(int i7) {
        int size = ((eg0) this).c.size();
        int j3 = j();
        if (i7 < j3) {
            return ((size - (j3 * 2)) - ((j3 - i7) - 1)) - 1;
        }
        int i10 = size - j3;
        return i7 >= i10 ? i7 - i10 : i7 - j3;
    }
}
