// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public enum lr4 {
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

    public final byte a;
    public final String b;
    public final byte c;
    public long d;
    public double e;

    /* JADX WARN: Multi-variable type inference failed */
    lr4(int i, String str, String str2) {
        this.d = Long.MIN_VALUE;
        this.e = 0.0d;
        this.a = r4;
        this.b = str2;
        this.c = i;
    }

    lr4(int i, String str) {
        this(24, r7, str);
    }
}
