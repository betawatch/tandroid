package c3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class j0 implements com.google.android.gms.common.api.internal.s {
    public final String[] a;

    public /* synthetic */ j0(g6.r rVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        g6.q qVar = new g6.q(1, (TaskCompletionSource) obj2);
        g6.i iVar = (g6.i) ((g6.s) obj).u();
        Parcel O0 = iVar.O0();
        com.google.android.gms.internal.cast.v.d(O0, qVar);
        O0.writeStringArray(this.a);
        iVar.T0(O0, 6);
    }

    public j0(String[] strArr) {
        this.a = strArr;
    }
}
