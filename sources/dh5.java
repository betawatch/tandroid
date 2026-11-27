// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class dh5 implements Comparable {
    public final String a;
    public final ch5 b;
    public final long c;
    public final int d;
    public final long e;
    public final hr3 f;
    public final String h;
    public final String n;
    public final long r;
    public final long s;
    public final boolean w;

    public dh5(String str, ch5 ch5Var, long j, int i, long j2, hr3 hr3Var, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = ch5Var;
        this.c = j;
        this.d = i;
        this.e = j2;
        this.f = hr3Var;
        this.h = str2;
        this.n = str3;
        this.r = j3;
        this.s = j4;
        this.w = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.e;
        if (j > longValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
