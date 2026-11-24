// default package

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class fha implements jm7 {
    public boolean E;
    public final e7a F;
    public boolean f;
    public boolean h;
    public final cha[] n;
    public final long r;
    public final long s;
    public long w;
    public final d x;
    public int[] a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public int[] b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] c = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] d = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final int[] e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    public final ArrayList y = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    public fha(d dVar) {
        TLRPC.ChatFull M0;
        this.x = dVar;
        final byte b = 0;
        final byte b2 = 1;
        if (dVar instanceof f02) {
            f02 f02Var = (f02) dVar;
            long a = f02Var.a();
            this.r = a;
            this.w = f02Var.M();
            this.s = f02Var.d();
            if (a != dVar.getUserConfig().e()) {
                dVar.getMessagesController().E1().f(a, new qac(this) { // from class: eha
                    public final /* synthetic */ fha b;

                    {
                        this.b = this;
                    }

                    @Override // qac
                    public final void a(Object obj) {
                        byte b3 = b;
                        int i = 0;
                        fha fhaVar = this.b;
                        Boolean bool = (Boolean) obj;
                        switch (b3) {
                            case 0:
                                ArrayList arrayList = fhaVar.y;
                                boolean booleanValue = bool.booleanValue();
                                fhaVar.f = booleanValue;
                                fhaVar.h = true;
                                if (booleanValue) {
                                    int size = arrayList.size();
                                    while (i < size) {
                                        ((gha) arrayList.get(i)).Q();
                                        i++;
                                    }
                                    break;
                                }
                                break;
                            default:
                                ArrayList arrayList2 = fhaVar.y;
                                boolean booleanValue2 = bool.booleanValue();
                                fhaVar.f = booleanValue2;
                                fhaVar.h = true;
                                if (booleanValue2) {
                                    int size2 = arrayList2.size();
                                    while (i < size2) {
                                        ((gha) arrayList2.get(i)).Q();
                                        i++;
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        } else if (dVar instanceof ProfileActivity) {
            ProfileActivity profileActivity = (ProfileActivity) dVar;
            if (profileActivity.h1) {
                this.r = profileActivity.getUserConfig().e();
                this.s = profileActivity.a();
            } else {
                long a2 = profileActivity.a();
                this.r = a2;
                this.s = profileActivity.g1;
                TLRPC.ChatFull chatFull = profileActivity.v2;
                if (chatFull != null) {
                    c(chatFull);
                }
                if (a2 != dVar.getUserConfig().e()) {
                    dVar.getMessagesController().E1().f(a2, new qac(this) { // from class: eha
                        public final /* synthetic */ fha b;

                        {
                            this.b = this;
                        }

                        @Override // qac
                        public final void a(Object obj) {
                            byte b3 = b2;
                            int i = 0;
                            fha fhaVar = this.b;
                            Boolean bool = (Boolean) obj;
                            switch (b3) {
                                case 0:
                                    ArrayList arrayList = fhaVar.y;
                                    boolean booleanValue = bool.booleanValue();
                                    fhaVar.f = booleanValue;
                                    fhaVar.h = true;
                                    if (booleanValue) {
                                        int size = arrayList.size();
                                        while (i < size) {
                                            ((gha) arrayList.get(i)).Q();
                                            i++;
                                        }
                                        break;
                                    }
                                    break;
                                default:
                                    ArrayList arrayList2 = fhaVar.y;
                                    boolean booleanValue2 = bool.booleanValue();
                                    fhaVar.f = booleanValue2;
                                    fhaVar.h = true;
                                    if (booleanValue2) {
                                        int size2 = arrayList2.size();
                                        while (i < size2) {
                                            ((gha) arrayList2.get(i)).Q();
                                            i++;
                                        }
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                }
            }
        } else if (dVar instanceof cm6) {
            this.r = ((cm6) dVar).e;
        } else if (dVar instanceof nk3) {
            this.r = dVar.getUserConfig().e();
        }
        if (this.w == 0 && pg3.y(this.r) && (M0 = dVar.getMessagesController().M0(-this.r)) != null) {
            long j = M0.migrated_from_chat_id;
            if (j != 0) {
                this.w = -j;
            }
        }
        this.n = new cha[9];
        int i = 0;
        while (true) {
            cha[] chaVarArr = this.n;
            if (i >= chaVarArr.length) {
                break;
            }
            chaVarArr[i] = new cha();
            this.n[i].j[0] = pg3.B(this.r) ? TLObject.FLAG_31 : Integer.MAX_VALUE;
            this.n[i].j[1] = Integer.MAX_VALUE;
            i++;
        }
        a();
        d dVar2 = this.x;
        if (dVar2 == null) {
            this.F = null;
            return;
        }
        nm7 notificationCenter = dVar2.getNotificationCenter();
        notificationCenter.getClass();
        e7a e7aVar = new e7a(notificationCenter, this);
        e7aVar.b(nm7.X);
        e7aVar.b(nm7.W);
        e7aVar.b(1);
        e7aVar.b(nm7.J);
        e7aVar.b(nm7.V);
        e7aVar.b(nm7.v);
        e7aVar.b(nm7.m0);
        e7aVar.b(nm7.T);
        e7aVar.b(nm7.Y1);
        e7aVar.b(nm7.B5);
        e7aVar.b(nm7.i3);
        this.F = e7aVar;
    }

    public final void a() {
        d dVar = this.x;
        if (dVar != null) {
            hs6 mediaDataController = dVar.getMediaDataController();
            long j = this.s;
            mediaDataController.g0(this.r, dVar.getClassGuid(), j);
            if (this.w != 0) {
                dVar.getMediaDataController().g0(this.w, dVar.getClassGuid(), this.s);
            }
        }
    }

    public final void b(d dVar) {
        if (dVar == this.x) {
            this.y.clear();
            e7a e7aVar = this.F;
            if (e7aVar != null) {
                e7aVar.a();
            }
        }
    }

    public final void c(TLRPC.ChatFull chatFull) {
        d dVar = this.x;
        if (dVar == null || chatFull == null) {
            return;
        }
        long j = chatFull.migrated_from_chat_id;
        if (j == 0 || this.w != 0) {
            return;
        }
        this.w = -j;
        dVar.getMediaDataController().g0(this.w, dVar.getClassGuid(), this.s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ef  */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [int] */
    @Override // jm7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        int i3;
        int i4;
        int i5;
        int h0;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2 = true;
        boolean z3 = false;
        int i10 = 0;
        if (i == nm7.X) {
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (this.s == longValue2) {
                long j = this.r;
                if (longValue == j || longValue == this.w) {
                    int[] iArr = (int[]) objArr[2];
                    if (longValue == j) {
                        this.a = iArr;
                    } else {
                        this.b = iArr;
                    }
                    for (int i11 = 0; i11 < iArr.length; i11++) {
                        int i12 = this.a[i11];
                        if (i12 < 0 || (i9 = this.b[i11]) < 0) {
                            int[] iArr2 = this.c;
                            if (i12 >= 0) {
                                iArr2[i11] = i12;
                            } else {
                                iArr2[i11] = Math.max(this.b[i11], 0);
                            }
                        } else {
                            this.c[i11] = i12 + i9;
                        }
                        if (longValue == this.r && this.c[i11] != 0 && this.d[i11] != this.a[i11]) {
                            if (i11 == 0) {
                                byte b = this.n[0].q;
                                if (b == 1) {
                                    i8 = 6;
                                } else if (b == 2) {
                                    i8 = 7;
                                }
                                this.x.getMediaDataController().P0(longValue, this.d[i11] == -1 ? 30 : 20, 0, 0, i8, longValue2, 1, this.x.getClassGuid(), this.n[i11].p, null, null);
                                this.d[i11] = this.a[i11];
                            }
                            i8 = i11;
                            this.x.getMediaDataController().P0(longValue, this.d[i11] == -1 ? 30 : 20, 0, 0, i8, longValue2, 1, this.x.getClassGuid(), this.n[i11].p, null, null);
                            this.d[i11] = this.a[i11];
                        } else if (longValue == this.w && this.c[i11] != 0 && this.e[i11] != this.b[i11]) {
                            if (i11 == 0) {
                                byte b2 = this.n[0].q;
                                if (b2 == 1) {
                                    i7 = 6;
                                } else if (b2 == 2) {
                                    i7 = 7;
                                }
                                this.x.getMediaDataController().P0(longValue, this.e[i11] == -1 ? 30 : 20, 0, 0, i7, longValue2, 1, this.x.getClassGuid(), this.n[i11].p, null, null);
                                this.e[i11] = this.b[i11];
                            }
                            i7 = i11;
                            this.x.getMediaDataController().P0(longValue, this.e[i11] == -1 ? 30 : 20, 0, 0, i7, longValue2, 1, this.x.getClassGuid(), this.n[i11].p, null, null);
                            this.e[i11] = this.b[i11];
                        }
                    }
                    this.E = true;
                    int size = this.y.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ((gha) this.y.get(i13)).Q();
                    }
                    return;
                }
                return;
            }
            return;
        }
        byte b3 = 4;
        if (i == nm7.W) {
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
                int i14 = this.a[intValue];
                if (i14 < 0 || (i6 = this.b[intValue]) < 0) {
                    int[] iArr3 = this.c;
                    if (i14 >= 0) {
                        iArr3[intValue] = i14;
                    } else {
                        iArr3[intValue] = Math.max(this.b[intValue], 0);
                    }
                } else {
                    this.c[intValue] = i14 + i6;
                }
                int size2 = this.y.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    ((gha) this.y.get(i15)).Q();
                }
                return;
            }
            return;
        }
        if (i == 1) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue5 = ((Long) objArr[0]).longValue();
            if (longValue5 == this.r) {
                i5 = 0;
            } else if (longValue5 != this.w) {
                return;
            } else {
                i5 = 1;
            }
            boolean B = pg3.B(longValue5);
            ArrayList arrayList = (ArrayList) objArr[1];
            d dVar = this.x;
            int currentAccount = dVar != null ? dVar.getCurrentAccount() : -1;
            for (int i16 = 0; i16 < arrayList.size(); i16++) {
                k47 k47Var = (k47) arrayList.get(i16);
                if (!k47.c3(k47Var.k)) {
                    long j2 = this.s;
                    if ((j2 == 0 || j2 == k47.b2(currentAccount, k47Var.k, true, false)) && k47.n1(k47Var.k) != null && !k47Var.l5() && (h0 = hs6.h0(k47Var.k)) != -1 && ((h0 != 0 || this.n[0].q != 2 || k47.K4(k47Var.k)) && (h0 != 0 || this.n[0].q != 1 || !k47.K4(k47Var.k)))) {
                        cha chaVar = this.n[h0];
                        if (chaVar.l) {
                            chaVar.a(k47Var, i5, true, B);
                        }
                        if (this.s == 0) {
                            int[] iArr4 = this.n[h0].f;
                            iArr4[i5] = iArr4[i5] + 1;
                        }
                        if (i5 == 0) {
                            for (int i17 = 0; i17 < this.n[h0].e.size(); i17++) {
                                ((nga) this.n[h0].e.get(i17)).b++;
                            }
                        }
                    }
                }
            }
            a();
            return;
        }
        if (i != nm7.J) {
            if (i == nm7.V) {
                long longValue6 = ((Long) objArr[0]).longValue();
                if (((Integer) objArr[3]).intValue() == this.x.getClassGuid()) {
                    int intValue3 = ((Integer) objArr[4]).intValue();
                    ArrayList arrayList2 = (ArrayList) objArr[2];
                    boolean B2 = pg3.B(longValue6);
                    int i18 = longValue6 == this.r ? 0 : 1;
                    if (intValue3 == 0 || intValue3 == 6 || intValue3 == 7) {
                        if (intValue3 != this.n[0].q) {
                            return;
                        } else {
                            intValue3 = 0;
                        }
                    }
                    if (intValue3 != 0 && intValue3 != 1 && intValue3 != 2 && intValue3 != 4) {
                        this.n[intValue3].f[i18] = ((Integer) objArr[1]).intValue();
                    }
                    this.n[intValue3].i[i18] = ((Boolean) objArr[5]).booleanValue();
                    for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                        this.n[intValue3].a((k47) arrayList2.get(i19), i18, false, B2);
                    }
                    return;
                }
                return;
            }
            if (i == nm7.v) {
                if (((Boolean) objArr[2]).booleanValue()) {
                    return;
                }
                long longValue7 = ((Long) objArr[1]).longValue();
                TLRPC.Chat L0 = pg3.y(this.r) ? this.x.getMessagesController().L0(Long.valueOf(-this.r)) : null;
                if (sd2.T(L0)) {
                    if ((longValue7 != 0 || this.w == 0) && longValue7 != L0.id) {
                        return;
                    }
                } else if (longValue7 != 0) {
                    return;
                }
                ArrayList arrayList3 = (ArrayList) objArr[0];
                d dVar2 = this.x;
                int currentAccount2 = dVar2 != null ? dVar2.getCurrentAccount() : -1;
                int size3 = arrayList3.size();
                int i20 = 0;
                boolean z4 = false;
                while (i20 < size3) {
                    int i21 = 0;
                    boolean z5 = z4;
                    while (true) {
                        cha[] chaVarArr = this.n;
                        if (i21 < chaVarArr.length) {
                            k47 b4 = chaVarArr[i21].b(((Integer) arrayList3.get(i20)).intValue(), 0);
                            if (b4 != null) {
                                if (k47.B0(b4.k) == this.r && (this.s == 0 || k47.b2(currentAccount2, b4.k, true, false) == this.s)) {
                                    int[] iArr5 = this.a;
                                    int i22 = iArr5[i21];
                                    if (i22 > 0) {
                                        iArr5[i21] = i22 - 1;
                                    }
                                } else {
                                    int[] iArr6 = this.b;
                                    int i23 = iArr6[i21];
                                    if (i23 > 0) {
                                        iArr6[i21] = i23 - 1;
                                    }
                                }
                                z5 = true;
                            }
                            i21++;
                            z5 = z5;
                        }
                    }
                    i20++;
                    z4 = z5;
                }
                if (z4) {
                    int i24 = 0;
                    while (true) {
                        int[] iArr7 = this.a;
                        if (i24 >= iArr7.length) {
                            break;
                        }
                        int i25 = iArr7[i24];
                        if (i25 < 0 || (i4 = this.b[i24]) < 0) {
                            int[] iArr8 = this.c;
                            if (i25 >= 0) {
                                iArr8[i24] = i25;
                            } else {
                                iArr8[i24] = Math.max(this.b[i24], 0);
                            }
                        } else {
                            this.c[i24] = i25 + i4;
                        }
                        i24++;
                    }
                    int size4 = this.y.size();
                    for (int i26 = 0; i26 < size4; i26++) {
                        ((gha) this.y.get(i26)).Q();
                    }
                }
                a();
                return;
            }
            if (i != nm7.m0) {
                if (i == nm7.T) {
                    TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                    long j3 = this.r;
                    if (j3 >= 0 || chatFull.id != (-j3)) {
                        return;
                    }
                    c(chatFull);
                    return;
                }
                if (i == nm7.Y1) {
                    ArrayList arrayList4 = new ArrayList();
                    int i27 = 0;
                    while (true) {
                        cha[] chaVarArr2 = this.n;
                        if (i27 >= chaVarArr2.length) {
                            break;
                        }
                        arrayList4.addAll(chaVarArr2[i27].a);
                        i27++;
                    }
                    String str = (String) objArr[0];
                    if (str != null) {
                        Utilities.e.c(new jr(arrayList4, str, i2, b3));
                        return;
                    }
                    return;
                }
                if (i == nm7.i3) {
                    d dVar3 = this.x;
                    if (dVar3 != null) {
                        wr9 E1 = dVar3.getMessagesController().E1();
                        long j4 = this.r;
                        ArrayList arrayList5 = E1.j;
                        for (int i28 = 0; i28 < arrayList5.size(); i28++) {
                            if (((vr9) arrayList5.get(i28)).a == j4) {
                                z = true;
                                break;
                            }
                        }
                    }
                    z = false;
                    if (!this.h || this.f == z) {
                        return;
                    }
                    this.f = z;
                    int size5 = this.y.size();
                    for (int i29 = 0; i29 < size5; i29++) {
                        ((gha) this.y.get(i29)).Q();
                    }
                    return;
                }
                return;
            }
            long longValue8 = ((Long) objArr[0]).longValue();
            if (longValue8 == this.r) {
                i3 = 0;
            } else if (longValue8 != this.w) {
                return;
            } else {
                i3 = 1;
            }
            ArrayList arrayList6 = (ArrayList) objArr[1];
            d dVar4 = this.x;
            int currentAccount3 = dVar4 != null ? dVar4.getCurrentAccount() : -1;
            int size6 = arrayList6.size();
            int i30 = 0;
            while (i30 < size6) {
                k47 k47Var2 = (k47) arrayList6.get(i30);
                int e1 = k47Var2.e1();
                long b22 = k47.b2(currentAccount3, k47Var2.k, z2, z3);
                int h02 = hs6.h0(k47Var2.k);
                boolean z6 = z3;
                long j5 = this.s;
                if (j5 == 0 || b22 == j5) {
                    ?? r7 = z6;
                    while (true) {
                        cha[] chaVarArr3 = this.n;
                        if (r7 >= chaVarArr3.length) {
                            break;
                        }
                        k47 k47Var3 = (k47) chaVarArr3[r7].b[i3].get(e1);
                        if (k47Var3 != null) {
                            int h03 = hs6.h0(k47Var2.k);
                            if (h02 == -1 || h03 != h02) {
                                this.n[r7].b(e1, i3);
                                if (i3 == 0) {
                                    int[] iArr9 = this.a;
                                    int i31 = iArr9[r7];
                                    if (i31 > 0) {
                                        iArr9[r7] = i31 - 1;
                                    }
                                } else {
                                    int[] iArr10 = this.b;
                                    int i32 = iArr10[r7];
                                    if (i32 > 0) {
                                        iArr10[r7] = i32 - 1;
                                    }
                                }
                            } else {
                                int indexOf = this.n[r7].a.indexOf(k47Var3);
                                if (indexOf >= 0) {
                                    this.n[r7].b[i3].put(e1, k47Var2);
                                    this.n[r7].a.set(indexOf, k47Var2);
                                }
                            }
                        } else {
                            r7++;
                        }
                    }
                }
                i30++;
                z3 = z6;
                z2 = true;
            }
            return;
        }
        if (((Boolean) objArr[6]).booleanValue()) {
            return;
        }
        Integer num = (Integer) objArr[0];
        Integer num2 = (Integer) objArr[1];
        Long l = (Long) objArr[3];
        if (l.longValue() != this.r && l.longValue() != this.w) {
            return;
        }
        int i33 = l.longValue() == this.r ? 0 : 1;
        while (true) {
            cha[] chaVarArr4 = this.n;
            if (i10 >= chaVarArr4.length) {
                return;
            }
            chaVarArr4[i10].f(i33, num.intValue(), num2.intValue());
            i10++;
        }
    }
}
