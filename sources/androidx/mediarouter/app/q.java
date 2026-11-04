package androidx.mediarouter.app;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class q implements IBinder.DeathRecipient {
    public final android.support.v4.media.session.e a = new android.support.v4.media.session.e(this);
    public android.support.v4.media.session.f b;
    public android.support.v4.media.session.g c;
    public final /* synthetic */ int d;
    public final /* synthetic */ g.u e;

    public q(g.u uVar, int i3) {
        this.d = i3;
        this.e = uVar;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        switch (this.d) {
            case 0:
                t tVar = (t) this.e;
                tVar.m0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                tVar.r();
                tVar.q(false);
                break;
            default:
                o0 o0Var = (o0) this.e;
                o0Var.c0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                o0Var.f();
                o0Var.k();
                break;
        }
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                t tVar = (t) this.e;
                tVar.l0 = playbackStateCompat;
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
                p4.q qVar = tVar.j0;
                if (qVar != null) {
                    qVar.H(tVar.k0);
                    tVar.j0 = null;
                    break;
                }
                break;
            default:
                o0 o0Var = (o0) this.e;
                p4.q qVar2 = o0Var.a0;
                if (qVar2 != null) {
                    qVar2.H(o0Var.b0);
                    o0Var.a0 = null;
                    break;
                }
                break;
        }
    }

    public final void e(int i3, Object obj, Bundle bundle) {
        android.support.v4.media.session.f fVar = this.b;
        if (fVar != null) {
            Message obtainMessage = fVar.obtainMessage(i3, obj);
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
