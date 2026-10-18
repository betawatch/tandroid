package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class yz0 extends ViewGroup.MarginLayoutParams {
    public a01 a;
    public a01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz0() {
        super(-2, -2);
        a01 a01Var = a01.e;
        this.a = a01Var;
        this.b = a01Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = a01Var;
        this.b = a01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yz0.class != obj.getClass()) {
            return false;
        }
        yz0 yz0Var = (yz0) obj;
        return this.b.equals(yz0Var.b) && this.a.equals(yz0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
