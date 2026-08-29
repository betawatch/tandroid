package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class xy0 extends ViewGroup.MarginLayoutParams {
    public zy0 a;
    public zy0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0() {
        super(-2, -2);
        zy0 zy0Var = zy0.e;
        this.a = zy0Var;
        this.b = zy0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = zy0Var;
        this.b = zy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xy0.class != obj.getClass()) {
            return false;
        }
        xy0 xy0Var = (xy0) obj;
        return this.b.equals(xy0Var.b) && this.a.equals(xy0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
