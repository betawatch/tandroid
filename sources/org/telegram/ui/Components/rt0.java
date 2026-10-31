package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class rt0 implements org.telegram.messenger.us {
    public boolean D;
    public final xa.n E;
    public boolean f;
    public boolean h;
    public final ot0[] n;
    public final long r;
    public final long s;
    public long w;
    public final org.telegram.ui.ActionBar.k2 x;
    public int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList y = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public rt0(org.telegram.ui.ActionBar.k2 k2Var) {
        TLRPC.ChatFull M0;
        this.x = k2Var;
        final int i10 = 0;
        final int i11 = 1;
        if (k2Var instanceof gg) {
            gg ggVar = (gg) k2Var;
            long a2 = ggVar.a();
            this.r = a2;
            this.w = ggVar.L();
            this.s = ggVar.b();
            if (a2 != k2Var.getUserConfig().e()) {
                k2Var.getMessagesController().F1().f(a2, new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.Components.qt0
                    public final /* synthetic */ rt0 b;

                    {
                        this.b = this;
                    }

                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (i10) {
                            case 0:
                                rt0 rt0Var = this.b;
                                ArrayList arrayList = rt0Var.y;
                                boolean booleanValue = bool.booleanValue();
                                rt0Var.f = booleanValue;
                                rt0Var.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    for (int i12 = 0; i12 < size; i12++) {
                                        ((st0) arrayList.get(i12)).Q();
                                    }
                                    break;
                                }
                                break;
                            default:
                                rt0 rt0Var2 = this.b;
                                ArrayList arrayList2 = rt0Var2.y;
                                boolean booleanValue2 = bool.booleanValue();
                                rt0Var2.f = booleanValue2;
                                rt0Var2.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    for (int i13 = 0; i13 < size2; i13++) {
                                        ((st0) arrayList2.get(i13)).Q();
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        } else if (k2Var instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) k2Var;
            if (profileActivity.g1) {
                this.r = profileActivity.getUserConfig().e();
                this.s = profileActivity.a();
            } else {
                long a10 = profileActivity.a();
                this.r = a10;
                this.s = profileActivity.f1;
                TLRPC.ChatFull chatFull = profileActivity.t2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a10 != k2Var.getUserConfig().e()) {
                    k2Var.getMessagesController().F1().f(a10, new org.telegram.messenger.q20(this) { // from class: org.telegram.ui.Components.qt0
                        public final /* synthetic */ rt0 b;

                        {
                            this.b = this;
                        }

                        @Override // org.telegram.messenger.q20
                        public final void a(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (i11) {
                                case 0:
                                    rt0 rt0Var = this.b;
                                    ArrayList arrayList = rt0Var.y;
                                    boolean booleanValue = bool.booleanValue();
                                    rt0Var.f = booleanValue;
                                    rt0Var.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        for (int i12 = 0; i12 < size; i12++) {
                                            ((st0) arrayList.get(i12)).Q();
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    rt0 rt0Var2 = this.b;
                                    ArrayList arrayList2 = rt0Var2.y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    rt0Var2.f = booleanValue2;
                                    rt0Var2.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        for (int i13 = 0; i13 < size2; i13++) {
                                            ((st0) arrayList2.get(i13)).Q();
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        } else if (k2Var instanceof n90) {
            this.r = ((n90) k2Var).e;
        } else if (k2Var instanceof org.telegram.ui.ay) {
            this.r = k2Var.getUserConfig().e();
        }
        if (this.w == 0 && org.telegram.messenger.o5.z(this.r) && (M0 = k2Var.getMessagesController().M0(-this.r)) != null) {
            long j10 = M0.migrated_from_chat_id;
            if (j10 != 0) {
                this.w = -j10;
            }
        }
        this.n = new ot0[9];
        int i12 = 0;
        while (true) {
            ot0[] ot0VarArr = this.n;
            if (i12 >= ot0VarArr.length) {
                break;
            }
            ot0VarArr[i12] = new ot0();
            this.n[i12].j[0] = org.telegram.messenger.o5.C(this.r) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
            this.n[i12].j[1] = Integer.MAX_VALUE;
            i12++;
        }
        a();
        org.telegram.ui.ActionBar.k2 k2Var2 = this.x;
        if (k2Var2 == null) {
            this.E = null;
            return;
        }
        org.telegram.messenger.zs notificationCenter = k2Var2.getNotificationCenter();
        notificationCenter.getClass();
        xa.n nVar = new xa.n(notificationCenter, this);
        nVar.e(org.telegram.messenger.zs.X);
        nVar.e(org.telegram.messenger.zs.W);
        nVar.e(1);
        nVar.e(org.telegram.messenger.zs.K);
        nVar.e(org.telegram.messenger.zs.V);
        nVar.e(org.telegram.messenger.zs.w);
        nVar.e(org.telegram.messenger.zs.m0);
        nVar.e(org.telegram.messenger.zs.T);
        nVar.e(org.telegram.messenger.zs.Y1);
        nVar.e(org.telegram.messenger.zs.x5);
        nVar.e(org.telegram.messenger.zs.g3);
        this.E = nVar;
    }

    public final void a() {
        org.telegram.ui.ActionBar.k2 k2Var = this.x;
        if (k2Var == null) {
            return;
        }
        org.telegram.messenger.ui mediaDataController = k2Var.getMediaDataController();
        long j10 = this.s;
        mediaDataController.e0(this.r, k2Var.getClassGuid(), j10);
        if (this.w != 0) {
            k2Var.getMediaDataController().e0(this.w, k2Var.getClassGuid(), this.s);
        }
    }

    public final void b(org.telegram.ui.ActionBar.k2 k2Var) {
        if (k2Var != this.x) {
            return;
        }
        this.y.clear();
        xa.n nVar = this.E;
        if (nVar != null) {
            nVar.a();
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        org.telegram.ui.ActionBar.k2 k2Var = this.x;
        if (k2Var == null || chatFull == null) {
            return;
        }
        long j10 = chatFull.migrated_from_chat_id;
        if (j10 == 0 || this.w != 0) {
            return;
        }
        this.w = -j10;
        k2Var.getMediaDataController().e0(this.w, k2Var.getClassGuid(), this.s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f1  */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    @Override // org.telegram.messenger.us
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        int i12;
        int f02;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z11 = true;
        boolean z12 = false;
        int i17 = 0;
        if (i10 == org.telegram.messenger.zs.X) {
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
                    for (int i18 = 0; i18 < iArr.length; i18++) {
                        int i19 = this.a[i18];
                        if (i19 >= 0 && (i16 = this.b[i18]) >= 0) {
                            this.c[i18] = i19 + i16;
                        } else if (i19 >= 0) {
                            this.c[i18] = i19;
                        } else {
                            this.c[i18] = Math.max(this.b[i18], 0);
                        }
                        if (longValue == this.r && this.c[i18] != 0 && this.d[i18] != this.a[i18]) {
                            if (i18 == 0) {
                                int i20 = this.n[0].q;
                                if (i20 == 1) {
                                    i15 = 6;
                                } else if (i20 == 2) {
                                    i15 = 7;
                                }
                                this.x.getMediaDataController().N0(longValue, this.d[i18] == -1 ? 30 : 20, 0, 0, i15, longValue2, 1, this.x.getClassGuid(), this.n[i18].p, null, null);
                                this.d[i18] = this.a[i18];
                            }
                            i15 = i18;
                            this.x.getMediaDataController().N0(longValue, this.d[i18] == -1 ? 30 : 20, 0, 0, i15, longValue2, 1, this.x.getClassGuid(), this.n[i18].p, null, null);
                            this.d[i18] = this.a[i18];
                        } else if (longValue == this.w && this.c[i18] != 0 && this.e[i18] != this.b[i18]) {
                            if (i18 == 0) {
                                int i21 = this.n[0].q;
                                if (i21 == 1) {
                                    i14 = 6;
                                } else if (i21 == 2) {
                                    i14 = 7;
                                }
                                this.x.getMediaDataController().N0(longValue, this.e[i18] == -1 ? 30 : 20, 0, 0, i14, longValue2, 1, this.x.getClassGuid(), this.n[i18].p, null, null);
                                this.e[i18] = this.b[i18];
                            }
                            i14 = i18;
                            this.x.getMediaDataController().N0(longValue, this.e[i18] == -1 ? 30 : 20, 0, 0, i14, longValue2, 1, this.x.getClassGuid(), this.n[i18].p, null, null);
                            this.e[i18] = this.b[i18];
                        }
                    }
                    this.D = true;
                    int size = this.y.size();
                    for (int i22 = 0; i22 < size; i22++) {
                        ((st0) this.y.get(i22)).Q();
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == org.telegram.messenger.zs.W) {
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
                int i23 = this.a[intValue];
                if (i23 >= 0 && (i13 = this.b[intValue]) >= 0) {
                    this.c[intValue] = i23 + i13;
                } else if (i23 >= 0) {
                    this.c[intValue] = i23;
                } else {
                    this.c[intValue] = Math.max(this.b[intValue], 0);
                }
                int size2 = this.y.size();
                for (int i24 = 0; i24 < size2; i24++) {
                    ((st0) this.y.get(i24)).Q();
                }
                return;
            }
            return;
        }
        if (i10 == 1) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue5 = ((Long) objArr[0]).longValue();
            long j11 = this.r;
            if (longValue5 == j11 || longValue5 == this.w) {
                int i25 = longValue5 == j11 ? 0 : 1;
                boolean C = org.telegram.messenger.o5.C(longValue5);
                ArrayList arrayList = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.k2 k2Var = this.x;
                int currentAccount = k2Var != null ? k2Var.getCurrentAccount() : -1;
                for (int i26 = 0; i26 < arrayList.size(); i26++) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i26);
                    if (!org.telegram.messenger.jj.c3(jjVar.k)) {
                        long j12 = this.s;
                        if ((j12 == 0 || j12 == org.telegram.messenger.jj.c2(currentAccount, jjVar.k, true, false)) && org.telegram.messenger.jj.o1(jjVar.k) != null && !jjVar.m5() && (f02 = org.telegram.messenger.ui.f0(jjVar.k)) != -1 && ((f02 != 0 || this.n[0].q != 2 || org.telegram.messenger.jj.L4(jjVar.k)) && (f02 != 0 || this.n[0].q != 1 || !org.telegram.messenger.jj.L4(jjVar.k)))) {
                            ot0 ot0Var = this.n[f02];
                            if (ot0Var.l) {
                                ot0Var.a(jjVar, i25, true, C);
                            }
                            if (this.s == 0) {
                                int[] iArr2 = this.n[f02].f;
                                iArr2[i25] = iArr2[i25] + 1;
                            }
                            if (i25 == 0) {
                                for (int i27 = 0; i27 < this.n[f02].e.size(); i27++) {
                                    ((xs0) this.n[f02].e.get(i27)).b++;
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
        if (i10 != org.telegram.messenger.zs.K) {
            if (i10 == org.telegram.messenger.zs.V) {
                long longValue6 = ((Long) objArr[0]).longValue();
                if (((Integer) objArr[3]).intValue() == this.x.getClassGuid()) {
                    int intValue3 = ((Integer) objArr[4]).intValue();
                    ArrayList arrayList2 = (ArrayList) objArr[2];
                    boolean C2 = org.telegram.messenger.o5.C(longValue6);
                    int i28 = longValue6 == this.r ? 0 : 1;
                    if (intValue3 == 0 || intValue3 == 6 || intValue3 == 7) {
                        if (intValue3 != this.n[0].q) {
                            return;
                        } else {
                            intValue3 = 0;
                        }
                    }
                    if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                        this.n[intValue3].f[i28] = ((Integer) objArr[1]).intValue();
                    }
                    this.n[intValue3].i[i28] = ((Boolean) objArr[5]).booleanValue();
                    for (int i29 = 0; i29 < arrayList2.size(); i29++) {
                        this.n[intValue3].a((org.telegram.messenger.jj) arrayList2.get(i29), i28, false, C2);
                    }
                    return;
                }
                return;
            }
            if (i10 == org.telegram.messenger.zs.w) {
                if (((Boolean) objArr[2]).booleanValue()) {
                    return;
                }
                long longValue7 = ((Long) objArr[1]).longValue();
                TLRPC.Chat L0 = org.telegram.messenger.o5.z(this.r) ? this.x.getMessagesController().L0(Long.valueOf(-this.r)) : null;
                if (org.telegram.messenger.w3.T(L0)) {
                    if ((longValue7 != 0 || this.w == 0) && longValue7 != L0.id) {
                        return;
                    }
                } else if (longValue7 != 0) {
                    return;
                }
                ArrayList arrayList3 = (ArrayList) objArr[0];
                org.telegram.ui.ActionBar.k2 k2Var2 = this.x;
                int currentAccount2 = k2Var2 != null ? k2Var2.getCurrentAccount() : -1;
                int size3 = arrayList3.size();
                int i30 = 0;
                boolean z13 = false;
                while (i30 < size3) {
                    int i31 = 0;
                    boolean z14 = z13;
                    while (true) {
                        ot0[] ot0VarArr = this.n;
                        if (i31 < ot0VarArr.length) {
                            org.telegram.messenger.jj b10 = ot0VarArr[i31].b(((Integer) arrayList3.get(i30)).intValue(), 0);
                            if (b10 != null) {
                                if (org.telegram.messenger.jj.B0(b10.k) == this.r && (this.s == 0 || org.telegram.messenger.jj.c2(currentAccount2, b10.k, true, false) == this.s)) {
                                    int[] iArr3 = this.a;
                                    int i32 = iArr3[i31];
                                    if (i32 > 0) {
                                        iArr3[i31] = i32 - 1;
                                    }
                                } else {
                                    int[] iArr4 = this.b;
                                    int i33 = iArr4[i31];
                                    if (i33 > 0) {
                                        iArr4[i31] = i33 - 1;
                                    }
                                }
                                z14 = true;
                            }
                            i31++;
                            z14 = z14;
                        }
                    }
                    i30++;
                    z13 = z14;
                }
                if (z13) {
                    int i34 = 0;
                    while (true) {
                        int[] iArr5 = this.a;
                        if (i34 >= iArr5.length) {
                            break;
                        }
                        int i35 = iArr5[i34];
                        if (i35 >= 0 && (i12 = this.b[i34]) >= 0) {
                            this.c[i34] = i35 + i12;
                        } else if (i35 >= 0) {
                            this.c[i34] = i35;
                        } else {
                            this.c[i34] = Math.max(this.b[i34], 0);
                        }
                        i34++;
                    }
                    int size4 = this.y.size();
                    for (int i36 = 0; i36 < size4; i36++) {
                        ((st0) this.y.get(i36)).Q();
                    }
                }
                a();
                return;
            }
            if (i10 != org.telegram.messenger.zs.m0) {
                if (i10 == org.telegram.messenger.zs.T) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                    long j13 = this.r;
                    if (j13 >= 0 || chatFull.id != (-j13)) {
                        return;
                    }
                    c(chatFull);
                    return;
                }
                if (i10 == org.telegram.messenger.zs.Y1) {
                    ArrayList arrayList4 = new ArrayList();
                    int i37 = 0;
                    while (true) {
                        ot0[] ot0VarArr2 = this.n;
                        if (i37 >= ot0VarArr2.length) {
                            break;
                        }
                        arrayList4.addAll(ot0VarArr2[i37].a);
                        i37++;
                    }
                    String str = (String) objArr[0];
                    if (str != null) {
                        Utilities.e.c(new androidx.activity.g(arrayList4, str, i11, 6));
                        return;
                    }
                    return;
                }
                if (i10 == org.telegram.messenger.zs.g3) {
                    org.telegram.ui.ActionBar.k2 k2Var3 = this.x;
                    if (k2Var3 != null) {
                        org.telegram.messenger.gw F1 = k2Var3.getMessagesController().F1();
                        long j14 = this.r;
                        ArrayList arrayList5 = F1.j;
                        for (int i38 = 0; i38 < arrayList5.size(); i38++) {
                            if (((org.telegram.messenger.fw) arrayList5.get(i38)).a == j14) {
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
                    for (int i39 = 0; i39 < size5; i39++) {
                        ((st0) this.y.get(i39)).Q();
                    }
                    return;
                }
                return;
            }
            long longValue8 = ((Long) objArr[0]).longValue();
            long j15 = this.r;
            if (longValue8 == j15 || longValue8 == this.w) {
                int i40 = longValue8 == j15 ? 0 : 1;
                ArrayList arrayList6 = (ArrayList) objArr[1];
                org.telegram.ui.ActionBar.k2 k2Var4 = this.x;
                int currentAccount3 = k2Var4 != null ? k2Var4.getCurrentAccount() : -1;
                int size6 = arrayList6.size();
                int i41 = 0;
                while (i41 < size6) {
                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList6.get(i41);
                    int f12 = jjVar2.f1();
                    long c22 = org.telegram.messenger.jj.c2(currentAccount3, jjVar2.k, z11, z12);
                    int f03 = org.telegram.messenger.ui.f0(jjVar2.k);
                    boolean z15 = z12;
                    long j16 = this.s;
                    if (j16 == 0 || c22 == j16) {
                        ?? r72 = z15;
                        while (true) {
                            ot0[] ot0VarArr3 = this.n;
                            if (r72 >= ot0VarArr3.length) {
                                break;
                            }
                            org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) ot0VarArr3[r72].b[i40].get(f12);
                            if (jjVar3 != null) {
                                int f04 = org.telegram.messenger.ui.f0(jjVar2.k);
                                if (f03 == -1 || f04 != f03) {
                                    this.n[r72].b(f12, i40);
                                    if (i40 == 0) {
                                        int[] iArr6 = this.a;
                                        int i42 = iArr6[r72];
                                        if (i42 > 0) {
                                            iArr6[r72] = i42 - 1;
                                        }
                                    } else {
                                        int[] iArr7 = this.b;
                                        int i43 = iArr7[r72];
                                        if (i43 > 0) {
                                            iArr7[r72] = i43 - 1;
                                        }
                                    }
                                } else {
                                    int indexOf = this.n[r72].a.indexOf(jjVar3);
                                    if (indexOf >= 0) {
                                        this.n[r72].b[i40].put(f12, jjVar2);
                                        this.n[r72].a.set(indexOf, jjVar2);
                                    }
                                }
                            } else {
                                r72++;
                            }
                        }
                    }
                    i41++;
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
        Long l4 = (Long) objArr[3];
        if (l4.longValue() != this.r && l4.longValue() != this.w) {
            return;
        }
        int i44 = l4.longValue() == this.r ? 0 : 1;
        while (true) {
            ot0[] ot0VarArr4 = this.n;
            if (i17 >= ot0VarArr4.length) {
                return;
            }
            ot0VarArr4[i17].f(i44, num.intValue(), num2.intValue());
            i17++;
        }
    }
}
