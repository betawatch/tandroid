package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class d01 extends ViewGroup.MarginLayoutParams {
    public f01 a;
    public f01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d01() {
        super(-2, -2);
        f01 f01Var = f01.e;
        this.a = f01Var;
        this.b = f01Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = f01Var;
        this.b = f01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d01.class != obj.getClass()) {
            return false;
        }
        d01 d01Var = (d01) obj;
        return this.b.equals(d01Var.b) && this.a.equals(d01Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
