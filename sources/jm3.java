// default package

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.BatteryManager;
import android.os.Looper;
import android.os.SystemClock;
import android.text.style.ClickableSpan;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.KeepAliveJob;
import org.telegram.messenger.LocationSharingService;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.JobIntentService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class jm3 implements Runnable {
    public final /* synthetic */ byte a;

    public /* synthetic */ jm3(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b = 0;
        switch (this.a) {
            case 0:
                nm3[] nm3VarArr = DictationAsr.a;
                ArrayList arrayList = new ArrayList(DictationAsr.g);
                int size = arrayList.size();
                while (b < size) {
                    ((Runnable) arrayList.get(b)).run();
                    b++;
                }
                return;
            case 1:
                DictationAsr.c0(true);
                return;
            case 2:
                DictationLid.c();
                return;
            case 3:
                return;
            case 4:
                EglBase10Impl.EglConnection.lambda$new$1();
                return;
            case 5:
                EglBase14Impl.EglConnection.lambda$new$1();
                return;
            case 6:
                jn7.e().k(jn7.l4, new Object[0]);
                return;
            case 7:
                xea.z1 = !xea.z1;
                a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", xea.z1);
                hl.c0(LaunchActivity.H1.y0.getRootView(), new bm0((byte) 12));
                return;
            case 8:
                String str = "Dark Blue";
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (aob.O0(string) == null || aob.O0(string).o()) {
                    string = "Blue";
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (aob.O0(string2) == null || !aob.O0(string2).o()) {
                    string2 = "Dark Blue";
                }
                znb znbVar = aob.I;
                if (!string.equals(string2)) {
                    str = string2;
                } else if (znbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                    str = string2;
                    hl.d3(new fl4(aob.I.o() ? aob.O0(str) : aob.O0(str2), b), 200L);
                    return;
                }
                str2 = string;
                hl.d3(new fl4(aob.I.o() ? aob.O0(str) : aob.O0(str2), b), 200L);
                return;
            case 9:
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    bg0 bg0Var = new bg0();
                    bg0Var.a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), bg0Var);
                    return;
                }
                return;
            case 10:
                e S = LaunchActivity.S();
                if (S != null) {
                    v21 I = d31.b0(S).I(R.raw.contact_check, ob6.M0(2131742842, null), ob6.M0(2131742840, null));
                    I.j = 5000;
                    I.j();
                    return;
                }
                return;
            case 11:
                CopyOnWriteArrayList copyOnWriteArrayList = k35.j;
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    Runnable runnable = (Runnable) weakReference.get();
                    if (runnable == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        runnable.run();
                    }
                }
                return;
            case 12:
                j95 j95Var = j95.s5;
                if (j95Var != null) {
                    j95Var.show();
                    return;
                }
                return;
            case 13:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 14:
                jn7.e().k(jn7.F2, new Object[0]);
                return;
            case 15:
                if (VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute()) {
                    return;
                }
                VoIPService.getSharedInstance().setMicMute(false, true, false);
                return;
            case 16:
                cb5.e();
                return;
            case 17:
                return;
            case 18:
                KeepAliveJob.a();
                return;
            case 19:
                if (KeepAliveJob.b || KeepAliveJob.a != null) {
                    return;
                }
                try {
                    if (f11.a) {
                        cc4.b("starting keep-alive job");
                    }
                    synchronized (KeepAliveJob.c) {
                        KeepAliveJob.b = true;
                    }
                    JobIntentService.enqueueWork(a.b, KeepAliveJob.class, 1000, new Intent());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 20:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 21:
                String str3 = LaunchActivity.C1;
                a.F = false;
                a.H = System.currentTimeMillis();
                return;
            case 22:
                return;
            case 23:
                int i = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) a.b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
                i86.l = SystemClock.elapsedRealtime();
                i86.m = false;
                if (i < 0 || i > 100) {
                    return;
                }
                i86.l = SystemClock.elapsedRealtime();
                if (i86.k != i) {
                    i86.k = i;
                    hl.c3(new jm3((byte) 24));
                    return;
                }
                return;
            case 24:
                i86.d(false);
                return;
            case 25:
                jn7.e().k(jn7.A4, new Object[0]);
                return;
            case 26:
                jn7.e().k(jn7.H4, new Object[0]);
                return;
            case 27:
                int i2 = LocationSharingService.d;
                for (int i3 = 0; i3 < 4; i3++) {
                    id6.f(i3).t();
                }
                return;
            case 28:
                return;
            default:
                CallReceiver.a();
                return;
        }
    }

    public /* synthetic */ jm3(View view, q66 q66Var, ClickableSpan clickableSpan, byte b) {
        this.a = b;
    }

    public /* synthetic */ jm3(Object obj, byte b) {
        this.a = b;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
