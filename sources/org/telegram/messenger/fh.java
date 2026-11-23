package org.telegram.messenger;

import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class fh implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ fh(int i7, ArrayList arrayList) {
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
                ni niVar = (ni) obj;
                ni niVar2 = (ni) obj2;
                String str = niVar.a;
                ArrayList arrayList2 = this.b;
                int indexOf3 = arrayList2.indexOf(str);
                int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                if (indexOf3 < 0) {
                    indexOf3 = Integer.MAX_VALUE;
                }
                int indexOf4 = arrayList2.indexOf(niVar2.a);
                if (indexOf4 >= 0) {
                    i7 = indexOf4;
                }
                if (indexOf3 >= i7) {
                    if (indexOf3 <= i7) {
                        int length = niVar.b.length();
                        int length2 = niVar2.b.length();
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
