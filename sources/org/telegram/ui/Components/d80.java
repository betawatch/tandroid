package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d80 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ d80(int i3) {
        this.a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int intValue;
        int intValue2;
        long[] jArr;
        long[] jArr2;
        switch (this.a) {
            case 0:
                xc.a aVar = (xc.a) obj;
                xc.a aVar2 = (xc.a) obj2;
                int compare = Integer.compare(aVar.b, aVar2.b);
                return compare != 0 ? compare : Integer.compare(aVar2.d, aVar.d);
            case 1:
                intValue = ((Integer) obj2).intValue();
                intValue2 = ((Integer) obj).intValue();
                break;
            case 2:
                float f10 = ((pe0) obj).a;
                float f11 = ((pe0) obj2).a;
                if (f10 > f11) {
                    return -1;
                }
                return f10 < f11 ? 1 : 0;
            case 3:
                return Float.compare(((pj0) obj).a, ((pj0) obj2).a);
            case 4:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 5:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
            case 6:
                int i3 = ((do0) obj).c;
                int i10 = ((do0) obj2).c;
                if (i3 < i10) {
                    return 1;
                }
                return i3 > i10 ? -1 : 0;
            case 7:
                intValue = ((wr0) obj2).c;
                intValue2 = ((wr0) obj).c;
                break;
            case 8:
                return String.valueOf(org.telegram.ui.ActionBar.u4.c(((Integer) obj).intValue())).compareTo(String.valueOf(org.telegram.ui.ActionBar.u4.c(((Integer) obj2).intValue())));
            case 9:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue() ? -1 : 0;
            case 10:
                org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) obj;
                org.telegram.messenger.y5 y5Var2 = (org.telegram.messenger.y5) obj2;
                int x10 = org.telegram.messenger.z5.x(8);
                int i11 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = y5Var.a;
                    jArr = y5Var.b;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        if ((i12 & 4) != 0) {
                            z10 = true;
                        }
                        if ((i12 & 8) != 0) {
                            z11 = true;
                        }
                        if (!z10 || !z11) {
                            i11++;
                        }
                    }
                }
                int i13 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    int[] iArr2 = y5Var2.a;
                    jArr2 = y5Var2.b;
                    if (i13 < iArr2.length) {
                        int i14 = iArr2[i13];
                        if ((i14 & 4) != 0) {
                            z12 = true;
                        }
                        if ((i14 & 8) != 0) {
                            z13 = true;
                        }
                        if (!z12 || !z13) {
                            i13++;
                        }
                    }
                }
                long j10 = (z10 ? jArr[1] : 0L) + (z11 ? jArr[x10] : 0L) + (y5Var.e ? 1L : 0L);
                long j11 = (z12 ? jArr2[1] : 0L) + (z13 ? jArr2[x10] : 0L) + (y5Var2.e ? 1L : 0L);
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 11:
                return Long.compare(((org.telegram.ui.dt) obj2).c, ((org.telegram.ui.dt) obj).c);
            case 12:
                long j12 = org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z;
                long j13 = org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 13:
                int i15 = ((org.telegram.messenger.d5) obj).l;
                int i16 = ((org.telegram.messenger.d5) obj2).l;
                if (i15 > i16) {
                    return -1;
                }
                return i15 < i16 ? 1 : 0;
            case 14:
                long j14 = org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z;
                long j15 = org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            case 15:
                long j16 = org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z;
                long j17 = org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z;
                if (j16 > j17) {
                    return 1;
                }
                return j16 < j17 ? -1 : 0;
            case 16:
                return ((String) obj).compareTo((String) obj2);
            case 17:
                Drawable[] drawableArr = PhotoViewer.V8;
                return ((org.telegram.messenger.zi) obj).f1() - ((org.telegram.messenger.zi) obj2).f1();
            case 18:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 19:
                int i17 = obj instanceof org.telegram.ui.kw0 ? ((org.telegram.ui.kw0) obj).g : obj instanceof org.telegram.messenger.to ? ((org.telegram.messenger.to) obj).d : 0;
                int i18 = obj2 instanceof org.telegram.ui.kw0 ? ((org.telegram.ui.kw0) obj2).g : obj2 instanceof org.telegram.messenger.to ? ((org.telegram.messenger.to) obj2).d : 0;
                if (i17 < i18) {
                    return -1;
                }
                return i17 > i18 ? 1 : 0;
            case 20:
                long j18 = org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z;
                long j19 = org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z;
                if (j18 > j19) {
                    return 1;
                }
                return j18 < j19 ? -1 : 0;
            case 21:
                return Integer.compare(((org.telegram.ui.ActionBar.j6) obj).W, ((org.telegram.ui.ActionBar.j6) obj2).W);
            case 22:
                long j20 = org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z;
                long j21 = org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z;
                if (j20 > j21) {
                    return 1;
                }
                return j20 < j21 ? -1 : 0;
            case 23:
                return Integer.compare(((org.telegram.ui.Wallet.g0) obj2).b, ((org.telegram.ui.Wallet.g0) obj).b);
            case 24:
                return Integer.compare(((TL_wallet.walletTransaction) obj2).date, ((TL_wallet.walletTransaction) obj).date);
            case 25:
                long j22 = org.telegram.messenger.h10.i(((Integer) obj).intValue()).Z;
                long j23 = org.telegram.messenger.h10.i(((Integer) obj2).intValue()).Z;
                if (j22 > j23) {
                    return 1;
                }
                return j22 < j23 ? -1 : 0;
            case 26:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 27:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 28:
                return Long.compare(((org.telegram.utils.twidget.m) obj2).y, ((org.telegram.utils.twidget.m) obj).y);
            default:
                return ((r2.e) obj).a.compareTo(((r2.e) obj2).a);
        }
        return intValue - intValue2;
    }
}
