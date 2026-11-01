package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class ly0 extends ViewGroup.MarginLayoutParams {
    public ny0 a;
    public ny0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly0() {
        super(-2, -2);
        ny0 ny0Var = ny0.e;
        this.a = ny0Var;
        this.b = ny0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = ny0Var;
        this.b = ny0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ly0.class != obj.getClass()) {
            return false;
        }
        ly0 ly0Var = (ly0) obj;
        return this.b.equals(ly0Var.b) && this.a.equals(ly0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
