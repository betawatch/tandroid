package org.telegram.ui.Components;

import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class qz0 extends ViewGroup.MarginLayoutParams {
    public sz0 a;
    public sz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz0() {
        super(-2, -2);
        sz0 sz0Var = sz0.e;
        this.a = sz0Var;
        this.b = sz0Var;
        setMargins(TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31, TLObject.FLAG_31);
        this.a = sz0Var;
        this.b = sz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qz0.class != obj.getClass()) {
            return false;
        }
        qz0 qz0Var = (qz0) obj;
        return this.b.equals(qz0Var.b) && this.a.equals(qz0Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
