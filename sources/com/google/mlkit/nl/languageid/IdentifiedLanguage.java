package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import s4.d;
import w7.r0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        d dVar = new d("IdentifiedLanguage", 9);
        d dVar2 = new d(8, false);
        ((d) dVar.d).d = dVar2;
        dVar.d = dVar2;
        dVar2.c = this.a;
        dVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        r0 r0Var = new r0(8, false);
        ((d) dVar.d).d = r0Var;
        dVar.d = r0Var;
        r0Var.c = valueOf;
        r0Var.b = "confidence";
        return dVar.toString();
    }
}
