package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Debug;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class cd0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ cd0(int i7) {
        this.a = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.lc b02;
        int i7 = 1;
        int i10 = 0;
        switch (this.a) {
            case 0:
                CallReceiver.a();
                return;
            case 1:
                org.telegram.ui.Components.lc.Y().N(org.telegram.messenger.hd.N0(2131745665, null), org.telegram.messenger.hd.N0(2131751093, null)).j();
                return;
            case 2:
                org.telegram.ui.Components.lc.Y().N(org.telegram.messenger.hd.N0(2131745665, null), org.telegram.messenger.hd.N0(2131751093, null)).j();
                return;
            case 3:
                Drawable[] drawableArr = PhotoViewer.Z8;
                return;
            case 4:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T == null || (b02 = org.telegram.ui.Components.lc.b0(T)) == null) {
                    return;
                }
                org.telegram.ui.Components.gc I = b02.I(R.raw.msg_antispam, org.telegram.messenger.hd.N0(2131746026, null), org.telegram.messenger.hd.N0(2131745989, null));
                I.j = 5000;
                I.j();
                return;
            case 5:
                int i11 = u31.Z1;
                return;
            case 6:
                org.telegram.ui.ActionBar.m6.N = false;
                org.telegram.ui.ActionBar.m6.F(false);
                return;
            case 7:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.Wallet.u0[] u0VarArr = org.telegram.ui.Wallet.u0.R;
                return;
            case 9:
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 == null) {
                    return;
                }
                org.telegram.ui.Components.gc I2 = org.telegram.ui.Components.lc.b0(T2).I(R.raw.contact_check, org.telegram.messenger.hd.N0(2131742945, null), org.telegram.messenger.hd.N0(2131742943, null));
                I2.j = 5000;
                I2.j();
                return;
            case 10:
                CopyOnWriteArrayList copyOnWriteArrayList = org.telegram.ui.Wallet.z0.j;
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
            case 11:
                boolean z10 = org.telegram.ui.Wallet.p6.j0;
                return;
            case 12:
                PhotoViewer.p1().z0(false, false);
                return;
            case 13:
                Utilities.e.c(new cd0(15));
                return;
            case 14:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(org.telegram.messenger.w7.z(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j3 = 0; j3 < readInt64; j3++) {
                            org.telegram.ui.web.w0 w0Var = new org.telegram.ui.web.w0();
                            w0Var.readParams(serializedData, true);
                            arrayList.add(w0Var);
                            longSparseArray.put(w0Var.a, w0Var);
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Wallet.u4(21, arrayList, longSparseArray));
                return;
            case 15:
                try {
                    File file2 = new File(org.telegram.messenger.w7.z(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = c8.cb.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = c8.cb.c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((org.telegram.ui.web.w0) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = c8.cb.c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((org.telegram.ui.web.w0) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 16:
                return;
            case 17:
                break;
            case 18:
                if (org.telegram.utils.twidget.p1.a()) {
                    org.telegram.utils.twidget.n0.f.clear();
                    Iterator it2 = org.telegram.utils.twidget.n0.a.values().iterator();
                    while (it2.hasNext()) {
                        org.telegram.utils.twidget.d1 d1Var = ((org.telegram.utils.twidget.k0) it2.next()).t;
                        if (d1Var != null && d1Var.f != null) {
                            d1Var.m();
                        }
                    }
                    return;
                }
                return;
            case 19:
                org.telegram.utils.twidget.n0.j();
                return;
            case 20:
                org.telegram.messenger.cz.D1 = !org.telegram.messenger.cz.D1;
                org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", org.telegram.messenger.cz.D1);
                org.telegram.messenger.g0.c0(LaunchActivity.H1.y0.getRootView(), new pg.c(i10));
                return;
            case 21:
                String str = "Dark Blue";
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String str2 = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string) == null || org.telegram.ui.ActionBar.m6.Q0(string).q()) {
                    string = "Blue";
                }
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.m6.Q0(string2) == null || !org.telegram.ui.ActionBar.m6.Q0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.l6 l6Var = org.telegram.ui.ActionBar.m6.I;
                if (!string.equals(string2)) {
                    str = string2;
                } else if (l6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                    str = string2;
                    org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.k6(org.telegram.ui.ActionBar.m6.I.q() ? org.telegram.ui.ActionBar.m6.Q0(str) : org.telegram.ui.ActionBar.m6.Q0(str2), i7), 200L);
                    return;
                }
                str2 = string;
                org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.k6(org.telegram.ui.ActionBar.m6.I.q() ? org.telegram.ui.ActionBar.m6.Q0(str) : org.telegram.ui.ActionBar.m6.Q0(str2), i7), 200L);
                return;
            case 22:
                sg.a0.b();
                return;
            case 23:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 24:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    return;
                }
                return;
            case 25:
                org.telegram.messenger.ls.f(org.telegram.messenger.k10.t0).m(org.telegram.messenger.ls.u3, new Object[0]);
                return;
            case 26:
                int i13 = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 27:
                float[] fArr = ug.w1.V;
                return;
            default:
                bi.e2.l1(false, null);
                return;
        }
        while (true) {
            try {
                synchronized (org.telegram.utils.twidget.l.a) {
                    while (org.telegram.utils.twidget.l.b == 0) {
                        try {
                            org.telegram.utils.twidget.l.a.wait();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize();
                if (nativeHeapAllocatedSize > 419430400) {
                    Log.e("WidgetEngine", "native heap " + (nativeHeapAllocatedSize >> 20) + " MB, over 400 MB: the engine stops");
                    Process.killProcess(Process.myPid());
                }
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    private final void a() {
    }
}
