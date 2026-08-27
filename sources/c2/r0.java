package c2;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class r0 implements IBinder.DeathRecipient {
    public final Messenger a;
    public final u0 b;
    public final Messenger c;
    public int f;
    public int g;
    public final /* synthetic */ y0 i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public r0(y0 y0Var, Messenger messenger) {
        this.i = y0Var;
        this.a = messenger;
        u0 u0Var = new u0(this);
        this.b = u0Var;
        this.c = new Messenger(u0Var);
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
        } catch (RemoteException e9) {
            if (i10 == 2) {
                return false;
            }
            Log.e("MediaRouteProviderProxy", "Could not send message to service.", e9);
            return false;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.i.s.post(new q0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle g10 = a9.p.g(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(7, i12, i10, null, g10);
    }

    public final void d(int i10, int i11) {
        Bundle g10 = a9.p.g(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(8, i12, i10, null, g10);
    }
}
