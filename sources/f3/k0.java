package f3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
