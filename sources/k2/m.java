package k2;

import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class m extends Exception {
    public final int a;
    public final boolean b;
    public final b2.s c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(int i10, int i11, int i12, int i13, int i14, b2.s sVar, boolean z10, RuntimeException runtimeException) {
        super(r5.toString(), runtimeException);
        StringBuilder k10 = e2.k("AudioTrack init failed ", i10, " Config(", i11, ", ");
        i2.g.v(k10, i12, ", ", i13, ", ");
        k10.append(i14);
        k10.append(") ");
        k10.append(sVar);
        k10.append(z10 ? " (recoverable)" : "");
        this.a = i10;
        this.b = z10;
        this.c = sVar;
    }
}
