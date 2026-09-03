package com.google.mlkit.nl.languageid;

import af.d;
import j7.t0;
import java.util.Arrays;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        ((d) dVar.d).d = dVar2;
        dVar.d = dVar2;
        dVar2.c = this.a;
        dVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        t0 t0Var = new t0(21, false);
        ((d) dVar.d).d = t0Var;
        dVar.d = t0Var;
        t0Var.c = valueOf;
        t0Var.b = "confidence";
        return dVar.toString();
    }
}
