package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dl(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i3 = this.a;
        Object obj3 = this.b;
        switch (i3) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.messenger.pe peVar = (org.telegram.messenger.pe) obj;
                org.telegram.messenger.pe peVar2 = (org.telegram.messenger.pe) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.r1;
                int i10 = peVar.a;
                if (i10 != 0 || peVar2.a == 0) {
                    if ((i10 != 0 && peVar2.a == 0) || (indexOf = arrayList.indexOf(peVar)) > (indexOf2 = arrayList.indexOf(peVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                ey eyVar = ((sv) obj3).H0;
                int indexOf3 = eyVar.e1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = eyVar.e1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
