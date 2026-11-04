package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class os0 implements org.telegram.messenger.cs {
    public boolean E;
    public final za.p F;
    public boolean f;
    public boolean h;
    public final ls0[] n;
    public final long r;
    public final long s;
    public long w;
    public final org.telegram.ui.ActionBar.d2 x;
    public int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList y = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public os0(org.telegram.ui.ActionBar.d2 d2Var) {
        TLRPC.ChatFull N0;
        this.x = d2Var;
        final int i3 = 0;
        final int i10 = 1;
        if (d2Var instanceof ig) {
            ig igVar = (ig) d2Var;
            long a10 = igVar.a();
            this.r = a10;
            this.w = igVar.L();
            this.s = igVar.b();
            if (a10 != d2Var.getUserConfig().e()) {
                d2Var.getMessagesController().G1().f(a10, new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.Components.ns0
                    public final /* synthetic */ os0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.u10
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i3) {
                            case 0:
                                os0 os0Var = this.b;
                                ArrayList arrayList = os0Var.y;
                                boolean booleanValue = bool.booleanValue();
                                os0Var.f = booleanValue;
                                os0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((ps0) arrayList.get(i11)).Q();
                                    }
                                    break;
                                }
                                break;
                            default:
                                os0 os0Var2 = this.b;
                                ArrayList arrayList2 = os0Var2.y;
                                boolean booleanValue2 = bool.booleanValue();
                                os0Var2.f = booleanValue2;
                                os0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((ps0) arrayList2.get(i12)).Q();
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        } else if (d2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) d2Var;
            if (profileActivity.h1) {
                this.r = profileActivity.getUserConfig().e();
                this.s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.r = a11;
                this.s = profileActivity.g1;
                TLRPC.ChatFull chatFull = profileActivity.u2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != d2Var.getUserConfig().e()) {
                    d2Var.getMessagesController().G1().f(a11, new org.telegram.messenger.u10(this) { // from class: org.telegram.ui.Components.ns0
                        public final /* synthetic */ os0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.messenger.u10
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (i10) {
                                case 0:
                                    os0 os0Var = this.b;
                                    ArrayList arrayList = os0Var.y;
                                    boolean booleanValue = bool.booleanValue();
                                    os0Var.f = booleanValue;
                                    os0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((ps0) arrayList.get(i11)).Q();
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    os0 os0Var2 = this.b;
                                    ArrayList arrayList2 = os0Var2.y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    os0Var2.f = booleanValue2;
                                    os0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((ps0) arrayList2.get(i12)).Q();
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        } else if (d2Var instanceof r80) {
            this.r = ((r80) d2Var).e;
        } else if (d2Var instanceof org.telegram.ui.uw) {
            this.r = d2Var.getUserConfig().e();
        }
        if (this.w == 0 && org.telegram.messenger.m5.z(this.r) && (N0 = d2Var.getMessagesController().N0(-this.r)) != null) {
            long j10 = N0.migrated_from_chat_id;
            if (j10 != 0) {
                this.w = -j10;
            }
        }
        this.n = new ls0[9];
        int i11 = 0;
        while (true) {
            ls0[] ls0VarArr = this.n;
            if (i11 >= ls0VarArr.length) {
                break;
            }
            ls0VarArr[i11] = new ls0();
            this.n[i11].j[0] = org.telegram.messenger.m5.C(this.r) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
            this.n[i11].j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.d2 d2Var2 = this.x;
        if (d2Var2 == null) {
            this.F = null;
            return;
        }
        org.telegram.messenger.hs notificationCenter = d2Var2.getNotificationCenter();
        notificationCenter.getClass();
        za.p pVar = new za.p(notificationCenter, this);
        pVar.b(org.telegram.messenger.hs.X);
        pVar.b(org.telegram.messenger.hs.W);
        pVar.b(1);
        pVar.b(org.telegram.messenger.hs.K);
        pVar.b(org.telegram.messenger.hs.V);
        pVar.b(org.telegram.messenger.hs.w);
        pVar.b(org.telegram.messenger.hs.m0);
        pVar.b(org.telegram.messenger.hs.T);
        pVar.b(org.telegram.messenger.hs.Y1);
        pVar.b(org.telegram.messenger.hs.x5);
        pVar.b(org.telegram.messenger.hs.g3);
        this.F = pVar;
    }

    public final void a() {
        org.telegram.ui.ActionBar.d2 d2Var = this.x;
        if (d2Var == null) {
            return;
        }
        org.telegram.messenger.li mediaDataController = d2Var.getMediaDataController();
        long j10 = this.s;
        mediaDataController.e0(this.r, d2Var.getClassGuid(), j10);
        if (this.w != 0) {
            d2Var.getMediaDataController().e0(this.w, d2Var.getClassGuid(), this.s);
        }
    }

    public final void b(org.telegram.ui.ActionBar.d2 d2Var) {
        if (d2Var != this.x) {
            return;
        }
        this.y.clear();
        za.p pVar = this.F;
        if (pVar != null) {
            pVar.a();
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.d2 d2Var = this.x;
        if (d2Var == null || chatFull == null) {
            return;
        }
        long j10 = chatFull.migrated_from_chat_id;
        if (j10 == 0 || this.w != 0) {
            return;
        }
        this.w = -j10;
        d2Var.getMediaDataController().e0(this.w, d2Var.getClassGuid(), this.s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    @Override // org.telegram.messenger.cs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        boolean z10;
        int i11;
        int f02;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11 = true;
        boolean z12 = false;
        int i16 = 0;
        if (i3 == org.telegram.messenger.hs.X) {
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (this.s == longValue2) {
                long j10 = this.r;
                if (longValue == j10 || longValue == this.w) {
                    int[] iArr = (int[]) objArr[2];
                    if (longValue == j10) {
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
                    this.E = true;
                    int size = this.y.size();
                    for (int i21 = 0; i21 < size; i21++) {
                        ((ps0) this.y.get(i21)).Q();
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == org.telegram.messenger.hs.W) {
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
                    ((ps0) this.y.get(i23)).Q();
                }
                return;
            }
            return;
        }
        if (i3 == 1) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue5 = ((Long) objArr[0]).longValue();
            long j11 = this.r;
            if (longValue5 == j11 || longValue5 == this.w) {
                int i24 = longValue5 == j11 ? 0 : 1;
                boolean C = org.telegram.messenger.m5.C(longValue5);
                ArrayList arrayList = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.d2 d2Var = this.x;
                int currentAccount = d2Var != null ? d2Var.getCurrentAccount() : -1;
                for (int i25 = 0; i25 < arrayList.size(); i25++) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i25);
                    if (!org.telegram.messenger.zi.d3(ziVar.k)) {
                        long j12 = this.s;
                        if ((j12 == 0 || j12 == org.telegram.messenger.zi.c2(currentAccount, ziVar.k, true, false)) && org.telegram.messenger.zi.o1(ziVar.k) != null && !ziVar.n5() && (f02 = org.telegram.messenger.li.f0(ziVar.k)) != -1 && ((f02 != 0 || this.n[0].q != 2 || org.telegram.messenger.zi.M4(ziVar.k)) && (f02 != 0 || this.n[0].q != 1 || !org.telegram.messenger.zi.M4(ziVar.k)))) {
                            ls0 ls0Var = this.n[f02];
                            if (ls0Var.l) {
                                ls0Var.a(ziVar, i24, true, C);
                            }
                            if (this.s == 0) {
                                int[] iArr2 = this.n[f02].f;
                                iArr2[i24] = iArr2[i24] + 1;
                            }
                            if (i24 == 0) {
                                for (int i26 = 0; i26 < this.n[f02].e.size(); i26++) {
                                    ((wr0) this.n[f02].e.get(i26)).b++;
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
        if (i3 != org.telegram.messenger.hs.K) {
            if (i3 == org.telegram.messenger.hs.V) {
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
                        this.n[intValue3].a((org.telegram.messenger.zi) arrayList2.get(i28), i27, false, C2);
                    }
                    return;
                }
                return;
            }
            if (i3 == org.telegram.messenger.hs.w) {
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
                org.telegram.ui.ActionBar.d2 d2Var2 = this.x;
                int currentAccount2 = d2Var2 != null ? d2Var2.getCurrentAccount() : -1;
                int size3 = arrayList3.size();
                int i29 = 0;
                boolean z13 = false;
                while (i29 < size3) {
                    int i30 = 0;
                    boolean z14 = z13;
                    while (true) {
                        ls0[] ls0VarArr = this.n;
                        if (i30 < ls0VarArr.length) {
                            org.telegram.messenger.zi b10 = ls0VarArr[i30].b(((Integer) arrayList3.get(i29)).intValue(), 0);
                            if (b10 != null) {
                                if (org.telegram.messenger.zi.B0(b10.k) == this.r && (this.s == 0 || org.telegram.messenger.zi.c2(currentAccount2, b10.k, true, false) == this.s)) {
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
                                z14 = true;
                            }
                            i30++;
                            z14 = z14;
                        }
                    }
                    i29++;
                    z13 = z14;
                }
                if (z13) {
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
                        ((ps0) this.y.get(i35)).Q();
                    }
                }
                a();
                return;
            }
            if (i3 != org.telegram.messenger.hs.m0) {
                if (i3 == org.telegram.messenger.hs.T) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                    long j13 = this.r;
                    if (j13 >= 0 || chatFull.id != (-j13)) {
                        return;
                    }
                    c(chatFull);
                    return;
                }
                if (i3 == org.telegram.messenger.hs.Y1) {
                    ArrayList arrayList4 = new ArrayList();
                    int i36 = 0;
                    while (true) {
                        ls0[] ls0VarArr2 = this.n;
                        if (i36 >= ls0VarArr2.length) {
                            break;
                        }
                        arrayList4.addAll(ls0VarArr2[i36].a);
                        i36++;
                    }
                    String str = (String) objArr[0];
                    if (str != null) {
                        Utilities.e.c(new androidx.activity.g(arrayList4, str, i10, 6));
                        return;
                    }
                    return;
                }
                if (i3 == org.telegram.messenger.hs.g3) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = this.x;
                    if (d2Var3 != null) {
                        org.telegram.messenger.nv G1 = d2Var3.getMessagesController().G1();
                        long j14 = this.r;
                        ArrayList arrayList5 = G1.j;
                        for (int i37 = 0; i37 < arrayList5.size(); i37++) {
                            if (((org.telegram.messenger.mv) arrayList5.get(i37)).a == j14) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (!this.h || this.f == z10) {
                        return;
                    }
                    this.f = z10;
                    int size5 = this.y.size();
                    for (int i38 = 0; i38 < size5; i38++) {
                        ((ps0) this.y.get(i38)).Q();
                    }
                    return;
                }
                return;
            }
            long longValue8 = ((Long) objArr[0]).longValue();
            long j15 = this.r;
            if (longValue8 == j15 || longValue8 == this.w) {
                int i39 = longValue8 == j15 ? 0 : 1;
                ArrayList arrayList6 = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.d2 d2Var4 = this.x;
                int currentAccount3 = d2Var4 != null ? d2Var4.getCurrentAccount() : -1;
                int size6 = arrayList6.size();
                int i40 = 0;
                while (i40 < size6) {
                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList6.get(i40);
                    int f12 = ziVar2.f1();
                    long c2 = org.telegram.messenger.zi.c2(currentAccount3, ziVar2.k, z11, z12);
                    int f03 = org.telegram.messenger.li.f0(ziVar2.k);
                    boolean z15 = z12;
                    long j16 = this.s;
                    if (j16 == 0 || c2 == j16) {
                        ?? r72 = z15;
                        while (true) {
                            ls0[] ls0VarArr3 = this.n;
                            if (r72 >= ls0VarArr3.length) {
                                break;
                            }
                            org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) ls0VarArr3[r72].b[i39].get(f12);
                            if (ziVar3 != null) {
                                int f04 = org.telegram.messenger.li.f0(ziVar2.k);
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
                                    int indexOf = this.n[r72].a.indexOf(ziVar3);
                                    if (indexOf >= 0) {
                                        this.n[r72].b[i39].put(f12, ziVar2);
                                        this.n[r72].a.set(indexOf, ziVar2);
                                    }
                                }
                            } else {
                                r72++;
                            }
                        }
                    }
                    i40++;
                    z12 = z15;
                    z11 = true;
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
            ls0[] ls0VarArr4 = this.n;
            if (i16 >= ls0VarArr4.length) {
                return;
            }
            ls0VarArr4[i16].f(i43, num.intValue(), num2.intValue());
            i16++;
        }
    }
}
