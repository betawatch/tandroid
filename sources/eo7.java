// default package

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class eo7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lo7 b;
    public final /* synthetic */ LongSparseIntArray c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ eo7(lo7 lo7Var, LongSparseIntArray longSparseIntArray, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = lo7Var;
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
        boolean s2;
        ArrayList arrayList;
        vh6 vh6Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        vh6 vh6Var2;
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
                lo7 lo7Var = this.b;
                vh6 vh6Var3 = lo7Var.c;
                ArrayList arrayList6 = lo7Var.b;
                vh6 vh6Var4 = lo7Var.r;
                ArrayList arrayList7 = lo7Var.a;
                vh6 vh6Var5 = lo7Var.f;
                int i4 = lo7Var.J;
                lo7Var.getAccountInstance().d();
                int i5 = 0;
                while (i5 < longSparseIntArray.size()) {
                    long keyAt = longSparseIntArray.keyAt(i5);
                    Integer num3 = (Integer) vh6Var5.f(keyAt);
                    int i6 = longSparseIntArray.get(keyAt);
                    if (pg3.y(keyAt)) {
                        TLRPC.Chat L0 = lo7Var.getMessagesController().L0(Long.valueOf(-keyAt));
                        int i7 = (L0 == null || L0.min || sd2.r0(L0) || sd2.Y(L0)) ? 0 : i6;
                        if (L0 != null) {
                            z = L0.forum;
                            i = i7;
                            if (z) {
                                int o = lo7Var.o(keyAt, 0L);
                                if (o == -1) {
                                    j = 0;
                                    z2 = lo7Var.x(keyAt, null, false, false);
                                } else {
                                    j = 0;
                                    if (o == 2) {
                                        z2 = false;
                                    }
                                }
                                if (lo7Var.L && !z2 && (num = (Integer) vh6Var4.f(keyAt)) != null && num.intValue() != 0) {
                                    i = num.intValue();
                                    z2 = true;
                                }
                                if (i == 0) {
                                    lo7Var.e.l(keyAt);
                                }
                                if (i < 0) {
                                    if (num3 != null) {
                                        i = num3.intValue() + i;
                                    }
                                    arrayList = arrayList6;
                                    vh6Var = vh6Var4;
                                    arrayList2 = arrayList7;
                                    i5++;
                                    arrayList7 = arrayList2;
                                    arrayList6 = arrayList;
                                    vh6Var4 = vh6Var;
                                }
                                if ((!z2 || i == 0) && num3 != null) {
                                    s2 = lo7Var.getMessagesController().s2(keyAt);
                                    int i8 = lo7Var.J;
                                    if (s2) {
                                        lo7Var.J = i8 - (num3.intValue() > 0 ? 1 : 0);
                                    } else {
                                        lo7Var.J = i8 - num3.intValue();
                                    }
                                }
                                if (i == 0) {
                                    vh6Var5.l(keyAt);
                                    vh6Var4.l(keyAt);
                                    int i9 = 0;
                                    while (i9 < arrayList7.size()) {
                                        k47 k47Var = (k47) arrayList7.get(i9);
                                        TLRPC.Message message = k47Var.k;
                                        if (message.from_scheduled || k47.B0(message) != keyAt || k47Var.J) {
                                            arrayList3 = arrayList6;
                                            vh6Var2 = vh6Var4;
                                            arrayList4 = arrayList7;
                                        } else {
                                            if (lo7.y(k47Var)) {
                                                lo7Var.K--;
                                            }
                                            arrayList7.remove(i9);
                                            i9--;
                                            arrayList6.remove(k47Var);
                                            arrayList3 = arrayList6;
                                            vh6Var2 = vh6Var4;
                                            long j3 = k47Var.k.peer_id.channel_id;
                                            long j4 = j3 != j ? -j3 : j;
                                            SparseArray sparseArray = (SparseArray) vh6Var3.f(j4);
                                            arrayList4 = arrayList7;
                                            if (sparseArray != null) {
                                                sparseArray.remove(k47Var.e1());
                                                if (sparseArray.size() == 0) {
                                                    vh6Var3.l(j4);
                                                }
                                            }
                                            arrayList5.add(k47Var);
                                        }
                                        i9++;
                                        arrayList7 = arrayList4;
                                        arrayList6 = arrayList3;
                                        vh6Var4 = vh6Var2;
                                    }
                                    arrayList = arrayList6;
                                    vh6Var = vh6Var4;
                                    arrayList2 = arrayList7;
                                    i5++;
                                    arrayList7 = arrayList2;
                                    arrayList6 = arrayList;
                                    vh6Var4 = vh6Var;
                                } else {
                                    arrayList = arrayList6;
                                    vh6Var = vh6Var4;
                                    arrayList2 = arrayList7;
                                    if (z2) {
                                        if (!lo7Var.getMessagesController().m2(keyAt)) {
                                            boolean s22 = lo7Var.getMessagesController().s2(keyAt);
                                            int i10 = lo7Var.J;
                                            if (s22) {
                                                lo7Var.J = i10 + (i > 0 ? 1 : 0);
                                            } else {
                                                lo7Var.J = i10 + i;
                                            }
                                        }
                                        vh6Var5.k(Integer.valueOf(i), keyAt);
                                    }
                                    i5++;
                                    arrayList7 = arrayList2;
                                    arrayList6 = arrayList;
                                    vh6Var4 = vh6Var;
                                }
                            } else {
                                j = 0;
                            }
                            z2 = true;
                            if (lo7Var.L) {
                                i = num.intValue();
                                z2 = true;
                            }
                            if (i == 0) {
                            }
                            if (i < 0) {
                            }
                            if (!z2) {
                            }
                            s2 = lo7Var.getMessagesController().s2(keyAt);
                            int i82 = lo7Var.J;
                            if (s2) {
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
                    if (lo7Var.L) {
                    }
                    if (i == 0) {
                    }
                    if (i < 0) {
                    }
                    if (!z2) {
                    }
                    s2 = lo7Var.getMessagesController().s2(keyAt);
                    int i822 = lo7Var.J;
                    if (s2) {
                    }
                    if (i == 0) {
                    }
                }
                ArrayList arrayList8 = arrayList6;
                if (!arrayList5.isEmpty()) {
                    gm.c3(new bo7(lo7Var, arrayList5, (byte) 3));
                }
                if (i4 != lo7Var.J) {
                    if (lo7Var.L) {
                        lo7Var.Q(lo7Var.M > lo7Var.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList8.clear();
                        lo7Var.Z(lo7Var.L);
                    }
                    gm.c3(new fo7(lo7Var, vh6Var5.m(), (byte) 2));
                }
                lo7Var.L = false;
                if (lo7Var.S) {
                    lo7Var.S(lo7Var.t());
                    break;
                }
                break;
            default:
                lo7 lo7Var2 = this.b;
                ArrayList arrayList9 = lo7Var2.b;
                vh6 vh6Var6 = lo7Var2.c;
                ArrayList arrayList10 = lo7Var2.a;
                vh6 vh6Var7 = lo7Var2.f;
                int i11 = lo7Var2.J;
                lo7Var2.getAccountInstance().d();
                Integer num4 = 0;
                int i12 = 0;
                while (i12 < longSparseIntArray.size()) {
                    long keyAt2 = longSparseIntArray.keyAt(i12);
                    long j5 = -keyAt2;
                    long j6 = longSparseIntArray.get(keyAt2);
                    Integer num5 = (Integer) vh6Var7.f(j5);
                    Integer num6 = num5 == null ? num4 : num5;
                    Integer num7 = num4;
                    Integer num8 = num6;
                    int i13 = 0;
                    while (i13 < arrayList10.size()) {
                        k47 k47Var2 = (k47) arrayList10.get(i13);
                        int i14 = i13;
                        if (k47.B0(k47Var2.k) == j5) {
                            i2 = i12;
                            j2 = j6;
                            if (k47Var2.e1() <= j2) {
                                SparseArray sparseArray2 = (SparseArray) vh6Var6.f(j5);
                                if (sparseArray2 != null) {
                                    sparseArray2.remove(k47Var2.e1());
                                    if (sparseArray2.size() == 0) {
                                        vh6Var6.l(j5);
                                    }
                                }
                                arrayList9.remove(k47Var2);
                                arrayList10.remove(k47Var2);
                                i3 = i14 - 1;
                                if (lo7.y(k47Var2)) {
                                    lo7Var2.K--;
                                }
                                arrayList5.add(k47Var2);
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
                        lo7Var2.e.l(j5);
                        num2 = num7;
                    } else {
                        num2 = num8;
                    }
                    if (!num2.equals(num6)) {
                        if (!lo7Var2.getMessagesController().m2(j5)) {
                            boolean s23 = lo7Var2.getMessagesController().s2(j5);
                            int i16 = lo7Var2.J;
                            if (s23) {
                                int i17 = i16 - (num6.intValue() > 0 ? 1 : 0);
                                lo7Var2.J = i17;
                                lo7Var2.J = i17 + (num2.intValue() > 0 ? 1 : 0);
                            } else {
                                int intValue = i16 - num6.intValue();
                                lo7Var2.J = intValue;
                                lo7Var2.J = num2.intValue() + intValue;
                            }
                        }
                        vh6Var7.k(num2, j5);
                    }
                    if (num2.intValue() == 0) {
                        vh6Var7.l(j5);
                        lo7Var2.r.l(j5);
                    }
                    i12 = i15 + 1;
                    num4 = num7;
                }
                if (arrayList5.isEmpty()) {
                    gm.c3(new bo7(lo7Var2, arrayList5, (byte) 4));
                }
                if (i11 != lo7Var2.J) {
                    if (lo7Var2.L) {
                        lo7Var2.Q(lo7Var2.M > lo7Var2.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList9.clear();
                        lo7Var2.Z(lo7Var2.L);
                    }
                    gm.c3(new fo7(lo7Var2, vh6Var7.m(), (byte) 3));
                }
                lo7Var2.L = false;
                if (lo7Var2.S) {
                    lo7Var2.S(lo7Var2.t());
                    break;
                }
                break;
        }
    }
}
