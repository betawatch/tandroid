package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        switch (this.a) {
            case 0:
                u uVar = this.b;
                Context context = uVar.s;
                AccessibilityManager accessibilityManager = uVar.z0;
                int id2 = view.getId();
                if (id2 != 16908313 && id2 != 16908314) {
                    if (id2 != R.id.mr_control_playback_ctrl) {
                        if (id2 == R.id.mr_close) {
                            uVar.dismiss();
                            break;
                        }
                    } else {
                        android.support.v4.media.session.p pVar = uVar.e0;
                        if (pVar != null && (playbackStateCompat = uVar.g0) != null) {
                            int i11 = 0;
                            i10 = playbackStateCompat.a != 3 ? 0 : 1;
                            if (i10 != 0 && (playbackStateCompat.e & 514) != 0) {
                                pVar.c().a.pause();
                                i11 = R.string.mr_controller_pause;
                            } else if (i10 != 0 && (playbackStateCompat.e & 1) != 0) {
                                pVar.c().a.stop();
                                i11 = R.string.mr_controller_stop;
                            } else if (i10 == 0 && (playbackStateCompat.e & 516) != 0) {
                                pVar.c().a.play();
                                i11 = R.string.mr_controller_play;
                            }
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i11 != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(context.getPackageName());
                                obtain.setClassName(p.class.getName());
                                obtain.getText().add(context.getString(i11));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                break;
                            }
                        }
                    }
                } else {
                    if (uVar.r.g()) {
                        c2.b0 b0Var = uVar.h;
                        i10 = id2 == 16908313 ? 2 : 1;
                        b0Var.getClass();
                        c2.b0.j(i10);
                    }
                    uVar.dismiss();
                    break;
                }
                break;
            case 1:
                u uVar2 = this.b;
                boolean z10 = uVar2.q0;
                uVar2.q0 = !z10;
                if (!z10) {
                    uVar2.Q.setVisibility(0);
                }
                uVar2.w0 = uVar2.q0 ? uVar2.x0 : uVar2.y0;
                uVar2.t(true);
                break;
            case 2:
                this.b.dismiss();
                break;
            default:
                u uVar3 = this.b;
                android.support.v4.media.session.p pVar2 = uVar3.e0;
                if (pVar2 != null && (sessionActivity = pVar2.a.a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        uVar3.dismiss();
                        break;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                    }
                }
                break;
        }
    }
}
