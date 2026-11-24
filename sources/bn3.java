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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.Dictation.DictationLid;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bn3 implements Runnable {
    public final /* synthetic */ byte a;

    public /* synthetic */ bn3(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ce  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b = 0;
        switch (this.a) {
            case 0:
                gn3[] gn3VarArr = DictationAsr.a;
                ArrayList arrayList = new ArrayList(DictationAsr.g);
                int size = arrayList.size();
                while (b < size) {
                    ((Runnable) arrayList.get(b)).run();
                    b++;
                }
                return;
            case 1:
                DictationAsr.a0(true);
                return;
            case 2:
                DictationLid.b();
                return;
            case 3:
                return;
            case 4:
                nm7.e().k(nm7.m4, new Object[0]);
                return;
            case 5:
                gda.z1 = !gda.z1;
                a.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", gda.z1);
                gm.c0(LaunchActivity.H1.y0.getRootView(), new bn0((byte) 12));
                return;
            case 6:
                String str = "Dark Blue";
                SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (cmb.O0(string) == null || cmb.O0(string).o()) {
                    string = "Blue";
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (cmb.O0(string2) == null || !cmb.O0(string2).o()) {
                    string2 = "Dark Blue";
                }
                bmb bmbVar = cmb.I;
                if (!string.equals(string2)) {
                    str = string2;
                } else if (bmbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                    str = string2;
                    gm.d3(new fl4(cmb.I.o() ? cmb.O0(str) : cmb.O0(str2), b), 200L);
                    return;
                }
                str2 = string;
                gm.d3(new fl4(cmb.I.o() ? cmb.O0(str) : cmb.O0(str2), b), 200L);
                return;
            case 7:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    bh0 bh0Var = new bh0();
                    bh0Var.a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), bh0Var);
                    return;
                }
                return;
            case 8:
                d S = LaunchActivity.S();
                if (S != null) {
                    u31 I = c41.b0(S).I(R.raw.contact_check, jb6.M0(2131742874, null), jb6.M0(2131742872, null));
                    I.j = 5000;
                    I.j();
                    return;
                }
                return;
            case 9:
                CopyOnWriteArrayList copyOnWriteArrayList = g35.j;
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
            case 10:
                g95 g95Var = g95.s5;
                if (g95Var != null) {
                    g95Var.show();
                    return;
                }
                return;
            case 11:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    return;
                }
                return;
            case 12:
                nm7.e().k(nm7.F2, new Object[0]);
                return;
            case 13:
                if (VoIPService.getSharedInstance() == null || !VoIPService.getSharedInstance().isMicMute()) {
                    return;
                }
                VoIPService.getSharedInstance().setMicMute(false, true, false);
                return;
            case 14:
                za5.f();
                return;
            case 15:
                return;
            case 16:
                KeepAliveJob.a();
                return;
            case 17:
                if (KeepAliveJob.b || KeepAliveJob.a != null) {
                    return;
                }
                try {
                    if (e21.a) {
                        fc4.b("starting keep-alive job");
                    }
                    synchronized (KeepAliveJob.c) {
                        KeepAliveJob.b = true;
                    }
                    JobIntentService.enqueueWork(a.b, KeepAliveJob.class, 1000, new Intent());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 18:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 19:
                String str3 = LaunchActivity.C1;
                a.F = false;
                a.H = System.currentTimeMillis();
                return;
            case 20:
                return;
            case 21:
                int i = -1;
                try {
                    BatteryManager batteryManager = (BatteryManager) a.b.getSystemService("batterymanager");
                    if (batteryManager != null) {
                        i = batteryManager.getIntProperty(4);
                    }
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
                e86.l = SystemClock.elapsedRealtime();
                e86.m = false;
                if (i < 0 || i > 100) {
                    return;
                }
                e86.l = SystemClock.elapsedRealtime();
                if (e86.k != i) {
                    e86.k = i;
                    gm.c3(new bn3((byte) 22));
                    return;
                }
                return;
            case 22:
                e86.d(false);
                return;
            case 23:
                nm7.e().k(nm7.B4, new Object[0]);
                return;
            case 24:
                nm7.e().k(nm7.I4, new Object[0]);
                return;
            case 25:
                int i2 = LocationSharingService.d;
                for (int i3 = 0; i3 < 4; i3++) {
                    dd6.f(i3).t();
                }
                return;
            case 26:
                return;
            case 27:
                CallReceiver.a();
                return;
            case 28:
                CallReceiver.a();
                return;
            default:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ bn3(View view, m66 m66Var, ClickableSpan clickableSpan, byte b) {
        this.a = b;
    }

    public /* synthetic */ bn3(Object obj, byte b) {
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
