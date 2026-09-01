package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class jz0 extends ViewGroup.MarginLayoutParams {
    public lz0 a;
    public lz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz0() {
        super(-2, -2);
        lz0 lz0Var = lz0.e;
        this.a = lz0Var;
        this.b = lz0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = lz0Var;
        this.b = lz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jz0.class != obj.getClass()) {
            return false;
        }
        jz0 jz0Var = (jz0) obj;
        return this.b.equals(jz0Var.b) && this.a.equals(jz0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
