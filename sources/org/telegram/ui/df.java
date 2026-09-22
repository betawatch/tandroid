package org.telegram.ui;

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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class df implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ df(int i10) {
        this.a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int id2;
        int id3;
        switch (this.a) {
            case 0:
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 1:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 2:
                return ((Integer) obj2).compareTo((Integer) obj);
            case 3:
                id2 = ((MessageObject) obj2).getId();
                id3 = ((MessageObject) obj).getId();
                break;
            case 4:
                TLObject tLObject = (TLObject) obj;
                TLObject tLObject2 = (TLObject) obj2;
                int j02 = ur.j0(tLObject);
                int j03 = ur.j0(tLObject2);
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
            case 5:
                int j04 = ur.j0((TLObject) obj);
                int j05 = ur.j0((TLObject) obj2);
                if (j04 > j05) {
                    return 1;
                }
                return j04 < j05 ? -1 : 0;
            case 6:
                id2 = ((org.telegram.ui.Components.l9) obj2).b;
                id3 = ((org.telegram.ui.Components.l9) obj).b;
                break;
            case 7:
                id2 = ((org.telegram.ui.Components.l9) obj2).b;
                id3 = ((org.telegram.ui.Components.l9) obj).b;
                break;
            case 8:
                return Long.compare(((org.telegram.ui.Components.ad) obj).c, ((org.telegram.ui.Components.ad) obj2).c);
            case 9:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                float abs = Math.abs(1.0f - (Math.min(size.mHeight, size.mWidth) / Math.max(size.mHeight, size.mWidth)));
                float abs2 = Math.abs(1.0f - (Math.min(size2.mHeight, size2.mWidth) / Math.max(size2.mHeight, size2.mWidth)));
                if (abs < abs2) {
                    return -1;
                }
                return abs > abs2 ? 1 : 0;
            case 10:
                ad.a aVar = (ad.a) obj;
                ad.a aVar2 = (ad.a) obj2;
                int compare = Integer.compare(aVar.b, aVar2.b);
                return compare != 0 ? compare : Integer.compare(aVar2.d, aVar.d);
            case 11:
                id2 = ((Integer) obj2).intValue();
                id3 = ((Integer) obj).intValue();
                break;
            case 12:
                float f7 = ((org.telegram.ui.Components.mg0) obj).a;
                float f10 = ((org.telegram.ui.Components.mg0) obj2).a;
                if (f7 > f10) {
                    return -1;
                }
                return f7 < f10 ? 1 : 0;
            case 13:
                return Float.compare(((org.telegram.ui.Components.il0) obj).a, ((org.telegram.ui.Components.il0) obj2).a);
            case 14:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                if (((Float) pair.first).floatValue() > ((Float) pair2.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair2.first).floatValue() > ((Float) pair.first).floatValue() ? -1 : 0;
            case 15:
                Pair pair3 = (Pair) obj;
                Pair pair4 = (Pair) obj2;
                if (((Float) pair3.first).floatValue() > ((Float) pair4.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair4.first).floatValue() > ((Float) pair3.first).floatValue() ? -1 : 0;
            case 16:
                int i10 = ((org.telegram.ui.Components.vp0) obj).c;
                int i11 = ((org.telegram.ui.Components.vp0) obj2).c;
                if (i10 < i11) {
                    return 1;
                }
                return i10 > i11 ? -1 : 0;
            case 17:
                id2 = ((org.telegram.ui.Components.wt0) obj2).c;
                id3 = ((org.telegram.ui.Components.wt0) obj).c;
                break;
            case 18:
                Pair pair5 = (Pair) obj;
                Pair pair6 = (Pair) obj2;
                if (((Float) pair5.first).floatValue() > ((Float) pair6.first).floatValue()) {
                    return 1;
                }
                return ((Float) pair6.first).floatValue() > ((Float) pair5.first).floatValue() ? -1 : 0;
            case 19:
                DownloadController.Preset preset = (DownloadController.Preset) obj;
                DownloadController.Preset preset2 = (DownloadController.Preset) obj2;
                int typeToIndex = DownloadController.typeToIndex(4);
                int typeToIndex2 = DownloadController.typeToIndex(8);
                int i12 = 0;
                boolean z10 = false;
                boolean z11 = false;
                while (true) {
                    int[] iArr = preset.mask;
                    if (i12 < iArr.length) {
                        int i13 = iArr[i12];
                        if ((i13 & 4) != 0) {
                            z10 = true;
                        }
                        if ((i13 & 8) != 0) {
                            z11 = true;
                        }
                        if (!z10 || !z11) {
                            i12++;
                        }
                    }
                }
                int i14 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (true) {
                    int[] iArr2 = preset2.mask;
                    if (i14 < iArr2.length) {
                        int i15 = iArr2[i14];
                        if ((i15 & 4) != 0) {
                            z12 = true;
                        }
                        if ((i15 & 8) != 0) {
                            z13 = true;
                        }
                        if (!z12 || !z13) {
                            i14++;
                        }
                    }
                }
                long j3 = (z10 ? preset.sizes[typeToIndex] : 0L) + (z11 ? preset.sizes[typeToIndex2] : 0L) + (preset.preloadStories ? 1L : 0L);
                long j10 = (z12 ? preset2.sizes[typeToIndex] : 0L) + (z13 ? preset2.sizes[typeToIndex2] : 0L) + (preset2.preloadStories ? 1L : 0L);
                if (j3 > j10) {
                    return 1;
                }
                return j3 < j10 ? -1 : 0;
            case 20:
                return Long.compare(((uu) obj2).c, ((uu) obj).c);
            case 21:
                long j11 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j12 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j11 > j12) {
                    return 1;
                }
                return j11 < j12 ? -1 : 0;
            case 22:
                int i16 = ((ContactsController.Contact) obj).imported;
                int i17 = ((ContactsController.Contact) obj2).imported;
                if (i16 > i17) {
                    return -1;
                }
                return i16 < i17 ? 1 : 0;
            case 23:
                long j13 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j14 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j13 > j14) {
                    return 1;
                }
                return j13 < j14 ? -1 : 0;
            case 24:
                long j15 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j16 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j15 > j16) {
                    return 1;
                }
                return j15 < j16 ? -1 : 0;
            case 25:
                return ((String) obj).compareTo((String) obj2);
            case 26:
                Drawable[] drawableArr = PhotoViewer.U8;
                return ((MessageObject) obj).getId() - ((MessageObject) obj2).getId();
            case 27:
                return (int) (((View) obj).getY() - ((View) obj2).getY());
            case 28:
                int i18 = obj instanceof j11 ? ((j11) obj).g : obj instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj).num : 0;
                int i19 = obj2 instanceof j11 ? ((j11) obj2).g : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).num : 0;
                if (i18 < i19) {
                    return -1;
                }
                return i18 > i19 ? 1 : 0;
            default:
                long j17 = UserConfig.getInstance(((Integer) obj).intValue()).loginTime;
                long j18 = UserConfig.getInstance(((Integer) obj2).intValue()).loginTime;
                if (j17 > j18) {
                    return 1;
                }
                return j17 < j18 ? -1 : 0;
        }
        return id2 - id3;
    }
}
