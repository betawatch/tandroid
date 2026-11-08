package f3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        Parcel p12 = iVar.p1();
        com.google.android.gms.internal.cast.t.d(p12, qVar);
        p12.writeStringArray(this.a);
        iVar.u1(p12, 7);
    }

    public l0(String[] strArr) {
        this.a = strArr;
    }
}
