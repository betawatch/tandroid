package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dl(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i7 = this.a;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.messenger.we weVar = (org.telegram.messenger.we) obj;
                org.telegram.messenger.we weVar2 = (org.telegram.messenger.we) obj2;
                boolean z9 = ChatAttachAlertPhotoLayout.q1;
                int i10 = weVar.a;
                if (i10 != 0 || weVar2.a == 0) {
                    if ((i10 != 0 && weVar2.a == 0) || (indexOf = arrayList.indexOf(weVar)) > (indexOf2 = arrayList.indexOf(weVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                gy gyVar = ((tv) obj3).G0;
                int indexOf3 = gyVar.d1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = gyVar.d1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
