package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import v7.q0;
import v7.r1;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
        r1 r1Var = new r1("IdentifiedLanguage", 1);
        r1 r1Var2 = new r1(0, false);
        ((r1) r1Var.d).c = r1Var2;
        r1Var.d = r1Var2;
        r1Var2.d = this.a;
        r1Var2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        q0 q0Var = new q0(0, false);
        ((r1) r1Var.d).c = q0Var;
        r1Var.d = q0Var;
        q0Var.d = valueOf;
        q0Var.b = "confidence";
        return r1Var.toString();
    }
}
