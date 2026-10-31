package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class ft implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ot b;
    public final /* synthetic */ LongSparseIntArray c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ft(ot otVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = otVar;
        this.c = longSparseIntArray;
        this.d = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0228 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        Integer num;
        Integer num2;
        long j12;
        ft ftVar = this;
        switch (ftVar.a) {
            case 0:
                ot otVar = ftVar.b;
                a0.h hVar = otVar.c;
                ArrayList arrayList = otVar.b;
                a0.h hVar2 = otVar.r;
                ArrayList arrayList2 = otVar.a;
                a0.h hVar3 = otVar.f;
                int i12 = otVar.I;
                otVar.getAccountInstance().c();
                int i13 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray = ftVar.c;
                    int size = longSparseIntArray.size();
                    ArrayList arrayList3 = ftVar.d;
                    if (i13 >= size) {
                        if (!arrayList3.isEmpty()) {
                            i0.g3(new ct(otVar, arrayList3, 3));
                        }
                        if (i12 != otVar.I) {
                            if (otVar.K) {
                                otVar.Q(otVar.L > otVar.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList.clear();
                                otVar.Z(otVar.K);
                            }
                            i0.g3(new gt(otVar, hVar3.m(), 2));
                        }
                        otVar.K = false;
                        if (otVar.R) {
                            otVar.S(otVar.z());
                            break;
                        }
                    } else {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Integer num3 = (Integer) hVar3.f(keyAt);
                        int i14 = longSparseIntArray.get(keyAt);
                        if (o5.z(keyAt)) {
                            i10 = i13;
                            TLRPC.Chat L0 = otVar.getMessagesController().L0(Long.valueOf(-keyAt));
                            if (L0 == null || L0.min || w3.r0(L0) || w3.Y(L0)) {
                                i14 = 0;
                            }
                            if (L0 != null) {
                                i11 = i14;
                                z10 = L0.forum;
                                if (z10) {
                                    int u10 = otVar.u(keyAt, 0L);
                                    if (u10 == -1) {
                                        j10 = 0;
                                        z11 = otVar.D(keyAt, null, false, false);
                                        j11 = keyAt;
                                    } else {
                                        j10 = 0;
                                        j11 = keyAt;
                                        if (u10 == 2) {
                                            z11 = false;
                                        }
                                    }
                                    if (otVar.K && !z11 && (num = (Integer) hVar2.f(j11)) != null && num.intValue() != 0) {
                                        i11 = num.intValue();
                                        z11 = true;
                                    }
                                    if (i11 == 0) {
                                        otVar.e.l(j11);
                                    }
                                    if (i11 < 0) {
                                        if (num3 == null) {
                                            i13 = i10 + 1;
                                            ftVar = this;
                                        } else {
                                            i11 += num3.intValue();
                                        }
                                    }
                                    if ((!z11 || i11 == 0) && num3 != null) {
                                        if (otVar.getMessagesController().s2(j11)) {
                                            otVar.I -= num3.intValue() > 0 ? 1 : 0;
                                        } else {
                                            otVar.I -= num3.intValue();
                                        }
                                    }
                                    if (i11 == 0) {
                                        hVar3.l(j11);
                                        hVar2.l(j11);
                                        int i15 = 0;
                                        while (i15 < arrayList2.size()) {
                                            jj jjVar = (jj) arrayList2.get(i15);
                                            TLRPC.Message message = jjVar.k;
                                            if (!message.from_scheduled && jj.B0(message) == j11 && !jjVar.J) {
                                                if (ot.E(jjVar)) {
                                                    otVar.J--;
                                                }
                                                arrayList2.remove(i15);
                                                i15--;
                                                arrayList.remove(jjVar);
                                                long j13 = jjVar.k.peer_id.channel_id;
                                                long j14 = j13 != j10 ? -j13 : j10;
                                                SparseArray sparseArray = (SparseArray) hVar.f(j14);
                                                if (sparseArray != null) {
                                                    sparseArray.remove(jjVar.f1());
                                                    if (sparseArray.size() == 0) {
                                                        hVar.l(j14);
                                                    }
                                                }
                                                arrayList3.add(jjVar);
                                            }
                                            i15++;
                                        }
                                    } else if (z11) {
                                        if (!otVar.getMessagesController().o2(j11)) {
                                            if (otVar.getMessagesController().s2(j11)) {
                                                otVar.I += i11 <= 0 ? 0 : 1;
                                            } else {
                                                otVar.I += i11;
                                            }
                                        }
                                        hVar3.k(Integer.valueOf(i11), j11);
                                    }
                                    i13 = i10 + 1;
                                    ftVar = this;
                                } else {
                                    j10 = 0;
                                    j11 = keyAt;
                                }
                                z11 = true;
                                if (otVar.K) {
                                    i11 = num.intValue();
                                    z11 = true;
                                }
                                if (i11 == 0) {
                                }
                                if (i11 < 0) {
                                }
                                if (!z11) {
                                }
                                if (otVar.getMessagesController().s2(j11)) {
                                }
                                if (i11 == 0) {
                                }
                                i13 = i10 + 1;
                                ftVar = this;
                            }
                        } else {
                            i10 = i13;
                        }
                        i11 = i14;
                        z10 = false;
                        if (z10) {
                        }
                        z11 = true;
                        if (otVar.K) {
                        }
                        if (i11 == 0) {
                        }
                        if (i11 < 0) {
                        }
                        if (!z11) {
                        }
                        if (otVar.getMessagesController().s2(j11)) {
                        }
                        if (i11 == 0) {
                        }
                        i13 = i10 + 1;
                        ftVar = this;
                    }
                }
                break;
            default:
                ot otVar2 = ftVar.b;
                ArrayList arrayList4 = otVar2.b;
                a0.h hVar4 = otVar2.c;
                ArrayList arrayList5 = otVar2.a;
                a0.h hVar5 = otVar2.f;
                int i16 = otVar2.I;
                otVar2.getAccountInstance().c();
                Integer num4 = 0;
                int i17 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray2 = ftVar.c;
                    int size2 = longSparseIntArray2.size();
                    ArrayList arrayList6 = ftVar.d;
                    if (i17 >= size2) {
                        if (arrayList6.isEmpty()) {
                            i0.g3(new ct(otVar2, arrayList6, 4));
                        }
                        if (i16 != otVar2.I) {
                            if (otVar2.K) {
                                otVar2.Q(otVar2.L > otVar2.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList4.clear();
                                otVar2.Z(otVar2.K);
                            }
                            i0.g3(new gt(otVar2, hVar5.m(), 3));
                        }
                        otVar2.K = false;
                        if (otVar2.R) {
                            otVar2.S(otVar2.z());
                            break;
                        }
                    } else {
                        long keyAt2 = longSparseIntArray2.keyAt(i17);
                        Integer num5 = num4;
                        long j15 = -keyAt2;
                        long j16 = longSparseIntArray2.get(keyAt2);
                        Integer num6 = (Integer) hVar5.f(j15);
                        if (num6 == null) {
                            num6 = num5;
                        }
                        Integer num7 = num6;
                        int i18 = 0;
                        while (i18 < arrayList5.size()) {
                            jj jjVar2 = (jj) arrayList5.get(i18);
                            int i19 = i17;
                            if (jj.B0(jjVar2.k) == j15) {
                                j12 = j16;
                                if (jjVar2.f1() <= j12) {
                                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j15);
                                    if (sparseArray2 != null) {
                                        sparseArray2.remove(jjVar2.f1());
                                        if (sparseArray2.size() == 0) {
                                            hVar4.l(j15);
                                        }
                                    }
                                    arrayList4.remove(jjVar2);
                                    arrayList5.remove(jjVar2);
                                    i18--;
                                    if (ot.E(jjVar2)) {
                                        otVar2.J--;
                                    }
                                    arrayList6.add(jjVar2);
                                    num7 = Integer.valueOf(num7.intValue() - 1);
                                }
                            } else {
                                j12 = j16;
                            }
                            i18++;
                            i17 = i19;
                            j16 = j12;
                        }
                        int i20 = i17;
                        if (num7.intValue() <= 0) {
                            otVar2.e.l(j15);
                            num2 = num5;
                        } else {
                            num2 = num7;
                        }
                        if (!num2.equals(num6)) {
                            if (!otVar2.getMessagesController().o2(j15)) {
                                if (otVar2.getMessagesController().s2(j15)) {
                                    int i21 = otVar2.I - (num6.intValue() > 0 ? 1 : 0);
                                    otVar2.I = i21;
                                    otVar2.I = i21 + (num2.intValue() > 0 ? 1 : 0);
                                } else {
                                    int intValue = otVar2.I - num6.intValue();
                                    otVar2.I = intValue;
                                    otVar2.I = num2.intValue() + intValue;
                                }
                            }
                            hVar5.k(num2, j15);
                        }
                        if (num2.intValue() == 0) {
                            hVar5.l(j15);
                            otVar2.r.l(j15);
                        }
                        i17 = i20 + 1;
                        num4 = num5;
                    }
                }
                break;
        }
    }
}
