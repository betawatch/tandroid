package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class h7 extends og.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public h7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override // s4.h0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((o7) this.e.get(i10)).a;
    }
}
