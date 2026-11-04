package org.telegram.ui;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class a5 {
    public final z4 a = new z4(this, 0);
    public final org.telegram.messenger.hs b = org.telegram.messenger.hs.f(org.telegram.messenger.h10.t0);
    public final Object c;
    public final int d;
    public final int e;
    public ci.i7 f;
    public boolean g;

    public a5(int i3, int i10, TLObject tLObject) {
        this.c = tLObject;
        this.d = i3;
        this.e = i10;
    }

    public abstract void a();

    public abstract void b(Object... objArr);
}
