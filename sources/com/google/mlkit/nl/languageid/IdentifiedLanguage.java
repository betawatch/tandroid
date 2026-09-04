package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import m2.t;
import v7.q0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
        t tVar = new t("IdentifiedLanguage", 29);
        t tVar2 = new t(28, false);
        ((t) tVar.d).d = tVar2;
        tVar.d = tVar2;
        tVar2.c = this.a;
        tVar2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        q0 q0Var = new q0(28, false);
        ((t) tVar.d).d = q0Var;
        tVar.d = q0Var;
        q0Var.c = valueOf;
        q0Var.b = "confidence";
        return tVar.toString();
    }
}
