package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class j7 extends bg.c {
    public final int d;
    public final ArrayList e = new ArrayList();

    public j7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override // f2.o0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((q7) this.e.get(i10)).a;
    }
}
