package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fz0 extends ViewGroup.MarginLayoutParams {
    public hz0 a;
    public hz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz0() {
        super(-2, -2);
        hz0 hz0Var = hz0.e;
        this.a = hz0Var;
        this.b = hz0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = hz0Var;
        this.b = hz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fz0.class != obj.getClass()) {
            return false;
        }
        fz0 fz0Var = (fz0) obj;
        return this.b.equals(fz0Var.b) && this.a.equals(fz0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
