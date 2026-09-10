package c6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements com.google.android.gms.common.api.internal.s {
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

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                e0 e0Var = this.b;
                String str = this.c;
                String str2 = this.d;
                g6.w wVar = (g6.w) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                n6.l.j("Not connected to device", e0Var.F == 2);
                g6.f fVar = (g6.f) wVar.u();
                Parcel O0 = fVar.O0();
                O0.writeString(str);
                O0.writeString(str2);
                int i10 = com.google.android.gms.internal.cast.v.a;
                O0.writeInt(0);
                fVar.T0(O0, 14);
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
                g6.w wVar2 = (g6.w) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = e0Var2.B;
                long incrementAndGet = e0Var2.q.incrementAndGet();
                n6.l.j("Not connected to device", e0Var2.F == 2);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    g6.f fVar2 = (g6.f) wVar2.u();
                    Parcel O02 = fVar2.O0();
                    O02.writeString(str3);
                    O02.writeString(str4);
                    O02.writeLong(incrementAndGet);
                    fVar2.T0(O02, 9);
                    return;
                } catch (RemoteException e) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e);
                    return;
                }
        }
    }
}
