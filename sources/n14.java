// default package

import android.text.TextUtils;
import android.util.LongSparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class n14 implements Runnable {
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
    public final /* synthetic */ o14 x;

    public n14(o14 o14Var) {
        this.x = o14Var;
    }

    public final void a(Runnable runnable, boolean z) {
        String[] F0 = gl.F0();
        hq6.d0(this.x.R.d1).b2(false, F0.length == 0 ? "" : F0[0], this.a, new o42((Object) this, z, (Object) runnable, (byte) 1), z);
    }

    @Override // java.lang.Runnable
    public final void run() {
        o14 o14Var = this.x;
        t14 t14Var = o14Var.R;
        if (TextUtils.isEmpty(o14Var.O)) {
            w39 adapter = t14Var.E0.getAdapter();
            l14 l14Var = t14Var.z0;
            if (adapter != l14Var) {
                t14Var.E0.setAdapter(l14Var);
            }
            o14Var.f();
            return;
        }
        byte b = 1;
        int i = o14Var.N + 1;
        o14Var.N = i;
        this.b = i;
        this.a = o14Var.O;
        o14Var.E = false;
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.h.clear();
        this.r.clear();
        this.s.clear();
        this.w.clear();
        t14Var.H0.d(true);
        if ("premium".equalsIgnoreCase(this.a)) {
            Utilities.B(new az3(this, b), new m14(this, b));
        } else {
            Utilities.B(new az3(this, b), new m14(this, (byte) 2), new m14(this, (byte) 3), new m14(this, (byte) 4), new m14(this, (byte) 5), new m14(this, (byte) 6), new m14(this, (byte) 7));
        }
    }
}
