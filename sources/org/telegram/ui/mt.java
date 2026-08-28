package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mt(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((Comparator) this.b).compare(((lt) obj).a, ((lt) obj2).a);
            case 1:
                LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.b;
                int i9 = longSparseIntArray.get(((Long) obj).longValue());
                int i10 = longSparseIntArray.get(((Long) obj2).longValue());
                if (i9 > i10) {
                    return 1;
                }
                return i9 < i10 ? -1 : 0;
            case 2:
                LocaleController.LocaleInfo localeInfo = (LocaleController.LocaleInfo) this.b;
                LocaleController.LocaleInfo localeInfo2 = (LocaleController.LocaleInfo) obj;
                LocaleController.LocaleInfo localeInfo3 = (LocaleController.LocaleInfo) obj2;
                if (localeInfo2 != localeInfo) {
                    if (localeInfo3 != localeInfo) {
                        int i11 = localeInfo2.serverIndex;
                        int i12 = localeInfo3.serverIndex;
                        if (i11 == i12) {
                            return localeInfo2.name.compareTo(localeInfo3.name);
                        }
                        if (i11 <= i12) {
                            if (i11 >= i12) {
                                return 0;
                            }
                        }
                    }
                    return 1;
                }
                return -1;
            default:
                StickersActivity stickersActivity = (StickersActivity) this.b;
                int indexOf = stickersActivity.e.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = stickersActivity.e.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return 0;
                }
                return indexOf - indexOf2;
        }
    }
}
