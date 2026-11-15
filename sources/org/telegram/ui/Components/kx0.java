package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class kx0 extends ViewGroup.MarginLayoutParams {
    public mx0 a;
    public mx0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kx0() {
        super(-2, -2);
        mx0 mx0Var = mx0.e;
        this.a = mx0Var;
        this.b = mx0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = mx0Var;
        this.b = mx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kx0.class != obj.getClass()) {
            return false;
        }
        kx0 kx0Var = (kx0) obj;
        return this.b.equals(kx0Var.b) && this.a.equals(kx0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
