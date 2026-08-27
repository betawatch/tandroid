package m3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class y implements com.google.android.gms.common.api.internal.s {
    public final String[] a;

    public /* synthetic */ y(r5.s sVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        r5.r rVar = new r5.r(1, (TaskCompletionSource) obj2);
        r5.i iVar = (r5.i) ((r5.t) obj).u();
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.t.d(M0, rVar);
        M0.writeStringArray(this.a);
        iVar.R0(M0, 6);
    }

    public y(String[] strArr) {
        this.a = strArr;
    }
}
