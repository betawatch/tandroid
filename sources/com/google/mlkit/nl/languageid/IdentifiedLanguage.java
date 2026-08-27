package com.google.mlkit.nl.languageid;

import a5.n;
import g7.t0;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        n nVar = new n("IdentifiedLanguage", 15);
        n nVar2 = new n(14, false);
        ((n) nVar.d).d = nVar2;
        nVar.d = nVar2;
        nVar2.c = this.a;
        nVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        t0 t0Var = new t0(14, false);
        ((n) nVar.d).d = t0Var;
        nVar.d = t0Var;
        t0Var.c = valueOf;
        t0Var.b = "confidence";
        return nVar.toString();
    }
}
