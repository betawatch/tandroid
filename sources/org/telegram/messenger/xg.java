package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class xg implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ xg(int i3, ArrayList arrayList) {
        this.a = i3;
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
                hi hiVar = (hi) obj;
                hi hiVar2 = (hi) obj2;
                String str = hiVar.a;
                ArrayList arrayList2 = this.b;
                int indexOf3 = arrayList2.indexOf(str);
                int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(hiVar2.a);
                if (indexOf4 >= 0) {
                    i3 = indexOf4;
                }
                if (indexOf3 >= i3) {
                    if (indexOf3 <= i3) {
                        int length = hiVar.b.length();
                        int length2 = hiVar2.b.length();
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
