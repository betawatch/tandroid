package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import v7.k;
import v7.s0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        k kVar = new k("IdentifiedLanguage", 2);
        k kVar2 = new k(1, false);
        ((k) kVar.d).d = kVar2;
        kVar.d = kVar2;
        kVar2.c = this.a;
        kVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        s0 s0Var = new s0(1, false);
        ((k) kVar.d).d = s0Var;
        kVar.d = s0Var;
        s0Var.c = valueOf;
        s0Var.b = "confidence";
        return kVar.toString();
    }
}
