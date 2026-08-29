package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ n(s sVar, int i10) {
        this.a = i10;
        this.b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        int i11 = this.a;
        int i12 = 0;
        s sVar = this.b;
        switch (i11) {
            case 0:
                Context context = sVar.s;
                AccessibilityManager accessibilityManager = sVar.z0;
                int id2 = view.getId();
                if (id2 != 16908313 && id2 != 16908314) {
                    if (id2 != R.id.mr_control_playback_ctrl) {
                        if (id2 == R.id.mr_close) {
                            sVar.dismiss();
                            break;
                        }
                    } else {
                        android.support.v4.media.session.p pVar = sVar.e0;
                        if (pVar != null && (playbackStateCompat = sVar.g0) != null) {
                            i10 = playbackStateCompat.a != 3 ? 0 : 1;
                            if (i10 != 0 && (playbackStateCompat.e & 514) != 0) {
                                pVar.c().a.pause();
                                i12 = R.string.mr_controller_pause;
                            } else if (i10 != 0 && (playbackStateCompat.e & 1) != 0) {
                                pVar.c().a.stop();
                                i12 = R.string.mr_controller_stop;
                            } else if (i10 == 0 && (playbackStateCompat.e & 516) != 0) {
                                pVar.c().a.play();
                                i12 = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i12 != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(n.class.getName());
                                obtain.getText().add(context.getString(i12));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (sVar.r.g()) {
                        c2.d0 d0Var = sVar.h;
                        i10 = id2 == 16908313 ? 2 : 1;
                        d0Var.getClass();
                        c2.d0.j(i10);
                    }
                    sVar.dismiss();
                    break;
                }
                break;
            case 1:
                sVar.dismiss();
                break;
            case 2:
                android.support.v4.media.session.p pVar2 = sVar.e0;
                if (pVar2 != null && (sessionActivity = pVar2.a.a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        sVar.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                break;
            default:
                boolean z10 = sVar.q0;
                sVar.q0 = !z10;
                if (!z10) {
                    sVar.Q.setVisibility(0);
                }
                sVar.w0 = sVar.q0 ? sVar.x0 : sVar.y0;
                sVar.t(true);
                break;
        }
    }
}
