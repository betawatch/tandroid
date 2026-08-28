package androidx.mediarouter.app;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s implements IBinder.DeathRecipient {
    public final android.support.v4.media.session.e a = new android.support.v4.media.session.e(this);
    public android.support.v4.media.session.f b;
    public android.support.v4.media.session.g c;
    public final /* synthetic */ int d;
    public final /* synthetic */ g.s e;

    public s(g.s sVar, int i9) {
        this.d = i9;
        this.e = sVar;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        switch (this.d) {
            case 0:
                v vVar = (v) this.e;
                vVar.h0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                vVar.r();
                vVar.q(false);
                break;
            default:
                p0 p0Var = (p0) this.e;
                p0Var.X = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                p0Var.f();
                p0Var.k();
                break;
        }
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.d) {
            case 0:
                v vVar = (v) this.e;
                vVar.g0 = playbackStateCompat;
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
                android.support.v4.media.session.p pVar = vVar.e0;
                if (pVar != null) {
                    pVar.e(vVar.f0);
                    vVar.e0 = null;
                    break;
                }
                break;
            default:
                p0 p0Var = (p0) this.e;
                android.support.v4.media.session.p pVar2 = p0Var.V;
                if (pVar2 != null) {
                    pVar2.e(p0Var.W);
                    p0Var.V = null;
                    break;
                }
                break;
        }
    }

    public final void e(int i9, Object obj, Bundle bundle) {
        android.support.v4.media.session.f fVar = this.b;
        if (fVar != null) {
            Message obtainMessage = fVar.obtainMessage(i9, obj);
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
