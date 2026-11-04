package e3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class k0 implements com.google.android.gms.common.api.internal.p {
    public final String[] a;

    public /* synthetic */ k0(i6.r rVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        i6.q qVar = new i6.q(1, (TaskCompletionSource) obj2);
        i6.i iVar = (i6.i) ((i6.s) obj).m();
        Parcel P0 = iVar.P0();
        com.google.android.gms.internal.cast.u.d(P0, qVar);
        P0.writeStringArray(this.a);
        iVar.U0(P0, 6);
    }

    public k0(String[] strArr) {
        this.a = strArr;
    }
}
