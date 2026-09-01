package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class q implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v b;

    public /* synthetic */ q(v vVar, int i10) {
        this.a = i10;
        this.b = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        int i11 = this.a;
        int i12 = 0;
        v vVar = this.b;
        switch (i11) {
            case 0:
                Context context = vVar.s;
                AccessibilityManager accessibilityManager = vVar.A0;
                int id2 = view.getId();
                if (id2 != 16908313 && id2 != 16908314) {
                    if (id2 != R.id.mr_control_playback_ctrl) {
                        if (id2 == R.id.mr_close) {
                            vVar.dismiss();
                            break;
                        }
                    } else {
                        bf.b bVar = vVar.f0;
                        if (bVar != null && (playbackStateCompat = vVar.h0) != null) {
                            i10 = playbackStateCompat.a != 3 ? 0 : 1;
                            if (i10 != 0 && (playbackStateCompat.e & 514) != 0) {
                                bVar.R().a.pause();
                                i12 = R.string.mr_controller_pause;
                            } else if (i10 != 0 && (playbackStateCompat.e & 1) != 0) {
                                bVar.R().a.stop();
                                i12 = R.string.mr_controller_stop;
                            } else if (i10 == 0 && (playbackStateCompat.e & 516) != 0) {
                                bVar.R().a.play();
                                i12 = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i12 != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(q.class.getName());
                                obtain.getText().add(context.getString(i12));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (vVar.r.g()) {
                        c2.c0 c0Var = vVar.h;
                        i10 = id2 == 16908313 ? 2 : 1;
                        c0Var.getClass();
                        c2.c0.j(i10);
                    }
                    vVar.dismiss();
                    break;
                }
                break;
            case 1:
                vVar.dismiss();
                break;
            case 2:
                bf.b bVar2 = vVar.f0;
                if (bVar2 != null && (sessionActivity = ((android.support.v4.media.session.h) bVar2.b).a.getSessionActivity()) != null) {
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
                boolean z4 = vVar.r0;
                vVar.r0 = !z4;
                if (!z4) {
                    vVar.R.setVisibility(0);
                }
                vVar.x0 = vVar.r0 ? vVar.y0 : vVar.z0;
                vVar.t(true);
                break;
        }
    }
}
