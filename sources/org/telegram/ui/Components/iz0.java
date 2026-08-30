package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class iz0 extends ViewGroup.MarginLayoutParams {
    public kz0 a;
    public kz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz0() {
        super(-2, -2);
        kz0 kz0Var = kz0.e;
        this.a = kz0Var;
        this.b = kz0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = kz0Var;
        this.b = kz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iz0.class != obj.getClass()) {
            return false;
        }
        iz0 iz0Var = (iz0) obj;
        return this.b.equals(iz0Var.b) && this.a.equals(iz0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
