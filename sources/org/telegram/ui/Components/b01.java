package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class b01 extends ViewGroup.MarginLayoutParams {
    public d01 a;
    public d01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b01() {
        super(-2, -2);
        d01 d01Var = d01.e;
        this.a = d01Var;
        this.b = d01Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = d01Var;
        this.b = d01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b01.class != obj.getClass()) {
            return false;
        }
        b01 b01Var = (b01) obj;
        return this.b.equals(b01Var.b) && this.a.equals(b01Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
