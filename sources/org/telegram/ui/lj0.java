package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ lj0(int i9) {
        this.a = i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.oc a02;
        int i9 = 4;
        int i10 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.oc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 1:
                Drawable[] drawableArr = PhotoViewer.P8;
                break;
            case 2:
                org.telegram.ui.Components.oc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 3:
                org.telegram.ui.Components.oc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 4:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null && (a02 = org.telegram.ui.Components.oc.a0(U)) != null) {
                    org.telegram.ui.Components.gc M = a02.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    M.j = 5000;
                    M.j();
                    break;
                }
                break;
            case 5:
                int i11 = k81.Z;
                break;
            case 6:
                org.telegram.ui.ActionBar.f6.N = false;
                org.telegram.ui.ActionBar.f6.E(false);
                break;
            case 7:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    break;
                }
                break;
            case 8:
                int[][] iArr = WallpapersListActivity.g0;
                PhotoViewer.t1().F0(false, false);
                break;
            case 9:
                Utilities.globalQueue.postRunnable(new lj0(11));
                break;
            case 10:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j10 = 0; j10 < readInt64; j10++) {
                            org.telegram.ui.web.z0 z0Var = new org.telegram.ui.web.z0();
                            z0Var.readParams(serializedData, true);
                            arrayList.add(z0Var);
                            longSparseArray.put(z0Var.a, z0Var);
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new ai1(i9, arrayList, longSparseArray));
                break;
            case 11:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = org.telegram.ui.web.a1.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = org.telegram.ui.web.a1.c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((org.telegram.ui.web.z0) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = org.telegram.ui.web.a1.c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((org.telegram.ui.web.z0) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                        break;
                    } catch (Exception e11) {
                        FileLog.e(e11);
                        return;
                    }
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return;
                }
            case 12:
                break;
            case 13:
                pf.r1[] r1VarArr = pf.r1.g;
                break;
            case 14:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.C1.v0.getRootView(), new ih.e(18));
                break;
            case 15:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string) == null || org.telegram.ui.ActionBar.f6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string2) == null || !org.telegram.ui.ActionBar.f6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.I;
                if (string.equals(string2)) {
                    if (e6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new pf.o1(org.telegram.ui.ActionBar.f6.I.q() ? org.telegram.ui.ActionBar.f6.N0(str2) : org.telegram.ui.ActionBar.f6.N0(str), 9), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new pf.o1(org.telegram.ui.ActionBar.f6.I.q() ? org.telegram.ui.ActionBar.f6.N0(str2) : org.telegram.ui.ActionBar.f6.N0(str), 9), 200L);
                break;
            case 16:
                xf.i0.b();
                break;
            case 17:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 18:
                Looper myLooper2 = Looper.myLooper();
                if (myLooper2 != null) {
                    myLooper2.quit();
                    break;
                }
                break;
            case 19:
                NotificationCenter.getInstance(UserConfig.selectedAccount).postNotificationNameOnUIThread(NotificationCenter.customStickerCreated, new Object[0]);
                break;
            default:
                float[] fArr = zf.z1.Q;
                break;
        }
    }

    public /* synthetic */ lj0(n0 n0Var) {
        this.a = 12;
    }

    private final void a() {
    }
}
