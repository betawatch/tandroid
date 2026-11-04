package org.telegram.messenger;

import android.content.SharedPreferences;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.NotificationsSettingsActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class vj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cs b;
    public final /* synthetic */ Cloneable c;
    public final /* synthetic */ Cloneable d;
    public final /* synthetic */ Cloneable e;
    public final /* synthetic */ Cloneable f;
    public final /* synthetic */ Cloneable h;
    public final /* synthetic */ Cloneable n;
    public final /* synthetic */ Cloneable r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Cloneable w;

    public /* synthetic */ vj(hp hpVar, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, a0.h hVar, a0.h hVar2, a0.h hVar3, a0.h hVar4, a0.h hVar5, LongSparseIntArray longSparseIntArray3, int i3) {
        this.a = i3;
        this.b = hpVar;
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
    
        if (org.telegram.messenger.t3.T(r11.M0(java.lang.Long.valueOf(r4))) != false) goto L147;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        a0.h hVar;
        a0.h hVar2;
        int i3;
        int i10;
        int i11;
        ArrayList arrayList;
        int i12;
        ArrayList arrayList2;
        int i13;
        long j10;
        char c2;
        a0.h hVar3;
        long j11;
        int i14;
        int i15;
        int i16;
        ArrayList arrayList3;
        int i17 = this.a;
        Object obj = this.s;
        Cloneable cloneable = this.r;
        Cloneable cloneable2 = this.n;
        Cloneable cloneable3 = this.h;
        Cloneable cloneable4 = this.f;
        Cloneable cloneable5 = this.e;
        Cloneable cloneable6 = this.w;
        Cloneable cloneable7 = this.d;
        Cloneable cloneable8 = this.c;
        cs csVar = this.b;
        switch (i17) {
            case 0:
                g0.h3(new vj((hp) csVar, (LongSparseIntArray) cloneable8, (LongSparseIntArray) cloneable7, (SparseIntArray) cloneable5, (a0.h) cloneable4, (a0.h) cloneable3, (a0.h) cloneable2, (a0.h) cloneable, (a0.h) obj, (LongSparseIntArray) cloneable6, 1));
                break;
            case 1:
                hp hpVar = (hp) csVar;
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) cloneable8;
                LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) cloneable7;
                SparseIntArray sparseIntArray = (SparseIntArray) cloneable5;
                a0.h hVar4 = (a0.h) cloneable4;
                a0.h hVar5 = (a0.h) cloneable3;
                a0.h hVar6 = (a0.h) cloneable2;
                a0.h hVar7 = (a0.h) cloneable;
                a0.h hVar8 = (a0.h) obj;
                LongSparseIntArray longSparseIntArray3 = (LongSparseIntArray) cloneable6;
                a0.h hVar9 = hpVar.R;
                a0.h hVar10 = hpVar.S;
                if (longSparseIntArray == null && longSparseIntArray2 == null) {
                    hVar = hVar8;
                    hVar2 = hVar7;
                    i10 = 0;
                    i3 = 0;
                } else {
                    hpVar.getNotificationCenter().k(9, longSparseIntArray, longSparseIntArray2);
                    if (longSparseIntArray != null) {
                        i3 = 0;
                        hpVar.getNotificationsController().L(longSparseIntArray, 0L, 0, 0, false);
                        SharedPreferences.Editor edit = hpVar.d7.edit();
                        int size = longSparseIntArray.size();
                        int i18 = 0;
                        int i19 = 0;
                        while (i18 < size) {
                            a0.h hVar11 = hVar8;
                            a0.h hVar12 = hVar7;
                            long keyAt = longSparseIntArray.keyAt(i18);
                            int valueAt = longSparseIntArray.valueAt(i18);
                            LongSparseIntArray longSparseIntArray4 = longSparseIntArray;
                            TLRPC.Dialog dialog = (TLRPC.Dialog) hVar9.f(keyAt);
                            int i20 = size;
                            if (dialog != null && (i12 = dialog.top_message) > 0 && i12 <= valueAt && (arrayList2 = (ArrayList) hVar10.f(dialog.id)) != null) {
                                for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                                    zi ziVar = (zi) arrayList2.get(i21);
                                    if (ziVar != null && !ziVar.O3()) {
                                        ziVar.J5();
                                        i19 = 256;
                                    }
                                }
                            }
                            if (keyAt != hpVar.getUserConfig().e()) {
                                edit.remove("diditem" + keyAt);
                                edit.remove("diditemo" + keyAt);
                            }
                            i18++;
                            hVar7 = hVar12;
                            hVar8 = hVar11;
                            size = i20;
                            longSparseIntArray = longSparseIntArray4;
                        }
                        hVar = hVar8;
                        hVar2 = hVar7;
                        edit.commit();
                        i10 = i19;
                    } else {
                        hVar = hVar8;
                        hVar2 = hVar7;
                        i3 = 0;
                        i10 = 0;
                    }
                    if (longSparseIntArray2 != null) {
                        int size2 = longSparseIntArray2.size();
                        int i22 = i10;
                        for (int i23 = i3; i23 < size2; i23++) {
                            long keyAt2 = longSparseIntArray2.keyAt(i23);
                            int valueAt2 = longSparseIntArray2.valueAt(i23);
                            TLRPC.Dialog dialog2 = (TLRPC.Dialog) hVar9.f(keyAt2);
                            if (dialog2 != null && valueAt2 > dialog2.read_outbox_max_id) {
                                dialog2.read_outbox_max_id = valueAt2;
                                i22 = 256;
                            }
                            if (dialog2 != null && (i11 = dialog2.top_message) > 0 && i11 <= valueAt2 && (arrayList = (ArrayList) hVar10.f(dialog2.id)) != null) {
                                for (int i24 = i3; i24 < arrayList.size(); i24++) {
                                    zi ziVar2 = (zi) arrayList.get(i24);
                                    if (ziVar2 != null && ziVar2.O3()) {
                                        ziVar2.J5();
                                        i22 = 256;
                                    }
                                }
                            }
                        }
                        i10 = i22;
                    }
                }
                if (sparseIntArray != null) {
                    int size3 = sparseIntArray.size();
                    int i25 = i10;
                    int i26 = i3;
                    while (i26 < size3) {
                        int keyAt3 = sparseIntArray.keyAt(i26);
                        int valueAt3 = sparseIntArray.valueAt(i26);
                        hs notificationCenter = hpVar.getNotificationCenter();
                        Integer valueOf = Integer.valueOf(keyAt3);
                        Integer valueOf2 = Integer.valueOf(valueAt3);
                        int i27 = size3;
                        int i28 = i25;
                        Object[] objArr = new Object[2];
                        objArr[i3] = valueOf;
                        objArr[1] = valueOf2;
                        notificationCenter.k(36, objArr);
                        long F = m5.F(keyAt3);
                        if (((TLRPC.Dialog) hVar9.f(F)) != null && (arrayList3 = (ArrayList) hVar10.f(F)) != null) {
                            for (int i29 = i3; i29 < arrayList3.size(); i29++) {
                                zi ziVar3 = (zi) arrayList3.get(i29);
                                if (ziVar3 != null && ziVar3.k.date <= valueAt3) {
                                    ziVar3.J5();
                                    i28 = 256;
                                }
                            }
                        }
                        i25 = i28;
                        i26++;
                        size3 = i27;
                    }
                    i10 = i25;
                }
                int i30 = 1;
                if (hVar4 != null) {
                    int m10 = hVar4.m();
                    for (int i31 = i3; i31 < m10; i31++) {
                        long j12 = hVar4.j(i31);
                        ArrayList arrayList4 = (ArrayList) hVar4.n(i31);
                        hs notificationCenter2 = hpVar.getNotificationCenter();
                        Long valueOf3 = Long.valueOf(j12);
                        Object[] objArr2 = new Object[2];
                        objArr2[i3] = valueOf3;
                        objArr2[1] = arrayList4;
                        notificationCenter2.k(65, objArr2);
                    }
                }
                int i32 = 3;
                if (hVar5 != null) {
                    int m11 = hVar5.m();
                    int i33 = i3;
                    while (i33 < m11) {
                        long j13 = hVar5.j(i33);
                        ArrayList arrayList5 = (ArrayList) hVar5.n(i33);
                        if (arrayList5 == null) {
                            i16 = i32;
                            i14 = m11;
                        } else {
                            hs notificationCenter3 = hpVar.getNotificationCenter();
                            i14 = m11;
                            Long valueOf4 = Long.valueOf(-j13);
                            Object[] objArr3 = new Object[i32];
                            objArr3[i3] = arrayList5;
                            objArr3[1] = valueOf4;
                            objArr3[2] = Boolean.FALSE;
                            notificationCenter3.k(7, objArr3);
                            if (j13 == 0) {
                                int size4 = arrayList5.size();
                                for (int i34 = i3; i34 < size4; i34++) {
                                    zi ziVar4 = (zi) hpVar.V.get(((Integer) arrayList5.get(i34)).intValue());
                                    if (ziVar4 != null) {
                                        if (r2.a) {
                                            a8.b("mark messages " + ziVar4.f1() + " deleted");
                                        }
                                        ziVar4.Z = true;
                                    }
                                }
                            } else {
                                ArrayList arrayList6 = (ArrayList) hVar10.f(j13);
                                if (arrayList6 != null) {
                                    int i35 = i3;
                                    while (i35 < arrayList6.size()) {
                                        zi ziVar5 = (zi) arrayList6.get(i35);
                                        if (ziVar5 != null) {
                                            int size5 = arrayList5.size();
                                            int i36 = i3;
                                            while (i36 < size5) {
                                                i15 = i32;
                                                if (ziVar5.f1() == ((Integer) arrayList5.get(i36)).intValue()) {
                                                    ziVar5.Z = true;
                                                    i35++;
                                                    i32 = i15;
                                                } else {
                                                    i36++;
                                                    i32 = i15;
                                                }
                                            }
                                        }
                                        i15 = i32;
                                        i35++;
                                        i32 = i15;
                                    }
                                }
                            }
                            i16 = i32;
                        }
                        i33++;
                        m11 = i14;
                        i32 = i16;
                    }
                    i13 = i32;
                    j10 = 0;
                    hpVar.getNotificationsController().M(hVar5, i3);
                } else {
                    i13 = 3;
                    j10 = 0;
                }
                if (hVar6 != null) {
                    int m12 = hVar6.m();
                    for (int i37 = 0; i37 < m12; i37++) {
                        long j14 = hVar6.j(i37);
                        ArrayList arrayList7 = (ArrayList) hVar6.n(i37);
                        if (arrayList7 != null) {
                            hpVar.getNotificationCenter().k(hs.G1, arrayList7, Long.valueOf(j14));
                        }
                    }
                }
                if (hVar2 != null) {
                    int m13 = hVar2.m();
                    int i38 = 0;
                    while (i38 < m13) {
                        a0.h hVar13 = hVar2;
                        long j15 = hVar13.j(i38);
                        ArrayList arrayList8 = (ArrayList) hVar13.n(i38);
                        if (arrayList8 == null) {
                            hVar3 = hVar;
                        } else {
                            hVar3 = hVar;
                            ArrayList arrayList9 = hVar != null ? (ArrayList) hVar3.f(j15) : null;
                            hs notificationCenter4 = hpVar.getNotificationCenter();
                            if (m5.z(j15)) {
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
                            objArr4[i13] = bool;
                            objArr4[4] = bool;
                            objArr4[5] = 0;
                            objArr4[6] = arrayList9;
                            notificationCenter4.k(7, objArr4);
                        }
                        i38++;
                        hVar2 = hVar13;
                        hVar = hVar3;
                    }
                }
                if (longSparseIntArray3 != null) {
                    int size6 = longSparseIntArray3.size();
                    for (int i39 = 0; i39 < size6; i39++) {
                        long keyAt4 = longSparseIntArray3.keyAt(i39);
                        int valueAt4 = longSparseIntArray3.valueAt(i39);
                        long j16 = -keyAt4;
                        hpVar.getNotificationCenter().k(8, Long.valueOf(j16), Integer.valueOf(valueAt4));
                        ArrayList arrayList10 = (ArrayList) hVar10.f(j16);
                        if (arrayList10 != null) {
                            int i40 = 0;
                            while (true) {
                                if (i40 >= arrayList10.size()) {
                                    break;
                                }
                                zi ziVar6 = (zi) arrayList10.get(i40);
                                if (ziVar6 == null || ziVar6.f1() > valueAt4) {
                                    i40++;
                                } else {
                                    ziVar6.Z = true;
                                }
                            }
                        }
                    }
                    us notificationsController = hpVar.getNotificationsController();
                    notificationsController.getClass();
                    c2 = 0;
                    us.l0.c(new ns(notificationsController, longSparseIntArray3, new ArrayList(0), i30));
                } else {
                    c2 = 0;
                }
                if (i10 != 0) {
                    hs notificationCenter5 = hpVar.getNotificationCenter();
                    Object[] objArr5 = new Object[1];
                    objArr5[c2] = Integer.valueOf(i10);
                    notificationCenter5.k(2, objArr5);
                    break;
                }
                break;
            default:
                NotificationsSettingsActivity.Z((NotificationsSettingsActivity) csVar, (ArrayList) cloneable8, (ArrayList) cloneable7, (ArrayList) cloneable6, (ArrayList) cloneable5, (ArrayList) cloneable4, (ArrayList) cloneable3, (ArrayList) cloneable2, (ArrayList) cloneable, (Runnable) obj);
                break;
        }
    }

    public /* synthetic */ vj(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, Runnable runnable) {
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
