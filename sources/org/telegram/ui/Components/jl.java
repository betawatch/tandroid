package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jl implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jl(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int indexOf;
        int indexOf2;
        int i10 = this.a;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.messenger.xe xeVar = (org.telegram.messenger.xe) obj;
                org.telegram.messenger.xe xeVar2 = (org.telegram.messenger.xe) obj2;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                int i11 = xeVar.a;
                if (i11 != 0 || xeVar2.a == 0) {
                    if ((i11 != 0 && xeVar2.a == 0) || (indexOf = arrayList.indexOf(xeVar)) > (indexOf2 = arrayList.indexOf(xeVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            default:
                vy vyVar = ((gw) obj3).G0;
                int indexOf3 = vyVar.d1.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = vyVar.d1.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
        }
    }
}
