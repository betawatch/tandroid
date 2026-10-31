package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.Comparator;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f6 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ f6(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int f12;
        int f13;
        long[] jArr;
        long[] jArr2;
        switch (this.a) {
            case 0:
                return Long.compare(((u6) obj2).g, ((u6) obj).g);
            case 1:
                org.telegram.ui.Cells.p1 p1Var = (org.telegram.ui.Cells.p1) obj;
                org.telegram.ui.Cells.p1 p1Var2 = (org.telegram.ui.Cells.p1) obj2;
                float f7 = p1Var.e;
                float f10 = p1Var2.e;
                if (f7 <= f10) {
                    if (f7 < f10 || (i10 = p1Var.d) > (i11 = p1Var2.d)) {
                        return 1;
                    }
                    if (i10 >= i11) {
                        return 0;
                    }
                }
                return -1;
            case 2:
                return ((org.telegram.messenger.jj) obj).f1() - ((org.telegram.messenger.jj) obj2).f1();
            case 3:
                f12 = ((org.telegram.messenger.jj) obj2).f1();
                f13 = ((org.telegram.messenger.jj) obj).f1();
                break;
            case 4:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 5:
                f12 = ((org.telegram.messenger.jj) obj2).f1();
                f13 = ((org.telegram.messenger.jj) obj).f1();
                break;
            case 6:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int n02 = pr.n0(tLObject);
                int n03 = pr.n0(tLObject2);
                if (n02 > n03) {
                    return 1;
                }
                if (n02 < n03) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) tLObject).peer) - org.telegram.messenger.jj.C1(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 7:
                int n04 = pr.n0((TLObject) obj);
                int n05 = pr.n0((TLObject) obj2);
                if (n04 > n05) {
                    return 1;
                }
                return n04 < n05 ? -1 : 0;
            case 8:
                f12 = ((org.telegram.ui.Components.x8) obj2).b;
                f13 = ((org.telegram.ui.Components.x8) obj).b;
                break;
            case 9:
                f12 = ((org.telegram.ui.Components.x8) obj2).b;
                f13 = ((org.telegram.ui.Components.x8) obj).b;
                break;
            case 10:
                return Long.compare(((org.telegram.ui.Components.hc) obj).c, ((org.telegram.ui.Components.hc) obj2).c);
            case 11:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                return abs > abs2 ? 1 : 0;
            case 12:
                uc.a aVar = (uc.a) obj;
                uc.a aVar2 = (uc.a) obj2;
                int compare = Integer.compare(aVar.b, aVar2.b);
                return compare != 0 ? compare : Integer.compare(aVar2.d, aVar.d);
            case 13:
                f12 = ((Integer) obj2).intValue();
                f13 = ((Integer) obj).intValue();
                break;
            case 14:
                float f11 = ((org.telegram.ui.Components.qf0) obj).a;
                float f14 = ((org.telegram.ui.Components.qf0) obj2).a;
                if (f11 > f14) {
                    return -1;
                }
                return f11 < f14 ? 1 : 0;
            case 15:
                return Float.compare(((org.telegram.ui.Components.pk0) obj).a, ((org.telegram.ui.Components.pk0) obj2).a);
            case 16:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 17:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
            case 18:
                int i12 = ((org.telegram.ui.Components.dp0) obj).c;
                int i13 = ((org.telegram.ui.Components.dp0) obj2).c;
                if (i12 < i13) {
                    return 1;
                }
                return i12 > i13 ? -1 : 0;
            case 19:
                f12 = ((org.telegram.ui.Components.xs0) obj2).c;
                f13 = ((org.telegram.ui.Components.xs0) obj).c;
                break;
            case 20:
                return String.valueOf(org.telegram.ui.ActionBar.d5.c(((Integer) obj).intValue())).compareTo(String.valueOf(org.telegram.ui.ActionBar.d5.c(((Integer) obj2).intValue())));
            case 21:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue() ? -1 : 0;
            case 22:
                org.telegram.messenger.a6 a6Var = (org.telegram.messenger.a6) obj;
                org.telegram.messenger.a6 a6Var2 = (org.telegram.messenger.a6) obj2;
                int x10 = org.telegram.messenger.b6.x(8);
                int i14 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = a6Var.a;
                    jArr = a6Var.b;
                    if (i14 < iArr.length) {
                        int i15 = iArr[i14];
                        if ((i15 & 4) != 0) {
                            z10 = true;
                        }
                        if ((i15 & 8) != 0) {
                            z11 = true;
                        }
                        if (!z10 || !z11) {
                            i14++;
                        }
                    }
                }
                int i16 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    int[] iArr2 = a6Var2.a;
                    jArr2 = a6Var2.b;
                    if (i16 < iArr2.length) {
                        int i17 = iArr2[i16];
                        if ((i17 & 4) != 0) {
                            z12 = true;
                        }
                        if ((i17 & 8) != 0) {
                            z13 = true;
                        }
                        if (!z12 || !z13) {
                            i16++;
                        }
                    }
                }
                long j10 = (z10 ? jArr[1] : 0L) + (z11 ? jArr[x10] : 0L) + (a6Var.e ? 1L : 0L);
                long j11 = (z12 ? jArr2[1] : 0L) + (z13 ? jArr2[x10] : 0L) + (a6Var2.e ? 1L : 0L);
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 23:
                return Long.compare(((iu) obj2).c, ((iu) obj).c);
            case 24:
                long j12 = org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y;
                long j13 = org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 25:
                int i18 = ((org.telegram.messenger.f5) obj).l;
                int i19 = ((org.telegram.messenger.f5) obj2).l;
                if (i18 > i19) {
                    return -1;
                }
                return i18 < i19 ? 1 : 0;
            case 26:
                long j14 = org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y;
                long j15 = org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            case 27:
                long j16 = org.telegram.messenger.d20.i(((Integer) obj).intValue()).Y;
                long j17 = org.telegram.messenger.d20.i(((Integer) obj2).intValue()).Y;
                if (j16 > j17) {
                    return 1;
                }
                return j16 < j17 ? -1 : 0;
            case 28:
                return ((String) obj).compareTo((String) obj2);
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((org.telegram.messenger.jj) obj).f1() - ((org.telegram.messenger.jj) obj2).f1();
        }
        return f12 - f13;
    }
}
