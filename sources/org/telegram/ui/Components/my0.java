package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class my0 extends ViewGroup.MarginLayoutParams {
    public oy0 a;
    public oy0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0() {
        super(-2, -2);
        oy0 oy0Var = oy0.e;
        this.a = oy0Var;
        this.b = oy0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = oy0Var;
        this.b = oy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || my0.class != obj.getClass()) {
            return false;
        }
        my0 my0Var = (my0) obj;
        return this.b.equals(my0Var.b) && this.a.equals(my0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
