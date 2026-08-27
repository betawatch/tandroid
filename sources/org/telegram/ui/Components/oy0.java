package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class oy0 extends ViewGroup.MarginLayoutParams {
    public qy0 a;
    public qy0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy0() {
        super(-2, -2);
        qy0 qy0Var = qy0.e;
        this.a = qy0Var;
        this.b = qy0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = qy0Var;
        this.b = qy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || oy0.class != obj.getClass()) {
            return false;
        }
        oy0 oy0Var = (oy0) obj;
        return this.b.equals(oy0Var.b) && this.a.equals(oy0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
