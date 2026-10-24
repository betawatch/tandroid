package k2;

import com.google.android.gms.internal.play_billing.k3;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
