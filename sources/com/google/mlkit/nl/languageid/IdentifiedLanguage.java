package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import org.telegram.ui.md0;
import y7.r0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
        md0 md0Var = new md0("IdentifiedLanguage", 28);
        md0 md0Var2 = new md0(27, false);
        ((md0) md0Var.c).c = md0Var2;
        md0Var.c = md0Var2;
        md0Var2.b = this.a;
        md0Var2.d = "languageTag";
        String valueOf = String.valueOf(this.b);
        r0 r0Var = new r0(27, false);
        ((md0) md0Var.c).c = r0Var;
        md0Var.c = r0Var;
        r0Var.b = valueOf;
        r0Var.d = "confidence";
        return md0Var.toString();
    }
}
