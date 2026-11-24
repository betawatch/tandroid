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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class e1b implements Runnable {
    public final /* synthetic */ byte a;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nm7.f(z8c.t0).m(nm7.u3, new Object[0]);
                return;
            case 1:
                oc7.d1().edit().putInt("storydualhint", oc7.d1().getInt("storydualhint", 0) + 1).apply();
                return;
            case 2:
                meb.y = null;
                return;
            case 3:
                SharedPreferences.Editor edit = oc7.d1().edit();
                jlb.f = Boolean.TRUE;
                edit.putBoolean("nothanos", true).apply();
                return;
            case 4:
                SharedPreferences.Editor edit2 = oc7.d1().edit();
                jlb.f = Boolean.TRUE;
                edit2.putBoolean("nothanos", true).apply();
                return;
            case 5:
                cmb.N = false;
                cmb.E(false);
                return;
            case 6:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    return;
                }
                return;
            case 7:
                yic.b();
                return;
            case 8:
                zic.b();
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
                PhotoViewer.r0().A(false, false);
                return;
            case 17:
                return;
            case 18:
                break;
            case 19:
                wxc.i();
                return;
            default:
                if (z.a()) {
                    wxc.f.clear();
                    Iterator it = wxc.a.values().iterator();
                    while (it.hasNext()) {
                        cyc cycVar = ((txc) it.next()).v;
                        if (cycVar != null && cycVar.e != null) {
                            cycVar.n();
                        }
                    }
                    return;
                }
                return;
        }
        while (true) {
            try {
                synchronized (qfd.a) {
                    while (qfd.b == 0) {
                        qfd.a.wait();
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

    public /* synthetic */ e1b(byte b) {
        this.a = b;
    }

    private final void a() {
    }
}
