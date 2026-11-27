// default package

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class ap7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ip7 b;
    public final /* synthetic */ LongSparseIntArray c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ ap7(ip7 ip7Var, LongSparseIntArray longSparseIntArray, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = ip7Var;
        this.c = longSparseIntArray;
        this.d = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0228 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01df  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        boolean z;
        long j;
        boolean z2;
        boolean v2;
        ArrayList arrayList;
        zh6 zh6Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        zh6 zh6Var2;
        ArrayList arrayList4;
        Integer num;
        Integer num2;
        int i2;
        long j2;
        int i3;
        byte b = this.a;
        ArrayList arrayList5 = this.d;
        LongSparseIntArray longSparseIntArray = this.c;
        switch (b) {
            case 0:
                ip7 ip7Var = this.b;
                zh6 zh6Var3 = ip7Var.c;
                ArrayList arrayList6 = ip7Var.b;
                zh6 zh6Var4 = ip7Var.r;
                ArrayList arrayList7 = ip7Var.a;
                zh6 zh6Var5 = ip7Var.f;
                int i4 = ip7Var.J;
                ip7Var.getAccountInstance().d();
                int i5 = 0;
                while (i5 < longSparseIntArray.size()) {
                    long keyAt = longSparseIntArray.keyAt(i5);
                    Integer num3 = (Integer) zh6Var5.f(keyAt);
                    int i6 = longSparseIntArray.get(keyAt);
                    if (wf3.y(keyAt)) {
                        TLRPC.Chat M0 = ip7Var.getMessagesController().M0(Long.valueOf(-keyAt));
                        int i7 = (M0 == null || M0.min || xc2.r0(M0) || xc2.Y(M0)) ? 0 : i6;
                        if (M0 != null) {
                            z = M0.forum;
                            i = i7;
                            if (z) {
                                int o = ip7Var.o(keyAt, 0L);
                                if (o == -1) {
                                    j = 0;
                                    z2 = ip7Var.x(keyAt, null, false, false);
                                } else {
                                    j = 0;
                                    if (o == 2) {
                                        z2 = false;
                                    }
                                }
                                if (ip7Var.L && !z2 && (num = (Integer) zh6Var4.f(keyAt)) != null && num.intValue() != 0) {
                                    i = num.intValue();
                                    z2 = true;
                                }
                                if (i == 0) {
                                    ip7Var.e.l(keyAt);
                                }
                                if (i < 0) {
                                    if (num3 != null) {
                                        i = num3.intValue() + i;
                                    }
                                    arrayList = arrayList6;
                                    zh6Var = zh6Var4;
                                    arrayList2 = arrayList7;
                                    i5++;
                                    arrayList7 = arrayList2;
                                    arrayList6 = arrayList;
                                    zh6Var4 = zh6Var;
                                }
                                if ((!z2 || i == 0) && num3 != null) {
                                    v2 = ip7Var.getMessagesController().v2(keyAt);
                                    int i8 = ip7Var.J;
                                    if (v2) {
                                        ip7Var.J = i8 - (num3.intValue() > 0 ? 1 : 0);
                                    } else {
                                        ip7Var.J = i8 - num3.intValue();
                                    }
                                }
                                if (i == 0) {
                                    zh6Var5.l(keyAt);
                                    zh6Var4.l(keyAt);
                                    int i9 = 0;
                                    while (i9 < arrayList7.size()) {
                                        r47 r47Var = (r47) arrayList7.get(i9);
                                        TLRPC.Message message = r47Var.k;
                                        if (message.from_scheduled || r47.B0(message) != keyAt || r47Var.J) {
                                            arrayList3 = arrayList6;
                                            zh6Var2 = zh6Var4;
                                            arrayList4 = arrayList7;
                                        } else {
                                            if (ip7.y(r47Var)) {
                                                ip7Var.K--;
                                            }
                                            arrayList7.remove(i9);
                                            i9--;
                                            arrayList6.remove(r47Var);
                                            arrayList3 = arrayList6;
                                            zh6Var2 = zh6Var4;
                                            long j3 = r47Var.k.peer_id.channel_id;
                                            long j4 = j3 != j ? -j3 : j;
                                            SparseArray sparseArray = (SparseArray) zh6Var3.f(j4);
                                            arrayList4 = arrayList7;
                                            if (sparseArray != null) {
                                                sparseArray.remove(r47Var.e1());
                                                if (sparseArray.size() == 0) {
                                                    zh6Var3.l(j4);
                                                }
                                            }
                                            arrayList5.add(r47Var);
                                        }
                                        i9++;
                                        arrayList7 = arrayList4;
                                        arrayList6 = arrayList3;
                                        zh6Var4 = zh6Var2;
                                    }
                                    arrayList = arrayList6;
                                    zh6Var = zh6Var4;
                                    arrayList2 = arrayList7;
                                    i5++;
                                    arrayList7 = arrayList2;
                                    arrayList6 = arrayList;
                                    zh6Var4 = zh6Var;
                                } else {
                                    arrayList = arrayList6;
                                    zh6Var = zh6Var4;
                                    arrayList2 = arrayList7;
                                    if (z2) {
                                        if (!ip7Var.getMessagesController().n2(keyAt)) {
                                            boolean v22 = ip7Var.getMessagesController().v2(keyAt);
                                            int i10 = ip7Var.J;
                                            if (v22) {
                                                ip7Var.J = i10 + (i > 0 ? 1 : 0);
                                            } else {
                                                ip7Var.J = i10 + i;
                                            }
                                        }
                                        zh6Var5.k(keyAt, Integer.valueOf(i));
                                    }
                                    i5++;
                                    arrayList7 = arrayList2;
                                    arrayList6 = arrayList;
                                    zh6Var4 = zh6Var;
                                }
                            } else {
                                j = 0;
                            }
                            z2 = true;
                            if (ip7Var.L) {
                                i = num.intValue();
                                z2 = true;
                            }
                            if (i == 0) {
                            }
                            if (i < 0) {
                            }
                            if (!z2) {
                            }
                            v2 = ip7Var.getMessagesController().v2(keyAt);
                            int i82 = ip7Var.J;
                            if (v2) {
                            }
                            if (i == 0) {
                            }
                        } else {
                            i = i7;
                        }
                    } else {
                        i = i6;
                    }
                    z = false;
                    if (z) {
                    }
                    z2 = true;
                    if (ip7Var.L) {
                    }
                    if (i == 0) {
                    }
                    if (i < 0) {
                    }
                    if (!z2) {
                    }
                    v2 = ip7Var.getMessagesController().v2(keyAt);
                    int i822 = ip7Var.J;
                    if (v2) {
                    }
                    if (i == 0) {
                    }
                }
                ArrayList arrayList8 = arrayList6;
                if (!arrayList5.isEmpty()) {
                    hl.c3(new xo7(ip7Var, arrayList5, (byte) 3));
                }
                if (i4 != ip7Var.J) {
                    if (ip7Var.L) {
                        ip7Var.Q(ip7Var.M > ip7Var.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList8.clear();
                        ip7Var.Z(ip7Var.L);
                    }
                    hl.c3(new bp7(ip7Var, zh6Var5.m(), (byte) 2));
                }
                ip7Var.L = false;
                if (ip7Var.S) {
                    ip7Var.S(ip7Var.t());
                    break;
                }
                break;
            default:
                ip7 ip7Var2 = this.b;
                ArrayList arrayList9 = ip7Var2.b;
                zh6 zh6Var6 = ip7Var2.c;
                ArrayList arrayList10 = ip7Var2.a;
                zh6 zh6Var7 = ip7Var2.f;
                int i11 = ip7Var2.J;
                ip7Var2.getAccountInstance().d();
                Integer num4 = 0;
                int i12 = 0;
                while (i12 < longSparseIntArray.size()) {
                    long keyAt2 = longSparseIntArray.keyAt(i12);
                    long j5 = -keyAt2;
                    long j6 = longSparseIntArray.get(keyAt2);
                    Integer num5 = (Integer) zh6Var7.f(j5);
                    Integer num6 = num5 == null ? num4 : num5;
                    Integer num7 = num4;
                    Integer num8 = num6;
                    int i13 = 0;
                    while (i13 < arrayList10.size()) {
                        r47 r47Var2 = (r47) arrayList10.get(i13);
                        int i14 = i13;
                        if (r47.B0(r47Var2.k) == j5) {
                            i2 = i12;
                            j2 = j6;
                            if (r47Var2.e1() <= j2) {
                                SparseArray sparseArray2 = (SparseArray) zh6Var6.f(j5);
                                if (sparseArray2 != null) {
                                    sparseArray2.remove(r47Var2.e1());
                                    if (sparseArray2.size() == 0) {
                                        zh6Var6.l(j5);
                                    }
                                }
                                arrayList9.remove(r47Var2);
                                arrayList10.remove(r47Var2);
                                i3 = i14 - 1;
                                if (ip7.y(r47Var2)) {
                                    ip7Var2.K--;
                                }
                                arrayList5.add(r47Var2);
                                num8 = Integer.valueOf(num8.intValue() - 1);
                                i13 = i3 + 1;
                                i12 = i2;
                                j6 = j2;
                            }
                        } else {
                            i2 = i12;
                            j2 = j6;
                        }
                        i3 = i14;
                        i13 = i3 + 1;
                        i12 = i2;
                        j6 = j2;
                    }
                    int i15 = i12;
                    if (num8.intValue() <= 0) {
                        ip7Var2.e.l(j5);
                        num2 = num7;
                    } else {
                        num2 = num8;
                    }
                    if (!num2.equals(num6)) {
                        if (!ip7Var2.getMessagesController().n2(j5)) {
                            boolean v23 = ip7Var2.getMessagesController().v2(j5);
                            int i16 = ip7Var2.J;
                            if (v23) {
                                int i17 = i16 - (num6.intValue() > 0 ? 1 : 0);
                                ip7Var2.J = i17;
                                ip7Var2.J = i17 + (num2.intValue() > 0 ? 1 : 0);
                            } else {
                                int intValue = i16 - num6.intValue();
                                ip7Var2.J = intValue;
                                ip7Var2.J = num2.intValue() + intValue;
                            }
                        }
                        zh6Var7.k(j5, num2);
                    }
                    if (num2.intValue() == 0) {
                        zh6Var7.l(j5);
                        ip7Var2.r.l(j5);
                    }
                    i12 = i15 + 1;
                    num4 = num7;
                }
                if (arrayList5.isEmpty()) {
                    hl.c3(new xo7(ip7Var2, arrayList5, (byte) 4));
                }
                if (i11 != ip7Var2.J) {
                    if (ip7Var2.L) {
                        ip7Var2.Q(ip7Var2.M > ip7Var2.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList9.clear();
                        ip7Var2.Z(ip7Var2.L);
                    }
                    hl.c3(new bp7(ip7Var2, zh6Var7.m(), (byte) 3));
                }
                ip7Var2.L = false;
                if (ip7Var2.S) {
                    ip7Var2.S(ip7Var2.t());
                    break;
                }
                break;
        }
    }
}
