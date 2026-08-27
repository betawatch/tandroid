package hh;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class t4 {
    public final e5 a;
    public y4 b;
    public y4 c;
    public y4 d;
    public p4 h;
    public p4 i;
    public p4 j;
    public p4 k;
    public TL_stars.TL_starGiftUnique l;
    public long m;
    public v1 r;
    public v1 s;
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

    public t4(e5 e5Var) {
        this.a = e5Var;
        e5Var.c.addOnAttachStateChangeListener(new bf.b(this, 4));
    }

    public final void a() {
        this.o = false;
        this.a.c.c();
        p4 p4Var = this.h;
        if (p4Var != null) {
            p4Var.a();
        }
        p4 p4Var2 = this.i;
        if (p4Var2 != null) {
            p4Var2.a();
        }
        p4 p4Var3 = this.j;
        if (p4Var3 != null) {
            p4Var3.a();
        }
        p4 p4Var4 = this.k;
        if (p4Var4 != null) {
            p4Var4.a();
        }
        c();
    }

    public final void b() {
        if (this.o && !this.v) {
            this.v = true;
            AndroidUtilities.runOnUIThread(new n4(this, 1));
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
            ((r4) obj).a();
        }
        arrayList.clear();
        this.f.clear();
        this.g.clear();
    }
}
