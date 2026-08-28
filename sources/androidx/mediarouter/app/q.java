package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class q implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ q(v vVar, int i9) {
        this.a = i9;
        this.b = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i9;
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        int i10 = this.a;
        int i11 = 0;
        v vVar = this.b;
        switch (i10) {
            case 0:
                Context context = vVar.s;
                AccessibilityManager accessibilityManager = vVar.z0;
                int id2 = view.getId();
                if (id2 != 16908313 && id2 != 16908314) {
                    if (id2 != R.id.mr_control_playback_ctrl) {
                        if (id2 == R.id.mr_close) {
                            vVar.dismiss();
                            break;
                        }
                    } else {
                        android.support.v4.media.session.p pVar = vVar.e0;
                        if (pVar != null && (playbackStateCompat = vVar.g0) != null) {
                            i9 = playbackStateCompat.a != 3 ? 0 : 1;
                            if (i9 != 0 && (playbackStateCompat.e & 514) != 0) {
                                pVar.c().a.pause();
                                i11 = R.string.mr_controller_pause;
                            } else if (i9 != 0 && (playbackStateCompat.e & 1) != 0) {
                                pVar.c().a.stop();
                                i11 = R.string.mr_controller_stop;
                            } else if (i9 == 0 && (playbackStateCompat.e & 516) != 0) {
                                pVar.c().a.play();
                                i11 = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i11 != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(q.class.getName());
                                obtain.getText().add(context.getString(i11));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (vVar.r.g()) {
                        c2.c0 c0Var = vVar.h;
                        i9 = id2 == 16908313 ? 2 : 1;
                        c0Var.getClass();
                        c2.c0.j(i9);
                    }
                    vVar.dismiss();
                    break;
                }
                break;
            case 1:
                vVar.dismiss();
                break;
            case 2:
                android.support.v4.media.session.p pVar2 = vVar.e0;
                if (pVar2 != null && (sessionActivity = pVar2.a.a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        vVar.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                break;
            default:
                boolean z10 = vVar.q0;
                vVar.q0 = !z10;
                if (!z10) {
                    vVar.Q.setVisibility(0);
                }
                vVar.w0 = vVar.q0 ? vVar.x0 : vVar.y0;
                vVar.t(true);
                break;
        }
    }
}
