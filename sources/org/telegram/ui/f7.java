package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class f7 extends xf.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public f7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override // f2.q0
    public final int h() {
        return this.e.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((m7) this.e.get(i10)).a;
    }
}
