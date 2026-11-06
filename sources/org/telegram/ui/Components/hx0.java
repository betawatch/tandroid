package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class hx0 extends ViewGroup.MarginLayoutParams {
    public jx0 a;
    public jx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx0() {
        super(-2, -2);
        jx0 jx0Var = jx0.e;
        this.a = jx0Var;
        this.b = jx0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = jx0Var;
        this.b = jx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hx0.class != obj.getClass()) {
            return false;
        }
        hx0 hx0Var = (hx0) obj;
        return this.b.equals(hx0Var.b) && this.a.equals(hx0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
