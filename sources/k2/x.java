package k2;

import com.google.android.gms.internal.play_billing.k3;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class x extends Exception {
    public final boolean a;
    public final b2.w b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(int i10, int i11, int i12, int i13, b2.w wVar, boolean z10, n nVar) {
        super(r3.toString(), nVar);
        StringBuilder k10 = k3.k("AudioTrack init failed 0 Config(", i10, ", ", i11, ", ");
        k3.r(k10, i12, ", ", i13, ") ");
        k10.append(wVar);
        k10.append(z10 ? " (recoverable)" : "");
        this.a = z10;
        this.b = wVar;
    }
}
