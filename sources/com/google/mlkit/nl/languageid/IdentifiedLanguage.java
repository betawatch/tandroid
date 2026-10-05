package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import v7.k;
import v7.r0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        r0 r0Var = new r0(1, false);
        ((k) kVar.d).d = r0Var;
        kVar.d = r0Var;
        r0Var.c = valueOf;
        r0Var.b = "confidence";
        return kVar.toString();
    }
}
