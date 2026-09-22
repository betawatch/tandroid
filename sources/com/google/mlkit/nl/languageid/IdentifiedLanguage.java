package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import v7.r0;
import v7.s1;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        s1 s1Var = new s1("IdentifiedLanguage", 1);
        s1 s1Var2 = new s1(0, false);
        ((s1) s1Var.d).c = s1Var2;
        s1Var.d = s1Var2;
        s1Var2.d = this.a;
        s1Var2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        r0 r0Var = new r0(0, false);
        ((s1) s1Var.d).c = r0Var;
        s1Var.d = r0Var;
        r0Var.d = valueOf;
        r0Var.b = "confidence";
        return s1Var.toString();
    }
}
