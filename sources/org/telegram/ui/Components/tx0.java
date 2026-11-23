package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class tx0 extends ViewGroup.MarginLayoutParams {
    public vx0 a;
    public vx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx0() {
        super(-2, -2);
        vx0 vx0Var = vx0.e;
        this.a = vx0Var;
        this.b = vx0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = vx0Var;
        this.b = vx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tx0.class != obj.getClass()) {
            return false;
        }
        tx0 tx0Var = (tx0) obj;
        return this.b.equals(tx0Var.b) && this.a.equals(tx0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
