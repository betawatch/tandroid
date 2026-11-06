package f3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class l0 implements com.google.android.gms.common.api.internal.p {
    public final String[] a;

    public /* synthetic */ l0(j6.r rVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        j6.q qVar = new j6.q(2, (TaskCompletionSource) obj2);
        j6.i iVar = (j6.i) ((j6.s) obj).n();
        Parcel P0 = iVar.P0();
        com.google.android.gms.internal.cast.t.d(P0, qVar);
        P0.writeStringArray(this.a);
        iVar.U0(P0, 7);
    }

    public l0(String[] strArr) {
        this.a = strArr;
    }
}
