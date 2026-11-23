package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sx0 extends ViewGroup.MarginLayoutParams {
    public ux0 a;
    public ux0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx0() {
        super(-2, -2);
        ux0 ux0Var = ux0.e;
        this.a = ux0Var;
        this.b = ux0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = ux0Var;
        this.b = ux0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sx0.class != obj.getClass()) {
            return false;
        }
        sx0 sx0Var = (sx0) obj;
        return this.b.equals(sx0Var.b) && this.a.equals(sx0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
