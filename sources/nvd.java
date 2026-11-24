// default package

import android.content.Context;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nvd extends x23 {
    public final cg7 b;

    public nvd(cg7 cg7Var) {
        super((byte) 4);
        this.b = cg7Var;
    }

    @Override // x23
    public final Object a(Object obj) {
        pdd pddVar;
        im5 im5Var = (im5) obj;
        Context b = this.b.b();
        e05.b.getClass();
        if (x05.a(b) >= 204700000) {
            pddVar = new dmc(b, im5Var);
        } else {
            p41 p41Var = new p41();
            p41Var.b = b;
            Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
            p41Var.c = new toe(1, -1, im5Var.a, 1);
            e05.b.getClass();
            p41Var.d = x05.a(b) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
            pddVar = p41Var;
        }
        return new lee(im5Var, pddVar, n7f.d());
    }
}
