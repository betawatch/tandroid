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
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ jn0(int i9) {
        this.a = i9;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i9;
        int i10;
        switch (this.a) {
            case 0:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 1:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
            case 2:
                int i11 = ((fp0) obj).c;
                int i12 = ((fp0) obj2).c;
                if (i11 < i12) {
                    return 1;
                }
                return i11 > i12 ? -1 : 0;
            case 3:
                i9 = ((ct0) obj2).c;
                i10 = ((ct0) obj).c;
                break;
            case 4:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue() ? -1 : 0;
            case 5:
                DownloadController.Preset preset = (DownloadController.Preset) obj;
                DownloadController.Preset preset2 = (DownloadController.Preset) obj2;
                int typeToIndex = DownloadController.typeToIndex(4);
                int typeToIndex2 = DownloadController.typeToIndex(8);
                int i13 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = preset.mask;
                    if (i13 < iArr.length) {
                        int i14 = iArr[i13];
                        if ((i14 & 4) != 0) {
                            z10 = true;
                        }
                        if ((i14 & 8) != 0) {
                            z11 = true;
                        }
                        if (!z10 || !z11) {
                            i13++;
                        }
                    }
                }
                int i15 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    int[] iArr2 = preset2.mask;
                    if (i15 < iArr2.length) {
                        int i16 = iArr2[i15];
                        if ((i16 & 4) != 0) {
                            z12 = true;
                        }
                        if ((i16 & 8) != 0) {
                            z13 = true;
                        }
                        if (!z12 || !z13) {
                            i15++;
                        }
                    }
                }
                long j10 = (z10 ? preset.sizes[typeToIndex] : 0L) + (z11 ? preset.sizes[typeToIndex2] : 0L) + (preset.preloadStories ? 1L : 0L);
                long j11 = (z12 ? preset2.sizes[typeToIndex] : 0L) + (z13 ? preset2.sizes[typeToIndex2] : 0L) + (preset2.preloadStories ? 1L : 0L);
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 6:
                return Long.compare(((org.telegram.ui.ju) obj2).c, ((org.telegram.ui.ju) obj).c);
            case 7:
                long j12 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j13 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 8:
                int i17 = ((ContactsController.Contact) obj).imported;
                int i18 = ((ContactsController.Contact) obj2).imported;
                if (i17 > i18) {
                    return -1;
                }
                return i17 < i18 ? 1 : 0;
            case 9:
                long j14 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j15 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            case 10:
                long j16 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j17 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j16 > j17) {
                    return 1;
                }
                return j16 < j17 ? -1 : 0;
            case 11:
                return ((String) obj).compareTo((String) obj2);
            case 12:
                Drawable[] drawableArr = PhotoViewer.P8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 13:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 14:
                int i19 = obj instanceof org.telegram.ui.e01 ? ((org.telegram.ui.e01) obj).g : obj instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj).num : 0;
                int i20 = obj2 instanceof org.telegram.ui.e01 ? ((org.telegram.ui.e01) obj2).g : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).num : 0;
                if (i19 < i20) {
                    return -1;
                }
                return i19 > i20 ? 1 : 0;
            case 15:
                long j18 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j19 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j18 > j19) {
                    return 1;
                }
                return j18 < j19 ? -1 : 0;
            case 16:
                return Integer.compare(((org.telegram.ui.ActionBar.e6) obj).R, ((org.telegram.ui.ActionBar.e6) obj2).R);
            case 17:
                long j20 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j21 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j20 > j21) {
                    return 1;
                }
                return j20 < j21 ? -1 : 0;
            case 18:
                long j22 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j23 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j22 > j23) {
                    return 1;
                }
                return j22 < j23 ? -1 : 0;
            case 19:
                return (int) (((org.telegram.ui.web.j) obj2).c - ((org.telegram.ui.web.j) obj).c);
            case 20:
                return (int) (((org.telegram.ui.web.j) obj2).c - ((org.telegram.ui.web.j) obj).c);
            case 21:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 22:
                return ((pf.q1) obj).c - ((pf.q1) obj2).c;
            case 23:
                i9 = ((f2.q1) obj2).a.getTop();
                i10 = ((f2.q1) obj).a.getTop();
                break;
            case 24:
                return Integer.compare(((s4.d) obj2).b, ((s4.d) obj).b);
            default:
                return (int) ((((zf.n1) obj).a * 100.0f) - (((zf.n1) obj2).a * 100.0f));
        }
        return i9 - i10;
    }
}
