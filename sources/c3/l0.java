package c3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class l0 implements com.google.android.gms.common.api.internal.r {
    public final String[] a;

    public /* synthetic */ l0(h6.r rVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        h6.q qVar = new h6.q(1, (TaskCompletionSource) obj2);
        h6.i iVar = (h6.i) ((h6.s) obj).u();
        Parcel N0 = iVar.N0();
        com.google.android.gms.internal.cast.t.d(N0, qVar);
        N0.writeStringArray(this.a);
        iVar.S0(N0, 6);
    }

    public l0(String[] strArr) {
        this.a = strArr;
    }
}
