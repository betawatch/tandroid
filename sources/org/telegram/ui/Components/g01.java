package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g01 extends ViewGroup.MarginLayoutParams {
    public i01 a;
    public i01 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g01() {
        super(-2, -2);
        i01 i01Var = i01.e;
        this.a = i01Var;
        this.b = i01Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = i01Var;
        this.b = i01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g01.class != obj.getClass()) {
            return false;
        }
        g01 g01Var = (g01) obj;
        return this.b.equals(g01Var.b) && this.a.equals(g01Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
