package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import v7.l;
import v7.s0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        l lVar = new l("IdentifiedLanguage", 2);
        l lVar2 = new l(1, false);
        ((l) lVar.d).d = lVar2;
        lVar.d = lVar2;
        lVar2.c = this.a;
        lVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        s0 s0Var = new s0(1, false);
        ((l) lVar.d).d = s0Var;
        lVar.d = s0Var;
        s0Var.c = valueOf;
        s0Var.b = "confidence";
        return lVar.toString();
    }
}
