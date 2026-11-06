package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class gx0 extends ViewGroup.MarginLayoutParams {
    public ix0 a;
    public ix0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx0() {
        super(-2, -2);
        ix0 ix0Var = ix0.e;
        this.a = ix0Var;
        this.b = ix0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = ix0Var;
        this.b = ix0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gx0.class != obj.getClass()) {
            return false;
        }
        gx0 gx0Var = (gx0) obj;
        return this.b.equals(gx0Var.b) && this.a.equals(gx0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
