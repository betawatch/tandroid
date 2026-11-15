package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import java.util.Comparator;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ me(int i7) {
        this.a = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int e12;
        int e13;
        long[] jArr;
        long[] jArr2;
        switch (this.a) {
            case 0:
                e12 = ((org.telegram.messenger.gj) obj2).e1();
                e13 = ((org.telegram.messenger.gj) obj).e1();
                break;
            case 1:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 2:
                e12 = ((org.telegram.messenger.gj) obj2).e1();
                e13 = ((org.telegram.messenger.gj) obj).e1();
                break;
            case 3:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int o02 = qq.o0(tLObject);
                int o03 = qq.o0(tLObject2);
                if (o02 > o03) {
                    return 1;
                }
                if (o02 < o03) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject).peer) - org.telegram.messenger.gj.B1(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 4:
                int o04 = qq.o0((TLObject) obj);
                int o05 = qq.o0((TLObject) obj2);
                if (o04 > o05) {
                    return 1;
                }
                return o04 < o05 ? -1 : 0;
            case 5:
                e12 = ((org.telegram.ui.Components.z8) obj2).b;
                e13 = ((org.telegram.ui.Components.z8) obj).b;
                break;
            case 6:
                e12 = ((org.telegram.ui.Components.z8) obj2).b;
                e13 = ((org.telegram.ui.Components.z8) obj).b;
                break;
            case 7:
                return Long.compare(((org.telegram.ui.Components.hc) obj).c, ((org.telegram.ui.Components.hc) obj2).c);
            case 8:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                return abs > abs2 ? 1 : 0;
            case 9:
                ad.a aVar = (ad.a) obj;
                ad.a aVar2 = (ad.a) obj2;
                int compare = Integer.compare(aVar.b, aVar2.b);
                return compare != 0 ? compare : Integer.compare(aVar2.d, aVar.d);
            case 10:
                e12 = ((Integer) obj2).intValue();
                e13 = ((Integer) obj).intValue();
                break;
            case 11:
                float f10 = ((org.telegram.ui.Components.qe0) obj).a;
                float f11 = ((org.telegram.ui.Components.qe0) obj2).a;
                if (f10 > f11) {
                    return -1;
                }
                return f10 < f11 ? 1 : 0;
            case 12:
                return Float.compare(((org.telegram.ui.Components.qj0) obj).a, ((org.telegram.ui.Components.qj0) obj2).a);
            case 13:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 14:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
            case 15:
                int i7 = ((org.telegram.ui.Components.eo0) obj).c;
                int i10 = ((org.telegram.ui.Components.eo0) obj2).c;
                if (i7 < i10) {
                    return 1;
                }
                return i7 > i10 ? -1 : 0;
            case 16:
                e12 = ((org.telegram.ui.Components.yr0) obj2).c;
                e13 = ((org.telegram.ui.Components.yr0) obj).c;
                break;
            case 17:
                return String.valueOf(org.telegram.ui.ActionBar.s4.c(((Integer) obj).intValue())).compareTo(String.valueOf(org.telegram.ui.ActionBar.s4.c(((Integer) obj2).intValue())));
            case 18:
                ((org.telegram.ui.Components.r01) obj2).getClass();
                ((org.telegram.ui.Components.r01) obj).getClass();
                return Integer.compare(0, 0);
            case 19:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue() ? -1 : 0;
            case 20:
                return Integer.compare(((org.telegram.ui.Components.voip.f) obj2).b, ((org.telegram.ui.Components.voip.f) obj).b);
            case 21:
                return Integer.compare(((org.telegram.ui.Components.voip.f) obj).c, ((org.telegram.ui.Components.voip.f) obj2).c);
            case 22:
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
                        z10 = z10;
                        if ((i12 & 4) != 0) {
                            z10 = true;
                        }
                        z11 = z11;
                        if ((i12 & 8) != 0) {
                            z11 = true;
                        }
                        if (!z10 || !z11) {
                            i11++;
                            z10 = z10;
                            z11 = z11;
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
                        z12 = z12;
                        if ((i14 & 4) != 0) {
                            z12 = true;
                        }
                        z13 = z13;
                        if ((i14 & 8) != 0) {
                            z13 = true;
                        }
                        if (!z12 || !z13) {
                            i13++;
                            z12 = z12;
                            z13 = z13;
                        }
                    }
                }
                long j3 = (z10 ? jArr[1] : 0L) + (z11 ? jArr[x10] : 0L) + (y5Var.e ? 1L : 0L);
                long j10 = (z12 ? jArr2[1] : 0L) + (z13 ? jArr2[x10] : 0L) + (y5Var2.e ? 1L : 0L);
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 23:
                return Long.compare(((jt) obj2).c, ((jt) obj).c);
            case 24:
                long j11 = org.telegram.messenger.m10.i(((Integer) obj).intValue()).Z;
                long j12 = org.telegram.messenger.m10.i(((Integer) obj2).intValue()).Z;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 25:
                int i15 = ((org.telegram.messenger.d5) obj).l;
                int i16 = ((org.telegram.messenger.d5) obj2).l;
                if (i15 > i16) {
                    return -1;
                }
                return i15 < i16 ? 1 : 0;
            case 26:
                long j13 = org.telegram.messenger.m10.i(((Integer) obj).intValue()).Z;
                long j14 = org.telegram.messenger.m10.i(((Integer) obj2).intValue()).Z;
                if (j13 > j14) {
                    return 1;
                }
                return j13 < j14 ? -1 : 0;
            case 27:
                long j15 = org.telegram.messenger.m10.i(((Integer) obj).intValue()).Z;
                long j16 = org.telegram.messenger.m10.i(((Integer) obj2).intValue()).Z;
                if (j15 > j16) {
                    return 1;
                }
                return j15 < j16 ? -1 : 0;
            case 28:
                return ((String) obj).compareTo((String) obj2);
            default:
                Drawable[] drawableArr = PhotoViewer.Z8;
                return ((org.telegram.messenger.gj) obj).e1() - ((org.telegram.messenger.gj) obj2).e1();
        }
        return e12 - e13;
    }
}
