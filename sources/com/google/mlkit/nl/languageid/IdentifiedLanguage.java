package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import m.e3;
import v7.q0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        e3 e3Var = new e3("IdentifiedLanguage", 29);
        e3 e3Var2 = new e3(28, false);
        ((e3) e3Var.d).d = e3Var2;
        e3Var.d = e3Var2;
        e3Var2.c = this.a;
        e3Var2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        q0 q0Var = new q0(28, false);
        ((e3) e3Var.d).d = q0Var;
        e3Var.d = q0Var;
        q0Var.c = valueOf;
        q0Var.b = "confidence";
        return e3Var.toString();
    }
}
