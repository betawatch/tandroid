package f3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class k0 implements com.google.android.gms.common.api.internal.q {
    public final String[] a;

    public /* synthetic */ k0(j6.s sVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.q
    public void accept(Object obj, Object obj2) {
        j6.r rVar = new j6.r(0, (TaskCompletionSource) obj2);
        j6.i iVar = (j6.i) ((j6.t) obj).n();
        Parcel p12 = iVar.p1();
        com.google.android.gms.internal.cast.t.d(p12, rVar);
        p12.writeStringArray(this.a);
        iVar.u1(p12, 5);
    }

    public k0(String[] strArr) {
        this.a = strArr;
    }
}
