package com.google.mlkit.nl.languageid;

import java.util.Arrays;
import org.telegram.ui.hy0;
import y7.r0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        hy0 hy0Var = new hy0("IdentifiedLanguage", 29);
        hy0 hy0Var2 = new hy0(28, false);
        ((hy0) hy0Var.d).d = hy0Var2;
        hy0Var.d = hy0Var2;
        hy0Var2.c = this.a;
        hy0Var2.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        r0 r0Var = new r0(28, false);
        ((hy0) hy0Var.d).d = r0Var;
        hy0Var.d = r0Var;
        r0Var.c = valueOf;
        r0Var.b = "confidence";
        return hy0Var.toString();
    }
}
