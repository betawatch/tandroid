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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class o implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ o(t tVar, int i3) {
        this.a = i3;
        this.b = tVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3;
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
                        p4.q qVar = tVar.j0;
                        if (qVar != null && (playbackStateCompat = tVar.l0) != null) {
                            i3 = playbackStateCompat.a != 3 ? 0 : 1;
                            if (i3 != 0 && (playbackStateCompat.e & 514) != 0) {
                                qVar.x().a.pause();
                                i11 = R.string.mr_controller_pause;
                            } else if (i3 != 0 && (playbackStateCompat.e & 1) != 0) {
                                qVar.x().a.stop();
                                i11 = R.string.mr_controller_stop;
                            } else if (i3 == 0 && (playbackStateCompat.e & 516) != 0) {
                                qVar.x().a.play();
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
                        r4.y yVar = tVar.h;
                        i3 = id2 == 16908313 ? 2 : 1;
                        yVar.getClass();
                        r4.y.j(i3);
                    }
                    tVar.dismiss();
                    break;
                }
                break;
            case 1:
                tVar.dismiss();
                break;
            case 2:
                p4.q qVar2 = tVar.j0;
                if (qVar2 != null && (sessionActivity = ((android.support.v4.media.session.h) qVar2.a).a.getSessionActivity()) != null) {
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
