// default package

import android.content.SharedPreferences;
import android.os.Debug;
import android.util.Log;
import java.util.Iterator;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.PhotoViewer;
import org.telegram.utils.twidget.WidgetEngineService;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cza implements Runnable {
    public final /* synthetic */ byte a;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kk7.f(y6c.t0).m(kk7.t3, new Object[0]);
                return;
            case 1:
                na7.c1().edit().putInt("storydualhint", na7.c1().getInt("storydualhint", 0) + 1).apply();
                return;
            case 2:
                kcb.y = null;
                return;
            case 3:
                SharedPreferences.Editor edit = na7.c1().edit();
                ijb.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 4:
                SharedPreferences.Editor edit2 = na7.c1().edit();
                ijb.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 5:
                bkb.N = false;
                bkb.E(false);
                return;
            case 6:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    return;
                }
                return;
            case 7:
                xgc.b();
                return;
            case 8:
                ygc.b();
                return;
            case 9:
                VoIPPreNotificationService.lambda$dismiss$5();
                return;
            case 10:
                VoIPService.lambda$configureDeviceForCall$106();
                return;
            case 11:
                VoIPService.lambda$startConferenceGroupCall$38();
                return;
            case 12:
                VoIPService.lambda$startOutgoingCall$6();
                return;
            case 13:
                VoIPService.lambda$startGroupCall$27();
                return;
            case 14:
                VoIPService.lambda$onDestroy$93();
                return;
            case 15:
                VoIPService.lambda$acceptIncomingCall$96();
                return;
            case 16:
                PhotoViewer.r0().B(false, false);
                return;
            case 17:
                return;
            case 18:
                break;
            case 19:
                vvc.i();
                return;
            default:
                if (z.a()) {
                    vvc.f.clear();
                    Iterator it = vvc.a.values().iterator();
                    while (it.hasNext()) {
                        bwc bwcVar = ((svc) it.next()).t;
                        if (bwcVar != null && bwcVar.e != null) {
                            bwcVar.m();
                        }
                    }
                    return;
                }
                return;
        }
        while (true) {
            try {
                synchronized (odd.a) {
                    while (odd.b == 0) {
                        odd.a.wait();
                    }
                }
                long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
                if (nativeHeapAllocatedSize > 419430400) {
                    Log.e("WidgetEngine", "native heap " + (nativeHeapAllocatedSize >> 20) + " MB, over 400 MB: the engine stops");
                    WidgetEngineService.exitNow(1);
                }
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public /* synthetic */ cza(byte b) {
        this.a = b;
    }

    private final void a() {
    }
}
