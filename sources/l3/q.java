package l3;

import j7.l1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q extends Exception {
    public final int a;
    public final boolean b;
    public final j3.t0 c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q(int i10, int i11, int i12, int i13, j3.t0 t0Var, boolean z10, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("AudioTrack init failed ", i10, " Config(", i11, ", ");
        l1.w(o10, i12, ", ", i13, ")");
        o10.append(z10 ? " (recoverable)" : "");
        this.a = i10;
        this.b = z10;
        this.c = t0Var;
    }
}
