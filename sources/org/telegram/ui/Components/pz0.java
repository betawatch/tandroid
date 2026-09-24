package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class pz0 extends ViewGroup.MarginLayoutParams {
    public rz0 a;
    public rz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0() {
        super(-2, -2);
        rz0 rz0Var = rz0.e;
        this.a = rz0Var;
        this.b = rz0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = rz0Var;
        this.b = rz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pz0.class != obj.getClass()) {
            return false;
        }
        pz0 pz0Var = (pz0) obj;
        return this.b.equals(pz0Var.b) && this.a.equals(pz0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
