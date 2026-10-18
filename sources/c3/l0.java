package c3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class l0 implements com.google.android.gms.common.api.internal.r {
    public final String[] a;

    public /* synthetic */ l0(g6.r rVar, String[] strArr) {
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

    public l0(String[] strArr) {
        this.a = strArr;
    }
}
