package com.google.mlkit.nl.languageid;

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class IdentifiedLanguage {
    public final String a;
    public final float b;

    public IdentifiedLanguage(String str, float f) {
        this.a = str;
        this.b = f;
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
        htd htdVar = new htd("IdentifiedLanguage");
        byte b = 28;
        boolean z = false;
        ko9 ko9Var = new ko9(b, z);
        ((ko9) htdVar.d).d = ko9Var;
        htdVar.d = ko9Var;
        ko9Var.c = this.a;
        ko9Var.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        lld lldVar = new lld(b, z);
        ((ko9) htdVar.d).d = lldVar;
        htdVar.d = lldVar;
        lldVar.c = valueOf;
        lldVar.b = "confidence";
        return htdVar.toString();
    }
}
