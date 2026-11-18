package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
