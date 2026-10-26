package c3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
