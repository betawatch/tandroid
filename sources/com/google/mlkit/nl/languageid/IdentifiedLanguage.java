package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import org.telegram.ui.nd0;
import y7.r0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        nd0 nd0Var = new nd0("IdentifiedLanguage", 28);
        nd0 nd0Var2 = new nd0(27, false);
        ((nd0) nd0Var.c).c = nd0Var2;
        nd0Var.c = nd0Var2;
        nd0Var2.b = this.a;
        nd0Var2.d = "languageTag";
        String valueOf = String.valueOf(this.b);
        r0 r0Var = new r0(27, false);
        ((nd0) nd0Var.c).c = r0Var;
        nd0Var.c = r0Var;
        r0Var.b = valueOf;
        r0Var.d = "confidence";
        return nd0Var.toString();
    }
}
