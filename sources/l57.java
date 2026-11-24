// default package

import android.content.SharedPreferences;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class l57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gk7 b;
    public final /* synthetic */ Cloneable c;
    public final /* synthetic */ Cloneable d;
    public final /* synthetic */ Cloneable e;
    public final /* synthetic */ Cloneable f;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Cloneable n;
    public final /* synthetic */ Cloneable r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Cloneable w;

    public /* synthetic */ l57(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, hu2 hu2Var) {
        this.a = (byte) 2;
        this.b = notificationsSettingsActivity;
        this.c = arrayList;
        this.d = arrayList2;
        this.w = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
        this.h = arrayList6;
        this.n = arrayList7;
        this.r = arrayList8;
        this.s = hu2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x036e, code lost:
    
        if (hc2.T(r0.K0(java.lang.Long.valueOf(r5))) == false) goto L143;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        LongSparseIntArray longSparseIntArray;
        LongSparseIntArray longSparseIntArray2;
        int i2;
        int i3;
        ArrayList arrayList;
        int i4;
        ArrayList arrayList2;
        int i5;
        long j;
        char c;
        int i6;
        long j2;
        int i7;
        ArrayList arrayList3;
        int i8;
        ArrayList arrayList4;
        byte b = this.a;
        Object obj = this.s;
        Cloneable cloneable = this.r;
        Cloneable cloneable2 = this.n;
        Cloneable cloneable3 = this.h;
        Cloneable cloneable4 = this.f;
        Cloneable cloneable5 = this.e;
        Cloneable cloneable6 = this.w;
        Cloneable cloneable7 = this.d;
        Cloneable cloneable8 = this.c;
        gk7 gk7Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new l57((na7) gk7Var, (LongSparseIntArray) cloneable8, (LongSparseIntArray) cloneable7, (SparseIntArray) cloneable5, (vf6) cloneable4, (vf6) cloneable3, (vf6) cloneable2, (vf6) cloneable, (vf6) obj, (LongSparseIntArray) cloneable6, (byte) 1));
                break;
            case 1:
                na7 na7Var = (na7) gk7Var;
                LongSparseIntArray longSparseIntArray3 = (LongSparseIntArray) cloneable8;
                LongSparseIntArray longSparseIntArray4 = (LongSparseIntArray) cloneable7;
                SparseIntArray sparseIntArray = (SparseIntArray) cloneable5;
                vf6 vf6Var = (vf6) cloneable4;
                vf6 vf6Var2 = (vf6) cloneable3;
                vf6 vf6Var3 = (vf6) cloneable2;
                vf6 vf6Var4 = (vf6) cloneable;
                vf6 vf6Var5 = (vf6) obj;
                LongSparseIntArray longSparseIntArray5 = (LongSparseIntArray) cloneable6;
                vf6 vf6Var6 = na7Var.R;
                vf6 vf6Var7 = na7Var.S;
                if (longSparseIntArray3 == null && longSparseIntArray4 == null) {
                    longSparseIntArray = longSparseIntArray5;
                    i = 0;
                    i2 = 0;
                } else {
                    i = 0;
                    na7Var.getNotificationCenter().k(9, longSparseIntArray3, longSparseIntArray4);
                    if (longSparseIntArray3 != null) {
                        longSparseIntArray = longSparseIntArray5;
                        na7Var.getNotificationsController().L(longSparseIntArray3, 0L, 0, 0, false);
                        SharedPreferences.Editor edit = na7Var.W3.edit();
                        int size = longSparseIntArray3.size();
                        int i9 = 0;
                        int i10 = 0;
                        while (true) {
                            longSparseIntArray2 = longSparseIntArray4;
                            if (i9 < size) {
                                long keyAt = longSparseIntArray3.keyAt(i9);
                                int i11 = size;
                                int valueAt = longSparseIntArray3.valueAt(i9);
                                LongSparseIntArray longSparseIntArray6 = longSparseIntArray3;
                                TLRPC.Dialog dialog = (TLRPC.Dialog) vf6Var6.f(keyAt);
                                int i12 = i9;
                                if (dialog != null && (i4 = dialog.top_message) > 0 && i4 <= valueAt && (arrayList2 = (ArrayList) vf6Var7.f(dialog.id)) != null) {
                                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                        k27 k27Var = (k27) arrayList2.get(i13);
                                        if (k27Var != null && !k27Var.N3()) {
                                            k27Var.H5();
                                            i10 = 256;
                                        }
                                    }
                                }
                                if (keyAt != na7Var.getUserConfig().e()) {
                                    edit.remove("diditem" + keyAt);
                                    edit.remove("diditemo" + keyAt);
                                }
                                i9 = i12 + 1;
                                longSparseIntArray4 = longSparseIntArray2;
                                size = i11;
                                longSparseIntArray3 = longSparseIntArray6;
                            } else {
                                edit.commit();
                                i2 = i10;
                            }
                        }
                    } else {
                        longSparseIntArray = longSparseIntArray5;
                        longSparseIntArray2 = longSparseIntArray4;
                        i2 = 0;
                    }
                    if (longSparseIntArray2 != null) {
                        int size2 = longSparseIntArray2.size();
                        int i14 = i2;
                        int i15 = 0;
                        while (i15 < size2) {
                            LongSparseIntArray longSparseIntArray7 = longSparseIntArray2;
                            long keyAt2 = longSparseIntArray7.keyAt(i15);
                            int valueAt2 = longSparseIntArray7.valueAt(i15);
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) vf6Var6.f(keyAt2);
                            if (dialog2 != null && valueAt2 > dialog2.read_outbox_max_id) {
                                dialog2.read_outbox_max_id = valueAt2;
                                i14 = 256;
                            }
                            if (dialog2 != null && (i3 = dialog2.top_message) > 0 && i3 <= valueAt2 && (arrayList = (ArrayList) vf6Var7.f(dialog2.id)) != null) {
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    k27 k27Var2 = (k27) arrayList.get(i16);
                                    if (k27Var2 != null && k27Var2.N3()) {
                                        k27Var2.H5();
                                        i14 = 256;
                                    }
                                }
                            }
                            i15++;
                            longSparseIntArray2 = longSparseIntArray7;
                        }
                        i2 = i14;
                    }
                }
                if (sparseIntArray != null) {
                    int size3 = sparseIntArray.size();
                    int i17 = i2;
                    int i18 = i;
                    while (i18 < size3) {
                        int keyAt3 = sparseIntArray.keyAt(i18);
                        int valueAt3 = sparseIntArray.valueAt(i18);
                        kk7 notificationCenter = na7Var.getNotificationCenter();
                        Integer valueOf = Integer.valueOf(keyAt3);
                        Integer valueOf2 = Integer.valueOf(valueAt3);
                        SparseIntArray sparseIntArray2 = sparseIntArray;
                        int i19 = size3;
                        Object[] objArr = new Object[2];
                        objArr[i] = valueOf;
                        objArr[1] = valueOf2;
                        notificationCenter.k(36, objArr);
                        long E = cf3.E(keyAt3);
                        if (((TLRPC.Dialog) vf6Var6.f(E)) != null && (arrayList4 = (ArrayList) vf6Var7.f(E)) != null) {
                            for (int i20 = i; i20 < arrayList4.size(); i20++) {
                                k27 k27Var3 = (k27) arrayList4.get(i20);
                                if (k27Var3 != null && k27Var3.k.date <= valueAt3) {
                                    k27Var3.H5();
                                    i17 = 256;
                                }
                            }
                        }
                        i18++;
                        sparseIntArray = sparseIntArray2;
                        size3 = i19;
                    }
                    i2 = i17;
                }
                boolean z = true;
                if (vf6Var != null) {
                    int m = vf6Var.m();
                    for (int i21 = i; i21 < m; i21++) {
                        long j3 = vf6Var.j(i21);
                        ArrayList arrayList5 = (ArrayList) vf6Var.n(i21);
                        kk7 notificationCenter2 = na7Var.getNotificationCenter();
                        Object[] objArr2 = new Object[2];
                        objArr2[i] = Long.valueOf(j3);
                        objArr2[1] = arrayList5;
                        notificationCenter2.k(65, objArr2);
                    }
                }
                int i22 = 3;
                int i23 = 7;
                if (vf6Var2 != null) {
                    int m2 = vf6Var2.m();
                    int i24 = i;
                    while (i24 < m2) {
                        long j4 = vf6Var2.j(i24);
                        ArrayList arrayList6 = (ArrayList) vf6Var2.n(i24);
                        if (arrayList6 != null) {
                            kk7 notificationCenter3 = na7Var.getNotificationCenter();
                            boolean z2 = z;
                            ArrayList arrayList7 = arrayList6;
                            Long valueOf3 = Long.valueOf(-j4);
                            Object[] objArr3 = new Object[i22];
                            objArr3[i] = arrayList7;
                            objArr3[z2 ? 1 : 0] = valueOf3;
                            objArr3[2] = Boolean.FALSE;
                            notificationCenter3.k(i23, objArr3);
                            if (j4 == 0) {
                                int size4 = arrayList7.size();
                                int i25 = i;
                                while (i25 < size4) {
                                    ArrayList arrayList8 = arrayList7;
                                    k27 k27Var4 = (k27) na7Var.V.get(((Integer) arrayList8.get(i25)).intValue());
                                    if (k27Var4 != null) {
                                        if (w01.a) {
                                            i8 = i22;
                                            fa4.b("mark messages " + k27Var4.e1() + " deleted");
                                        } else {
                                            i8 = i22;
                                        }
                                        k27Var4.Z = z2;
                                    } else {
                                        i8 = i22;
                                    }
                                    i25++;
                                    i22 = i8;
                                    z2 = true;
                                    arrayList7 = arrayList8;
                                }
                            } else {
                                i7 = i22;
                                ArrayList arrayList9 = (ArrayList) vf6Var7.f(j4);
                                if (arrayList9 != null) {
                                    int i26 = i;
                                    while (i26 < arrayList9.size()) {
                                        k27 k27Var5 = (k27) arrayList9.get(i26);
                                        if (k27Var5 != null) {
                                            int size5 = arrayList7.size();
                                            int i27 = i;
                                            while (i27 < size5) {
                                                arrayList3 = arrayList9;
                                                if (k27Var5.e1() == ((Integer) arrayList7.get(i27)).intValue()) {
                                                    k27Var5.Z = true;
                                                    i26++;
                                                    arrayList9 = arrayList3;
                                                } else {
                                                    i27++;
                                                    arrayList9 = arrayList3;
                                                }
                                            }
                                        }
                                        arrayList3 = arrayList9;
                                        i26++;
                                        arrayList9 = arrayList3;
                                    }
                                }
                                i24++;
                                i22 = i7;
                                i23 = 7;
                                z = true;
                            }
                        }
                        i7 = i22;
                        i24++;
                        i22 = i7;
                        i23 = 7;
                        z = true;
                    }
                    i5 = i22;
                    j = 0;
                    na7Var.getNotificationsController().M(vf6Var2, i);
                } else {
                    i5 = 3;
                    j = 0;
                }
                if (vf6Var3 != null) {
                    int m3 = vf6Var3.m();
                    for (int i28 = 0; i28 < m3; i28++) {
                        long j5 = vf6Var3.j(i28);
                        ArrayList arrayList10 = (ArrayList) vf6Var3.n(i28);
                        if (arrayList10 != null) {
                            na7Var.getNotificationCenter().k(kk7.F1, arrayList10, Long.valueOf(j5));
                        }
                    }
                }
                if (vf6Var4 != null) {
                    int m4 = vf6Var4.m();
                    for (int i29 = 0; i29 < m4; i29++) {
                        long j6 = vf6Var4.j(i29);
                        ArrayList arrayList11 = (ArrayList) vf6Var4.n(i29);
                        if (arrayList11 != null) {
                            ArrayList arrayList12 = vf6Var5 != null ? (ArrayList) vf6Var5.f(j6) : null;
                            kk7 notificationCenter4 = na7Var.getNotificationCenter();
                            if (cf3.y(j6)) {
                                j2 = -j6;
                                break;
                            }
                            j2 = j;
                            Long valueOf4 = Long.valueOf(j2);
                            Object[] objArr4 = new Object[7];
                            objArr4[0] = arrayList11;
                            objArr4[1] = valueOf4;
                            objArr4[2] = Boolean.TRUE;
                            Boolean bool = Boolean.FALSE;
                            objArr4[i5] = bool;
                            objArr4[4] = bool;
                            objArr4[5] = 0;
                            objArr4[6] = arrayList12;
                            notificationCenter4.k(7, objArr4);
                        }
                    }
                }
                if (longSparseIntArray != null) {
                    int size6 = longSparseIntArray.size();
                    int i30 = 0;
                    while (true) {
                        LongSparseIntArray longSparseIntArray8 = longSparseIntArray;
                        if (i30 < size6) {
                            long keyAt4 = longSparseIntArray8.keyAt(i30);
                            int valueAt4 = longSparseIntArray8.valueAt(i30);
                            long j7 = -keyAt4;
                            na7Var.getNotificationCenter().k(8, Long.valueOf(j7), Integer.valueOf(valueAt4));
                            ArrayList arrayList13 = (ArrayList) vf6Var7.f(j7);
                            if (arrayList13 != null) {
                                int i31 = 0;
                                while (true) {
                                    if (i31 >= arrayList13.size()) {
                                        break;
                                    }
                                    k27 k27Var6 = (k27) arrayList13.get(i31);
                                    if (k27Var6 == null || k27Var6.e1() > valueAt4) {
                                        i31++;
                                    } else {
                                        k27Var6.Z = true;
                                    }
                                }
                            }
                            i30++;
                            longSparseIntArray = longSparseIntArray8;
                        } else {
                            im7 notificationsController = na7Var.getNotificationsController();
                            notificationsController.getClass();
                            c = 0;
                            i6 = 1;
                            im7.l0.c(new bm7(notificationsController, longSparseIntArray8, new ArrayList(0), 1 == true ? 1 : 0));
                        }
                    }
                } else {
                    c = 0;
                    i6 = 1;
                }
                if (i2 != 0) {
                    kk7 notificationCenter5 = na7Var.getNotificationCenter();
                    Object[] objArr5 = new Object[i6];
                    objArr5[c] = Integer.valueOf(i2);
                    notificationCenter5.k(2, objArr5);
                    break;
                }
                break;
            default:
                ((NotificationsSettingsActivity) gk7Var).C0((ArrayList) cloneable8, (ArrayList) cloneable7, (ArrayList) cloneable6, (ArrayList) cloneable5, (ArrayList) cloneable4, (ArrayList) cloneable3, (ArrayList) cloneable2, (ArrayList) cloneable, (hu2) obj);
                break;
        }
    }

    public /* synthetic */ l57(na7 na7Var, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, vf6 vf6Var, vf6 vf6Var2, vf6 vf6Var3, vf6 vf6Var4, vf6 vf6Var5, LongSparseIntArray longSparseIntArray3, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f = vf6Var;
        this.h = vf6Var2;
        this.n = vf6Var3;
        this.r = vf6Var4;
        this.s = vf6Var5;
        this.w = longSparseIntArray3;
    }
}
