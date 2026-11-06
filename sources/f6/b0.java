package f6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements com.google.android.gms.common.api.internal.p {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ b0(e0 e0Var, String str, String str2, int i7) {
        this.a = i7;
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
                j6.w wVar = (j6.w) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                q6.m.i("Not connected to device", e0Var.G == 2);
                j6.f fVar = (j6.f) wVar.n();
                Parcel P0 = fVar.P0();
                P0.writeString(str);
                P0.writeString(str2);
                int i7 = com.google.android.gms.internal.cast.t.a;
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
                j6.w wVar2 = (j6.w) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = e0Var2.C;
                long incrementAndGet = e0Var2.r.incrementAndGet();
                q6.m.i("Not connected to device", e0Var2.G == 2);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    j6.f fVar2 = (j6.f) wVar2.n();
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
