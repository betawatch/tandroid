package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m01 extends ViewGroup.MarginLayoutParams {
    public o01 a;
    public o01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m01() {
        super(-2, -2);
        o01 o01Var = o01.e;
        this.a = o01Var;
        this.b = o01Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = o01Var;
        this.b = o01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m01.class != obj.getClass()) {
            return false;
        }
        m01 m01Var = (m01) obj;
        return this.b.equals(m01Var.b) && this.a.equals(m01Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
