package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ns implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;
    public final /* synthetic */ LongSparseIntArray c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ns(us usVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i3) {
        this.a = i3;
        this.b = usVar;
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
        int i3;
        int i10;
        boolean z10;
        long j10;
        long j11;
        boolean z11;
        Integer num;
        Integer num2;
        long j12;
        ns nsVar = this;
        switch (nsVar.a) {
            case 0:
                us usVar = nsVar.b;
                a0.h hVar = usVar.c;
                ArrayList arrayList = usVar.b;
                a0.h hVar2 = usVar.r;
                ArrayList arrayList2 = usVar.a;
                a0.h hVar3 = usVar.f;
                int i11 = usVar.J;
                usVar.getAccountInstance().c();
                int i12 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray = nsVar.c;
                    int size = longSparseIntArray.size();
                    ArrayList arrayList3 = nsVar.d;
                    if (i12 >= size) {
                        if (!arrayList3.isEmpty()) {
                            g0.h3(new ks(usVar, arrayList3, 3));
                        }
                        if (i11 != usVar.J) {
                            if (usVar.L) {
                                usVar.Q(usVar.M > usVar.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList.clear();
                                usVar.Z(usVar.L);
                            }
                            g0.h3(new os(usVar, hVar3.m(), 2));
                        }
                        usVar.L = false;
                        if (usVar.S) {
                            usVar.S(usVar.z());
                            break;
                        }
                    } else {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Integer num3 = (Integer) hVar3.f(keyAt);
                        int i13 = longSparseIntArray.get(keyAt);
                        if (m5.z(keyAt)) {
                            i3 = i12;
                            TLRPC.Chat M0 = usVar.getMessagesController().M0(Long.valueOf(-keyAt));
                            if (M0 == null || M0.min || t3.r0(M0) || t3.Y(M0)) {
                                i13 = 0;
                            }
                            if (M0 != null) {
                                i10 = i13;
                                z10 = M0.forum;
                                if (z10) {
                                    int u10 = usVar.u(keyAt, 0L);
                                    if (u10 == -1) {
                                        j10 = 0;
                                        z11 = usVar.D(keyAt, null, false, false);
                                        j11 = keyAt;
                                    } else {
                                        j10 = 0;
                                        j11 = keyAt;
                                        if (u10 == 2) {
                                            z11 = false;
                                        }
                                    }
                                    if (usVar.L && !z11 && (num = (Integer) hVar2.f(j11)) != null && num.intValue() != 0) {
                                        i10 = num.intValue();
                                        z11 = true;
                                    }
                                    if (i10 == 0) {
                                        usVar.e.l(j11);
                                    }
                                    if (i10 < 0) {
                                        if (num3 == null) {
                                            i12 = i3 + 1;
                                            nsVar = this;
                                        } else {
                                            i10 += num3.intValue();
                                        }
                                    }
                                    if ((!z11 || i10 == 0) && num3 != null) {
                                        if (usVar.getMessagesController().t2(j11)) {
                                            usVar.J -= num3.intValue() > 0 ? 1 : 0;
                                        } else {
                                            usVar.J -= num3.intValue();
                                        }
                                    }
                                    if (i10 == 0) {
                                        hVar3.l(j11);
                                        hVar2.l(j11);
                                        int i14 = 0;
                                        while (i14 < arrayList2.size()) {
                                            zi ziVar = (zi) arrayList2.get(i14);
                                            TLRPC.Message message = ziVar.k;
                                            if (!message.from_scheduled && zi.B0(message) == j11 && !ziVar.J) {
                                                if (us.E(ziVar)) {
                                                    usVar.K--;
                                                }
                                                arrayList2.remove(i14);
                                                i14--;
                                                arrayList.remove(ziVar);
                                                long j13 = ziVar.k.peer_id.channel_id;
                                                long j14 = j13 != j10 ? -j13 : j10;
                                                SparseArray sparseArray = (SparseArray) hVar.f(j14);
                                                if (sparseArray != null) {
                                                    sparseArray.remove(ziVar.f1());
                                                    if (sparseArray.size() == 0) {
                                                        hVar.l(j14);
                                                    }
                                                }
                                                arrayList3.add(ziVar);
                                            }
                                            i14++;
                                        }
                                    } else if (z11) {
                                        if (!usVar.getMessagesController().p2(j11)) {
                                            if (usVar.getMessagesController().t2(j11)) {
                                                usVar.J += i10 <= 0 ? 0 : 1;
                                            } else {
                                                usVar.J += i10;
                                            }
                                        }
                                        hVar3.k(Integer.valueOf(i10), j11);
                                    }
                                    i12 = i3 + 1;
                                    nsVar = this;
                                } else {
                                    j10 = 0;
                                    j11 = keyAt;
                                }
                                z11 = true;
                                if (usVar.L) {
                                    i10 = num.intValue();
                                    z11 = true;
                                }
                                if (i10 == 0) {
                                }
                                if (i10 < 0) {
                                }
                                if (!z11) {
                                }
                                if (usVar.getMessagesController().t2(j11)) {
                                }
                                if (i10 == 0) {
                                }
                                i12 = i3 + 1;
                                nsVar = this;
                            }
                        } else {
                            i3 = i12;
                        }
                        i10 = i13;
                        z10 = false;
                        if (z10) {
                        }
                        z11 = true;
                        if (usVar.L) {
                        }
                        if (i10 == 0) {
                        }
                        if (i10 < 0) {
                        }
                        if (!z11) {
                        }
                        if (usVar.getMessagesController().t2(j11)) {
                        }
                        if (i10 == 0) {
                        }
                        i12 = i3 + 1;
                        nsVar = this;
                    }
                }
                break;
            default:
                us usVar2 = nsVar.b;
                ArrayList arrayList4 = usVar2.b;
                a0.h hVar4 = usVar2.c;
                ArrayList arrayList5 = usVar2.a;
                a0.h hVar5 = usVar2.f;
                int i15 = usVar2.J;
                usVar2.getAccountInstance().c();
                Integer num4 = 0;
                int i16 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray2 = nsVar.c;
                    int size2 = longSparseIntArray2.size();
                    ArrayList arrayList6 = nsVar.d;
                    if (i16 >= size2) {
                        if (arrayList6.isEmpty()) {
                            g0.h3(new ks(usVar2, arrayList6, 4));
                        }
                        if (i15 != usVar2.J) {
                            if (usVar2.L) {
                                usVar2.Q(usVar2.M > usVar2.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList4.clear();
                                usVar2.Z(usVar2.L);
                            }
                            g0.h3(new os(usVar2, hVar5.m(), 3));
                        }
                        usVar2.L = false;
                        if (usVar2.S) {
                            usVar2.S(usVar2.z());
                            break;
                        }
                    } else {
                        long keyAt2 = longSparseIntArray2.keyAt(i16);
                        Integer num5 = num4;
                        long j15 = -keyAt2;
                        long j16 = longSparseIntArray2.get(keyAt2);
                        Integer num6 = (Integer) hVar5.f(j15);
                        if (num6 == null) {
                            num6 = num5;
                        }
                        Integer num7 = num6;
                        int i17 = 0;
                        while (i17 < arrayList5.size()) {
                            zi ziVar2 = (zi) arrayList5.get(i17);
                            int i18 = i16;
                            if (zi.B0(ziVar2.k) == j15) {
                                j12 = j16;
                                if (ziVar2.f1() <= j12) {
                                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j15);
                                    if (sparseArray2 != null) {
                                        sparseArray2.remove(ziVar2.f1());
                                        if (sparseArray2.size() == 0) {
                                            hVar4.l(j15);
                                        }
                                    }
                                    arrayList4.remove(ziVar2);
                                    arrayList5.remove(ziVar2);
                                    i17--;
                                    if (us.E(ziVar2)) {
                                        usVar2.K--;
                                    }
                                    arrayList6.add(ziVar2);
                                    num7 = Integer.valueOf(num7.intValue() - 1);
                                }
                            } else {
                                j12 = j16;
                            }
                            i17++;
                            i16 = i18;
                            j16 = j12;
                        }
                        int i19 = i16;
                        if (num7.intValue() <= 0) {
                            usVar2.e.l(j15);
                            num2 = num5;
                        } else {
                            num2 = num7;
                        }
                        if (!num2.equals(num6)) {
                            if (!usVar2.getMessagesController().p2(j15)) {
                                if (usVar2.getMessagesController().t2(j15)) {
                                    int i20 = usVar2.J - (num6.intValue() > 0 ? 1 : 0);
                                    usVar2.J = i20;
                                    usVar2.J = i20 + (num2.intValue() > 0 ? 1 : 0);
                                } else {
                                    int intValue = usVar2.J - num6.intValue();
                                    usVar2.J = intValue;
                                    usVar2.J = num2.intValue() + intValue;
                                }
                            }
                            hVar5.k(num2, j15);
                        }
                        if (num2.intValue() == 0) {
                            hVar5.l(j15);
                            usVar2.r.l(j15);
                        }
                        i16 = i19 + 1;
                        num4 = num5;
                    }
                }
                break;
        }
    }
}
