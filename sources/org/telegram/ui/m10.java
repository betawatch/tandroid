package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class m10 extends g.p {
    public final /* synthetic */ f40 c;

    public m10(f40 f40Var) {
        this.c = f40Var;
    }

    @Override // g.p
    public final int i(int i7) {
        int size = this.c.i4.e.size();
        if (size > 1 && size != 2) {
            return (size != 3 || i7 == 0 || i7 == 1) ? 3 : 6;
        }
        return 6;
    }
}
