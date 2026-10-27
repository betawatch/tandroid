package bi;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o6 {
    public final b7 a;
    public t6 b;
    public t6 c;
    public t6 d;
    public k6 h;
    public k6 i;
    public k6 j;
    public k6 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public a2 r;
    public a2 s;
    public float t;
    public boolean u;
    public boolean v;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public float n = 0.0f;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;

    public o6(b7 b7Var) {
        this.a = b7Var;
        b7Var.c.addOnAttachStateChangeListener(new i6(this, 0));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        k6 k6Var = this.h;
        if (k6Var != null) {
            k6Var.a();
        }
        k6 k6Var2 = this.i;
        if (k6Var2 != null) {
            k6Var2.a();
        }
        k6 k6Var3 = this.j;
        if (k6Var3 != null) {
            k6Var3.a();
        }
        k6 k6Var4 = this.k;
        if (k6Var4 != null) {
            k6Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new h6(this, 1));
        }
    }

    public final void c() {
        if (this.o) {
            return;
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((m6) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
