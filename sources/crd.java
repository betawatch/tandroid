// default package

import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class crd {
    public static void a(Appendable appendable, char c) {
        try {
            appendable.append(c);
        } catch (IOException e) {
            grb.m(e);
        }
    }
}
