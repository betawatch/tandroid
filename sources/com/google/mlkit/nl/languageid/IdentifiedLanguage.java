package com.google.mlkit.nl.languageid;

import androidx.biometric.e;
import h7.s0;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class IdentifiedLanguage {
    public final String a;
    public final float b;

    public IdentifiedLanguage(String str, float f9) {
        this.a = str;
        this.b = f9;
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
        e eVar = new e("IdentifiedLanguage", 15);
        e eVar2 = new e(14, false);
        ((e) eVar.d).d = eVar2;
        eVar.d = eVar2;
        eVar2.c = this.a;
        eVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        s0 s0Var = new s0(14, false);
        ((e) eVar.d).d = s0Var;
        eVar.d = s0Var;
        s0Var.c = valueOf;
        s0Var.b = "confidence";
        return eVar.toString();
    }
}
