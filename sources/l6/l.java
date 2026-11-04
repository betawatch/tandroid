package l6;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l {
    public final int a;
    public final TaskCompletionSource b = new TaskCompletionSource();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public l(int i3, int i10, Bundle bundle, int i11) {
        this.e = i11;
        this.a = i3;
        this.c = i10;
        this.d = bundle;
    }

    public final boolean a() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void b(Bundle bundle) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String lVar = toString();
            String valueOf = String.valueOf(bundle);
            StringBuilder sb2 = new StringBuilder(lVar.length() + 16 + valueOf.length());
            sb2.append("Finishing ");
            sb2.append(lVar);
            sb2.append(" with ");
            sb2.append(valueOf);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.b.setResult(bundle);
    }

    public final void c(m mVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String lVar = toString();
            String obj = mVar.toString();
            StringBuilder sb2 = new StringBuilder(lVar.length() + 14 + obj.length());
            sb2.append("Failing ");
            sb2.append(lVar);
            sb2.append(" with ");
            sb2.append(obj);
            Log.d("MessengerIpcClient", sb2.toString());
        }
        this.b.setException(mVar);
    }

    public final String toString() {
        int i3 = this.c;
        int length = String.valueOf(i3).length();
        int i10 = this.a;
        int length2 = String.valueOf(i10).length();
        boolean a10 = a();
        StringBuilder sb2 = new StringBuilder(length + 19 + length2 + 8 + String.valueOf(a10).length() + 1);
        sb2.append("Request { what=");
        sb2.append(i3);
        sb2.append(" id=");
        sb2.append(i10);
        sb2.append(" oneWay=");
        sb2.append(a10);
        sb2.append("}");
        return sb2.toString();
    }
}
