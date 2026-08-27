package m5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ c0(f0 f0Var, String str, String str2, int i10) {
        this.a = i10;
        this.b = f0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // com.google.android.gms.common.api.internal.s
    public final void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                f0 f0Var = this.b;
                String str = this.c;
                String str2 = this.d;
                r5.x xVar = (r5.x) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                y5.l.j("Not connected to device", f0Var.F == 2);
                r5.f fVar = (r5.f) xVar.u();
                Parcel M0 = fVar.M0();
                M0.writeString(str);
                M0.writeString(str2);
                int i10 = com.google.android.gms.internal.cast.t.a;
                M0.writeInt(0);
                fVar.R0(M0, 14);
                synchronized (f0Var.r) {
                    try {
                        if (f0Var.o != null) {
                            f0Var.i(2477);
                        }
                        f0Var.o = taskCompletionSource;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                f0 f0Var2 = this.b;
                String str3 = this.c;
                String str4 = this.d;
                r5.x xVar2 = (r5.x) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = f0Var2.B;
                long incrementAndGet = f0Var2.q.incrementAndGet();
                y5.l.j("Not connected to device", f0Var2.F == 2);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    r5.f fVar2 = (r5.f) xVar2.u();
                    Parcel M02 = fVar2.M0();
                    M02.writeString(str3);
                    M02.writeString(str4);
                    M02.writeLong(incrementAndGet);
                    fVar2.R0(M02, 9);
                    return;
                } catch (RemoteException e9) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e9);
                    return;
                }
        }
    }
}
