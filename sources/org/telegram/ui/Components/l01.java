package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class l01 extends ViewGroup.MarginLayoutParams {
    public n01 a;
    public n01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l01() {
        super(-2, -2);
        n01 n01Var = n01.e;
        this.a = n01Var;
        this.b = n01Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = n01Var;
        this.b = n01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l01.class != obj.getClass()) {
            return false;
        }
        l01 l01Var = (l01) obj;
        return this.b.equals(l01Var.b) && this.a.equals(l01Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
