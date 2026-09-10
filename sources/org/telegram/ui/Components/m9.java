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
import org.telegram.messenger.camera.Size;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ m9(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                i10 = ((n9) obj2).b;
                i11 = ((n9) obj).b;
                break;
            case 1:
                return Long.compare(((bd) obj).c, ((bd) obj2).c);
            case 2:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                return abs > abs2 ? 1 : 0;
            case 3:
                ad.a aVar = (ad.a) obj;
                ad.a aVar2 = (ad.a) obj2;
                int compare = Integer.compare(aVar.b, aVar2.b);
                return compare != 0 ? compare : Integer.compare(aVar2.d, aVar.d);
            case 4:
                i10 = ((Integer) obj2).intValue();
                i11 = ((Integer) obj).intValue();
                break;
            case 5:
                float f7 = ((wg0) obj).a;
                float f10 = ((wg0) obj2).a;
                if (f7 > f10) {
                    return -1;
                }
                return f7 < f10 ? 1 : 0;
            case 6:
                return Float.compare(((sl0) obj).a, ((sl0) obj2).a);
            case 7:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 8:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
            case 9:
                int i12 = ((gq0) obj).c;
                int i13 = ((gq0) obj2).c;
                if (i12 < i13) {
                    return 1;
                }
                return i12 > i13 ? -1 : 0;
            case 10:
                i10 = ((fu0) obj2).c;
                i11 = ((fu0) obj).c;
                break;
            case 11:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue() ? -1 : 0;
            case 12:
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
                long j3 = (z10 ? preset.sizes[typeToIndex] : 0L) + (z11 ? preset.sizes[typeToIndex2] : 0L) + (preset.preloadStories ? 1L : 0L);
                long j10 = (z12 ? preset2.sizes[typeToIndex] : 0L) + (z13 ? preset2.sizes[typeToIndex2] : 0L) + (preset2.preloadStories ? 1L : 0L);
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 13:
                return Long.compare(((org.telegram.ui.wu) obj2).c, ((org.telegram.ui.wu) obj).c);
            case 14:
                long j11 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j12 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 15:
                int i18 = ((ContactsController.Contact) obj).imported;
                int i19 = ((ContactsController.Contact) obj2).imported;
                if (i18 > i19) {
                    return -1;
                }
                return i18 < i19 ? 1 : 0;
            case 16:
                long j13 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j14 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j13 > j14) {
                    return 1;
                }
                return j13 < j14 ? -1 : 0;
            case 17:
                long j15 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j16 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j15 > j16) {
                    return 1;
                }
                return j15 < j16 ? -1 : 0;
            case 18:
                return ((String) obj).compareTo((String) obj2);
            case 19:
                Drawable[] drawableArr = PhotoViewer.T8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 20:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 21:
                int i20 = obj instanceof org.telegram.ui.o11 ? ((org.telegram.ui.o11) obj).g : obj instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj).num : 0;
                int i21 = obj2 instanceof org.telegram.ui.o11 ? ((org.telegram.ui.o11) obj2).g : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).num : 0;
                if (i20 < i21) {
                    return -1;
                }
                return i20 > i21 ? 1 : 0;
            case 22:
                long j17 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j18 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j17 > j18) {
                    return 1;
                }
                return j17 < j18 ? -1 : 0;
            case 23:
                return Integer.compare(((org.telegram.ui.ActionBar.i6) obj).V, ((org.telegram.ui.ActionBar.i6) obj2).V);
            case 24:
                long j19 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j20 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j19 > j20) {
                    return 1;
                }
                return j19 < j20 ? -1 : 0;
            case 25:
                long j21 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j22 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j21 > j22) {
                    return 1;
                }
                return j21 < j22 ? -1 : 0;
            case 26:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 27:
                return (int) (((org.telegram.ui.web.k) obj2).c - ((org.telegram.ui.web.k) obj).c);
            case 28:
                return ((p2.d) obj).a.compareTo(((p2.d) obj2).a);
            default:
                return (int) ((((qg.p1) obj).a * 100.0f) - (((qg.p1) obj2).a * 100.0f));
        }
        return i10 - i11;
    }
}
