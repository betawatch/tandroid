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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb1 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ hb1(int i3) {
        this.a = i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3 = 1;
        int i10 = 0;
        switch (this.a) {
            case 0:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Wallet.k0[] k0VarArr = org.telegram.ui.Wallet.k0.O;
                break;
            case 2:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(T).I(R.raw.contact_check, org.telegram.messenger.bd.M0(2131743201, null), org.telegram.messenger.bd.M0(2131743199, null));
                    I.j = 5000;
                    I.j();
                    break;
                }
                break;
            case 3:
                CopyOnWriteArrayList copyOnWriteArrayList = org.telegram.ui.Wallet.o0.i;
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
            case 4:
                boolean z10 = org.telegram.ui.Wallet.x5.j0;
                break;
            case 5:
                PhotoViewer.v1().H0(false, false);
                break;
            case 6:
                Utilities.e.c(new hb1(8));
                break;
            case 7:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(org.telegram.messenger.w7.z(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j10 = 0; j10 < readInt64; j10++) {
                            org.telegram.ui.web.x0 x0Var = new org.telegram.ui.web.x0();
                            x0Var.readParams(serializedData, true);
                            arrayList.add(x0Var);
                            longSparseArray.put(x0Var.a, x0Var);
                        }
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                org.telegram.messenger.g0.h3(new hc1(6, arrayList, longSparseArray));
                break;
            case 8:
                try {
                    File file2 = new File(org.telegram.messenger.w7.z(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = b8.xf.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = b8.xf.c;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        ((org.telegram.ui.web.x0) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = b8.xf.c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((org.telegram.ui.web.x0) obj2).serializeToStream(serializedData3);
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
            case 9:
                break;
            case 10:
                org.telegram.utils.twidget.p.j();
                break;
            case 11:
                org.telegram.messenger.az.D1 = !org.telegram.messenger.az.D1;
                org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", org.telegram.messenger.az.D1);
                org.telegram.messenger.g0.c0(LaunchActivity.K1.A0.getRootView(), new ei.e(27));
                break;
            case 12:
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
                        org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.i6(org.telegram.ui.ActionBar.k6.I.q() ? org.telegram.ui.ActionBar.k6.Q0(str2) : org.telegram.ui.ActionBar.k6.Q0(str), i3), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.i6(org.telegram.ui.ActionBar.k6.I.q() ? org.telegram.ui.ActionBar.k6.Q0(str2) : org.telegram.ui.ActionBar.k6.Q0(str), i3), 200L);
                break;
            case 13:
                int i12 = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 14:
                tg.b0.b();
                break;
            case 15:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 16:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    break;
                }
                break;
            case 17:
                org.telegram.messenger.hs.f(org.telegram.messenger.h10.t0).m(org.telegram.messenger.hs.s3, new Object[0]);
                break;
            case 18:
                float[] fArr = vg.w1.V;
                break;
            default:
                xg.e1.l1(0, null);
                break;
        }
    }

    private final void a() {
    }
}
