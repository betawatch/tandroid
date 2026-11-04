package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import p7.d;
import x7.q0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class IdentifiedLanguage {
    public final String a;
    public final float b;

    public IdentifiedLanguage(String str, float f10) {
        this.a = str;
        this.b = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdentifiedLanguage)) {
            return false;
        }
        IdentifiedLanguage identifiedLanguage = (IdentifiedLanguage) obj;
        if (Float.compare(identifiedLanguage.b, this.b) != 0) {
            return false;
        }
        Object obj2 = identifiedLanguage.a;
        String str = this.a;
        if (str != obj2) {
            return str != null && str.equals(obj2);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }

    public final String toString() {
        d dVar = new d("IdentifiedLanguage", 22);
        d dVar2 = new d(21, false);
        ((d) dVar.c).c = dVar2;
        dVar.c = dVar2;
        dVar2.d = this.a;
        dVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        q0 q0Var = new q0(21, false);
        ((d) dVar.c).c = q0Var;
        dVar.c = q0Var;
        q0Var.d = valueOf;
        q0Var.b = "confidence";
        return dVar.toString();
    }
}
