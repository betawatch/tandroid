package o3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class y implements com.google.android.gms.common.api.internal.s {
    public final String[] a;

    public /* synthetic */ y(s5.s sVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        s5.r rVar = new s5.r(2, (TaskCompletionSource) obj2);
        s5.i iVar = (s5.i) ((s5.t) obj).u();
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.u.d(M0, rVar);
        M0.writeStringArray(this.a);
        iVar.R0(M0, 7);
    }

    public y(String[] strArr) {
        this.a = strArr;
    }
}
