// default package

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class lk0 {
    public static long u = 1;
    public final long a;
    public TL_iv.PageBlock b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public iy6 g;
    public ArrayList h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public int l;
    public int m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public long t;

    public lk0(TL_iv.PageBlock pageBlock, int i, int i2, long j) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.b = pageBlock;
        this.c = i;
        this.d = i2;
        this.a = j;
    }

    public final boolean a() {
        return this.c > 0 && this.e;
    }

    public final boolean b() {
        return this.c > 0;
    }

    public final boolean c() {
        return this.d > 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lk0(TL_iv.PageBlock pageBlock, int i, int i2) {
        this(pageBlock, i, i2, r4);
        long j = u;
        u = 1 + j;
    }
}
