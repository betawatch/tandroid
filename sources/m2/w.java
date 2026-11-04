package m2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w extends Exception {
    public final boolean a;
    public final d2.v b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public w(int i3, int i10, int i11, int i12, d2.v vVar, boolean z10, l lVar) {
        super(r3.toString(), lVar);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("AudioTrack init failed 0 Config(", i3, ", ", i10, ", ");
        com.google.android.recaptcha.internal.a.r(m10, i11, ", ", i12, ") ");
        m10.append(vVar);
        m10.append(z10 ? " (recoverable)" : "");
        this.a = z10;
        this.b = vVar;
    }
}
