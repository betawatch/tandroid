package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Looper;
import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c21 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ c21(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.qc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 1:
                org.telegram.ui.Components.qc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 2:
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null && (a02 = org.telegram.ui.Components.qc.a0(U)) != null) {
                    org.telegram.ui.Components.ic M = a02.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    M.j = 5000;
                    M.j();
                    break;
                }
                break;
            case 3:
                int i11 = y81.a0;
                break;
            case 4:
                org.telegram.ui.ActionBar.j6.N = false;
                org.telegram.ui.ActionBar.j6.E(false);
                break;
            case 5:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    break;
                }
                break;
            case 6:
                int[][] iArr = WallpapersListActivity.h0;
                PhotoViewer.t1().G0(false, false);
                break;
            case 7:
                Utilities.globalQueue.postRunnable(new c21(9));
                break;
            case 8:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j10 = 0; j10 < readInt64; j10++) {
                            org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1();
                            b1Var.readParams(serializedData, true);
                            arrayList.add(b1Var);
                            longSparseArray.put(b1Var.a, b1Var);
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                AndroidUtilities.runOnUIThread(new kg1(10, arrayList, longSparseArray));
                break;
            case 9:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = org.telegram.ui.web.c1.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = org.telegram.ui.web.c1.c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((org.telegram.ui.web.b1) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = org.telegram.ui.web.c1.c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((org.telegram.ui.web.b1) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                        break;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 10:
                break;
            case 11:
                int i13 = ph.y.u0;
                break;
            case 12:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 13:
                break;
            case 14:
                MessagesController.getGlobalMainSettings().edit().putInt("storydualhint", MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) + 1).apply();
                break;
            case 15:
                HashSet hashSet = rh.q2.T0;
                break;
            case 16:
                break;
            case 17:
                int i14 = th.g.C;
                break;
            case 18:
                uf.p1[] p1VarArr = uf.p1.g;
                break;
            case 19:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.D1.w0.getRootView(), new nh.e(19));
                break;
            default:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string) == null || org.telegram.ui.ActionBar.j6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string2) == null || !org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
                if (string.equals(string2)) {
                    if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new xg.a(org.telegram.ui.ActionBar.j6.I.q() ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str), 2), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new xg.a(org.telegram.ui.ActionBar.j6.I.q() ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str), 2), 200L);
                break;
        }
    }

    public /* synthetic */ c21(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
