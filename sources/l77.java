// default package

import android.content.SharedPreferences;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class l77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jm7 b;
    public final /* synthetic */ Cloneable c;
    public final /* synthetic */ Cloneable d;
    public final /* synthetic */ Cloneable e;
    public final /* synthetic */ Cloneable f;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Cloneable n;
    public final /* synthetic */ Cloneable r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Cloneable w;

    public /* synthetic */ l77(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, sv2 sv2Var) {
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
        this.s = sv2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x036e, code lost:
    
        if (sd2.T(r0.L0(java.lang.Long.valueOf(r5))) == false) goto L143;
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
        jm7 jm7Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new l77((oc7) jm7Var, (LongSparseIntArray) cloneable8, (LongSparseIntArray) cloneable7, (SparseIntArray) cloneable5, (vh6) cloneable4, (vh6) cloneable3, (vh6) cloneable2, (vh6) cloneable, (vh6) obj, (LongSparseIntArray) cloneable6, (byte) 1));
                break;
            case 1:
                oc7 oc7Var = (oc7) jm7Var;
                LongSparseIntArray longSparseIntArray3 = (LongSparseIntArray) cloneable8;
                LongSparseIntArray longSparseIntArray4 = (LongSparseIntArray) cloneable7;
                SparseIntArray sparseIntArray = (SparseIntArray) cloneable5;
                vh6 vh6Var = (vh6) cloneable4;
                vh6 vh6Var2 = (vh6) cloneable3;
                vh6 vh6Var3 = (vh6) cloneable2;
                vh6 vh6Var4 = (vh6) cloneable;
                vh6 vh6Var5 = (vh6) obj;
                LongSparseIntArray longSparseIntArray5 = (LongSparseIntArray) cloneable6;
                vh6 vh6Var6 = oc7Var.R;
                vh6 vh6Var7 = oc7Var.S;
                if (longSparseIntArray3 == null && longSparseIntArray4 == null) {
                    longSparseIntArray = longSparseIntArray5;
                    i = 0;
                    i2 = 0;
                } else {
                    i = 0;
                    oc7Var.getNotificationCenter().k(9, longSparseIntArray3, longSparseIntArray4);
                    if (longSparseIntArray3 != null) {
                        longSparseIntArray = longSparseIntArray5;
                        oc7Var.getNotificationsController().L(longSparseIntArray3, 0L, 0, 0, false);
                        SharedPreferences.Editor edit = oc7Var.W3.edit();
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
                                TLRPC.Dialog dialog = (TLRPC.Dialog) vh6Var6.f(keyAt);
                                int i12 = i9;
                                if (dialog != null && (i4 = dialog.top_message) > 0 && i4 <= valueAt && (arrayList2 = (ArrayList) vh6Var7.f(dialog.id)) != null) {
                                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                                        k47 k47Var = (k47) arrayList2.get(i13);
                                        if (k47Var != null && !k47Var.N3()) {
                                            k47Var.H5();
                                            i10 = 256;
                                        }
                                    }
                                }
                                if (keyAt != oc7Var.getUserConfig().e()) {
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
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) vh6Var6.f(keyAt2);
                            if (dialog2 != null && valueAt2 > dialog2.read_outbox_max_id) {
                                dialog2.read_outbox_max_id = valueAt2;
                                i14 = 256;
                            }
                            if (dialog2 != null && (i3 = dialog2.top_message) > 0 && i3 <= valueAt2 && (arrayList = (ArrayList) vh6Var7.f(dialog2.id)) != null) {
                                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                                    k47 k47Var2 = (k47) arrayList.get(i16);
                                    if (k47Var2 != null && k47Var2.N3()) {
                                        k47Var2.H5();
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
                        nm7 notificationCenter = oc7Var.getNotificationCenter();
                        Integer valueOf = Integer.valueOf(keyAt3);
                        Integer valueOf2 = Integer.valueOf(valueAt3);
                        SparseIntArray sparseIntArray2 = sparseIntArray;
                        int i19 = size3;
                        Object[] objArr = new Object[2];
                        objArr[i] = valueOf;
                        objArr[1] = valueOf2;
                        notificationCenter.k(37, objArr);
                        long E = pg3.E(keyAt3);
                        if (((TLRPC.Dialog) vh6Var6.f(E)) != null && (arrayList4 = (ArrayList) vh6Var7.f(E)) != null) {
                            for (int i20 = i; i20 < arrayList4.size(); i20++) {
                                k47 k47Var3 = (k47) arrayList4.get(i20);
                                if (k47Var3 != null && k47Var3.k.date <= valueAt3) {
                                    k47Var3.H5();
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
                if (vh6Var != null) {
                    int m = vh6Var.m();
                    for (int i21 = i; i21 < m; i21++) {
                        long j3 = vh6Var.j(i21);
                        ArrayList arrayList5 = (ArrayList) vh6Var.n(i21);
                        nm7 notificationCenter2 = oc7Var.getNotificationCenter();
                        Object[] objArr2 = new Object[2];
                        objArr2[i] = Long.valueOf(j3);
                        objArr2[1] = arrayList5;
                        notificationCenter2.k(66, objArr2);
                    }
                }
                int i22 = 3;
                int i23 = 7;
                if (vh6Var2 != null) {
                    int m2 = vh6Var2.m();
                    int i24 = i;
                    while (i24 < m2) {
                        long j4 = vh6Var2.j(i24);
                        ArrayList arrayList6 = (ArrayList) vh6Var2.n(i24);
                        if (arrayList6 != null) {
                            nm7 notificationCenter3 = oc7Var.getNotificationCenter();
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
                                    k47 k47Var4 = (k47) oc7Var.V.get(((Integer) arrayList8.get(i25)).intValue());
                                    if (k47Var4 != null) {
                                        if (e21.a) {
                                            i8 = i22;
                                            fc4.b("mark messages " + k47Var4.e1() + " deleted");
                                        } else {
                                            i8 = i22;
                                        }
                                        k47Var4.Z = z2;
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
                                ArrayList arrayList9 = (ArrayList) vh6Var7.f(j4);
                                if (arrayList9 != null) {
                                    int i26 = i;
                                    while (i26 < arrayList9.size()) {
                                        k47 k47Var5 = (k47) arrayList9.get(i26);
                                        if (k47Var5 != null) {
                                            int size5 = arrayList7.size();
                                            int i27 = i;
                                            while (i27 < size5) {
                                                arrayList3 = arrayList9;
                                                if (k47Var5.e1() == ((Integer) arrayList7.get(i27)).intValue()) {
                                                    k47Var5.Z = true;
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
                    oc7Var.getNotificationsController().M(vh6Var2, i);
                } else {
                    i5 = 3;
                    j = 0;
                }
                if (vh6Var3 != null) {
                    int m3 = vh6Var3.m();
                    for (int i28 = 0; i28 < m3; i28++) {
                        long j5 = vh6Var3.j(i28);
                        ArrayList arrayList10 = (ArrayList) vh6Var3.n(i28);
                        if (arrayList10 != null) {
                            oc7Var.getNotificationCenter().k(nm7.G1, arrayList10, Long.valueOf(j5));
                        }
                    }
                }
                if (vh6Var4 != null) {
                    int m4 = vh6Var4.m();
                    for (int i29 = 0; i29 < m4; i29++) {
                        long j6 = vh6Var4.j(i29);
                        ArrayList arrayList11 = (ArrayList) vh6Var4.n(i29);
                        if (arrayList11 != null) {
                            ArrayList arrayList12 = vh6Var5 != null ? (ArrayList) vh6Var5.f(j6) : null;
                            nm7 notificationCenter4 = oc7Var.getNotificationCenter();
                            if (pg3.y(j6)) {
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
                            oc7Var.getNotificationCenter().k(8, Long.valueOf(j7), Integer.valueOf(valueAt4));
                            ArrayList arrayList13 = (ArrayList) vh6Var7.f(j7);
                            if (arrayList13 != null) {
                                int i31 = 0;
                                while (true) {
                                    if (i31 >= arrayList13.size()) {
                                        break;
                                    }
                                    k47 k47Var6 = (k47) arrayList13.get(i31);
                                    if (k47Var6 == null || k47Var6.e1() > valueAt4) {
                                        i31++;
                                    } else {
                                        k47Var6.Z = true;
                                    }
                                }
                            }
                            i30++;
                            longSparseIntArray = longSparseIntArray8;
                        } else {
                            lo7 notificationsController = oc7Var.getNotificationsController();
                            notificationsController.getClass();
                            c = 0;
                            i6 = 1;
                            lo7.l0.c(new eo7(notificationsController, longSparseIntArray8, new ArrayList(0), 1 == true ? 1 : 0));
                        }
                    }
                } else {
                    c = 0;
                    i6 = 1;
                }
                if (i2 != 0) {
                    nm7 notificationCenter5 = oc7Var.getNotificationCenter();
                    Object[] objArr5 = new Object[i6];
                    objArr5[c] = Integer.valueOf(i2);
                    notificationCenter5.k(2, objArr5);
                    break;
                }
                break;
            default:
                ((NotificationsSettingsActivity) jm7Var).D0((ArrayList) cloneable8, (ArrayList) cloneable7, (ArrayList) cloneable6, (ArrayList) cloneable5, (ArrayList) cloneable4, (ArrayList) cloneable3, (ArrayList) cloneable2, (ArrayList) cloneable, (sv2) obj);
                break;
        }
    }

    public /* synthetic */ l77(oc7 oc7Var, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, vh6 vh6Var, vh6 vh6Var2, vh6 vh6Var3, vh6 vh6Var4, vh6 vh6Var5, LongSparseIntArray longSparseIntArray3, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f = vh6Var;
        this.h = vh6Var2;
        this.n = vh6Var3;
        this.r = vh6Var4;
        this.s = vh6Var5;
        this.w = longSparseIntArray3;
    }
}
