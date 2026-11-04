package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class g7 extends sg.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public g7(int i3) {
        this.d = i3;
    }

    public abstract void F();

    @Override // u4.h0
    public final int b() {
        return this.e.size();
    }

    @Override // u4.h0
    public final int d(int i3) {
        return ((n7) this.e.get(i3)).a;
    }
}
