package f3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class l0 implements com.google.android.gms.common.api.internal.q {
    public final String[] a;

    public /* synthetic */ l0(j6.t tVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        j6.s sVar = new j6.s(2, (TaskCompletionSource) obj2);
        j6.i iVar = (j6.i) ((j6.u) obj).n();
        Parcel p12 = iVar.p1();
        com.google.android.gms.internal.cast.t.d(p12, sVar);
        p12.writeStringArray(this.a);
        iVar.u1(p12, 7);
    }

    public l0(String[] strArr) {
        this.a = strArr;
    }
}
