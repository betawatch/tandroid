package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class gz0 extends ViewGroup.MarginLayoutParams {
    public iz0 a;
    public iz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz0() {
        super(-2, -2);
        iz0 iz0Var = iz0.e;
        this.a = iz0Var;
        this.b = iz0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = iz0Var;
        this.b = iz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gz0.class != obj.getClass()) {
            return false;
        }
        gz0 gz0Var = (gz0) obj;
        return this.b.equals(gz0Var.b) && this.a.equals(gz0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
