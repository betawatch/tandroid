package m5;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements com.google.android.gms.common.api.internal.s {
    public final /* synthetic */ int a;
    public final /* synthetic */ f0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ b0(f0 f0Var, String str, String str2, int i9) {
        this.a = i9;
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
                q5.x xVar = (q5.x) obj;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                x5.l.j("Not connected to device", f0Var.F == 2);
                q5.f fVar = (q5.f) xVar.u();
                Parcel M0 = fVar.M0();
                M0.writeString(str);
                M0.writeString(str2);
                int i9 = com.google.android.gms.internal.cast.u.a;
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
                q5.x xVar2 = (q5.x) obj;
                TaskCompletionSource taskCompletionSource2 = (TaskCompletionSource) obj2;
                HashMap hashMap = f0Var2.B;
                long incrementAndGet = f0Var2.q.incrementAndGet();
                x5.l.j("Not connected to device", f0Var2.F == 2);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), taskCompletionSource2);
                    q5.f fVar2 = (q5.f) xVar2.u();
                    Parcel M02 = fVar2.M0();
                    M02.writeString(str3);
                    M02.writeString(str4);
                    M02.writeLong(incrementAndGet);
                    fVar2.R0(M02, 9);
                    return;
                } catch (RemoteException e10) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    taskCompletionSource2.setException(e10);
                    return;
                }
        }
    }
}
