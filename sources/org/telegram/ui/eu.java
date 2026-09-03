package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Comparator;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ eu(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                DownloadController.Preset preset = (DownloadController.Preset) obj;
                DownloadController.Preset preset2 = (DownloadController.Preset) obj2;
                int typeToIndex = DownloadController.typeToIndex(4);
                int typeToIndex2 = DownloadController.typeToIndex(8);
                int i11 = 0;
                boolean z4 = false;
                boolean z10 = false;
                while (true) {
                    int[] iArr = preset.mask;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        if ((i12 & 4) != 0) {
                            z4 = true;
                        }
                        if ((i12 & 8) != 0) {
                            z10 = true;
                        }
                        if (!z4 || !z10) {
                            i11++;
                        }
                    }
                }
                int i13 = 0;
                boolean z11 = false;
                boolean z12 = false;
                while (true) {
                    int[] iArr2 = preset2.mask;
                    if (i13 < iArr2.length) {
                        int i14 = iArr2[i13];
                        if ((i14 & 4) != 0) {
                            z11 = true;
                        }
                        if ((i14 & 8) != 0) {
                            z12 = true;
                        }
                        if (!z11 || !z12) {
                            i13++;
                        }
                    }
                }
                long j10 = (z4 ? preset.sizes[typeToIndex] : 0L) + (z10 ? preset.sizes[typeToIndex2] : 0L) + (preset.preloadStories ? 1L : 0L);
                long j11 = (z11 ? preset2.sizes[typeToIndex] : 0L) + (z12 ? preset2.sizes[typeToIndex2] : 0L) + (preset2.preloadStories ? 1L : 0L);
                if (j10 > j11) {
                    return 1;
                }
                return j10 < j11 ? -1 : 0;
            case 1:
                return Long.compare(((uu) obj2).c, ((uu) obj).c);
            case 2:
                long j12 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j13 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j12 > j13) {
                    return 1;
                }
                return j12 < j13 ? -1 : 0;
            case 3:
                int i15 = ((ContactsController.Contact) obj).imported;
                int i16 = ((ContactsController.Contact) obj2).imported;
                if (i15 > i16) {
                    return -1;
                }
                return i15 < i16 ? 1 : 0;
            case 4:
                long j14 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j15 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j14 > j15) {
                    return 1;
                }
                return j14 < j15 ? -1 : 0;
            case 5:
                long j16 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j17 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j16 > j17) {
                    return 1;
                }
                return j16 < j17 ? -1 : 0;
            case 6:
                return ((String) obj).compareTo((String) obj2);
            case 7:
                Drawable[] drawableArr = PhotoViewer.Q8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 8:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 9:
                int i17 = obj instanceof w01 ? ((w01) obj).g : obj instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj).num : 0;
                int i18 = obj2 instanceof w01 ? ((w01) obj2).g : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).num : 0;
                if (i17 < i18) {
                    return -1;
                }
                return i17 > i18 ? 1 : 0;
            case 10:
                long j18 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j19 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j18 > j19) {
                    return 1;
                }
                return j18 < j19 ? -1 : 0;
            case 11:
                return Integer.compare(((org.telegram.ui.ActionBar.i6) obj).S, ((org.telegram.ui.ActionBar.i6) obj2).S);
            case 12:
                long j20 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j21 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j20 > j21) {
                    return 1;
                }
                return j20 < j21 ? -1 : 0;
            case 13:
                long j22 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j23 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j22 > j23) {
                    return 1;
                }
                return j22 < j23 ? -1 : 0;
            case 14:
                return (int) (((org.telegram.ui.web.j) obj2).c - ((org.telegram.ui.web.j) obj).c);
            case 15:
                return (int) (((org.telegram.ui.web.j) obj2).c - ((org.telegram.ui.web.j) obj).c);
            case 16:
                mg.q0 q0Var = (mg.q0) obj2;
                String str = ((mg.q0) obj).f;
                int i19 = (str == null || !str.equals("❤")) ? 0 : -1;
                String str2 = q0Var.f;
                if (str2 != null && str2.equals("❤")) {
                    i10 = -1;
                }
                return i19 - i10;
            case 17:
                return (int) (((ph.ja) obj2).e - ((ph.ja) obj).e);
            case 18:
                s4.b bVar = (s4.b) obj;
                s4.b bVar2 = (s4.b) obj2;
                int compare = Integer.compare(bVar.c, bVar2.c);
                return compare != 0 ? compare : bVar.b.compareTo(bVar2.b);
            case 19:
                int i20 = ((tf.y) obj).b;
                int i21 = ((tf.y) obj2).b;
                if (i20 < i21) {
                    return 1;
                }
                return i20 > i21 ? -1 : 0;
            case 20:
                return Double.compare(((TLRPC.TL_topPeer) obj2).rating, ((TLRPC.TL_topPeer) obj).rating);
            case 21:
                int i22 = ((tf.h1) obj).b;
                int i23 = ((tf.h1) obj2).b;
                if (i22 < i23) {
                    return 1;
                }
                return i22 > i23 ? -1 : 0;
            case 22:
                return ((TL_account.TL_businessWeeklyOpen) obj).start_minute - ((TL_account.TL_businessWeeklyOpen) obj2).start_minute;
            case 23:
                return ((uf.o1) obj).c - ((uf.o1) obj2).c;
            case 24:
                return Integer.compare(((w4.d) obj2).b, ((w4.d) obj).b);
            default:
                return ((f2.l1) obj2).a.getTop() - ((f2.l1) obj).a.getTop();
        }
    }
}
