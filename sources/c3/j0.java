package c3;

import android.os.Parcel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class j0 implements com.google.android.gms.common.api.internal.s {
    public final String[] a;

    public /* synthetic */ j0(g6.r rVar, String[] strArr) {
        this.a = strArr;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        g6.q qVar = new g6.q(1, (TaskCompletionSource) obj2);
        g6.i iVar = (g6.i) ((g6.s) obj).u();
        Parcel O0 = iVar.O0();
        com.google.android.gms.internal.cast.v.d(O0, qVar);
        O0.writeStringArray(this.a);
        iVar.T0(O0, 6);
    }

    public j0(String[] strArr) {
        this.a = strArr;
    }
}
