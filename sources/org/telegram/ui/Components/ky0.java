package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ky0 extends ViewGroup.MarginLayoutParams {
    public my0 a;
    public my0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky0() {
        super(-2, -2);
        my0 my0Var = my0.e;
        this.a = my0Var;
        this.b = my0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = my0Var;
        this.b = my0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ky0.class != obj.getClass()) {
            return false;
        }
        ky0 ky0Var = (ky0) obj;
        return this.b.equals(ky0Var.b) && this.a.equals(ky0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
