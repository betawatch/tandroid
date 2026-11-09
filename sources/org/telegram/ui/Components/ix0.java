package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ix0 extends ViewGroup.MarginLayoutParams {
    public kx0 a;
    public kx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ix0() {
        super(-2, -2);
        kx0 kx0Var = kx0.e;
        this.a = kx0Var;
        this.b = kx0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = kx0Var;
        this.b = kx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ix0.class != obj.getClass()) {
            return false;
        }
        ix0 ix0Var = (ix0) obj;
        return this.b.equals(ix0Var.b) && this.a.equals(ix0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
