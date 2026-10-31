package org.telegram.ui.Components.voip;

import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.zs;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.c6;
import org.telegram.ui.Wallet.k3;
import org.telegram.ui.b50;
import org.telegram.ui.m51;
import th.h4;
import w7.m6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ m0(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cc a02;
        int i10 = 0;
        switch (this.a) {
            case 0:
                zs.e().k(zs.F2, new Object[0]);
                break;
            case 1:
                t1.a();
                break;
            case 2:
                h4.I0();
                break;
            case 3:
                b50 b50Var = b50.u5;
                if (b50Var != null) {
                    b50Var.show();
                    break;
                }
                break;
            case 4:
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(false, true, false);
                    break;
                }
                break;
            case 5:
                Pattern pattern = LaunchActivity.D1;
                break;
            case 6:
                Pattern pattern2 = LaunchActivity.D1;
                break;
            case 7:
                Pattern pattern3 = LaunchActivity.D1;
                org.telegram.messenger.w0.E = false;
                org.telegram.messenger.w0.G = System.currentTimeMillis();
                break;
            case 8:
                break;
            case 9:
                CallReceiver.a();
                break;
            case 10:
                CallReceiver.a();
                break;
            case 11:
                cc.X().N(cd.L0(2131745878, null), cd.L0(2131751106, null)).j();
                break;
            case 12:
                cc.X().N(cd.L0(2131745878, null), cd.L0(2131751106, null)).j();
                break;
            case 13:
                Drawable[] drawableArr = PhotoViewer.U8;
                break;
            case 14:
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null && (a02 = cc.a0(T)) != null) {
                    wb I = a02.I(R.raw.msg_antispam, cd.L0(2131746239, null), cd.L0(2131746202, null));
                    I.j = 5000;
                    I.j();
                    break;
                }
                break;
            case 15:
                int i11 = m51.V1;
                break;
            case 16:
                t6.N = false;
                t6.F(false);
                break;
            case 17:
                if (VoIPService.getSharedState() != null) {
                    VoIPService.getSharedState().acceptIncomingCall();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Wallet.k0[] k0VarArr = org.telegram.ui.Wallet.k0.O;
                break;
            case 19:
                org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    wb I2 = cc.a0(T2).I(R.raw.contact_check, cd.L0(2131743217, null), cd.L0(2131743215, null));
                    I2.j = 5000;
                    I2.j();
                    break;
                }
                break;
            case 20:
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
            case 21:
                boolean z10 = c6.j0;
                break;
            case 22:
                PhotoViewer.v1().H0(false, false);
                break;
            case 23:
                Utilities.e.c(new m0(25));
                break;
            case 24:
                ArrayList arrayList = new ArrayList();
                LongSparseArray longSparseArray = new LongSparseArray();
                try {
                    File file = new File(b8.z(4), "webhistory.dat");
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
                } catch (Exception e) {
                    f8.g(e, true);
                }
                org.telegram.messenger.i0.g3(new k3(24, arrayList, longSparseArray));
                break;
            case 25:
                try {
                    File file2 = new File(b8.z(4), "webhistory.dat");
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    long size = m6.c.size();
                    SerializedData serializedData2 = new SerializedData(true);
                    serializedData2.writeInt64(size);
                    ArrayList arrayList2 = m6.c;
                    int size2 = arrayList2.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj = arrayList2.get(i12);
                        i12++;
                        ((org.telegram.ui.web.a1) obj).serializeToStream(serializedData2);
                    }
                    SerializedData serializedData3 = new SerializedData(serializedData2.length());
                    serializedData3.writeInt64(size);
                    ArrayList arrayList3 = m6.c;
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
                    } catch (Exception e7) {
                        f8.g(e7, true);
                        return;
                    }
                } catch (Exception e10) {
                    f8.g(e10, true);
                    return;
                }
            case 26:
                break;
            case 27:
                org.telegram.utils.twidget.p.j();
                break;
            case 28:
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    Q.showAsSheet(new PremiumPreviewFragment(0, "gifts"), i2Var);
                    break;
                }
                break;
            default:
                cc.X().N(cd.L0(2131745878, null), cd.L0(2131751106, null)).j();
                break;
        }
    }

    public /* synthetic */ m0(Object obj, int i10) {
        this.a = i10;
    }

    private final void a() {
    }

    private final void b() {
    }
}
