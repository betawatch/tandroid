package li;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class a {
    public static long u = 1;
    public final long a;
    public TL_iv.PageBlock b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public s g;
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(TL_iv.PageBlock pageBlock, int i7, int i10) {
        this(pageBlock, i7, i10, r4);
        long j3 = u;
        u = 1 + j3;
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

    public a(TL_iv.PageBlock pageBlock, int i7, int i10, long j3) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.b = pageBlock;
        this.c = i7;
        this.d = i10;
        this.a = j3;
    }
}
