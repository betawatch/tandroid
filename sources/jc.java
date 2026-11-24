// default package

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.LongSparseArray;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.messenger.AppStartReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class jc implements Runnable {
    public final /* synthetic */ byte a;

    public /* synthetic */ jc(byte b) {
        this.a = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = 3;
        int i = 0;
        switch (this.a) {
            case 0:
                int i2 = AlarmManagerSchedulerBroadcastReceiver.a;
                return;
            case 1:
                d S = LaunchActivity.S();
                if (S != null) {
                    ag0 ag0Var = new ag0();
                    ag0Var.a = true;
                    S.showAsSheet(new PremiumPreviewFragment(0, "schedule_repeat"), ag0Var);
                    return;
                }
                return;
            case 2:
                gl.r(vl.w);
                try {
                    if (vl.r != null) {
                        for (int i3 = 0; i3 < vl.r.size(); i3++) {
                            LongSparseArray longSparseArray = (LongSparseArray) vl.r.valueAt(i3);
                            int i4 = 0;
                            while (i4 < longSparseArray.size()) {
                                if (!((vl) longSparseArray.valueAt(i4)).a) {
                                    longSparseArray.removeAt(i4);
                                    i4--;
                                }
                                i4++;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    boolean z = w01.a;
                    return;
                }
            case 3:
                int i5 = AppStartReceiver.a;
                gba.s();
                if (gba.r.length() > 0) {
                    gba.w = true;
                    gba.x();
                }
                a.w();
                return;
            case 4:
                Utilities.e.c(new jc((byte) 7));
                return;
            case 5:
                boolean z2 = fa4.j;
                StringBuilder sb = new StringBuilder();
                for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
                    Thread key = entry.getKey();
                    StackTraceElement[] value = entry.getValue();
                    sb.append("Thread: ");
                    sb.append(key.getName());
                    sb.append("\n");
                    for (StackTraceElement stackTraceElement : value) {
                        sb.append("\tat ");
                        sb.append(stackTraceElement);
                        sb.append("\n");
                    }
                    sb.append("\n\n");
                }
                fa4.d("ANR thread dump\n".concat(sb.toString()));
                fa4.j();
                fa4.c(false);
                return;
            case 6:
                a.w();
                return;
            case 7:
                z.d(a.b);
                return;
            case 8:
                if (((b) a.k()).hasServices()) {
                    ((b) a.k()).onRequestPushToken();
                    return;
                }
                if (w01.a) {
                    a.k();
                    fa4.b("No valid Google Play Services APK found.");
                }
                gba.g = "__NO_GOOGLE_PLAY_SERVICES__";
                a.k();
                PushListenerController.sendRegistrationToServer(2, null);
                return;
            case 9:
                kp kpVar = dk0.B;
                if (kpVar != null) {
                    ArrayList arrayList = null;
                    while (i < dk0.y) {
                        if (((Bitmap[]) kpVar.d)[i] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) kpVar.d)[i]);
                        }
                        ((Bitmap[]) kpVar.d)[i] = null;
                        ((dm5[]) kpVar.c)[i] = null;
                        i++;
                    }
                    if (arrayList != null) {
                        Utilities.e.c(new re(arrayList, b));
                    }
                    dk0.B = null;
                    return;
                }
                return;
            case 10:
                return;
            case 11:
                Utilities.e.c(new jc((byte) 13));
                return;
            case 12:
                ArrayList arrayList2 = new ArrayList();
                LongSparseArray longSparseArray2 = new LongSparseArray();
                try {
                    File file = new File(ba4.z(4), "webhistory.dat");
                    if (file.exists()) {
                        SerializedData serializedData = new SerializedData(file);
                        long readInt64 = serializedData.readInt64(true);
                        for (long j = 0; j < readInt64; j++) {
                            e01 e01Var = new e01();
                            e01Var.readParams(serializedData, true);
                            arrayList2.add(e01Var);
                            longSparseArray2.put(e01Var.a, e01Var);
                        }
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                gl.c3(new z20(arrayList2, longSparseArray2, (byte) 28));
                return;
            case 13:
                try {
                    File file2 = new File(ba4.z(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = zod.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList3 = zod.c;
                    int size2 = arrayList3.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj = arrayList3.get(i6);
                        i6++;
                        ((e01) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList4 = zod.c;
                    int size3 = arrayList4.size();
                    while (i < size3) {
                        Object obj2 = arrayList4.get(i);
                        i++;
                        ((e01) obj2).serializeToStream(serializedData3);
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        fileOutputStream.write(serializedData3.toByteArray());
                        fileOutputStream.close();
                        return;
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                        return;
                    }
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 14:
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", y6c.h(Q.getCurrentAccount()).e());
                    Q.presentFragment(new mu1(bundle));
                    return;
                }
                return;
            case 15:
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.isFinishing()) {
                    return;
                }
                Intent intent = new Intent("android.intent.action.VIEW_DOWNLOADS");
                intent.setFlags(268468224);
                LaunchActivity.H1.startActivity(intent);
                return;
            case 16:
                d Q2 = LaunchActivity.Q();
                if (Q2 != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", y6c.h(Q2.getCurrentAccount()).e());
                    bundle2.putInt("chatMode", 1);
                    Q2.presentFragment(new mu1(bundle2));
                    return;
                }
                return;
            case 17:
                d19.b(true);
                return;
            case 18:
                kk7 e4 = kk7.e();
                Boolean bool = Boolean.TRUE;
                e4.k(kk7.p4, Boolean.FALSE, bool, bool);
                return;
            case 19:
                int i7 = ChatActivityEnterView.r7;
                return;
            case 20:
                MediaController.w().A0(0, 0, false, false);
                return;
            case 21:
                MediaController.w().A0(0, 0, false, false);
                return;
            case 22:
                kk7.e().k(99, 512);
                return;
            case 23:
                PhotoViewer.r0().B(false, false);
                return;
            case 24:
                PhotoViewer.r0().B(false, false);
                return;
            case 25:
                ConnectionsManager.lambda$onProxyError$19();
                return;
            case 26:
                break;
            case 27:
                return;
            case 28:
                eya.D0();
                return;
            default:
                return;
        }
        while (i < 4) {
            if (y6c.h(i).o()) {
                ConnectionsManager.getInstance(i).resumeNetworkMaybe();
                Utilities.e.c(new wt2(qu2.r(i), b));
            }
            i++;
        }
    }

    public /* synthetic */ jc(Object obj, byte b) {
        this.a = b;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
