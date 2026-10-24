package f6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import c6.p;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import e6.j;
import n6.l;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class g extends s {
    public final /* synthetic */ h a;

    public g(h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.support.v4.media.session.s
    public final void onCustomAction(String str, Bundle bundle) {
        h.v.b("onCustomAction with action = %s", str);
        int hashCode = str.hashCode();
        h hVar = this.a;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    long j10 = -hVar.e.c;
                    e6.h hVar2 = hVar.n;
                    if (hVar2 == null) {
                        return;
                    }
                    long min = Math.min(hVar2.g(), Math.max(0L, hVar2.a() + j10));
                    e6.h hVar3 = hVar.n;
                    if (hVar3 == null) {
                        return;
                    }
                    hVar3.q(new p(min));
                    return;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    d6.g gVar = hVar.d;
                    if (gVar != null) {
                        gVar.b(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    d6.g gVar2 = hVar.d;
                    if (gVar2 != null) {
                        gVar2.b(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    long j11 = hVar.e.c;
                    e6.h hVar4 = hVar.n;
                    if (hVar4 == null) {
                        return;
                    }
                    long min2 = Math.min(hVar4.g(), Math.max(0L, hVar4.a() + j11));
                    e6.h hVar5 = hVar.n;
                    if (hVar5 == null) {
                        return;
                    }
                    hVar5.q(new p(min2));
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(hVar.g);
        hVar.a.sendBroadcast(intent);
    }

    @Override // android.support.v4.media.session.s
    public final boolean onMediaButtonEvent(Intent intent) {
        e6.h hVar;
        h.v.b("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent == null) {
            return true;
        }
        if ((keyEvent.getKeyCode() != 127 && keyEvent.getKeyCode() != 126) || (hVar = this.a.n) == null) {
            return true;
        }
        hVar.r();
        return true;
    }

    @Override // android.support.v4.media.session.s
    public final void onPause() {
        h.v.b("onPause", new Object[0]);
        e6.h hVar = this.a.n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onPlay() {
        h.v.b("onPlay", new Object[0]);
        e6.h hVar = this.a.n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onSeekTo(long j10) {
        h.v.b("onSeekTo %d", Long.valueOf(j10));
        e6.h hVar = this.a.n;
        if (hVar == null) {
            return;
        }
        hVar.q(new p(j10));
    }

    @Override // android.support.v4.media.session.s
    public final void onSkipToNext() {
        h.v.b("onSkipToNext", new Object[0]);
        e6.h hVar = this.a.n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (hVar.w()) {
                e6.h.x(new j(hVar, 2));
            } else {
                e6.h.t();
            }
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onSkipToPrevious() {
        h.v.b("onSkipToPrevious", new Object[0]);
        e6.h hVar = this.a.n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (hVar.w()) {
                e6.h.x(new j(hVar, 1));
            } else {
                e6.h.t();
            }
        }
    }
}
