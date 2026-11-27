// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
