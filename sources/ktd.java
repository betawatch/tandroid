// default package

import android.content.Context;
import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ktd extends l13 {
    public final ae7 b;

    public ktd(ae7 ae7Var) {
        super((byte) 4);
        this.b = ae7Var;
    }

    @Override // l13
    public final Object a(Object obj) {
        nbd nbdVar;
        ik5 ik5Var = (ik5) obj;
        Context b = this.b.b();
        dy4.b.getClass();
        if (yy4.a(b) >= 204700000) {
            nbdVar = new ekc(b, ik5Var);
        } else {
            h31 h31Var = new h31();
            h31Var.b = b;
            Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
            h31Var.c = new qme(1, -1, ik5Var.a, 1);
            dy4.b.getClass();
            h31Var.d = yy4.a(b) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
            nbdVar = h31Var;
        }
        return new kce(ik5Var, nbdVar, l5f.d());
    }
}
