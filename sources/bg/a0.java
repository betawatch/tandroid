package bg;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public enum a0 {
    /* JADX INFO: Fake field, exist only in values array */
    EF7(0, "unknown delay"),
    /* JADX INFO: Fake field, exist only in values array */
    EF17(1, "input"),
    /* JADX INFO: Fake field, exist only in values array */
    EF27(2, "animation"),
    /* JADX INFO: Fake field, exist only in values array */
    EF37(3, "layout"),
    /* JADX INFO: Fake field, exist only in values array */
    EF47(4, "draw"),
    /* JADX INFO: Fake field, exist only in values array */
    EF57(5, "sync"),
    /* JADX INFO: Fake field, exist only in values array */
    EF67(6, "cmd issue"),
    /* JADX INFO: Fake field, exist only in values array */
    EF81(7, "swap buffers"),
    /* JADX INFO: Fake field, exist only in values array */
    EF96(31, "GPU_DURATION", "gpu"),
    /* JADX INFO: Fake field, exist only in values array */
    EF115(8, "total");

    public final int a;
    public final String b;
    public final int c;
    public long d;
    public double e;

    a0(int i7, String str) {
        this(24, r7, str);
    }

    a0(int i7, String str, String str2) {
        this.d = Long.MIN_VALUE;
        this.e = 0.0d;
        this.a = r4;
        this.b = str2;
        this.c = i7;
    }
}
