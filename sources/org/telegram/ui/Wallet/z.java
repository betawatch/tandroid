package org.telegram.ui.Wallet;

import android.content.SharedPreferences;
import android.os.Looper;
import android.util.LongSparseArray;
import c8.xa;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ z(int i7) {
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
                n0[] n0VarArr = n0.O;
                break;
            case 1:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    cc I = hc.a0(T).I(R.raw.contact_check, hd.M0(2131743192, null), hd.M0(2131743190, null));
                    I.j = 5000;
                    I.j();
                    break;
                }
                break;
            case 2:
                CopyOnWriteArrayList copyOnWriteArrayList = r0.i;
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
            case 3:
                boolean z9 = z5.j0;
                break;
            case 4:
                PhotoViewer.p1().z0(false, false);
                break;
            case 5:
                Utilities.e.c(new z(7));
                break;
            case 6:
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
            case 7:
                try {
                    File file2 = new File(org.telegram.messenger.w7.z(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = xa.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = xa.c;
                    int size2 = arrayList2.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        ((org.telegram.ui.web.y0) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = xa.c;
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
            case 8:
                break;
            case 9:
                if (org.telegram.utils.twidget.h0.a()) {
                    org.telegram.utils.twidget.p.f.clear();
                    Iterator it2 = org.telegram.utils.twidget.p.a.values().iterator();
                    while (it2.hasNext()) {
                        org.telegram.utils.twidget.u uVar = ((org.telegram.utils.twidget.m) it2.next()).t;
                        if (uVar != null && uVar.f != null) {
                            uVar.p();
                        }
                    }
                    break;
                }
                break;
            case 10:
                org.telegram.utils.twidget.p.j();
                break;
            case 11:
                iz.D1 = !iz.D1;
                org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", iz.D1);
                org.telegram.messenger.g0.c0(LaunchActivity.G1.x0.getRootView(), new pg.c(i10));
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
                        org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.i6(org.telegram.ui.ActionBar.k6.I.q() ? org.telegram.ui.ActionBar.k6.Q0(str2) : org.telegram.ui.ActionBar.k6.Q0(str), i7), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.i6(org.telegram.ui.ActionBar.k6.I.q() ? org.telegram.ui.ActionBar.k6.Q0(str2) : org.telegram.ui.ActionBar.k6.Q0(str), i7), 200L);
                break;
            case 13:
                sg.b0.b();
                break;
            case 14:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    break;
                }
                break;
            case 16:
                qs.f(p10.s0).m(qs.s3, new Object[0]);
                break;
            case 17:
                int i12 = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 18:
                float[] fArr = ug.t1.U;
                break;
            case 19:
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
