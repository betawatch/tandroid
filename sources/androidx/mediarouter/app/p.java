package androidx.mediarouter.app;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class p implements IBinder.DeathRecipient {
    public final android.support.v4.media.session.e a = new android.support.v4.media.session.e(this);
    public android.support.v4.media.session.f b;
    public android.support.v4.media.session.g c;
    public final /* synthetic */ int d;
    public final /* synthetic */ g.s e;

    public p(g.s sVar, int i10) {
        this.d = i10;
        this.e = sVar;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        switch (this.d) {
            case 0:
                s sVar = (s) this.e;
                sVar.h0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                sVar.r();
                sVar.q(false);
                break;
            default:
                m0 m0Var = (m0) this.e;
                m0Var.X = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                m0Var.f();
                m0Var.k();
                break;
        }
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                s sVar = (s) this.e;
                sVar.g0 = playbackStateCompat;
                sVar.q(false);
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
                s sVar = (s) this.e;
                android.support.v4.media.session.p pVar = sVar.e0;
                if (pVar != null) {
                    pVar.e(sVar.f0);
                    sVar.e0 = null;
                    break;
                }
                break;
            default:
                m0 m0Var = (m0) this.e;
                android.support.v4.media.session.p pVar2 = m0Var.V;
                if (pVar2 != null) {
                    pVar2.e(m0Var.W);
                    m0Var.V = null;
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
            fVar.a = true;
        } else {
            android.support.v4.media.session.f fVar2 = this.b;
            if (fVar2 != null) {
                fVar2.a = false;
                fVar2.removeCallbacksAndMessages(null);
                this.b = null;
            }
        }
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
    }
}
