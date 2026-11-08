package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Looper;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o61 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ o61(int i7) {
        this.a = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i7 = 1;
        int i10 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.k6.N = false;
                org.telegram.ui.ActionBar.k6.F(false);
                break;
            case 1:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Wallet.m0[] m0VarArr = org.telegram.ui.Wallet.m0.O;
                break;
            case 3:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.cc I = org.telegram.ui.Components.hc.a0(T).I(R.raw.contact_check, org.telegram.messenger.id.M0(2131743194, null), org.telegram.messenger.id.M0(2131743192, null));
                    I.j = 5000;
                    I.j();
                    break;
                }
                break;
            case 4:
                CopyOnWriteArrayList copyOnWriteArrayList = org.telegram.ui.Wallet.q0.i;
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
                break;
            case 5:
                boolean z9 = org.telegram.ui.Wallet.y5.j0;
                break;
            case 6:
                PhotoViewer.p1().z0(false, false);
                break;
            case 7:
                Utilities.e.c(new o61(9));
                break;
            case 8:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(org.telegram.messenger.w7.z(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j3 = 0; j3 < readInt64; j3++) {
                            org.telegram.ui.web.y0 y0Var = new org.telegram.ui.web.y0();
                            y0Var.readParams(serializedData, true);
                            arrayList.add(y0Var);
                            longSparseArray.put(y0Var.a, y0Var);
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new org.telegram.ui.web.w(arrayList, longSparseArray));
                break;
            case 9:
                try {
                    File file2 = new File(org.telegram.messenger.w7.z(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = c8.xa.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = c8.xa.c;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        ((org.telegram.ui.web.y0) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = c8.xa.c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((org.telegram.ui.web.y0) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 10:
                break;
            case 11:
                if (org.telegram.utils.twidget.i1.a()) {
                    org.telegram.utils.twidget.n0.f.clear();
                    Iterator it2 = org.telegram.utils.twidget.n0.a.values().iterator();
                    while (it2.hasNext()) {
                        org.telegram.utils.twidget.v0 v0Var = ((org.telegram.utils.twidget.k0) it2.next()).t;
                        if (v0Var != null && v0Var.f != null) {
                            v0Var.p();
                        }
                    }
                    break;
                }
                break;
            case 12:
                org.telegram.utils.twidget.n0.j();
                break;
            case 13:
                org.telegram.messenger.iz.D1 = !org.telegram.messenger.iz.D1;
                org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", org.telegram.messenger.iz.D1);
                org.telegram.messenger.g0.c0(LaunchActivity.G1.x0.getRootView(), new pg.c(i10));
                break;
            case 14:
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string) == null || org.telegram.ui.ActionBar.k6.Q0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.Q0(string2) == null || !org.telegram.ui.ActionBar.k6.Q0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
                if (string.equals(string2)) {
                    if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.i6(org.telegram.ui.ActionBar.k6.I.q() ? org.telegram.ui.ActionBar.k6.Q0(str2) : org.telegram.ui.ActionBar.k6.Q0(str), i7), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.i6(org.telegram.ui.ActionBar.k6.I.q() ? org.telegram.ui.ActionBar.k6.Q0(str2) : org.telegram.ui.ActionBar.k6.Q0(str), i7), 200L);
                break;
            case 15:
                sg.b0.b();
                break;
            case 16:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 17:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    break;
                }
                break;
            case 18:
                org.telegram.messenger.qs.f(org.telegram.messenger.p10.s0).m(org.telegram.messenger.qs.s3, new Object[0]);
                break;
            case 19:
                int i12 = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 20:
                float[] fArr = ug.t1.U;
                break;
            case 21:
                wg.f1.l1(0, null);
                break;
            default:
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2();
                    d2Var.a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), d2Var);
                    break;
                }
                break;
        }
    }

    private final void a() {
    }
}
