package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ o(t tVar, int i10) {
        this.a = i10;
        this.b = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        int i11 = this.a;
        int i12 = 0;
        t tVar = this.b;
        switch (i11) {
            case 0:
                Context context = tVar.s;
                AccessibilityManager accessibilityManager = tVar.D0;
                int id2 = view.getId();
                if (id2 != 16908313 && id2 != 16908314) {
                    if (id2 != R.id.mr_control_playback_ctrl) {
                        if (id2 == R.id.mr_close) {
                            tVar.dismiss();
                            break;
                        }
                    } else {
                        qf.b bVar = tVar.i0;
                        if (bVar != null && (playbackStateCompat = tVar.k0) != null) {
                            i10 = playbackStateCompat.a != 3 ? 0 : 1;
                            if (i10 != 0 && (playbackStateCompat.e & 514) != 0) {
                                bVar.Z().a.pause();
                                i12 = R.string.mr_controller_pause;
                            } else if (i10 != 0 && (playbackStateCompat.e & 1) != 0) {
                                bVar.Z().a.stop();
                                i12 = R.string.mr_controller_stop;
                            } else if (i10 == 0 && (playbackStateCompat.e & 516) != 0) {
                                bVar.Z().a.play();
                                i12 = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i12 != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(o.class.getName());
                                obtain.getText().add(context.getString(i12));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (tVar.r.g()) {
                        p4.x xVar = tVar.h;
                        i10 = id2 == 16908313 ? 2 : 1;
                        xVar.getClass();
                        p4.x.j(i10);
                    }
                    tVar.dismiss();
                    break;
                }
                break;
            case 1:
                tVar.dismiss();
                break;
            case 2:
                qf.b bVar2 = tVar.i0;
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
                boolean z10 = tVar.u0;
                tVar.u0 = !z10;
                if (!z10) {
                    tVar.U.setVisibility(0);
                }
                tVar.A0 = tVar.u0 ? tVar.B0 : tVar.C0;
                tVar.t(true);
                break;
        }
    }
}
