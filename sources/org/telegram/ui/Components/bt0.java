package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class bt0 implements org.telegram.messenger.fs {
    public boolean E;
    public final xi.e F;
    public boolean f;
    public boolean h;
    public final ys0[] n;
    public final long r;
    public final long s;
    public long w;
    public final org.telegram.ui.ActionBar.g2 x;
    public int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList y = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public bt0(org.telegram.ui.ActionBar.g2 g2Var) {
        TLRPC.ChatFull P0;
        this.x = g2Var;
        final int i7 = 0;
        final int i10 = 1;
        if (g2Var instanceof bh) {
            bh bhVar = (bh) g2Var;
            long a10 = bhVar.a();
            this.r = a10;
            this.w = bhVar.M();
            this.s = bhVar.d();
            if (a10 != g2Var.getUserConfig().e()) {
                g2Var.getMessagesController().I1().f(a10, new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.Components.at0
                    public final /* synthetic */ bt0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.x10
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i7) {
                            case 0:
                                bt0 bt0Var = this.b;
                                ArrayList arrayList = bt0Var.y;
                                boolean booleanValue = bool.booleanValue();
                                bt0Var.f = booleanValue;
                                bt0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i11 = 0; i11 < size; i11++) {
                                        ((ct0) arrayList.get(i11)).R();
                                    }
                                    break;
                                }
                                break;
                            default:
                                bt0 bt0Var2 = this.b;
                                ArrayList arrayList2 = bt0Var2.y;
                                boolean booleanValue2 = bool.booleanValue();
                                bt0Var2.f = booleanValue2;
                                bt0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        ((ct0) arrayList2.get(i12)).R();
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        } else if (g2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) g2Var;
            if (profileActivity.h1) {
                this.r = profileActivity.getUserConfig().e();
                this.s = profileActivity.a();
            } else {
                long a11 = profileActivity.a();
                this.r = a11;
                this.s = profileActivity.g1;
                TLRPC.ChatFull chatFull = profileActivity.v2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a11 != g2Var.getUserConfig().e()) {
                    g2Var.getMessagesController().I1().f(a11, new org.telegram.messenger.x10(this) { // from class: org.telegram.ui.Components.at0
                        public final /* synthetic */ bt0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.messenger.x10
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (i10) {
                                case 0:
                                    bt0 bt0Var = this.b;
                                    ArrayList arrayList = bt0Var.y;
                                    boolean booleanValue = bool.booleanValue();
                                    bt0Var.f = booleanValue;
                                    bt0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i11 = 0; i11 < size; i11++) {
                                            ((ct0) arrayList.get(i11)).R();
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    bt0 bt0Var2 = this.b;
                                    ArrayList arrayList2 = bt0Var2.y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    bt0Var2.f = booleanValue2;
                                    bt0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i12 = 0; i12 < size2; i12++) {
                                            ((ct0) arrayList2.get(i12)).R();
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        } else if (g2Var instanceof k90) {
            this.r = ((k90) g2Var).e;
        } else if (g2Var instanceof org.telegram.ui.cx) {
            this.r = g2Var.getUserConfig().e();
        }
        if (this.w == 0 && org.telegram.messenger.n5.z(this.r) && (P0 = g2Var.getMessagesController().P0(-this.r)) != null) {
            long j3 = P0.migrated_from_chat_id;
            if (j3 != 0) {
                this.w = -j3;
            }
        }
        this.n = new ys0[9];
        int i11 = 0;
        while (true) {
            ys0[] ys0VarArr = this.n;
            if (i11 >= ys0VarArr.length) {
                break;
            }
            ys0VarArr[i11] = new ys0();
            this.n[i11].j[0] = org.telegram.messenger.n5.C(this.r) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
            this.n[i11].j[1] = Integer.MAX_VALUE;
            i11++;
        }
        a();
        org.telegram.ui.ActionBar.g2 g2Var2 = this.x;
        if (g2Var2 == null) {
            this.F = null;
            return;
        }
        org.telegram.messenger.ks notificationCenter = g2Var2.getNotificationCenter();
        notificationCenter.getClass();
        xi.e eVar = new xi.e(notificationCenter, this);
        eVar.c(org.telegram.messenger.ks.X);
        eVar.c(org.telegram.messenger.ks.W);
        eVar.c(1);
        eVar.c(org.telegram.messenger.ks.K);
        eVar.c(org.telegram.messenger.ks.V);
        eVar.c(org.telegram.messenger.ks.w);
        eVar.c(org.telegram.messenger.ks.m0);
        eVar.c(org.telegram.messenger.ks.T);
        eVar.c(org.telegram.messenger.ks.Y1);
        eVar.c(org.telegram.messenger.ks.A5);
        eVar.c(org.telegram.messenger.ks.i3);
        this.F = eVar;
    }

    public final void a() {
        org.telegram.ui.ActionBar.g2 g2Var = this.x;
        if (g2Var == null) {
            return;
        }
        org.telegram.messenger.ri mediaDataController = g2Var.getMediaDataController();
        long j3 = this.s;
        mediaDataController.g0(this.r, g2Var.getClassGuid(), j3);
        if (this.w != 0) {
            g2Var.getMediaDataController().g0(this.w, g2Var.getClassGuid(), this.s);
        }
    }

    public final void b(org.telegram.ui.ActionBar.g2 g2Var) {
        if (g2Var != this.x) {
            return;
        }
        this.y.clear();
        xi.e eVar = this.F;
        if (eVar != null) {
            eVar.b();
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.g2 g2Var = this.x;
        if (g2Var == null || chatFull == null) {
            return;
        }
        long j3 = chatFull.migrated_from_chat_id;
        if (j3 == 0 || this.w != 0) {
            return;
        }
        this.w = -j3;
        g2Var.getMediaDataController().g0(this.w, g2Var.getClassGuid(), this.s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    @Override // org.telegram.messenger.fs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        int i11;
        int h02;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z11 = true;
        boolean z12 = false;
        int i16 = 0;
        if (i7 == org.telegram.messenger.ks.X) {
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
                                this.x.getMediaDataController().Q0(longValue, this.d[i17] == -1 ? 30 : 20, 0, 0, i14, longValue2, 1, this.x.getClassGuid(), this.n[i17].p, null, null);
                                this.d[i17] = this.a[i17];
                            }
                            i14 = i17;
                            this.x.getMediaDataController().Q0(longValue, this.d[i17] == -1 ? 30 : 20, 0, 0, i14, longValue2, 1, this.x.getClassGuid(), this.n[i17].p, null, null);
                            this.d[i17] = this.a[i17];
                        } else if (longValue == this.w && this.c[i17] != 0 && this.e[i17] != this.b[i17]) {
                            if (i17 == 0) {
                                int i20 = this.n[0].q;
                                if (i20 == 1) {
                                    i13 = 6;
                                } else if (i20 == 2) {
                                    i13 = 7;
                                }
                                this.x.getMediaDataController().Q0(longValue, this.e[i17] == -1 ? 30 : 20, 0, 0, i13, longValue2, 1, this.x.getClassGuid(), this.n[i17].p, null, null);
                                this.e[i17] = this.b[i17];
                            }
                            i13 = i17;
                            this.x.getMediaDataController().Q0(longValue, this.e[i17] == -1 ? 30 : 20, 0, 0, i13, longValue2, 1, this.x.getClassGuid(), this.n[i17].p, null, null);
                            this.e[i17] = this.b[i17];
                        }
                    }
                    this.E = true;
                    int size = this.y.size();
                    for (int i21 = 0; i21 < size; i21++) {
                        ((ct0) this.y.get(i21)).R();
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == org.telegram.messenger.ks.W) {
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
                    ((ct0) this.y.get(i23)).R();
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
                boolean C = org.telegram.messenger.n5.C(longValue5);
                ArrayList arrayList = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.g2 g2Var = this.x;
                int currentAccount = g2Var != null ? g2Var.getCurrentAccount() : -1;
                for (int i25 = 0; i25 < arrayList.size(); i25++) {
                    org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) arrayList.get(i25);
                    if (!org.telegram.messenger.fj.c3(fjVar.k)) {
                        long j11 = this.s;
                        if ((j11 == 0 || j11 == org.telegram.messenger.fj.b2(currentAccount, fjVar.k, true, false)) && org.telegram.messenger.fj.n1(fjVar.k) != null && !fjVar.m5() && (h02 = org.telegram.messenger.ri.h0(fjVar.k)) != -1 && ((h02 != 0 || this.n[0].q != 2 || org.telegram.messenger.fj.L4(fjVar.k)) && (h02 != 0 || this.n[0].q != 1 || !org.telegram.messenger.fj.L4(fjVar.k)))) {
                            ys0 ys0Var = this.n[h02];
                            if (ys0Var.l) {
                                ys0Var.a(fjVar, i24, true, C);
                            }
                            if (this.s == 0) {
                                int[] iArr2 = this.n[h02].f;
                                iArr2[i24] = iArr2[i24] + 1;
                            }
                            if (i24 == 0) {
                                for (int i26 = 0; i26 < this.n[h02].e.size(); i26++) {
                                    ((js0) this.n[h02].e.get(i26)).b++;
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
        if (i7 != org.telegram.messenger.ks.K) {
            if (i7 == org.telegram.messenger.ks.V) {
                long longValue6 = ((Long) objArr[0]).longValue();
                if (((Integer) objArr[3]).intValue() == this.x.getClassGuid()) {
                    int intValue3 = ((Integer) objArr[4]).intValue();
                    ArrayList arrayList2 = (ArrayList) objArr[2];
                    boolean C2 = org.telegram.messenger.n5.C(longValue6);
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
                        this.n[intValue3].a((org.telegram.messenger.fj) arrayList2.get(i28), i27, false, C2);
                    }
                    return;
                }
                return;
            }
            if (i7 == org.telegram.messenger.ks.w) {
                if (((Boolean) objArr[2]).booleanValue()) {
                    return;
                }
                long longValue7 = ((Long) objArr[1]).longValue();
                TLRPC.Chat O0 = org.telegram.messenger.n5.z(this.r) ? this.x.getMessagesController().O0(Long.valueOf(-this.r)) : null;
                if (org.telegram.messenger.v3.T(O0)) {
                    if ((longValue7 != 0 || this.w == 0) && longValue7 != O0.id) {
                        return;
                    }
                } else if (longValue7 != 0) {
                    return;
                }
                ArrayList arrayList3 = (ArrayList) objArr[0];
                org.telegram.ui.ActionBar.g2 g2Var2 = this.x;
                int currentAccount2 = g2Var2 != null ? g2Var2.getCurrentAccount() : -1;
                int size3 = arrayList3.size();
                int i29 = 0;
                boolean z13 = false;
                while (i29 < size3) {
                    int i30 = 0;
                    boolean z14 = z13;
                    while (true) {
                        ys0[] ys0VarArr = this.n;
                        if (i30 < ys0VarArr.length) {
                            org.telegram.messenger.fj b10 = ys0VarArr[i30].b(((Integer) arrayList3.get(i29)).intValue(), 0);
                            if (b10 != null) {
                                if (org.telegram.messenger.fj.B0(b10.k) == this.r && (this.s == 0 || org.telegram.messenger.fj.b2(currentAccount2, b10.k, true, false) == this.s)) {
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
                        ((ct0) this.y.get(i35)).R();
                    }
                }
                a();
                return;
            }
            if (i7 != org.telegram.messenger.ks.m0) {
                if (i7 == org.telegram.messenger.ks.T) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                    long j12 = this.r;
                    if (j12 >= 0 || chatFull.id != (-j12)) {
                        return;
                    }
                    c(chatFull);
                    return;
                }
                if (i7 == org.telegram.messenger.ks.Y1) {
                    ArrayList arrayList4 = new ArrayList();
                    int i36 = 0;
                    while (true) {
                        ys0[] ys0VarArr2 = this.n;
                        if (i36 >= ys0VarArr2.length) {
                            break;
                        }
                        arrayList4.addAll(ys0VarArr2[i36].a);
                        i36++;
                    }
                    String str = (String) objArr[0];
                    if (str != null) {
                        Utilities.e.c(new androidx.activity.g(arrayList4, str, i10, 6));
                        return;
                    }
                    return;
                }
                if (i7 == org.telegram.messenger.ks.i3) {
                    org.telegram.ui.ActionBar.g2 g2Var3 = this.x;
                    if (g2Var3 != null) {
                        org.telegram.messenger.pv I1 = g2Var3.getMessagesController().I1();
                        long j13 = this.r;
                        ArrayList arrayList5 = I1.j;
                        for (int i37 = 0; i37 < arrayList5.size(); i37++) {
                            if (((org.telegram.messenger.ov) arrayList5.get(i37)).a == j13) {
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
                        ((ct0) this.y.get(i38)).R();
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
                org.telegram.ui.ActionBar.g2 g2Var4 = this.x;
                int currentAccount3 = g2Var4 != null ? g2Var4.getCurrentAccount() : -1;
                int size6 = arrayList6.size();
                int i40 = 0;
                while (i40 < size6) {
                    org.telegram.messenger.fj fjVar2 = (org.telegram.messenger.fj) arrayList6.get(i40);
                    int e12 = fjVar2.e1();
                    long b22 = org.telegram.messenger.fj.b2(currentAccount3, fjVar2.k, z11, z12);
                    int h03 = org.telegram.messenger.ri.h0(fjVar2.k);
                    boolean z15 = z12;
                    long j15 = this.s;
                    if (j15 == 0 || b22 == j15) {
                        ?? r72 = z15;
                        while (true) {
                            ys0[] ys0VarArr3 = this.n;
                            if (r72 >= ys0VarArr3.length) {
                                break;
                            }
                            org.telegram.messenger.fj fjVar3 = (org.telegram.messenger.fj) ys0VarArr3[r72].b[i39].get(e12);
                            if (fjVar3 != null) {
                                int h04 = org.telegram.messenger.ri.h0(fjVar2.k);
                                if (h03 == -1 || h04 != h03) {
                                    this.n[r72].b(e12, i39);
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
                                    int indexOf = this.n[r72].a.indexOf(fjVar3);
                                    if (indexOf >= 0) {
                                        this.n[r72].b[i39].put(e12, fjVar2);
                                        this.n[r72].a.set(indexOf, fjVar2);
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
            ys0[] ys0VarArr4 = this.n;
            if (i16 >= ys0VarArr4.length) {
                return;
            }
            ys0VarArr4[i16].f(i43, num.intValue(), num2.intValue());
            i16++;
        }
    }
}
