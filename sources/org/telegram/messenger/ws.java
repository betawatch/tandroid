package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ws implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dt b;
    public final /* synthetic */ LongSparseIntArray c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ws(dt dtVar, LongSparseIntArray longSparseIntArray, ArrayList arrayList, int i7) {
        this.a = i7;
        this.b = dtVar;
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
        boolean z9;
        long j3;
        long j10;
        boolean z10;
        Integer num;
        Integer num2;
        long j11;
        ws wsVar = this;
        switch (wsVar.a) {
            case 0:
                dt dtVar = wsVar.b;
                a0.h hVar = dtVar.c;
                ArrayList arrayList = dtVar.b;
                a0.h hVar2 = dtVar.r;
                ArrayList arrayList2 = dtVar.a;
                a0.h hVar3 = dtVar.f;
                int i11 = dtVar.I;
                dtVar.getAccountInstance().c();
                int i12 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray = wsVar.c;
                    int size = longSparseIntArray.size();
                    ArrayList arrayList3 = wsVar.d;
                    if (i12 >= size) {
                        if (!arrayList3.isEmpty()) {
                            g0.h3(new ts(dtVar, arrayList3, 3));
                        }
                        if (i11 != dtVar.I) {
                            if (dtVar.K) {
                                dtVar.Q(dtVar.L > dtVar.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList.clear();
                                dtVar.Z(dtVar.K);
                            }
                            g0.h3(new xs(dtVar, hVar3.m(), 2));
                        }
                        dtVar.K = false;
                        if (dtVar.R) {
                            dtVar.S(dtVar.z());
                            break;
                        }
                    } else {
                        long keyAt = longSparseIntArray.keyAt(i12);
                        Integer num3 = (Integer) hVar3.f(keyAt);
                        int i13 = longSparseIntArray.get(keyAt);
                        if (m5.z(keyAt)) {
                            i7 = i12;
                            TLRPC.Chat M0 = dtVar.getMessagesController().M0(Long.valueOf(-keyAt));
                            if (M0 == null || M0.min || t3.r0(M0) || t3.Y(M0)) {
                                i13 = 0;
                            }
                            if (M0 != null) {
                                i10 = i13;
                                z9 = M0.forum;
                                if (z9) {
                                    int u10 = dtVar.u(keyAt, 0L);
                                    if (u10 == -1) {
                                        j3 = 0;
                                        z10 = dtVar.D(keyAt, null, false, false);
                                        j10 = keyAt;
                                    } else {
                                        j3 = 0;
                                        j10 = keyAt;
                                        if (u10 == 2) {
                                            z10 = false;
                                        }
                                    }
                                    if (dtVar.K && !z10 && (num = (Integer) hVar2.f(j10)) != null && num.intValue() != 0) {
                                        i10 = num.intValue();
                                        z10 = true;
                                    }
                                    if (i10 == 0) {
                                        dtVar.e.l(j10);
                                    }
                                    if (i10 < 0) {
                                        if (num3 == null) {
                                            i12 = i7 + 1;
                                            wsVar = this;
                                        } else {
                                            i10 += num3.intValue();
                                        }
                                    }
                                    if ((!z10 || i10 == 0) && num3 != null) {
                                        if (dtVar.getMessagesController().t2(j10)) {
                                            dtVar.I -= num3.intValue() > 0 ? 1 : 0;
                                        } else {
                                            dtVar.I -= num3.intValue();
                                        }
                                    }
                                    if (i10 == 0) {
                                        hVar3.l(j10);
                                        hVar2.l(j10);
                                        int i14 = 0;
                                        while (i14 < arrayList2.size()) {
                                            ij ijVar = (ij) arrayList2.get(i14);
                                            TLRPC.Message message = ijVar.k;
                                            if (!message.from_scheduled && ij.B0(message) == j10 && !ijVar.J) {
                                                if (dt.E(ijVar)) {
                                                    dtVar.J--;
                                                }
                                                arrayList2.remove(i14);
                                                i14--;
                                                arrayList.remove(ijVar);
                                                long j12 = ijVar.k.peer_id.channel_id;
                                                long j13 = j12 != j3 ? -j12 : j3;
                                                SparseArray sparseArray = (SparseArray) hVar.f(j13);
                                                if (sparseArray != null) {
                                                    sparseArray.remove(ijVar.f1());
                                                    if (sparseArray.size() == 0) {
                                                        hVar.l(j13);
                                                    }
                                                }
                                                arrayList3.add(ijVar);
                                            }
                                            i14++;
                                        }
                                    } else if (z10) {
                                        if (!dtVar.getMessagesController().p2(j10)) {
                                            if (dtVar.getMessagesController().t2(j10)) {
                                                dtVar.I += i10 <= 0 ? 0 : 1;
                                            } else {
                                                dtVar.I += i10;
                                            }
                                        }
                                        hVar3.k(Integer.valueOf(i10), j10);
                                    }
                                    i12 = i7 + 1;
                                    wsVar = this;
                                } else {
                                    j3 = 0;
                                    j10 = keyAt;
                                }
                                z10 = true;
                                if (dtVar.K) {
                                    i10 = num.intValue();
                                    z10 = true;
                                }
                                if (i10 == 0) {
                                }
                                if (i10 < 0) {
                                }
                                if (!z10) {
                                }
                                if (dtVar.getMessagesController().t2(j10)) {
                                }
                                if (i10 == 0) {
                                }
                                i12 = i7 + 1;
                                wsVar = this;
                            }
                        } else {
                            i7 = i12;
                        }
                        i10 = i13;
                        z9 = false;
                        if (z9) {
                        }
                        z10 = true;
                        if (dtVar.K) {
                        }
                        if (i10 == 0) {
                        }
                        if (i10 < 0) {
                        }
                        if (!z10) {
                        }
                        if (dtVar.getMessagesController().t2(j10)) {
                        }
                        if (i10 == 0) {
                        }
                        i12 = i7 + 1;
                        wsVar = this;
                    }
                }
                break;
            default:
                dt dtVar2 = wsVar.b;
                ArrayList arrayList4 = dtVar2.b;
                a0.h hVar4 = dtVar2.c;
                ArrayList arrayList5 = dtVar2.a;
                a0.h hVar5 = dtVar2.f;
                int i15 = dtVar2.I;
                dtVar2.getAccountInstance().c();
                Integer num4 = 0;
                int i16 = 0;
                while (true) {
                    LongSparseIntArray longSparseIntArray2 = wsVar.c;
                    int size2 = longSparseIntArray2.size();
                    ArrayList arrayList6 = wsVar.d;
                    if (i16 >= size2) {
                        if (arrayList6.isEmpty()) {
                            g0.h3(new ts(dtVar2, arrayList6, 4));
                        }
                        if (i15 != dtVar2.I) {
                            if (dtVar2.K) {
                                dtVar2.Q(dtVar2.L > dtVar2.getConnectionsManager().getCurrentTime());
                            } else {
                                arrayList4.clear();
                                dtVar2.Z(dtVar2.K);
                            }
                            g0.h3(new xs(dtVar2, hVar5.m(), 3));
                        }
                        dtVar2.K = false;
                        if (dtVar2.R) {
                            dtVar2.S(dtVar2.z());
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
                            ij ijVar2 = (ij) arrayList5.get(i17);
                            int i18 = i16;
                            if (ij.B0(ijVar2.k) == j14) {
                                j11 = j15;
                                if (ijVar2.f1() <= j11) {
                                    SparseArray sparseArray2 = (SparseArray) hVar4.f(j14);
                                    if (sparseArray2 != null) {
                                        sparseArray2.remove(ijVar2.f1());
                                        if (sparseArray2.size() == 0) {
                                            hVar4.l(j14);
                                        }
                                    }
                                    arrayList4.remove(ijVar2);
                                    arrayList5.remove(ijVar2);
                                    i17--;
                                    if (dt.E(ijVar2)) {
                                        dtVar2.J--;
                                    }
                                    arrayList6.add(ijVar2);
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
                            dtVar2.e.l(j14);
                            num2 = num5;
                        } else {
                            num2 = num7;
                        }
                        if (!num2.equals(num6)) {
                            if (!dtVar2.getMessagesController().p2(j14)) {
                                if (dtVar2.getMessagesController().t2(j14)) {
                                    int i20 = dtVar2.I - (num6.intValue() > 0 ? 1 : 0);
                                    dtVar2.I = i20;
                                    dtVar2.I = i20 + (num2.intValue() > 0 ? 1 : 0);
                                } else {
                                    int intValue = dtVar2.I - num6.intValue();
                                    dtVar2.I = intValue;
                                    dtVar2.I = num2.intValue() + intValue;
                                }
                            }
                            hVar5.k(num2, j14);
                        }
                        if (num2.intValue() == 0) {
                            hVar5.l(j14);
                            dtVar2.r.l(j14);
                        }
                        i16 = i19 + 1;
                        num4 = num5;
                    }
                }
                break;
        }
    }
}
