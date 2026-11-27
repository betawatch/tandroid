// default package

import java.util.ArrayList;
import java.util.IdentityHashMap;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class jl9 {
    public final hl9 a;
    public final ArrayList b;
    public final int c;
    public final int d;
    public final kl9 e;
    public int f;
    public int g;
    public kl9 h;

    public jl9(hl9 hl9Var, ArrayList arrayList, int i, int i2, kl9 kl9Var, int i3, int i4, kl9 kl9Var2) {
        this.a = hl9Var;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = kl9Var;
        this.f = i3;
        this.g = i4;
        this.h = kl9Var2;
    }

    public final TL_iv.RichText a(int i) {
        int i2 = i == this.c ? this.d : 0;
        int i3 = i == this.f ? this.g : Integer.MAX_VALUE;
        return (i2 == 0 && i3 == Integer.MAX_VALUE) ? (TL_iv.RichText) this.b.get(i) : b(i).b(i2, i3);
    }

    public final kl9 b(int i) {
        if (i == this.c) {
            return this.e;
        }
        int i2 = this.f;
        ArrayList arrayList = this.b;
        hl9 hl9Var = this.a;
        if (i != i2) {
            TL_iv.RichText richText = (TL_iv.RichText) arrayList.get(i);
            IdentityHashMap identityHashMap = new IdentityHashMap();
            return new kl9(richText, identityHashMap, hl9Var.o(richText, 0, identityHashMap).length(), 0);
        }
        kl9 kl9Var = this.h;
        if (kl9Var != null) {
            return kl9Var;
        }
        TL_iv.RichText richText2 = (TL_iv.RichText) arrayList.get(i);
        IdentityHashMap identityHashMap2 = new IdentityHashMap();
        kl9 kl9Var2 = new kl9(richText2, identityHashMap2, hl9Var.o(richText2, 0, identityHashMap2).length(), 0);
        this.h = kl9Var2;
        return kl9Var2;
    }
}
