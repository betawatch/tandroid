package androidx.mediarouter.app;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class s implements IBinder.DeathRecipient {
    public final android.support.v4.media.session.e a = new android.support.v4.media.session.e(this);
    public android.support.v4.media.session.f b;
    public android.support.v4.media.session.g c;
    public final /* synthetic */ int d;
    public final /* synthetic */ g.s e;

    public s(g.s sVar, int i10) {
        this.d = i10;
        this.e = sVar;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        switch (this.d) {
            case 0:
                v vVar = (v) this.e;
                vVar.i0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                vVar.r();
                vVar.q(false);
                break;
            default:
                p0 p0Var = (p0) this.e;
                p0Var.Y = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                p0Var.f();
                p0Var.k();
                break;
        }
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                v vVar = (v) this.e;
                vVar.h0 = playbackStateCompat;
                vVar.q(false);
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
                v vVar = (v) this.e;
                bf.b bVar = vVar.f0;
                if (bVar != null) {
                    bVar.e0(vVar.g0);
                    vVar.f0 = null;
                    break;
                }
                break;
            default:
                p0 p0Var = (p0) this.e;
                bf.b bVar2 = p0Var.W;
                if (bVar2 != null) {
                    bVar2.e0(p0Var.X);
                    p0Var.W = null;
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
