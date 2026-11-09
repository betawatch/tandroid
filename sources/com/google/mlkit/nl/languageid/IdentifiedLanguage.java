package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import org.telegram.ui.ky0;
import y7.r0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        ky0 ky0Var = new ky0("IdentifiedLanguage", 29);
        ky0 ky0Var2 = new ky0(28, false);
        ((ky0) ky0Var.d).d = ky0Var2;
        ky0Var.d = ky0Var2;
        ky0Var2.c = this.a;
        ky0Var2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        r0 r0Var = new r0(28, false);
        ((ky0) ky0Var.d).d = r0Var;
        ky0Var.d = r0Var;
        r0Var.c = valueOf;
        r0Var.b = "confidence";
        return ky0Var.toString();
    }
}
