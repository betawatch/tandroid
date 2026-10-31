package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class eh implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ eh(int i10, ArrayList arrayList) {
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
                qi qiVar = (qi) obj;
                qi qiVar2 = (qi) obj2;
                String str = qiVar.a;
                ArrayList arrayList2 = this.b;
                int indexOf3 = arrayList2.indexOf(str);
                int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(qiVar2.a);
                if (indexOf4 >= 0) {
                    i10 = indexOf4;
                }
                if (indexOf3 >= i10) {
                    if (indexOf3 <= i10) {
                        int length = qiVar.b.length();
                        int length2 = qiVar2.b.length();
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
