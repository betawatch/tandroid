package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import q5.d;
import v7.o0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class IdentifiedLanguage {
    public final String a;
    public final float b;

    public IdentifiedLanguage(String str, float f7) {
        this.a = str;
        this.b = f7;
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
        d dVar = new d("IdentifiedLanguage", 11);
        d dVar2 = new d(10, false);
        ((d) dVar.d).d = dVar2;
        dVar.d = dVar2;
        dVar2.c = this.a;
        dVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        o0 o0Var = new o0(10, false);
        ((d) dVar.d).d = o0Var;
        dVar.d = o0Var;
        o0Var.c = valueOf;
        o0Var.b = "confidence";
        return dVar.toString();
    }
}
