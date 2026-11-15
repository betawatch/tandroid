package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ah0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ ah0(int i7) {
        this.a = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.cc a02;
        int i7 = 1;
        int i10 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.cc.X().N(org.telegram.messenger.hd.M0(2131745861, null), org.telegram.messenger.hd.M0(2131751105, null)).j();
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.Z8;
                break;
            case 2:
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null && (a02 = org.telegram.ui.Components.cc.a0(T)) != null) {
                    org.telegram.ui.Components.xb I = a02.I(R.raw.msg_antispam, org.telegram.messenger.hd.M0(2131746222, null), org.telegram.messenger.hd.M0(2131746185, null));
                    I.j = 5000;
                    I.j();
                    break;
                }
                break;
            case 3:
                int i11 = r31.Z1;
                break;
            case 4:
                org.telegram.ui.ActionBar.j6.N = false;
                org.telegram.ui.ActionBar.j6.F(false);
                break;
            case 5:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Wallet.l0[] l0VarArr = org.telegram.ui.Wallet.l0.O;
                break;
            case 7:
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    org.telegram.ui.Components.xb I2 = org.telegram.ui.Components.cc.a0(T2).I(R.raw.contact_check, org.telegram.messenger.hd.M0(2131743191, null), org.telegram.messenger.hd.M0(2131743189, null));
                    I2.j = 5000;
                    I2.j();
                    break;
                }
                break;
            case 8:
                CopyOnWriteArrayList copyOnWriteArrayList = org.telegram.ui.Wallet.p0.i;
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
            case 9:
                boolean z10 = org.telegram.ui.Wallet.z5.j0;
                break;
            case 10:
                PhotoViewer.p1().z0(false, false);
                break;
            case 11:
                Utilities.e.c(new ah0(13));
                break;
            case 12:
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
                org.telegram.messenger.g0.h3(new org.telegram.ui.Wallet.r(27, arrayList, longSparseArray));
                break;
            case 13:
                try {
                    File file2 = new File(org.telegram.messenger.w7.z(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = c8.za.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = c8.za.c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((org.telegram.ui.web.w0) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = c8.za.c;
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
                        break;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                    return;
                }
            case 14:
                break;
            case 15:
                if (org.telegram.utils.twidget.l1.a()) {
                    org.telegram.utils.twidget.n0.f.clear();
                    Iterator it2 = org.telegram.utils.twidget.n0.a.values().iterator();
                    while (it2.hasNext()) {
                        org.telegram.utils.twidget.y0 y0Var = ((org.telegram.utils.twidget.k0) it2.next()).t;
                        if (y0Var != null && y0Var.f != null) {
                            y0Var.p();
                        }
                    }
                    break;
                }
                break;
            case 16:
                org.telegram.utils.twidget.n0.j();
                break;
            case 17:
                org.telegram.messenger.gz.D1 = !org.telegram.messenger.gz.D1;
                org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit().putBoolean("drawActionBarShadow", org.telegram.messenger.gz.D1);
                org.telegram.messenger.g0.c0(LaunchActivity.H1.y0.getRootView(), new pg.c(i10));
                break;
            case 18:
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string) == null || org.telegram.ui.ActionBar.j6.Q0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.Q0(string2) == null || !org.telegram.ui.ActionBar.j6.Q0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
                if (string.equals(string2)) {
                    if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.h6(org.telegram.ui.ActionBar.j6.I.q() ? org.telegram.ui.ActionBar.j6.Q0(str2) : org.telegram.ui.ActionBar.j6.Q0(str), i7), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                org.telegram.messenger.g0.i3(new org.telegram.ui.ActionBar.h6(org.telegram.ui.ActionBar.j6.I.q() ? org.telegram.ui.ActionBar.j6.Q0(str2) : org.telegram.ui.ActionBar.j6.Q0(str), i7), 200L);
                break;
            case 19:
                sg.a0.b();
                break;
            case 20:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 21:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    break;
                }
                break;
            case 22:
                org.telegram.messenger.ns.f(org.telegram.messenger.m10.t0).m(org.telegram.messenger.ns.s3, new Object[0]);
                break;
            case 23:
                int i13 = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 24:
                float[] fArr = ug.w1.V;
                break;
            default:
                wg.c1.l1(0, null);
                break;
        }
    }

    private final void a() {
    }
}
