// default package

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class h59 implements Serializable {
    public final Pattern a;

    public h59(String str) {
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.a = compile;
    }

    public final String toString() {
        String pattern = this.a.toString();
        pattern.getClass();
        return pattern;
    }
}
