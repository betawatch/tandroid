package com.google.mlkit.nl.languageid;

import androidx.biometric.e;
import j7.t0;
import java.util.Arrays;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        e eVar = new e("IdentifiedLanguage", 22);
        e eVar2 = new e(21, false);
        ((e) eVar.d).d = eVar2;
        eVar.d = eVar2;
        eVar2.c = this.a;
        eVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        t0 t0Var = new t0(21, false);
        ((e) eVar.d).d = t0Var;
        eVar.d = t0Var;
        t0Var.c = valueOf;
        t0Var.b = "confidence";
        return eVar.toString();
    }
}
