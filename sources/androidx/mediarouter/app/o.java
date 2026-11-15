package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ o(t tVar, int i7) {
        this.a = i7;
        this.b = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7;
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        int i10 = this.a;
        int i11 = 0;
        t tVar = this.b;
        switch (i10) {
            case 0:
                Context context = tVar.s;
                AccessibilityManager accessibilityManager = tVar.E0;
                int id2 = view.getId();
                if (id2 != 16908313 && id2 != 16908314) {
                    if (id2 != R.id.mr_control_playback_ctrl) {
                        if (id2 == R.id.mr_close) {
                            tVar.dismiss();
                            break;
                        }
                    } else {
                        wf.b bVar = tVar.j0;
                        if (bVar != null && (playbackStateCompat = tVar.l0) != null) {
                            i7 = playbackStateCompat.a != 3 ? 0 : 1;
                            if (i7 != 0 && (playbackStateCompat.e & 514) != 0) {
                                bVar.J().a.pause();
                                i11 = R.string.mr_controller_pause;
                            } else if (i7 != 0 && (playbackStateCompat.e & 1) != 0) {
                                bVar.J().a.stop();
                                i11 = R.string.mr_controller_stop;
                            } else if (i7 == 0 && (playbackStateCompat.e & 516) != 0) {
                                bVar.J().a.play();
                                i11 = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i11 != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(TLObject.FLAG_14);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(o.class.getName());
                                obtain.getText().add(context.getString(i11));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (tVar.r.g()) {
                        s4.x xVar = tVar.h;
                        i7 = id2 == 16908313 ? 2 : 1;
                        xVar.getClass();
                        s4.x.j(i7);
                    }
                    tVar.dismiss();
                    break;
                }
                break;
            case 1:
                tVar.dismiss();
                break;
            case 2:
                wf.b bVar2 = tVar.j0;
                if (bVar2 != null && (sessionActivity = ((android.support.v4.media.session.h) bVar2.b).a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        tVar.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                break;
            default:
                boolean z10 = tVar.v0;
                tVar.v0 = !z10;
                if (!z10) {
                    tVar.V.setVisibility(0);
                }
                tVar.B0 = tVar.v0 ? tVar.C0 : tVar.D0;
                tVar.t(true);
                break;
        }
    }
}
