package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class c01 extends ViewGroup.MarginLayoutParams {
    public e01 a;
    public e01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c01() {
        super(-2, -2);
        e01 e01Var = e01.e;
        this.a = e01Var;
        this.b = e01Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = e01Var;
        this.b = e01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c01.class != obj.getClass()) {
            return false;
        }
        c01 c01Var = (c01) obj;
        return this.b.equals(c01Var.b) && this.a.equals(c01Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
