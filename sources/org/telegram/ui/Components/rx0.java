package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class rx0 extends ViewGroup.MarginLayoutParams {
    public tx0 a;
    public tx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx0() {
        super(-2, -2);
        tx0 tx0Var = tx0.e;
        this.a = tx0Var;
        this.b = tx0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = tx0Var;
        this.b = tx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rx0.class != obj.getClass()) {
            return false;
        }
        rx0 rx0Var = (rx0) obj;
        return this.b.equals(rx0Var.b) && this.a.equals(rx0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
