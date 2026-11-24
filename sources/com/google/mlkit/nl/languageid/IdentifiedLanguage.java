package com.google.mlkit.nl.languageid;

import java.util.Arrays;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        rod rodVar = new rod("IdentifiedLanguage");
        byte b = 28;
        boolean z = false;
        vk9 vk9Var = new vk9(b, z);
        ((vk9) rodVar.d).d = vk9Var;
        rodVar.d = vk9Var;
        vk9Var.c = this.a;
        vk9Var.b = "languageTag";
        String valueOf = String.valueOf(this.b);
        ugd ugdVar = new ugd(b, z);
        ((vk9) rodVar.d).d = ugdVar;
        rodVar.d = ugdVar;
        ugdVar.c = valueOf;
        ugdVar.b = "confidence";
        return rodVar.toString();
    }
}
