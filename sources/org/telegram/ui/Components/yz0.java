package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class yz0 extends ViewGroup.MarginLayoutParams {
    public a01 a;
    public a01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz0() {
        super(-2, -2);
        a01 a01Var = a01.e;
        this.a = a01Var;
        this.b = a01Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = a01Var;
        this.b = a01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yz0.class != obj.getClass()) {
            return false;
        }
        yz0 yz0Var = (yz0) obj;
        return this.b.equals(yz0Var.b) && this.a.equals(yz0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
