package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class nk implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;
    public final /* synthetic */ Cloneable c;
    public final /* synthetic */ Cloneable d;
    public final /* synthetic */ Cloneable e;
    public final /* synthetic */ Cloneable f;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Cloneable n;
    public final /* synthetic */ Cloneable r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Cloneable w;

    public /* synthetic */ nk(vp vpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i10) {
        this.a = i10;
        this.b = vpVar;
        this.c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f = hVar;
        this.h = hVar2;
        this.n = hVar3;
        this.r = hVar4;
        this.s = hVar5;
        this.w = longSparseIntArray3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x037e, code lost:
    
        if (org.telegram.messenger.w3.T(r11.L0(java.lang.Long.valueOf(r4))) != false) goto L147;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        a0.h hVar;
        a0.h hVar2;
        int i10;
        int i11;
        int i12;
        ArrayList arrayList;
        int i13;
        ArrayList arrayList2;
        int i14;
        long j10;
        char c10;
        a0.h hVar3;
        long j11;
        int i15;
        int i16;
        int i17;
        ArrayList arrayList3;
        int i18 = this.a;
        Object obj = this.s;
        Cloneable cloneable = this.r;
        Cloneable cloneable2 = this.n;
        Cloneable cloneable3 = this.h;
        Cloneable cloneable4 = this.f;
        Cloneable cloneable5 = this.e;
        Cloneable cloneable6 = this.w;
        Cloneable cloneable7 = this.d;
        Cloneable cloneable8 = this.c;
        us usVar = this.b;
        switch (i18) {
            case 0:
                i0.g3(new nk((vp) usVar, (LongSparseIntArray) cloneable8, (LongSparseIntArray) cloneable7, (SparseIntArray) cloneable5, (a0.h) cloneable4, (a0.h) cloneable3, (a0.h) cloneable2, (a0.h) cloneable, (a0.h) obj, (LongSparseIntArray) cloneable6, 1));
                break;
            case 1:
                vp vpVar = (vp) usVar;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) cloneable8;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) cloneable7;
                SparseIntArray sparseIntArray = (SparseIntArray) cloneable5;
                a0.h hVar4 = (a0.h) cloneable4;
                a0.h hVar5 = (a0.h) cloneable3;
                a0.h hVar6 = (a0.h) cloneable2;
                a0.h hVar7 = (a0.h) cloneable;
                a0.h hVar8 = (a0.h) obj;
                LongSparseIntArray longSparseIntArray3 = (LongSparseIntArray) cloneable6;
                a0.h hVar9 = vpVar.Q;
                a0.h hVar10 = vpVar.R;
                if (longSparseIntArray == null && longSparseIntArray2 == null) {
                    hVar = hVar8;
                    hVar2 = hVar7;
                    i11 = 0;
                    i10 = 0;
                } else {
                    vpVar.getNotificationCenter().k(9, longSparseIntArray, longSparseIntArray2);
                    if (longSparseIntArray != null) {
                        i10 = 0;
                        vpVar.getNotificationsController().L(longSparseIntArray, 0L, 0, 0, false);
                        SharedPreferences.Editor edit = vpVar.e7.edit();
                        int size = longSparseIntArray.size();
                        int i19 = 0;
                        int i20 = 0;
                        while (i19 < size) {
                            a0.h hVar11 = hVar8;
                            a0.h hVar12 = hVar7;
                            long keyAt = longSparseIntArray.keyAt(i19);
                            int valueAt = longSparseIntArray.valueAt(i19);
                            LongSparseIntArray longSparseIntArray4 = longSparseIntArray;
                            TLRPC.Dialog dialog = (TLRPC.Dialog) hVar9.f(keyAt);
                            int i21 = size;
                            if (dialog != null && (i13 = dialog.top_message) > 0 && i13 <= valueAt && (arrayList2 = (ArrayList) hVar10.f(dialog.id)) != null) {
                                for (int i22 = 0; i22 < arrayList2.size(); i22++) {
                                    jj jjVar = (jj) arrayList2.get(i22);
                                    if (jjVar != null && !jjVar.N3()) {
                                        jjVar.H5();
                                        i20 = 256;
                                    }
                                }
                            }
                            if (keyAt != vpVar.getUserConfig().e()) {
                                edit.remove("diditem" + keyAt);
                                edit.remove("diditemo" + keyAt);
                            }
                            i19++;
                            hVar7 = hVar12;
                            hVar8 = hVar11;
                            size = i21;
                            longSparseIntArray = longSparseIntArray4;
                        }
                        hVar = hVar8;
                        hVar2 = hVar7;
                        edit.commit();
                        i11 = i20;
                    } else {
                        hVar = hVar8;
                        hVar2 = hVar7;
                        i10 = 0;
                        i11 = 0;
                    }
                    if (longSparseIntArray2 != null) {
                        int size2 = longSparseIntArray2.size();
                        int i23 = i11;
                        for (int i24 = i10; i24 < size2; i24++) {
                            long keyAt2 = longSparseIntArray2.keyAt(i24);
                            int valueAt2 = longSparseIntArray2.valueAt(i24);
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar9.f(keyAt2);
                            if (dialog2 != null && valueAt2 > dialog2.read_outbox_max_id) {
                                dialog2.read_outbox_max_id = valueAt2;
                                i23 = 256;
                            }
                            if (dialog2 != null && (i12 = dialog2.top_message) > 0 && i12 <= valueAt2 && (arrayList = (ArrayList) hVar10.f(dialog2.id)) != null) {
                                for (int i25 = i10; i25 < arrayList.size(); i25++) {
                                    jj jjVar2 = (jj) arrayList.get(i25);
                                    if (jjVar2 != null && jjVar2.N3()) {
                                        jjVar2.H5();
                                        i23 = 256;
                                    }
                                }
                            }
                        }
                        i11 = i23;
                    }
                }
                if (sparseIntArray != null) {
                    int size3 = sparseIntArray.size();
                    int i26 = i11;
                    int i27 = i10;
                    while (i27 < size3) {
                        int keyAt3 = sparseIntArray.keyAt(i27);
                        int valueAt3 = sparseIntArray.valueAt(i27);
                        zs notificationCenter = vpVar.getNotificationCenter();
                        Integer valueOf = Integer.valueOf(keyAt3);
                        Integer valueOf2 = Integer.valueOf(valueAt3);
                        int i28 = size3;
                        int i29 = i26;
                        Object[] objArr = new Object[2];
                        objArr[i10] = valueOf;
                        objArr[1] = valueOf2;
                        notificationCenter.k(36, objArr);
                        long F = o5.F(keyAt3);
                        if (((TLRPC.Dialog) hVar9.f(F)) != null && (arrayList3 = (ArrayList) hVar10.f(F)) != null) {
                            for (int i30 = i10; i30 < arrayList3.size(); i30++) {
                                jj jjVar3 = (jj) arrayList3.get(i30);
                                if (jjVar3 != null && jjVar3.k.date <= valueAt3) {
                                    jjVar3.H5();
                                    i29 = 256;
                                }
                            }
                        }
                        i26 = i29;
                        i27++;
                        size3 = i28;
                    }
                    i11 = i26;
                }
                int i31 = 1;
                if (hVar4 != null) {
                    int m10 = hVar4.m();
                    for (int i32 = i10; i32 < m10; i32++) {
                        long j12 = hVar4.j(i32);
                        ArrayList arrayList4 = (ArrayList) hVar4.n(i32);
                        zs notificationCenter2 = vpVar.getNotificationCenter();
                        Long valueOf3 = Long.valueOf(j12);
                        Object[] objArr2 = new Object[2];
                        objArr2[i10] = valueOf3;
                        objArr2[1] = arrayList4;
                        notificationCenter2.k(65, objArr2);
                    }
                }
                int i33 = 3;
                if (hVar5 != null) {
                    int m11 = hVar5.m();
                    int i34 = i10;
                    while (i34 < m11) {
                        long j13 = hVar5.j(i34);
                        ArrayList arrayList5 = (ArrayList) hVar5.n(i34);
                        if (arrayList5 == null) {
                            i17 = i33;
                            i15 = m11;
                        } else {
                            zs notificationCenter3 = vpVar.getNotificationCenter();
                            i15 = m11;
                            Long valueOf4 = Long.valueOf(-j13);
                            Object[] objArr3 = new Object[i33];
                            objArr3[i10] = arrayList5;
                            objArr3[1] = valueOf4;
                            objArr3[2] = Boolean.FALSE;
                            notificationCenter3.k(7, objArr3);
                            if (j13 == 0) {
                                int size4 = arrayList5.size();
                                for (int i35 = i10; i35 < size4; i35++) {
                                    jj jjVar4 = (jj) vpVar.U.get(((Integer) arrayList5.get(i35)).intValue());
                                    if (jjVar4 != null) {
                                        if (v2.a) {
                                            f8.b("mark messages " + jjVar4.f1() + " deleted");
                                        }
                                        jjVar4.Z = true;
                                    }
                                }
                            } else {
                                ArrayList arrayList6 = (ArrayList) hVar10.f(j13);
                                if (arrayList6 != null) {
                                    int i36 = i10;
                                    while (i36 < arrayList6.size()) {
                                        jj jjVar5 = (jj) arrayList6.get(i36);
                                        if (jjVar5 != null) {
                                            int size5 = arrayList5.size();
                                            int i37 = i10;
                                            while (i37 < size5) {
                                                i16 = i33;
                                                if (jjVar5.f1() == ((Integer) arrayList5.get(i37)).intValue()) {
                                                    jjVar5.Z = true;
                                                    i36++;
                                                    i33 = i16;
                                                } else {
                                                    i37++;
                                                    i33 = i16;
                                                }
                                            }
                                        }
                                        i16 = i33;
                                        i36++;
                                        i33 = i16;
                                    }
                                }
                            }
                            i17 = i33;
                        }
                        i34++;
                        m11 = i15;
                        i33 = i17;
                    }
                    i14 = i33;
                    j10 = 0;
                    vpVar.getNotificationsController().M(hVar5, i10);
                } else {
                    i14 = 3;
                    j10 = 0;
                }
                if (hVar6 != null) {
                    int m12 = hVar6.m();
                    for (int i38 = 0; i38 < m12; i38++) {
                        long j14 = hVar6.j(i38);
                        ArrayList arrayList7 = (ArrayList) hVar6.n(i38);
                        if (arrayList7 != null) {
                            vpVar.getNotificationCenter().k(zs.G1, arrayList7, Long.valueOf(j14));
                        }
                    }
                }
                if (hVar2 != null) {
                    int m13 = hVar2.m();
                    int i39 = 0;
                    while (i39 < m13) {
                        a0.h hVar13 = hVar2;
                        long j15 = hVar13.j(i39);
                        ArrayList arrayList8 = (ArrayList) hVar13.n(i39);
                        if (arrayList8 == null) {
                            hVar3 = hVar;
                        } else {
                            hVar3 = hVar;
                            ArrayList arrayList9 = hVar != null ? (ArrayList) hVar3.f(j15) : null;
                            zs notificationCenter4 = vpVar.getNotificationCenter();
                            if (o5.z(j15)) {
                                j11 = -j15;
                                break;
                            }
                            j11 = j10;
                            Long valueOf5 = Long.valueOf(j11);
                            Object[] objArr4 = new Object[7];
                            objArr4[0] = arrayList8;
                            objArr4[1] = valueOf5;
                            objArr4[2] = Boolean.TRUE;
                            Boolean bool = Boolean.FALSE;
                            objArr4[i14] = bool;
                            objArr4[4] = bool;
                            objArr4[5] = 0;
                            objArr4[6] = arrayList9;
                            notificationCenter4.k(7, objArr4);
                        }
                        i39++;
                        hVar2 = hVar13;
                        hVar = hVar3;
                    }
                }
                if (longSparseIntArray3 != null) {
                    int size6 = longSparseIntArray3.size();
                    for (int i40 = 0; i40 < size6; i40++) {
                        long keyAt4 = longSparseIntArray3.keyAt(i40);
                        int valueAt4 = longSparseIntArray3.valueAt(i40);
                        long j16 = -keyAt4;
                        vpVar.getNotificationCenter().k(8, Long.valueOf(j16), Integer.valueOf(valueAt4));
                        ArrayList arrayList10 = (ArrayList) hVar10.f(j16);
                        if (arrayList10 != null) {
                            int i41 = 0;
                            while (true) {
                                if (i41 >= arrayList10.size()) {
                                    break;
                                }
                                jj jjVar6 = (jj) arrayList10.get(i41);
                                if (jjVar6 == null || jjVar6.f1() > valueAt4) {
                                    i41++;
                                } else {
                                    jjVar6.Z = true;
                                }
                            }
                        }
                    }
                    ot notificationsController = vpVar.getNotificationsController();
                    notificationsController.getClass();
                    c10 = 0;
                    ot.k0.c(new ft(notificationsController, longSparseIntArray3, new ArrayList(0), i31));
                } else {
                    c10 = 0;
                }
                if (i11 != 0) {
                    zs notificationCenter5 = vpVar.getNotificationCenter();
                    Object[] objArr5 = new Object[1];
                    objArr5[c10] = Integer.valueOf(i11);
                    notificationCenter5.k(2, objArr5);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity.Y((NotificationsSettingsActivity) usVar, (ArrayList) cloneable8, (ArrayList) cloneable7, (ArrayList) cloneable6, (ArrayList) cloneable5, (ArrayList) cloneable4, (ArrayList) cloneable3, (ArrayList) cloneable2, (ArrayList) cloneable, (Runnable) obj);
                break;
        }
    }

    public /* synthetic */ nk(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
        this.a = 2;
        this.b = notificationsSettingsActivity;
        this.c = arrayList;
        this.d = arrayList2;
        this.w = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
        this.h = arrayList6;
        this.n = arrayList7;
        this.r = arrayList8;
        this.s = runnable;
    }
}
