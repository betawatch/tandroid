package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import org.telegram.ui.ly0;
import y7.r0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        ly0 ly0Var = new ly0("IdentifiedLanguage", 29);
        ly0 ly0Var2 = new ly0(28, false);
        ((ly0) ly0Var.d).d = ly0Var2;
        ly0Var.d = ly0Var2;
        ly0Var2.c = this.a;
        ly0Var2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        r0 r0Var = new r0(28, false);
        ((ly0) ly0Var.d).d = r0Var;
        ly0Var.d = r0Var;
        r0Var.c = valueOf;
        r0Var.b = "confidence";
        return ly0Var.toString();
    }
}
