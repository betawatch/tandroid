package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
