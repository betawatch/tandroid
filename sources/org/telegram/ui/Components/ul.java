package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ul(Object obj, int i7) {
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
                org.telegram.messenger.ve veVar = (org.telegram.messenger.ve) obj;
                org.telegram.messenger.ve veVar2 = (org.telegram.messenger.ve) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.r1;
                int i10 = veVar.a;
                if (i10 != 0 || veVar2.a == 0) {
                    if ((i10 != 0 && veVar2.a == 0) || (indexOf = arrayList.indexOf(veVar)) > (indexOf2 = arrayList.indexOf(veVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                ty tyVar = ((hw) obj3).H0;
                int indexOf3 = tyVar.e1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = tyVar.e1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
