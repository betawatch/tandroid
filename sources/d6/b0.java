package d6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements com.google.android.gms.common.api.internal.r {
    public final /* synthetic */ int a;
    public final /* synthetic */ e0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ b0(e0 e0Var, String str, String str2, int i10) {
        this.a = i10;
        this.b = e0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // com.google.android.gms.common.api.internal.r
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                String str = this.c;
                String str2 = this.d;
                h6.w wVar = (h6.w) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                o6.l.j("Not connected to device", e0Var.F == 2);
                h6.f fVar = (h6.f) wVar.u();
                Parcel N0 = fVar.N0();
                N0.writeString(str);
                N0.writeString(str2);
                int i10 = com.google.android.gms.internal.cast.t.a;
                N0.writeInt(0);
                fVar.S0(N0, 14);
                synchronized (e0Var.r) {
                    try {
                        if (e0Var.o != null) {
                            e0Var.i(2477);
                        }
                        e0Var.o = taskCompletionSource;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                e0 e0Var2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                h6.w wVar2 = (h6.w) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = e0Var2.B;
                long incrementAndGet = e0Var2.q.incrementAndGet();
                o6.l.j("Not connected to device", e0Var2.F == 2);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    h6.f fVar2 = (h6.f) wVar2.u();
                    Parcel N02 = fVar2.N0();
                    N02.writeString(str3);
                    N02.writeString(str4);
                    N02.writeLong(incrementAndGet);
                    fVar2.S0(N02, 9);
                    return;
                } catch (RemoteException e) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e);
                    return;
                }
        }
    }
}
