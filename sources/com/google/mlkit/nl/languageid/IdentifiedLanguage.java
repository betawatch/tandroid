package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import u2.c;
import v7.r0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        c cVar = new c("IdentifiedLanguage", 3);
        c cVar2 = new c(2, false);
        ((c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.c = this.a;
        cVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        r0 r0Var = new r0(2, false);
        ((c) cVar.d).d = r0Var;
        cVar.d = r0Var;
        r0Var.c = valueOf;
        r0Var.b = "confidence";
        return cVar.toString();
    }
}
