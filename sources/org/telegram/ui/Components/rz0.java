package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rz0 extends ViewGroup.MarginLayoutParams {
    public tz0 a;
    public tz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz0() {
        super(-2, -2);
        tz0 tz0Var = tz0.e;
        this.a = tz0Var;
        this.b = tz0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = tz0Var;
        this.b = tz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rz0.class != obj.getClass()) {
            return false;
        }
        rz0 rz0Var = (rz0) obj;
        return this.b.equals(rz0Var.b) && this.a.equals(rz0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
