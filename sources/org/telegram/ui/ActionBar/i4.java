package org.telegram.ui.ActionBar;

import android.util.Pair;
import android.view.MenuItem;
import java.util.Comparator;
import java.util.List;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.camera.Size;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cd;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.ru0;
import org.telegram.ui.Components.sq0;
import org.telegram.ui.gu;
import org.telegram.ui.hr;
import org.telegram.ui.v6;
import org.telegram.ui.x6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class i4 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ i4(int i10) {
        this.a = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0311 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        int id2;
        int id3;
        switch (this.a) {
            case 0:
                return ((MenuItem) obj).getOrder() - ((MenuItem) obj2).getOrder();
            case 1:
                List list = x4.r;
                return (list.contains(Integer.valueOf(((MenuItem) obj).getItemId())) ? 1 : 0) - (list.contains(Integer.valueOf(((MenuItem) obj2).getItemId())) ? 1 : 0);
            case 2:
                g6 g6Var = (g6) obj;
                g6 g6Var2 = (g6) obj2;
                if (g6Var.b == null && g6Var.d == null) {
                    return -1;
                }
                if (g6Var2.b == null && g6Var2.d == null) {
                    return 1;
                }
                return g6Var.a.compareTo(g6Var2.a);
            case 3:
                f6 f6Var = (f6) obj;
                f6 f6Var2 = (f6) obj2;
                if (!h6.h1(f6Var)) {
                    if (!h6.h1(f6Var2)) {
                        ?? r02 = f6Var.z;
                        ?? r12 = f6Var2.z;
                        if (r02 == r12) {
                            if (r02 != 0) {
                                int i12 = f6Var.a;
                                int i13 = f6Var2.a;
                                if (i12 <= i13) {
                                    if (i12 >= i13) {
                                        return 0;
                                    }
                                }
                            } else {
                                int i14 = f6Var.a;
                                int i15 = f6Var2.a;
                                if (i14 <= i15) {
                                    if (i14 < i15) {
                                    }
                                }
                            }
                        } else if (r02 > r12) {
                        }
                    }
                    return 1;
                }
                return -1;
            case 4:
                long j10 = ((v6) obj2).c;
                long j11 = ((v6) obj).c;
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 5:
                return Long.compare(((x6) obj2).g, ((x6) obj).g);
            case 6:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) obj;
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) obj2;
                float f7 = s1Var.e;
                float f10 = s1Var2.e;
                if (f7 <= f10) {
                    if (f7 < f10 || (i10 = s1Var.d) > (i11 = s1Var2.d)) {
                        return 1;
                    }
                    if (i10 >= i11) {
                        return 0;
                    }
                }
                return -1;
            case 7:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 8:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 9:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 10:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 11:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j02 = hr.j0(tLObject);
                int j03 = hr.j0(tLObject2);
                if (j02 > j03) {
                    return 1;
                }
                if (j02 < j03) {
                    return -1;
                }
                if ((tLObject instanceof TLRPC.ChannelParticipant) && (tLObject2 instanceof TLRPC.ChannelParticipant)) {
                    return (int) (MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer) - MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject2).peer));
                }
                return 0;
            case 12:
                int j04 = hr.j0((TLObject) obj);
                int j05 = hr.j0((TLObject) obj2);
                if (j04 > j05) {
                    return 1;
                }
                return j04 < j05 ? -1 : 0;
            case 13:
                id2 = ((n9) obj2).b;
                id3 = ((n9) obj).b;
                break;
            case 14:
                id2 = ((n9) obj2).b;
                id3 = ((n9) obj).b;
                break;
            case 15:
                return Long.compare(((cd) obj).c, ((cd) obj2).c);
            case 16:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                return abs > abs2 ? 1 : 0;
            case 17:
                cd.a aVar = (cd.a) obj;
                cd.a aVar2 = (cd.a) obj2;
                int compare = Integer.compare(aVar.b, aVar2.b);
                return compare != 0 ? compare : Integer.compare(aVar2.d, aVar.d);
            case 18:
                id2 = ((Integer) obj2).intValue();
                id3 = ((Integer) obj).intValue();
                break;
            case 19:
                float f11 = ((hh0) obj).a;
                float f12 = ((hh0) obj2).a;
                if (f11 > f12) {
                    return -1;
                }
                return f11 < f12 ? 1 : 0;
            case 20:
                return Float.compare(((fm0) obj).a, ((fm0) obj2).a);
            case 21:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 22:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
            case 23:
                int i16 = ((sq0) obj).c;
                int i17 = ((sq0) obj2).c;
                if (i16 < i17) {
                    return 1;
                }
                return i16 > i17 ? -1 : 0;
            case 24:
                id2 = ((ru0) obj2).c;
                id3 = ((ru0) obj).c;
                break;
            case 25:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue() ? -1 : 0;
            case 26:
                DownloadController.Preset preset = (DownloadController.Preset) obj;
                DownloadController.Preset preset2 = (DownloadController.Preset) obj2;
                int typeToIndex = DownloadController.typeToIndex(4);
                int typeToIndex2 = DownloadController.typeToIndex(8);
                int i18 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = preset.mask;
                    if (i18 < iArr.length) {
                        int i19 = iArr[i18];
                        z10 = z10;
                        if ((i19 & 4) != 0) {
                            z10 = true;
                        }
                        z11 = z11;
                        if ((i19 & 8) != 0) {
                            z11 = true;
                        }
                        if (!z10 || !z11) {
                            i18++;
                            z10 = z10;
                            z11 = z11;
                        }
                    }
                }
                int i20 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    int[] iArr2 = preset2.mask;
                    if (i20 < iArr2.length) {
                        int i21 = iArr2[i20];
                        z12 = z12;
                        if ((i21 & 4) != 0) {
                            z12 = true;
                        }
                        z13 = z13;
                        if ((i21 & 8) != 0) {
                            z13 = true;
                        }
                        if (!z12 || !z13) {
                            i20++;
                            z12 = z12;
                            z13 = z13;
                        }
                    }
                }
                long j12 = (z10 ? preset.sizes[typeToIndex] : 0L) + (z11 ? preset.sizes[typeToIndex2] : 0L) + (preset.preloadStories ? 1L : 0L);
                long j13 = (z12 ? preset2.sizes[typeToIndex] : 0L) + (z13 ? preset2.sizes[typeToIndex2] : 0L) + (preset2.preloadStories ? 1L : 0L);
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 27:
                return Long.compare(((gu) obj2).c, ((gu) obj).c);
            case 28:
                long j14 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j15 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            default:
                int i22 = ((ContactsController.Contact) obj).imported;
                int i23 = ((ContactsController.Contact) obj2).imported;
                if (i22 > i23) {
                    return -1;
                }
                return i22 < i23 ? 1 : 0;
        }
        return id2 - id3;
    }
}
