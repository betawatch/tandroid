package com.google.android.gms.common.api.internal;

import java.util.Arrays;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class q0 {
    public final b a;
    public final k6.c b;

    public /* synthetic */ q0(b bVar, k6.c cVar) {
        this.a = bVar;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof q0)) {
            q0 q0Var = (q0) obj;
            if (n6.l.l(this.a, q0Var.a) && n6.l.l(this.b, q0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        m5.e eVar = new m5.e(this);
        eVar.g(this.a, "key");
        eVar.g(this.b, "feature");
        return eVar.toString();
    }
}
