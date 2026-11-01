package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class gt implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pt b;
    public final /* synthetic */ LongSparseIntArray c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ gt(pt ptVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i10) {
        this.a = i10;
        this.b = ptVar;
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
        gt gtVar = this;
        switch (gtVar.a) {
            case 0:
                pt ptVar = gtVar.b;
                a0.h hVar = ptVar.c;
                ArrayList arrayList = ptVar.b;
                a0.h hVar2 = ptVar.r;
                ArrayList arrayList2 = ptVar.a;
                a0.h hVar3 = ptVar.f;
                int i12 = ptVar.I;
                ptVar.getAccountInstance().c();
                int i13 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray = gtVar.c;
                    int size = longSparseIntArray.size();
                    ArrayList arrayList3 = gtVar.d;
                    if (i13 >= size) {
                        if (!arrayList3.isEmpty()) {
                            i0.g3(new dt(ptVar, arrayList3, 3));
                        }
                        if (i12 != ptVar.I) {
                            if (ptVar.K) {
                                ptVar.Q(ptVar.L > ptVar.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList.clear();
                                ptVar.Z(ptVar.K);
                            }
                            i0.g3(new ht(ptVar, hVar3.m(), 2));
                        }
                        ptVar.K = false;
                        if (ptVar.R) {
                            ptVar.S(ptVar.z());
                            break;
                        }
                    } else {
                        long keyAt = longSparseIntArray.keyAt(i13);
                        Integer num3 = (Integer) hVar3.f(keyAt);
                        int i14 = longSparseIntArray.get(keyAt);
                        if (o5.z(keyAt)) {
                            i10 = i13;
                            TLRPC.Chat L0 = ptVar.getMessagesController().L0(Long.valueOf(-keyAt));
                            if (L0 == null || L0.min || w3.r0(L0) || w3.Y(L0)) {
                                i14 = 0;
                            }
                            if (L0 != null) {
                                i11 = i14;
                                z10 = L0.forum;
                                if (z10) {
                                    int u10 = ptVar.u(keyAt, 0L);
                                    if (u10 == -1) {
                                        j10 = 0;
                                        z11 = ptVar.D(keyAt, null, false, false);
                                        j11 = keyAt;
                                    } else {
                                        j10 = 0;
                                        j11 = keyAt;
                                        if (u10 == 2) {
                                            z11 = false;
                                        }
                                    }
                                    if (ptVar.K && !z11 && (num = (Integer) hVar2.f(j11)) != null && num.intValue() != 0) {
                                        i11 = num.intValue();
                                        z11 = true;
                                    }
                                    if (i11 == 0) {
                                        ptVar.e.l(j11);
                                    }
                                    if (i11 < 0) {
                                        if (num3 == null) {
                                            i13 = i10 + 1;
                                            gtVar = this;
                                        } else {
                                            i11 += num3.intValue();
                                        }
                                    }
                                    if ((!z11 || i11 == 0) && num3 != null) {
                                        if (ptVar.getMessagesController().s2(j11)) {
                                            ptVar.I -= num3.intValue() > 0 ? 1 : 0;
                                        } else {
                                            ptVar.I -= num3.intValue();
                                        }
                                    }
                                    if (i11 == 0) {
                                        hVar3.l(j11);
                                        hVar2.l(j11);
                                        int i15 = 0;
                                        while (i15 < arrayList2.size()) {
                                            kj kjVar = (kj) arrayList2.get(i15);
                                            TLRPC.Message message = kjVar.k;
                                            if (!message.from_scheduled && kj.B0(message) == j11 && !kjVar.J) {
                                                if (pt.E(kjVar)) {
                                                    ptVar.J--;
                                                }
                                                arrayList2.remove(i15);
                                                i15--;
                                                arrayList.remove(kjVar);
                                                long j13 = kjVar.k.peer_id.channel_id;
                                                long j14 = j13 != j10 ? -j13 : j10;
                                                SparseArray sparseArray = (SparseArray) hVar.f(j14);
                                                if (sparseArray != null) {
                                                    sparseArray.remove(kjVar.f1());
                                                    if (sparseArray.size() == 0) {
                                                        hVar.l(j14);
                                                    }
                                                }
                                                arrayList3.add(kjVar);
                                            }
                                            i15++;
                                        }
                                    } else if (z11) {
                                        if (!ptVar.getMessagesController().o2(j11)) {
                                            if (ptVar.getMessagesController().s2(j11)) {
                                                ptVar.I += i11 <= 0 ? 0 : 1;
                                            } else {
                                                ptVar.I += i11;
                                            }
                                        }
                                        hVar3.k(Integer.valueOf(i11), j11);
                                    }
                                    i13 = i10 + 1;
                                    gtVar = this;
                                } else {
                                    j10 = 0;
                                    j11 = keyAt;
                                }
                                z11 = true;
                                if (ptVar.K) {
                                    i11 = num.intValue();
                                    z11 = true;
                                }
                                if (i11 == 0) {
                                }
                                if (i11 < 0) {
                                }
                                if (!z11) {
                                }
                                if (ptVar.getMessagesController().s2(j11)) {
                                }
                                if (i11 == 0) {
                                }
                                i13 = i10 + 1;
                                gtVar = this;
                            }
                        } else {
                            i10 = i13;
                        }
                        i11 = i14;
                        z10 = false;
                        if (z10) {
                        }
                        z11 = true;
                        if (ptVar.K) {
                        }
                        if (i11 == 0) {
                        }
                        if (i11 < 0) {
                        }
                        if (!z11) {
                        }
                        if (ptVar.getMessagesController().s2(j11)) {
                        }
                        if (i11 == 0) {
                        }
                        i13 = i10 + 1;
                        gtVar = this;
                    }
                }
                break;
            default:
                pt ptVar2 = gtVar.b;
                ArrayList arrayList4 = ptVar2.b;
                a0.h hVar4 = ptVar2.c;
                ArrayList arrayList5 = ptVar2.a;
                a0.h hVar5 = ptVar2.f;
                int i16 = ptVar2.I;
                ptVar2.getAccountInstance().c();
                Integer num4 = 0;
                int i17 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray2 = gtVar.c;
                    int size2 = longSparseIntArray2.size();
                    ArrayList arrayList6 = gtVar.d;
                    if (i17 >= size2) {
                        if (arrayList6.isEmpty()) {
                            i0.g3(new dt(ptVar2, arrayList6, 4));
                        }
                        if (i16 != ptVar2.I) {
                            if (ptVar2.K) {
                                ptVar2.Q(ptVar2.L > ptVar2.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList4.clear();
                                ptVar2.Z(ptVar2.K);
                            }
                            i0.g3(new ht(ptVar2, hVar5.m(), 3));
                        }
                        ptVar2.K = false;
                        if (ptVar2.R) {
                            ptVar2.S(ptVar2.z());
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
                            kj kjVar2 = (kj) arrayList5.get(i18);
                            int i19 = i17;
                            if (kj.B0(kjVar2.k) == j15) {
                                j12 = j16;
                                if (kjVar2.f1() <= j12) {
                                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j15);
                                    if (sparseArray2 != null) {
                                        sparseArray2.remove(kjVar2.f1());
                                        if (sparseArray2.size() == 0) {
                                            hVar4.l(j15);
                                        }
                                    }
                                    arrayList4.remove(kjVar2);
                                    arrayList5.remove(kjVar2);
                                    i18--;
                                    if (pt.E(kjVar2)) {
                                        ptVar2.J--;
                                    }
                                    arrayList6.add(kjVar2);
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
                            ptVar2.e.l(j15);
                            num2 = num5;
                        } else {
                            num2 = num7;
                        }
                        if (!num2.equals(num6)) {
                            if (!ptVar2.getMessagesController().o2(j15)) {
                                if (ptVar2.getMessagesController().s2(j15)) {
                                    int i21 = ptVar2.I - (num6.intValue() > 0 ? 1 : 0);
                                    ptVar2.I = i21;
                                    ptVar2.I = i21 + (num2.intValue() > 0 ? 1 : 0);
                                } else {
                                    int intValue = ptVar2.I - num6.intValue();
                                    ptVar2.I = intValue;
                                    ptVar2.I = num2.intValue() + intValue;
                                }
                            }
                            hVar5.k(num2, j15);
                        }
                        if (num2.intValue() == 0) {
                            hVar5.l(j15);
                            ptVar2.r.l(j15);
                        }
                        i17 = i20 + 1;
                        num4 = num5;
                    }
                }
                break;
        }
    }
}
