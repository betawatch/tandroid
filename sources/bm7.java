// default package

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class bm7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ im7 b;
    public final /* synthetic */ LongSparseIntArray c;
    public final /* synthetic */ ArrayList d;

    public /* synthetic */ bm7(im7 im7Var, LongSparseIntArray longSparseIntArray, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = im7Var;
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
        boolean r2;
        ArrayList arrayList;
        vf6 vf6Var;
        ArrayList arrayList2;
        ArrayList arrayList3;
        vf6 vf6Var2;
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
                im7 im7Var = this.b;
                vf6 vf6Var3 = im7Var.c;
                ArrayList arrayList6 = im7Var.b;
                vf6 vf6Var4 = im7Var.r;
                ArrayList arrayList7 = im7Var.a;
                vf6 vf6Var5 = im7Var.f;
                int i4 = im7Var.J;
                im7Var.getAccountInstance().d();
                int i5 = 0;
                while (i5 < longSparseIntArray.size()) {
                    long keyAt = longSparseIntArray.keyAt(i5);
                    Integer num3 = (Integer) vf6Var5.f(keyAt);
                    int i6 = longSparseIntArray.get(keyAt);
                    if (cf3.y(keyAt)) {
                        TLRPC.Chat K0 = im7Var.getMessagesController().K0(Long.valueOf(-keyAt));
                        int i7 = (K0 == null || K0.min || hc2.r0(K0) || hc2.Y(K0)) ? 0 : i6;
                        if (K0 != null) {
                            z = K0.forum;
                            i = i7;
                            if (z) {
                                int o = im7Var.o(keyAt, 0L);
                                if (o == -1) {
                                    j = 0;
                                    z2 = im7Var.x(keyAt, null, false, false);
                                } else {
                                    j = 0;
                                    if (o == 2) {
                                        z2 = false;
                                    }
                                }
                                if (im7Var.L && !z2 && (num = (Integer) vf6Var4.f(keyAt)) != null && num.intValue() != 0) {
                                    i = num.intValue();
                                    z2 = true;
                                }
                                if (i == 0) {
                                    im7Var.e.l(keyAt);
                                }
                                if (i < 0) {
                                    if (num3 != null) {
                                        i = num3.intValue() + i;
                                    }
                                    arrayList = arrayList6;
                                    vf6Var = vf6Var4;
                                    arrayList2 = arrayList7;
                                    i5++;
                                    arrayList7 = arrayList2;
                                    arrayList6 = arrayList;
                                    vf6Var4 = vf6Var;
                                }
                                if ((!z2 || i == 0) && num3 != null) {
                                    r2 = im7Var.getMessagesController().r2(keyAt);
                                    int i8 = im7Var.J;
                                    if (r2) {
                                        im7Var.J = i8 - (num3.intValue() > 0 ? 1 : 0);
                                    } else {
                                        im7Var.J = i8 - num3.intValue();
                                    }
                                }
                                if (i == 0) {
                                    vf6Var5.l(keyAt);
                                    vf6Var4.l(keyAt);
                                    int i9 = 0;
                                    while (i9 < arrayList7.size()) {
                                        k27 k27Var = (k27) arrayList7.get(i9);
                                        TLRPC.Message message = k27Var.k;
                                        if (message.from_scheduled || k27.B0(message) != keyAt || k27Var.J) {
                                            arrayList3 = arrayList6;
                                            vf6Var2 = vf6Var4;
                                            arrayList4 = arrayList7;
                                        } else {
                                            if (im7.y(k27Var)) {
                                                im7Var.K--;
                                            }
                                            arrayList7.remove(i9);
                                            i9--;
                                            arrayList6.remove(k27Var);
                                            arrayList3 = arrayList6;
                                            vf6Var2 = vf6Var4;
                                            long j3 = k27Var.k.peer_id.channel_id;
                                            long j4 = j3 != j ? -j3 : j;
                                            SparseArray sparseArray = (SparseArray) vf6Var3.f(j4);
                                            arrayList4 = arrayList7;
                                            if (sparseArray != null) {
                                                sparseArray.remove(k27Var.e1());
                                                if (sparseArray.size() == 0) {
                                                    vf6Var3.l(j4);
                                                }
                                            }
                                            arrayList5.add(k27Var);
                                        }
                                        i9++;
                                        arrayList7 = arrayList4;
                                        arrayList6 = arrayList3;
                                        vf6Var4 = vf6Var2;
                                    }
                                    arrayList = arrayList6;
                                    vf6Var = vf6Var4;
                                    arrayList2 = arrayList7;
                                    i5++;
                                    arrayList7 = arrayList2;
                                    arrayList6 = arrayList;
                                    vf6Var4 = vf6Var;
                                } else {
                                    arrayList = arrayList6;
                                    vf6Var = vf6Var4;
                                    arrayList2 = arrayList7;
                                    if (z2) {
                                        if (!im7Var.getMessagesController().l2(keyAt)) {
                                            boolean r22 = im7Var.getMessagesController().r2(keyAt);
                                            int i10 = im7Var.J;
                                            if (r22) {
                                                im7Var.J = i10 + (i > 0 ? 1 : 0);
                                            } else {
                                                im7Var.J = i10 + i;
                                            }
                                        }
                                        vf6Var5.k(Integer.valueOf(i), keyAt);
                                    }
                                    i5++;
                                    arrayList7 = arrayList2;
                                    arrayList6 = arrayList;
                                    vf6Var4 = vf6Var;
                                }
                            } else {
                                j = 0;
                            }
                            z2 = true;
                            if (im7Var.L) {
                                i = num.intValue();
                                z2 = true;
                            }
                            if (i == 0) {
                            }
                            if (i < 0) {
                            }
                            if (!z2) {
                            }
                            r2 = im7Var.getMessagesController().r2(keyAt);
                            int i82 = im7Var.J;
                            if (r2) {
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
                    if (im7Var.L) {
                    }
                    if (i == 0) {
                    }
                    if (i < 0) {
                    }
                    if (!z2) {
                    }
                    r2 = im7Var.getMessagesController().r2(keyAt);
                    int i822 = im7Var.J;
                    if (r2) {
                    }
                    if (i == 0) {
                    }
                }
                ArrayList arrayList8 = arrayList6;
                if (!arrayList5.isEmpty()) {
                    gl.d3(new yl7(im7Var, arrayList5, (byte) 3));
                }
                if (i4 != im7Var.J) {
                    if (im7Var.L) {
                        im7Var.Q(im7Var.M > im7Var.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList8.clear();
                        im7Var.Z(im7Var.L);
                    }
                    gl.d3(new cm7(im7Var, vf6Var5.m(), (byte) 2));
                }
                im7Var.L = false;
                if (im7Var.S) {
                    im7Var.S(im7Var.t());
                    break;
                }
                break;
            default:
                im7 im7Var2 = this.b;
                ArrayList arrayList9 = im7Var2.b;
                vf6 vf6Var6 = im7Var2.c;
                ArrayList arrayList10 = im7Var2.a;
                vf6 vf6Var7 = im7Var2.f;
                int i11 = im7Var2.J;
                im7Var2.getAccountInstance().d();
                Integer num4 = 0;
                int i12 = 0;
                while (i12 < longSparseIntArray.size()) {
                    long keyAt2 = longSparseIntArray.keyAt(i12);
                    long j5 = -keyAt2;
                    long j6 = longSparseIntArray.get(keyAt2);
                    Integer num5 = (Integer) vf6Var7.f(j5);
                    Integer num6 = num5 == null ? num4 : num5;
                    Integer num7 = num4;
                    Integer num8 = num6;
                    int i13 = 0;
                    while (i13 < arrayList10.size()) {
                        k27 k27Var2 = (k27) arrayList10.get(i13);
                        int i14 = i13;
                        if (k27.B0(k27Var2.k) == j5) {
                            i2 = i12;
                            j2 = j6;
                            if (k27Var2.e1() <= j2) {
                                SparseArray sparseArray2 = (SparseArray) vf6Var6.f(j5);
                                if (sparseArray2 != null) {
                                    sparseArray2.remove(k27Var2.e1());
                                    if (sparseArray2.size() == 0) {
                                        vf6Var6.l(j5);
                                    }
                                }
                                arrayList9.remove(k27Var2);
                                arrayList10.remove(k27Var2);
                                i3 = i14 - 1;
                                if (im7.y(k27Var2)) {
                                    im7Var2.K--;
                                }
                                arrayList5.add(k27Var2);
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
                        im7Var2.e.l(j5);
                        num2 = num7;
                    } else {
                        num2 = num8;
                    }
                    if (!num2.equals(num6)) {
                        if (!im7Var2.getMessagesController().l2(j5)) {
                            boolean r23 = im7Var2.getMessagesController().r2(j5);
                            int i16 = im7Var2.J;
                            if (r23) {
                                int i17 = i16 - (num6.intValue() > 0 ? 1 : 0);
                                im7Var2.J = i17;
                                im7Var2.J = i17 + (num2.intValue() > 0 ? 1 : 0);
                            } else {
                                int intValue = i16 - num6.intValue();
                                im7Var2.J = intValue;
                                im7Var2.J = num2.intValue() + intValue;
                            }
                        }
                        vf6Var7.k(num2, j5);
                    }
                    if (num2.intValue() == 0) {
                        vf6Var7.l(j5);
                        im7Var2.r.l(j5);
                    }
                    i12 = i15 + 1;
                    num4 = num7;
                }
                if (arrayList5.isEmpty()) {
                    gl.d3(new yl7(im7Var2, arrayList5, (byte) 4));
                }
                if (i11 != im7Var2.J) {
                    if (im7Var2.L) {
                        im7Var2.Q(im7Var2.M > im7Var2.getConnectionsManager().getCurrentTime());
                    } else {
                        arrayList9.clear();
                        im7Var2.Z(im7Var2.L);
                    }
                    gl.d3(new cm7(im7Var2, vf6Var7.m(), (byte) 3));
                }
                im7Var2.L = false;
                if (im7Var2.S) {
                    im7Var2.S(im7Var2.t());
                    break;
                }
                break;
        }
    }
}
