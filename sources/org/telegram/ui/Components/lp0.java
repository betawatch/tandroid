package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import java.util.Comparator;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lp0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ lp0(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                int i12 = ((fp0) obj).c;
                int i13 = ((fp0) obj2).c;
                if (i12 < i13) {
                    return 1;
                }
                return i12 > i13 ? -1 : 0;
            case 1:
                i10 = ((et0) obj2).c;
                i11 = ((et0) obj).c;
                break;
            case 2:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 3:
                DownloadController.Preset preset = (DownloadController.Preset) obj;
                DownloadController.Preset preset2 = (DownloadController.Preset) obj2;
                int typeToIndex = DownloadController.typeToIndex(4);
                int typeToIndex2 = DownloadController.typeToIndex(8);
                int i14 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = preset.mask;
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
                    int[] iArr2 = preset2.mask;
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
                long j10 = (z10 ? preset.sizes[typeToIndex] : 0L) + (z11 ? preset.sizes[typeToIndex2] : 0L) + (preset.preloadStories ? 1L : 0L);
                long j11 = (z12 ? preset2.sizes[typeToIndex] : 0L) + (z13 ? preset2.sizes[typeToIndex2] : 0L) + (preset2.preloadStories ? 1L : 0L);
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 4:
                return Long.compare(((org.telegram.ui.mu) obj2).c, ((org.telegram.ui.mu) obj).c);
            case 5:
                long j12 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j13 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 6:
                int i18 = ((ContactsController.Contact) obj).imported;
                int i19 = ((ContactsController.Contact) obj2).imported;
                if (i18 > i19) {
                    return -1;
                }
                return i18 < i19 ? 1 : 0;
            case 7:
                long j14 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j15 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            case 8:
                long j16 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j17 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j16 > j17) {
                    return 1;
                }
                return j16 < j17 ? -1 : 0;
            case 9:
                return ((String) obj).compareTo((String) obj2);
            case 10:
                Drawable[] drawableArr = PhotoViewer.P8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 11:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 12:
                int i20 = obj instanceof org.telegram.ui.f01 ? ((org.telegram.ui.f01) obj).g : obj instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj).num : 0;
                int i21 = obj2 instanceof org.telegram.ui.f01 ? ((org.telegram.ui.f01) obj2).g : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).num : 0;
                if (i20 < i21) {
                    return -1;
                }
                return i20 > i21 ? 1 : 0;
            case 13:
                long j18 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j19 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j18 > j19) {
                    return 1;
                }
                return j18 < j19 ? -1 : 0;
            case 14:
                return Integer.compare(((org.telegram.ui.ActionBar.f6) obj).R, ((org.telegram.ui.ActionBar.f6) obj2).R);
            case 15:
                long j20 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j21 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j20 > j21) {
                    return 1;
                }
                return j20 < j21 ? -1 : 0;
            case 16:
                long j22 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j23 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j22 > j23) {
                    return 1;
                }
                return j22 < j23 ? -1 : 0;
            case 17:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 18:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 19:
                int i22 = ((pf.y) obj).b;
                int i23 = ((pf.y) obj2).b;
                if (i22 < i23) {
                    return 1;
                }
                return i22 > i23 ? -1 : 0;
            case 20:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 21:
                int i24 = ((pf.h1) obj).b;
                int i25 = ((pf.h1) obj2).b;
                if (i24 < i25) {
                    return 1;
                }
                return i24 > i25 ? -1 : 0;
            case 22:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 23:
                return ((qf.p1) obj).c - ((qf.p1) obj2).c;
            case 24:
                return Integer.compare(((s4.d) obj2).b, ((s4.d) obj).b);
            default:
                i10 = ((f2.o1) obj2).a.getTop();
                i11 = ((f2.o1) obj).a.getTop();
                break;
        }
        return i10 - i11;
    }
}
