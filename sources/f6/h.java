package f6;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.s;
import android.view.KeyEvent;
import c6.p;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import n6.l;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class h extends s {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.support.v4.media.session.s
    public final void onCustomAction(String str, Bundle bundle) {
        i.v.b("onCustomAction with action = %s", str);
        int hashCode = str.hashCode();
        i iVar = this.a;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    long j3 = -iVar.e.c;
                    e6.h hVar = iVar.n;
                    if (hVar == null) {
                        return;
                    }
                    long min = Math.min(hVar.g(), Math.max(0L, hVar.a() + j3));
                    e6.h hVar2 = iVar.n;
                    if (hVar2 == null) {
                        return;
                    }
                    hVar2.q(new p(min));
                    return;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    d6.g gVar = iVar.d;
                    if (gVar != null) {
                        gVar.b(true);
                        return;
                    }
                    return;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    d6.g gVar2 = iVar.d;
                    if (gVar2 != null) {
                        gVar2.b(false);
                        return;
                    }
                    return;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    long j10 = iVar.e.c;
                    e6.h hVar3 = iVar.n;
                    if (hVar3 == null) {
                        return;
                    }
                    long min2 = Math.min(hVar3.g(), Math.max(0L, hVar3.a() + j10));
                    e6.h hVar4 = iVar.n;
                    if (hVar4 == null) {
                        return;
                    }
                    hVar4.q(new p(min2));
                    return;
                }
                break;
        }
        Intent intent = new Intent(str);
        intent.setComponent(iVar.g);
        iVar.a.sendBroadcast(intent);
    }

    @Override // android.support.v4.media.session.s
    public final boolean onMediaButtonEvent(Intent intent) {
        e6.h hVar;
        i.v.b("onMediaButtonEvent", new Object[0]);
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
        i.v.b("onPause", new Object[0]);
        e6.h hVar = this.a.n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onPlay() {
        i.v.b("onPlay", new Object[0]);
        e6.h hVar = this.a.n;
        if (hVar != null) {
            hVar.r();
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onSeekTo(long j3) {
        i.v.b("onSeekTo %d", Long.valueOf(j3));
        e6.h hVar = this.a.n;
        if (hVar == null) {
            return;
        }
        hVar.q(new p(j3));
    }

    @Override // android.support.v4.media.session.s
    public final void onSkipToNext() {
        i.v.b("onSkipToNext", new Object[0]);
        e6.h hVar = this.a.n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (hVar.w()) {
                e6.h.x(new e6.j(hVar, 2));
            } else {
                e6.h.t();
            }
        }
    }

    @Override // android.support.v4.media.session.s
    public final void onSkipToPrevious() {
        i.v.b("onSkipToPrevious", new Object[0]);
        e6.h hVar = this.a.n;
        if (hVar != null) {
            l.e("Must be called from the main thread.");
            if (hVar.w()) {
                e6.h.x(new e6.j(hVar, 1));
            } else {
                e6.h.t();
            }
        }
    }
}
