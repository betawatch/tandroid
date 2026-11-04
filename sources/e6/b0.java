package e6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements com.google.android.gms.common.api.internal.p {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ b0(e0 e0Var, String str, String str2, int i3) {
        this.a = i3;
        this.b = e0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // com.google.android.gms.common.api.internal.p
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                String str = this.c;
                String str2 = this.d;
                i6.w wVar = (i6.w) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                p6.m.i("Not connected to device", e0Var.G == 2);
                i6.f fVar = (i6.f) wVar.m();
                Parcel P0 = fVar.P0();
                P0.writeString(str);
                P0.writeString(str2);
                int i3 = com.google.android.gms.internal.cast.u.a;
                P0.writeInt(0);
                fVar.U0(P0, 14);
                synchronized (e0Var.s) {
                    try {
                        if (e0Var.p != null) {
                            e0Var.i(2477);
                        }
                        e0Var.p = taskCompletionSource;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                e0 e0Var2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                i6.w wVar2 = (i6.w) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = e0Var2.C;
                long incrementAndGet = e0Var2.r.incrementAndGet();
                p6.m.i("Not connected to device", e0Var2.G == 2);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    i6.f fVar2 = (i6.f) wVar2.m();
                    Parcel P02 = fVar2.P0();
                    P02.writeString(str3);
                    P02.writeString(str4);
                    P02.writeLong(incrementAndGet);
                    fVar2.U0(P02, 9);
                    return;
                } catch (RemoteException e10) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e10);
                    return;
                }
        }
    }
}
