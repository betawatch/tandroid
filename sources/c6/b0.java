package c6;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                n6.l.i("Not connected to device", e0Var.F == 2);
                g6.f fVar = (g6.f) wVar.v();
                Parcel P0 = fVar.P0();
                P0.writeString(str);
                P0.writeString(str2);
                int i10 = com.google.android.gms.internal.cast.u.a;
                P0.writeInt(0);
                fVar.U0(P0, 14);
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
                n6.l.i("Not connected to device", e0Var2.F == 2);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    g6.f fVar2 = (g6.f) wVar2.v();
                    Parcel P02 = fVar2.P0();
                    P02.writeString(str3);
                    P02.writeString(str4);
                    P02.writeLong(incrementAndGet);
                    fVar2.U0(P02, 9);
                    return;
                } catch (RemoteException e) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e);
                    return;
                }
        }
    }
}
