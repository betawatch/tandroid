package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class h7 extends cg.c {
    public final int d;
    public final ArrayList e = new ArrayList();

    public h7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override // f2.p0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((o7) this.e.get(i10)).a;
    }
}
