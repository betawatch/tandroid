// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class i24 implements Runnable {
    public String a;
    public int b;
    public final ArrayList c = new ArrayList();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList(0);
    public final ArrayList s = new ArrayList(0);
    public final LongSparseArray w = new LongSparseArray(0);
    public final /* synthetic */ j24 x;

    public i24(j24 j24Var) {
        this.x = j24Var;
    }

    public final void a(Runnable runnable, boolean z) {
        String[] F0 = hl.F0();
        ls6.d0(this.x.R.d1).b2(false, F0.length == 0 ? "" : F0[0], this.a, new e52((Object) this, z, (Object) runnable, (byte) 1), z);
    }

    @Override // java.lang.Runnable
    public final void run() {
        j24 j24Var = this.x;
        o24 o24Var = j24Var.R;
        if (TextUtils.isEmpty(j24Var.O)) {
            j79 adapter = o24Var.E0.getAdapter();
            g24 g24Var = o24Var.z0;
            if (adapter != g24Var) {
                o24Var.E0.setAdapter(g24Var);
            }
            j24Var.f();
            return;
        }
        byte b = 1;
        int i = j24Var.N + 1;
        j24Var.N = i;
        this.b = i;
        this.a = j24Var.O;
        j24Var.E = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        o24Var.H0.d(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new vz3(this, b), new h24(this, b));
        } else {
            Utilities.B(new vz3(this, b), new h24(this, (byte) 2), new h24(this, (byte) 3), new h24(this, (byte) 4), new h24(this, (byte) 5), new h24(this, (byte) 6), new h24(this, (byte) 7));
        }
    }
}
