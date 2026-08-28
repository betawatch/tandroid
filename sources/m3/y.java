package m3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class y implements com.google.android.gms.common.api.internal.s {
    public final String[] a;

    public /* synthetic */ y(q5.s sVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        q5.r rVar = new q5.r(2, (TaskCompletionSource) obj2);
        q5.i iVar = (q5.i) ((q5.t) obj).u();
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.u.d(M0, rVar);
        M0.writeStringArray(this.a);
        iVar.R0(M0, 7);
    }

    public y(String[] strArr) {
        this.a = strArr;
    }
}
