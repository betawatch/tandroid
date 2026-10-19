package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class zz0 extends ViewGroup.MarginLayoutParams {
    public b01 a;
    public b01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz0() {
        super(-2, -2);
        b01 b01Var = b01.e;
        this.a = b01Var;
        this.b = b01Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = b01Var;
        this.b = b01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zz0.class != obj.getClass()) {
            return false;
        }
        zz0 zz0Var = (zz0) obj;
        return this.b.equals(zz0Var.b) && this.a.equals(zz0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
