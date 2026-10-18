package org.telegram.ui;

import java.util.ArrayList;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public abstract class i7 extends pg.b {
    public final int d;
    public final ArrayList e = new ArrayList();

    public i7(int i10) {
        this.d = i10;
    }

    public abstract void F();

    @Override // s4.g0
    public final int h() {
        return this.e.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return ((p7) this.e.get(i10)).a;
    }
}
