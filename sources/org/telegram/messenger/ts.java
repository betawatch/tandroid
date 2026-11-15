package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class ts implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ at b;
    public final /* synthetic */ LongSparseIntArray c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ts(at atVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = atVar;
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
        ts tsVar = this;
        switch (tsVar.a) {
            case 0:
                at atVar = tsVar.b;
                a0.h hVar = atVar.c;
                ArrayList arrayList = atVar.b;
                a0.h hVar2 = atVar.r;
                ArrayList arrayList2 = atVar.a;
                a0.h hVar3 = atVar.f;
                int i11 = atVar.J;
                atVar.getAccountInstance().d();
                int i12 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray = tsVar.c;
                    int size = longSparseIntArray.size();
                    ArrayList arrayList3 = tsVar.d;
                    if (i12 >= size) {
                        if (!arrayList3.isEmpty()) {
                            g0.h3(new qs(atVar, arrayList3, 3));
                        }
                        if (i11 != atVar.J) {
                            if (atVar.L) {
                                atVar.Q(atVar.M > atVar.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList.clear();
                                atVar.Z(atVar.L);
                            }
                            g0.h3(new us(atVar, hVar3.m(), 2));
                        }
                        atVar.L = false;
                        if (atVar.S) {
                            atVar.S(atVar.z());
                            break;
                        }
                    } else {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Integer num3 = (Integer) hVar3.f(keyAt);
                        int i13 = longSparseIntArray.get(keyAt);
                        if (m5.z(keyAt)) {
                            i7 = i12;
                            TLRPC.Chat M0 = atVar.getMessagesController().M0(Long.valueOf(-keyAt));
                            if (M0 == null || M0.min || t3.r0(M0) || t3.Y(M0)) {
                                i13 = 0;
                            }
                            if (M0 != null) {
                                i10 = i13;
                                z10 = M0.forum;
                                if (z10) {
                                    int u10 = atVar.u(keyAt, 0L);
                                    if (u10 == -1) {
                                        j3 = 0;
                                        z11 = atVar.D(keyAt, null, false, false);
                                        j10 = keyAt;
                                    } else {
                                        j3 = 0;
                                        j10 = keyAt;
                                        if (u10 == 2) {
                                            z11 = false;
                                        }
                                    }
                                    if (atVar.L && !z11 && (num = (Integer) hVar2.f(j10)) != null && num.intValue() != 0) {
                                        i10 = num.intValue();
                                        z11 = true;
                                    }
                                    if (i10 == 0) {
                                        atVar.e.l(j10);
                                    }
                                    if (i10 < 0) {
                                        if (num3 == null) {
                                            i12 = i7 + 1;
                                            tsVar = this;
                                        } else {
                                            i10 += num3.intValue();
                                        }
                                    }
                                    if ((!z11 || i10 == 0) && num3 != null) {
                                        if (atVar.getMessagesController().t2(j10)) {
                                            atVar.J -= num3.intValue() > 0 ? 1 : 0;
                                        } else {
                                            atVar.J -= num3.intValue();
                                        }
                                    }
                                    if (i10 == 0) {
                                        hVar3.l(j10);
                                        hVar2.l(j10);
                                        int i14 = 0;
                                        while (i14 < arrayList2.size()) {
                                            gj gjVar = (gj) arrayList2.get(i14);
                                            TLRPC.Message message = gjVar.k;
                                            if (!message.from_scheduled && gj.B0(message) == j10 && !gjVar.J) {
                                                if (at.E(gjVar)) {
                                                    atVar.K--;
                                                }
                                                arrayList2.remove(i14);
                                                i14--;
                                                arrayList.remove(gjVar);
                                                long j12 = gjVar.k.peer_id.channel_id;
                                                long j13 = j12 != j3 ? -j12 : j3;
                                                SparseArray sparseArray = (SparseArray) hVar.f(j13);
                                                if (sparseArray != null) {
                                                    sparseArray.remove(gjVar.e1());
                                                    if (sparseArray.size() == 0) {
                                                        hVar.l(j13);
                                                    }
                                                }
                                                arrayList3.add(gjVar);
                                            }
                                            i14++;
                                        }
                                    } else if (z11) {
                                        if (!atVar.getMessagesController().p2(j10)) {
                                            if (atVar.getMessagesController().t2(j10)) {
                                                atVar.J += i10 <= 0 ? 0 : 1;
                                            } else {
                                                atVar.J += i10;
                                            }
                                        }
                                        hVar3.k(Integer.valueOf(i10), j10);
                                    }
                                    i12 = i7 + 1;
                                    tsVar = this;
                                } else {
                                    j3 = 0;
                                    j10 = keyAt;
                                }
                                z11 = true;
                                if (atVar.L) {
                                    i10 = num.intValue();
                                    z11 = true;
                                }
                                if (i10 == 0) {
                                }
                                if (i10 < 0) {
                                }
                                if (!z11) {
                                }
                                if (atVar.getMessagesController().t2(j10)) {
                                }
                                if (i10 == 0) {
                                }
                                i12 = i7 + 1;
                                tsVar = this;
                            }
                        } else {
                            i7 = i12;
                        }
                        i10 = i13;
                        z10 = false;
                        if (z10) {
                        }
                        z11 = true;
                        if (atVar.L) {
                        }
                        if (i10 == 0) {
                        }
                        if (i10 < 0) {
                        }
                        if (!z11) {
                        }
                        if (atVar.getMessagesController().t2(j10)) {
                        }
                        if (i10 == 0) {
                        }
                        i12 = i7 + 1;
                        tsVar = this;
                    }
                }
                break;
            default:
                at atVar2 = tsVar.b;
                ArrayList arrayList4 = atVar2.b;
                a0.h hVar4 = atVar2.c;
                ArrayList arrayList5 = atVar2.a;
                a0.h hVar5 = atVar2.f;
                int i15 = atVar2.J;
                atVar2.getAccountInstance().d();
                Integer num4 = 0;
                int i16 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray2 = tsVar.c;
                    int size2 = longSparseIntArray2.size();
                    ArrayList arrayList6 = tsVar.d;
                    if (i16 >= size2) {
                        if (arrayList6.isEmpty()) {
                            g0.h3(new qs(atVar2, arrayList6, 4));
                        }
                        if (i15 != atVar2.J) {
                            if (atVar2.L) {
                                atVar2.Q(atVar2.M > atVar2.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList4.clear();
                                atVar2.Z(atVar2.L);
                            }
                            g0.h3(new us(atVar2, hVar5.m(), 3));
                        }
                        atVar2.L = false;
                        if (atVar2.S) {
                            atVar2.S(atVar2.z());
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
                            gj gjVar2 = (gj) arrayList5.get(i17);
                            int i18 = i16;
                            if (gj.B0(gjVar2.k) == j14) {
                                j11 = j15;
                                if (gjVar2.e1() <= j11) {
                                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j14);
                                    if (sparseArray2 != null) {
                                        sparseArray2.remove(gjVar2.e1());
                                        if (sparseArray2.size() == 0) {
                                            hVar4.l(j14);
                                        }
                                    }
                                    arrayList4.remove(gjVar2);
                                    arrayList5.remove(gjVar2);
                                    i17--;
                                    if (at.E(gjVar2)) {
                                        atVar2.K--;
                                    }
                                    arrayList6.add(gjVar2);
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
                            atVar2.e.l(j14);
                            num2 = num5;
                        } else {
                            num2 = num7;
                        }
                        if (!num2.equals(num6)) {
                            if (!atVar2.getMessagesController().p2(j14)) {
                                if (atVar2.getMessagesController().t2(j14)) {
                                    int i20 = atVar2.J - (num6.intValue() > 0 ? 1 : 0);
                                    atVar2.J = i20;
                                    atVar2.J = i20 + (num2.intValue() > 0 ? 1 : 0);
                                } else {
                                    int intValue = atVar2.J - num6.intValue();
                                    atVar2.J = intValue;
                                    atVar2.J = num2.intValue() + intValue;
                                }
                            }
                            hVar5.k(num2, j14);
                        }
                        if (num2.intValue() == 0) {
                            hVar5.l(j14);
                            atVar2.r.l(j14);
                        }
                        i16 = i19 + 1;
                        num4 = num5;
                    }
                }
                break;
        }
    }
}
