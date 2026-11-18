package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class qs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xs b;
    public final /* synthetic */ LongSparseIntArray c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ qs(xs xsVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = xsVar;
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
        int i7;
        int i10;
        boolean z10;
        long j3;
        long j10;
        boolean z11;
        Integer num;
        Integer num2;
        long j11;
        qs qsVar = this;
        switch (qsVar.a) {
            case 0:
                xs xsVar = qsVar.b;
                a0.h hVar = xsVar.c;
                ArrayList arrayList = xsVar.b;
                a0.h hVar2 = xsVar.r;
                ArrayList arrayList2 = xsVar.a;
                a0.h hVar3 = xsVar.f;
                int i11 = xsVar.J;
                xsVar.getAccountInstance().d();
                int i12 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray = qsVar.c;
                    int size = longSparseIntArray.size();
                    ArrayList arrayList3 = qsVar.d;
                    if (i12 >= size) {
                        if (!arrayList3.isEmpty()) {
                            g0.g3(new ns(xsVar, arrayList3, 3));
                        }
                        if (i11 != xsVar.J) {
                            if (xsVar.L) {
                                xsVar.Q(xsVar.M > xsVar.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList.clear();
                                xsVar.Z(xsVar.L);
                            }
                            g0.g3(new rs(xsVar, hVar3.m(), 2));
                        }
                        xsVar.L = false;
                        if (xsVar.S) {
                            xsVar.S(xsVar.z());
                            break;
                        }
                    } else {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Integer num3 = (Integer) hVar3.f(keyAt);
                        int i13 = longSparseIntArray.get(keyAt);
                        if (n5.z(keyAt)) {
                            i7 = i12;
                            TLRPC.Chat O0 = xsVar.getMessagesController().O0(Long.valueOf(-keyAt));
                            if (O0 == null || O0.min || v3.r0(O0) || v3.Y(O0)) {
                                i13 = 0;
                            }
                            if (O0 != null) {
                                i10 = i13;
                                z10 = O0.forum;
                                if (z10) {
                                    int u10 = xsVar.u(keyAt, 0L);
                                    if (u10 == -1) {
                                        j3 = 0;
                                        z11 = xsVar.D(keyAt, null, false, false);
                                        j10 = keyAt;
                                    } else {
                                        j3 = 0;
                                        j10 = keyAt;
                                        if (u10 == 2) {
                                            z11 = false;
                                        }
                                    }
                                    if (xsVar.L && !z11 && (num = (Integer) hVar2.f(j10)) != null && num.intValue() != 0) {
                                        i10 = num.intValue();
                                        z11 = true;
                                    }
                                    if (i10 == 0) {
                                        xsVar.e.l(j10);
                                    }
                                    if (i10 < 0) {
                                        if (num3 == null) {
                                            i12 = i7 + 1;
                                            qsVar = this;
                                        } else {
                                            i10 += num3.intValue();
                                        }
                                    }
                                    if ((!z11 || i10 == 0) && num3 != null) {
                                        if (xsVar.getMessagesController().y2(j10)) {
                                            xsVar.J -= num3.intValue() > 0 ? 1 : 0;
                                        } else {
                                            xsVar.J -= num3.intValue();
                                        }
                                    }
                                    if (i10 == 0) {
                                        hVar3.l(j10);
                                        hVar2.l(j10);
                                        int i14 = 0;
                                        while (i14 < arrayList2.size()) {
                                            fj fjVar = (fj) arrayList2.get(i14);
                                            TLRPC.Message message = fjVar.k;
                                            if (!message.from_scheduled && fj.B0(message) == j10 && !fjVar.J) {
                                                if (xs.E(fjVar)) {
                                                    xsVar.K--;
                                                }
                                                arrayList2.remove(i14);
                                                i14--;
                                                arrayList.remove(fjVar);
                                                long j12 = fjVar.k.peer_id.channel_id;
                                                long j13 = j12 != j3 ? -j12 : j3;
                                                SparseArray sparseArray = (SparseArray) hVar.f(j13);
                                                if (sparseArray != null) {
                                                    sparseArray.remove(fjVar.e1());
                                                    if (sparseArray.size() == 0) {
                                                        hVar.l(j13);
                                                    }
                                                }
                                                arrayList3.add(fjVar);
                                            }
                                            i14++;
                                        }
                                    } else if (z11) {
                                        if (!xsVar.getMessagesController().s2(j10)) {
                                            if (xsVar.getMessagesController().y2(j10)) {
                                                xsVar.J += i10 <= 0 ? 0 : 1;
                                            } else {
                                                xsVar.J += i10;
                                            }
                                        }
                                        hVar3.k(Integer.valueOf(i10), j10);
                                    }
                                    i12 = i7 + 1;
                                    qsVar = this;
                                } else {
                                    j3 = 0;
                                    j10 = keyAt;
                                }
                                z11 = true;
                                if (xsVar.L) {
                                    i10 = num.intValue();
                                    z11 = true;
                                }
                                if (i10 == 0) {
                                }
                                if (i10 < 0) {
                                }
                                if (!z11) {
                                }
                                if (xsVar.getMessagesController().y2(j10)) {
                                }
                                if (i10 == 0) {
                                }
                                i12 = i7 + 1;
                                qsVar = this;
                            }
                        } else {
                            i7 = i12;
                        }
                        i10 = i13;
                        z10 = false;
                        if (z10) {
                        }
                        z11 = true;
                        if (xsVar.L) {
                        }
                        if (i10 == 0) {
                        }
                        if (i10 < 0) {
                        }
                        if (!z11) {
                        }
                        if (xsVar.getMessagesController().y2(j10)) {
                        }
                        if (i10 == 0) {
                        }
                        i12 = i7 + 1;
                        qsVar = this;
                    }
                }
                break;
            default:
                xs xsVar2 = qsVar.b;
                ArrayList arrayList4 = xsVar2.b;
                a0.h hVar4 = xsVar2.c;
                ArrayList arrayList5 = xsVar2.a;
                a0.h hVar5 = xsVar2.f;
                int i15 = xsVar2.J;
                xsVar2.getAccountInstance().d();
                Integer num4 = 0;
                int i16 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray2 = qsVar.c;
                    int size2 = longSparseIntArray2.size();
                    ArrayList arrayList6 = qsVar.d;
                    if (i16 >= size2) {
                        if (arrayList6.isEmpty()) {
                            g0.g3(new ns(xsVar2, arrayList6, 4));
                        }
                        if (i15 != xsVar2.J) {
                            if (xsVar2.L) {
                                xsVar2.Q(xsVar2.M > xsVar2.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList4.clear();
                                xsVar2.Z(xsVar2.L);
                            }
                            g0.g3(new rs(xsVar2, hVar5.m(), 3));
                        }
                        xsVar2.L = false;
                        if (xsVar2.S) {
                            xsVar2.S(xsVar2.z());
                            break;
                        }
                    } else {
                        long keyAt2 = longSparseIntArray2.keyAt(i16);
                        Integer num5 = num4;
                        long j14 = -keyAt2;
                        long j15 = longSparseIntArray2.get(keyAt2);
                        Integer num6 = (Integer) hVar5.f(j14);
                        if (num6 == null) {
                            num6 = num5;
                        }
                        Integer num7 = num6;
                        int i17 = 0;
                        while (i17 < arrayList5.size()) {
                            fj fjVar2 = (fj) arrayList5.get(i17);
                            int i18 = i16;
                            if (fj.B0(fjVar2.k) == j14) {
                                j11 = j15;
                                if (fjVar2.e1() <= j11) {
                                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j14);
                                    if (sparseArray2 != null) {
                                        sparseArray2.remove(fjVar2.e1());
                                        if (sparseArray2.size() == 0) {
                                            hVar4.l(j14);
                                        }
                                    }
                                    arrayList4.remove(fjVar2);
                                    arrayList5.remove(fjVar2);
                                    i17--;
                                    if (xs.E(fjVar2)) {
                                        xsVar2.K--;
                                    }
                                    arrayList6.add(fjVar2);
                                    num7 = Integer.valueOf(num7.intValue() - 1);
                                }
                            } else {
                                j11 = j15;
                            }
                            i17++;
                            i16 = i18;
                            j15 = j11;
                        }
                        int i19 = i16;
                        if (num7.intValue() <= 0) {
                            xsVar2.e.l(j14);
                            num2 = num5;
                        } else {
                            num2 = num7;
                        }
                        if (!num2.equals(num6)) {
                            if (!xsVar2.getMessagesController().s2(j14)) {
                                if (xsVar2.getMessagesController().y2(j14)) {
                                    int i20 = xsVar2.J - (num6.intValue() > 0 ? 1 : 0);
                                    xsVar2.J = i20;
                                    xsVar2.J = i20 + (num2.intValue() > 0 ? 1 : 0);
                                } else {
                                    int intValue = xsVar2.J - num6.intValue();
                                    xsVar2.J = intValue;
                                    xsVar2.J = num2.intValue() + intValue;
                                }
                            }
                            hVar5.k(num2, j14);
                        }
                        if (num2.intValue() == 0) {
                            hVar5.l(j14);
                            xsVar2.r.l(j14);
                        }
                        i16 = i19 + 1;
                        num4 = num5;
                    }
                }
                break;
        }
    }
}
