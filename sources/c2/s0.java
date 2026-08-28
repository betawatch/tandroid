package c2;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s0 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final v0 b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ z0 i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public s0(z0 z0Var, Messenger messenger) {
        this.i = z0Var;
        this.a = messenger;
        v0 v0Var = new v0(this);
        this.b = v0Var;
        this.c = new Messenger(v0Var);
    }

    public final void a(int i9) {
        int i10 = this.d;
        this.d = i10 + 1;
        b(5, i10, i9, null, null);
    }

    public final boolean b(int i9, int i10, int i11, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i9;
        obtain.arg1 = i10;
        obtain.arg2 = i11;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e10) {
            if (i9 == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e10);
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.s.post(new r0(this, 1));
    }

    public final void c(int i9, int i10) {
        Bundle h = aa.d.h(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(7, i11, i9, null, h);
    }

    public final void d(int i9, int i10) {
        Bundle h = aa.d.h(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(8, i11, i9, null, h);
    }
}
