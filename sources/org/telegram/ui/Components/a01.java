package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class a01 extends ViewGroup.MarginLayoutParams {
    public c01 a;
    public c01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a01() {
        super(-2, -2);
        c01 c01Var = c01.e;
        this.a = c01Var;
        this.b = c01Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = c01Var;
        this.b = c01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a01.class != obj.getClass()) {
            return false;
        }
        a01 a01Var = (a01) obj;
        return this.b.equals(a01Var.b) && this.a.equals(a01Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
