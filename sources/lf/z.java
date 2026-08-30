package lf;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public enum z {
    /* JADX INFO: Fake field, exist only in values array */
    EF8(0, "unknown delay"),
    /* JADX INFO: Fake field, exist only in values array */
    EF18(1, "input"),
    /* JADX INFO: Fake field, exist only in values array */
    EF28(2, "animation"),
    /* JADX INFO: Fake field, exist only in values array */
    EF38(3, "layout"),
    /* JADX INFO: Fake field, exist only in values array */
    EF48(4, "draw"),
    /* JADX INFO: Fake field, exist only in values array */
    EF59(5, "sync"),
    /* JADX INFO: Fake field, exist only in values array */
    EF69(6, "cmd issue"),
    /* JADX INFO: Fake field, exist only in values array */
    EF84(7, "swap buffers"),
    /* JADX INFO: Fake field, exist only in values array */
    EF99(31, "GPU_DURATION", "gpu"),
    /* JADX INFO: Fake field, exist only in values array */
    EF119(8, "total");

    public final int a;
    public final String b;
    public final int c;
    public long d;
    public double e;

    z(int i10, String str) {
        this(24, r7, str);
    }

    z(int i10, String str, String str2) {
        this.d = Long.MIN_VALUE;
        this.e = 0.0d;
        this.a = r4;
        this.b = str2;
        this.c = i10;
    }
}
