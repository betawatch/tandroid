package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class fh implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ fh(int i10, ArrayList arrayList) {
        this.a = i10;
        this.b = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Long valueOf = Long.valueOf(((TLRPC.TL_messages_stickerSet) obj).set.id);
                ArrayList arrayList = this.b;
                int indexOf = arrayList.indexOf(valueOf);
                int indexOf2 = arrayList.indexOf(Long.valueOf(((TLRPC.TL_messages_stickerSet) obj2).set.id));
                if (indexOf <= indexOf2) {
                    if (indexOf < indexOf2) {
                    }
                }
                break;
            default:
                ri riVar = (ri) obj;
                ri riVar2 = (ri) obj2;
                String str = riVar.a;
                ArrayList arrayList2 = this.b;
                int indexOf3 = arrayList2.indexOf(str);
                int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(riVar2.a);
                if (indexOf4 >= 0) {
                    i10 = indexOf4;
                }
                if (indexOf3 >= i10) {
                    if (indexOf3 <= i10) {
                        int length = riVar.b.length();
                        int length2 = riVar2.b.length();
                        if (length >= length2) {
                            if (length > length2) {
                            }
                        }
                    }
                }
                break;
        }
        return 0;
    }
}
