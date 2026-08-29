package org.telegram.ui;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.SerializedData;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ef0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ ef0(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.tc a02;
        int i10 = 0;
        switch (this.a) {
            case 0:
                CallReceiver.checkLastReceivedCall();
                break;
            case 1:
                org.telegram.ui.Components.tc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 2:
                org.telegram.ui.Components.tc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 3:
                Drawable[] drawableArr = PhotoViewer.P8;
                break;
            case 4:
                org.telegram.ui.Components.tc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 5:
                org.telegram.ui.Components.tc.X().N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                break;
            case 6:
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null && (a02 = org.telegram.ui.Components.tc.a0(U)) != null) {
                    org.telegram.ui.Components.mc M = a02.M(LocaleController.getString(R.string.ReportChatSent), LocaleController.getString(R.string.Reported2), R.raw.msg_antispam);
                    M.j = 5000;
                    M.j();
                    break;
                }
                break;
            case 7:
                int i11 = l81.Z;
                break;
            case 8:
                org.telegram.ui.ActionBar.g6.N = false;
                org.telegram.ui.ActionBar.g6.E(false);
                break;
            case 9:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    break;
                }
                break;
            case 10:
                int[][] iArr = WallpapersListActivity.g0;
                PhotoViewer.t1().G0(false, false);
                break;
            case 11:
                Utilities.globalQueue.postRunnable(new ef0(13));
                break;
            case 12:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j10 = 0; j10 < readInt64; j10++) {
                            org.telegram.ui.web.a1 a1Var = new org.telegram.ui.web.a1();
                            a1Var.readParams(serializedData, true);
                            arrayList.add(a1Var);
                            longSparseArray.put(a1Var.a, a1Var);
                        }
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new org.telegram.ui.web.y(arrayList, longSparseArray));
                break;
            case 13:
                try {
                    File file2 = new File(FileLoader.getDirectory(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = org.telegram.ui.web.b1.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = org.telegram.ui.web.b1.c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((org.telegram.ui.web.a1) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = org.telegram.ui.web.b1.c;
                    int size3 = arrayList3.size();
                    while (i10 < size3) {
                        Object obj2 = arrayList3.get(i10);
                        i10++;
                        ((org.telegram.ui.web.a1) obj2).serializeToStream(serializedData3);
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
            case 14:
                break;
            case 15:
                HashSet hashSet = ph.p2.S0;
                break;
            case 16:
                break;
            case 17:
                int i13 = rh.g.B;
                break;
            case 18:
                sf.s1[] s1VarArr = sf.s1.g;
                break;
            case 19:
                SharedConfig.drawActionBarShadow = !SharedConfig.drawActionBarShadow;
                SharedConfig.saveDebugConfig();
                AndroidUtilities.forEachViews(LaunchActivity.C1.v0.getRootView(), new l4.x0(18));
                break;
            default:
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
                    string = "Blue";
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                    string2 = "Dark Blue";
                }
                org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
                if (string.equals(string2)) {
                    if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        AndroidUtilities.runOnUIThread(new xf.c(org.telegram.ui.ActionBar.g6.I.q() ? org.telegram.ui.ActionBar.g6.N0(str2) : org.telegram.ui.ActionBar.g6.N0(str), i10), 200L);
                        break;
                    }
                } else {
                    str2 = string2;
                }
                str = string;
                AndroidUtilities.runOnUIThread(new xf.c(org.telegram.ui.ActionBar.g6.I.q() ? org.telegram.ui.ActionBar.g6.N0(str2) : org.telegram.ui.ActionBar.g6.N0(str), i10), 200L);
                break;
        }
    }

    public /* synthetic */ ef0(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
