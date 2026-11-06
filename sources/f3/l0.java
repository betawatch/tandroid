package f3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
