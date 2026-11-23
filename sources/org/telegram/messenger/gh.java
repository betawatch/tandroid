package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class gh implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ gh(int i7, ArrayList arrayList) {
        this.a = i7;
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
                oi oiVar = (oi) obj;
                oi oiVar2 = (oi) obj2;
                String str = oiVar.a;
                ArrayList arrayList2 = this.b;
                int indexOf3 = arrayList2.indexOf(str);
                int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(oiVar2.a);
                if (indexOf4 >= 0) {
                    i7 = indexOf4;
                }
                if (indexOf3 >= i7) {
                    if (indexOf3 <= i7) {
                        int length = oiVar.b.length();
                        int length2 = oiVar2.b.length();
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
