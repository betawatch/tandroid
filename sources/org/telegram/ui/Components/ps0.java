package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ps0 implements org.telegram.messenger.ls {
    public boolean D;
    public final ab.b0 E;
    public boolean f;
    public boolean h;
    public final ms0[] n;
    public final long r;
    public final long s;
    public long w;
    public final org.telegram.ui.ActionBar.f2 x;
    public int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList y = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public ps0(org.telegram.ui.ActionBar.f2 f2Var) {
        TLRPC.ChatFull N0;
        this.x = f2Var;
        final int i7 = 0;
        final int i10 = 1;
        if (f2Var instanceof kg) {
            kg kgVar = (kg) f2Var;
            long a10 = kgVar.a();
            this.r = a10;
            this.w = kgVar.L();
            this.s = kgVar.b();
            if (a10 != f2Var.getUserConfig().e()) {
                f2Var.getMessagesController().G1().f(a10, new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.os0
                    public final /* synthetic */ ps0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.c20
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i7) {
                            case 0:
                                ps0 ps0Var = this.b;
                                ArrayList arrayList = ps0Var.y;
                                boolean booleanValue = bool.booleanValue();
                                ps0Var.f = booleanValue;
                                ps0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((qs0) arrayList.get(i11)).Q();
                                    }
                                    break;
                                }
                                break;
                            default:
                                ps0 ps0Var2 = this.b;
                                ArrayList arrayList2 = ps0Var2.y;
                                boolean booleanValue2 = bool.booleanValue();
                                ps0Var2.f = booleanValue2;
                                ps0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((qs0) arrayList2.get(i12)).Q();
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        } else if (f2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) f2Var;
            if (profileActivity.g1) {
                this.r = profileActivity.getUserConfig().e();
                this.s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.r = a11;
                this.s = profileActivity.f1;
                TLRPC.ChatFull chatFull = profileActivity.t2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != f2Var.getUserConfig().e()) {
                    f2Var.getMessagesController().G1().f(a11, new org.telegram.messenger.c20(this) { // from class: org.telegram.ui.Components.os0
                        public final /* synthetic */ ps0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.messenger.c20
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (i10) {
                                case 0:
                                    ps0 ps0Var = this.b;
                                    ArrayList arrayList = ps0Var.y;
                                    boolean booleanValue = bool.booleanValue();
                                    ps0Var.f = booleanValue;
                                    ps0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((qs0) arrayList.get(i11)).Q();
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    ps0 ps0Var2 = this.b;
                                    ArrayList arrayList2 = ps0Var2.y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    ps0Var2.f = booleanValue2;
                                    ps0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((qs0) arrayList2.get(i12)).Q();
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        } else if (f2Var instanceof u80) {
            this.r = ((u80) f2Var).e;
        } else if (f2Var instanceof org.telegram.ui.ww) {
            this.r = f2Var.getUserConfig().e();
        }
        if (this.w == 0 && org.telegram.messenger.m5.z(this.r) && (N0 = f2Var.getMessagesController().N0(-this.r)) != null) {
            long j3 = N0.migrated_from_chat_id;
            if (j3 != 0) {
                this.w = -j3;
            }
        }
        this.n = new ms0[9];
        int i11 = 0;
        while (true) {
            ms0[] ms0VarArr = this.n;
            if (i11 >= ms0VarArr.length) {
                break;
            }
            ms0VarArr[i11] = new ms0();
            this.n[i11].j[0] = org.telegram.messenger.m5.C(this.r) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
            this.n[i11].j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.f2 f2Var2 = this.x;
        if (f2Var2 == null) {
            this.E = null;
            return;
        }
        org.telegram.messenger.qs notificationCenter = f2Var2.getNotificationCenter();
        notificationCenter.getClass();
        ab.b0 b0Var = new ab.b0(notificationCenter, this);
        b0Var.c(org.telegram.messenger.qs.X);
        b0Var.c(org.telegram.messenger.qs.W);
        b0Var.c(1);
        b0Var.c(org.telegram.messenger.qs.K);
        b0Var.c(org.telegram.messenger.qs.V);
        b0Var.c(org.telegram.messenger.qs.w);
        b0Var.c(org.telegram.messenger.qs.m0);
        b0Var.c(org.telegram.messenger.qs.T);
        b0Var.c(org.telegram.messenger.qs.Y1);
        b0Var.c(org.telegram.messenger.qs.x5);
        b0Var.c(org.telegram.messenger.qs.g3);
        this.E = b0Var;
    }

    public final void a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.x;
        if (f2Var == null) {
            return;
        }
        org.telegram.messenger.ui mediaDataController = f2Var.getMediaDataController();
        long j3 = this.s;
        mediaDataController.e0(this.r, f2Var.getClassGuid(), j3);
        if (this.w != 0) {
            f2Var.getMediaDataController().e0(this.w, f2Var.getClassGuid(), this.s);
        }
    }

    public final void b(org.telegram.ui.ActionBar.f2 f2Var) {
        if (f2Var != this.x) {
            return;
        }
        this.y.clear();
        ab.b0 b0Var = this.E;
        if (b0Var != null) {
            b0Var.b();
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.f2 f2Var = this.x;
        if (f2Var == null || chatFull == null) {
            return;
        }
        long j3 = chatFull.migrated_from_chat_id;
        if (j3 == 0 || this.w != 0) {
            return;
        }
        this.w = -j3;
        f2Var.getMediaDataController().e0(this.w, f2Var.getClassGuid(), this.s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    @Override // org.telegram.messenger.ls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z9;
        int i11;
        int f02;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z10 = true;
        boolean z11 = false;
        int i16 = 0;
        if (i7 == org.telegram.messenger.qs.X) {
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (this.s == longValue2) {
                long j3 = this.r;
                if (longValue == j3 || longValue == this.w) {
                    int[] iArr = (int[]) objArr[2];
                    if (longValue == j3) {
                        this.a = iArr;
                    } else {
                        this.b = iArr;
                    }
                    for (int i17 = 0; i17 < iArr.length; i17++) {
                        int i18 = this.a[i17];
                        if (i18 >= 0 && (i15 = this.b[i17]) >= 0) {
                            this.c[i17] = i18 + i15;
                        } else if (i18 >= 0) {
                            this.c[i17] = i18;
                        } else {
                            this.c[i17] = Math.max(this.b[i17], 0);
                        }
                        if (longValue == this.r && this.c[i17] != 0 && this.d[i17] != this.a[i17]) {
                            if (i17 == 0) {
                                int i19 = this.n[0].q;
                                if (i19 == 1) {
                                    i14 = 6;
                                } else if (i19 == 2) {
                                    i14 = 7;
                                }
                                this.x.getMediaDataController().N0(longValue, this.d[i17] == -1 ? 30 : 20, 0, 0, i14, longValue2, 1, this.x.getClassGuid(), this.n[i17].p, null, null);
                                this.d[i17] = this.a[i17];
                            }
                            i14 = i17;
                            this.x.getMediaDataController().N0(longValue, this.d[i17] == -1 ? 30 : 20, 0, 0, i14, longValue2, 1, this.x.getClassGuid(), this.n[i17].p, null, null);
                            this.d[i17] = this.a[i17];
                        } else if (longValue == this.w && this.c[i17] != 0 && this.e[i17] != this.b[i17]) {
                            if (i17 == 0) {
                                int i20 = this.n[0].q;
                                if (i20 == 1) {
                                    i13 = 6;
                                } else if (i20 == 2) {
                                    i13 = 7;
                                }
                                this.x.getMediaDataController().N0(longValue, this.e[i17] == -1 ? 30 : 20, 0, 0, i13, longValue2, 1, this.x.getClassGuid(), this.n[i17].p, null, null);
                                this.e[i17] = this.b[i17];
                            }
                            i13 = i17;
                            this.x.getMediaDataController().N0(longValue, this.e[i17] == -1 ? 30 : 20, 0, 0, i13, longValue2, 1, this.x.getClassGuid(), this.n[i17].p, null, null);
                            this.e[i17] = this.b[i17];
                        }
                    }
                    this.D = true;
                    int size = this.y.size();
                    for (int i21 = 0; i21 < size; i21++) {
                        ((qs0) this.y.get(i21)).Q();
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.qs.W) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[1]).longValue();
            if ((longValue3 == this.r || longValue3 == this.w) && this.s == longValue4) {
                int intValue = ((Integer) objArr[4]).intValue();
                int intValue2 = ((Integer) objArr[2]).intValue();
                if (longValue3 == this.r) {
                    this.a[intValue] = intValue2;
                } else {
                    this.b[intValue] = intValue2;
                }
                int i22 = this.a[intValue];
                if (i22 >= 0 && (i12 = this.b[intValue]) >= 0) {
                    this.c[intValue] = i22 + i12;
                } else if (i22 >= 0) {
                    this.c[intValue] = i22;
                } else {
                    this.c[intValue] = Math.max(this.b[intValue], 0);
                }
                int size2 = this.y.size();
                for (int i23 = 0; i23 < size2; i23++) {
                    ((qs0) this.y.get(i23)).Q();
                }
                return;
            }
            return;
        }
        if (i7 == 1) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue5 = ((Long) objArr[0]).longValue();
            long j10 = this.r;
            if (longValue5 == j10 || longValue5 == this.w) {
                int i24 = longValue5 == j10 ? 0 : 1;
                boolean C = org.telegram.messenger.m5.C(longValue5);
                ArrayList arrayList = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.f2 f2Var = this.x;
                int currentAccount = f2Var != null ? f2Var.getCurrentAccount() : -1;
                for (int i25 = 0; i25 < arrayList.size(); i25++) {
                    org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) arrayList.get(i25);
                    if (!org.telegram.messenger.ij.d3(ijVar.k)) {
                        long j11 = this.s;
                        if ((j11 == 0 || j11 == org.telegram.messenger.ij.c2(currentAccount, ijVar.k, true, false)) && org.telegram.messenger.ij.o1(ijVar.k) != null && !ijVar.n5() && (f02 = org.telegram.messenger.ui.f0(ijVar.k)) != -1 && ((f02 != 0 || this.n[0].q != 2 || org.telegram.messenger.ij.M4(ijVar.k)) && (f02 != 0 || this.n[0].q != 1 || !org.telegram.messenger.ij.M4(ijVar.k)))) {
                            ms0 ms0Var = this.n[f02];
                            if (ms0Var.l) {
                                ms0Var.a(ijVar, i24, true, C);
                            }
                            if (this.s == 0) {
                                int[] iArr2 = this.n[f02].f;
                                iArr2[i24] = iArr2[i24] + 1;
                            }
                            if (i24 == 0) {
                                for (int i26 = 0; i26 < this.n[f02].e.size(); i26++) {
                                    ((xr0) this.n[f02].e.get(i26)).b++;
                                }
                            }
                        }
                    }
                }
                a();
                return;
            }
            return;
        }
        if (i7 != org.telegram.messenger.qs.K) {
            if (i7 == org.telegram.messenger.qs.V) {
                long longValue6 = ((Long) objArr[0]).longValue();
                if (((Integer) objArr[3]).intValue() == this.x.getClassGuid()) {
                    int intValue3 = ((Integer) objArr[4]).intValue();
                    ArrayList arrayList2 = (ArrayList) objArr[2];
                    boolean C2 = org.telegram.messenger.m5.C(longValue6);
                    int i27 = longValue6 == this.r ? 0 : 1;
                    if (intValue3 == 0 || intValue3 == 6 || intValue3 == 7) {
                        if (intValue3 != this.n[0].q) {
                            return;
                        } else {
                            intValue3 = 0;
                        }
                    }
                    if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                        this.n[intValue3].f[i27] = ((Integer) objArr[1]).intValue();
                    }
                    this.n[intValue3].i[i27] = ((Boolean) objArr[5]).booleanValue();
                    for (int i28 = 0; i28 < arrayList2.size(); i28++) {
                        this.n[intValue3].a((org.telegram.messenger.ij) arrayList2.get(i28), i27, false, C2);
                    }
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.qs.w) {
                if (((Boolean) objArr[2]).booleanValue()) {
                    return;
                }
                long longValue7 = ((Long) objArr[1]).longValue();
                TLRPC.Chat M0 = org.telegram.messenger.m5.z(this.r) ? this.x.getMessagesController().M0(Long.valueOf(-this.r)) : null;
                if (org.telegram.messenger.t3.T(M0)) {
                    if ((longValue7 != 0 || this.w == 0) && longValue7 != M0.id) {
                        return;
                    }
                } else if (longValue7 != 0) {
                    return;
                }
                ArrayList arrayList3 = (ArrayList) objArr[0];
                org.telegram.ui.ActionBar.f2 f2Var2 = this.x;
                int currentAccount2 = f2Var2 != null ? f2Var2.getCurrentAccount() : -1;
                int size3 = arrayList3.size();
                int i29 = 0;
                boolean z12 = false;
                while (i29 < size3) {
                    int i30 = 0;
                    boolean z13 = z12;
                    while (true) {
                        ms0[] ms0VarArr = this.n;
                        if (i30 < ms0VarArr.length) {
                            org.telegram.messenger.ij b10 = ms0VarArr[i30].b(((Integer) arrayList3.get(i29)).intValue(), 0);
                            if (b10 != null) {
                                if (org.telegram.messenger.ij.B0(b10.k) == this.r && (this.s == 0 || org.telegram.messenger.ij.c2(currentAccount2, b10.k, true, false) == this.s)) {
                                    int[] iArr3 = this.a;
                                    int i31 = iArr3[i30];
                                    if (i31 > 0) {
                                        iArr3[i30] = i31 - 1;
                                    }
                                } else {
                                    int[] iArr4 = this.b;
                                    int i32 = iArr4[i30];
                                    if (i32 > 0) {
                                        iArr4[i30] = i32 - 1;
                                    }
                                }
                                z13 = true;
                            }
                            i30++;
                            z13 = z13;
                        }
                    }
                    i29++;
                    z12 = z13;
                }
                if (z12) {
                    int i33 = 0;
                    while (true) {
                        int[] iArr5 = this.a;
                        if (i33 >= iArr5.length) {
                            break;
                        }
                        int i34 = iArr5[i33];
                        if (i34 >= 0 && (i11 = this.b[i33]) >= 0) {
                            this.c[i33] = i34 + i11;
                        } else if (i34 >= 0) {
                            this.c[i33] = i34;
                        } else {
                            this.c[i33] = Math.max(this.b[i33], 0);
                        }
                        i33++;
                    }
                    int size4 = this.y.size();
                    for (int i35 = 0; i35 < size4; i35++) {
                        ((qs0) this.y.get(i35)).Q();
                    }
                }
                a();
                return;
            }
            if (i7 != org.telegram.messenger.qs.m0) {
                if (i7 == org.telegram.messenger.qs.T) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                    long j12 = this.r;
                    if (j12 >= 0 || chatFull.id != (-j12)) {
                        return;
                    }
                    c(chatFull);
                    return;
                }
                if (i7 == org.telegram.messenger.qs.Y1) {
                    ArrayList arrayList4 = new ArrayList();
                    int i36 = 0;
                    while (true) {
                        ms0[] ms0VarArr2 = this.n;
                        if (i36 >= ms0VarArr2.length) {
                            break;
                        }
                        arrayList4.addAll(ms0VarArr2[i36].a);
                        i36++;
                    }
                    String str = (String) objArr[0];
                    if (str != null) {
                        Utilities.e.c(new androidx.activity.g(arrayList4, str, i10, 6));
                        return;
                    }
                    return;
                }
                if (i7 == org.telegram.messenger.qs.g3) {
                    org.telegram.ui.ActionBar.f2 f2Var3 = this.x;
                    if (f2Var3 != null) {
                        org.telegram.messenger.vv G1 = f2Var3.getMessagesController().G1();
                        long j13 = this.r;
                        ArrayList arrayList5 = G1.j;
                        for (int i37 = 0; i37 < arrayList5.size(); i37++) {
                            if (((org.telegram.messenger.uv) arrayList5.get(i37)).a == j13) {
                                z9 = true;
                                break;
                            }
                        }
                    }
                    z9 = false;
                    if (!this.h || this.f == z9) {
                        return;
                    }
                    this.f = z9;
                    int size5 = this.y.size();
                    for (int i38 = 0; i38 < size5; i38++) {
                        ((qs0) this.y.get(i38)).Q();
                    }
                    return;
                }
                return;
            }
            long longValue8 = ((Long) objArr[0]).longValue();
            long j14 = this.r;
            if (longValue8 == j14 || longValue8 == this.w) {
                int i39 = longValue8 == j14 ? 0 : 1;
                ArrayList arrayList6 = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.f2 f2Var4 = this.x;
                int currentAccount3 = f2Var4 != null ? f2Var4.getCurrentAccount() : -1;
                int size6 = arrayList6.size();
                int i40 = 0;
                while (i40 < size6) {
                    org.telegram.messenger.ij ijVar2 = (org.telegram.messenger.ij) arrayList6.get(i40);
                    int f12 = ijVar2.f1();
                    long c22 = org.telegram.messenger.ij.c2(currentAccount3, ijVar2.k, z10, z11);
                    int f03 = org.telegram.messenger.ui.f0(ijVar2.k);
                    boolean z14 = z11;
                    long j15 = this.s;
                    if (j15 == 0 || c22 == j15) {
                        ?? r72 = z14;
                        while (true) {
                            ms0[] ms0VarArr3 = this.n;
                            if (r72 >= ms0VarArr3.length) {
                                break;
                            }
                            org.telegram.messenger.ij ijVar3 = (org.telegram.messenger.ij) ms0VarArr3[r72].b[i39].get(f12);
                            if (ijVar3 != null) {
                                int f04 = org.telegram.messenger.ui.f0(ijVar2.k);
                                if (f03 == -1 || f04 != f03) {
                                    this.n[r72].b(f12, i39);
                                    if (i39 == 0) {
                                        int[] iArr6 = this.a;
                                        int i41 = iArr6[r72];
                                        if (i41 > 0) {
                                            iArr6[r72] = i41 - 1;
                                        }
                                    } else {
                                        int[] iArr7 = this.b;
                                        int i42 = iArr7[r72];
                                        if (i42 > 0) {
                                            iArr7[r72] = i42 - 1;
                                        }
                                    }
                                } else {
                                    int indexOf = this.n[r72].a.indexOf(ijVar3);
                                    if (indexOf >= 0) {
                                        this.n[r72].b[i39].put(f12, ijVar2);
                                        this.n[r72].a.set(indexOf, ijVar2);
                                    }
                                }
                            } else {
                                r72++;
                            }
                        }
                    }
                    i40++;
                    z11 = z14;
                    z10 = true;
                }
                return;
            }
            return;
        }
        if (((Boolean) objArr[6]).booleanValue()) {
            return;
        }
        Integer num = (Integer) objArr[0];
        Integer num2 = (Integer) objArr[1];
        Long l10 = (Long) objArr[3];
        if (l10.longValue() != this.r && l10.longValue() != this.w) {
            return;
        }
        int i43 = l10.longValue() == this.r ? 0 : 1;
        while (true) {
            ms0[] ms0VarArr4 = this.n;
            if (i16 >= ms0VarArr4.length) {
                return;
            }
            ms0VarArr4[i16].f(i43, num.intValue(), num2.intValue());
            i16++;
        }
    }
}
