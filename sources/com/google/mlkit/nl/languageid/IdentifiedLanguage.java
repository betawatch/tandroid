package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import org.telegram.ui.ld0;
import y7.r0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        ld0 ld0Var = new ld0("IdentifiedLanguage", 28);
        ld0 ld0Var2 = new ld0(27, false);
        ((ld0) ld0Var.c).c = ld0Var2;
        ld0Var.c = ld0Var2;
        ld0Var2.b = this.a;
        ld0Var2.d = "languageTag";
        String valueOf = String.valueOf(this.b);
        r0 r0Var = new r0(27, false);
        ((ld0) ld0Var.c).c = r0Var;
        ld0Var.c = r0Var;
        r0Var.b = valueOf;
        r0Var.d = "confidence";
        return ld0Var.toString();
    }
}
