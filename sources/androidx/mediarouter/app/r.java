package androidx.mediarouter.app;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class r implements IBinder.DeathRecipient {
    public final android.support.v4.media.session.e a = new android.support.v4.media.session.e(this);
    public android.support.v4.media.session.f b;
    public android.support.v4.media.session.g c;
    public final /* synthetic */ int d;
    public final /* synthetic */ g.t e;

    public r(g.t tVar, int i10) {
        this.d = i10;
        this.e = tVar;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        switch (this.d) {
            case 0:
                u uVar = (u) this.e;
                uVar.l0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                uVar.r();
                uVar.q(false);
                break;
            default:
                o0 o0Var = (o0) this.e;
                o0Var.b0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                o0Var.f();
                o0Var.k();
                break;
        }
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                u uVar = (u) this.e;
                uVar.k0 = playbackStateCompat;
                uVar.q(false);
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
                u uVar = (u) this.e;
                n4.s sVar = uVar.i0;
                if (sVar != null) {
                    sVar.H(uVar.j0);
                    uVar.i0 = null;
                    break;
                }
                break;
            default:
                o0 o0Var = (o0) this.e;
                n4.s sVar2 = o0Var.Z;
                if (sVar2 != null) {
                    sVar2.H(o0Var.a0);
                    o0Var.Z = null;
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
