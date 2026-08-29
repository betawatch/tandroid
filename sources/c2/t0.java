package c2;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t0 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final w0 b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ a1 i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public t0(a1 a1Var, Messenger messenger) {
        this.i = a1Var;
        this.a = messenger;
        w0 w0Var = new w0(this);
        this.b = w0Var;
        this.c = new Messenger(w0Var);
    }

    public final void a(int i10) {
        int i11 = this.d;
        this.d = i11 + 1;
        b(5, i11, i10, null, null);
    }

    public final boolean b(int i10, int i11, int i12, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i10;
        obtain.arg1 = i11;
        obtain.arg2 = i12;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e10) {
            if (i10 == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e10);
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.s.post(new s0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle h = a4.w.h(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(7, i12, i10, null, h);
    }

    public final void d(int i10, int i11) {
        Bundle h = a4.w.h(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(8, i12, i10, null, h);
    }
}
