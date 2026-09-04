package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ez0 extends ViewGroup.MarginLayoutParams {
    public gz0 a;
    public gz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ez0() {
        super(-2, -2);
        gz0 gz0Var = gz0.e;
        this.a = gz0Var;
        this.b = gz0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = gz0Var;
        this.b = gz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ez0.class != obj.getClass()) {
            return false;
        }
        ez0 ez0Var = (ez0) obj;
        return this.b.equals(ez0Var.b) && this.a.equals(ez0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
