package androidx.mediarouter.app;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class q implements IBinder.DeathRecipient {
    public final android.support.v4.media.session.e a = new android.support.v4.media.session.e(this);
    public android.support.v4.media.session.f b;
    public android.support.v4.media.session.g c;
    public final /* synthetic */ int d;
    public final /* synthetic */ g.t e;

    public q(g.t tVar, int i10) {
        this.d = i10;
        this.e = tVar;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        switch (this.d) {
            case 0:
                t tVar = (t) this.e;
                tVar.l0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                tVar.r();
                tVar.q(false);
                break;
            default:
                n0 n0Var = (n0) this.e;
                n0Var.b0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                n0Var.f();
                n0Var.k();
                break;
        }
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                t tVar = (t) this.e;
                tVar.k0 = playbackStateCompat;
                tVar.q(false);
                break;
        }
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        e(8, null, null);
    }

    public final void d() {
        switch (this.d) {
            case 0:
                t tVar = (t) this.e;
                qf.b bVar = tVar.i0;
                if (bVar != null) {
                    bVar.f0(tVar.j0);
                    tVar.i0 = null;
                    break;
                }
                break;
            default:
                n0 n0Var = (n0) this.e;
                qf.b bVar2 = n0Var.Z;
                if (bVar2 != null) {
                    bVar2.f0(n0Var.a0);
                    n0Var.Z = null;
                    break;
                }
                break;
        }
    }

    public final void e(int i10, Object obj, Bundle bundle) {
        android.support.v4.media.session.f fVar = this.b;
        if (fVar != null) {
            Message obtainMessage = fVar.obtainMessage(i10, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }

    public final void f(Handler handler) {
        if (handler != null) {
            android.support.v4.media.session.f fVar = new android.support.v4.media.session.f(this, handler.getLooper());
            this.b = fVar;
            fVar.b = true;
        } else {
            android.support.v4.media.session.f fVar2 = this.b;
            if (fVar2 != null) {
                fVar2.b = false;
                fVar2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
    }
}
