package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class sz0 extends ViewGroup.MarginLayoutParams {
    public uz0 a;
    public uz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0() {
        super(-2, -2);
        uz0 uz0Var = uz0.e;
        this.a = uz0Var;
        this.b = uz0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = uz0Var;
        this.b = uz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sz0.class != obj.getClass()) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        return this.b.equals(sz0Var.b) && this.a.equals(sz0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
