package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
