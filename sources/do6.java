// default package

import android.util.SparseArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class do6 {
    public final int a;
    public boolean b;
    public final String c;
    public final no6 d;
    public final ArrayList e = new ArrayList();
    public final SparseArray f = new SparseArray();

    public do6(int i, String str, no6 no6Var) {
        this.a = i;
        this.c = str;
        this.d = no6Var;
    }

    public final void a(no6 no6Var) {
        this.e.add(no6Var);
        this.f.put(no6Var.C, no6Var);
    }
}
