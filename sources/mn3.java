// default package

import java.util.Locale;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class mn3 {
    public final String a;
    public final float b;
    public final boolean c;

    public mn3(String str, float f, boolean z) {
        this.a = str;
        this.b = f;
        this.c = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(String.format(Locale.US, " %.2f", Float.valueOf(this.b)));
        sb.append(this.c ? " sure" : "");
        return sb.toString();
    }
}
