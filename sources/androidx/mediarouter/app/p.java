package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class p implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u b;

    public /* synthetic */ p(u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        int i11 = this.a;
        int i12 = 0;
        u uVar = this.b;
        switch (i11) {
            case 0:
                Context context = uVar.s;
                AccessibilityManager accessibilityManager = uVar.D0;
                int id2 = view.getId();
                if (id2 != 16908313 && id2 != 16908314) {
                    if (id2 != R.id.mr_control_playback_ctrl) {
                        if (id2 == R.id.mr_close) {
                            uVar.dismiss();
                            break;
                        }
                    } else {
                        of.b bVar = uVar.i0;
                        if (bVar != null && (playbackStateCompat = uVar.k0) != null) {
                            i10 = playbackStateCompat.a != 3 ? 0 : 1;
                            if (i10 != 0 && (playbackStateCompat.e & 514) != 0) {
                                bVar.g0().a.pause();
                                i12 = R.string.mr_controller_pause;
                            } else if (i10 != 0 && (playbackStateCompat.e & 1) != 0) {
                                bVar.g0().a.stop();
                                i12 = R.string.mr_controller_stop;
                            } else if (i10 == 0 && (playbackStateCompat.e & 516) != 0) {
                                bVar.g0().a.play();
                                i12 = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i12 != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(p.class.getName());
                                obtain.getText().add(context.getString(i12));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (uVar.r.g()) {
                        p4.x xVar = uVar.h;
                        i10 = id2 == 16908313 ? 2 : 1;
                        xVar.getClass();
                        p4.x.j(i10);
                    }
                    uVar.dismiss();
                    break;
                }
                break;
            case 1:
                uVar.dismiss();
                break;
            case 2:
                of.b bVar2 = uVar.i0;
                if (bVar2 != null && (sessionActivity = ((android.support.v4.media.session.h) bVar2.b).a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        uVar.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                break;
            default:
                boolean z10 = uVar.u0;
                uVar.u0 = !z10;
                if (!z10) {
                    uVar.U.setVisibility(0);
                }
                uVar.A0 = uVar.u0 ? uVar.B0 : uVar.C0;
                uVar.t(true);
                break;
        }
    }
}
