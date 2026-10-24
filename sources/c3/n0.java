package c3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class n0 implements com.google.android.gms.common.api.internal.r {
    public final String[] a;

    public /* synthetic */ n0(g6.r rVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        g6.q qVar = new g6.q(2, (TaskCompletionSource) obj2);
        g6.i iVar = (g6.i) ((g6.s) obj).u();
        Parcel N0 = iVar.N0();
        com.google.android.gms.internal.cast.v.d(N0, qVar);
        N0.writeStringArray(this.a);
        iVar.S0(N0, 7);
    }

    public n0(String[] strArr) {
        this.a = strArr;
    }
}
